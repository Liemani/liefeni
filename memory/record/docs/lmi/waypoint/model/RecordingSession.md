---
source: [RecordingSession.java](../../../../../../src/lmi/waypoint/model/RecordingSession.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordingSession

Represents waypoint model data for recording session.

## Members

### Constants

### Fields

#### `public final long startNodeId`
- Role: Caches the start node id value.
- Description: Caches the `startNodeId` value for reuse.

#### `public final List<RecordingSegment> segments = new ArrayList<>()`
- Role: Implements the segments operation.
- Description: Implements the public final list<recording segment> segments = new array list<>() operation.

#### `public final long startedAtMillis`
- Role: Caches the started at millis value.
- Description: Caches the `startedAtMillis` value for reuse.

#### `public PendingPortalTransition pendingPortalTransition`
- Role: Caches the pending portal transition value.
- Description: Caches the `pendingPortalTransition` value for reuse.

### Methods

#### `public RecordingSession(long startNodeId, long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY)`
- Role: Creates a new RecordingSession instance.
- Description: Seeds the session with the starting graph and base grid location.

#### `public int pointCount()`
- Role: Handles the point count path.
- Description: Returns the number of recorded points in the session.

#### `public RecordingSegment currentSegment()`
- Role: Returns the segment.
- Description: Returns the segment currently receiving new clicks.

#### `public RecordingClick lastClick()`
- Role: Handles the last click path.
- Description: Returns the most recent recorded click.