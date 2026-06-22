---
source: [RecordingSegment.java](../../../../../../src/lmi/waypoint/model/RecordingSegment.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordingSegment

Represents waypoint model data for recording segment.

## Members

### Constants

### Fields

#### `public final int index`
- Role: Caches the index value.
- Description: Caches the `index` value for reuse.

#### `public Long baseGraphId`
- Role: Caches the base graph id value.
- Description: Caches the `baseGraphId` value for reuse.

#### `public long baseGridId`
- Role: Caches the base grid id value.
- Description: Caches the `baseGridId` value for reuse.

#### `public int baseLocalX`
- Role: Caches the base local x value.
- Description: Caches the `baseLocalX` value for reuse.

#### `public int baseLocalY`
- Role: Caches the base local y value.
- Description: Caches the `baseLocalY` value for reuse.

#### `public final List<RecordingClick> clicks = new ArrayList<>()`
- Role: Handles s interaction.
- Description: Handles s interaction.

### Methods

#### `public RecordingSegment(int index, Long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY)`
- Role: Creates a new RecordingSegment instance.
- Description: Constructs the RecordingSegment instance from the supplied inputs.