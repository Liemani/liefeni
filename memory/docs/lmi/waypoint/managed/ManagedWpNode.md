# ManagedWpNode

This file documents the responsibilities and members of `ManagedWpNode`.

## Meta

- Source: [ManagedWpNode.java](../../../../../src/lmi/waypoint/managed/ManagedWpNode.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a managed waypoint node.

## Members

### Constants

### Fields

#### `private long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `private long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `private int localX`
- Role: Stores the local x value.
- Description: Backs the cached state for this file.

#### `private int localY`
- Role: Stores the local y value.
- Description: Backs the cached state for this file.

#### `private String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

### Methods

#### `public ManagedWpNode(`
- Role: Creates a new ManagedWpNode instance.
- Description: Constructs the instance and initializes its default state.

#### `public static ManagedWpNode fromWpNode(ManagedObjectContext context, WpNode node)`
- Role: Performs from wp node.
- Description: Supports the from wp node operation used by the surrounding class.

#### `public long graphId()`
- Role: Performs graph id.
- Description: Supports the graph id operation used by the surrounding class.

#### `public long gridId()`
- Role: Performs grid id.
- Description: Supports the grid id operation used by the surrounding class.

#### `public int localX()`
- Role: Performs local x.
- Description: Supports the local x operation used by the surrounding class.

#### `public int localY()`
- Role: Performs local y.
- Description: Supports the local y operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public void setGraphId(long graphId)`
- Role: Sets the graph id.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void setGridId(long gridId)`
- Role: Sets the grid id.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void setLocalX(int localX)`
- Role: Sets the local x.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void setLocalY(int localY)`
- Role: Sets the local y.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void setName(String name)`
- Role: Sets the name.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public WpNodeSnapshot snapshot()`
- Role: Performs snapshot.
- Description: Supports the snapshot operation used by the surrounding class.
