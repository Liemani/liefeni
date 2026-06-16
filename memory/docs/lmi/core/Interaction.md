# Interaction

This file documents the responsibilities and members of `Interaction`.

## Meta

- Source: [Interaction.java](../../../../src/lmi/core/Interaction.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a narrow LMI interaction entry point.

## Members

### Constants

### Fields

### Methods

#### `public static void click(Coord coord, int button, int modifier)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public static void click(Gob gob, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public static void click(long gobId, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public static void click(long gobId, Coord position, int button, int modifier, int isOverlay, int olid, int meshId)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public static void place(Coord coord, int direction, int button, int modifier)`
- Role: Performs place.
- Description: Supports the place operation used by the surrounding class.

#### `public static void take(GItem item)`
- Role: Performs take.
- Description: Supports the take operation used by the surrounding class.

#### `public static void transfer(GItem item, int modifier)`
- Role: Performs transfer.
- Description: Supports the transfer operation used by the surrounding class.

#### `public static void drop(Inventory wdg, Coord coord)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `static void take(ISBox wdg)`
- Role: Performs take.
- Description: Supports the take operation used by the surrounding class.

#### `static void xfer(ISBox wdg)`
- Role: Performs xfer.
- Description: Supports the xfer operation used by the surrounding class.

#### `public static void scrollXfer(ISBox wdg, int direction, int modifier)`
- Role: Performs scroll xfer.
- Description: Supports the scroll xfer operation used by the surrounding class.

#### `static void drop(haven.ISBox wdg)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `static void drop(Gob gob, int modifier, int isOverlay, int olid, int meshId)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `static void drop(GItem item, int modifier)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `static void interact(GItem item, int modifier)`
- Role: Performs interact.
- Description: Supports the interact operation used by the surrounding class.

#### `public static void activate(Button button)`
- Role: Performs activate.
- Description: Supports the activate operation used by the surrounding class.

#### `static void close(Window window)`
- Role: Performs close.
- Description: Supports the close operation used by the surrounding class.

#### `static void focus(Widget widget)`
- Role: Performs focus.
- Description: Supports the focus operation used by the surrounding class.

#### `public static void select(FlowerMenu menu, int index)`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public static void close(FlowerMenu wdg)`
- Role: Performs close.
- Description: Supports the close operation used by the surrounding class.
