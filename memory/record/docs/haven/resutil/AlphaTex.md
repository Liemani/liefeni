---
source: [AlphaTex.java](../../../../../src/haven/resutil/AlphaTex.java)
created: 2026-06-13
updated: 2026-06-20
---

# AlphaTex

Applies an alpha texture to fragment color and optionally clips pixels below a threshold.

## Members

### Constants

#### `public static final Slot<AlphaTex> slot = new Slot<AlphaTex>(Slot.Type.GEOM, AlphaTex.class)`
- Role: Registers the state on the geometry slot.
- Description: Lets draw code look up the active `AlphaTex` instance.

#### `public static final Attribute clipc = new Attribute(VEC2, "clipc")`
- Role: Declares the vertex clip coordinate attribute.
- Description: Passed through to the fragment stage through a varying.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lclip = new MeshBuf.V2LayerID(clipc)`
- Role: Connects `clipc` to mesh-buffer storage.
- Description: Used when decoding vertex data into the clip coordinate layer.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Exposes the bound texture to the shader.
- Description: Reads the current alpha texture from render state.

#### `private static final Uniform cclip = new Uniform(FLOAT, p -> p.get(slot).cthr, slot)`
- Role: Exposes the clip threshold to the shader.
- Description: Controls whether fragments below the threshold are discarded.

#### `private static final AutoVarying fc = new AutoVarying(VEC2)`
- Role: Carries clip coordinates into the fragment shader.
- Description: Reads the `clipc` attribute in the vertex stage.

#### `private static final ShaderMacro main = prog ->`
- Role: Modulates fragment color with the texture sample.
- Description: Implements the normal alpha-texture path.

#### `private static final ShaderMacro clip = prog ->`
- Role: Adds discard logic to the fragment shader.
- Description: Drops fragments whose sampled alpha is lower than `cthr`.

#### `private static final ShaderMacro shnc = main`
- Role: Reuses the non-clipping shader path.
- Description: Selected when no clip threshold is configured.

#### `private static final ShaderMacro shwc = ShaderMacro.compose(main, clip)`
- Role: Combines color modulation and clipping.
- Description: Selected when clipping is enabled.

### Fields

#### `public final Sampler2D tex`
- Role: Stores the alpha texture.
- Description: Sampled during fragment shading.

#### `public final float cthr`
- Role: Stores the clip threshold.
- Description: Zero disables clipping.

### Methods

#### `public AlphaTex(Sampler2D tex, float clip)`
- Role: Builds an alpha-texture state with clipping.
- Description: Stores the texture and clip threshold.

#### `public AlphaTex(Sampler2D tex)`
- Role: Builds an alpha-texture state without clipping.
- Description: Uses a zero clip threshold.

#### `private static Value value(FragmentContext fctx)`
- Role: Resolves the texture sample for the current fragment.
- Description: Lazily binds the sampler and builds the sampled value.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this state.
- Description: Chooses clipping or non-clipping behavior from `cthr`.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the render pipe.
- Description: Publishes this `AlphaTex` instance for later draw passes.