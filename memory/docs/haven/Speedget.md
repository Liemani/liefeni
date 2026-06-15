# Speedget

This file documents the responsibilities and members of `Speedget`.

## Meta

- Source: [Speedget.java](../../../src/haven/Speedget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a speed control widget.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `public static final Tex imgs[][]`

- Description: TODO

#### `public static final String tips[]`

- Description: TODO

#### `public static final Coord tsz`

- Description: TODO

#### `public static final KeyBinding kb_speedup = KeyBinding.get("speed-up", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_speeddn = KeyBinding.get("speed-down", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S | KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding[] kb_speeds =`

- Description: TODO

### Fields

#### `public int cur, max`

- Description: TODO

#### `public int cur, max`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Speedget(int cur, int max)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void set(int s)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO
