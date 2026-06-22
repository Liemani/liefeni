---
source: [WaypointRecorder.java](../../../../../../src/lmi/waypoint/recording/WaypointRecorder.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointRecorder

Coordinates waypoint recording from Haven input.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Implements the lock operation.
- Description: Implements the object operation.

### Fields

#### `private static RecordingSession activeSession`
- Role: Caches the active session value.
- Description: Caches the `activeSession` value for reuse.

### Methods

#### `private WaypointRecorder()`
- Role: Creates a new WaypointRecorder instance.
- Description: Constructs the WaypointRecorder instance from the supplied inputs.

#### `public static RecordingSession start(`
- Role: Handles the start workflow.
- Description: Starts a new waypoint recording session.

#### `public static boolean isActive(RecordingSession session)`
- Role: Checks whether the active.
- Description: Returns true when the supplied session is still active.

#### `public static void discard(RecordingSession session)`
- Role: Handles the discard path.
- Description: Abandons the session and clears any buffered recording data.

#### `public static void recordMapClick(Coord2d mapCoord, int mouseButton, ClickData clickData)`
- Role: Handles the record map click path.
- Description: Captures one map click into the active waypoint session.

#### `public static RecordingSession stop()`
- Role: Handles the stop path.
- Description: Finishes the active recording session and returns it.

#### `private static Long _gobId(ClickData clickData)`
- Role: Handles the gob id path.
- Description: Extracts the gob id from click metadata when present.

#### `private static String _gobResname(ClickData clickData)`
- Role: Returns the gob resource name from click data.
- Description: Implements the gob resname operation.

#### `private static Integer _meshId(ClickData clickData)`
- Role: Handles the mesh id path.
- Description: Extracts the mesh id from click metadata when present.

#### `private static Coord _gobPosition(ClickData clickData)`
- Role: Returns the gob position from click data.
- Description: Implements the gob position operation.