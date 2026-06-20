---
source: [VMeter.java](../../../src/haven/VMeter.java)
created: 2026-06-13
updated: 2026-06-14
---

# VMeter

Represents the vmeter Haven component.

## Nested Types

### $_

- Role: Represents $ within VMeter.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/vm-frame")`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex fg = Resource.loadtex("gfx/hud/vm-tex")`
- Role: Defines the shared fg constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public VMeter(List<Meter> meters)`
- Role: Creates a new VMeter instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.
