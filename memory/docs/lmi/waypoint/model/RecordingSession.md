# RecordingSession

This file documents the responsibilities and members of `RecordingSession`.

## Meta

- Source: [RecordingSession.java](../../../../../src/lmi/waypoint/model/RecordingSession.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides the `RecordingSession` functionality.

## Members

### Constants

### Fields

#### `public final long startNodeId`

- Description: TODO

#### `public final List<RecordingSegment> segments = new ArrayList<>()`

- Description: TODO

#### `public final long startedAtMillis`

- Description: TODO

#### `public PendingPortalTransition pendingPortalTransition`

- Description: TODO

### Methods

#### `public RecordingSession(long startNodeId, long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY)`

- Description: TODO

#### `public int pointCount()`

- Description: TODO

#### `public RecordingSegment currentSegment()`

- Description: TODO

#### `public RecordingClick lastClick()`

- Description: TODO
