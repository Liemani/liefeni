---
source: [WpNode.java](../../../../../src/lmi/waypoint/object/WpNode.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpNode

Represents a waypoint node domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final int localX`
- Role: Stores the local x value.
- Description: Backs the cached state for this file.

#### `public final int localY`
- Role: Stores the local y value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

### Methods

#### `private WpNode(long id, long graphId, long gridId, int localX, int localY, String name)`
- Role: Creates a new WpNode instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WpNode of(long id, long graphId, long gridId, int localX, int localY, String name)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static WpNode fromRecord(WpNodeRecord record)`
- Role: Performs from record.
- Description: Supports the from record operation used by the surrounding class.
