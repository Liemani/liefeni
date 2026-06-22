---
source: [MainFrame.java](../../../../src/haven/MainFrame.java)
created: 2026-06-13
updated: 2026-06-14
---

# MainFrame

Represents the main frame Haven component.

## Nested Types

### ConnectionError

- Role: Represents a startup connection failure.
- Description: Exception raised when the main frame cannot establish the client connection.

## Members

### Constants

#### `public static final Config.Variable<Boolean> initfullscreen = Config.Variable.propb("haven.fullscreen", false)`
- Role: Implements the initfullscreen operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.fullscreen", false)`

#### `public static final Config.Variable<String> renderer = Config.Variable.prop("haven.renderer", "jogl")`
- Role: Renders the er.
- Description: Renders the er.
- Value: `Config.Variable.prop("haven.renderer", "jogl")`

#### `public static final Config.Variable<Boolean> status = Config.Variable.propb("haven.status", false)`
- Role: Implements the status operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.status", false)`

#### `public static final Config.Variable<Boolean> nopreload = Config.Variable.propb("haven.nopreload", false)`
- Role: Implements the nopreload operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.nopreload", false)`

#### `public static final Config.Variable<Path> loadwaited = Config.Variable.propp("haven.loadwaited", "")`
- Role: Loads the waited.
- Description: Loads the waited.
- Value: `Config.Variable.propp("haven.loadwaited", "")`

#### `public static final Config.Variable<Path> allused = Config.Variable.propp("haven.allused", "")`
- Role: Implements the allused operation.
- Description: Implements the propp operation.
- Value: `Config.Variable.propp("haven.allused", "")`

### Fields

#### `final UIPanel p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private final ThreadGroup g`
- Role: Caches the g value.
- Description: Caches the `g` value for reuse.

#### `private Thread mt`
- Role: Caches the mt value.
- Description: Caches the `mt` value for reuse.

#### `boolean fullscreen`
- Role: Tracks the fullscreen flag.
- Description: Caches the `fullscreen` value for reuse.

#### `DisplayMode fsmode = null, prefs = null`
- Role: Caches the fsmode value.
- Description: Caches the `fsmode` value for reuse.

#### `DisplayMode fsmode = null, prefs = null`
- Role: Caches the fsmode value.
- Description: Caches the `fsmode` value for reuse.

#### `Coord prefssz = null`
- Role: Caches the prefssz value.
- Description: Caches the `prefssz` value for reuse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Implements the cmdmap operation.
- Description: Implements the private map<string, console.command> cmdmap = new tree map<string, console.command>() operation.

### Methods

#### `public static void initlocale()`
- Role: Handles the initlocale path.
- Description: Implements the initlocale operation.

#### `public static void initawt()`
- Role: Handles the initawt path.
- Description: Implements the initawt operation.

#### `DisplayMode findmode(int w, int h)`
- Role: Handles the findmode path.
- Description: Finds the mode.

#### `public void setfs()`
- Role: Handles the setfs path.
- Description: Updates the fs.

#### `public void setwnd()`
- Role: Handles the setwnd path.
- Description: Updates the wnd.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.

#### `private void seticon()`
- Role: Handles the seticon path.
- Description: Updates the icon.

#### `private UIPanel renderer()`
- Role: Handles the renderer path.
- Description: Renders the er.

#### `public MainFrame(Coord isz)`
- Role: Creates a new MainFrame instance.
- Description: Constructs the MainFrame instance from the supplied inputs.

#### `private void savewndstate()`
- Role: Handles the savewndstate path.
- Description: Saves the wndstate.

#### `public ConnectionError(String mesg)`
- Role: Handles the connection error path.
- Description: Implements the connection error operation.

#### `public static Session connect(Object[] args)`
- Role: Handles the connect path.
- Description: Implements the connect operation.

#### `private void uiloop() throws InterruptedException`
- Role: Handles the uiloop workflow.
- Description: Implements the uiloop operation.

#### `private void run(UI.Runner task)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static void setupres()`
- Role: Handles the setupres path.
- Description: Updates the upres.

#### `public static void resdump()`
- Role: Handles the resdump path.
- Description: Implements the resdump operation.

#### `private static void javabughack() throws InterruptedException`
- Role: Handles the javabughack workflow.
- Description: Implements the javabughack operation.

#### `public static void status(String state)`
- Role: Handles the status path.
- Description: Implements the status operation.

#### `private static void main2(String[] args)`
- Role: Handles the main2 path.
- Description: Implements the main2 operation.

#### `public static void main(final String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.

#### `private static void dumplist(Collection<Resource> list, Path fn)`
- Role: Handles the dumplist path.
- Description: Implements the dumplist operation.