# WaypointCutBounds

This file documents the responsibilities and members of `WaypointCutBounds`.

## Meta

- Source: [WaypointCutBounds.java](../../../../../src/lmi/waypoint/runtime/WaypointCutBounds.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state for waypoint cut bounds.

## Members

### Constants

#### `private static final int CUT_ID_SHIFT = 14`
- Role: Defines the shared cut id shift constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int GRID_TILE_SIZE = 100`
- Role: Defines the shared grid tile size constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Coord centerCut`
- Role: Stores the center cut value.
- Description: Backs the cached state for this file.

#### `public final Area loadArea`
- Role: Holds the load area state.
- Description: Backs the cached state for this file.

#### `public final Area renderArea`
- Role: Holds the render area state.
- Description: Backs the cached state for this file.

### Methods

#### `private WaypointCutBounds(Coord centerCut, Area loadArea, Area renderArea)`
- Role: Creates a new WaypointCutBounds instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WaypointCutBounds aroundVir(Coord vir)`
- Role: Performs around vir.
- Description: Supports the around vir operation used by the surrounding class.

#### `public static WaypointCutBounds aroundWorld(Coord world)`
- Role: Performs around world.
- Description: Supports the around world operation used by the surrounding class.

#### `public Coord cutOfWorld(Coord world)`
- Role: Performs cut of world.
- Description: Supports the cut of world operation used by the surrounding class.

#### `public static Coord cutOfWorld(int x, int y)`
- Role: Performs cut of world.
- Description: Supports the cut of world operation used by the surrounding class.

#### `public static Coord cutOriginOfWorld(Coord world)`
- Role: Performs cut origin of world.
- Description: Supports the cut origin of world operation used by the surrounding class.

#### `public static Coord gridOriginOfWorld(Coord world)`
- Role: Performs grid origin of world.
- Description: Supports the grid origin of world operation used by the surrounding class.

#### `public static Coord cutOfVir(int virX, int virY)`
- Role: Performs cut of vir.
- Description: Supports the cut of vir operation used by the surrounding class.

#### `public Coord cutOfVir(Coord vir)`
- Role: Performs cut of vir.
- Description: Supports the cut of vir operation used by the surrounding class.

#### `public static Coord cutOriginOfVir(int virX, int virY)`
- Role: Performs cut origin of vir.
- Description: Supports the cut origin of vir operation used by the surrounding class.

#### `public static Coord cutOriginOfCut(Coord cut)`
- Role: Performs cut origin of cut.
- Description: Supports the cut origin of cut operation used by the surrounding class.

#### `public static int cutIdOfVir(int virX, int virY)`
- Role: Performs cut id of vir.
- Description: Supports the cut id of vir operation used by the surrounding class.

#### `public static int cutIdOfCut(int cutX, int cutY)`
- Role: Performs cut id of cut.
- Description: Supports the cut id of cut operation used by the surrounding class.

#### `public boolean renderContainsCutId(int cutId)`
- Role: Renders the render contains cut id.
- Description: Supports the render contains cut id operation used by the surrounding class.
