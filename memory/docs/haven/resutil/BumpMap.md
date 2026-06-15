# BumpMap

This file documents the responsibilities and members of `BumpMap`.

## Meta

- Source: [BumpMap.java](../../../../src/haven/resutil/BumpMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a bump map helper.

## Nested Types

### $bump

- Description: TODO

### BiTangents

- Description: TODO

### BitDecode

- Description: TODO

### Shader

- Description: TODO

### TanDecode

- Description: TODO

### Tangents

- Description: TODO

## Members

### Constants

#### `public static final Slot<BumpMap> slot = new Slot<BumpMap>(Slot.Type.DRAW, BumpMap.class)`

- Description: TODO

#### `public static final Attribute tan = new Attribute(VEC3, "tan")`

- Description: TODO

#### `public static final Attribute bit = new Attribute(VEC3, "bit")`

- Description: TODO

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`

- Description: TODO

#### `public static final AutoVarying tanc = new AutoVarying(VEC3)`

- Description: TODO

#### `public static final AutoVarying bitc = new AutoVarying(VEC3)`

- Description: TODO

#### `private static final Shader[] shaders =`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> ltan = new MeshBuf.V3LayerID(tan)`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> lbit = new MeshBuf.V3LayerID(bit)`

- Description: TODO

### Fields

#### `public final Sampler2D tex`

- Description: TODO

#### `private final ShaderMacro shader`

- Description: TODO

#### `public final boolean otex`

- Description: TODO

### Methods

#### `public BumpMap(Sampler2D tex, boolean otex)`

- Description: TODO

#### `public BumpMap(Sampler2D tex)`

- Description: TODO

#### `private Shader(boolean otex)`

- Description: TODO

#### `public void modify(final ProgramContext prog)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public Tangents(FloatBuffer data)`

- Description: TODO

#### `public Tangents(Resource res, Message buf, int nv)`

- Description: TODO

#### `public BiTangents(FloatBuffer data)`

- Description: TODO

#### `public BiTangents(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO
