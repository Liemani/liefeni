# WaypointOverlay

This file documents the responsibilities and members of `WaypointOverlay`.

## Meta

- Source: [WaypointOverlay.java](../../../../src/lmi/waypoint/WaypointOverlay.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Draws waypoint debug overlays in Haven.

## Members

### Constants

#### `private static final WaypointOverlay INSTANCE = new WaypointOverlay()`
- Role: Defines the shared instance constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color POINT_COLOR = new Color(205, 205, 205, 170)`
- Role: Defines the shared point color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color LINE_COLOR = new Color(190, 190, 190, 165)`
- Role: Defines the shared line color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color NODE_COLOR = new Color(80, 220, 120, 220)`
- Role: Defines the shared node color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color NODE_LABEL_COLOR = new Color(255, 220, 80, 240)`
- Role: Defines the shared node label color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Color TEST_COLOR = new Color(255, 80, 80, 220)`
- Role: Defines the shared test color constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean testEnabled`
- Role: Tracks whether test enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `private WaypointOverlay()`
- Role: Creates a new WaypointOverlay instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WaypointOverlay instance()`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `public static boolean toggleTest()`
- Role: Performs toggle test.
- Description: Supports the toggle test operation used by the surrounding class.

#### `public void draw(MapView mapView, GOut g)`
- Role: Renders the draw.
- Description: Supports the draw operation used by the surrounding class.

#### `public static Coord debugScreen(MapView mapView, Coord world)`
- Role: Logs the screen.
- Description: Logs the screen for diagnostics and debugging.

#### `private static void _drawTestOverlay(MapView mapView, GOut g)`
- Role: Performs  draw test overlay.
- Description: Supports the draw test overlay operation used by the surrounding class.

#### `private static Coord _screen(MapView mapView, Coord world)`
- Role: Performs  screen.
- Description: Supports the screen operation used by the surrounding class.

#### `private static Coord _project(MapView mapView, Coord world)`
- Role: Performs  project.
- Description: Supports the project operation used by the surrounding class.
