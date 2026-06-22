---
source: [RecordingSessionPlanner.java](../../../../../../src/lmi/waypoint/recording/RecordingSessionPlanner.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordingSessionPlanner

Plans waypoint recording sessions from runtime input.

## Members

### Constants

### Fields

### Methods

#### `private RecordingSessionPlanner()`
- Role: Creates a new RecordingSessionPlanner instance.
- Description: Constructs the RecordingSessionPlanner instance from the supplied inputs.

#### `static RecordingSession plan(RecordingSession session)`
- Role: Handles the plan path.
- Description: Implements the plan operation.

#### `private static RecordingSegment _copySegmentHeader(RecordingSegment original, int index)`
- Role: Handles the copy segment header path.
- Description: Implements the copy segment header operation.

#### `private static boolean _isPortalClick(RecordingClick click)`
- Role: Handles the is portal click path.
- Description: Implements the is portal click operation.

#### `private static void _resolvePendingPortalTransition(RecordingSegment current, PendingPortalTransition pending)`
- Role: Handles the resolve pending portal transition path.
- Description: Implements the resolve pending portal transition operation.