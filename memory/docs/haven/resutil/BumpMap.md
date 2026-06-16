# BumpMap

This file documents the responsibilities and members of `BumpMap`.

## Meta

- Source: [BumpMap.java](../../../../src/haven/resutil/BumpMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for bump map.

## Nested Types

### $bump

- Role: Represents $bump within BumpMap.
- Description: Describes the nested $bump type used by the enclosing class.

### BiTangents

- Role: Represents bi tangents within BumpMap.
- Description: Describes the nested bi tangents type used by the enclosing class.

### BitDecode

- Role: Represents bit decode within BumpMap.
- Description: Describes the nested bit decode type used by the enclosing class.

### Shader

- Role: Represents shader within BumpMap.
- Description: Describes the nested shader type used by the enclosing class.

### TanDecode

- Role: Represents tan decode within BumpMap.
- Description: Describes the nested tan decode type used by the enclosing class.

### Tangents

- Role: Represents tangents within BumpMap.
- Description: Describes the nested tangents type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<BumpMap> slot = new Slot<BumpMap>(Slot.Type.DRAW, BumpMap.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute tan = new Attribute(VEC3, "tan")`
- Role: Defines the shared tan constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute bit = new Attribute(VEC3, "bit")`
- Role: Defines the shared bit constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Defines the shared ctex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying tanc = new AutoVarying(VEC3)`
- Role: Defines the shared tanc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying bitc = new AutoVarying(VEC3)`
- Role: Defines the shared bitc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Shader[] shaders =`
- Role: Defines the shared bump map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> ltan = new MeshBuf.V3LayerID(tan)`
- Role: Defines the shared ltan constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec3Layer> lbit = new MeshBuf.V3LayerID(bit)`
- Role: Defines the shared lbit constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sampler2D tex`
- Role: Holds the tex state.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final boolean otex`
- Role: Tracks the otex flag.
- Description: Supports the otex operation used by the surrounding class.

### Methods

#### `public BumpMap(Sampler2D tex, boolean otex)`
- Role: Creates a new BumpMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public BumpMap(Sampler2D tex)`
- Role: Creates a new BumpMap instance.
- Description: Constructs the instance and initializes its default state.

#### `private Shader(boolean otex)`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void modify(final ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public Tangents(FloatBuffer data)`
- Role: Performs tangents.
- Description: Supports the tangents operation used by the surrounding class.

#### `public Tangents(Resource res, Message buf, int nv)`
- Role: Performs tangents.
- Description: Supports the tangents operation used by the surrounding class.

#### `public BiTangents(FloatBuffer data)`
- Role: Performs bi tangents.
- Description: Supports the bi tangents operation used by the surrounding class.

#### `public BiTangents(Resource res, Message buf, int nv)`
- Role: Performs bi tangents.
- Description: Supports the bi tangents operation used by the surrounding class.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
