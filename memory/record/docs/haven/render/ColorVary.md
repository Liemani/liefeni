---
source: [ColorVary.java](../../../../../src/haven/render/ColorVary.java)
created: 2026-06-13
updated: 2026-06-14
---

# ColorVary

Defines the color vary render pipeline component.

## Members

### Constants

#### `public static final Slot<ColorVary> slot = new Slot<>(Slot.Type.DRAW, ColorVary.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<color vary> slot = new slot<>(slot.type.draw, color vary.class) operation.
- Value: `new Slot<>(Slot.Type.DRAW, ColorVary.class)`

#### `public static final Attribute color = new Attribute(VEC4, "vcolor")`
- Role: Implements the color operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC4, "vcolor")`

#### `public static final ColorVary st = new ColorVary()`
- Role: Implements the st operation.
- Description: Implements the color vary operation.
- Value: `new ColorVary()`

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Implements the fcolor operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC4)`

#### `static final ShaderMacro shader = prog ->`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.
- Value: `prog ->`

### Fields

### Methods

#### `private ColorVary()`
- Role: Creates the shared vertex-color state.
- Description: Builds the singleton state object used to expose vertex colors to shaders.

#### `public ShaderMacro shader()`
- Role: Builds the color varying shader.
- Description: Returns the shader macro that forwards vertex color data.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.