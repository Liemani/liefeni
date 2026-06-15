# Scrollbar

This file documents the responsibilities and members of `Scrollbar`.

## Meta

- Source: [Scrollbar.java](../../../src/haven/Scrollbar.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a scrollbar widget.

## Members

### Constants

#### `public static final Tex schain = Resource.loadtex("gfx/hud/schain")`

- Description: TODO

#### `public static final Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`

- Description: TODO

#### `public static final int chcut = UI.scale(7)`

- Description: TODO

#### `public static final int width = sflarp.sz().x`

- Description: TODO

### Fields

#### `public Scrollable ctl`

- Description: TODO

#### `public int val, min, max`

- Description: TODO

#### `public int val, min, max`

- Description: TODO

#### `public int val, min, max`

- Description: TODO

#### `private UI.Grab drag = null`

- Description: TODO

#### `private double acc = 0.5`

- Description: TODO

### Methods

#### `public Scrollbar(int h, int min, int max)`

- Description: TODO

#### `public Scrollbar(int h, Scrollable ctl)`

- Description: TODO

#### `public boolean vis()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void update(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void changed()`

- Description: TODO

#### `public void ch(int a)`

- Description: TODO

#### `public void ch(double a)`

- Description: TODO

#### `public void resize(int h)`

- Description: TODO

#### `public void move(Coord c)`

- Description: TODO
