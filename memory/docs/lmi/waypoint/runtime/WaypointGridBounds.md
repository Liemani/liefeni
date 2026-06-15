# WaypointGridBounds

This file documents the responsibilities and members of `WaypointGridBounds`.

## Meta

- Source: [WaypointGridBounds.java](../../../../../src/lmi/waypoint/runtime/WaypointGridBounds.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a spatial bound used by waypoint runtime or drawing.

## Members

### Constants

### Fields

#### `public final Coord centerGrid`

- Description: TODO

#### `public final Area loadArea`

- Description: TODO

#### `public final Area renderArea`

- Description: TODO

#### `private final Set<Long> loadGridIds`

- Description: TODO

#### `private final Set<Long> renderGridIds`

- Description: TODO

#### `private final Map<Long, Coord> gridOrigins`

- Description: TODO

### Methods

#### `private WaypointGridBounds(`

- Description: TODO

#### `public static WaypointGridBounds empty()`

- Description: TODO

#### `public static WaypointGridBounds aroundWorld(Coord world)`

- Description: TODO

#### `public Set<Long> loadGridIds()`

- Description: TODO

#### `public boolean loadContainsGridId(long gridId)`

- Description: TODO

#### `public boolean renderContainsGridId(long gridId)`

- Description: TODO

#### `public Coord worldOfGridLocal(long gridId, int localX, int localY)`

- Description: TODO
