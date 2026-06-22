---
source: [LoginScreen.java](../../../../src/haven/LoginScreen.java)
created: 2026-06-13
updated: 2026-06-14
---

# LoginScreen

Represents the login screen Haven component.

## Nested Types

### Credbox

- Role: Holds the credential entry controls.
- Description: Displays the username and password fields used during login.

### StatusLabel

- Role: Displays login status text.
- Description: Renders connection and authentication progress messages.

### Steambox

- Role: Holds the Steam login controls.
- Description: Exposes the Steam-specific login flow and token handling controls.

### UserEntry

- Role: Stores the selected login user entry.
- Description: Keeps the entered username together with token and save-state controls.

## Members

### Constants

#### `public static final Config.Variable<String> authmech = Config.Variable.prop("haven.authmech", "native")`
- Role: Implements the authmech operation.
- Description: Implements the prop operation.
- Value: `Config.Variable.prop("haven.authmech", "native")`

#### `public static final Tex bg = Resource.loadtex("gfx/loginscr")`
- Role: Implements the bg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/loginscr")`

#### `public static final Position bgc = new Position(UI.scale(420, 300))`
- Role: Implements the bgc operation.
- Description: Implements the scale operation.
- Value: `new Position(UI.scale(420, 300))`

#### `public static final KeyBinding kb_savtoken = KeyBinding.get("login/savtoken", KeyMatch.forchar('R', KeyMatch.M))`
- Role: Implements the kb savtoken operation.
- Description: Implements the forchar operation.
- Value: `KeyBinding.get("login/savtoken", KeyMatch.forchar('R', KeyMatch.M))`

#### `public static final KeyBinding kb_deltoken = KeyBinding.get("login/deltoken", KeyMatch.forchar('F', KeyMatch.M))`
- Role: Implements the kb deltoken operation.
- Description: Implements the forchar operation.
- Value: `KeyBinding.get("login/deltoken", KeyMatch.forchar('F', KeyMatch.M))`

### Fields

#### `textf = new Text.Foundry(Text.sans, 16).aa(true),`
- Role: Implements the textf operation.
- Description: Implements the aa operation.

#### `textfs = new Text.Foundry(Text.sans, 14).aa(true)`
- Role: Implements the textfs operation.
- Description: Implements the aa operation.

#### `public final Widget login`
- Role: Caches the login value.
- Description: Caches the `login` value for reuse.

#### `public final String confname`
- Role: Caches the confname value.
- Description: Caches the `confname` value for reuse.

#### `private Text error, progress`
- Role: Caches the progress value.
- Description: Caches the `progress` value for reuse.

#### `private Text error, progress`
- Role: Caches the progress value.
- Description: Caches the `progress` value for reuse.

#### `private Button optbtn`
- Role: Caches the optbtn value.
- Description: Caches the `optbtn` value for reuse.

#### `private OptWnd opts`
- Role: Caches the opts value.
- Description: Caches the `opts` value for reuse.

#### `public final UserEntry user`
- Role: Caches the user value.
- Description: Caches the `user` value for reuse.

#### `private final TextEntry pass`
- Role: Caches the pass value.
- Description: Caches the `pass` value for reuse.

#### `private final CheckBox savetoken`
- Role: Caches the savetoken value.
- Description: Caches the `savetoken` value for reuse.

#### `private final Button fbtn`
- Role: Caches the fbtn value.
- Description: Caches the `fbtn` value for reuse.

#### `private final IButton exec`
- Role: Caches the exec value.
- Description: Caches the `exec` value for reuse.

#### `private final Widget pwbox, tkbox`
- Role: Caches the tkbox value.
- Description: Caches the `tkbox` value for reuse.

#### `private final Widget pwbox, tkbox`
- Role: Caches the tkbox value.
- Description: Caches the `tkbox` value for reuse.

#### `private byte[] token = null`
- Role: Caches the token value.
- Description: Caches the `token` value for reuse.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Caches the `inited` value for reuse.

#### `private final List<String> history = new ArrayList<>()`
- Role: Implements the history operation.
- Description: Implements the private final list<string> history = new array list<>() operation.

#### `private int hpos = -1`
- Role: Caches the hpos value.
- Description: Caches the `hpos` value for reuse.

#### `private String hcurrent`
- Role: Caches the hcurrent value.
- Description: Caches the `hcurrent` value for reuse.

#### `private static boolean steam_autologin = true`
- Role: Tracks the steam autologin flag.
- Description: Caches the `steam_autologin` value for reuse.

#### `public final HttpStatus stat`
- Role: Caches the stat value.
- Description: Caches the `stat` value for reuse.

#### `public final double ax`
- Role: Caches the ax value.
- Description: Caches the `ax` value for reuse.

#### `private Text[] lines = new Text[2]`
- Role: Caches the lines value.
- Description: Caches the `lines` value for reuse.

### Methods

#### `private String getpref(String name, String def)`
- Role: Handles the getpref path.
- Description: Returns the pref.

#### `public LoginScreen(String confname)`
- Role: Creates a new LoginScreen instance.
- Description: Constructs the LoginScreen instance from the supplied inputs.

#### `private UserEntry(int w)`
- Role: Handles the user entry path.
- Description: Implements the user entry operation.

#### `protected void changed()`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void settext2(String text)`
- Role: Handles the settext2 path.
- Description: Updates the text2.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public void init(String name)`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `private Credbox()`
- Role: Handles the credbox path.
- Description: Implements the credbox operation.

#### `private void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `private void checktoken()`
- Role: Handles the checktoken path.
- Description: Implements the checktoken operation.

#### `private void forget()`
- Role: Handles the forget path.
- Description: Implements the forget operation.

#### `private void enter()`
- Role: Enters the current lifecycle state.
- Description: Enters the current lifecycle state and updates lifecycle state accordingly.

#### `private AuthClient.Credentials creds()`
- Role: Handles the creds path.
- Description: Implements the creds operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public void show()`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `private Steambox()`
- Role: Handles the steambox path.
- Description: Implements the steambox operation.

#### `private AuthClient.Credentials creds() throws java.io.IOException`
- Role: Handles the creds workflow.
- Description: Implements the creds operation.

#### `private void enter()`
- Role: Enters the current lifecycle state.
- Description: Enters the current lifecycle state and updates lifecycle state accordingly.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public StatusLabel(URI svc, double ax)`
- Role: Handles the status label path.
- Description: Implements the status label operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the LoginScreen content.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `private void mklogin()`
- Role: Handles the mklogin path.
- Description: Implements the mklogin operation.

#### `private void error(String error)`
- Role: Displays an error message.
- Description: Implements the error operation.

#### `private void progress(String p)`
- Role: Handles the progress path.
- Description: Implements the progress operation.

#### `private void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public void cdestroy(Widget ch)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void presize()`
- Role: Handles the presize path.
- Description: Implements the presize operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the LoginScreen content.