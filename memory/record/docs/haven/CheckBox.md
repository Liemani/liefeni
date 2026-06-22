---
source: [CheckBox.java](../../../../src/haven/CheckBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# CheckBox

Represents the check box Haven component.

## Nested Types

### $_

- Role: Registers the `chkbox` widget factory.
- Description: Creates a checkbox widget from the widget resource system.

## Members

### Constants

#### `public static final Tex lbox = Resource.loadtex("gfx/hud/chkbox")`
- Role: Implements the lbox operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chkbox")`

#### `public static final Tex lmark = Resource.loadtex("gfx/hud/chkmark")`
- Role: Implements the lmark operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chkmark")`

#### `public static final Tex sbox = Resource.loadtex("gfx/hud/chkboxs")`
- Role: Implements the sbox operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chkboxs")`

#### `public static final Tex smark = Resource.loadtex("gfx/hud/chkmarks")`
- Role: Implements the smark operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chkmarks")`

### Fields

#### `public final Tex box, mark`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `public final Tex box, mark`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `public final Coord loff`
- Role: Caches the loff value.
- Description: Caches the `loff` value for reuse.

#### `Text lbl`
- Role: Caches the lbl value.
- Description: Caches the `lbl` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public CheckBox(String lbl, boolean lg)`
- Role: Creates a new CheckBox instance.
- Description: Constructs the CheckBox instance from the supplied inputs.

#### `public CheckBox(String lbl)`
- Role: Creates a new CheckBox instance.
- Description: Constructs the CheckBox instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the CheckBox content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.