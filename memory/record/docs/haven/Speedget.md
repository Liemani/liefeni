---
source: [Speedget.java](../../../../src/haven/Speedget.java)
created: 2026-06-13
updated: 2026-06-14
---

# Speedget

Represents the speedget Haven component.

## Nested Types

### $_

- Role: Registers the `speedget` widget factory.
- Description: Creates the speed meter widget from the widget resource system.

## Members

### Constants

#### `public static final Tex imgs[][]`
#### `public static final Tex imgs[][]`
- Role: Caches the imgs[][] value.
- Description: Caches the `imgs[][]` value for reuse.

#### `public static final String tips[]`
#### `public static final String tips[]`
- Role: Stores the speedget state.
- Description: Stores the tooltip text for each speed level.

#### `public static final Coord tsz`
#### `public static final Coord tsz`
- Role: Caches the tsz value.
- Description: Caches the `tsz` value for reuse.

#### `public static final KeyBinding kb_speedup = KeyBinding.get("speed-up", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.C))`
- Role: Implements the kb speedup operation.
- Description: Implements the forchar operation.
- Value: `KeyBinding.get("speed-up", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.C))`

#### `public static final KeyBinding kb_speeddn = KeyBinding.get("speed-down", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S | KeyMatch.C))`
- Role: Implements the kb speeddn operation.
- Description: Implements the forchar operation.
- Value: `KeyBinding.get("speed-down", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S | KeyMatch.C))`

#### `public static final KeyBinding[] kb_speeds =`
- Role: Caches the kb speeds value.
- Description: Caches the `kb_speeds` value for reuse.
- Value: ``

### Fields

#### `public int cur, max`
- Role: Caches the max value.
- Description: Caches the `max` value for reuse.

#### `public int cur, max`
- Role: Caches the max value.
- Description: Caches the `max` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Speedget(int cur, int max)`
- Role: Creates a new Speedget instance.
- Description: Constructs the Speedget instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the speed meter and its segments.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Receives server updates for the current speed.

#### `public void set(int s)`
- Role: Handles the set path.
- Description: Updates the current speed selection.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Changes the speed when clicked.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Changes the speed when the wheel is scrolled.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Handles the global speed hotkeys.