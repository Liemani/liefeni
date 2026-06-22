---
source: [WaypointCutBounds.java](../../../../../../src/lmi/waypoint/runtime/WaypointCutBounds.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointCutBounds

Coordinates waypoint runtime state for waypoint cut bounds.

## Members

### Constants

#### `private static final int CUT_ID_SHIFT = 14`
- Role: Caches the cut id shift value.
- Description: Caches the `CUT_ID_SHIFT` value for reuse.

#### `private static final int GRID_TILE_SIZE = 100`
- Role: Caches the grid tile size value.
- Description: Caches the `GRID_TILE_SIZE` value for reuse.

### Fields

#### `public final Coord centerCut`
- Role: Caches the center cut value.
- Description: Caches the `centerCut` value for reuse.

#### `public final Area loadArea`
- Role: Caches the load area value.
- Description: Caches the `loadArea` value for reuse.

#### `public final Area renderArea`
- Role: Caches the render area value.
- Description: Caches the `renderArea` value for reuse.

### Methods

#### `private WaypointCutBounds(Coord centerCut, Area loadArea, Area renderArea)`
- Role: Creates a new WaypointCutBounds instance.
- Description: Constructs the WaypointCutBounds instance from the supplied inputs.

#### `public static WaypointCutBounds aroundVir(Coord vir)`
- Role: Handles the around vir path.
- Description: Implements the around vir operation.

#### `public static WaypointCutBounds aroundWorld(Coord world)`
- Role: Handles the around world path.
- Description: Implements the around world operation.

#### `public Coord cutOfWorld(Coord world)`
- Role: Handles the cut of world path.
- Description: Implements the cut of world operation.

#### `public static Coord cutOfWorld(int x, int y)`
- Role: Handles the cut of world path.
- Description: Implements the cut of world operation.

#### `public static Coord cutOriginOfWorld(Coord world)`
- Role: Handles the cut origin of world path.
- Description: Implements the cut origin of world operation.

#### `public static Coord gridOriginOfWorld(Coord world)`
- Role: Handles the grid origin of world path.
- Description: Implements the grid origin of world operation.

#### `public static Coord cutOfVir(int virX, int virY)`
- Role: Handles the cut of vir path.
- Description: Implements the cut of vir operation.

#### `public Coord cutOfVir(Coord vir)`
- Role: Handles the cut of vir path.
- Description: Implements the cut of vir operation.

#### `public static Coord cutOriginOfVir(int virX, int virY)`
- Role: Handles the cut origin of vir path.
- Description: Implements the cut origin of vir operation.

#### `public static Coord cutOriginOfCut(Coord cut)`
- Role: Handles the cut origin of cut path.
- Description: Implements the cut origin of cut operation.

#### `public static int cutIdOfVir(int virX, int virY)`
- Role: Handles the cut id of vir path.
- Description: Implements the cut id of vir operation.

#### `public static int cutIdOfCut(int cutX, int cutY)`
- Role: Handles the cut id of cut path.
- Description: Implements the cut id of cut operation.

#### `public boolean renderContainsCutId(int cutId)`
- Role: Renders the render contains cut id.
- Description: Renders the contains cut id.