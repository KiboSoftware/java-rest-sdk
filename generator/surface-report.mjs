#!/usr/bin/env node
/**
 * surface-report.mjs - what a refresh changes for Java SDK consumers
 *
 * Usage:
 *   node generator/surface-report.mjs             human readable
 *   node generator/surface-report.mjs --markdown  for a PR body
 *
 * Compares the working tree's generated modules against the committed ones
 * (git HEAD). Run it after generate.mjs and before committing.
 *
 * Methods are matched on the endpoint they call (`VERB /path`), not on their
 * name, because a renamed method is not a removed one and the two need very
 * different responses. The generated Java pairs each method with the literal
 * path it requests:
 *
 *   public okhttp3.Call getCartCall(...) {
 *       String localVarPath = "/commerce/carts/{cartId}";
 *       ...
 *       return localVarApiClient.buildCall(basePath, localVarPath, "GET", ...);
 *
 * so both are recoverable without compiling anything.
 */

import { execFileSync } from 'node:child_process';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const REPO_ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const MODULES_ROOT = path.join(REPO_ROOT, 'kibocommerce');

const CALL_RE = /public okhttp3\.Call (\w+)Call\(/g;

/**
 * Extract `VERB /path` -> method name from one generated API class.
 */
function parseApiSource(source) {
  const out = {};
  let match;
  CALL_RE.lastIndex = 0;

  while ((match = CALL_RE.exec(source)) !== null) {
    const name = match[1];
    // Bound the search at the next method so a path is never attributed to the
    // wrong one.
    const rest = source.slice(match.index + match[0].length);
    const nextIdx = rest.search(/public okhttp3\.Call \w+Call\(/);
    const body = nextIdx === -1 ? rest : rest.slice(0, nextIdx);

    const pathMatch = body.match(/localVarPath\s*=\s*"([^"]+)"/);
    const verbMatch = body.match(/buildCall\([^;]*?,\s*"([A-Z]+)"/s);
    if (!pathMatch || !verbMatch) continue;

    out[`${verbMatch[1]} ${pathMatch[1]}`] = name;
  }

  return out;
}

function apiDirFor(moduleName) {
  return path.join(MODULES_ROOT, moduleName, 'src', 'main', 'java', 'com', 'kibocommerce', 'sdk', moduleName, 'api');
}

/**
 * Read a module's surface from the working tree.
 */
function surfaceFromDisk(moduleName) {
  const dir = apiDirFor(moduleName);
  if (!fs.existsSync(dir)) return null;

  const out = {};
  for (const file of fs.readdirSync(dir)) {
    if (!file.endsWith('.java')) continue;
    Object.assign(out, parseApiSource(fs.readFileSync(path.join(dir, file), 'utf8')));
  }
  return out;
}

/**
 * Read a module's surface as it is committed at HEAD.
 */
function surfaceFromHead(moduleName) {
  const prefix = path.posix.join(
    'kibocommerce', moduleName, 'src/main/java/com/kibocommerce/sdk', moduleName, 'api'
  );

  let listing;
  try {
    listing = execFileSync('git', ['ls-tree', '--name-only', 'HEAD', `${prefix}/`], {
      cwd: REPO_ROOT,
      encoding: 'utf8',
    });
  } catch {
    return null;
  }
  if (!listing.trim()) return null;

  const out = {};
  for (const file of listing.trim().split('\n')) {
    if (!file.endsWith('.java')) continue;
    const source = execFileSync('git', ['show', `HEAD:${file}`], {
      cwd: REPO_ROOT,
      encoding: 'utf8',
      maxBuffer: 64 * 1024 * 1024,
    });
    Object.assign(out, parseApiSource(source));
  }
  return out;
}

function moduleNames() {
  const fromDisk = fs.existsSync(MODULES_ROOT)
    ? fs.readdirSync(MODULES_ROOT).filter((d) => fs.statSync(path.join(MODULES_ROOT, d)).isDirectory())
    : [];
  const fromHead = execFileSync('git', ['ls-tree', '--name-only', 'HEAD', 'kibocommerce/'], {
    cwd: REPO_ROOT,
    encoding: 'utf8',
  })
    .trim()
    .split('\n')
    .filter(Boolean)
    .map((p) => path.basename(p.replace(/\/$/, '')));

  return [...new Set([...fromDisk, ...fromHead])].filter((n) => n !== 'pom.xml').sort();
}

function buildReport() {
  const modules = [];
  const totals = { added: 0, removed: 0, renamed: 0, newModules: 0, removedModules: 0 };

  for (const name of moduleNames()) {
    const now = surfaceFromDisk(name);
    const before = surfaceFromHead(name);

    if (!now && !before) continue;
    if (!before) {
      totals.newModules++;
      totals.added += Object.keys(now).length;
      modules.push({ name, isNew: true, added: Object.keys(now).length, removed: [], renamed: [] });
      continue;
    }
    if (!now) {
      totals.removedModules++;
      modules.push({ name, isGone: true, added: 0, removed: Object.keys(before), renamed: [] });
      continue;
    }

    const added = Object.keys(now).filter((k) => !(k in before));
    const removed = Object.keys(before).filter((k) => !(k in now));
    const renamed = Object.keys(now)
      .filter((k) => k in before && before[k] !== now[k])
      .map((k) => ({ key: k, from: before[k], to: now[k] }));

    totals.added += added.length;
    totals.removed += removed.length;
    totals.renamed += renamed.length;

    modules.push({
      name,
      added: added.length,
      removed: removed.map((k) => ({ key: k, method: before[k] })),
      renamed,
      total: Object.keys(now).length,
    });
  }

  return { totals, modules };
}

function render({ totals, modules }, markdown) {
  const L = [];
  const h = (s) => (markdown ? `## ${s}` : s);

  L.push(h('Java SDK surface changes'), '');
  if (markdown) {
    L.push('| | Count |', '| --- | ---: |');
    L.push(`| New methods | ${totals.added} |`);
    L.push(`| Removed methods | ${totals.removed} |`);
    L.push(`| Renamed methods | ${totals.renamed} |`);
    L.push(`| New modules | ${totals.newModules} |`);
    L.push(`| Removed modules | ${totals.removedModules} |`, '');
  } else {
    L.push(`  new methods       ${totals.added}`);
    L.push(`  removed methods   ${totals.removed}`);
    L.push(`  renamed methods   ${totals.renamed}`);
    L.push(`  new modules       ${totals.newModules}`);
    L.push(`  removed modules   ${totals.removedModules}`, '');
  }

  const breaking = totals.removed + totals.renamed;
  L.push(
    breaking === 0
      ? 'No breaking changes: this refresh only adds surface.'
      : `**${breaking} breaking change(s)**: ${totals.removed} removed, ${totals.renamed} renamed.`,
    ''
  );

  const withRenames = modules.filter((m) => m.renamed?.length);
  if (withRenames.length) {
    L.push(h('Renamed'), '');
    L.push(
      'These endpoints still exist; the method calling them changed name. A rename',
      'is a compile error for consumers, so each one needs to be intended.',
      ''
    );
    for (const m of withRenames) {
      L.push(`**${m.name}** (${m.renamed.length})`, '');
      for (const r of m.renamed.slice(0, 15)) L.push(`- \`${r.from}\` -> \`${r.to}\``);
      if (m.renamed.length > 15) L.push(`- ...and ${m.renamed.length - 15} more`);
      L.push('');
    }
  }

  const withRemovals = modules.filter((m) => m.removed?.length);
  if (withRemovals.length) {
    L.push(h('Removed'), '');
    for (const m of withRemovals) {
      L.push(`**${m.name}** (${m.removed.length})`, '');
      for (const r of m.removed.slice(0, 15)) L.push(`- \`${r.method}\` - ${r.key}`);
      if (m.removed.length > 15) L.push(`- ...and ${m.removed.length - 15} more`);
      L.push('');
    }
  }

  const news = modules.filter((m) => m.isNew);
  if (news.length) {
    L.push(h('New modules'), '');
    for (const m of news) L.push(`- **${m.name}** - ${m.added} methods`);
    L.push('');
  }

  L.push(h('Added by module'), '');
  if (markdown) L.push('| Module | New methods | Total |', '| --- | ---: | ---: |');
  for (const m of modules.filter((x) => x.added && !x.isNew)) {
    L.push(markdown ? `| ${m.name} | ${m.added} | ${m.total} |` : `  ${m.name.padEnd(24)} +${m.added}`);
  }
  L.push('');

  return L.join('\n');
}

const markdown = process.argv.includes('--markdown');
console.log(render(buildReport(), markdown));
