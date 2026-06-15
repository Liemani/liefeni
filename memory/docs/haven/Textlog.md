# Textlog

This file documents the responsibilities and members of `Textlog`.

## Meta

- Source: [Textlog.java](../../../src/haven/Textlog.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a scrolling text log.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

### Fields

#### `static Tex texpap = Resource.loadtex("gfx/hud/texpap")`

- Description: TODO

#### `static Tex schain = Resource.loadtex("gfx/hud/schain")`

- Description: TODO

#### `static Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`

- Description: TODO

#### `static RichText.Foundry fnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(9f), TextAttribute.FOREGROUND, Color.BLACK)`

- Description: TODO

#### `List<Text> lines`

- Description: TODO

#### `int maxy, cury`

- Description: TODO

#### `int maxy, cury`

- Description: TODO

#### `int margin = UI.scale(3)`

- Description: TODO

#### `UI.Grab sdrag = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Textlog(Coord sz)`

- Description: TODO

#### `public void append(String line, Color col)`

- Description: TODO

#### `public void append(String line)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `private void update(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO
