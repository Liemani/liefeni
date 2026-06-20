---
source: [ConsoleHost.java](../../../src/haven/ConsoleHost.java)
created: 2026-06-13
updated: 2026-06-14
---

# ConsoleHost

Represents the console host Haven component.

## Members

### Constants

#### `public static final KeyBinding kb_histprev = KeyBinding.get("history/prev", KeyMatch.forcode(KeyEvent.VK_UP, 0))`
- Role: Defines the shared kb histprev constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_histnext = KeyBinding.get("history/next", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`
- Role: Defines the shared kb histnext constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static Text.Foundry cmdfoundry = new Text.Foundry(Text.mono, 12, new java.awt.Color(245, 222, 179))`
- Role: Stores the cmdfoundry value.
- Description: Backs the cached state for this file.

#### `public ReadLine cmdline = null`
- Role: Holds the cmdline state.
- Description: Backs the cached state for this file.

#### `private Text.Line cmdtext = null`
- Role: Stores the cmdtext value.
- Description: Backs the cached state for this file.

#### `private String cmdtextf = null`
- Role: Stores the cmdtextf value.
- Description: Backs the cached state for this file.

#### `private List<String> history = new ArrayList<String>()`
- Role: Caches history entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int hpos = history.size()`
- Role: Stores the hpos value.
- Description: Backs the cached state for this file.

#### `private String hcurrent`
- Role: Stores the hcurrent value.
- Description: Backs the cached state for this file.

#### `private UI.Grab kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

### Methods

#### `public void done(ReadLine buf)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `private boolean cmdkey(KeyEvent ev)`
- Role: Performs cmdkey.
- Description: Supports the cmdkey operation used by the surrounding class.

#### `public ConsoleHost(Coord sz)`
- Role: Creates a new ConsoleHost instance.
- Description: Constructs the instance and initializes its default state.

#### `public ConsoleHost()`
- Role: Creates a new ConsoleHost instance.
- Description: Constructs the instance and initializes its default state.

#### `public ConsoleHost(UI ui, Coord c, Coord sz)`
- Role: Creates a new ConsoleHost instance.
- Description: Constructs the instance and initializes its default state.

#### `public void drawcmd(GOut g, Coord c)`
- Role: Performs drawcmd.
- Description: Supports the drawcmd operation used by the surrounding class.

#### `public void entercmd()`
- Role: Performs entercmd.
- Description: Supports the entercmd operation used by the surrounding class.

#### `public void cancelcmd()`
- Role: Performs cancelcmd.
- Description: Supports the cancelcmd operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public abstract void error(String msg)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.
