---
source: [Pathfinder.java](../../../../../src/lmi/lifecycle/Pathfinder.java)
created: 2026-06-13
updated: 2026-06-20
---

# Pathfinder

Builds a local grid-based path and drives movement toward either a coordinate or a gob.

## Members

### Fields

#### `private static Coord _mapOrigin`
- Role: Stores the world coordinate used as the origin of the local pathfinding map.

#### `private static boolean[][] _map`
- Role: Marks blocked and unblocked tiles inside the local pathfinding grid.

#### `private static Coord _destination`
- Role: Stores the current target position in local pathfinding coordinates.

#### `private static Coord[][] _directionMap`
- Role: Stores reverse directions for each explored tile.

#### `private static TreeMap<Integer, LinkedList<Coord>> _searchPriorityMap`
- Role: Stores frontier tiles grouped by rectilinear distance for the search loop.

#### `private static Coord _origin`
- Role: Stores the current local player position in pathfinding coordinates.

#### `private static Coord _currentMoveCoord`
- Role: Tracks the current step position while moving.

#### `private static Coord _lastMoveWorldLocation`
- Role: Remembers the last world location visited during movement correction.

### Methods

#### `public static void init()`
- Role: Allocates the working pathfinding grids.

#### `private static boolean _isBlocked(Coord coord)`
- Role: Returns whether the tile is blocked in the working map.

#### `private static Coord _getDirection(Coord coord)`
- Role: Returns the stored reverse direction for a tile.

#### `private static void _setDirection(Coord coord, Coord direction)`
- Role: Stores the reverse direction for a tile.

#### `private static void _addDistanceMap(Coord coord)`
- Role: Adds a tile to the frontier bucket for its rectilinear distance.

#### `public static void move(Coord destination)`
- Role: Finds a path to a world coordinate and moves there.

#### `public static void move(Gob gob)`
- Role: Finds a path to a gob by trying adjacent tiles around the gob.

#### `private static void _setMap()`
- Role: Builds the local obstacle map around the current player position.

#### `private static Coord _calculateMapOrigin()`
- Role: Chooses the world-space origin for the working pathfinding grid.

#### `private static void _scanMap(Coord mapOrigin)`
- Role: Marks blocked tiles based on nearby gobs and clears the current player tile.

#### `private static Array<Gob> _getObstaclArray()`
- Role: Returns the gobs treated as obstacles, excluding plant resources.

#### `private static void _findAndMove()`
- Role: Runs path search and movement correction until a path succeeds or fails.

#### `private static void _findPath()`
- Role: Expands the search frontier until a path reaches the origin.

#### `private static void _reset()`
- Role: Clears working search state and seeds the frontier from the destination.

#### `private static void _search(Coord node)`
- Role: Expands one node into adjacent tiles.

#### `private static void _printMap()`
- Role: Prints the current pathfinding map for debugging.

#### `private static void _pathMove()`
- Role: Executes the next movement step along the discovered path.

#### `private static void _correct()`
- Role: Adjusts the movement path after a failed step.

#### `private static void _clear()`
- Role: Clears working pathfinding state after movement completes or fails.

#### `private static Coord _transformMapCoord(Coord coord)`
- Role: Converts a world coordinate into local pathfinding coordinates.

