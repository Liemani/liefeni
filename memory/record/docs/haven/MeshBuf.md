---
source: [MeshBuf.java](../../../../src/haven/MeshBuf.java)
created: 2026-06-13
updated: 2026-06-14
---

# MeshBuf

Represents the mesh buf Haven component.

## Nested Types

### ALayerID

- Role: Identifies an attribute-backed layer.
- Description: Creates a typed layer instance from a vertex attribute definition.

### AttribData

- Role: Holds packed attribute data.
- Description: Wraps float buffers for vertex attributes and carries the attribute format.

### AttribLayer

- Role: Stores one mesh attribute layer.
- Description: Binds a layer to a render attribute and exposes packing behavior.

### CLayerID

- Role: Identifies a class-constructed layer.
- Description: Instantiates a layer by reflecting the nested layer constructor on demand.

### Col

- Role: Stores per-vertex color data.
- Description: Packs RGBA color values into a vertex buffer layer.

### Face

- Role: Stores one triangle face.
- Description: Links three mesh vertices into a single face record.

### Layer

- Role: Defines one mesh data layer.
- Description: Manages per-vertex payloads and converts them into vertex-buffer data.

### LayerID

- Role: Identifies a mesh layer type.
- Description: Creates or resolves the layer instance associated with a buffer.

### LayerMapper

- Role: Maps source vertex layers into mesh layers.
- Description: Bridges source vertex buffer attributes to mesh-local layers during copy.

### Tex

- Role: Stores per-vertex texture coordinates.
- Description: Packs 2D texture coordinates into a mesh layer.

### V1LayerID

- Role: Identifies a one-component attribute layer.
- Description: Creates a `Vec1Layer` bound to a render attribute.

### V2LayerID

- Role: Identifies a two-component attribute layer.
- Description: Creates a `Vec2Layer` bound to a render attribute.

### V3LayerID

- Role: Identifies a three-component attribute layer.
- Description: Creates a `Vec3Layer` bound to a render attribute.

### V4LayerID

- Role: Identifies a four-component attribute layer.
- Description: Creates a `Vec4Layer` bound to a render attribute.

### Vec1Layer

- Role: Stores scalar attribute data.
- Description: Packs one float per vertex for custom shader attributes.

### Vec2Layer

- Role: Stores two-component attribute data.
- Description: Packs two floats per vertex for custom shader attributes.

### Vec3Layer

- Role: Stores three-component attribute data.
- Description: Packs three floats per vertex for custom shader attributes.

### Vec4Layer

- Role: Stores four-component attribute data.
- Description: Packs four floats per vertex for custom shader attributes.

### Vertex

- Role: Stores one mesh vertex.
- Description: Holds position, normal, and per-layer attributes for a vertex in the buffer.

## Members

### Constants

#### `public static final LayerID<Tex> tex = new CLayerID<Tex>(Tex.class)`
- Role: Implements the tex operation.
- Description: Implements the public static final layer id<tex> tex = new c layer id<tex>(tex.class) operation.
- Value: `new CLayerID<Tex>(Tex.class)`

#### `public static final LayerID<Col> col = new CLayerID<Col>(Col.class)`
- Role: Implements the col operation.
- Description: Implements the public static final layer id<col> col = new c layer id<col>(col.class) operation.
- Value: `new CLayerID<Col>(Col.class)`

#### `private static final LayerMapper defmapper = new LayerMapper()`
- Role: Implements the defmapper operation.
- Description: Implements the layer mapper operation.
- Value: `new LayerMapper()`

### Fields

#### `public final Collection<Vertex> v = new ArrayList<Vertex>()`
- Role: Implements the v operation.
- Description: Implements the public final collection<vertex> v = new array list<vertex>() operation.

#### `public final Collection<Face> f = new ArrayList<Face>()`
- Role: Implements the f operation.
- Description: Implements the public final collection<face> f = new array list<face>() operation.

#### `private VertexBuf vbuf = null`
- Role: Caches the vbuf value.
- Description: Caches the `vbuf` value for reuse.

#### `private int nextid = 0`
- Role: Caches the nextid value.
- Description: Caches the `nextid` value for reuse.

#### `private Layer<?>[] layers = new Layer<?>[0]`
- Role: Caches the layers value.
- Description: Caches the `layers` value for reuse.

#### `private LayerID<?>[] lids = new LayerID<?>[0]`
- Role: Caches the lids value.
- Description: Caches the `lids` value for reuse.

#### `public final int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public final Class<L> cl`
- Role: Caches the cl value.
- Description: Caches the `cl` value for reuse.

