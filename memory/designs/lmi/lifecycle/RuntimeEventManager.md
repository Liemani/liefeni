# RuntimeEventManager

## Meta

- Target: `lmi.lifecycle.RuntimeEventManager`
- Owner: `lmi.lifecycle`
- Concept: `RuntimeEventManager`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Dispatches deferred runtime work on a background loop.

## Code Signals

- Public entry points:
  - `handle`
  - `init`
  - `clear`
  - `registerWaypointRefreshHandler`
  - `unregisterWaypointRefreshHandler`
  - `shutdown`
