---
source: [Api.java](../../../../../src/lmi/bridge/Api.java)
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
- Role: Handles the pathfind move path.
- Description: Starts pathfinding toward the target gob.

#### `public static void pathfindMove(Coord coord)`
- Role: Handles the pathfind move path.
- Description: Starts pathfinding toward the target map coordinate.

#### `public static Gob pathfindMove(Array<Gob> gobArray)`
- Role: Handles the pathfind move path.
- Description: Picks a movement target from the supplied gob list.

#### `public static void pathfindTakeItemFromStockpileArray(Array<Gob> stockpileArray, int count)`
- Role: Handles the pathfind take item from stockpile array path.
- Description: Chooses a stockpile target and begins item retrieval.

#### `public static void pathfindTakeItemFromContainerArray(Array<Gob> containerArray, String[] nameSet, int count)`
- Role: Handles the pathfind take item from container array path.
- Description: Chooses a container target and begins item retrieval.

#### `public static int pathfindTakeItemFromStockpile(Gob stockpile, int count)`
- Role: Handles the pathfind take item from stockpile path.
- Description: Pathfinds to a stockpile and takes the requested item count.

#### `public static int pathfindTakeItemFromContainer(Gob container, String[] nameSet, int count)`
- Role: Handles the pathfind take item from container path.
- Description: Pathfinds to a container and takes matching items.

#### `public static int takeItemFromStockpile(Gob stockpile, int count)`
- Role: Handles the take item from stockpile path.
- Description: Pulls items directly from a stockpile without pathfinding.

#### `public static int takeItemFromContainer(Gob container, String[] genericArray, int count)`
- Role: Handles the take item from container path.
- Description: Pulls items directly from a container without pathfinding.

#### `static void planObject(String planName)`
- Role: Handles the plan object path.
- Description: Opens the build planner for the requested object name.

#### `public static Window planAndDecideObject(String planName, Coord location, int direction)`
- Role: Handles the plan and decide object path.
- Description: Opens the planner and applies the chosen placement decision.

#### `public static void decidePlan(Coord location, int direction)`
- Role: Handles the decide plan path.
- Description: Confirms a planned placement at the requested location.

#### `public static void build(String planName, Coord location, int direction)`
- Role: Handles the build path.
- Description: Sends the build action for the chosen plan.

#### `public static Window openGobWindow(Gob gob)`
- Role: Opens the gob window.
- Description: Opens the gob interaction window for the supplied gob.

#### `public static int takeItemFromIsbox(ISBox isbox, int count)`
- Role: Handles the take item from isbox path.
- Description: Pulls items directly from an ISBox widget.

#### `public static void moveNorth()`
- Role: Handles the move north path.
- Description: Sends the northward movement command.

#### `public static void moveEast()`
- Role: Handles the move east path.
- Description: Sends the eastward movement command.

#### `public static void moveWest()`
- Role: Handles the move west path.
- Description: Sends the westward movement command.

#### `public static void moveSouth()`
- Role: Handles the move south path.
- Description: Sends the southward movement command.

#### `public static void moveCenter()`
- Role: Handles the move center path.
- Description: Sends the command to move back to the center point.

#### `public static Gob closestGobIn(Array<Gob> gobArray)`
- Role: Handles the closest gob in path.
- Description: Picks the nearest gob from the supplied list.

#### `public static Gob getGob()`
- Role: Returns the gob.
- Description: Returns the gob.

#### `public static Rect getArea()`
- Role: Returns the area.
- Description: Returns the area.

#### `public static void error(String message)`
- Role: Displays an error message.
- Description: Shows an error dialog or console message to the user.

#### `public static void alert(String message)`
- Role: Handles the alert path.
- Description: Shows a warning-style alert to the user.

#### `public static void message(String message)`
- Role: Handles the message path.
- Description: Shows an informational message to the user.

#### `public static void pressButton()`
- Role: Handles the press button path.
- Description: Presses the current UI button or action trigger.

#### `public static Inventory inventory()`
- Role: Handles the inventory path.
- Description: Returns the active inventory widget.

#### `public static void transferItem(Array<GItem> itemArray)`
- Role: Handles the transfer item path.
- Description: Transfers the supplied items through the current inventory UI.