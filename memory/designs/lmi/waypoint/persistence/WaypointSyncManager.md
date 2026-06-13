# WaypointSyncManager

## Meta

- Source: `src/lmi/waypoint/persistence/WaypointSyncManager.java`
- Package: `lmi.waypoint.persistence`
- Declared Type: `class`
- Declared Name: `WaypointSyncManager`

## Role

- Queues DB completions for delivery on the draw/render boundary.

## Code Signals

- Public entry points:
  - `enqueue`
  - `drain`
  - `clear`
