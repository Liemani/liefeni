# Interaction

This file documents the responsibilities and members of `Interaction`.

## Meta

- Source: [Interaction.java](../../../../src/lmi/core/Interaction.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Abstracts user interaction primitives.

## Members

### Constants

### Fields

### Methods

#### `public static void click(Coord coord, int button, int modifier)`

- Description: TODO

#### `public static void click(Gob gob, int button, int modifier, int isOverlay, int olid, int meshId)`

- Description: TODO

#### `public static void click(long gobId, int button, int modifier, int isOverlay, int olid, int meshId)`

- Description: TODO

#### `public static void click(long gobId, Coord position, int button, int modifier, int isOverlay, int olid, int meshId)`

- Description: TODO

#### `public static void place(Coord coord, int direction, int button, int modifier)`

- Description: TODO

#### `public static void take(GItem item)`

- Description: TODO

#### `public static void transfer(GItem item, int modifier)`

- Description: TODO

#### `public static void drop(Inventory wdg, Coord coord)`

- Description: TODO

#### `static void take(ISBox wdg)`

- Description: TODO

#### `static void xfer(ISBox wdg)`

- Description: TODO

#### `public static void scrollXfer(ISBox wdg, int direction, int modifier)`

- Description: TODO

#### `static void drop(haven.ISBox wdg)`

- Description: TODO

#### `static void drop(Gob gob, int modifier, int isOverlay, int olid, int meshId)`

- Description: TODO

#### `static void drop(GItem item, int modifier)`

- Description: TODO

#### `static void interact(GItem item, int modifier)`

- Description: TODO

#### `public static void activate(Button button)`

- Description: TODO

#### `static void close(Window window)`

- Description: TODO

#### `static void focus(Widget widget)`

- Description: TODO

#### `public static void select(FlowerMenu menu, int index)`

- Description: TODO

#### `public static void close(FlowerMenu wdg)`

- Description: TODO
