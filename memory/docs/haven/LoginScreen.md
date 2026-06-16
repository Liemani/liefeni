# LoginScreen

This file documents the responsibilities and members of `LoginScreen`.

## Meta

- Source: [LoginScreen.java](../../../src/haven/LoginScreen.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the login screen Haven component.

## Nested Types

### Credbox

- Role: Represents credbox within LoginScreen.
- Description: Describes the nested credbox type used by the enclosing class.

### StatusLabel

- Role: Represents status label within LoginScreen.
- Description: Describes the nested status label type used by the enclosing class.

### Steambox

- Role: Represents steambox within LoginScreen.
- Description: Describes the nested steambox type used by the enclosing class.

### UserEntry

- Role: Represents user entry within LoginScreen.
- Description: Describes the nested user entry type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<String> authmech = Config.Variable.prop("haven.authmech", "native")`
- Role: Defines the shared authmech constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bg = Resource.loadtex("gfx/loginscr")`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Position bgc = new Position(UI.scale(420, 300))`
- Role: Defines the shared bgc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_savtoken = KeyBinding.get("login/savtoken", KeyMatch.forchar('R', KeyMatch.M))`
- Role: Defines the shared kb savtoken constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_deltoken = KeyBinding.get("login/deltoken", KeyMatch.forchar('F', KeyMatch.M))`
- Role: Defines the shared kb deltoken constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `textf = new Text.Foundry(Text.sans, 16).aa(true),`
- Role: Holds the foundry state.
- Description: Backs the cached state for this file.

#### `textfs = new Text.Foundry(Text.sans, 14).aa(true)`
- Role: Holds the foundry state.
- Description: Backs the cached state for this file.

#### `public final Widget login`
- Role: Stores the login value.
- Description: Backs the cached state for this file.

#### `public final String confname`
- Role: Stores the confname value.
- Description: Backs the cached state for this file.

#### `private Text error, progress`
- Role: Stores the progress value.
- Description: Backs the cached state for this file.

#### `private Text error, progress`
- Role: Stores the progress value.
- Description: Backs the cached state for this file.

#### `private Button optbtn`
- Role: Holds the optbtn state.
- Description: Backs the cached state for this file.

#### `private OptWnd opts`
- Role: Holds the opts state.
- Description: Backs the cached state for this file.

#### `public final UserEntry user`
- Role: Holds the user state.
- Description: Backs the cached state for this file.

#### `private final TextEntry pass`
- Role: Stores the pass value.
- Description: Backs the cached state for this file.

#### `private final CheckBox savetoken`
- Role: Holds the savetoken state.
- Description: Backs the cached state for this file.

#### `private final Button fbtn`
- Role: Holds the fbtn state.
- Description: Backs the cached state for this file.

#### `private final IButton exec`
- Role: Holds the exec state.
- Description: Backs the cached state for this file.

#### `private final Widget pwbox, tkbox`
- Role: Stores the tkbox value.
- Description: Backs the cached state for this file.

#### `private final Widget pwbox, tkbox`
- Role: Stores the tkbox value.
- Description: Backs the cached state for this file.

#### `private byte[] token = null`
- Role: Stores the token value.
- Description: Backs the cached state for this file.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `private final List<String> history = new ArrayList<>()`
- Role: Caches history entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int hpos = -1`
- Role: Stores the hpos value.
- Description: Backs the cached state for this file.

#### `private String hcurrent`
- Role: Stores the hcurrent value.
- Description: Backs the cached state for this file.

#### `private static boolean steam_autologin = true`
- Role: Tracks the steam autologin flag.
- Description: Supports the steam autologin operation used by the surrounding class.

#### `public final HttpStatus stat`
- Role: Holds the stat state.
- Description: Backs the cached state for this file.

#### `public final double ax`
- Role: Stores the ax value.
- Description: Backs the cached state for this file.

#### `private Text[] lines = new Text[2]`
- Role: Stores the lines value.
- Description: Backs the cached state for this file.

### Methods

#### `private String getpref(String name, String def)`
- Role: Performs getpref.
- Description: Supports the getpref operation used by the surrounding class.

#### `public LoginScreen(String confname)`
- Role: Creates a new LoginScreen instance.
- Description: Constructs the instance and initializes its default state.

#### `private UserEntry(int w)`
- Role: Performs user entry.
- Description: Supports the user entry operation used by the surrounding class.

#### `protected void changed()`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void settext2(String text)`
- Role: Performs settext2.
- Description: Supports the settext2 operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void init(String name)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private Credbox()`
- Role: Performs credbox.
- Description: Supports the credbox operation used by the surrounding class.

#### `private void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private void checktoken()`
- Role: Performs checktoken.
- Description: Supports the checktoken operation used by the surrounding class.

#### `private void forget()`
- Role: Performs forget.
- Description: Supports the forget operation used by the surrounding class.

#### `private void enter()`
- Role: Enters the current lifecycle state.
- Description: Enters the current lifecycle state and updates lifecycle state accordingly.

#### `private AuthClient.Credentials creds()`
- Role: Performs creds.
- Description: Supports the creds operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `private Steambox()`
- Role: Performs steambox.
- Description: Supports the steambox operation used by the surrounding class.

#### `private AuthClient.Credentials creds() throws java.io.IOException`
- Role: Handles the creds workflow.
- Description: Supports the creds operation used by the surrounding class.

#### `private void enter()`
- Role: Enters the current lifecycle state.
- Description: Enters the current lifecycle state and updates lifecycle state accordingly.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public StatusLabel(URI svc, double ax)`
- Role: Performs status label.
- Description: Supports the status label operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private void mklogin()`
- Role: Performs mklogin.
- Description: Supports the mklogin operation used by the surrounding class.

#### `private void error(String error)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `private void progress(String p)`
- Role: Performs progress.
- Description: Supports the progress operation used by the surrounding class.

#### `private void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void cdestroy(Widget ch)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.
