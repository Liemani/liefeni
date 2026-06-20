---
source: [VertexBuf.java](../../../src/haven/VertexBuf.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexBuf

Represents the vertex buf Haven component.

## Nested Types

### AttribData

- Role: Represents attrib data within VertexBuf.
- Description: Describes the nested attrib data type used by the enclosing class.

### ColorData

- Role: Represents color data within VertexBuf.
- Description: Describes the nested color data type used by the enclosing class.

### ColorDecode

- Role: Represents color decode within VertexBuf.
- Description: Describes the nested color decode type used by the enclosing class.

### DataCons

- Role: Represents data cons within VertexBuf.
- Description: Describes the nested data cons type used by the enclosing class.

### FloatData

- Role: Represents float data within VertexBuf.
- Description: Describes the nested float data type used by the enclosing class.

### IntData

- Role: Represents int data within VertexBuf.
- Description: Describes the nested int data type used by the enclosing class.

### NormalData

- Role: Represents normal data within VertexBuf.
- Description: Describes the nested normal data type used by the enclosing class.

### NormalDecode

- Role: Represents normal decode within VertexBuf.
- Description: Describes the nested normal decode type used by the enclosing class.

### ResName

- Role: Represents res name within VertexBuf.
- Description: Describes the nested res name type used by the enclosing class.

### TexelData

- Role: Represents texel data within VertexBuf.
- Description: Describes the nested texel data type used by the enclosing class.

### TexelDecode

- Role: Represents texel decode within VertexBuf.
- Description: Describes the nested texel decode type used by the enclosing class.

### VertexData

- Role: Represents vertex data within VertexBuf.
- Description: Describes the nested vertex data type used by the enclosing class.

### VertexDecode

- Role: Represents vertex decode within VertexBuf.
- Description: Describes the nested vertex decode type used by the enclosing class.

### VertexRes

- Role: Represents vertex res within VertexBuf.
- Description: Describes the nested vertex res type used by the enclosing class.

## Members

### Constants

#### `private static final Map<String, DataCons> rnames = new TreeMap<String, DataCons>()`
- Role: Defines the shared rnames constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final AttribData[] bufs`
- Role: Holds the bufs state.
- Description: Backs the cached state for this file.

#### `public final int num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `private VertexArray data = null`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private VertexArray.Buffer dbuf = null`
- Role: Caches dbuf entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Attribute attr`
- Role: Holds the attr state.
- Description: Backs the cached state for this file.

#### `public final VectorFormat elfmt`
- Role: Holds the elfmt state.
- Description: Backs the cached state for this file.

#### `public final FloatBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `public final IntBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `public transient final VertexBuf b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public VertexBuf(AttribData... bufs)`
- Role: Creates a new VertexBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public <T extends AttribData> T buf(Class<T> type)`
- Role: Performs buf.
- Description: Supports the buf operation used by the surrounding class.

#### `private static Layout fmtfor(AttribData[] allbufs)`
- Role: Performs fmtfor.
- Description: Supports the fmtfor operation used by the surrounding class.

#### `protected VertexArray fmtdata()`
- Role: Performs fmtdata.
- Description: Supports the fmtdata operation used by the surrounding class.

#### `public VertexArray data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `private FillBuffer fill(VertexArray.Buffer vbuf, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public void update(Render g)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public AttribData(Attribute attr, VectorFormat elfmt)`
- Role: Performs attrib data.
- Description: Supports the attrib data operation used by the surrounding class.

#### `public abstract void data(ByteBuffer dst, int offset, int stride)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public abstract int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public FloatData(Attribute attr, int n, FloatBuffer data)`
- Role: Performs float data.
- Description: Supports the float data operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public void data(ByteBuffer bdst, int offset, int stride)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public IntData(Attribute attr, int n, IntBuffer data)`
- Role: Performs int data.
- Description: Supports the int data operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public void data(ByteBuffer bdst, int offset, int stride)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public VertexData(FloatBuffer data)`
- Role: Performs vertex data.
- Description: Supports the vertex data operation used by the surrounding class.

#### `public VertexData(Resource res, Message buf, int nv)`
- Role: Performs vertex data.
- Description: Supports the vertex data operation used by the surrounding class.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public NormalData(FloatBuffer data)`
- Role: Performs normal data.
- Description: Supports the normal data operation used by the surrounding class.

#### `public NormalData(Resource res, Message buf, int nv)`
- Role: Performs normal data.
- Description: Supports the normal data operation used by the surrounding class.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public ColorData(FloatBuffer data)`
- Role: Performs color data.
- Description: Supports the color data operation used by the surrounding class.

#### `public ColorData(Resource res, Message buf, int nv)`
- Role: Performs color data.
- Description: Supports the color data operation used by the surrounding class.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public TexelData(FloatBuffer data)`
- Role: Performs texel data.
- Description: Supports the texel data operation used by the surrounding class.

#### `public TexelData(Resource res, Message buf, int nv)`
- Role: Performs texel data.
- Description: Supports the texel data operation used by the surrounding class.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nvert)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public static FloatBuffer loadbuf(FloatBuffer dst, Message buf)`
- Role: Performs loadbuf.
- Description: Supports the loadbuf operation used by the surrounding class.

#### `public static FloatBuffer loadbuf2(FloatBuffer dst, Message buf)`
- Role: Performs loadbuf2.
- Description: Supports the loadbuf2 operation used by the surrounding class.

#### `private VertexRes(Resource res, VertexBuf b)`
- Role: Performs vertex res.
- Description: Supports the vertex res operation used by the surrounding class.

#### `public VertexRes(Resource res, Message buf)`
- Role: Performs vertex res.
- Description: Supports the vertex res operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.
