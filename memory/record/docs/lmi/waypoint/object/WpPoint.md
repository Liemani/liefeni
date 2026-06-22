---
source: [WpPoint.java](../../../../../../src/lmi/waypoint/object/WpPoint.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpPoint

Represents a waypoint point domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final long segmentId`
- Role: Caches the segment id value.
- Description: Caches the `segmentId` value for reuse.

#### `public final long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `public final int step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final int localX`
- Role: Caches the local x value.
- Description: Caches the `localX` value for reuse.

#### `public final int localY`
- Role: Caches the local y value.
- Description: Caches the `localY` value for reuse.

#### `public final int mouseButton`
- Role: Caches the mouse button value.
- Description: Caches the `mouseButton` value for reuse.

#### `public final Integer meshId`
- Role: Caches the mesh id value.
- Description: Caches the `meshId` value for reuse.

### Methods

#### `private WpPoint(long id, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Creates a new WpPoint instance.
- Description: Constructs the WpPoint instance from the supplied inputs.

#### `public static WpPoint of(long id, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Handles the of workflow.
- Description: Builds a WpPoint value from the supplied components.

#### `public static WpPoint fromRecord(WpPointRecord record)`
- Role: Handles the from record path.
- Description: Implements the from record operation.