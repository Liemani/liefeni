# ResolvedLine

This file documents the responsibilities and members of `ResolvedLine`.

## Meta

- Source: [ResolvedLine.java](../../../../../src/lmi/waypoint/runtime/ResolvedLine.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state for resolved line.

## Members

### Constants

### Fields

#### `public final Coord fromWorld`
- Role: Stores the from world value.
- Description: Backs the cached state for this file.

#### `public final Coord toWorld`
- Role: Stores the to world value.
- Description: Backs the cached state for this file.

### Methods

#### `public ResolvedLine(Coord fromWorld, Coord toWorld)`
- Role: Creates a new ResolvedLine instance.
- Description: Constructs the instance and initializes its default state.
