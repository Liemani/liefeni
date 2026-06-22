---
source: [WpNode.java](../../../../../../src/lmi/waypoint/object/WpNode.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpNode

Represents a waypoint node domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

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

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

### Methods

#### `private WpNode(long id, long graphId, long gridId, int localX, int localY, String name)`
- Role: Creates a new WpNode instance.
- Description: Constructs the WpNode instance from the supplied inputs.

#### `public static WpNode of(long id, long graphId, long gridId, int localX, int localY, String name)`
- Role: Builds a WpNode value from the supplied components.
- Description: Builds a WpNode value from the supplied components.

#### `public static WpNode fromRecord(WpNodeRecord record)`
- Role: Handles the from record path.
- Description: Implements the from record operation.