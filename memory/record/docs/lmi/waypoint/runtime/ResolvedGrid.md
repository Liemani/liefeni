---
source: [ResolvedGrid.java](../../../../../../src/lmi/waypoint/runtime/ResolvedGrid.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResolvedGrid

Coordinates waypoint runtime state for resolved grid.

## Members

### Constants

### Fields

#### `public final long mapGridId`
- Role: Caches the map grid id value.
- Description: Caches the `mapGridId` value for reuse.

#### `public final long havenGridId`
- Role: Caches the haven grid id value.
- Description: Caches the `havenGridId` value for reuse.

#### `public final long mapSegmentId`
- Role: Caches the map segment id value.
- Description: Caches the `mapSegmentId` value for reuse.

#### `public final Coord originWorld`
- Role: Caches the origin world value.
- Description: Caches the `originWorld` value for reuse.

### Methods

#### `public ResolvedGrid(long mapGridId, long havenGridId, long mapSegmentId, Coord originWorld)`
- Role: Creates a new ResolvedGrid instance.
- Description: Constructs the ResolvedGrid instance from the supplied inputs.