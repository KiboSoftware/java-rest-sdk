#!/usr/bin/env node
/**
 * generate.mjs - regenerate the Java SDK modules from the docs repo's SDK specs
 *
 * Usage:
 *   node generator/generate.mjs --specs <dir>              regenerate everything
 *   node generator/generate.mjs --specs <dir> --module commerce
 *   node generator/generate.mjs --specs <dir> --version 3.0.0
 *   node generator/generate.mjs --specs <dir> --check      fail if output differs
 *
 * <dir> is a checkout of unified-documentation's openapi-pipeline/dist_sdk. Its
 * manifest.json carries a `java` block listing the modules to build, so the
 * module list lives with the specs rather than being restated here. See that
 * repo's openapi-pipeline/README.md.
 *
 * The Java SDK consumes exactly the same specs as the TypeScript SDK, so both
 * derive their method names from the same operationIds and stay in step.
 *
 * Two things this script owns beyond invoking the generator:
 *
 *   - One artifactVersion for every module, in a single run. The pom template
 *     uses artifactVersion for both a module's own version and its dependency on
 *     com.kibocommerce:common, so generating modules separately with different
 *     versions produces a module that cannot resolve its own runtime. That is
 *     exactly what happened to `subscription` in the 2.0.0 release: it was left
 *     depending on common:2.0.0-SNAPSHOT, failed to build, and was silently
 *     dropped from the Maven Central publish. Generating in one pass makes that
 *     class of mistake impossible.
 *
 *   - The `common` module, which is not a service client. It is produced by
 *     running the generator over the Tenant spec with a different set of
 *     templates, and holds the runtime every other module depends on.
 */

import { execFileSync } from 'node:child_process';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const REPO_ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const MODULES_ROOT = path.join(REPO_ROOT, 'kibocommerce');
const PARENT_POM = path.join(MODULES_ROOT, 'pom.xml');
const GENERATOR_DIR = path.join(REPO_ROOT, 'generator');
const JAR_DIR = path.join(GENERATOR_DIR, '.jar');

const DEFAULT_SPECS_DIR = path.resolve(REPO_ROOT, '..', 'unified-documentation', 'openapi-pipeline', 'dist_sdk');

// Pinned: the committed modules were produced by 6.2.0, and later majors change
// the shape of the Java client output, which would rename or retype public API.
const GENERATOR_VERSION = '6.2.0';
const GENERATOR_URL =
  `https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/` +
  `${GENERATOR_VERSION}/openapi-generator-cli-${GENERATOR_VERSION}.jar`;

const SCM_URL = 'https://github.com/KiboSoftware/java-rest-sdk.git';

function parseArgs(argv) {
  const args = { module: null, check: false, specs: null, version: null };
  for (let i = 0; i < argv.length; i++) {
    if (argv[i] === '--module') args.module = argv[++i];
    else if (argv[i] === '--specs') args.specs = argv[++i];
    else if (argv[i] === '--version') args.version = argv[++i];
    else if (argv[i] === '--check') args.check = true;
  }
  return args;
}

function requireJava() {
  try {
    execFileSync('java', ['-version'], { stdio: 'pipe' });
  } catch {
    console.error('Java is required to run openapi-generator. Install a JDK (11 or newer) and retry.');
    process.exit(2);
  }
}

function ensureGeneratorJar() {
  const jarPath = path.join(JAR_DIR, `openapi-generator-cli-${GENERATOR_VERSION}.jar`);
  if (fs.existsSync(jarPath)) return jarPath;
  fs.mkdirSync(JAR_DIR, { recursive: true });
  console.log(`Downloading openapi-generator ${GENERATOR_VERSION}...`);
  execFileSync('curl', ['-sSLf', '-o', jarPath, GENERATOR_URL], { stdio: 'inherit' });
  return jarPath;
}

/**
 * Read the version to stamp on every module.
 *
 * Defaults to whatever the parent pom already declares so a routine refresh does
 * not silently change the published version.
 */
function currentParentVersion() {
  const pom = fs.readFileSync(PARENT_POM, 'utf8');
  // The parent pom has no <parent>, so the first <version> is its own.
  const match = pom.match(/<artifactId>sdk<\/artifactId>\s*<version>([^<]+)<\/version>/);
  if (!match) throw new Error(`Could not read the version from ${PARENT_POM}`);
  return match[1];
}

