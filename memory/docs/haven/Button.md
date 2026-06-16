# Button

This file documents the responsibilities and members of `Button`.

## Meta

- Source: [Button.java](../../../src/haven/Button.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the button Haven component.

## Nested Types

### $Btn

- Role: Represents $btn within Button.
- Description: Describes the nested $btn type used by the enclosing class.

### $LTBtn

- Role: Represents $ltbtn within Button.
- Description: Describes the nested $ltbtn type used by the enclosing class.

## Members

### Constants

#### `public static final BufferedImage bl = Resource.loadsimg("gfx/hud/buttons/tbtn/left")`
- Role: Defines the shared bl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage br = Resource.loadsimg("gfx/hud/buttons/tbtn/right")`
- Role: Defines the shared br constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage bt = Resource.loadsimg("gfx/hud/buttons/tbtn/top")`
- Role: Defines the shared bt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage bb = Resource.loadsimg("gfx/hud/buttons/tbtn/bottom")`
- Role: Defines the shared bb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage dt = Resource.loadsimg("gfx/hud/buttons/tbtn/dtex")`
- Role: Defines the shared dt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage ut = Resource.loadsimg("gfx/hud/buttons/tbtn/utex")`
- Role: Defines the shared ut constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage bm = Resource.loadsimg("gfx/hud/buttons/tbtn/mid")`
- Role: Defines the shared bm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`
- Role: Defines the shared hs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int hs = bl.getHeight(), hl = bm.getHeight()`
- Role: Defines the shared hs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource click = Loading.waitfor(Resource.local().load("sfx/hud/btn"))`
- Role: Defines the shared click constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Audio.Clip clbtdown = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "down")`
- Role: Defines the shared clbtdown constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Audio.Clip clbtup = Loading.waitfor(Resource.local().load("sfx/hud/lbtn")).layer(Resource.audio, "up")`
- Role: Defines the shared clbtup constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int margin = UI.scale(10)`
- Role: Defines the shared margin constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public boolean lg`
- Role: Tracks the lg flag.
- Description: Supports the lg operation used by the surrounding class.

#### `public Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public BufferedImage cont`
- Role: Stores the cont value.
- Description: Backs the cached state for this file.

#### `public Runnable action = null`
- Role: Holds the action state.
- Description: Backs the cached state for this file.

#### `static Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12f))).aa(true)`
- Role: Stores the tf value.
- Description: Backs the cached state for this file.

#### `static Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(tf, Window.ctex), UI.rscale(0.75), UI.rscale(0.75), new Color(80, 40, 0))`
- Role: Stores the nf value.
- Description: Backs the cached state for this file.

#### `private boolean a = false, dis = false`
- Role: Tracks the a flag.
- Description: Supports the a operation used by the surrounding class.

#### `private boolean a = false, dis = false`
- Role: Tracks the a flag.
- Description: Supports the a operation used by the surrounding class.

#### `private UI.Grab d = null`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static Button wrapped(int w, String text)`
- Role: Performs wrapped.
- Description: Supports the wrapped operation used by the surrounding class.

#### `private static boolean largep(int w)`
- Role: Performs largep.
- Description: Supports the largep operation used by the surrounding class.

#### `private Button(int w, boolean lg)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, String text, boolean lg, Runnable action)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, String text, boolean lg)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, String text, Runnable action)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, String text)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, Text text)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button(int w, BufferedImage cont)`
- Role: Creates a new Button instance.
- Description: Constructs the instance and initializes its default state.

#### `public Button action(Runnable action)`
- Role: Performs action.
- Description: Supports the action operation used by the surrounding class.

#### `public void draw(BufferedImage img)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void change(String text, Color col)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void change(String text)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void disable(boolean dis)`
- Role: Performs disable.
- Description: Supports the disable operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Performs gkeytype.
- Description: Supports the gkeytype operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `protected void depress()`
- Role: Performs depress.
- Description: Supports the depress operation used by the surrounding class.

#### `protected void unpress()`
- Role: Performs unpress.
- Description: Supports the unpress operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.
