# Render

## Meta

- Source: [Render.java](../../../../src/haven/render/Render.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides render execution support.

## Code Members

### Member Index

#### Methods

- [public Environment env();](#member-1)
- [public void submit(Render sub);](#member-2)
- [public void draw(Pipe pipe, Model data);](#member-3)
- [public void clear(Pipe pipe, FragData buf, FColor val);](#member-4)
- [public void clear(Pipe pipe, double val);](#member-5)
- [public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to);](#member-6)
- [public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data);](#member-7)
- [public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback);](#member-8)
- [public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback);](#member-9)
- [public void timestamp(Consumer<Long> callback);](#member-10)
- [public void fence(Runnable callback);](#member-11)
- [draw1(Pipe pipe, Model data)](#member-12)
- [draw(Pipe pipe, Model.Mode mode, short[] ind, VertexArray.Layout fmt, int n, float[] data)](#member-13)
- [pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, Consumer<ByteBuffer> callback)](#member-14)
- [pget(Texture.Image img, VectorFormat fmt, Consumer<ByteBuffer> callback)](#member-15)

### Member Reference

#### Methods

<a id="member-1"></a>
##### `public Environment env();`

- Description: TODO

<a id="member-2"></a>
##### `public void submit(Render sub);`

- Description: TODO

<a id="member-3"></a>
##### `public void draw(Pipe pipe, Model data);`

- Description: TODO

<a id="member-4"></a>
##### `public void clear(Pipe pipe, FragData buf, FColor val);`

- Description: TODO

<a id="member-5"></a>
##### `public void clear(Pipe pipe, double val);`

- Description: TODO

<a id="member-6"></a>
##### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to);`

- Description: TODO

<a id="member-7"></a>
##### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data);`

- Description: TODO

<a id="member-8"></a>
##### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback);`

- Description: TODO

<a id="member-9"></a>
##### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback);`

- Description: TODO

<a id="member-10"></a>
##### `public void timestamp(Consumer<Long> callback);`

- Description: TODO

<a id="member-11"></a>
##### `public void fence(Runnable callback);`

- Description: TODO

<a id="member-12"></a>
##### `draw1(Pipe pipe, Model data)`

- Description: TODO

<a id="member-13"></a>
##### `draw(Pipe pipe, Model.Mode mode, short[] ind, VertexArray.Layout fmt, int n, float[] data)`

- Description: TODO

<a id="member-14"></a>
##### `pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, Consumer<ByteBuffer> callback)`

- Description: TODO

<a id="member-15"></a>
##### `pget(Texture.Image img, VectorFormat fmt, Consumer<ByteBuffer> callback)`

- Description: TODO
