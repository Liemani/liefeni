# ResolvedPoint

This file documents the responsibilities and members of `ResolvedPoint`.

## Meta

- Source: [ResolvedPoint.java](../../../../../src/lmi/waypoint/runtime/ResolvedPoint.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state for resolved point.

## Members

### Constants

### Fields

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

#### `public final Coord world`
- Role: Stores the world value.
- Description: Backs the cached state for this file.

### Methods

#### `public ResolvedPoint(long segmentId, long gridId, int step, int localX, int localY,`
- Role: Creates a new ResolvedPoint instance.
- Description: Constructs the instance and initializes its default state.
