---
source: [RecordingSession.java](../../../../../src/lmi/waypoint/model/RecordingSession.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordingSession

Represents waypoint model data for recording session.

## Members

### Constants

### Fields

#### `public final long startNodeId`
- Role: Stores the start node id value.
- Description: Backs the cached state for this file.

#### `public final List<RecordingSegment> segments = new ArrayList<>()`
- Role: Caches segments entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final long startedAtMillis`
- Role: Stores the started at millis value.
- Description: Backs the cached state for this file.

#### `public PendingPortalTransition pendingPortalTransition`
- Role: Stores the pending portal transition value.
- Description: Backs the cached state for this file.

### Methods

#### `public RecordingSession(long startNodeId, long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY)`
- Role: Creates a new RecordingSession instance.
- Description: Constructs the instance and initializes its default state.

#### `public int pointCount()`
- Role: Performs point count.
- Description: Supports the point count operation used by the surrounding class.

#### `public RecordingSegment currentSegment()`
- Role: Returns the segment.
- Description: Exposes the requested value without mutating state.

#### `public RecordingClick lastClick()`
- Role: Performs last click.
- Description: Supports the last click operation used by the surrounding class.
