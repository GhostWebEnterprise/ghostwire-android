# GhostWire privacy and dark appearance

GhostWire uses a GrapheneOS-inspired neutral dark appearance: black backgrounds,
charcoal surfaces, and distinct surface elevations. Existing account accents and
warning/error colors remain meaningful. Both Android and shared Compose themes
use the same neutral surface values.

New theme preferences default to Dark. Saved Light, Dark and System choices are
preserved; Appearance settings can still change them.

Privacy settings now offer Android app-details and notification-settings
shortcuts, plus scrolling for small screens and large fonts. Review permissions
in app details; Android and GrapheneOS determine which controls are available.
Revoking microphone/camera access limits calls; disabling notifications can hide
incoming call/message alerts. The notification shortcut falls back to app
details if its activity is unavailable.

Existing screenshot censoring, team enforcement, app lock, read receipts,
typing indicators, link previews and opt-in analytics remain implemented by Wire.
This change does not modify their persistence, encryption, Kalium, backend
configuration, identifiers, message storage or calling behavior.

This is not an installation of GrapheneOS and does not provide its hardened
allocator, kernel, verified boot, network/sensor permissions or storage/contact
scopes on other operating systems. Those require operating system support.
See https://grapheneos.org/features for the OS feature boundary.

## Verification

- Run the repository unit, UI, lint and style workflows.
- Check Light, Dark and System choices, including an existing saved preference.
- Check conversations, calls and settings in dark mode, including account accents.
- Check both shortcuts on Android and GrapheneOS and return with Back.
- Enable large fonts on a small display and reach all privacy controls.
- Check screenshot censoring remains enforced when required by a team.
- Smoke-test sign-in, encrypted send/receive, attachments and voice/video calls.

No Android build tools are installed in the authoring environment; CI and device
verification must pass before merging.
