# WaypointRecorder

This file documents the responsibilities and members of `WaypointRecorder`.

## Meta

- Source: [WaypointRecorder.java](../../../../../src/lmi/waypoint/recording/WaypointRecorder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint recording from Haven input.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static RecordingSession activeSession`
- Role: Stores the active session value.
- Description: Backs the cached state for this file.

### Methods

#### `private WaypointRecorder()`
- Role: Creates a new WaypointRecorder instance.
- Description: Constructs the instance and initializes its default state.

#### `public static RecordingSession start(`
- Role: Handles the start workflow.
- Description: Supports the start operation used by the surrounding class.

#### `public static boolean isActive(RecordingSession session)`
- Role: Checks whether the active.
- Description: Returns a boolean result for the described condition.

#### `public static void discard(RecordingSession session)`
- Role: Performs discard.
- Description: Supports the discard operation used by the surrounding class.

#### `public static void recordMapClick(Coord2d mapCoord, int mouseButton, ClickData clickData)`
- Role: Performs record map click.
- Description: Supports the record map click operation used by the surrounding class.

#### `public static RecordingSession stop()`
- Role: Performs stop.
- Description: Supports the stop operation used by the surrounding class.

#### `private static Long _gobId(ClickData clickData)`
- Role: Performs  gob id.
- Description: Supports the gob id operation used by the surrounding class.

#### `private static String _gobResname(ClickData clickData)`
- Role: Returns the gob resource name from click data.
- Description: Exposes the requested value without mutating state.

#### `private static Integer _meshId(ClickData clickData)`
- Role: Performs  mesh id.
- Description: Supports the mesh id operation used by the surrounding class.

#### `private static Coord _gobPosition(ClickData clickData)`
- Role: Returns the gob position from click data.
- Description: Exposes the requested value without mutating state.
