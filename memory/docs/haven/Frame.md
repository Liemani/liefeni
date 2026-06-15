# Frame

This file documents the responsibilities and members of `Frame`.

## Meta

- Source: [Frame.java](../../../src/haven/Frame.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a framed widget or UI helper.

## Members

### Constants

### Fields

#### `public final IBox box`

- Description: TODO

### Methods

#### `public Frame(Coord sz, boolean inner, IBox box)`

- Description: TODO

#### `public Frame(Coord sz, boolean inner)`

- Description: TODO

#### `public static Frame around(Widget parent, Area area, IBox box)`

- Description: TODO

#### `public static Frame around(Widget parent, Area area)`

- Description: TODO

#### `public static Frame around(Widget parent, Iterable<? extends Widget> wl)`

- Description: TODO

#### `public static Frame around(Widget parent, Widget... ch)`

- Description: TODO

#### `public static Frame with(Widget child, boolean resize)`

- Description: TODO

#### `public Coord inner()`

- Description: TODO

#### `public Coord xlate(Coord c, boolean in)`

- Description: TODO

#### `public Position getpos(String nm)`

- Description: TODO

#### `public void drawframe(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public <T extends Widget> T addin(T child)`

- Description: TODO
