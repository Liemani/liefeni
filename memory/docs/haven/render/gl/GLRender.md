# GLRender

## Meta

- Source: [GLRender.java](../../../../../src/haven/render/gl/GLRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides GL render support.

## Code Members

### Member Index

#### Fields

- [env](#member-1)
- [gl](#member-2)
- [state](#member-3)
- [init](#member-4)
- [seq](#member-5)
- [disposed](#member-6)

#### Methods

- [env()](#member-7)
- [gl()](#member-8)
- [glmode(Model.Mode mode)](#member-9)
- [glattribfmt(NumberFormat fmt)](#member-10)
- [glattribnorm(NumberFormat fmt)](#member-11)
- [glindexfmt(NumberFormat fmt)](#member-12)
- [glsamplertarget(Type type)](#member-13)
- [submit(Render gsub)](#member-14)
- [draw(Pipe pipe, Model data)](#member-15)
- [clear(Pipe pipe, FragData buf, FColor val)](#member-16)
- [clear(Pipe pipe, double val)](#member-17)
- [update(T buf, DataBuffer.Filler<? super T> fill)](#member-18)
- [update(T buf, DataBuffer.PartFiller<? super T> fill, int from, int to)](#member-19)
- [pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)](#member-20)
- [pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)](#member-21)
- [timestamp(Consumer<Long> callback)](#member-22)
- [fence(Runnable callback)](#member-23)
- [submit(BGL.Request req)](#member-24)
- [dispose()](#member-25)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `env`

- Description: TODO

<a id="member-2"></a>
##### `gl`

- Description: TODO

<a id="member-3"></a>
##### `state`

- Description: TODO

<a id="member-4"></a>
##### `init`

- Description: TODO

<a id="member-5"></a>
##### `seq`

- Description: TODO

<a id="member-6"></a>
##### `disposed`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `env()`

- Description: TODO

<a id="member-8"></a>
##### `gl()`

- Description: TODO

<a id="member-9"></a>
##### `glmode(Model.Mode mode)`

- Description: TODO

<a id="member-10"></a>
##### `glattribfmt(NumberFormat fmt)`

- Description: TODO

<a id="member-11"></a>
##### `glattribnorm(NumberFormat fmt)`

- Description: TODO

<a id="member-12"></a>
##### `glindexfmt(NumberFormat fmt)`

- Description: TODO

<a id="member-13"></a>
##### `glsamplertarget(Type type)`

- Description: TODO

<a id="member-14"></a>
##### `submit(Render gsub)`

- Description: TODO

<a id="member-15"></a>
##### `draw(Pipe pipe, Model data)`

- Description: TODO

<a id="member-16"></a>
##### `clear(Pipe pipe, FragData buf, FColor val)`

- Description: TODO

<a id="member-17"></a>
##### `clear(Pipe pipe, double val)`

- Description: TODO

<a id="member-18"></a>
##### `update(T buf, DataBuffer.Filler<? super T> fill)`

- Description: TODO

<a id="member-19"></a>
##### `update(T buf, DataBuffer.PartFiller<? super T> fill, int from, int to)`

- Description: TODO

<a id="member-20"></a>
##### `pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

<a id="member-21"></a>
##### `pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

<a id="member-22"></a>
##### `timestamp(Consumer<Long> callback)`

- Description: TODO

<a id="member-23"></a>
##### `fence(Runnable callback)`

- Description: TODO

<a id="member-24"></a>
##### `submit(BGL.Request req)`

- Description: TODO

<a id="member-25"></a>
##### `dispose()`

- Description: TODO