function moduleProperties(moduleName, version, basePackage) {
  return {
    apiPackage: `${basePackage}.${moduleName}.api`,
    modelPackage: `${basePackage}.${moduleName}.models`,
    invokerPackage: `${basePackage}.${moduleName}`,
    artifactId: moduleName,
    artifactVersion: version,
    groupId: 'com.kibocommerce',
    parentGroupId: 'com.kibocommerce',
    parentArtifactId: 'sdk',
    parentVersion: version,
    artifactUrl: SCM_URL,
    scmConnection: `scm:git:git@github.com:KiboSoftware/java-rest-sdk.git`,
    scmDeveloperConnection: `scm:git:git@github.com:KiboSoftware/java-rest-sdk.git`,
    scmUrl: SCM_URL,
    bigDecimalAsString: true,
    java8: true,
    dateLibrary: 'java8',
    hideGenerationTimestamp: true,
    serializableModel: true,
    httpUserAgent: 'kibo-sdk-java',
    developerOrganizationUrl: 'https://kibocommerce.com',
    apiTests: false,
    modelTests: false,
    useJakartaEe: false,
  };
}

function runGenerator(jarPath, { specPath, outDir, configPath, properties, useIgnoreFile = true }) {
  const props = Object.entries(properties)
    .map(([k, v]) => `${k}=${v}`)
    .join(',');

  const args = [
    '-jar', jarPath,
    'generate',
    '-g', 'java',
    '-i', specPath,
    '-o', outDir,
    '-c', configPath,
  ];

  // The ignore file strips the per-module copy of the runtime (ApiClient, JSON,
  // Pair, ...) so every service module shares com.kibocommerce:common instead.
  // The common module is where that runtime actually lives, so applying the same
  // file there would delete the thing being built.
  if (useIgnoreFile) {
    args.push('--ignore-file-override', path.join(GENERATOR_DIR, '.openapi-generator-ignore'));
  }

  args.push(
    // The specs carry Kibo's editorial overlays and a few upstream quirks the
    // docs pipeline leaves alone; validation is enforced in the docs repo.
    '--skip-validate-spec',
    `--additional-properties=${props}`
  );

  // Every file in a module directory is generated, so the directory is cleared
  // first. Two reasons: a class for a tag that no longer exists would otherwise
  // linger and still compile, and openapi-generator only writes
  // .openapi-generator-ignore when it is absent - so regenerating in place
  // produced a different .openapi-generator/FILES than a fresh checkout would.
  fs.rmSync(outDir, { recursive: true, force: true });

  // templateDir in the config files is relative to the working directory.
  execFileSync('java', args, { cwd: REPO_ROOT, stdio: ['ignore', 'pipe', 'pipe'] });
}

// The common module's ApiClient imports org.apache.oltu.oauth2, but the stock
// pom template only declares that dependency when the spec advertises an OAuth2
// flow. Kibo's specs declare bearer auth, so the generated pom omits it and the
// module does not compile. Added back explicitly rather than by pretending the
// API uses OAuth2.
const OLTU_DEPENDENCY = `        <dependency>
            <groupId>org.apache.oltu.oauth2</groupId>
            <artifactId>org.apache.oltu.oauth2.client</artifactId>
            <version>1.0.1</version>
        </dependency>
`;

function ensureCommonOltuDependency(commonDir) {
  const pomPath = path.join(commonDir, 'pom.xml');
  let pom = fs.readFileSync(pomPath, 'utf8');
  if (pom.includes('org.apache.oltu.oauth2.client')) return false;

  // Anchored on a newline plus exactly four spaces so this matches the
  // project-level <dependencies>, not the deeper one nested inside a
  // <pluginManagement> block.
  const anchor = /\n {4}<dependencies>\n/;
  const match = anchor.exec(pom);
  if (!match) throw new Error(`Could not find the project <dependencies> in ${pomPath}`);

  const insertAt = match.index + match[0].length;
  pom = pom.slice(0, insertAt) + OLTU_DEPENDENCY + pom.slice(insertAt);
  fs.writeFileSync(pomPath, pom);
  return true;
}

/**
 * Rewrite the parent pom's version and <modules> list.
 *
 * Adding a service to the docs pipeline should not also require hand-editing
 * this file - a module that is generated but not listed here is simply never
 * built or published, which is easy to miss.
 */
function updateParentPom(moduleNames, version) {
  let pom = fs.readFileSync(PARENT_POM, 'utf8');

  pom = pom.replace(
    /(<artifactId>sdk<\/artifactId>\s*<version>)[^<]+(<\/version>)/,
    `$1${version}$2`
  );

  const body = ['common', ...moduleNames].map((m) => `        <module>${m}</module>`).join('\n');
  pom = pom.replace(/<modules>[\s\S]*?<\/modules>/, `<modules>\n${body}\n    </modules>`);

  fs.writeFileSync(PARENT_POM, pom);
}

