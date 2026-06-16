# ResolvedGrid

This file documents the responsibilities and members of `ResolvedGrid`.

## Meta

- Source: [ResolvedGrid.java](../../../../../src/lmi/waypoint/runtime/ResolvedGrid.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state for resolved grid.

## Members

### Constants

### Fields

#### `public final long mapGridId`
- Role: Stores the map grid id value.
- Description: Backs the cached state for this file.

#### `public final long havenGridId`
- Role: Stores the haven grid id value.
- Description: Backs the cached state for this file.

#### `public final long mapSegmentId`
- Role: Stores the map segment id value.
- Description: Backs the cached state for this file.

#### `public final Coord originWorld`
- Role: Stores the origin world value.
- Description: Backs the cached state for this file.

### Methods

#### `public ResolvedGrid(long mapGridId, long havenGridId, long mapSegmentId, Coord originWorld)`
- Role: Creates a new ResolvedGrid instance.
- Description: Constructs the instance and initializes its default state.
