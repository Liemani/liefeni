---
source: [DescribeWaypointVisibleBoundsEffect.java](../../../../../src/agent/debug/DescribeWaypointVisibleBoundsEffect.java)
created: 2026-06-13
updated: 2026-06-14
---

# DescribeWaypointVisibleBoundsEffect

Prints waypoint visible bounds for debugging.

## Members

### Constants

### Fields

### Methods

#### `public void execute()`
- Role: Executes the operation.
- Description: Runs the queued request and posts its callback result back through the sync manager.

#### `public static String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `private static int _view(MapView mapView)`
- Role: Handles the view path.
- Description: Implements the view operation.

#### `private static Area _cutArea(Coord centerTile, int view)`
- Role: Computes the cut area around the current center.
- Description: Implements the cut area operation.

#### `private static Area _reqTileArea(Coord centerTile, int view)`
- Role: Computes the requested tile area around the current center.
- Description: Implements the req tile area operation.