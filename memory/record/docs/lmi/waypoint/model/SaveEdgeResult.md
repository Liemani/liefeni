---
source: [SaveEdgeResult.java](../../../../../src/lmi/waypoint/model/SaveEdgeResult.java)
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
- Description: Supports the saved operation used by the surrounding class.

#### `public final Long edgeId`
- Role: Stores the edge id value.
- Description: Backs the cached state for this file.

#### `public final Integer pointCount`
- Role: Stores the point count value.
- Description: Backs the cached state for this file.

#### `public final WpEdge edge`
- Role: Stores the edge value.
- Description: Backs the cached state for this file.

#### `public final Array<WpSegment> segments`
- Role: Caches segments entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Array<WpPoint> points`
- Role: Caches points entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String errorMessage`
- Role: Stores the error message value.
- Description: Backs the cached state for this file.

### Methods

#### `private SaveEdgeResult(boolean saved, Long edgeId, Integer pointCount, WpEdge edge,`
- Role: Creates a new SaveEdgeResult instance.
- Description: Constructs the instance and initializes its default state.

#### `public static SaveEdgeResult saved(long edgeId, int pointCount, WpEdge edge, Array<WpSegment> segments, Array<WpPoint> points)`
- Role: Coordinates saved persistence or lookup.
- Description: Supports the saved operation used by the surrounding class.

#### `public static SaveEdgeResult failed(String errorMessage)`
- Role: Performs failed.
- Description: Supports the failed operation used by the surrounding class.
