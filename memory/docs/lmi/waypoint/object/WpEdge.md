# WpEdge

This file documents the responsibilities and members of `WpEdge`.

## Meta

- Source: [WpEdge.java](../../../../../src/lmi/waypoint/object/WpEdge.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a waypoint edge value or runtime cache entry.

## Members

### Constants

### Fields

#### `public final long id`

- Description: TODO

#### `public final long graphId`

- Description: TODO

#### `public final long node0Id`

- Description: TODO

#### `public final long node1Id`

- Description: TODO

#### `public final int direction`

- Description: TODO

#### `public final double timeCost`

- Description: TODO

#### `public final double fatigueCost`

- Description: TODO

### Methods

#### `private WpEdge(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`

- Description: TODO

#### `public static WpEdge of(long id, long graphId, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost)`

- Description: TODO

#### `public static WpEdge fromRecord(WpEdgeRecord record)`

- Description: TODO

#### `public long otherNodeId(long nodeId)`

- Description: TODO
