# WaypointScene

This file documents the responsibilities and members of `WaypointScene`.

## Meta

- Source: [WaypointScene.java](../../../../../src/lmi/waypoint/runtime/WaypointScene.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the current waypoint scene state.

## Members

### Constants

### Fields

#### `public final WaypointGridBounds bounds`
- Role: Stores the bounds value.
- Description: Backs the cached state for this file.

#### `public final Array<ResolvedLine> drawableLines = new Array<>()`
- Role: Caches drawable lines entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Array<ResolvedNode> drawableNodes = new Array<>()`
- Role: Caches drawable nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Array<ResolvedNode> hiddenNodes = new Array<>()`
- Role: Caches hidden nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Array<ResolvedPoint> drawablePoints = new Array<>()`
- Role: Caches drawable points entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Array<ResolvedPoint> hiddenPoints = new Array<>()`
- Role: Caches hidden points entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public WaypointScene(WaypointGridBounds bounds)`
- Role: Creates a new WaypointScene instance.
- Description: Constructs the instance and initializes its default state.
