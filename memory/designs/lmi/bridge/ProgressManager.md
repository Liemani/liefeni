# ProgressManager

## Meta

- Target: `lmi.bridge.ProgressManager`
- Owner: `lmi.bridge`
- Concept: `ProgressManager`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Tracks a `GameUI.Progress` widget and waits for it to appear and disappear around blocking actions.

## Code Signals

- Public entry points:
  - `setWidget`
  - `waitProgress`
