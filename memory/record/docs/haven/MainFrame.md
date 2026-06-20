---
source: [MainFrame.java](../../../src/haven/MainFrame.java)
created: 2026-06-13
updated: 2026-06-14
---

# MainFrame

Represents the main frame Haven component.

## Nested Types

### ConnectionError

- Role: Represents connection error within MainFrame.
- Description: Describes the nested connection error type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<Boolean> initfullscreen = Config.Variable.propb("haven.fullscreen", false)`
- Role: Defines the shared initfullscreen constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<String> renderer = Config.Variable.prop("haven.renderer", "jogl")`
- Role: Defines the shared renderer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Boolean> status = Config.Variable.propb("haven.status", false)`
- Role: Defines the shared status constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Boolean> nopreload = Config.Variable.propb("haven.nopreload", false)`
- Role: Defines the shared nopreload constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Path> loadwaited = Config.Variable.propp("haven.loadwaited", "")`
- Role: Defines the shared loadwaited constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Path> allused = Config.Variable.propp("haven.allused", "")`
- Role: Defines the shared allused constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `final UIPanel p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private final ThreadGroup g`
- Role: Holds the g state.
- Description: Backs the cached state for this file.

#### `private Thread mt`
- Role: Holds the mt state.
- Description: Backs the cached state for this file.

#### `boolean fullscreen`
- Role: Tracks the fullscreen flag.
- Description: Supports the fullscreen operation used by the surrounding class.

#### `DisplayMode fsmode = null, prefs = null`
- Role: Holds the fsmode state.
- Description: Backs the cached state for this file.

#### `DisplayMode fsmode = null, prefs = null`
- Role: Holds the fsmode state.
- Description: Backs the cached state for this file.

#### `Coord prefssz = null`
- Role: Stores the prefssz value.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public static void initlocale()`
- Role: Performs initlocale.
- Description: Supports the initlocale operation used by the surrounding class.

#### `public static void initawt()`
- Role: Performs initawt.
- Description: Supports the initawt operation used by the surrounding class.

#### `DisplayMode findmode(int w, int h)`
- Role: Performs findmode.
- Description: Supports the findmode operation used by the surrounding class.

#### `public void setfs()`
- Role: Performs setfs.
- Description: Supports the setfs operation used by the surrounding class.

#### `public void setwnd()`
- Role: Performs setwnd.
- Description: Supports the setwnd operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `private void seticon()`
- Role: Performs seticon.
- Description: Supports the seticon operation used by the surrounding class.

#### `private UIPanel renderer()`
- Role: Performs renderer.
- Description: Supports the renderer operation used by the surrounding class.

#### `public MainFrame(Coord isz)`
- Role: Creates a new MainFrame instance.
- Description: Constructs the instance and initializes its default state.

#### `private void savewndstate()`
- Role: Performs savewndstate.
- Description: Supports the savewndstate operation used by the surrounding class.

#### `public ConnectionError(String mesg)`
- Role: Performs connection error.
- Description: Supports the connection error operation used by the surrounding class.

#### `public static Session connect(Object[] args)`
- Role: Performs connect.
- Description: Supports the connect operation used by the surrounding class.

#### `private void uiloop() throws InterruptedException`
- Role: Handles the uiloop workflow.
- Description: Supports the uiloop operation used by the surrounding class.

#### `private void run(UI.Runner task)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static void setupres()`
- Role: Performs setupres.
- Description: Supports the setupres operation used by the surrounding class.

#### `public static void resdump()`
- Role: Performs resdump.
- Description: Supports the resdump operation used by the surrounding class.

#### `private static void javabughack() throws InterruptedException`
- Role: Handles the javabughack workflow.
- Description: Supports the javabughack operation used by the surrounding class.

#### `public static void status(String state)`
- Role: Performs status.
- Description: Supports the status operation used by the surrounding class.

#### `private static void main2(String[] args)`
- Role: Performs main2.
- Description: Supports the main2 operation used by the surrounding class.

#### `public static void main(final String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.

#### `private static void dumplist(Collection<Resource> list, Path fn)`
- Role: Performs dumplist.
- Description: Supports the dumplist operation used by the surrounding class.
