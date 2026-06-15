# Button

This file documents the responsibilities and members of `Button`.

## Meta

- Source: [Button.java](../../../src/haven/Button.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a clickable button widget.

## Nested Types

### $Btn

- Description: TODO

### $LTBtn

- Description: TODO

## Members

### Constants

#### `public static final BufferedImage bl = Resource.loadsimg("gfx/hud/buttons/tbtn/left")`

- Description: TODO

#### `public static final BufferedImage br = Resource.loadsimg("gfx/hud/buttons/tbtn/right")`

- Description: TODO

#### `public static final BufferedImage bt = Resource.loadsimg("gfx/hud/buttons/tbtn/top")`

- Description: TODO

#### `public static final BufferedImage bb = Resource.loadsimg("gfx/hud/buttons/tbtn/bottom")`

- Description: TODO

#### `public static final BufferedImage dt = Resource.loadsimg("gfx/hud/buttons/tbtn/dtex")`

- Description: TODO

#### `public static final BufferedImage ut = Resource.loadsimg("gfx/hud/buttons/tbtn/utex")`

- Description: TODO

#### `public static final BufferedImage bm = Resource.loadsimg("gfx/hud/buttons/tbtn/mid")`

- Description: TODO

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`

- Description: TODO

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`

- Description: TODO

#### `public static final Resource click = Loading.waitfor(Resource.local().load("sfx/hud/btn"))`

- Description: TODO

#### `public static final Audio.Clip clbtdown = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "down")`

- Description: TODO

#### `public static final Audio.Clip clbtup = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "up")`

- Description: TODO

#### `public static final int margin = UI.scale(10)`

- Description: TODO

### Fields

#### `public boolean lg`

- Description: TODO

#### `public Text text`

- Description: TODO

#### `public BufferedImage cont`

- Description: TODO

#### `public Runnable action = null`

- Description: TODO

#### `static Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12f))).aa(true)`

- Description: TODO

#### `static Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(tf, Window.ctex), UI.rscale(0.75), UI.rscale(0.75), new Color(80, 40, 0))`

- Description: TODO

#### `private boolean a = false, dis = false`

- Description: TODO

#### `private boolean a = false, dis = false`

- Description: TODO

#### `private UI.Grab d = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public static Button wrapped(int w, String text)`

- Description: TODO

#### `private static boolean largep(int w)`

- Description: TODO

#### `private Button(int w, boolean lg)`

- Description: TODO

#### `public Button(int w, String text, boolean lg, Runnable action)`

- Description: TODO

#### `public Button(int w, String text, boolean lg)`

- Description: TODO

#### `public Button(int w, String text, Runnable action)`

- Description: TODO

#### `public Button(int w, String text)`

- Description: TODO

#### `public Button(int w, Text text)`

- Description: TODO

#### `public Button(int w, BufferedImage cont)`

- Description: TODO

#### `public Button action(Runnable action)`

- Description: TODO

#### `public void draw(BufferedImage img)`

- Description: TODO

#### `public void change(String text, Color col)`

- Description: TODO

#### `public void change(String text)`

- Description: TODO

#### `public void disable(boolean dis)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `public boolean gkeytype(GlobKeyEvent ev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `protected void depress()`

- Description: TODO

#### `protected void unpress()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO
