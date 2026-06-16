# GiveButton

This file documents the responsibilities and members of `GiveButton`.

## Meta

- Source: [GiveButton.java](../../../src/haven/GiveButton.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the give button Haven component.

## Nested Types

### $_

- Role: Represents $ within GiveButton.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

### Fields

#### `public static Tex bg = Resource.loadtex("gfx/hud/combat/knapp/knapp")`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

#### `public static Tex ol = Resource.loadtex("gfx/hud/combat/knapp/ol")`
- Role: Stores the ol value.
- Description: Backs the cached state for this file.

#### `public static Tex or = Resource.loadtex("gfx/hud/combat/knapp/or")`
- Role: Stores the or value.
- Description: Backs the cached state for this file.

#### `public static Tex sl = Resource.loadtex("gfx/hud/combat/knapp/sl")`
- Role: Stores the sl value.
- Description: Backs the cached state for this file.

#### `public static Tex sr = Resource.loadtex("gfx/hud/combat/knapp/sr")`
- Role: Stores the sr value.
- Description: Backs the cached state for this file.

#### `int state`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public GiveButton(int state, Coord sz)`
- Role: Creates a new GiveButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public GiveButton(int state)`
- Role: Creates a new GiveButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
