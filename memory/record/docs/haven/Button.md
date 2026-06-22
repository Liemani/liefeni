---
source: [Button.java](../../../../src/haven/Button.java)
created: 2026-06-13
updated: 2026-06-14
---

# Button

Represents the button Haven component.

## Nested Types

### $Btn

- Role: Registers the `btn` widget factory.
- Description: Creates a standard text button from the widget resource system.

### $LTBtn

- Role: Registers the left-text button factory.
- Description: Creates a left-aligned text button from the widget resource system.

## Members

### Constants

#### `public static final BufferedImage bl = Resource.loadsimg("gfx/hud/buttons/tbtn/left")`
- Role: Implements the bl operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/left")`

#### `public static final BufferedImage br = Resource.loadsimg("gfx/hud/buttons/tbtn/right")`
- Role: Implements the br operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/right")`

#### `public static final BufferedImage bt = Resource.loadsimg("gfx/hud/buttons/tbtn/top")`
- Role: Implements the bt operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/top")`

#### `public static final BufferedImage bb = Resource.loadsimg("gfx/hud/buttons/tbtn/bottom")`
- Role: Implements the bb operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/bottom")`

#### `public static final BufferedImage dt = Resource.loadsimg("gfx/hud/buttons/tbtn/dtex")`
- Role: Implements the dt operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/dtex")`

#### `public static final BufferedImage ut = Resource.loadsimg("gfx/hud/buttons/tbtn/utex")`
- Role: Implements the ut operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/utex")`

#### `public static final BufferedImage bm = Resource.loadsimg("gfx/hud/buttons/tbtn/mid")`
- Role: Implements the bm operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/buttons/tbtn/mid")`

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`
- Role: Implements the hs operation.
- Description: Implements the get height operation.
- Value: `bl.getHeight(), hl = bm.getHeight()`

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`
- Role: Implements the hs operation.
- Description: Implements the get height operation.
- Value: `bl.getHeight(), hl = bm.getHeight()`

#### `public static final Resource click = Loading.waitfor(Resource.local().load("sfx/hud/btn"))`
- Role: Handles click input for this widget.
- Description: Handles click input for this widget.
- Value: `Loading.waitfor(Resource.local().load("sfx/hud/btn"))`

#### `public static final Audio.Clip clbtdown = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "down")`
- Role: Implements the clbtdown operation.
- Description: Implements the layer operation.
- Value: `Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "down")`

#### `public static final Audio.Clip clbtup = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "up")`
- Role: Implements the clbtup operation.
- Description: Implements the layer operation.
- Value: `Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "up")`

#### `public static final int margin = UI.scale(10)`
- Role: Implements the margin operation.
- Description: Implements the scale operation.
- Value: `UI.scale(10)`

### Fields

#### `public boolean lg`
- Role: Tracks the lg flag.
- Description: Caches the `lg` value for reuse.

#### `public Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public BufferedImage cont`
- Role: Caches the cont value.
- Description: Caches the `cont` value for reuse.

#### `public Runnable action = null`
- Role: Caches the action value.
- Description: Caches the `action` value for reuse.

#### `static Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12f))).aa(true)`
- Role: Implements the tf operation.
- Description: Implements the aa operation.

#### `static Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(tf, Window.ctex), UI.rscale(0.75), UI.rscale(0.75), new Color(80, 40, 0))`
- Role: Implements the nf operation.
- Description: Implements the color operation.

#### `private boolean a = false, dis = false`
- Role: Tracks the a flag.
- Description: Caches the `a` value for reuse.

#### `private boolean a = false, dis = false`
- Role: Tracks the a flag.
- Description: Caches the `a` value for reuse.

#### `private UI.Grab d = null`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static Button wrapped(int w, String text)`
- Role: Handles the wrapped path.
- Description: Implements the wrapped operation.

#### `private static boolean largep(int w)`
- Role: Handles the largep path.
- Description: Implements the largep operation.

#### `private Button(int w, boolean lg)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, String text, boolean lg, Runnable action)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, String text, boolean lg)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, String text, Runnable action)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, String text)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, Text text)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button(int w, BufferedImage cont)`
- Role: Creates a new Button instance.
- Description: Constructs the Button instance from the supplied inputs.

#### `public Button action(Runnable action)`
- Role: Handles the action path.
- Description: Implements the action operation.

#### `public void draw(BufferedImage img)`
- Role: Draws the current content.
- Description: Draws the Button content.

#### `public void change(String text, Color col)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void change(String text)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void disable(boolean dis)`
- Role: Handles the disable path.
- Description: Implements the disable operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Handles the gkeytype path.
- Description: Implements the gkeytype operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `protected void depress()`
- Role: Handles the depress path.
- Description: Implements the depress operation.

#### `protected void unpress()`
- Role: Handles the unpress path.
- Description: Implements the unpress operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.