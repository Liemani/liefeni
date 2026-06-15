# WaypointCutBounds

This file documents the responsibilities and members of `WaypointCutBounds`.

## Meta

- Source: [WaypointCutBounds.java](../../../../../src/lmi/waypoint/runtime/WaypointCutBounds.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a spatial bound used by waypoint runtime or drawing.

## Members

### Constants

#### `private static final int CUT_ID_SHIFT = 14`

- Description: TODO

#### `private static final int GRID_TILE_SIZE = 100`

- Description: TODO

### Fields

#### `public final Coord centerCut`

- Description: TODO

#### `public final Area loadArea`

- Description: TODO

#### `public final Area renderArea`

- Description: TODO

### Methods

#### `private WaypointCutBounds(Coord centerCut, Area loadArea, Area renderArea)`

- Description: TODO

#### `public static WaypointCutBounds aroundVir(Coord vir)`

- Description: TODO

#### `public static WaypointCutBounds aroundWorld(Coord world)`

- Description: TODO

#### `public Coord cutOfWorld(Coord world)`

- Description: TODO

#### `public static Coord cutOfWorld(int x, int y)`

- Description: TODO

#### `public static Coord cutOriginOfWorld(Coord world)`

- Description: TODO

#### `public static Coord gridOriginOfWorld(Coord world)`

- Description: TODO

#### `public static Coord cutOfVir(int virX, int virY)`

- Description: TODO

#### `public Coord cutOfVir(Coord vir)`

- Description: TODO

#### `public static Coord cutOriginOfVir(int virX, int virY)`

- Description: TODO

#### `public static Coord cutOriginOfCut(Coord cut)`

- Description: TODO

#### `public static int cutIdOfVir(int virX, int virY)`

- Description: TODO

#### `public static int cutIdOfCut(int cutX, int cutY)`

- Description: TODO

#### `public boolean renderContainsCutId(int cutId)`

- Description: TODO
