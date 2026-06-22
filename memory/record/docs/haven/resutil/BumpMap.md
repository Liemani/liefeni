---
source: [BumpMap.java](../../../../../src/haven/resutil/BumpMap.java)
created: 2026-06-13
updated: 2026-06-20
---

# BumpMap

Applies tangent-space normal mapping and can optionally use an overlay texture during shading.

## Nested Types

### Shader
Builds the shader macro that turns tangent and bitangent data into fragment lighting.

#### Members

##### Fields

#### `public final boolean otex`
- Role: Stores whether overlay texture sampling is enabled.
- Description: Chooses between `Tex2D` and `OverTex` coordinate sources.

##### Methods

#### `private Shader(boolean otex)`
- Role: Builds the shader variant.
- Description: Stores the overlay flag used by `modify`.

#### `public void modify(final ProgramContext prog)`
- Role: Extends the program with bump mapping.
- Description: Samples the normal map, builds the tangent-space normal, and installs mesh morph inputs.

### `$bump`
Parses the material specification and installs a `BumpMap` state into the material buffer.

#### Members

##### Methods

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Reads the material spec.
- Description: Resolves the source texture and overlay flag, then adds a `BumpMap` state.

### `Tangents`
Stores tangent vectors as vertex-buffer float data.

#### Members

##### Constructors

#### `public Tangents(FloatBuffer data)`
- Role: Wraps tangent data.
- Description: Creates a vertex-buffer payload for the tangent attribute.

#### `public Tangents(Resource res, Message buf, int nv)`
- Role: Decodes tangent data from a resource message.
- Description: Loads `nv * 3` floats and forwards them to the float-data constructor.

### `BiTangents`
Stores bitangent vectors as vertex-buffer float data.

#### Members

##### Constructors

#### `public BiTangents(FloatBuffer data)`
- Role: Wraps bitangent data.
- Description: Creates a vertex-buffer payload for the bitangent attribute.

#### `public BiTangents(Resource res, Message buf, int nv)`
- Role: Decodes bitangent data from a resource message.
- Description: Loads `nv * 3` floats and forwards them to the float-data constructor.

### `TanDecode`
Decodes tangent data into the vertex-attribute destination list.

#### Members

##### Methods

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Produces tangent attribute data.
- Description: Loads a tangent float buffer and adds a `Tangents` payload.

### `BitDecode`
Decodes bitangent data into the vertex-attribute destination list.

#### Members

##### Methods

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Produces bitangent attribute data.
- Description: Loads a bitangent float buffer and adds a `BiTangents` payload.

## Members

### Constants

#### `public static final Slot<BumpMap> slot = new Slot<BumpMap>(Slot.Type.DRAW, BumpMap.class)`
- Role: Registers the bump-map draw state.
- Description: Makes the current bump-map available to shader code.

#### `public static final Attribute tan = new Attribute(VEC3, "tan")`
- Role: Declares the tangent attribute.
- Description: Supplied by the mesh so the shader can build tangent space.

#### `public static final Attribute bit = new Attribute(VEC3, "bit")`
- Role: Declares the bitangent attribute.
- Description: Supplied by the mesh so the shader can build tangent space.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Exposes the bump texture to the shader.
- Description: Reads the current state texture for normal-map sampling.

#### `public static final AutoVarying tanc = new AutoVarying(VEC3)`
- Role: Carries tangent data into the fragment stage.
- Description: Mirrors the tangent attribute from the vertex stage.

#### `public static final AutoVarying bitc = new AutoVarying(VEC3)`
- Role: Carries bitangent data into the fragment stage.
- Description: Mirrors the bitangent attribute from the vertex stage.

#### `private static final Shader[] shaders = {new Shader(false), new Shader(true)}`
- Role: Caches the shader variants.
- Description: One variant samples overlay texture coordinates and the other does not.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> ltan = new MeshBuf.V3LayerID(tan)`
- Role: Connects tangents to mesh buffer storage.
- Description: Used when decoding vertex data.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> lbit = new MeshBuf.V3LayerID(bit)`
- Role: Connects bitangents to mesh buffer storage.
- Description: Used when decoding vertex data.

### Fields

#### `public final Sampler2D tex`
- Role: Stores the bump texture.
- Description: Sampled during shader execution.

#### `private final ShaderMacro shader`
- Role: Stores the selected shader macro.
- Description: Chosen from the `otex` flag.

#### `public final boolean otex`
- Role: Tracks whether overlay texture sampling is enabled.
- Description: Selects the appropriate shader variant.

### Methods

#### `public BumpMap(Sampler2D tex, boolean otex)`
- Role: Builds a bump-map state.
- Description: Stores the texture and shader mode flag.

#### `public BumpMap(Sampler2D tex)`
- Role: Builds a bump-map state without overlay texture sampling.
- Description: Uses the default shader variant.

#### `public ShaderMacro shader()`
- Role: Returns the selected shader macro.
- Description: Uses the variant prepared during construction.

#### `public void apply(Pipe buf)`
- Role: Installs the bump-map state.
- Description: Publishes the current state to the render pipe.

