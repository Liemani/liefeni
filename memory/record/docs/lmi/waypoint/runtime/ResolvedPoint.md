---
source: [ResolvedPoint.java](../../../../../../src/lmi/waypoint/runtime/ResolvedPoint.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResolvedPoint

Coordinates waypoint runtime state for resolved point.

## Members

### Constants

### Fields

#### `public final long segmentId`
- Role: Caches the segment id value.
- Description: Caches the `segmentId` value for reuse.

#### `public final long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `public final int step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final int localX`
- Role: Caches the local x value.
- Description: Caches the `localX` value for reuse.

#### `public final int localY`
- Role: Caches the local y value.
- Description: Caches the `localY` value for reuse.

#### `public final int mouseButton`
- Role: Caches the mouse button value.
- Description: Caches the `mouseButton` value for reuse.

#### `public final Integer meshId`
- Role: Caches the mesh id value.
- Description: Caches the `meshId` value for reuse.

#### `public final Coord world`
- Role: Caches the world value.
- Description: Caches the `world` value for reuse.

### Methods

#### `public ResolvedPoint(long segmentId, long gridId, int step, int localX, int localY,`
- Role: Creates a new ResolvedPoint instance.
- Description: Constructs the ResolvedPoint instance from the supplied inputs.