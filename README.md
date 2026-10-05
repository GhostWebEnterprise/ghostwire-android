# GhostWire for Android

<p align="center">
  <img src="file_00000000d3e88246aa6ad468d2aab56e.png" alt="GhostWire logo" width="360">
</p>

**GhostWire** is the GhostWeb Enterprise branded Android client built on the Wire Android open-source codebase.

> [!IMPORTANT]
> GhostWire is a downstream project. Wire protocol, backend compatibility, package namespaces, deep links, Kalium integration, build identifiers and other technical references are intentionally retained wherever changing them could break interoperability or application functionality.

## Compatibility

GhostWire keeps the underlying Wire implementation intact while applying GhostWire branding to user-visible surfaces. The project continues to use the upstream Wire/Kalium architecture and compatible Wire services unless explicitly configured otherwise.

## Required software

- JDK 21
- Android SDK
- Android NDK

Initialize the embedded dependencies after cloning:

```bash
git submodule update --init --recursive
```

## Build

```bash
./gradlew compileApp
./gradlew assembleApp
./gradlew runUnitTests
./gradlew staticCodeAnalysis
```

Additional upstream build and customization behavior is documented in [CUSTOMIZATION.md](./CUSTOMIZATION.md).

## Branding policy

User-facing branding should use **GhostWire** and the assets under `docs/branding/`. Do not mechanically rename internal `wire` identifiers: namespaces such as `com.wire.*`, Wire URI schemes, backend endpoints, protocol identifiers, Kalium references and compatibility-critical resources must remain unchanged unless a migration has been explicitly validated.

## Upstream and licensing

GhostWire is derived from the Wire Android open-source project. Wire and its associated trademarks belong to their respective owners. No ownership of the Wire trademark is claimed by GhostWeb Enterprise.

The source remains subject to the repository's [LICENSE](./LICENSE) and applicable upstream terms. Upstream project: https://github.com/wireapp/wire-android

---

**GhostWire · GhostWeb Enterprise**  
In development — functionality and branding may change before a production-ready release.
