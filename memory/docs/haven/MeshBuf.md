# MeshBuf

This file documents the responsibilities and members of `MeshBuf`.

## Meta

- Source: [MeshBuf.java](../../../src/haven/MeshBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Stores mutable mesh buffers.

## Nested Types

### ALayerID

- Description: TODO

### AttribData

- Description: TODO

### AttribLayer

- Description: TODO

### CLayerID

- Description: TODO

### Col

- Description: TODO

### Face

- Description: TODO

### Layer

- Description: TODO

### LayerID

- Description: TODO

### LayerMapper

- Description: TODO

### Tex

- Description: TODO

### V1LayerID

- Description: TODO

### V2LayerID

- Description: TODO

### V3LayerID

- Description: TODO

### V4LayerID

- Description: TODO

### Vec1Layer

- Description: TODO

### Vec2Layer

- Description: TODO

### Vec3Layer

- Description: TODO

### Vec4Layer

- Description: TODO

### Vertex

- Description: TODO

## Members

### Constants

#### `public static final LayerID<Tex> tex = new CLayerID<Tex>(Tex.class)`

- Description: TODO

#### `public static final LayerID<Col> col = new CLayerID<Col>(Col.class)`

- Description: TODO

#### `private static final LayerMapper defmapper = new LayerMapper()`

- Description: TODO

### Fields

#### `public final Collection<Vertex> v = new ArrayList<Vertex>()`

- Description: TODO

#### `public final Collection<Face> f = new ArrayList<Face>()`

- Description: TODO

#### `private VertexBuf vbuf = null`

- Description: TODO

#### `private int nextid = 0`

- Description: TODO

#### `private Layer<?>[] layers = new Layer<?>[0]`

- Description: TODO

#### `private LayerID<?>[] lids = new LayerID<?>[0]`

- Description: TODO

#### `public final int idx`

- Description: TODO

#### `public final Class<L> cl`

- Description: TODO

#### `private final java.lang.reflect.Constructor<L> cons`

- Description: TODO

#### `public final Attribute attrib`

- Description: TODO

#### `public final Attribute attrib`

- Description: TODO

#### `public Coord3f pos, nrm`

- Description: TODO

#### `public Coord3f pos, nrm`

- Description: TODO

#### `private Object[] attrs = new Object[layers.length]`

- Description: TODO

#### `private short idx`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

### Methods

#### `public Layer()`

- Description: TODO

#### `public void set(Vertex v, T data)`

- Description: TODO

#### `public T get(Vertex v)`

- Description: TODO

#### `public abstract VertexBuf.AttribData build(Collection<T> in)`

- Description: TODO

#### `public void copy(VertexBuf src, Vertex[] vmap, int off)`

- Description: TODO

#### `public abstract L cons(MeshBuf buf)`

- Description: TODO

#### `public CLayerID(Class<L> cl)`

- Description: TODO

#### `public L cons(MeshBuf buf)`

- Description: TODO

#### `public VertexBuf.TexelData build(Collection<Coord3f> in)`

- Description: TODO

#### `public void copy(VertexBuf buf, Vertex[] vmap, int off)`

- Description: TODO

#### `public VertexBuf.ColorData build(Collection<Color> in)`

- Description: TODO

#### `public AttribData(Attribute attrib, int nc, FloatBuffer data)`

- Description: TODO

#### `public AttribLayer(Attribute attrib)`

- Description: TODO

#### `public Vec1Layer(Attribute attrib)`

- Description: TODO

#### `public AttribData build(Collection<Float> in)`

- Description: TODO

#### `public Vec2Layer(Attribute attrib)`

- Description: TODO

#### `public AttribData build(Collection<Coord3f> in)`

- Description: TODO

#### `public Vec3Layer(Attribute attrib)`

- Description: TODO

#### `public AttribData build(Collection<Coord3f> in)`

- Description: TODO

#### `public Vec4Layer(Attribute attrib)`

- Description: TODO

#### `public AttribData build(Collection<float[]> in)`

- Description: TODO

#### `public ALayerID(Attribute attrib)`

- Description: TODO

#### `public V1LayerID(Attribute attrib)`

- Description: TODO

#### `public Vec1Layer cons(MeshBuf buf)`

- Description: TODO

#### `public V2LayerID(Attribute attrib)`

- Description: TODO

#### `public Vec2Layer cons(MeshBuf buf)`

- Description: TODO

#### `public V3LayerID(Attribute attrib)`

- Description: TODO

#### `public Vec3Layer cons(MeshBuf buf)`

- Description: TODO

#### `public V4LayerID(Attribute attrib)`

- Description: TODO

#### `public Vec4Layer cons(MeshBuf buf)`

- Description: TODO

#### `public <L extends Layer> L layer(LayerID<L> id)`

- Description: TODO

#### `public Vertex(Coord3f pos, Coord3f nrm)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`

- Description: TODO

#### `public Layer mapbuf(MeshBuf buf, VertexBuf.AttribData src)`

- Description: TODO

#### `public Vertex[] copy(FastMesh src, LayerMapper mapper)`

- Description: TODO

#### `public Vertex[] copy(FastMesh src)`

- Description: TODO

#### `private <T> VertexBuf.AttribData mklayer(Layer<T> l, Object[] abuf)`

- Description: TODO

#### `private void mkvbuf()`

- Description: TODO

#### `public void clearfaces()`

- Description: TODO

#### `public FastMesh mkmesh()`

- Description: TODO

#### `public boolean emptyp()`

- Description: TODO
