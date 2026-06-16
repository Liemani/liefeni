# CheckBox

This file documents the responsibilities and members of `CheckBox`.

## Meta

- Source: [CheckBox.java](../../../src/haven/CheckBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the check box Haven component.

## Nested Types

### $_

- Role: Represents $ within CheckBox.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Tex lbox = Resource.loadtex("gfx/hud/chkbox")`
- Role: Defines the shared lbox constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex lmark = Resource.loadtex("gfx/hud/chkmark")`
- Role: Defines the shared lmark constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex sbox = Resource.loadtex("gfx/hud/chkboxs")`
- Role: Defines the shared sbox constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex smark = Resource.loadtex("gfx/hud/chkmarks")`
- Role: Defines the shared smark constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Tex box, mark`
- Role: Stores the mark value.
- Description: Backs the cached state for this file.

#### `public final Tex box, mark`
- Role: Stores the mark value.
- Description: Backs the cached state for this file.

#### `public final Coord loff`
- Role: Stores the loff value.
- Description: Backs the cached state for this file.

#### `Text lbl`
- Role: Stores the lbl value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public CheckBox(String lbl, boolean lg)`
- Role: Creates a new CheckBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public CheckBox(String lbl)`
- Role: Creates a new CheckBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.
