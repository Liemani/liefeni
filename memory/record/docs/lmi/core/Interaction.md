---
source: [Interaction.java](../../../../../src/lmi/core/Interaction.java)
created: 2026-06-13
updated: 2026-06-14
---

# Interaction

Represents a narrow LMI interaction entry point.

## Members

### Constants

### Fields

### Methods

#### `public static void click(Coord coord, int button, int modifier)`
- Role: Sends a map-space click at the given coordinate.
- Description: Converts the coordinate into the current click pipeline.

#### `public static void click(Gob gob, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Sends a gob-targeted click.
- Description: Resolves the gob target before delegating to the click pipeline.

#### `public static void click(long gobId, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Sends a gob-id-targeted click.
- Description: Resolves the gob id before delegating to the click pipeline.

#### `public static void click(long gobId, Coord position, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Sends a click using both gob id and map position.
- Description: Uses the supplied position when building the interaction payload.

#### `public static void place(Coord coord, int direction, int button, int modifier)`
- Role: Sends a placement click at the requested coordinate.
- Description: Includes direction and modifier state in the click payload.

#### `public static void take(GItem item)`
- Role: Begins taking the requested inventory item.
- Description: Wraps the item's standard pick-up interaction.

#### `public static void transfer(GItem item, int modifier)`
- Role: Transfers the requested item using the supplied modifier.
- Description: Wraps the item-transfer click path.

#### `public static void drop(Inventory wdg, Coord coord)`
- Role: Drops the active item into the requested inventory slot.
- Description: Uses the inventory widget and slot coordinate.

#### `static void take(ISBox wdg)`
- Role: Handles the take path.
- Description: Implements the take operation.

#### `static void xfer(ISBox wdg)`
- Role: Handles the xfer path.
- Description: Implements the xfer operation.

#### `public static void scrollXfer(ISBox wdg, int direction, int modifier)`
- Role: Handles the scroll xfer path.
- Description: Implements the scroll xfer operation.

#### `static void drop(haven.ISBox wdg)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `static void drop(Gob gob, int modifier, int isOverlay, int olid, int meshId)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `static void drop(GItem item, int modifier)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `static void interact(GItem item, int modifier)`
- Role: Handles the interact path.
- Description: Implements the interact operation.

#### `public static void activate(Button button)`
- Role: Handles the activate path.
- Description: Implements the activate operation.

#### `static void close(Window window)`
- Role: Closes the current stream or resource.
- Description: Closes the current stream or resource.

#### `static void focus(Widget widget)`
- Role: Handles the focus path.
- Description: Implements the focus operation.

#### `public static void select(FlowerMenu menu, int index)`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public static void close(FlowerMenu wdg)`
- Role: Closes the current stream or resource.
- Description: Closes the current stream or resource.