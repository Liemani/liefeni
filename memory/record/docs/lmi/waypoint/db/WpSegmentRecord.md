---
source: [WpSegmentRecord.java](../../../../../../src/lmi/waypoint/db/WpSegmentRecord.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpSegmentRecord

Represents a persisted waypoint database record for wp segment record.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final long edgeId`
- Role: Caches the edge id value.
- Description: Caches the `edgeId` value for reuse.

#### `public final long gridId`
- Role: Caches the grid id value.
- Description: Caches the `gridId` value for reuse.

#### `public final int step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

### Methods

#### `public WpSegmentRecord(long id, long edgeId, long gridId, int step)`
- Role: Creates a new WpSegmentRecord instance.
- Description: Constructs the WpSegmentRecord instance from the supplied inputs.