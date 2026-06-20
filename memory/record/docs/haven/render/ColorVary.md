---
source: [ColorVary.java](../../../../src/haven/render/ColorVary.java)
created: 2026-06-13
updated: 2026-06-14
---

# ColorVary

Defines the color vary render pipeline component.

## Members

### Constants

#### `public static final Slot<ColorVary> slot = new Slot<>(Slot.Type.DRAW, ColorVary.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute color = new Attribute(VEC4, "vcolor")`
- Role: Defines the shared color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ColorVary st = new ColorVary()`
- Role: Defines the shared st constant.
- Description: Shared constant used by the rest of the class.

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Defines the shared fcolor constant.
- Description: Shared constant used by the rest of the class.

#### `static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private ColorVary()`
- Role: Creates a new ColorVary instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
