# LoadNodesByGridResult

This file documents the responsibilities and members of `LoadNodesByGridResult`.

## Meta

- Source: [LoadNodesByGridResult.java](../../../../../src/lmi/waypoint/model/LoadNodesByGridResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the result of load nodes by grid result.

## Members

### Constants

### Fields

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final Array<WpNode> nodes`
- Role: Caches nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public LoadNodesByGridResult(long gridId, Array<WpNode> nodes)`
- Role: Creates a new LoadNodesByGridResult instance.
- Description: Constructs the instance and initializes its default state.
