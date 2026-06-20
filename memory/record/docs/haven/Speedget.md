---
source: [Speedget.java](../../../src/haven/Speedget.java)
created: 2026-06-13
updated: 2026-06-14
---

# Speedget

Represents the speedget Haven component.

## Nested Types

### $_

- Role: Represents $ within Speedget.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Tex imgs[][]`
- Role: Defines the shared speedget constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String tips[]`
- Role: Stores the speedget state.
- Description: Backs the cached state for this file.

#### `public static final Coord tsz`
- Role: Defines the shared tsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_speedup = KeyBinding.get("speed-up", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.C))`
- Role: Defines the shared kb speedup constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_speeddn = KeyBinding.get("speed-down", KeyMatch.forchar('R', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S | KeyMatch.C))`
- Role: Defines the shared kb speeddn constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding[] kb_speeds =`
- Role: Defines the shared speedget constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public int cur, max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

#### `public int cur, max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Speedget(int cur, int max)`
- Role: Creates a new Speedget instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void set(int s)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.
