---
source: [ResolvedNode.java](../../../../../../src/lmi/waypoint/runtime/ResolvedNode.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResolvedNode

Coordinates waypoint runtime state for resolved node.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final long graphId`
- Role: Caches the graph id value.
- Description: Caches the `graphId` value for reuse.

#### `public final long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `public final int localX`
- Role: Caches the local x value.
- Description: Caches the `localX` value for reuse.

#### `public final int localY`
- Role: Caches the local y value.
- Description: Caches the `localY` value for reuse.

#### `public final Coord world`
- Role: Caches the world value.
- Description: Caches the `world` value for reuse.

### Methods

#### `public ResolvedNode(long id, String name, long graphId, long gridId, int localX, int localY, Coord world)`
- Role: Creates a new ResolvedNode instance.
- Description: Constructs the ResolvedNode instance from the supplied inputs.