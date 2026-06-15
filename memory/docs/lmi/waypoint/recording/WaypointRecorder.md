# WaypointRecorder

This file documents the responsibilities and members of `WaypointRecorder`.

## Meta

- Source: [WaypointRecorder.java](../../../../../src/lmi/waypoint/recording/WaypointRecorder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides the `WaypointRecorder` functionality.

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

### Fields

#### `private static RecordingSession activeSession`

- Description: TODO

### Methods

#### `private WaypointRecorder()`

- Description: TODO

#### `public static RecordingSession start(`

- Description: TODO

#### `public static boolean isActive(RecordingSession session)`

- Description: TODO

#### `public static void discard(RecordingSession session)`

- Description: TODO

#### `public static void recordMapClick(Coord2d mapCoord, int mouseButton, ClickData clickData)`

- Description: TODO

#### `public static RecordingSession stop()`

- Description: TODO

#### `private static Long _gobId(ClickData clickData)`

- Description: TODO

#### `private static String _gobResname(ClickData clickData)`

- Description: TODO

#### `private static Integer _meshId(ClickData clickData)`

- Description: TODO

#### `private static Coord _gobPosition(ClickData clickData)`

- Description: TODO
