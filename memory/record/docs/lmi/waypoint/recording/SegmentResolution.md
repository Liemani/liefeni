---
source: [SegmentResolution.java](../../../../../../src/lmi/waypoint/recording/SegmentResolution.java)
created: 2026-06-13
updated: 2026-06-14
---

# SegmentResolution

Coordinates waypoint recording work for segment resolution.

## Members

### Constants

### Fields

#### `final boolean resolved`
- Role: Tracks the resolved flag.
- Description: Caches the `resolved` value for reuse.

#### `final long graphId`
- Role: Caches the graph id value.
- Description: Caches the `graphId` value for reuse.

#### `final long referenceGridId`
- Role: Caches the reference grid id value.
- Description: Caches the `referenceGridId` value for reuse.

#### `final int referenceLocalX`
- Role: Caches the reference local x value.
- Description: Caches the `referenceLocalX` value for reuse.

#### `final int referenceLocalY`
- Role: Caches the reference local y value.
- Description: Caches the `referenceLocalY` value for reuse.

#### `final String errorMessage`
- Role: Caches the error message value.
- Description: Caches the `errorMessage` value for reuse.

### Methods

#### `private SegmentResolution(boolean resolved, long graphId, long referenceGridId, int referenceLocalX,`
- Role: Creates a new SegmentResolution instance.
- Description: Constructs the SegmentResolution instance from the supplied inputs.

#### `static SegmentResolution resolved(long graphId, long referenceGridId, int referenceLocalX, int referenceLocalY)`
- Role: Coordinates resolved persistence or lookup.
- Description: Resolves the d.

#### `static SegmentResolution failed(String errorMessage)`
- Role: Handles the failed path.
- Description: Implements the failed operation.