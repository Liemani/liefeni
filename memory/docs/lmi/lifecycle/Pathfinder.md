# Pathfinder

This file documents the responsibilities and members of `Pathfinder`.

## Meta

- Source: [Pathfinder.java](../../../../src/lmi/lifecycle/Pathfinder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts pathfinding initialization and helpers.

## Members

### Constants

### Fields

#### `private static Coord _mapOrigin`

- Description: TODO

#### `private static boolean[][] _map`

- Description: TODO

#### `private static Coord _destination`

- Description: TODO

#### `private static Coord[][] _directionMap`

- Description: TODO

#### `private static TreeMap<Integer, LinkedList<Coord>> _searchPriorityMap`

- Description: TODO

#### `private static Coord _origin`

- Description: TODO

#### `private static Coord _currentMoveCoord`

- Description: TODO

#### `private static Coord _lastMoveWorldLocation`

- Description: TODO

### Methods

#### `public static void init()`

- Description: TODO

#### `private static boolean _isBlocked(Coord coord)`

- Description: TODO

#### `private static Coord _getDirection(Coord coord)`

- Description: TODO

#### `private static void _setDirection(Coord coord, Coord direction)`

- Description: TODO

#### `private static void _addDistanceMap(Coord coord)`

- Description: TODO

#### `public static void move(Coord destination)`

- Description: TODO

#### `public static void move(Gob gob)`

- Description: TODO

#### `private static void _setMap()`

- Description: TODO

#### `private static Coord _calculateMapOrigin()`

- Description: TODO

#### `private static void _scanMap(Coord mapOrigin)`

- Description: TODO

#### `private static Array<Gob> _getObstaclArray()`

- Description: TODO

#### `private static void _findAndMove()`

- Description: TODO

#### `private static void _findPath()`

- Description: TODO

#### `private static void _reset()`

- Description: TODO

#### `private static void _search(Coord node)`

- Description: TODO

#### `private static void _printMap()`

- Description: TODO

#### `private static void _pathMove()`

- Description: TODO

#### `private static void _correct()`

- Description: TODO

#### `private static void _clear()`

- Description: TODO

#### `private static Coord _transformMapCoord(Coord coord)`

- Description: TODO
