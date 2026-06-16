# SegmentResolution

This file documents the responsibilities and members of `SegmentResolution`.

## Meta

- Source: [SegmentResolution.java](../../../../../src/lmi/waypoint/recording/SegmentResolution.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint recording work for segment resolution.

## Members

### Constants

### Fields

#### `final boolean resolved`
- Role: Tracks the resolved flag.
- Description: Supports the resolved operation used by the surrounding class.

#### `final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `final long referenceGridId`
- Role: Stores the reference grid id value.
- Description: Backs the cached state for this file.

#### `final int referenceLocalX`
- Role: Stores the reference local x value.
- Description: Backs the cached state for this file.

#### `final int referenceLocalY`
- Role: Stores the reference local y value.
- Description: Backs the cached state for this file.

#### `final String errorMessage`
- Role: Stores the error message value.
- Description: Backs the cached state for this file.

### Methods

#### `private SegmentResolution(boolean resolved, long graphId, long referenceGridId, int referenceLocalX,`
- Role: Creates a new SegmentResolution instance.
- Description: Constructs the instance and initializes its default state.

#### `static SegmentResolution resolved(long graphId, long referenceGridId, int referenceLocalX, int referenceLocalY)`
- Role: Coordinates resolved persistence or lookup.
- Description: Supports the resolved operation used by the surrounding class.

#### `static SegmentResolution failed(String errorMessage)`
- Role: Performs failed.
- Description: Supports the failed operation used by the surrounding class.
