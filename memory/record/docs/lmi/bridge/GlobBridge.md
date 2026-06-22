---
source: [GlobBridge.java](../../../../../src/lmi/bridge/GlobBridge.java)
created: 2026-06-20
updated: 2026-06-20
---

# GlobBridge

Stores the current Haven `Glob` reference and provides grid lookup helpers based on world or grid coordinates.

## Members

### Fields

#### `private static Glob glob`
- Role: Stores the current Glob reference.
- Description: Holds the active Haven world state so LMI code can resolve map and grid lookups.

### Methods

#### `private GlobBridge()`
- Role: Prevents instantiation.
- Description: This class is a static holder only.

#### `public static void setGlob(Glob val)`
- Role: Stores the current Glob reference.
- Description: Called when Haven creates a new `Glob`.

#### `public static void clear()`
- Role: Clears the stored Glob reference.
- Description: Called when the world is torn down or the bridge is reset.

#### `public static Glob glob()`
- Role: Returns the current Glob reference.
- Description: Lets bridge and waypoint code access the active Haven world state.

#### `public static MCache.Grid gridAtGc(Coord gc)`
- Role: Returns the grid at a Haven grid coordinate.
- Description: Looks up the current `MCache.Grid` from the active `Glob`, returning `null` when no world or grid is available.

#### `public static MCache.Grid gridAtWorld(Coord2d world)`
- Role: Returns the grid containing a world coordinate.
- Description: Converts the world coordinate to grid coordinates and delegates to `gridAtGc(Coord)`.