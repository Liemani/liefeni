---
source: [RecordingSessionPlanner.java](../../../../../src/lmi/waypoint/recording/RecordingSessionPlanner.java)
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
- Description: Constructs the instance and initializes its default state.

#### `static RecordingSession plan(RecordingSession session)`
- Role: Performs plan.
- Description: Supports the plan operation used by the surrounding class.

#### `private static RecordingSegment _copySegmentHeader(RecordingSegment original, int index)`
- Role: Performs  copy segment header.
- Description: Supports the copy segment header operation used by the surrounding class.

#### `private static boolean _isPortalClick(RecordingClick click)`
- Role: Performs  is portal click.
- Description: Supports the is portal click operation used by the surrounding class.

#### `private static void _resolvePendingPortalTransition(RecordingSegment current, PendingPortalTransition pending)`
- Role: Performs  resolve pending portal transition.
- Description: Supports the resolve pending portal transition operation used by the surrounding class.
