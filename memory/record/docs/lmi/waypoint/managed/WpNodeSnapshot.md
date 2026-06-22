---
source: [WpNodeSnapshot.java](../../../../../../src/lmi/waypoint/managed/WpNodeSnapshot.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpNodeSnapshot

Represents an immutable snapshot of a waypoint node.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final long version`
- Role: Caches the version value.
- Description: Caches the `version` value for reuse.

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

#### `public WpNodeSnapshot(long id, long version, long graphId, long gridId, int localX, int localY, String name)`
- Role: Creates a new WpNodeSnapshot instance.
- Description: Constructs the WpNodeSnapshot instance from the supplied inputs.