# OptWnd

This file documents the responsibilities and members of `OptWnd`.

## Meta

- Source: [OptWnd.java](../../../src/haven/OptWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the options window.

## Nested Types

### AudioPanel

- Description: TODO

### BindingPanel

- Description: TODO

### CPanel

- Description: TODO

### InterfacePanel

- Description: TODO

### PButton

- Description: TODO

### Panel

- Description: TODO

### PointBind

- Description: TODO

### SetButton

- Description: TODO

### VideoPanel

- Description: TODO

## Members

### Constants

#### `private static final Text kbtt = RichText.render("$col[255,255,0]`

- Description: TODO

#### `public static final String msg = "Bind other elements..."`

- Description: TODO

#### `public static final Resource curs = Resource.local().loadwait("gfx/hud/curs/wrench")`

- Description: TODO

### Fields

#### `public final Panel main`

- Description: TODO

#### `public Panel current`

- Description: TODO

#### `public final Panel tgt`

- Description: TODO

#### `public final int key`

- Description: TODO

#### `private final Widget back`

- Description: TODO

#### `private CPanel curcf`

- Description: TODO

#### `public GSettings prefs`

- Description: TODO

#### `public final KeyBinding cmd`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `private KeyBinding cmd`

- Description: TODO

### Methods

#### `public void chpanel(Panel p)`

- Description: TODO

#### `public void cresize(Widget ch)`

- Description: TODO

#### `public PButton(int w, String title, int key, Panel tgt)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public Panel()`

- Description: TODO

#### `private void error(String msg)`

- Description: TODO

#### `public VideoPanel(Panel prev)`

- Description: TODO

#### `public CPanel(GSettings gprefs)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void resetcf()`

- Description: TODO

#### `public AudioPanel(Panel back)`

- Description: TODO

#### `public InterfacePanel(Panel back)`

- Description: TODO

#### `private int addbtn(Widget cont, String nm, KeyBinding cmd, int y)`

- Description: TODO

#### `public BindingPanel(Panel back)`

- Description: TODO

#### `public SetButton(int w, KeyBinding cmd)`

- Description: TODO

#### `public void set(KeyMatch key)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `protected KeyMatch mkmatch(KeyEvent ev)`

- Description: TODO

#### `protected boolean handle(KeyEvent ev)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public PointBind(int w)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `private boolean handle(KeyEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean getcurs(CursorQuery ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public OptWnd(boolean gopts)`

- Description: TODO

#### `public OptWnd()`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void show()`

- Description: TODO
