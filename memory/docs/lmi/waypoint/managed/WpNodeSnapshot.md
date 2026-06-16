# WpNodeSnapshot

This file documents the responsibilities and members of `WpNodeSnapshot`.

## Meta

- Source: [WpNodeSnapshot.java](../../../../../src/lmi/waypoint/managed/WpNodeSnapshot.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an immutable snapshot of a waypoint node.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final long version`
- Role: Stores the version value.
- Description: Backs the cached state for this file.

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final long gridId`
- Role: Stores the grid id value.
- Description: Backs the cached state for this file.

#### `public final int localX`
- Role: Stores the local x value.
- Description: Backs the cached state for this file.

#### `public final int localY`
- Role: Stores the local y value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

### Methods

#### `public WpNodeSnapshot(long id, long version, long graphId, long gridId, int localX, int localY, String name)`
- Role: Creates a new WpNodeSnapshot instance.
- Description: Constructs the instance and initializes its default state.
