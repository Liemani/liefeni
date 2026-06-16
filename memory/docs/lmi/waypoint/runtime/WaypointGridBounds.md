# WaypointGridBounds

This file documents the responsibilities and members of `WaypointGridBounds`.

## Meta

- Source: [WaypointGridBounds.java](../../../../../src/lmi/waypoint/runtime/WaypointGridBounds.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state for waypoint grid bounds.

## Members

### Constants

### Fields

#### `public final Coord centerGrid`
- Role: Stores the center grid value.
- Description: Backs the cached state for this file.

#### `public final Area loadArea`
- Role: Holds the load area state.
- Description: Backs the cached state for this file.

#### `public final Area renderArea`
- Role: Holds the render area state.
- Description: Backs the cached state for this file.

#### `private final Set<Long> loadGridIds`
- Role: Caches load grid ids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> renderGridIds`
- Role: Caches render grid ids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Coord> gridOrigins`
- Role: Caches grid origins entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `private WaypointGridBounds(`
- Role: Creates a new WaypointGridBounds instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WaypointGridBounds empty()`
- Role: Performs empty.
- Description: Supports the empty operation used by the surrounding class.

#### `public static WaypointGridBounds aroundWorld(Coord world)`
- Role: Performs around world.
- Description: Supports the around world operation used by the surrounding class.

#### `public Set<Long> loadGridIds()`
- Role: Coordinates load grid ids persistence or lookup.
- Description: Supports the load grid ids operation used by the surrounding class.

#### `public boolean loadContainsGridId(long gridId)`
- Role: Coordinates load contains grid id persistence or lookup.
- Description: Supports the load contains grid id operation used by the surrounding class.

#### `public boolean renderContainsGridId(long gridId)`
- Role: Renders the render contains grid id.
- Description: Supports the render contains grid id operation used by the surrounding class.

#### `public Coord worldOfGridLocal(long gridId, int localX, int localY)`
- Role: Performs world of grid local.
- Description: Supports the world of grid local operation used by the surrounding class.
