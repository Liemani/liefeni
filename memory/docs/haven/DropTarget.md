# DropTarget

This file documents the responsibilities and members of `DropTarget`.

## Meta

- Source: [DropTarget.java](../../../src/haven/DropTarget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a UI drop target.

## Members

### Constants

### Fields

#### `public final Object thing`

- Description: TODO

#### `public final Hover root`

- Description: TODO

#### `public boolean hovering`

- Description: TODO

#### `public DropTarget tgt`

- Description: TODO

### Methods

#### `public default boolean dropthing(Coord cc, Object thing)`

- Description: TODO

#### `public default boolean drophover(Coord cc, boolean hovering, Object thing)`

- Description: TODO

#### `public default boolean dropthing(Drop ev)`

- Description: TODO

#### `public default boolean drophover(Hover ev)`

- Description: TODO

#### `public DropEvent(Coord c, Object thing)`

- Description: TODO

#### `public DropEvent(DropEvent from, Coord c)`

- Description: TODO

#### `public Drop(Coord c, Object thing)`

- Description: TODO

#### `public Drop(Drop from, Coord c)`

- Description: TODO

#### `public Drop derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public Hover(Coord c, Object thing)`

- Description: TODO

#### `public Hover(Hover from, Coord c)`

- Description: TODO

#### `public Hover derive(Coord c)`

- Description: TODO

#### `public Hover hovering(boolean h)`

- Description: TODO

#### `public boolean accept(DropTarget tgt)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public static boolean dropthing(Widget wdg, Coord c, Object thing)`

- Description: TODO

#### `public static boolean drophover(Widget wdg, Coord c, Object thing)`

- Description: TODO
