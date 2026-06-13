# WaypointDbExecutor

## Meta

- Target: `lmi.waypoint.persistence.WaypointDbExecutor`
- Owner: `lmi.waypoint.persistence`
- Concept: `WaypointDbExecutor`
- Created: `2026-06-13`
- Updated: `2026-06-13`
- Extends: `WaypointResult>`

## Role

- Serializes waypoint DB work onto the dedicated worker thread.

## Code Signals

- Public entry points:
  - `init`
  - `submitRead`
  - `submitWrite`
  - `clear`
