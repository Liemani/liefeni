---
source: [VertexBuf.java](../../../../src/haven/VertexBuf.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexBuf

Represents the vertex buf Haven component.

## Nested Types

### AttribData

- Role: Describes one vertex attribute buffer.
- Description: Abstract base for attribute-backed vertex data with a render attribute and element format.

### ColorData

- Role: Stores packed vertex color data.
- Description: Float-backed attribute data for per-vertex color values.

### ColorDecode

- Role: Decodes color data from a resource buffer.
- Description: Data consumer that reads packed color vertices into a color attribute buffer.

### DataCons

- Role: Consumes decoded vertex attribute data.
- Description: Interface used by resource decoders to populate vertex attribute collections.

### FloatData

- Role: Stores float-backed vertex attributes.
- Description: Base class for attributes packed as float arrays.

### IntData

- Role: Stores int-backed vertex attributes.
- Description: Base class for attributes packed as int arrays.

### NormalData

- Role: Stores per-vertex normal vectors.
- Description: Float-backed attribute data for normals.

### NormalDecode

- Role: Decodes normal data from a resource buffer.
- Description: Data consumer that reads packed normals into a normal attribute buffer.

### ResName

- Role: Registers a resource-backed vertex buffer name.
- Description: Marker for vertex data resources that can be loaded by name.

### TexelData

- Role: Stores per-vertex texture coordinates.
- Description: Float-backed attribute data for texture coordinates.

### TexelDecode

- Role: Decodes texture coordinate data from a resource buffer.
- Description: Data consumer that reads packed texel coordinates into a texture attribute buffer.

### VertexData

- Role: Stores 3D vertex positions.
- Description: Float-backed attribute data for vertex positions.

### VertexDecode

- Role: Decodes vertex position data from a resource buffer.
- Description: Data consumer that reads packed positions into a vertex attribute buffer.

### VertexRes

- Role: Registers the vertex position resource name.
- Description: Marker for position vertex data resources that can be loaded by name.

## Members

### Constants

#### `private static final Map<String, DataCons> rnames = new TreeMap<String, DataCons>()`
- Role: Implements the rnames operation.
- Description: Implements the private static final map<string, data cons> rnames = new tree map<string, data cons>() operation.
- Value: `new TreeMap<String, DataCons>()`

### Fields

#### `public final AttribData[] bufs`
- Role: Caches the bufs value.
- Description: Caches the `bufs` value for reuse.

#### `public final int num`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `private VertexArray data = null`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private VertexArray.Buffer dbuf = null`
- Role: Caches the dbuf value.
- Description: Caches the `dbuf` value for reuse.

#### `public final Attribute attr`
- Role: Caches the attr value.
- Description: Caches the `attr` value for reuse.

#### `public final VectorFormat elfmt`
- Role: Caches the elfmt value.
- Description: Caches the `elfmt` value for reuse.

#### `public final FloatBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `public final IntBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `public transient final VertexBuf b`
- Role: Caches the b value.
- Description: Caches the `b` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public VertexBuf(AttribData... bufs)`
- Role: Creates a new VertexBuf instance.
- Description: Constructs the VertexBuf instance from the supplied inputs.

#### `public <T extends AttribData> T buf(Class<T> type)`
- Role: Handles the buffer path.
- Description: Implements the buf operation.

#### `private static Layout fmtfor(AttribData[] allbufs)`
- Role: Handles the fmtfor path.
- Description: Implements the fmtfor operation.

#### `protected VertexArray fmtdata()`
- Role: Handles the fmtdata path.
- Description: Implements the fmtdata operation.

#### `public VertexArray data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `private FillBuffer fill(VertexArray.Buffer vbuf, Environment env)`
- Role: Handles the fill path.
- Description: Implements the fill operation.

#### `public void update(Render g)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public AttribData(Attribute attr, VectorFormat elfmt)`
- Role: Handles the attrib data path.
- Description: Implements the attrib data operation.

#### `public abstract void data(ByteBuffer dst, int offset, int stride)`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public abstract int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public FloatData(Attribute attr, int n, FloatBuffer data)`
- Role: Handles the float data path.
- Description: Implements the float data operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public void data(ByteBuffer bdst, int offset, int stride)`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public IntData(Attribute attr, int n, IntBuffer data)`
- Role: Handles the int data path.
- Description: Implements the int data operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public void data(ByteBuffer bdst, int offset, int stride)`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public VertexData(FloatBuffer data)`
- Role: Handles the vertex data path.
- Description: Implements the vertex data operation.

#### `public VertexData(Resource res, Message buf, int nv)`
- Role: Handles the vertex data path.
- Description: Implements the vertex data operation.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public NormalData(FloatBuffer data)`
- Role: Handles the normal data path.
- Description: Implements the normal data operation.

#### `public NormalData(Resource res, Message buf, int nv)`
- Role: Handles the normal data path.
- Description: Implements the normal data operation.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public ColorData(FloatBuffer data)`
- Role: Handles the color data path.
- Description: Implements the color data operation.

#### `public ColorData(Resource res, Message buf, int nv)`
- Role: Handles the color data path.
- Description: Implements the color data operation.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public TexelData(FloatBuffer data)`
- Role: Handles the texel data path.
- Description: Implements the texel data operation.

#### `public TexelData(Resource res, Message buf, int nv)`
- Role: Handles the texel data path.
- Description: Implements the texel data operation.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String value()`
- Role: Handles the value path.
- Description: Implements the value operation.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nvert)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public static FloatBuffer loadbuf(FloatBuffer dst, Message buf)`
- Role: Handles the loadbuf path.
- Description: Loads the buf.

#### `public static FloatBuffer loadbuf2(FloatBuffer dst, Message buf)`
- Role: Handles the loadbuf2 path.
- Description: Loads the buf2.

#### `private VertexRes(Resource res, VertexBuf b)`
- Role: Handles the vertex resource path.
- Description: Implements the vertex res operation.

#### `public VertexRes(Resource res, Message buf)`
- Role: Handles the vertex resource path.
- Description: Implements the vertex res operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.