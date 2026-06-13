# WaitManager

## Meta

- Target: `lmi.runtime.WaitManager`
- Owner: `lmi.runtime`
- Concept: `WaitManager`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Coordinates subsystem state and routes work through the appropriate boundary.

## Code Signals

- Public entry points:
  - `updateSentSeq`
  - `waitACK`
  - `waitResponse`
  - `updateAckedSeq`
  - `sleepPolling`
  - `sleep`
