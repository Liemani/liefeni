# VertexBuf

## Meta

- Source: [VertexBuf.java](../../../src/haven/VertexBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Stores vertex buffers.

## Code Members

### Member Index

#### Fields

- [bufs](#member-1)
- [num](#member-2)
- [data](#member-3)
- [dbuf](#member-4)
- [attr](#member-11)
- [elfmt](#member-12)
- [data](#member-16)
- [data](#member-20)
- [rnames](#member-41)
- [b](#member-42)
- [id](#member-43)

#### Methods

- [buf(Class<T> type)](#member-5)
- [fmtfor(AttribData[] allbufs)](#member-6)
- [fmtdata()](#member-7)
- [data()](#member-8)
- [fill(VertexArray.Buffer vbuf, Environment env)](#member-9)
- [update(Render g)](#member-10)
- [AttribData(Attribute attr, VectorFormat elfmt)](#member-13)
- [public abstract void data(ByteBuffer dst, int offset, int stride);](#member-14)
- [public abstract int size();](#member-15)
- [FloatData(Attribute attr, int n, FloatBuffer data)](#member-17)
- [size()](#member-18)
- [data(ByteBuffer bdst, int offset, int stride)](#member-19)
- [IntData(Attribute attr, int n, IntBuffer data)](#member-21)
- [size()](#member-22)
- [data(ByteBuffer bdst, int offset, int stride)](#member-23)
- [VertexData(FloatBuffer data)](#member-24)
- [VertexData(Resource res, Message buf, int nv)](#member-25)
- [cons(Collection<AttribData> dst, Resource res, Message buf, int nv)](#member-26)
- [NormalData(FloatBuffer data)](#member-27)
- [NormalData(Resource res, Message buf, int nv)](#member-28)
- [cons(Collection<AttribData> dst, Resource res, Message buf, int nv)](#member-29)
- [ColorData(FloatBuffer data)](#member-30)
- [ColorData(Resource res, Message buf, int nv)](#member-31)
- [cons(Collection<AttribData> dst, Resource res, Message buf, int nv)](#member-32)
- [TexelData(FloatBuffer data)](#member-33)
- [TexelData(Resource res, Message buf, int nv)](#member-34)
- [cons(Collection<AttribData> dst, Resource res, Message buf, int nv)](#member-35)
- [dispose()](#member-36)
- [public String value();](#member-37)
- [public void cons(Collection<AttribData> dst, Resource res, Message buf, int nvert);](#member-38)
- [loadbuf(FloatBuffer dst, Message buf)](#member-39)
- [loadbuf2(FloatBuffer dst, Message buf)](#member-40)
- [VertexRes(Resource res, VertexBuf b)](#member-44)
- [VertexRes(Resource res, Message buf)](#member-45)
- [init()](#member-46)
- [layerid()](#member-47)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bufs`

- Description: TODO

<a id="member-2"></a>
##### `num`

- Description: TODO

<a id="member-3"></a>
##### `data`

- Description: TODO

<a id="member-4"></a>
##### `dbuf`

- Description: TODO

<a id="member-11"></a>
##### `attr`

- Description: TODO

<a id="member-12"></a>
##### `elfmt`

- Description: TODO

<a id="member-16"></a>
##### `data`

- Description: TODO

<a id="member-20"></a>
##### `data`

- Description: TODO

<a id="member-41"></a>
##### `rnames`

- Description: TODO

<a id="member-42"></a>
##### `b`

- Description: TODO

<a id="member-43"></a>
##### `id`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `buf(Class<T> type)`

- Description: TODO

<a id="member-6"></a>
##### `fmtfor(AttribData[] allbufs)`

- Description: TODO

<a id="member-7"></a>
##### `fmtdata()`

- Description: TODO

<a id="member-8"></a>
##### `data()`

- Description: TODO

<a id="member-9"></a>
##### `fill(VertexArray.Buffer vbuf, Environment env)`

- Description: TODO

<a id="member-10"></a>
##### `update(Render g)`

- Description: TODO

<a id="member-13"></a>
##### `AttribData(Attribute attr, VectorFormat elfmt)`

- Description: TODO

<a id="member-14"></a>
##### `public abstract void data(ByteBuffer dst, int offset, int stride);`

- Description: TODO

<a id="member-15"></a>
##### `public abstract int size();`

- Description: TODO

<a id="member-17"></a>
##### `FloatData(Attribute attr, int n, FloatBuffer data)`

- Description: TODO

<a id="member-18"></a>
##### `size()`

- Description: TODO

<a id="member-19"></a>
##### `data(ByteBuffer bdst, int offset, int stride)`

- Description: TODO

<a id="member-21"></a>
##### `IntData(Attribute attr, int n, IntBuffer data)`

- Description: TODO

<a id="member-22"></a>
##### `size()`

- Description: TODO

<a id="member-23"></a>
##### `data(ByteBuffer bdst, int offset, int stride)`

- Description: TODO

<a id="member-24"></a>
##### `VertexData(FloatBuffer data)`

- Description: TODO

<a id="member-25"></a>
##### `VertexData(Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-26"></a>
##### `cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-27"></a>
##### `NormalData(FloatBuffer data)`

- Description: TODO

<a id="member-28"></a>
##### `NormalData(Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-29"></a>
##### `cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-30"></a>
##### `ColorData(FloatBuffer data)`

- Description: TODO

<a id="member-31"></a>
##### `ColorData(Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-32"></a>
##### `cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-33"></a>
##### `TexelData(FloatBuffer data)`

- Description: TODO

<a id="member-34"></a>
##### `TexelData(Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-35"></a>
##### `cons(Collection<AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-36"></a>
##### `dispose()`

- Description: TODO

<a id="member-37"></a>
##### `public String value();`

- Description: TODO

<a id="member-38"></a>
##### `public void cons(Collection<AttribData> dst, Resource res, Message buf, int nvert);`

- Description: TODO

<a id="member-39"></a>
##### `loadbuf(FloatBuffer dst, Message buf)`

- Description: TODO

<a id="member-40"></a>
##### `loadbuf2(FloatBuffer dst, Message buf)`

- Description: TODO

<a id="member-44"></a>
##### `VertexRes(Resource res, VertexBuf b)`

- Description: TODO

<a id="member-45"></a>
##### `VertexRes(Resource res, Message buf)`

- Description: TODO

<a id="member-46"></a>
##### `init()`

- Description: TODO

<a id="member-47"></a>
##### `layerid()`

- Description: TODO
