# WaypointGridResolver

This file documents the responsibilities and members of `WaypointGridResolver`.

## Meta

- Source: [WaypointGridResolver.java](../../../../../src/lmi/waypoint/runtime/WaypointGridResolver.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Resolves a Haven grid into waypoint runtime grid data.
Keeps the resolved grid cache keyed by Haven grid id.

## Members

### Constants

#### `private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>()`

- Description: TODO

### Fields

### Methods

#### `private WaypointGridResolver()`

- Description: TODO

#### `public static synchronized void clear()`

- Description: TODO

#### `public static synchronized ResolvedGrid resolveGrid(Coord gc)`

- Description: TODO

#### `static synchronized ResolvedGrid resolvedGrid(long havenGridId)`

- Description: TODO

#### `static synchronized void putResolvedGrid(long havenGridId, ResolvedGrid grid)`

- Description: TODO

#### `private static MapFile mapFile()`

- Description: TODO
