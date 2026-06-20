---
source: [ISBox.java](../../../src/haven/ISBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# ISBox

Represents the isbox Haven component.

## Nested Types

### $_

- Role: Represents $ within ISBox.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Color bgcol = new Color(43, 51, 44, 127)`
- Role: Defines the shared bgcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IBox box = new IBox.Scaled("gfx/hud/bosq", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`
- Role: Defines the shared box constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord defsz = UI.scale(145, 42)`
- Role: Defines the shared defsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry lf = new Text.Foundry(Text.fraktur, 22, Color.WHITE).aa(true)`
- Role: Defines the shared lf constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private Text label`
- Role: Stores the label value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private void setlabel(int rem, int av, int bi)`
- Role: Performs setlabel.
- Description: Supports the setlabel operation used by the surrounding class.

#### `public ISBox(Indir<Resource> res, int rem, int av, int bi)`
- Role: Creates a new ISBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public int count()`
- Role: Performs count.
- Description: Supports the count operation used by the surrounding class.

#### `public int capacity()`
- Role: Performs capacity.
- Description: Supports the capacity operation used by the surrounding class.

#### `public void transfer()`
- Role: Performs transfer.
- Description: Supports the transfer operation used by the surrounding class.
