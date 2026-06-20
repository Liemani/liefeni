---
source: [WpEdge.java](../../../../../src/lmi/waypoint/object/WpEdge.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpEdge

Represents a waypoint edge domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final long node0Id`
- Role: Stores the node0 id value.
- Description: Backs the cached state for this file.

#### `public final long node1Id`
- Role: Stores the node1 id value.
- Description: Backs the cached state for this file.

#### `public final int direction`
- Role: Stores the direction value.
- Description: Backs the cached state for this file.

#### `public final double timeCost`
- Role: Stores the time cost value.
- Description: Backs the cached state for this file.

#### `public final double fatigueCost`
- Role: Stores the fatigue cost value.
- Description: Backs the cached state for this file.

### Methods

#### `private WpEdge(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Creates a new WpEdge instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WpEdge of(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static WpEdge fromRecord(WpEdgeRecord record)`
- Role: Performs from record.
- Description: Supports the from record operation used by the surrounding class.

#### `public long otherNodeId(long nodeId)`
- Role: Performs other node id.
- Description: Supports the other node id operation used by the surrounding class.
