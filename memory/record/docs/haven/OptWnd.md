---
source: [OptWnd.java](../../../src/haven/OptWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# OptWnd

Represents the opt wnd Haven component.

## Nested Types

### AudioPanel

- Role: Represents audio panel within OptWnd.
- Description: Describes the nested audio panel type used by the enclosing class.

### BindingPanel

- Role: Represents binding panel within OptWnd.
- Description: Describes the nested binding panel type used by the enclosing class.

### CPanel

- Role: Represents cpanel within OptWnd.
- Description: Describes the nested cpanel type used by the enclosing class.

### InterfacePanel

- Role: Represents interface panel within OptWnd.
- Description: Describes the nested interface panel type used by the enclosing class.

### PButton

- Role: Represents pbutton within OptWnd.
- Description: Describes the nested pbutton type used by the enclosing class.

### Panel

- Role: Represents panel within OptWnd.
- Description: Describes the nested panel type used by the enclosing class.

### PointBind

- Role: Represents point bind within OptWnd.
- Description: Describes the nested point bind type used by the enclosing class.

### SetButton

- Role: Represents set button within OptWnd.
- Description: Describes the nested set button type used by the enclosing class.

### VideoPanel

- Role: Represents video panel within OptWnd.
- Description: Describes the nested video panel type used by the enclosing class.

## Members

### Constants

#### `private static final Text kbtt = RichText.render("$col[255,255,0]`
- Role: Defines the shared kbtt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String msg = "Bind other elements..."`
- Role: Defines the shared msg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource curs = Resource.local().loadwait("gfx/hud/curs/wrench")`
- Role: Defines the shared curs constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Panel main`
- Role: Holds the main state.
- Description: Backs the cached state for this file.

#### `public Panel current`
- Role: Holds the current state.
- Description: Backs the cached state for this file.

#### `public final Panel tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

#### `public final int key`
- Role: Stores the key value.
- Description: Backs the cached state for this file.

#### `private final Widget back`
- Role: Stores the back value.
- Description: Backs the cached state for this file.

#### `private CPanel curcf`
- Role: Holds the curcf state.
- Description: Backs the cached state for this file.

#### `public GSettings prefs`
- Role: Holds the prefs state.
- Description: Backs the cached state for this file.

#### `public final KeyBinding cmd`
- Role: Holds the cmd state.
- Description: Backs the cached state for this file.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `private KeyBinding cmd`
- Role: Holds the cmd state.
- Description: Backs the cached state for this file.

### Methods

#### `public void chpanel(Panel p)`
- Role: Performs chpanel.
- Description: Supports the chpanel operation used by the surrounding class.

#### `public void cresize(Widget ch)`
- Role: Performs cresize.
- Description: Supports the cresize operation used by the surrounding class.

#### `public PButton(int w, String title, int key, Panel tgt)`
- Role: Performs pbutton.
- Description: Supports the pbutton operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public Panel()`
- Role: Performs panel.
- Description: Supports the panel operation used by the surrounding class.

#### `private void error(String msg)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `public VideoPanel(Panel prev)`
- Role: Performs video panel.
- Description: Supports the video panel operation used by the surrounding class.

#### `public CPanel(GSettings gprefs)`
- Role: Performs cpanel.
- Description: Supports the cpanel operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void resetcf()`
- Role: Performs resetcf.
- Description: Supports the resetcf operation used by the surrounding class.

#### `public AudioPanel(Panel back)`
- Role: Performs audio panel.
- Description: Supports the audio panel operation used by the surrounding class.

#### `public InterfacePanel(Panel back)`
- Role: Performs interface panel.
- Description: Supports the interface panel operation used by the surrounding class.

#### `private int addbtn(Widget cont, String nm, KeyBinding cmd, int y)`
- Role: Performs addbtn.
- Description: Supports the addbtn operation used by the surrounding class.

#### `public BindingPanel(Panel back)`
- Role: Performs binding panel.
- Description: Supports the binding panel operation used by the surrounding class.

#### `public SetButton(int w, KeyBinding cmd)`
- Role: Performs set button.
- Description: Supports the set button operation used by the surrounding class.

#### `public void set(KeyMatch key)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `protected KeyMatch mkmatch(KeyEvent ev)`
- Role: Performs mkmatch.
- Description: Supports the mkmatch operation used by the surrounding class.

#### `protected boolean handle(KeyEvent ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public PointBind(int w)`
- Role: Performs point bind.
- Description: Supports the point bind operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `private boolean handle(KeyEvent ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public OptWnd(boolean gopts)`
- Role: Creates a new OptWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public OptWnd()`
- Role: Creates a new OptWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.
