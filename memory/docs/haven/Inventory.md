# Inventory

This file documents the responsibilities and members of `Inventory`.

## Meta

- Source: [Inventory.java](../../../src/haven/Inventory.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays inventory UI.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `public static final Coord sqsz = UI.scale(new Coord(32, 32)).add(1, 1)`

- Description: TODO

#### `public static final Tex invsq`

- Description: TODO

### Fields

#### `public boolean dropul = true`

- Description: TODO

#### `public Coord isz`

- Description: TODO

#### `public boolean[] sqmask = null`

- Description: TODO

#### `Map<GItem, WItem> wmap = new HashMap<GItem, WItem>()`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Inventory(Coord sz)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
