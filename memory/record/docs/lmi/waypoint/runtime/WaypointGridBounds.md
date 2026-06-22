---
source: [WaypointGridBounds.java](../../../../../../src/lmi/waypoint/runtime/WaypointGridBounds.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointGridBounds

Coordinates waypoint runtime state for waypoint grid bounds.

## Members

### Constants

### Fields

#### `public final Coord centerGrid`
- Role: Caches the center grid value.
- Description: Caches the `centerGrid` value for reuse.

#### `public final Area loadArea`
- Role: Caches the load area value.
- Description: Caches the `loadArea` value for reuse.

#### `public final Area renderArea`
- Role: Caches the render area value.
- Description: Caches the `renderArea` value for reuse.

#### `private final Set<Long> loadGridIds`
- Role: Caches the load grid ids value.
- Description: Caches the `loadGridIds` value for reuse.

#### `private final Set<Long> renderGridIds`
- Role: Caches the render grid ids value.
- Description: Caches the `renderGridIds` value for reuse.

#### `private final Map<Long, Coord> gridOrigins`
- Role: Caches the grid origins value.
- Description: Caches the `gridOrigins` value for reuse.

### Methods

#### `private WaypointGridBounds(`
- Role: Creates a new WaypointGridBounds instance.
- Description: Constructs the WaypointGridBounds instance from the supplied inputs.

#### `public static WaypointGridBounds empty()`
- Role: Handles the empty path.
- Description: Returns an empty bounds object with no grid ids.

#### `public static WaypointGridBounds aroundWorld(Coord world)`
- Role: Handles the around world path.
- Description: Builds bounds around the current world coordinate.

#### `public Set<Long> loadGridIds()`
- Role: Coordinates load grid ids persistence or lookup.
- Description: Returns the grid ids that should be loaded.

#### `public boolean loadContainsGridId(long gridId)`
- Role: Coordinates load contains grid id persistence or lookup.
- Description: Returns true when the grid is inside the load bounds.

#### `public boolean renderContainsGridId(long gridId)`
- Role: Renders the render contains grid id.
- Description: Returns true when the grid is inside the render bounds.

#### `public Coord worldOfGridLocal(long gridId, int localX, int localY)`
- Role: Handles the world of grid local path.
- Description: Converts grid-local coordinates into world coordinates.