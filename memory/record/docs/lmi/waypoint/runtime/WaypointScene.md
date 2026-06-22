---
source: [WaypointScene.java](../../../../../../src/lmi/waypoint/runtime/WaypointScene.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointScene

Represents the current waypoint scene state.

## Members

### Constants

### Fields

#### `public final WaypointGridBounds bounds`
- Role: Caches the bounds value.
- Description: Caches the `bounds` value for reuse.

#### `public final Array<ResolvedLine> drawableLines = new Array<>()`
- Role: Draws the able lines.
- Description: Draws the able lines.

#### `public final Array<ResolvedNode> drawableNodes = new Array<>()`
- Role: Draws the able nodes.
- Description: Draws the able nodes.

#### `public final Array<ResolvedNode> hiddenNodes = new Array<>()`
- Role: Implements the hidden nodes operation.
- Description: Implements the public final array<resolved node> hidden nodes = new array<>() operation.

#### `public final Array<ResolvedPoint> drawablePoints = new Array<>()`
- Role: Draws the able points.
- Description: Draws the able points.

#### `public final Array<ResolvedPoint> hiddenPoints = new Array<>()`
- Role: Implements the hidden points operation.
- Description: Implements the public final array<resolved point> hidden points = new array<>() operation.

### Methods

#### `public WaypointScene(WaypointGridBounds bounds)`
- Role: Creates a new WaypointScene instance.
- Description: Constructs the WaypointScene instance from the supplied inputs.