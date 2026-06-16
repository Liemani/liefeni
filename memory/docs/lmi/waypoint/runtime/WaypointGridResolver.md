# WaypointGridResolver

This file documents the responsibilities and members of `WaypointGridResolver`.

## Meta

- Source: [WaypointGridResolver.java](../../../../../src/lmi/waypoint/runtime/WaypointGridResolver.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Resolves current Haven grid metadata for waypoint operations.

## Members

### Constants

#### `private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>()`
- Role: Defines the shared resolved by haven grid id constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private WaypointGridResolver()`
- Role: Creates a new WaypointGridResolver instance.
- Description: Constructs the instance and initializes its default state.

#### `public static synchronized void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public static synchronized ResolvedGrid resolveGrid(Coord gc)`
- Role: Coordinates resolve grid persistence or lookup.
- Description: Supports the resolve grid operation used by the surrounding class.

#### `static synchronized ResolvedGrid resolvedGrid(long havenGridId)`
- Role: Coordinates resolved grid persistence or lookup.
- Description: Supports the resolved grid operation used by the surrounding class.

#### `static synchronized void putResolvedGrid(long havenGridId, ResolvedGrid grid)`
- Role: Performs put resolved grid.
- Description: Supports the put resolved grid operation used by the surrounding class.

#### `private static MapFile mapFile()`
- Role: Performs map file.
- Description: Supports the map file operation used by the surrounding class.
