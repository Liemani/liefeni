---
source: [WpPoint.java](../../../../../src/lmi/waypoint/object/WpPoint.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpPoint

Represents a waypoint point domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final long segmentId`
- Role: Stores the segment id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final int step`
- Role: Stores the step value.
- Description: Backs the cached state for this file.

#### `public final int localX`
- Role: Stores the local x value.
- Description: Backs the cached state for this file.

#### `public final int localY`
- Role: Stores the local y value.
- Description: Backs the cached state for this file.

#### `public final int mouseButton`
- Role: Stores the mouse button value.
- Description: Backs the cached state for this file.

#### `public final Integer meshId`
- Role: Stores the mesh id value.
- Description: Backs the cached state for this file.

### Methods

#### `private WpPoint(long id, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Creates a new WpPoint instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WpPoint of(long id, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Handles the of workflow.
- Description: Supports the of operation used by the surrounding class.

#### `public static WpPoint fromRecord(WpPointRecord record)`
- Role: Performs from record.
- Description: Supports the from record operation used by the surrounding class.
