# WpSegmentRecord

This file documents the responsibilities and members of `WpSegmentRecord`.

## Meta

- Source: [WpSegmentRecord.java](../../../../../src/lmi/waypoint/db/WpSegmentRecord.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a persisted waypoint database record for wp segment record.

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

#### `public WpSegmentRecord(long id, long edgeId, long gridId, int step)`
- Role: Creates a new WpSegmentRecord instance.
- Description: Constructs the instance and initializes its default state.
