---
source: [WaypointDebug.java](../../../../../src/lmi/waypoint/WaypointDebug.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointDebug

Provides waypoint-specific debug helpers.

## Members

### Constants

### Fields

### Methods

#### `private WaypointDebug()`
- Role: Creates a new WaypointDebug instance.
- Description: Constructs the WaypointDebug instance from the supplied inputs.

#### `public static Array<String> lines()`
- Role: Returns the current waypoint debug lines.
- Description: Builds a human-readable summary of waypoint runtime state.

#### `private static String _sceneSummary()`
- Role: Builds the waypoint scene summary.
- Description: Condenses the current scene into a single debug line.