---
source: [GridPosition.java](../../../../../../src/lmi/waypoint/runtime/GridPosition.java)
created: 2026-06-13
updated: 2026-06-14
---

# GridPosition

Coordinates waypoint runtime state for grid position.

## Members

### Constants

### Fields

#### `public final long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `public final long havenGridId`
- Role: Caches the haven grid id value.
- Description: Caches the `havenGridId` value for reuse.

#### `public final long mapSegmentId`
- Role: Caches the map segment id value.
- Description: Caches the `mapSegmentId` value for reuse.

#### `public final int localX`
- Role: Caches the local x value.
- Description: Caches the `localX` value for reuse.

#### `public final int localY`
- Role: Caches the local y value.
- Description: Caches the `localY` value for reuse.

### Methods

#### `public GridPosition(long gridId, long havenGridId, long mapSegmentId, int localX, int localY)`
- Role: Creates a new GridPosition instance.
- Description: Constructs the GridPosition instance from the supplied inputs.

#### `public Coord local()`
- Role: Handles the local path.
- Description: Returns the grid-local coordinate pair.