# ISBox

This file documents the responsibilities and members of `ISBox`.

## Meta

- Source: [ISBox.java](../../../src/haven/ISBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an icon/text box widget.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `public static final Color bgcol = new Color(43, 51, 44, 127)`

- Description: TODO

#### `public static final IBox box = new IBox.Scaled("gfx/hud/bosq", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`

- Description: TODO

#### `public static final Coord defsz = UI.scale(145, 42)`

- Description: TODO

#### `public static final Text.Foundry lf = new Text.Foundry(Text.fraktur, 22, Color.WHITE).aa(true)`

- Description: TODO

### Fields

#### `private final Indir<Resource> res`

- Description: TODO

#### `private Text label`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private void setlabel(int rem, int av, int bi)`

- Description: TODO

#### `public ISBox(Indir<Resource> res, int rem, int av, int bi)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public String text()`

- Description: TODO

#### `public int count()`

- Description: TODO

#### `public int capacity()`

- Description: TODO

#### `public void transfer()`

- Description: TODO
