# CurrentGridDebugOverlay

This file documents the responsibilities and members of `CurrentGridDebugOverlay`.

## Meta

- Source: [CurrentGridDebugOverlay.java](../../../../src/lmi/draw/CurrentGridDebugOverlay.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Renders a draw-time overlay for the corresponding subsystem.

## Members

### Constants

#### `private static final int GRID_TILE_SIZE = 100`

- Description: TODO

#### `private static final CurrentGridDebugOverlay INSTANCE = new CurrentGridDebugOverlay()`

- Description: TODO

#### `private static final Color GRID_CORNER_COLOR = new Color(255, 140, 90, 220)`

- Description: TODO

#### `private static final Color GRID_LABEL_COLOR = new Color(255, 230, 210, 240)`

- Description: TODO

### Fields

#### `private static boolean enabled = false`

- Description: TODO

### Methods

#### `private CurrentGridDebugOverlay()`

- Description: TODO

#### `public static CurrentGridDebugOverlay instance()`

- Description: TODO

#### `public static boolean toggle()`

- Description: TODO

#### `public int zOrder()`

- Description: TODO

#### `public boolean visible()`

- Description: TODO

#### `public void draw(MapView mapView, GOut g)`

- Description: TODO

#### `private static void drawGridCorner(MapView mapView, GOut g, String label, int worldX, int worldY, int labelDx, int labelDy)`

- Description: TODO

#### `private static Coord screen(MapView mapView, Coord world)`

- Description: TODO
