---
source: [SaveEdgeResult.java](../../../../../../src/lmi/waypoint/model/SaveEdgeResult.java)
created: 2026-06-13
updated: 2026-06-14
---

# SaveEdgeResult

Represents the result of save edge result.

## Members

### Constants

### Fields

#### `public final boolean saved`
- Role: Tracks the saved flag.
- Description: Marks whether the edge persistence succeeded.

#### `public final Long edgeId`
- Role: Caches the edge id value.
- Description: Caches the `edgeId` value for reuse.

#### `public final Integer pointCount`
- Role: Caches the point count value.
- Description: Caches the `pointCount` value for reuse.

#### `public final WpEdge edge`
- Role: Caches the edge value.
- Description: Caches the `edge` value for reuse.

#### `public final Array<WpSegment> segments`
- Role: Caches the segments value.
- Description: Caches the `segments` value for reuse.

#### `public final Array<WpPoint> points`
- Role: Caches the points value.
- Description: Caches the `points` value for reuse.

#### `public final String errorMessage`
- Role: Caches the error message value.
- Description: Caches the `errorMessage` value for reuse.

### Methods

#### `private SaveEdgeResult(boolean saved, Long edgeId, Integer pointCount, WpEdge edge,`
- Role: Creates a new SaveEdgeResult instance.
- Description: Constructs the SaveEdgeResult instance from the supplied inputs.

#### `public static SaveEdgeResult saved(long edgeId, int pointCount, WpEdge edge, Array<WpSegment> segments, Array<WpPoint> points)`
- Role: Coordinates saved persistence or lookup.
- Description: Returns the saved edge record and all generated child rows.

#### `public static SaveEdgeResult failed(String errorMessage)`
- Role: Handles the failed path.
- Description: Returns the failure reason without persisted ids.