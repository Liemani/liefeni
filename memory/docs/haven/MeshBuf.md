# MeshBuf

This file documents the responsibilities and members of `MeshBuf`.

## Meta

- Source: [MeshBuf.java](../../../src/haven/MeshBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the mesh buf Haven component.

## Nested Types

### ALayerID

- Role: Represents alayer id within MeshBuf.
- Description: Describes the nested alayer id type used by the enclosing class.

### AttribData

- Role: Represents attrib data within MeshBuf.
- Description: Describes the nested attrib data type used by the enclosing class.

### AttribLayer

- Role: Represents attrib layer within MeshBuf.
- Description: Describes the nested attrib layer type used by the enclosing class.

### CLayerID

- Role: Represents clayer id within MeshBuf.
- Description: Describes the nested clayer id type used by the enclosing class.

### Col

- Role: Represents col within MeshBuf.
- Description: Describes the nested col type used by the enclosing class.

### Face

- Role: Represents face within MeshBuf.
- Description: Describes the nested face type used by the enclosing class.

### Layer

- Role: Represents layer within MeshBuf.
- Description: Describes the nested layer type used by the enclosing class.

### LayerID

- Role: Represents layer id within MeshBuf.
- Description: Describes the nested layer id type used by the enclosing class.

### LayerMapper

- Role: Represents layer mapper within MeshBuf.
- Description: Describes the nested layer mapper type used by the enclosing class.

### Tex

- Role: Represents tex within MeshBuf.
- Description: Describes the nested tex type used by the enclosing class.

### V1LayerID

- Role: Represents v1 layer id within MeshBuf.
- Description: Describes the nested v1 layer id type used by the enclosing class.

### V2LayerID

- Role: Represents v2 layer id within MeshBuf.
- Description: Describes the nested v2 layer id type used by the enclosing class.

### V3LayerID

- Role: Represents v3 layer id within MeshBuf.
- Description: Describes the nested v3 layer id type used by the enclosing class.

### V4LayerID

- Role: Represents v4 layer id within MeshBuf.
- Description: Describes the nested v4 layer id type used by the enclosing class.

### Vec1Layer

- Role: Represents vec1 layer within MeshBuf.
- Description: Describes the nested vec1 layer type used by the enclosing class.

### Vec2Layer

- Role: Represents vec2 layer within MeshBuf.
- Description: Describes the nested vec2 layer type used by the enclosing class.

### Vec3Layer

- Role: Represents vec3 layer within MeshBuf.
- Description: Describes the nested vec3 layer type used by the enclosing class.

### Vec4Layer

- Role: Represents vec4 layer within MeshBuf.
- Description: Describes the nested vec4 layer type used by the enclosing class.

### Vertex

- Role: Represents vertex within MeshBuf.
- Description: Describes the nested vertex type used by the enclosing class.

## Members

### Constants

#### `public static final LayerID<Tex> tex = new CLayerID<Tex>(Tex.class)`
- Role: Defines the shared tex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final LayerID<Col> col = new CLayerID<Col>(Col.class)`
- Role: Defines the shared col constant.
- Description: Shared constant used by the rest of the class.

#### `private static final LayerMapper defmapper = new LayerMapper()`
- Role: Defines the shared defmapper constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Collection<Vertex> v = new ArrayList<Vertex>()`
- Role: Caches v entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Face> f = new ArrayList<Face>()`
- Role: Caches f entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private VertexBuf vbuf = null`
- Role: Stores the vbuf value.
- Description: Backs the cached state for this file.

#### `private int nextid = 0`
- Role: Stores the nextid value.
- Description: Backs the cached state for this file.

#### `private Layer<?>[] layers = new Layer<?>[0]`
- Role: Holds the layers state.
- Description: Backs the cached state for this file.

#### `private LayerID<?>[] lids = new LayerID<?>[0]`
- Role: Holds the lids state.
- Description: Backs the cached state for this file.

#### `public final int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public final Class<L> cl`
- Role: Holds the cl state.
- Description: Backs the cached state for this file.

#### `private final java.lang.reflect.Constructor<L> cons`
- Role: Holds the cons state.
- Description: Backs the cached state for this file.

#### `public final Attribute attrib`
- Role: Holds the attrib state.
- Description: Backs the cached state for this file.

#### `public final Attribute attrib`
- Role: Holds the attrib state.
- Description: Backs the cached state for this file.

#### `public Coord3f pos, nrm`
- Role: Stores the nrm value.
- Description: Backs the cached state for this file.

#### `public Coord3f pos, nrm`
- Role: Stores the nrm value.
- Description: Backs the cached state for this file.

#### `private Object[] attrs = new Object[layers.length]`
- Role: Holds the attrs state.
- Description: Backs the cached state for this file.

#### `private short idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

### Methods

#### `public Layer()`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public void set(Vertex v, T data)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public T get(Vertex v)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public abstract VertexBuf.AttribData build(Collection<T> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public void copy(VertexBuf src, Vertex[] vmap, int off)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public abstract L cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public CLayerID(Class<L> cl)`
- Role: Performs clayer id.
- Description: Supports the clayer id operation used by the surrounding class.

#### `public L cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public VertexBuf.TexelData build(Collection<Coord3f> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public void copy(VertexBuf buf, Vertex[] vmap, int off)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public VertexBuf.ColorData build(Collection<Color> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public AttribData(Attribute attrib, int nc, FloatBuffer data)`
- Role: Performs attrib data.
- Description: Supports the attrib data operation used by the surrounding class.

#### `public AttribLayer(Attribute attrib)`
- Role: Performs attrib layer.
- Description: Supports the attrib layer operation used by the surrounding class.

#### `public Vec1Layer(Attribute attrib)`
- Role: Performs vec1 layer.
- Description: Supports the vec1 layer operation used by the surrounding class.

#### `public AttribData build(Collection<Float> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public Vec2Layer(Attribute attrib)`
- Role: Performs vec2 layer.
- Description: Supports the vec2 layer operation used by the surrounding class.

#### `public AttribData build(Collection<Coord3f> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public Vec3Layer(Attribute attrib)`
- Role: Performs vec3 layer.
- Description: Supports the vec3 layer operation used by the surrounding class.

#### `public AttribData build(Collection<Coord3f> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public Vec4Layer(Attribute attrib)`
- Role: Performs vec4 layer.
- Description: Supports the vec4 layer operation used by the surrounding class.

#### `public AttribData build(Collection<float[]> in)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public ALayerID(Attribute attrib)`
- Role: Performs alayer id.
- Description: Supports the alayer id operation used by the surrounding class.

#### `public V1LayerID(Attribute attrib)`
- Role: Performs v1 layer id.
- Description: Supports the v1 layer id operation used by the surrounding class.

#### `public Vec1Layer cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public V2LayerID(Attribute attrib)`
- Role: Performs v2 layer id.
- Description: Supports the v2 layer id operation used by the surrounding class.

#### `public Vec2Layer cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public V3LayerID(Attribute attrib)`
- Role: Performs v3 layer id.
- Description: Supports the v3 layer id operation used by the surrounding class.

#### `public Vec3Layer cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public V4LayerID(Attribute attrib)`
- Role: Performs v4 layer id.
- Description: Supports the v4 layer id operation used by the surrounding class.

#### `public Vec4Layer cons(MeshBuf buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public <L extends Layer> L layer(LayerID<L> id)`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public Vertex(Coord3f pos, Coord3f nrm)`
- Role: Performs vertex.
- Description: Supports the vertex operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`
- Role: Performs face.
- Description: Supports the face operation used by the surrounding class.

#### `public Layer mapbuf(MeshBuf buf, VertexBuf.AttribData src)`
- Role: Performs mapbuf.
- Description: Supports the mapbuf operation used by the surrounding class.

#### `public Vertex[] copy(FastMesh src, LayerMapper mapper)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public Vertex[] copy(FastMesh src)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `private <T> VertexBuf.AttribData mklayer(Layer<T> l, Object[] abuf)`
- Role: Performs mklayer.
- Description: Supports the mklayer operation used by the surrounding class.

#### `private void mkvbuf()`
- Role: Performs mkvbuf.
- Description: Supports the mkvbuf operation used by the surrounding class.

#### `public void clearfaces()`
- Role: Performs clearfaces.
- Description: Supports the clearfaces operation used by the surrounding class.

#### `public FastMesh mkmesh()`
- Role: Performs mkmesh.
- Description: Supports the mkmesh operation used by the surrounding class.

#### `public boolean emptyp()`
- Role: Performs emptyp.
- Description: Supports the emptyp operation used by the surrounding class.
