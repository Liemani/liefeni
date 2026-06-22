---
source: [WaypointOverlay.java](../../../../../src/lmi/waypoint/WaypointOverlay.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointOverlay

Draws waypoint debug overlays in Haven.

## Members

### Constants

#### `private static final WaypointOverlay INSTANCE = new WaypointOverlay()`
- Role: Implements the instance operation.
- Description: Implements the waypoint overlay operation.

#### `private static final Color POINT_COLOR = new Color(205, 205, 205, 170)`
- Role: Implements the point color operation.
- Description: Implements the color operation.

#### `private static final Color LINE_COLOR = new Color(190, 190, 190, 165)`
- Role: Implements the line color operation.
- Description: Implements the color operation.

#### `private static final Color NODE_COLOR = new Color(80, 220, 120, 220)`
- Role: Implements the node color operation.
- Description: Implements the color operation.

#### `private static final Color NODE_LABEL_COLOR = new Color(255, 220, 80, 240)`
- Role: Implements the node label color operation.
- Description: Implements the color operation.

#### `private static final Color TEST_COLOR = new Color(255, 80, 80, 220)`
- Role: Implements the test color operation.
- Description: Implements the color operation.

### Fields

#### `private static boolean testEnabled`
- Role: Tracks whether test enabled is enabled.
- Description: Controls whether the temporary test overlay is drawn.

### Methods

#### `private WaypointOverlay()`
- Role: Creates a new WaypointOverlay instance.
- Description: Constructs the WaypointOverlay instance from the supplied inputs.

#### `public static WaypointOverlay instance()`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `public static boolean toggleTest()`
- Role: Handles the toggle test path.
- Description: Implements the toggle test operation.

#### `public void draw(MapView mapView, GOut g)`
- Role: Renders the draw.
- Description: Draws the WaypointOverlay content.

#### `public static Coord debugScreen(MapView mapView, Coord world)`
- Role: Logs the screen.
- Description: Logs the screen for diagnostics and debugging.

#### `private static void _drawTestOverlay(MapView mapView, GOut g)`
- Role: Handles the draw test overlay path.
- Description: Implements the draw test overlay operation.

#### `private static Coord _screen(MapView mapView, Coord world)`
- Role: Handles the screen path.
- Description: Implements the screen operation.

#### `private static Coord _project(MapView mapView, Coord world)`
- Role: Handles the project path.
- Description: Implements the project operation.