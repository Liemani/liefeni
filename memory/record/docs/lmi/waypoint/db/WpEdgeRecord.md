---
source: [WpEdgeRecord.java](../../../../../../src/lmi/waypoint/db/WpEdgeRecord.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpEdgeRecord

Represents a persisted waypoint database record for wp edge record.

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

#### `public WpEdgeRecord(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`
- Role: Creates a new WpEdgeRecord instance.
- Description: Constructs the WpEdgeRecord instance from the supplied inputs.