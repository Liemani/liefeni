# WaypointDbExecutor

## Meta

- Source: `src/lmi/waypoint/persistence/WaypointDbExecutor.java`
- Package: `lmi.waypoint.persistence`
- Declared Type: `class`
- Declared Name: `Task`
- Extends: `WaypointResult>`

## Role

- Serializes waypoint DB work onto the dedicated worker thread.

## Code Signals

- Public entry points:
  - `init`
  - `submitRead`
  - `submitWrite`
  - `clear`
