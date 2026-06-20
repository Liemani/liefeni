---
source: [ColorTex.java](../../../../src/haven/render/ColorTex.java)
created: 2026-06-13
updated: 2026-06-14
---

# ColorTex

Defines the color tex render pipeline component.

## Members

### Constants

#### `public static final Slot<ColorTex> slot = new Slot<>(Slot.Type.DRAW, ColorTex.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute texc = Tex2D.texc`
- Role: Defines the shared texc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Texture2D.Sampler2D data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

### Methods

#### `public ColorTex(Texture2D.Sampler2D data)`
- Role: Creates a new ColorTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
