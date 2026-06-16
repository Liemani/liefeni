# LoadPointsByCutResult

This file documents the responsibilities and members of `LoadPointsByCutResult`.

## Meta

- Source: [LoadPointsByCutResult.java](../../../../../src/lmi/waypoint/model/LoadPointsByCutResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the result of load points by cut result.

## Members

### Constants

### Fields

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final Array<WpPoint> points`
- Role: Caches points entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public LoadPointsByCutResult(long graphId, long gridId, Array<WpPoint> points)`
- Role: Creates a new LoadPointsByCutResult instance.
- Description: Constructs the instance and initializes its default state.
