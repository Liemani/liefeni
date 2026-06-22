---
source: [WpSegment.java](../../../../../../src/lmi/waypoint/object/WpSegment.java)
created: 2026-06-13
updated: 2026-06-14
---

# WpSegment

Represents a waypoint segment domain object.

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

#### `private WpSegment(long id, long edgeId, long gridId, int step)`
- Role: Creates a new WpSegment instance.
- Description: Constructs the WpSegment instance from the supplied inputs.

#### `public static WpSegment of(long id, long edgeId, long gridId, int step)`
- Role: Builds a WpSegment value from the supplied components.
- Description: Builds a WpSegment value from the supplied components.

#### `public static WpSegment fromRecord(WpSegmentRecord record)`
- Role: Handles the from record path.
- Description: Implements the from record operation.