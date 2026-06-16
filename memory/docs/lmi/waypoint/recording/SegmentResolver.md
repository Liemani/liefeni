# SegmentResolver

This file documents the responsibilities and members of `SegmentResolver`.

## Meta

- Source: [SegmentResolver.java](../../../../../src/lmi/waypoint/recording/SegmentResolver.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Resolves waypoint recording segments from runtime input.

## Members

### Constants

### Fields

### Methods

#### `private SegmentResolver()`
- Role: Creates a new SegmentResolver instance.
- Description: Constructs the instance and initializes its default state.

#### `static SegmentResolution resolve(Connection conn, RecordingSegment segment) throws SQLException`
- Role: Coordinates resolve persistence or lookup.
- Description: Supports the resolve operation used by the surrounding class.
