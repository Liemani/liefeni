---
source: [ColorTex.java](../../../../../src/haven/render/ColorTex.java)
created: 2026-06-13
updated: 2026-06-14
---

# ColorTex

Defines the color tex render pipeline component.

## Members

### Constants

#### `public static final Slot<ColorTex> slot = new Slot<>(Slot.Type.DRAW, ColorTex.class)`
- Role: Publishes color-texture state.
- Description: Shared slot used to expose the active color texture to the pipe.
- Value: `new Slot<>(Slot.Type.DRAW, ColorTex.class)`

#### `public static final Attribute texc = Tex2D.texc`
- Role: Reuses the shared texture-coordinate attribute.
- Description: Uses the 2D texture coordinate attribute from `Tex2D`.
- Value: `Tex2D.texc`

#### `private static final ShaderMacro shader = prog ->`
- Role: Builds the color-texture shader.
- Description: Returns the shader macro that samples the bound texture.
- Value: `prog ->`

### Fields

#### `public final Texture2D.Sampler2D data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

### Methods

#### `public ColorTex(Texture2D.Sampler2D data)`
- Role: Stores one sampled color texture.
- Description: Wraps the texture sampler used for color lookup.

#### `public ShaderMacro shader()`
- Role: Builds the color-texture shader.
- Description: Returns the shader macro that samples the bound texture.

#### `public void apply(Pipe p)`
- Role: Applies color-texture state.
- Description: Writes the active sampler into the current pipe.