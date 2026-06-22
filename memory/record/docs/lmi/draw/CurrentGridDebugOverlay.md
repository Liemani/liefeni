---
source: [CurrentGridDebugOverlay.java](../../../../../src/lmi/draw/CurrentGridDebugOverlay.java)
created: 2026-06-13
updated: 2026-06-14
---

# CurrentGridDebugOverlay

Draws the current-grid debug overlay.

## Members

### Constants

#### `private static final int GRID_TILE_SIZE = 100`
- Role: Caches the grid tile size value.
- Description: Caches the `GRID_TILE_SIZE` value for reuse.

#### `private static final CurrentGridDebugOverlay INSTANCE = new CurrentGridDebugOverlay()`
- Role: Implements the instance operation.
- Description: Implements the current grid debug overlay operation.

#### `private static final Color GRID_CORNER_COLOR = new Color(255, 140, 90, 220)`
- Role: Implements the grid corner color operation.
- Description: Implements the color operation.

#### `private static final Color GRID_LABEL_COLOR = new Color(255, 230, 210, 240)`
- Role: Implements the grid label color operation.
- Description: Implements the color operation.

### Fields

#### `private static boolean enabled = false`
- Role: Tracks whether enabled is enabled.
- Description: Controls whether the debug overlay is drawn.

### Methods

#### `private CurrentGridDebugOverlay()`
- Role: Creates a new CurrentGridDebugOverlay instance.
- Description: Constructs the CurrentGridDebugOverlay instance from the supplied inputs.

#### `public static CurrentGridDebugOverlay instance()`
- Role: Handles the instance path.
- Description: Returns the singleton overlay instance.

#### `public static boolean toggle()`
- Role: Handles the toggle path.
- Description: Flips the overlay visibility flag.

#### `public int zOrder()`
- Role: Returns the z order.
- Description: Controls draw ordering relative to other overlays.

#### `public boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `public void draw(MapView mapView, GOut g)`
- Role: Renders the draw.
- Description: Draws the current grid corners and labels over the map.

#### `private static void drawGridCorner(MapView mapView, GOut g, String label, int worldX, int worldY, int labelDx, int labelDy)`
- Role: Renders the draw grid corner.
- Description: Draws one labeled grid corner marker.

#### `private static Coord screen(MapView mapView, Coord world)`
- Role: Handles the screen path.
- Description: Converts a world coordinate into screen space.