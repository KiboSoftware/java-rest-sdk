# Refreshing and releasing the Java SDK

Everything under `kibocommerce/` is generated, including the module poms and the
parent pom's `<modules>` list. Nothing in there should be hand-edited: the next
refresh overwrites it, and a hand-edit is exactly how the 2.0.0 release lost a
module (see below).

## Where the specs come from

Kibo's OpenAPI specs live in [`unified-documentation`](https://github.com/Kibo-UCP/unified-documentation),
which also publishes docs.kibocommerce.com. Its `openapi-pipeline/dist_sdk/`
directory holds one spec per service plus a `manifest.json` whose `java` block
lists the modules to build.

This is the same spec set the TypeScript SDK consumes, so both SDKs derive their
method names from the same operationIds and stay in step. This repo never talks
to Kibo services directly. See that repo's `openapi-pipeline/README.md`.

## Refreshing

The `Refresh SDK from API docs` workflow does this fortnightly and opens a PR
whose body is the surface report. By hand, with `unified-documentation` checked
out next to this repo:

```bash
cd ../unified-documentation && npm ci && npm run spec:sdk-build
cd ../java-rest-sdk
node generator/generate.mjs                 # or --specs <dir>
mvn -f kibocommerce/pom.xml -DskipTests verify
node generator/surface-report.mjs
```

`node generator/generate.mjs --module commerce` regenerates one module, and
`--version 3.1.0` stamps a version on all of them. Without `--version` the
version already in the parent pom is reused, so a routine refresh does not
silently change what gets published.

Read the surface report before committing. It matches methods on the endpoint
they call rather than on their name, so a rename shows up as a rename instead of
a removal plus an addition. Renames and removals are both compile errors for
consumers; additions are safe.

## Releasing

Publishing runs through the internal Jenkins pipeline declared in `Jenkinsfile`
(`ngMavenPublicPublishProjectPipeline`), which builds the `Dockerfile` and runs
`mvn deploy`. It is not a GitHub Actions workflow, and the refresh workflow never
publishes.

Artifacts are `com.kibocommerce:<module>` with the parent `com.kibocommerce:sdk`.

## How generation works

`generator/generate.mjs` runs openapi-generator 6.2.0. The version is pinned:
later majors change the shape of the Java client output, which would rename or
retype public API surface, so upgrading is a deliberate reviewed change.

- **`generator/templates/api/`** - Kibo's custom templates for service modules.
  Together with `generator/.openapi-generator-ignore` they suppress the
  per-module copy of the runtime so every module depends on
  `com.kibocommerce:common` instead of shipping its own `ApiClient`.
- **`generator/templates/common/`** - templates for the `common` module, which is
  not a service client. It carries the shared runtime (`ApiClient`,
  `KiboConfiguration`, `ApiCredentials`, `KiboHeaders`) and is produced by
  running the generator over the Tenant spec. That is why there is no `tenant`
  module even though the TypeScript SDK ships a Tenant client.

Until now these templates lived only in `KiboSoftware/sdk-generator-poc`, a
separate private repo whose Java entry points did not run at all
(`scripts/generate-clients.js` has a syntax error — `const name = name.toLowerCase()`
shadowing its own parameter — and both `generate:java-clients` and
`generate:java-core` require it). They are vendored here now.

### Two fix-ups the script applies

Both exist because Kibo's `common` templates were written against a spec that
declared an OAuth2 method, and the docs pipeline strips that scheme:

- The docs repo writes a dedicated `*-java-common.json` spec that re-adds Kibo's
  `clientOauth2` client-credentials scheme, because `ApiClient.mustache` renders
  the constructors `ApiClientBuilder` calls only when one is present. The token
  URL is deliberately relative and resolved against the tenant base URL; the raw
  service specs hardcode a QA hostname that must not ship.
- `generate.mjs` adds the `org.apache.oltu.oauth2.client` dependency to the
  common module's pom, which the stock pom template only emits for specs that
  advertise OAuth2.

`generator/templates/common/KiboConfiguration.mustache` also had a missing
`import java.util.Properties` that had been hand-patched into the generated file
each time; it is fixed in the template.

## Compatibility

Method names come from operationIds, and those are pinned in the docs repo's
`sdk-name-lock.json` by `VERB /path`. That lock is keyed to what the **TypeScript**
SDK publishes, and this SDK now converges on the same names.

The one-time cost of that convergence is 126 renamed methods, 99 of them in
`fulfillment`: this SDK shipped the raw Springdoc names (`createSurveyUsingPOST`,
`getShipmentUsingGET1`) that the TypeScript SDK had cleaned up by hand years ago.
After this release both SDKs name the same endpoint the same way, and the shared
lock keeps them that way.

## Known issues

- **`subscription` is missing from Maven Central.** In the 2.0.0 release its pom
  was left depending on `common:2.0.0-SNAPSHOT` while every other module used
  `2.0.0`; it failed to build and was dropped from the publish, so 23 of 24
  modules shipped. Generating all modules in one pass with a single
  `artifactVersion` makes that impossible, and the refresh workflow compiles the
  whole reactor.
- **Three Java SDK repos exist.** `KiboSoftware/kibo.sdk.java`
  (`com.kibocommerce:kibo-sdk-java`, auth/fulfillment/inventory only, last
  published 1.1.0 in July 2023 — its 1.1.1 release never reached Central) and
  `KiboSoftware/java-sdk-poc` should be archived and pointed here.
- **`KiboConfiguration` hardcodes `authHost = "home.mozu.com"`.**
- openapi-generator also writes Gradle, SBT and Travis scaffolding into every
  module, which is why the tree carries 24 copies of `gradle-wrapper.jar` for a
  repo that only builds with Maven. `--ignore-file-override` does not cover those
  files in 6.2.0; removing them needs
  `--global-property supportingFiles=<explicit list>` and should be done on its
  own rather than inside a refresh.
