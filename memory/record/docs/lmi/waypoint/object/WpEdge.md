---
source: [WpEdge.java](../../../../../../src/lmi/waypoint/object/WpEdge.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpEdge

Represents a waypoint edge domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final long graphId`
- Role: Caches the graph id value.
- Description: Caches the `graphId` value for reuse.

#### `public final long node0Id`
- Role: Caches the node0 id value.
- Description: Caches the `node0Id` value for reuse.

#### `public final long node1Id`
- Role: Caches the node1 id value.
- Description: Caches the `node1Id` value for reuse.

#### `public final int direction`
- Role: Caches the direction value.
- Description: Caches the `direction` value for reuse.

#### `public final double timeCost`
- Role: Caches the time cost value.
- Description: Caches the `timeCost` value for reuse.

#### `public final double fatigueCost`
- Role: Caches the fatigue cost value.
- Description: Caches the `fatigueCost` value for reuse.

### Methods

#### `private WpEdge(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Creates a new WpEdge instance.
- Description: Constructs the WpEdge instance from the supplied inputs.

#### `public static WpEdge of(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Builds a WpEdge value from the supplied components.
- Description: Builds a WpEdge value from the supplied components.

#### `public static WpEdge fromRecord(WpEdgeRecord record)`
- Role: Handles the from record path.
- Description: Implements the from record operation.

#### `public long otherNodeId(long nodeId)`
- Role: Handles the other node id path.
- Description: Implements the other node id operation.