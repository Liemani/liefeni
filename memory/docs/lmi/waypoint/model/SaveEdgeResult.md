# SaveEdgeResult

This file documents the responsibilities and members of `SaveEdgeResult`.

## Meta

- Source: [SaveEdgeResult.java](../../../../../src/lmi/waypoint/model/SaveEdgeResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Carries a typed result payload for waypoint work.

## Members

### Constants

### Fields

#### `public final boolean saved`

- Description: TODO

#### `public final Long edgeId`

- Description: TODO

#### `public final Integer pointCount`

- Description: TODO

#### `public final WpEdge edge`

- Description: TODO

#### `public final Array<WpSegment> segments`

- Description: TODO

#### `public final Array<WpPoint> points`

- Description: TODO

#### `public final String errorMessage`

- Description: TODO

### Methods

#### `private SaveEdgeResult(boolean saved, Long edgeId, Integer pointCount, WpEdge edge,`

- Description: TODO

#### `public static SaveEdgeResult saved(long edgeId, int pointCount, WpEdge edge, Array<WpSegment> segments, Array<WpPoint> points)`

- Description: TODO

#### `public static SaveEdgeResult failed(String errorMessage)`

- Description: TODO
