---
source: [RootWidget.java](../../../src/haven/RootWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# RootWidget

Represents the root widget Haven component.

## Members

### Constants

#### `public static final Text.Foundry msgfoundry = new Text.Foundry(Text.dfont, 14)`
- Role: Defines the shared msgfoundry constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public boolean modtip = false`
- Role: Tracks the modtip flag.
- Description: Supports the modtip operation used by the surrounding class.

#### `Profile guprof, grprof, ggprof`
- Role: Stores the ggprof value.
- Description: Backs the cached state for this file.

#### `Profile guprof, grprof, ggprof`
- Role: Stores the ggprof value.
- Description: Backs the cached state for this file.

#### `Profile guprof, grprof, ggprof`
- Role: Stores the ggprof value.
- Description: Backs the cached state for this file.

#### `private Text lastmsg`
- Role: Stores the lastmsg value.
- Description: Backs the cached state for this file.

#### `private double msgtime`
- Role: Stores the msgtime value.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public RootWidget(UI ui, Coord sz)`
- Role: Creates a new RootWidget instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void msg(String msg, Color color)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public boolean msg(UI.Notice msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public void error(String msg)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.
