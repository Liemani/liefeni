---
source: [ManagedWpNode.java](../../../../../../src/lmi/waypoint/managed/ManagedWpNode.java)
created: 2026-06-13
updated: 2026-06-14
---

# ManagedWpNode

Represents a managed waypoint node.

## Members

### Constants

### Fields

#### `private long graphId`
- Role: Caches the graph id value.
- Description: Caches the `graphId` value for reuse.

#### `private long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `private int localX`
- Role: Caches the local x value.
- Description: Caches the `localX` value for reuse.

#### `private int localY`
- Role: Caches the local y value.
- Description: Caches the `localY` value for reuse.

#### `private String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

### Methods

#### `public ManagedWpNode(`
- Role: Creates a new ManagedWpNode instance.
- Description: Constructs the ManagedWpNode instance from the supplied inputs.

#### `public static ManagedWpNode fromWpNode(ManagedObjectContext context, WpNode node)`
- Role: Handles the from wp node path.
- Description: Implements the from wp node operation.

#### `public long graphId()`
- Role: Handles the graph id path.
- Description: Implements the graph id operation.

#### `public long gridId()`
- Role: Handles the grid id path.
- Description: Implements the grid id operation.

#### `public int localX()`
- Role: Handles the local x path.
- Description: Implements the local x operation.

#### `public int localY()`
- Role: Handles the local y path.
- Description: Implements the local y operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public void setGraphId(long graphId)`
- Role: Sets the graph id.
- Description: Updates the current object state.

#### `public void setGridId(long gridId)`
- Role: Sets the grid id.
- Description: Updates the current object state.

#### `public void setLocalX(int localX)`
- Role: Sets the local x.
- Description: Updates the current object state.

#### `public void setLocalY(int localY)`
- Role: Sets the local y.
- Description: Updates the current object state.

#### `public void setName(String name)`
- Role: Sets the name.
- Description: Updates the current object state.

#### `public WpNodeSnapshot snapshot()`
- Role: Handles the snapshot path.
- Description: Implements the snapshot operation.