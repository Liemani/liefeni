# TextEntry

This file documents the responsibilities and members of `TextEntry`.

## Meta

- Source: [TextEntry.java](../../../src/haven/TextEntry.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a text entry widget.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`

- Description: TODO

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`

- Description: TODO

#### `public static final Color selcol = new Color(24, 80, 192)`

- Description: TODO

#### `public static final Text.Foundry fnd = new Text.Foundry(Text.serif, 12).aa(true)`

- Description: TODO

#### `public static final Tex lcap = Resource.loadtex("gfx/hud/text/l")`

- Description: TODO

#### `public static final Tex rcap = Resource.loadtex("gfx/hud/text/r")`

- Description: TODO

#### `public static final Tex mext = Resource.loadtex("gfx/hud/text/m")`

- Description: TODO

#### `public static final Tex caret = Resource.loadtex("gfx/hud/text/caret")`

- Description: TODO

#### `public static final int toffx = lcap.sz().x`

- Description: TODO

#### `public static final Coord coff = UI.scale(new Coord(-2, 0))`

- Description: TODO

#### `public static final int wmarg = lcap.sz().x + rcap.sz().x + UI.scale(1)`

- Description: TODO

### Fields

#### `public boolean dshow = false`

- Description: TODO

#### `public ReadLine buf`

- Description: TODO

#### `public int sx`

- Description: TODO

#### `public boolean pw = false`

- Description: TODO

#### `private boolean dirty = false`

- Description: TODO

#### `private double focusstart`

- Description: TODO

#### `private Text.Line tcache = null`

- Description: TODO

#### `private UI.Grab d = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public void settext(String text)`

- Description: TODO

#### `public void rsettext(String text)`

- Description: TODO

#### `public void commit()`

- Description: TODO

#### `public void uimsg(String name, Object... args)`

- Description: TODO

#### `protected String dtext()`

- Description: TODO

#### `protected void redraw()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public TextEntry(int w, String deftext)`

- Description: TODO

#### `protected void changed()`

- Description: TODO

#### `public void activate(String text)`

- Description: TODO

#### `public void done(ReadLine buf)`

- Description: TODO

#### `public void changed(ReadLine buf)`

- Description: TODO

#### `public boolean gkeytype(GlobKeyEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent e)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void gotfocus()`

- Description: TODO

#### `public void resize(int w)`

- Description: TODO

#### `public String text()`

- Description: TODO
