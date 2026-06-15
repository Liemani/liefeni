# SDropBox

This file documents the responsibilities and members of `SDropBox`.

## Meta

- Source: [SDropBox.java](../../../src/haven/SDropBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a styled drop box widget.

## Nested Types

### Item

- Description: TODO

### SDropList

- Description: TODO

## Members

### Constants

#### `public static final Tex dropimg = Resource.loadtex("gfx/hud/drop")`

- Description: TODO

### Fields

#### `public final int listh,itemh`

- Description: TODO

#### `public final int listh,itemh`

- Description: TODO

#### `protected final ACheckBox drop`

- Description: TODO

#### `private SDropList dl`

- Description: TODO

#### `private W curitem`

- Description: TODO

#### `private UI.Grab grab = null`

- Description: TODO

### Methods

#### `protected SDropList()`

- Description: TODO

#### `private Item(I item, W child)`

- Description: TODO

#### `protected List<? extends I> items()`

- Description: TODO

#### `protected Widget makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public void add()`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void change(I item)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawslot(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `protected boolean unselect(int btn)`

- Description: TODO

#### `public SDropBox(int w, int listh, int itemh)`

- Description: TODO

#### `protected ACheckBox makedrop()`

- Description: TODO

#### `public void change(I item)`

- Description: TODO

#### `public void drop(boolean st)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void ldrawbg(GOut g, Area area)`

- Description: TODO

#### `protected void ldrawbg(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `protected void ldrawsel(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `protected void ldrawslot(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public static <I> SDropBox<I, Widget> of(int w, int listh, int itemh, List<? extends I> items, BiFunction<? super I, ? super Coord, ? extends Widget> render, Consumer<? super I> change)`

- Description: TODO
