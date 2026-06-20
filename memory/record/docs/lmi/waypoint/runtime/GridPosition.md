---
source: [GridPosition.java](../../../../../src/lmi/waypoint/runtime/GridPosition.java)
created: 2026-06-13
updated: 2026-06-14
---

# GridPosition

Coordinates waypoint runtime state for grid position.

## Members

### Constants

### Fields

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final long havenGridId`
- Role: Stores the haven grid id value.
- Description: Backs the cached state for this file.

#### `public final long mapSegmentId`
- Role: Stores the map segment id value.
- Description: Backs the cached state for this file.

#### `public final int localX`
- Role: Stores the local x value.
- Description: Backs the cached state for this file.

#### `public final int localY`
- Role: Stores the local y value.
- Description: Backs the cached state for this file.

### Methods

#### `public GridPosition(long gridId, long havenGridId, long mapSegmentId, int localX, int localY)`
- Role: Creates a new GridPosition instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord local()`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.
