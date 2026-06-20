---
source: [Api.java](../../../../src/lmi/bridge/Api.java)
created: 2026-06-13
updated: 2026-06-14
---

# Api

Exposes a small Haven-side API surface for LMI bridge calls.

## Members

### Constants

### Fields

### Methods

#### `public static void pathfindMove(Gob gob)`
- Role: Performs pathfind move.
- Description: Supports the pathfind move operation used by the surrounding class.

#### `public static void pathfindMove(Coord coord)`
- Role: Performs pathfind move.
- Description: Supports the pathfind move operation used by the surrounding class.

#### `public static Gob pathfindMove(Array<Gob> gobArray)`
- Role: Performs pathfind move.
- Description: Supports the pathfind move operation used by the surrounding class.

#### `public static void pathfindTakeItemFromStockpileArray(Array<Gob> stockpileArray, int count)`
- Role: Performs pathfind take item from stockpile array.
- Description: Supports the pathfind take item from stockpile array operation used by the surrounding class.

#### `public static void pathfindTakeItemFromContainerArray(Array<Gob> containerArray, String[] nameSet, int count)`
- Role: Performs pathfind take item from container array.
- Description: Supports the pathfind take item from container array operation used by the surrounding class.

#### `public static int pathfindTakeItemFromStockpile(Gob stockpile, int count)`
- Role: Performs pathfind take item from stockpile.
- Description: Supports the pathfind take item from stockpile operation used by the surrounding class.

#### `public static int pathfindTakeItemFromContainer(Gob container, String[] nameSet, int count)`
- Role: Performs pathfind take item from container.
- Description: Supports the pathfind take item from container operation used by the surrounding class.

#### `public static int takeItemFromStockpile(Gob stockpile, int count)`
- Role: Performs take item from stockpile.
- Description: Supports the take item from stockpile operation used by the surrounding class.

#### `public static int takeItemFromContainer(Gob container, String[] genericArray, int count)`
- Role: Performs take item from container.
- Description: Supports the take item from container operation used by the surrounding class.

#### `static void planObject(String planName)`
- Role: Performs plan object.
- Description: Supports the plan object operation used by the surrounding class.

#### `public static Window planAndDecideObject(String planName, Coord location, int direction)`
- Role: Performs plan and decide object.
- Description: Supports the plan and decide object operation used by the surrounding class.

#### `public static void decidePlan(Coord location, int direction)`
- Role: Performs decide plan.
- Description: Supports the decide plan operation used by the surrounding class.

#### `public static void build(String planName, Coord location, int direction)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public static Window openGobWindow(Gob gob)`
- Role: Opens the gob window.
- Description: Supports the open gob window operation used by the surrounding class.

#### `public static int takeItemFromIsbox(ISBox isbox, int count)`
- Role: Performs take item from isbox.
- Description: Supports the take item from isbox operation used by the surrounding class.

#### `public static void moveNorth()`
- Role: Performs move north.
- Description: Supports the move north operation used by the surrounding class.

#### `public static void moveEast()`
- Role: Performs move east.
- Description: Supports the move east operation used by the surrounding class.

#### `public static void moveWest()`
- Role: Performs move west.
- Description: Supports the move west operation used by the surrounding class.

#### `public static void moveSouth()`
- Role: Performs move south.
- Description: Supports the move south operation used by the surrounding class.

#### `public static void moveCenter()`
- Role: Performs move center.
- Description: Supports the move center operation used by the surrounding class.

#### `public static Gob closestGobIn(Array<Gob> gobArray)`
- Role: Performs closest gob in.
- Description: Supports the closest gob in operation used by the surrounding class.

#### `public static Gob getGob()`
- Role: Returns the gob.
- Description: Exposes the requested value without mutating state.

#### `public static Rect getArea()`
- Role: Returns the area.
- Description: Exposes the requested value without mutating state.

#### `public static void error(String message)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `public static void alert(String message)`
- Role: Performs alert.
- Description: Supports the alert operation used by the surrounding class.

#### `public static void message(String message)`
- Role: Performs message.
- Description: Supports the message operation used by the surrounding class.

#### `public static void pressButton()`
- Role: Performs press button.
- Description: Supports the press button operation used by the surrounding class.

#### `public static Inventory inventory()`
- Role: Performs inventory.
- Description: Supports the inventory operation used by the surrounding class.

#### `public static void transferItem(Array<GItem> itemArray)`
- Role: Performs transfer item.
- Description: Supports the transfer item operation used by the surrounding class.
