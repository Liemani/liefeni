---
source: [TexPal.java](../../../../../src/haven/resutil/TexPal.java)
created: 2026-06-13
updated: 2026-06-20
---

# TexPal

Provides a palette-adjusted texture state for draw-time color replacement.

## Members

### Constants

#### `public static final Slot<TexPal> slot = new Slot<TexPal>(Slot.Type.DRAW, TexPal.class)`
- Role: Registers the palette texture state.
- Description: Stores the active palette replacement in the render pipe.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`
- Role: Exposes the palette source texture.
- Description: Reads the image from the wrapped texture renderer.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the palette shader path.
- Description: Swaps the original texture colors through the palette texture.

### Fields

#### `public final TexRender tex`
- Role: Stores the palette texture renderer.
- Description: The renderer is sampled by the shader.

### Methods

#### `public TexPal(TexRender tex)`
- Role: Builds a palette texture state.
- Description: Stores the renderer used for palette lookup.

#### `public ShaderMacro shader()`
- Role: Returns the palette shader.
- Description: Applies the palette replacement step during drawing.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the draw pipe.
- Description: Makes the palette texture visible to the shader.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Serializes the palette state into a material buffer.
- Description: Supports material decoding from resources.