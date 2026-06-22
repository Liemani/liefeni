---
source: [WpPointRecord.java](../../../../../../src/lmi/waypoint/db/WpPointRecord.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpPointRecord

Represents a persisted waypoint database record for wp point record.

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

#### `public WpPointRecord(long id, long segmentId, long gridId, int step, int localX, int localY, int mouseButton, Integer meshId)`
- Role: Creates a new WpPointRecord instance.
- Description: Constructs the WpPointRecord instance from the supplied inputs.