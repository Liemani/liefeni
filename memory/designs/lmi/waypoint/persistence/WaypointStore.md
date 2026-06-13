# WaypointStore

## Meta

- Target: `lmi.waypoint.persistence.WaypointStore`
- Owner: `lmi.waypoint.persistence`
- Concept: `WaypointStore`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Provides the public facade for waypoint DB requests.

## Code Signals

- Public entry points:
  - `initializeAsync`
  - `createNodeAsync`
  - `loadNodesByGraphAsync`
  - `loadNodesByGridAsync`
  - `loadEdgesByGraphAsync`
  - `loadSegmentsByGridAsync`
  - `loadPointsByGridAsync`
  - `applySaveBatch`
  - `saveMapGridIfMissingAsync`
