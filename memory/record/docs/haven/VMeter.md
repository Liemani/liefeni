---
source: [VMeter.java](../../../../src/haven/VMeter.java)
created: 2026-06-13
updated: 2026-06-14
---

# VMeter

Represents the vmeter Haven component.

## Nested Types

### $_

- Role: Registers the `vmeter` widget factory.
- Description: Creates a vertical meter widget from the resource system.

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/vm-frame")`
- Role: Implements the bg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/vm-frame")`

#### `public static final Tex fg = Resource.loadtex("gfx/hud/vm-tex")`
- Role: Implements the fg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/vm-tex")`

### Fields

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public VMeter(List<Meter> meters)`
- Role: Creates a new VMeter instance.
- Description: Constructs the VMeter instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the VMeter content.