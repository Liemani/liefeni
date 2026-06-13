# WaypointSyncManager

## Meta

- Target: `lmi.waypoint.persistence.WaypointSyncManager`
- Owner: `lmi.waypoint.persistence`
- Concept: `WaypointSyncManager`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Queues DB completions for delivery on the draw/render boundary.

## Code Signals

- Public entry points:
  - `enqueue`
  - `drain`
  - `clear`
