---
source: [TexMS.java](../../../../src/haven/TexMS.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexMS

Renders and resolves multisampled textures.

## Nested Types

### Draw

- Role: Carries the multisample draw state for one render pass.
- Description: Binds the multisample texture to an ad hoc draw state before resolving it.

### Resolve

- Role: Resolves one sample-count variant of a multisample texture.
- Description: Builds and caches a shader that averages all samples for the requested texture format.

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "mstexc")`
- Role: Names the multisample texture coordinate attribute.
- Description: Supplies the per-vertex coordinates used for the resolve quad.
- Value: `new Attribute(VEC2, "mstexc")`

#### `public static final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Describes the resolve quad vertex layout.
- Description: Packs clip-space positions and multisample texture coordinates into one interleaved buffer.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

#### `public static final AutoVarying texcoord = new AutoVarying(VEC2, "s_mstex")`
- Role: Passes the multisample texture coordinates to the fragment stage.
- Description: Reads the `mstexc` attribute without extra transformation.
- Value: `new AutoVarying(VEC2, "s_mstex")`

#### `public static final Uniform mstex = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).data, RUtils.adhoc)`
- Role: Exposes the current multisample texture to the resolve shader.
- Description: Pulls the sampler from the active ad hoc draw state.
- Value: `new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).data, RUtils.adhoc)`

#### `private static final Map<Integer, Resolve> shaders = new HashMap<>()`
- Role: Caches resolve shaders by sample count.
- Description: Reuses one shader instance for each multisample texture sample count.
- Value: `new HashMap<>()`

### Fields

#### `public final Sampler2DMS data`
- Role: Stores the multisample texture source.
- Description: This sampler is resolved into a normal texture by the draw pass.

#### `public final int samples`
- Role: Stores the sample count this shader resolves.
- Description: Used as the cache key and loop bound in the resolve shader.

#### `public final Sampler2DMS data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private Draw st = null`
- Role: Caches the active draw state.
- Description: Reused between renders so the ad hoc state does not need to be recreated.

### Methods

#### `public TexMS(Sampler2DMS data)`
- Role: Wraps a multisample texture for resolve rendering.
- Description: Stores the source sampler used by `render()`.

#### `public Coord sz()`
- Role: Returns the texture size.
- Description: Reads the size from the underlying multisample texture.

#### `private Resolve(int samples)`
- Role: Builds a shader for one multisample sample count.
- Description: Captures the number of samples the resolve shader must average.

#### `public void modify(ProgramContext prog)`
- Role: Replaces the fragment color with the resolved average.
- Description: Samples every multisample value and writes their average to the fragment color.

#### `public static Resolve get(int samples)`
- Role: Returns a cached resolve shader for the requested sample count.
- Description: Reuses one shader instance per sample count.

#### `public Draw(Sampler2DMS data)`
- Role: Creates the ad hoc draw state used for resolving.
- Description: Wraps the sampler and selects the matching resolve shader.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Draws the fullscreen resolve quad.
- Description: Builds a temporary vertex buffer, binds the resolve state, and renders the multisample texture.
