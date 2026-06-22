---
source: [ConsoleHost.java](../../../../src/haven/ConsoleHost.java)
created: 2026-06-13
updated: 2026-06-14
---

# ConsoleHost

Owns the in-game console input line, prompt rendering, and history navigation.

## Members

### Constants

#### `public static final KeyBinding kb_histprev = KeyBinding.get("history/prev", KeyMatch.forcode(KeyEvent.VK_UP, 0))`
- Role: Implements the kb histprev operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("history/prev", KeyMatch.forcode(KeyEvent.VK_UP, 0))`

#### `public static final KeyBinding kb_histnext = KeyBinding.get("history/next", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`
- Role: Implements the kb histnext operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("history/next", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`

### Fields

#### `public static Text.Foundry cmdfoundry = new Text.Foundry(Text.mono, 12, new java.awt.Color(245, 222, 179))`
- Role: Renders console text.
- Description: Shared text style used for the command prompt and input line.

#### `public ReadLine cmdline = null`
- Role: Stores the active command line.
- Description: Holds the editable console input buffer while the prompt is open.

#### `private Text.Line cmdtext = null`
- Role: Caches rendered command text.
- Description: Keeps the latest rendered prompt text for reuse while editing.

#### `private String cmdtextf = null`
- Role: Caches the raw command text.
- Description: Tracks the string that produced the cached rendered line.

#### `private List<String> history = new ArrayList<String>()`
- Role: Stores console history.
- Description: Keeps previously submitted commands in order.

#### `private int hpos = history.size()`
- Role: Tracks the history cursor.
- Description: Points at the currently selected history entry.

#### `private String hcurrent`
- Role: Stores the draft history line.
- Description: Preserves the line being edited when history navigation begins.

#### `private UI.Grab kg`
- Role: Stores the keyboard grab.
- Description: Captures keyboard input while console editing is active.

### Methods

#### `public void done(ReadLine buf)`
- Role: Submits the current command.
- Description: Runs the typed command, stores it in history, and clears the prompt.

#### `private boolean cmdkey(KeyEvent ev)`
- Role: Handles command-key input.
- Description: Routes history navigation, escape, and backspace handling while editing.

#### `public ConsoleHost(Coord sz)`
- Role: Creates a console host.
- Description: Initializes a console host with the requested widget size.

#### `public ConsoleHost()`
- Role: Creates a console host.
- Description: Default constructor for subclasses and UI wiring.

#### `public ConsoleHost(UI ui, Coord c, Coord sz)`
- Role: Creates a console host.
- Description: Initializes a console host at a specific UI position.

#### `public void drawcmd(GOut g, Coord c)`
- Role: Draws the command prompt.
- Description: Renders the current console input line, selection, and caret.

#### `public void entercmd()`
- Role: Enters command mode.
- Description: Opens the input line and grabs the keyboard for console editing.

#### `public void cancelcmd()`
- Role: Cancels command mode.
- Description: Closes the prompt and releases the keyboard grab.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input.
- Description: Gives console editing first chance to handle key presses before the widget does.

#### `public abstract void error(String msg)`
- Role: Reports a console error.
- Description: Lets subclasses show command execution failures.