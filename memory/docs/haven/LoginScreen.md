# LoginScreen

This file documents the responsibilities and members of `LoginScreen`.

## Meta

- Source: [LoginScreen.java](../../../src/haven/LoginScreen.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the login screen.

## Nested Types

### Credbox

- Description: TODO

### StatusLabel

- Description: TODO

### Steambox

- Description: TODO

### UserEntry

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<String> authmech = Config.Variable.prop("haven.authmech", "native")`

- Description: TODO

#### `public static final Tex bg = Resource.loadtex("gfx/loginscr")`

- Description: TODO

#### `public static final Position bgc = new Position(UI.scale(420, 300))`

- Description: TODO

#### `public static final KeyBinding kb_savtoken = KeyBinding.get("login/savtoken", KeyMatch.forchar('R', KeyMatch.M))`

- Description: TODO

#### `public static final KeyBinding kb_deltoken = KeyBinding.get("login/deltoken", KeyMatch.forchar('F', KeyMatch.M))`

- Description: TODO

### Fields

#### `textf = new Text.Foundry(Text.sans, 16).aa(true),`

- Description: TODO

#### `textfs = new Text.Foundry(Text.sans, 14).aa(true)`

- Description: TODO

#### `public final Widget login`

- Description: TODO

#### `public final String confname`

- Description: TODO

#### `private Text error, progress`

- Description: TODO

#### `private Text error, progress`

- Description: TODO

#### `private Button optbtn`

- Description: TODO

#### `private OptWnd opts`

- Description: TODO

#### `public final UserEntry user`

- Description: TODO

#### `private final TextEntry pass`

- Description: TODO

#### `private final CheckBox savetoken`

- Description: TODO

#### `private final Button fbtn`

- Description: TODO

#### `private final IButton exec`

- Description: TODO

#### `private final Widget pwbox, tkbox`

- Description: TODO

#### `private final Widget pwbox, tkbox`

- Description: TODO

#### `private byte[] token = null`

- Description: TODO

#### `private boolean inited = false`

- Description: TODO

#### `private final List<String> history = new ArrayList<>()`

- Description: TODO

#### `private int hpos = -1`

- Description: TODO

#### `private String hcurrent`

- Description: TODO

#### `private static boolean steam_autologin = true`

- Description: TODO

#### `public final HttpStatus stat`

- Description: TODO

#### `public final double ax`

- Description: TODO

#### `private Text[] lines = new Text[2]`

- Description: TODO

### Methods

#### `private String getpref(String name, String def)`

- Description: TODO

#### `public LoginScreen(String confname)`

- Description: TODO

#### `private UserEntry(int w)`

- Description: TODO

#### `protected void changed()`

- Description: TODO

#### `public void settext2(String text)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public void init(String name)`

- Description: TODO

#### `private Credbox()`

- Description: TODO

#### `private void init()`

- Description: TODO

#### `private void checktoken()`

- Description: TODO

#### `private void forget()`

- Description: TODO

#### `private void enter()`

- Description: TODO

#### `private AuthClient.Credentials creds()`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public void show()`

- Description: TODO

#### `private Steambox()`

- Description: TODO

#### `private AuthClient.Credentials creds() throws java.io.IOException`

- Description: TODO

#### `private void enter()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public StatusLabel(URI svc, double ax)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `private void mklogin()`

- Description: TODO

#### `private void error(String error)`

- Description: TODO

#### `private void progress(String p)`

- Description: TODO

#### `private void clear()`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void cdestroy(Widget ch)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO
