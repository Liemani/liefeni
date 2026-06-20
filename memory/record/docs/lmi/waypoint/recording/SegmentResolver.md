---
source: [SegmentResolver.java](../../../../../src/lmi/waypoint/recording/SegmentResolver.java)
created: 2026-06-13
updated: 2026-06-14
---

# SegmentResolver

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