function pruneRemovedModules(expected) {
  if (!fs.existsSync(MODULES_ROOT)) return [];
  const keep = new Set([...expected, 'common']);
  const removed = [];
  for (const entry of fs.readdirSync(MODULES_ROOT)) {
    const dir = path.join(MODULES_ROOT, entry);
    if (!fs.statSync(dir).isDirectory() || keep.has(entry)) continue;
    fs.rmSync(dir, { recursive: true, force: true });
    removed.push(entry);
  }
  return removed;
}

function main() {
  const args = parseArgs(process.argv.slice(2));
  const specsDir = path.resolve(args.specs || DEFAULT_SPECS_DIR);
  const manifestPath = path.join(specsDir, 'manifest.json');

  if (!fs.existsSync(manifestPath)) {
    console.error(
      `No manifest.json in ${specsDir}.\n` +
        "Run 'npm run spec:sdk-build' in the unified-documentation repo first, " +
        'or pass --specs <dir>.'
    );
    process.exit(2);
  }

  const manifest = JSON.parse(fs.readFileSync(manifestPath, 'utf-8'));
  if (!manifest.java) {
    console.error('This manifest has no `java` block. The docs repo needs a `java` section in sdk-config.json.');
    process.exit(2);
  }

  const { basePackage, commonModule, modules } = manifest.java;
  const version = args.version || currentParentVersion();

  requireJava();
  const jarPath = ensureGeneratorJar();

  const selected = args.module ? modules.filter((m) => m.name === args.module) : modules;
  const doCommon = !args.module || args.module === commonModule.name;

  if (args.module && !selected.length && !doCommon) {
    console.error(`No module named '${args.module}' in the manifest.`);
    process.exit(2);
  }

  console.log(`Generating Java SDK ${version} from ${specsDir}\n`);
  const failures = [];

  if (doCommon) {
    process.stdout.write(`  ${commonModule.name.padEnd(24)}`);
    try {
      const commonDir = path.join(MODULES_ROOT, commonModule.name);
      runGenerator(jarPath, {
        specPath: path.join(specsDir, commonModule.specFile),
        outDir: commonDir,
        configPath: path.join(GENERATOR_DIR, 'common-config.yaml'),
        properties: moduleProperties(commonModule.name, version, basePackage),
        useIgnoreFile: false,
      });
      const added = ensureCommonOltuDependency(commonDir);
      console.log(`shared runtime${added ? ' (+oltu dependency)' : ''}`);
    } catch (error) {
      console.log('FAILED');
      failures.push({ name: commonModule.name, error: error.stderr?.toString() || error.message });
    }
  }

  for (const mod of selected) {
    process.stdout.write(`  ${mod.name.padEnd(24)}`);
    try {
      runGenerator(jarPath, {
        specPath: path.join(specsDir, mod.specFile),
        outDir: path.join(MODULES_ROOT, mod.name),
        configPath: path.join(GENERATOR_DIR, 'api-config.yaml'),
        properties: moduleProperties(mod.name, version, basePackage),
      });
      console.log(`${String(mod.operations).padStart(4)} ops, ${String(mod.schemas).padStart(4)} models`);
    } catch (error) {
      console.log('FAILED');
      failures.push({ name: mod.name, error: error.stderr?.toString() || error.message });
    }
  }

  if (!args.module) {
    updateParentPom(modules.map((m) => m.name), version);
    for (const name of pruneRemovedModules(modules.map((m) => m.name))) {
      console.log(`  removed module no longer in the manifest: ${name}`);
    }
  }

  if (failures.length) {
    console.error(`\n${failures.length} module(s) failed to generate:\n`);
    for (const f of failures) console.error(`  ${f.name}: ${f.error.split('\n').slice(-6).join('\n')}`);
    process.exit(1);
  }

  console.log('\nGeneration complete. Next: mvn -f kibocommerce/pom.xml verify');

  if (args.check) {
    const diff = execFileSync('git', ['status', '--porcelain', 'kibocommerce'], {
      cwd: REPO_ROOT,
      encoding: 'utf8',
    });
    if (diff.trim()) {
      console.error('\n--check: generated output differs from the committed tree:\n');
      console.error(diff);
      process.exit(1);
    }
    console.log('--check: generated output matches the committed tree');
  }
}

main();
