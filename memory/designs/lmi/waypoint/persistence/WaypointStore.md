# WaypointStore

## Meta

- Source: `src/lmi/waypoint/persistence/WaypointStore.java`
- Package: `lmi.waypoint.persistence`
- Declared Type: `class`
- Declared Name: `WaypointStore`

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
