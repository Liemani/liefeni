---
source: [WaypointGridResolver.java](../../../../../../src/lmi/waypoint/runtime/WaypointGridResolver.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointGridResolver

Resolves current Haven grid metadata for waypoint operations.

## Members

### Constants

#### `private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>()`
- Role: Resolves the d by haven grid id.
- Description: Resolves the d by haven grid id.

### Fields

### Methods

#### `private WaypointGridResolver()`
- Role: Creates a new WaypointGridResolver instance.
- Description: Constructs the WaypointGridResolver instance from the supplied inputs.

#### `public static synchronized void clear()`
- Role: Clears waypoint manager state.
- Description: Drops cached grid resolutions before the next session starts.

#### `public static synchronized ResolvedGrid resolveGrid(Coord gc)`
- Role: Coordinates resolve grid persistence or lookup.
- Description: Resolves the Haven grid for the given map coordinate.

#### `static synchronized ResolvedGrid resolvedGrid(long havenGridId)`
- Role: Coordinates resolved grid persistence or lookup.
- Description: Returns the cached resolution for the given Haven grid id.

#### `static synchronized void putResolvedGrid(long havenGridId, ResolvedGrid grid)`
- Role: Caches one resolved grid result.
- Description: Stores the resolved grid so later callers can reuse it.

#### `private static MapFile mapFile()`
- Role: Returns the active map file.
- Description: Resolves the map file used when looking up grid metadata.