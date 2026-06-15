# WaypointOverlay

This file documents the responsibilities and members of `WaypointOverlay`.

## Meta

- Source: [WaypointOverlay.java](../../../../src/lmi/waypoint/WaypointOverlay.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Renders waypoint-specific overlay information.

## Members

### Constants

#### `private static final WaypointOverlay INSTANCE = new WaypointOverlay()`

- Description: TODO

#### `private static final Color POINT_COLOR = new Color(205, 205, 205, 170)`

- Description: TODO

#### `private static final Color LINE_COLOR = new Color(190, 190, 190, 165)`

- Description: TODO

#### `private static final Color NODE_COLOR = new Color(80, 220, 120, 220)`

- Description: TODO

#### `private static final Color NODE_LABEL_COLOR = new Color(255, 220, 80, 240)`

- Description: TODO

#### `private static final Color TEST_COLOR = new Color(255, 80, 80, 220)`

- Description: TODO

### Fields

#### `private static boolean testEnabled`

- Description: TODO

### Methods

#### `private WaypointOverlay()`

- Description: TODO

#### `public static WaypointOverlay instance()`

- Description: TODO

#### `public static boolean toggleTest()`

- Description: TODO

#### `public void draw(MapView mapView, GOut g)`

- Description: TODO

#### `public static Coord debugScreen(MapView mapView, Coord world)`

- Description: TODO

#### `private static void _drawTestOverlay(MapView mapView, GOut g)`

- Description: TODO

#### `private static Coord _screen(MapView mapView, Coord world)`

- Description: TODO

#### `private static Coord _project(MapView mapView, Coord world)`

- Description: TODO
