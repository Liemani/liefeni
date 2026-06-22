---
source: [GiveButton.java](../../../../src/haven/GiveButton.java)
created: 2026-06-13
updated: 2026-06-14
---

# GiveButton

Represents the give button Haven component.

## Nested Types

### $_

- Role: Registers the give-button widget resource.
- Description: Factory that creates a GiveButton instance from the UI loader.

## Members

### Constants

### Fields

#### `public static Tex bg = Resource.loadtex("gfx/hud/combat/knapp/knapp")`
- Role: Implements the bg operation.
- Description: Implements the loadtex operation.

#### `public static Tex ol = Resource.loadtex("gfx/hud/combat/knapp/ol")`
- Role: Implements the ol operation.
- Description: Implements the loadtex operation.

#### `public static Tex or = Resource.loadtex("gfx/hud/combat/knapp/or")`
- Role: Implements the or operation.
- Description: Implements the loadtex operation.

#### `public static Tex sl = Resource.loadtex("gfx/hud/combat/knapp/sl")`
- Role: Implements the sl operation.
- Description: Implements the loadtex operation.

#### `public static Tex sr = Resource.loadtex("gfx/hud/combat/knapp/sr")`
- Role: Implements the sr operation.
- Description: Implements the loadtex operation.

#### `int state`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public GiveButton(int state, Coord sz)`
- Role: Creates a new GiveButton instance.
- Description: Constructs the GiveButton instance from the supplied inputs.

#### `public GiveButton(int state)`
- Role: Creates a new GiveButton instance.
- Description: Constructs the GiveButton instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GiveButton content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.