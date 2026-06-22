---
source: [OverTex.java](../../../../../src/haven/resutil/OverTex.java)
created: 2026-06-13
updated: 2026-06-20
---

# OverTex

Applies an overlay texture on top of the current fragment color and can also feed overlay coordinates from mesh data.

## Nested Types

### $ctex
Parses the overlay-texture material specification.

#### Members

##### Methods

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Reads the overlay material specification.
- Description: Resolves the overlay texture, resource id, and blend mode.

### CDecode
Decodes overlay texture coordinates from the resource message into vertex-buffer data.

#### Members

##### Methods

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Produces overlay coordinate attribute data.
- Description: Adds an `OTexC` payload for the current vertex set.

### OTexC
Stores overlay texture coordinates as vertex-buffer float data.

#### Members

##### Methods

#### `public OTexC(FloatBuffer data)`
- Role: Wraps overlay coordinate data.
- Description: Creates a vertex-buffer payload for `otexc`.

#### `public OTexC(Resource res, Message buf, int nv)`
- Role: Decodes overlay coordinate data from a resource message.
- Description: Loads `nv * 2` floats into the overlay coordinate buffer.

## Members

### Constants

#### `public static final Slot<OverTex> slot = new Slot<OverTex>(Slot.Type.DRAW, OverTex.class)`
- Role: Registers the overlay state on the draw slot.
- Description: Makes the current overlay texture available to rendering.

#### `public static final Attribute otexc = new Attribute(VEC2, "otexc")`
- Role: Declares the overlay texture coordinate attribute.
- Description: Used to pass overlay UV data through the mesh.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Exposes the overlay texture to the shader.
- Description: Reads the bound overlay sampler from the active state.

#### `private static final Map<Function, ShaderMacro> shcache = new HashMap<Function, ShaderMacro>()`
- Role: Caches shader variants by blend function.
- Description: Avoids rebuilding the same overlay shader repeatedly.

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_otexc")`
- Role: Carries overlay coordinates into the fragment stage.
- Description: Mirrors the mesh-side `otexc` attribute.

### Fields

#### `public static boolean otexdb = false`
- Role: Debug toggle for overlay rendering.
- Description: When enabled, the state is skipped during `apply`.

#### `private final ShaderMacro shader`
- Role: Stores the selected overlay shader.
- Description: Built from the blend function supplied to the constructor.

#### `public final Sampler2D tex`
- Role: Stores the overlay texture.
- Description: Sampled by the fragment shader.

### Methods

#### `public static ValBlock.Value texcoord(FragmentContext fctx)`
- Role: Resolves the overlay texture coordinate value.
- Description: Returns a fragment value backed by the overlay varying.

#### `private static ShaderMacro shfor(final Function blend)`
- Role: Builds a shader macro for a specific blend function.
- Description: Samples the overlay texture and blends it with the base fragment color.

#### `public OverTex(Sampler2D tex, Function blend)`
- Role: Builds an overlay texture state with a blend function.
- Description: Stores the texture and prepares the shader path.

#### `public OverTex(Sampler2D tex)`
- Role: Builds a default overlay texture state.
- Description: Uses the standard overlay blend function.

#### `public ShaderMacro shader()`
- Role: Returns the overlay shader.
- Description: Picks the cached shader prepared for this texture.

#### `public void apply(Pipe buf)`
- Role: Installs the overlay state into the draw pipe.
- Description: Skips installation when the debug flag disables overlays.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Serializes the overlay state into material data.
- Description: Supports resource decoding.

