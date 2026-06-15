# VertexBuf

This file documents the responsibilities and members of `VertexBuf`.

## Meta

- Source: [VertexBuf.java](../../../src/haven/VertexBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Stores vertex buffers.

## Nested Types

### AttribData

- Description: TODO

### ColorData

- Description: TODO

### ColorDecode

- Description: TODO

### DataCons

- Description: TODO

### FloatData

- Description: TODO

### IntData

- Description: TODO

### NormalData

- Description: TODO

### NormalDecode

- Description: TODO

### ResName

- Description: TODO

### TexelData

- Description: TODO

### TexelDecode

- Description: TODO

### VertexData

- Description: TODO

### VertexDecode

- Description: TODO

### VertexRes

- Description: TODO

## Members

### Constants

#### `private static final Map<String, DataCons> rnames = new TreeMap<String, DataCons>()`

- Description: TODO

### Fields

#### `public final AttribData[] bufs`

- Description: TODO

#### `public final int num`

- Description: TODO

#### `private VertexArray data = null`

- Description: TODO

#### `private VertexArray.Buffer dbuf = null`

- Description: TODO

#### `public final Attribute attr`

- Description: TODO

#### `public final VectorFormat elfmt`

- Description: TODO

#### `public final FloatBuffer data`

- Description: TODO

#### `public final IntBuffer data`

- Description: TODO

#### `public transient final VertexBuf b`

- Description: TODO

#### `public final int id`

- Description: TODO

### Methods

#### `public VertexBuf(AttribData... bufs)`

- Description: TODO

#### `public <T extends AttribData> T buf(Class<T> type)`

- Description: TODO

#### `private static Layout fmtfor(AttribData[] allbufs)`

- Description: TODO

#### `protected VertexArray fmtdata()`

- Description: TODO

#### `public VertexArray data()`

- Description: TODO

#### `private FillBuffer fill(VertexArray.Buffer vbuf, Environment env)`

- Description: TODO

#### `public void update(Render g)`

- Description: TODO

#### `public AttribData(Attribute attr, VectorFormat elfmt)`

- Description: TODO

#### `public abstract void data(ByteBuffer dst, int offset, int stride)`

- Description: TODO

#### `public abstract int size()`

- Description: TODO

#### `public FloatData(Attribute attr, int n, FloatBuffer data)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public void data(ByteBuffer bdst, int offset, int stride)`

- Description: TODO

#### `public IntData(Attribute attr, int n, IntBuffer data)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public void data(ByteBuffer bdst, int offset, int stride)`

- Description: TODO

#### `public VertexData(FloatBuffer data)`

- Description: TODO

#### `public VertexData(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public NormalData(FloatBuffer data)`

- Description: TODO

#### `public NormalData(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public ColorData(FloatBuffer data)`

- Description: TODO

#### `public ColorData(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public TexelData(FloatBuffer data)`

- Description: TODO

#### `public TexelData(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String value()`

- Description: TODO

#### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nvert)`

- Description: TODO

#### `public static FloatBuffer loadbuf(FloatBuffer dst, Message buf)`

- Description: TODO

#### `public static FloatBuffer loadbuf2(FloatBuffer dst, Message buf)`

- Description: TODO

#### `private VertexRes(Resource res, VertexBuf b)`

- Description: TODO

#### `public VertexRes(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO
