# Api

This file documents the responsibilities and members of `Api`.

## Meta

- Source: [Api.java](../../../../src/lmi/bridge/Api.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Exposes narrow game-facing helper methods.

## Members

### Constants

### Fields

### Methods

#### `public static void pathfindMove(Gob gob)`

- Description: TODO

#### `public static void pathfindMove(Coord coord)`

- Description: TODO

#### `public static Gob pathfindMove(Array<Gob> gobArray)`

- Description: TODO

#### `public static void pathfindTakeItemFromStockpileArray(Array<Gob> stockpileArray, int count)`

- Description: TODO

#### `public static void pathfindTakeItemFromContainerArray(Array<Gob> containerArray, String[] nameSet, int count)`

- Description: TODO

#### `public static int pathfindTakeItemFromStockpile(Gob stockpile, int count)`

- Description: TODO

#### `public static int pathfindTakeItemFromContainer(Gob container, String[] nameSet, int count)`

- Description: TODO

#### `public static int takeItemFromStockpile(Gob stockpile, int count)`

- Description: TODO

#### `public static int takeItemFromContainer(Gob container, String[] genericArray, int count)`

- Description: TODO

#### `static void planObject(String planName)`

- Description: TODO

#### `public static Window planAndDecideObject(String planName, Coord location, int direction)`

- Description: TODO

#### `public static void decidePlan(Coord location, int direction)`

- Description: TODO

#### `public static void build(String planName, Coord location, int direction)`

- Description: TODO

#### `public static Window openGobWindow(Gob gob)`

- Description: TODO

#### `public static int takeItemFromIsbox(ISBox isbox, int count)`

- Description: TODO

#### `public static void moveNorth()`

- Description: TODO

#### `public static void moveEast()`

- Description: TODO

#### `public static void moveWest()`

- Description: TODO

#### `public static void moveSouth()`

- Description: TODO

#### `public static void moveCenter()`

- Description: TODO

#### `public static Gob closestGobIn(Array<Gob> gobArray)`

- Description: TODO

#### `public static Gob getGob()`

- Description: TODO

#### `public static Rect getArea()`

- Description: TODO

#### `public static void error(String message)`

- Description: TODO

#### `public static void alert(String message)`

- Description: TODO

#### `public static void message(String message)`

- Description: TODO

#### `public static void pressButton()`

- Description: TODO

#### `public static Inventory inventory()`

- Description: TODO

#### `public static void transferItem(Array<GItem> itemArray)`

- Description: TODO
