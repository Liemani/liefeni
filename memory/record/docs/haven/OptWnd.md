---
source: [OptWnd.java](../../../../src/haven/OptWnd.java)
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
- Role: Implements the kbtt operation.
- Description: Renders the current state into an image or image-like object.
- Value: `RichText.render("$col[255,255,0]`

#### `public static final String msg = "Bind other elements..."`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.
- Value: `"Bind other elements..."`

#### `public static final Resource curs = Resource.local().loadwait("gfx/hud/curs/wrench")`
- Role: Implements the curs operation.
- Description: Implements the loadwait operation.
- Value: `Resource.local().loadwait("gfx/hud/curs/wrench")`

### Fields

#### `public final Panel main`
- Role: Caches the main value.
- Description: Caches the `main` value for reuse.

#### `public Panel current`
- Role: Tracks the current .
- Description: Tracks the current .

#### `public final Panel tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public final int key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `private final Widget back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private CPanel curcf`
- Role: Caches the curcf value.
- Description: Caches the `curcf` value for reuse.

#### `public GSettings prefs`
- Role: Caches the prefs value.
- Description: Caches the `prefs` value for reuse.

#### `public final KeyBinding cmd`
- Role: Caches the cmd value.
- Description: Caches the `cmd` value for reuse.

#### `private UI.Grab mg, kg`
- Role: Caches the kg value.
- Description: Caches the `kg` value for reuse.

#### `private UI.Grab mg, kg`
- Role: Caches the kg value.
- Description: Caches the `kg` value for reuse.

#### `private KeyBinding cmd`
- Role: Caches the cmd value.
- Description: Caches the `cmd` value for reuse.

### Methods

#### `public void chpanel(Panel p)`
- Role: Handles the chpanel path.
- Description: Implements the chpanel operation.

#### `public void cresize(Widget ch)`
- Role: Handles the cresize path.
- Description: Implements the cresize operation.

#### `public PButton(int w, String title, int key, Panel tgt)`
- Role: Handles the pbutton path.
- Description: Implements the p button operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public Panel()`
- Role: Handles the panel path.
- Description: Implements the panel operation.

#### `private void error(String msg)`
- Role: Displays an error message.
- Description: Implements the error operation.

#### `public VideoPanel(Panel prev)`
- Role: Handles the video panel path.
- Description: Implements the video panel operation.

#### `public CPanel(GSettings gprefs)`
- Role: Handles the cpanel path.
- Description: Implements the c panel operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the OptWnd content.

#### `private void resetcf()`
- Role: Handles the resetcf path.
- Description: Resets the cf.

#### `public AudioPanel(Panel back)`
- Role: Handles the audio panel path.
- Description: Implements the audio panel operation.

#### `public InterfacePanel(Panel back)`
- Role: Handles the interface panel path.
- Description: Implements the interface panel operation.

#### `private int addbtn(Widget cont, String nm, KeyBinding cmd, int y)`
- Role: Handles the addbtn path.
- Description: Adds the btn.

#### `public BindingPanel(Panel back)`
- Role: Handles the binding panel path.
- Description: Implements the binding panel operation.

#### `public SetButton(int w, KeyBinding cmd)`
- Role: Handles the set button path.
- Description: Implements the set button operation.

#### `public void set(KeyMatch key)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the OptWnd content.

#### `protected KeyMatch mkmatch(KeyEvent ev)`
- Role: Handles the mkmatch path.
- Description: Implements the mkmatch operation.

#### `protected boolean handle(KeyEvent ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public PointBind(int w)`
- Role: Handles the point bind path.
- Description: Implements the point bind operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `private boolean handle(KeyEvent ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Returns the curs.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public OptWnd(boolean gopts)`
- Role: Creates a new OptWnd instance.
- Description: Constructs the OptWnd instance from the supplied inputs.

#### `public OptWnd()`
- Role: Creates a new OptWnd instance.
- Description: Constructs the OptWnd instance from the supplied inputs.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public void show()`
- Role: Handles the show path.
- Description: Implements the show operation.