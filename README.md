# GhostWire for Android

<div align="center">

<img src="file_00000000a720824697e0f3cedcd69e8f.png" alt="GhostWire logo" width="360">

### Secure communication. GhostWeb identity.

**GhostWire is the GhostWeb Enterprise Android communication client derived from the Wire Android open-source codebase.**

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=plastic&logo=android&logoColor=white)](https://github.com/GhostWebEnterprise/ghostwire-android)
[![Development](https://img.shields.io/badge/Status-Active%20Development-orange?style=plastic)](https://github.com/GhostWebEnterprise/ghostwire-android)
[![Build](https://img.shields.io/github/actions/workflow/status/GhostWebEnterprise/ghostwire-android/build-develop-push.yml?branch=develop&style=plastic&label=Android%20Build)](https://github.com/GhostWebEnterprise/ghostwire-android/actions/workflows/build-develop-push.yml)
[![Unit Tests](https://img.shields.io/github/actions/workflow/status/GhostWebEnterprise/ghostwire-android/gradle-run-unit-tests.yml?branch=develop&style=plastic&label=Unit%20Tests)](https://github.com/GhostWebEnterprise/ghostwire-android/actions/workflows/gradle-run-unit-tests.yml)
[![License](https://img.shields.io/github/license/GhostWebEnterprise/ghostwire-android?style=plastic)](./LICENSE)
[![Project Hub](https://img.shields.io/badge/Project%20Hub-ghostweb.bot.cd-0B57D0?style=plastic&logo=googlechrome&logoColor=white)](https://ghostweb.bot.cd/ghostwire.html)
[![Support](https://img.shields.io/badge/Support-support--ghostweb%40proton.me-6D4AFF?style=plastic&logo=protonmail&logoColor=white)](mailto:support-ghostweb@proton.me)

</div>

## Overview

GhostWire applies the **GhostWeb Enterprise** identity to a native Android communication client while preserving compatibility-critical parts of the upstream Wire architecture. The goal is a distinct GhostWire experience without breaking protocol interoperability, backend communication or the underlying Kalium integration.

| Area | GhostWire direction |
| --- | --- |
| **Platform** | Native Android client |
| **Foundation** | Wire Android open-source codebase |
| **Core architecture** | Wire + Kalium compatibility |
| **Branding** | GhostWire / GhostWeb Enterprise |
| **UI** | GhostWeb-oriented interface and product identity |
| **Development model** | Downstream open-source development |
| **Current state** | Active development · build verification in progress |

## Project direction

GhostWire separates **user-visible product identity** from compatibility-critical implementation details. Launcher icons, startup surfaces, visible copy and application branding can move to GhostWire while internal identifiers remain untouched when changing them could affect interoperability.

### What changes

- GhostWire visual identity, launcher assets and user-facing branding.
- GhostWeb-oriented UI and application presentation.
- Project-specific documentation, build verification and release presentation.
- User-visible references where they can safely be migrated.

### What remains compatible

Namespaces such as `com.wire.*`, Wire URI schemes, backend endpoints, protocol identifiers, Kalium references, deep links and other compatibility-sensitive resources are **not mechanically renamed**. Any migration affecting these areas must be explicitly validated first.

## Build requirements

| Requirement | Expected environment |
| --- | --- |
| **JDK** | 21 |
| **Android SDK** | Required |
| **Android NDK** | Required |
| **Git submodules** | Required |

After cloning, initialize embedded dependencies:

```bash
git submodule update --init --recursive
```

Common development tasks:

```bash
./gradlew compileApp
./gradlew assembleApp
./gradlew runUnitTests
./gradlew staticCodeAnalysis
```

For additional upstream build and customization details, see [CUSTOMIZATION.md](./CUSTOMIZATION.md).

## CI and verification

GhostWire retains the Android project's CI structure for development, pull requests, release candidates and production-oriented builds. The repository also contains dedicated unit-test, UI-test, static-analysis and compatibility workflows.

A successful workflow run alone should not be interpreted as a production-ready release. Release readiness requires verification of the actual packaged application, branding, signing and expected functionality.

## Branding policy

The public product name is **GhostWire**. User-facing assets should follow the GhostWire/GhostWeb Enterprise identity.

Do not perform global replacements of the word `wire` or upstream package identifiers. Technical references required for Wire/Kalium compatibility should remain intact unless the corresponding migration has been tested end-to-end.

## Repository documentation

- [CUSTOMIZATION.md](./CUSTOMIZATION.md) — build and customization guidance.
- [CONTRIBUTING.md](./CONTRIBUTING.md) — contribution guidance.
- [LICENSE](./LICENSE) — repository licensing terms.
- [GhostWire Project Hub](https://ghostweb.bot.cd/ghostwire.html) — public GhostWeb project page.

## Upstream & attribution

GhostWire is derived from the **Wire Android** open-source project and retains compatibility with upstream components where required.

Wire, Kalium and associated trademarks belong to their respective owners. GhostWeb Enterprise does not claim ownership of the Wire trademark. Upstream source and documentation are available from the Wire Android project on GitHub.

Changes made by GhostWeb Enterprise remain subject to this repository's [LICENSE](./LICENSE) and applicable upstream licensing requirements.

## Development status

> [!IMPORTANT]
> **GhostWire is under active development and is not presented as production-ready.** Branding, UI, build configuration and functionality may change while the Android migration and verification gates continue.

> [!WARNING]
> GhostWire is currently a development project. Builds may be incomplete, experimental or unstable. Do not assume that an artifact is security-reviewed or production-ready unless a specific GhostWire release explicitly states that it has completed the required verification gates.

Current development priorities include branding integration, UI migration, Android build reliability, compatibility preservation and verification of packaged application assets.

## Support

For general GhostWire or GhostWeb Enterprise support:

**support-ghostweb@proton.me**

For security-sensitive reports, avoid publishing credentials, private user information, signing material or unresolved vulnerability details in public issues.

---

<div align="center">

**GhostWire · GhostWeb Enterprise**

[Project Hub](https://ghostweb.bot.cd/ghostwire.html) · [Repository](https://github.com/GhostWebEnterprise/ghostwire-android) · [Actions](https://github.com/GhostWebEnterprise/ghostwire-android/actions)

*Privacy-focused software under active development.*

</div>
