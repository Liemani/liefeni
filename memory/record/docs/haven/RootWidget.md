---
source: [RootWidget.java](../../../../src/haven/RootWidget.java)
created: 2026-06-13
updated: 2026-06-20
---

# RootWidget

Owns the top-level UI widget, global key handling, status messages, and console commands.

## Members

### Constants

#### `public static final Text.Foundry msgfoundry = new Text.Foundry(Text.dfont, 14)`
- Role: Renders transient on-screen messages.
- Value: `new Text.Foundry(Text.dfont, 14)`

### Fields

#### `public boolean modtip = false`
- Role: Enables modifier-key tooltip display.

#### `Profile guprof, grprof, ggprof`
- Role: Hold the UI, GL, and GPU profile windows.

#### `private Text lastmsg`
- Role: Stores the most recent transient message.

#### `private double msgtime`
- Role: Stores when the current transient message was shown.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Stores the console commands exposed from the root widget.

### Methods

#### `public RootWidget(UI ui, Coord sz)`
- Role: Creates the root widget and registers it as the current LMI root widget.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the cursor state for the current pointer position.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles global key events before normal widget dispatch.

#### `public void draw(GOut g)`
- Role: Draws the widget tree and transient message overlay.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles UI messages from the Haven server and client subsystems.

#### `public void msg(String msg, Color color)`
- Role: Shows a temporary message on screen.

#### `public boolean msg(UI.Notice msg)`
- Role: Shows a formatted notice message and plays its sound effect.

#### `public void error(String msg)`
- Role: Shows an error message through the UI.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns a modifier tooltip when enabled.

#### `private Map<String, Console.Command> findcmds()`
- Role: Returns the root console command map.

