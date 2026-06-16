# RecordingSegment

This file documents the responsibilities and members of `RecordingSegment`.

## Meta

- Source: [RecordingSegment.java](../../../../../src/lmi/waypoint/model/RecordingSegment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents waypoint model data for recording segment.

## Members

### Constants

### Fields

#### `public final int index`
- Role: Stores the index value.
- Description: Backs the cached state for this file.

#### `public Long baseGraphId`
- Role: Stores the base graph id value.
- Description: Backs the cached state for this file.

#### `public long baseGridId`
- Role: Stores the base grid id value.
- Description: Backs the cached state for this file.

#### `public int baseLocalX`
- Role: Stores the base local x value.
- Description: Backs the cached state for this file.

#### `public int baseLocalY`
- Role: Stores the base local y value.
- Description: Backs the cached state for this file.

#### `public final List<RecordingClick> clicks = new ArrayList<>()`
- Role: Caches clicks entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public RecordingSegment(int index, Long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY)`
- Role: Creates a new RecordingSegment instance.
- Description: Constructs the instance and initializes its default state.
