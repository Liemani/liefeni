# DTarget

This file documents the responsibilities and members of `DTarget`.

## Meta

- Source: [DTarget.java](../../../src/haven/DTarget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the dtarget Haven component.

## Members

### Constants

### Fields

#### `public final ItemDrag src`
- Role: Holds the src state.
- Description: Backs the cached state for this file.

#### `public final ItemEvent root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `public boolean handled`
- Role: Tracks the handled flag.
- Description: Supports the handled operation used by the surrounding class.

### Methods

#### `public default boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public default boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public default boolean drop(Drop ev)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public default boolean iteminteract(Interact ev)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public ItemEvent(Coord c, ItemDrag src)`
- Role: Performs item event.
- Description: Supports the item event operation used by the surrounding class.

#### `public ItemEvent(ItemEvent from, Coord c)`
- Role: Performs item event.
- Description: Supports the item event operation used by the surrounding class.

#### `public Drop(Coord c, ItemDrag src)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public Drop(Drop from, Coord c)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public Drop derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public Interact(Coord c, ItemDrag src)`
- Role: Performs interact.
- Description: Supports the interact operation used by the surrounding class.

#### `public Interact(Interact from, Coord c)`
- Role: Performs interact.
- Description: Supports the interact operation used by the surrounding class.

#### `public Interact derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.
