# Pathfinder

This file documents the responsibilities and members of `Pathfinder`.

## Meta

- Source: [Pathfinder.java](../../../../src/lmi/lifecycle/Pathfinder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates pathfinding requests across the current world state.

## Members

### Constants

### Fields

#### `private static Coord _mapOrigin`
- Role: Stores the map origin value.
- Description: Backs the cached state for this file.

#### `private static boolean[][] _map`
- Role: Tracks the map flag.
- Description: Supports the map operation used by the surrounding class.

#### `private static Coord _destination`
- Role: Stores the destination value.
- Description: Backs the cached state for this file.

#### `private static Coord[][] _directionMap`
- Role: Stores the direction map value.
- Description: Backs the cached state for this file.

#### `private static TreeMap<Integer, LinkedList<Coord>> _searchPriorityMap`
- Role: Caches search priority map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static Coord _origin`
- Role: Stores the origin value.
- Description: Backs the cached state for this file.

#### `private static Coord _currentMoveCoord`
- Role: Stores the current move coord value.
- Description: Backs the cached state for this file.

#### `private static Coord _lastMoveWorldLocation`
- Role: Stores the last move world location value.
- Description: Backs the cached state for this file.

### Methods

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private static boolean _isBlocked(Coord coord)`
- Role: Performs  is blocked.
- Description: Supports the is blocked operation used by the surrounding class.

#### `private static Coord _getDirection(Coord coord)`
- Role: Performs  get direction.
- Description: Supports the get direction operation used by the surrounding class.

#### `private static void _setDirection(Coord coord, Coord direction)`
- Role: Performs  set direction.
- Description: Supports the set direction operation used by the surrounding class.

#### `private static void _addDistanceMap(Coord coord)`
- Role: Performs  add distance map.
- Description: Supports the add distance map operation used by the surrounding class.

#### `public static void move(Coord destination)`
- Role: Performs move.
- Description: Supports the move operation used by the surrounding class.

#### `public static void move(Gob gob)`
- Role: Performs move.
- Description: Supports the move operation used by the surrounding class.

#### `private static void _setMap()`
- Role: Performs  set map.
- Description: Supports the set map operation used by the surrounding class.

#### `private static Coord _calculateMapOrigin()`
- Role: Performs  calculate map origin.
- Description: Supports the calculate map origin operation used by the surrounding class.

#### `private static void _scanMap(Coord mapOrigin)`
- Role: Performs  scan map.
- Description: Supports the scan map operation used by the surrounding class.

#### `private static Array<Gob> _getObstaclArray()`
- Role: Performs  get obstacl array.
- Description: Supports the get obstacl array operation used by the surrounding class.

#### `private static void _findAndMove()`
- Role: Performs  find and move.
- Description: Supports the find and move operation used by the surrounding class.

#### `private static void _findPath()`
- Role: Performs  find path.
- Description: Supports the find path operation used by the surrounding class.

#### `private static void _reset()`
- Role: Performs  reset.
- Description: Supports the reset operation used by the surrounding class.

#### `private static void _search(Coord node)`
- Role: Performs  search.
- Description: Supports the search operation used by the surrounding class.

#### `private static void _printMap()`
- Role: Performs  print map.
- Description: Supports the print map operation used by the surrounding class.

#### `private static void _pathMove()`
- Role: Performs  path move.
- Description: Supports the path move operation used by the surrounding class.

#### `private static void _correct()`
- Role: Performs  correct.
- Description: Supports the correct operation used by the surrounding class.

#### `private static void _clear()`
- Role: Performs  clear.
- Description: Supports the clear operation used by the surrounding class.

#### `private static Coord _transformMapCoord(Coord coord)`
- Role: Performs  transform map coord.
- Description: Supports the transform map coord operation used by the surrounding class.
