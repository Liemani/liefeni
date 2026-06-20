---
source: [WpEdgeRecord.java](../../../../../src/lmi/waypoint/db/WpEdgeRecord.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpEdgeRecord

Represents a persisted waypoint database record for wp edge record.

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

#### `public WpEdgeRecord(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Creates a new WpEdgeRecord instance.
- Description: Constructs the instance and initializes its default state.
