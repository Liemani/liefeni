# DTarget

This file documents the responsibilities and members of `DTarget`.

## Meta

- Source: [DTarget.java](../../../src/haven/DTarget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a drop target contract.

## Members

### Constants

### Fields

#### `public final ItemDrag src`

- Description: TODO

#### `public final ItemEvent root`

- Description: TODO

#### `public boolean handled`

- Description: TODO

### Methods

#### `public default boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public default boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public default boolean drop(Drop ev)`

- Description: TODO

#### `public default boolean iteminteract(Interact ev)`

- Description: TODO

#### `public ItemEvent(Coord c, ItemDrag src)`

- Description: TODO

#### `public ItemEvent(ItemEvent from, Coord c)`

- Description: TODO

#### `public Drop(Coord c, ItemDrag src)`

- Description: TODO

#### `public Drop(Drop from, Coord c)`

- Description: TODO

#### `public Drop derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public Interact(Coord c, ItemDrag src)`

- Description: TODO

#### `public Interact(Interact from, Coord c)`

- Description: TODO

#### `public Interact derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO
