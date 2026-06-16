# DescribeWaypointVisibleBoundsEffect

This file documents the responsibilities and members of `DescribeWaypointVisibleBoundsEffect`.

## Meta

- Source: [DescribeWaypointVisibleBoundsEffect.java](../../../../src/agent/debug/DescribeWaypointVisibleBoundsEffect.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Prints waypoint visible bounds for debugging.

## Members

### Constants

### Fields

### Methods

#### `public void execute()`
- Role: Executes the operation.
- Description: Supports the execute operation used by the surrounding class.

#### `public static String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private static int _view(MapView mapView)`
- Role: Performs  view.
- Description: Supports the view operation used by the surrounding class.

#### `private static Area _cutArea(Coord centerTile, int view)`
- Role: Computes the cut area around the current center.
- Description: Supports the cut area operation used by the surrounding class.

#### `private static Area _reqTileArea(Coord centerTile, int view)`
- Role: Computes the requested tile area around the current center.
- Description: Supports the req tile area operation used by the surrounding class.