#### `private final java.lang.reflect.Constructor<L> cons`
- Role: Caches the cons value.
- Description: Caches the `cons` value for reuse.

#### `public final Attribute attrib`
- Role: Caches the attrib value.
- Description: Caches the `attrib` value for reuse.

#### `public final Attribute attrib`
- Role: Caches the attrib value.
- Description: Caches the `attrib` value for reuse.

#### `public Coord3f pos, nrm`
- Role: Caches the nrm value.
- Description: Caches the `nrm` value for reuse.

#### `public Coord3f pos, nrm`
- Role: Caches the nrm value.
- Description: Caches the `nrm` value for reuse.

#### `private Object[] attrs = new Object[layers.length]`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `private short idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

### Methods

#### `public Layer()`
- Role: Handles the layer path.
- Description: Implements the layer operation.

#### `public void set(Vertex v, T data)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public T get(Vertex v)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public abstract VertexBuf.AttribData build(Collection<T> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public void copy(VertexBuf src, Vertex[] vmap, int off)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public abstract L cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public CLayerID(Class<L> cl)`
- Role: Handles the clayer id path.
- Description: Implements the c layer id operation.

#### `public L cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public VertexBuf.TexelData build(Collection<Coord3f> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public void copy(VertexBuf buf, Vertex[] vmap, int off)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public VertexBuf.ColorData build(Collection<Color> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public AttribData(Attribute attrib, int nc, FloatBuffer data)`
- Role: Handles the attrib data path.
- Description: Implements the attrib data operation.

#### `public AttribLayer(Attribute attrib)`
- Role: Handles the attrib layer path.
- Description: Implements the attrib layer operation.

#### `public Vec1Layer(Attribute attrib)`
- Role: Handles the vec1 layer path.
- Description: Implements the vec1 layer operation.

#### `public AttribData build(Collection<Float> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public Vec2Layer(Attribute attrib)`
- Role: Handles the vec2 layer path.
- Description: Implements the vec2 layer operation.

#### `public AttribData build(Collection<Coord3f> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public Vec3Layer(Attribute attrib)`
- Role: Handles the vec3 layer path.
- Description: Implements the vec3 layer operation.

#### `public AttribData build(Collection<Coord3f> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public Vec4Layer(Attribute attrib)`
- Role: Handles the vec4 layer path.
- Description: Implements the vec4 layer operation.

#### `public AttribData build(Collection<float[]> in)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public ALayerID(Attribute attrib)`
- Role: Handles the alayer id path.
- Description: Implements the a layer id operation.

#### `public V1LayerID(Attribute attrib)`
- Role: Handles the v1 layer id path.
- Description: Implements the v1 layer id operation.

#### `public Vec1Layer cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public V2LayerID(Attribute attrib)`
- Role: Handles the v2 layer id path.
- Description: Implements the v2 layer id operation.

#### `public Vec2Layer cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public V3LayerID(Attribute attrib)`
- Role: Handles the v3 layer id path.
- Description: Implements the v3 layer id operation.

#### `public Vec3Layer cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public V4LayerID(Attribute attrib)`
- Role: Handles the v4 layer id path.
- Description: Implements the v4 layer id operation.

#### `public Vec4Layer cons(MeshBuf buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public <L extends Layer> L layer(LayerID<L> id)`
- Role: Handles the layer path.
- Description: Implements the layer operation.

#### `public Vertex(Coord3f pos, Coord3f nrm)`
- Role: Handles the vertex path.
- Description: Implements the vertex operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this MeshBuf for debugging and logging.

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`
- Role: Handles the face path.
- Description: Implements the face operation.

#### `public Layer mapbuf(MeshBuf buf, VertexBuf.AttribData src)`
- Role: Handles the mapbuf path.
- Description: Implements the mapbuf operation.

#### `public Vertex[] copy(FastMesh src, LayerMapper mapper)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public Vertex[] copy(FastMesh src)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `private <T> VertexBuf.AttribData mklayer(Layer<T> l, Object[] abuf)`
- Role: Handles the mklayer path.
- Description: Implements the mklayer operation.

#### `private void mkvbuf()`
- Role: Handles the mkvbuf path.
- Description: Implements the mkvbuf operation.

#### `public void clearfaces()`
- Role: Handles the clearfaces path.
- Description: Clears the faces.

#### `public FastMesh mkmesh()`
- Role: Handles the mkmesh path.
- Description: Implements the mkmesh operation.

#### `public boolean emptyp()`
- Role: Handles the emptyp path.
- Description: Implements the emptyp operation.