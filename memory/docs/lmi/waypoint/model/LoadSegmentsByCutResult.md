# LoadSegmentsByCutResult

This file documents the responsibilities and members of `LoadSegmentsByCutResult`.

## Meta

- Source: [LoadSegmentsByCutResult.java](../../../../../src/lmi/waypoint/model/LoadSegmentsByCutResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the result of load segments by cut result.

## Members

### Constants

### Fields

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final Array<WpSegment> segments`
- Role: Caches segments entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public LoadSegmentsByCutResult(long graphId, long gridId, Array<WpSegment> segments)`
- Role: Creates a new LoadSegmentsByCutResult instance.
- Description: Constructs the instance and initializes its default state.
