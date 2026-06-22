---
source: [CrackTex.java](../../../../../src/haven/resutil/CrackTex.java)
created: 2026-06-13
updated: 2026-06-20
---

# CrackTex

Loads a packed 3D crack texture and renders it as an instanced overlay with rotation and tint.

## Nested Types

### Decoder
Decodes the gzip-compressed 3D texture data into mipmapped fill buffers.

#### Members

##### Fields

#### `public final Supplier<InputStream> src`
- Role: Stores the source stream supplier.
- Description: Opened when the texture data is actually decoded.

#### `private Defer.Future<FillBuffer[]> decode`
- Role: Tracks an in-flight decode job.
- Description: Avoids decoding the same texture more than once.

#### `private FillBuffer[] data`
- Role: Stores the decoded mip buffers.
- Description: Reused after a successful decode.

##### Methods

#### `public Decoder(Supplier<InputStream> src)`
- Role: Builds a decoder for the compressed texture.
- Description: Stores the source stream supplier for later use.

#### `private FillBuffer[] decode(Texture3D tex, Environment env)`
- Role: Expands the gzip source into texture levels.
- Description: Decodes all mip levels into `FillBuffer` instances.

#### `public FillBuffer fill(Texture.Image img, Environment env)`
- Role: Provides the decoded data for a mip level.
- Description: Lazily triggers decode and retries when the environment changes.

#### `public void done()`
- Role: Clears the cached decode state.
- Description: Resets the future and the decoded buffer cache.

## Members

### Constants

#### `public static final Slot<CrackTex> slot = new Slot<>(Slot.Type.DRAW, CrackTex.class)...`
- Role: Registers the crack overlay state.
- Description: The slot is instanced so repeated cracks can vary per object.

#### `public static final int texsz = 256`
- Role: Defines the source texture size.
- Description: The crack data is decoded at this resolution.

#### `public static final Sampler3D[] imgs`
- Role: Caches the built-in crack textures.
- Description: Loaded once from packaged gzip resources.

#### `private static final Uniform u_tex = new Uniform(SAMPLER3D, "cracktex", p -> p.get(slot).img, slot)`
- Role: Exposes the crack texture to the shader.
- Description: Reads the current sampler from render state.

#### `private static final Uniform u_col = new Uniform(VEC3, "crackcol", p -> p.get(slot).color, slot)`
- Role: Exposes the tint color to the shader.
- Description: Multiplies the sampled texture before output.

#### `private static final InstancedUniform u_rot = new InstancedUniform.Vec4("crackrot", p -> p.get(slot).rot, slot)`
- Role: Exposes the rotation to the shader.
- Description: Carries per-instance orientation data.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the crack overlay shader.
- Description: Samples the 3D texture using a rotated local vector.

#### `private static final Map<Sampler3D, Instancer<CrackTex>> instids = new WeakHashMap<>()`
- Role: Caches instancers by texture.
- Description: Avoids rebuilding identical instanced state for the same sampler.

### Fields

#### `public final Sampler3D img`
- Role: Stores the crack texture.
- Description: Sampled by the shader.

#### `public final Color color`
- Role: Stores the tint color.
- Description: Applied to the sampled texture.

#### `public final float[] rot`
- Role: Stores the rotation quaternion.
- Description: Computed from the axis/angle constructor arguments.

### Methods

#### `public CrackTex(Sampler3D img, Color color, Coord3f rax, float rang)`
- Role: Builds a crack overlay with custom rotation.
- Description: Stores the texture, tint, and rotation matrix.

#### `public CrackTex(Sampler3D img, Color color)`
- Role: Builds a crack overlay without rotation.
- Description: Uses the identity axis and zero angle.

#### `public static Sampler3D loadtex(Supplier<InputStream> fp)`
- Role: Loads the 3D texture sampler.
- Description: Creates a `Texture3D` and configures linear filtering.

#### `public ShaderMacro shader()`
- Role: Returns the crack overlay shader.
- Description: Applies the texture sample and tint to fragment color.

#### `public void apply(Pipe buf)`
- Role: Installs the crack overlay state.
- Description: Publishes the current crack texture to rendering.

#### `private Instancer<CrackTex> instancer()`
- Role: Returns the instancer for this texture.
- Description: Reuses one instancer per crack sampler.

#### `public InstancedAttribute[] attribs()`
- Role: Exposes the instanced rotation attribute.
- Description: Supplies the per-instance crack orientation to the renderer.