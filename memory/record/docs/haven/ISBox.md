---
source: [ISBox.java](../../../../src/haven/ISBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# ISBox

Represents the isbox Haven component.

## Nested Types

### $_

- Role: Registers the `isbox` widget factory.
- Description: Creates the item-slot box widget from resource arguments.

## Members

### Constants

#### `public static final Color bgcol = new Color(43, 51, 44, 127)`
- Role: Implements the bgcol operation.
- Description: Implements the color operation.
- Value: `new Color(43, 51, 44, 127)`

#### `public static final IBox box = new IBox.Scaled("gfx/hud/bosq", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`
- Role: Implements the box operation.
- Description: Implements the scaled operation.
- Value: `new IBox.Scaled("gfx/hud/bosq", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`

#### `public static final Coord defsz = UI.scale(145, 42)`
- Role: Implements the defsz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(145, 42)`

#### `public static final Text.Foundry lf = new Text.Foundry(Text.fraktur, 22, Color.WHITE).aa(true)`
- Role: Implements the lf operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.fraktur, 22, Color.WHITE).aa(true)`

### Fields

#### `private final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private Text label`
- Role: Caches the label value.
- Description: Caches the `label` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private void setlabel(int rem, int av, int bi)`
- Role: Handles the setlabel path.
- Description: Updates the label.

#### `public ISBox(Indir<Resource> res, int rem, int av, int bi)`
- Role: Creates a new ISBox instance.
- Description: Constructs the ISBox instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the ISBox content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public int count()`
- Role: Handles the count path.
- Description: Implements the count operation.

#### `public int capacity()`
- Role: Handles the capacity path.
- Description: Implements the capacity operation.

#### `public void transfer()`
- Role: Handles the transfer path.
- Description: Implements the transfer operation.