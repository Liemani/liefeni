# WpSegment

This file documents the responsibilities and members of `WpSegment`.

## Meta

- Source: [WpSegment.java](../../../../../src/lmi/waypoint/object/WpSegment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a waypoint segment domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final long edgeId`
- Role: Stores the edge id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final int step`
- Role: Stores the step value.
- Description: Backs the cached state for this file.

### Methods

#### `private WpSegment(long id, long edgeId, long gridId, int step)`
- Role: Creates a new WpSegment instance.
- Description: Constructs the instance and initializes its default state.

#### `public static WpSegment of(long id, long edgeId, long gridId, int step)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static WpSegment fromRecord(WpSegmentRecord record)`
- Role: Performs from record.
- Description: Supports the from record operation used by the surrounding class.
