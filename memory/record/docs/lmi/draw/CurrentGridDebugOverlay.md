---
source: [CurrentGridDebugOverlay.java](../../../../src/lmi/draw/CurrentGridDebugOverlay.java)
created: 2026-06-13
updated: 2026-06-14
---

# CurrentGridDebugOverlay

Draws the current-grid debug overlay.

## Members

### Constants

#### `private static final int GRID_TILE_SIZE = 100`
- Role: Defines the shared grid tile size constant.
- Description: Shared constant used by the rest of the class.

#### `private static final CurrentGridDebugOverlay INSTANCE = new CurrentGridDebugOverlay()`
- Role: Defines the shared instance constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color GRID_CORNER_COLOR = new Color(255, 140, 90, 220)`
- Role: Defines the shared grid corner color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color GRID_LABEL_COLOR = new Color(255, 230, 210, 240)`
- Role: Defines the shared grid label color constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean enabled = false`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `private CurrentGridDebugOverlay()`
- Role: Creates a new CurrentGridDebugOverlay instance.
- Description: Constructs the instance and initializes its default state.

#### `public static CurrentGridDebugOverlay instance()`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `public static boolean toggle()`
- Role: Performs toggle.
- Description: Supports the toggle operation used by the surrounding class.

#### `public int zOrder()`
- Role: Returns the z order.
- Description: Controls draw ordering relative to other overlays.

#### `public boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `public void draw(MapView mapView, GOut g)`
- Role: Renders the draw.
- Description: Supports the draw operation used by the surrounding class.

#### `private static void drawGridCorner(MapView mapView, GOut g, String label, int worldX, int worldY, int labelDx, int labelDy)`
- Role: Renders the draw grid corner.
- Description: Supports the draw grid corner operation used by the surrounding class.

#### `private static Coord screen(MapView mapView, Coord world)`
- Role: Performs screen.
- Description: Supports the screen operation used by the surrounding class.
