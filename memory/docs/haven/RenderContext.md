# RenderContext

## Meta

- Source: [RenderContext.java](../../../src/haven/RenderContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a render context contract.

## Code Members

### Member Index

#### Constants

- [ORDER_RESOLVE](#member-14)
- [ORDER_TONEMAP](#member-15)
- [ORDER_DEFAULT](#member-16)
- [ORDER_RESAMPLE](#member-17)

#### Fields

- [slot](#member-1)
- [post](#member-2)
- [global](#member-3)
- [cfmt](#member-4)
- [samples](#member-5)
- [sz](#member-6)
- [buf](#member-18)

#### Methods

- [FrameFormat(VectorFormat cfmt, int samples, Coord sz)](#member-7)
- [FrameFormat(Texture tex)](#member-8)
- [FrameFormat(FrameFormat from)](#member-9)
- [equals(FrameFormat that)](#member-10)
- [equals(Object x)](#member-11)
- [maketex()](#member-12)
- [matching(Texture tex)](#member-13)
- [run(GOut g, Sampler2D in)](#member-19)
- [run(GOut g, Sampler in)](#member-20)
- [order()](#member-21)
- [outformat(FrameFormat in)](#member-22)
- [dispose()](#member-23)
- [prerender(Render out)](#member-24)
- [postrender(Render out)](#member-25)
- [postproc()](#member-26)
- [add(PostProcessor post)](#member-27)
- [remove(PostProcessor post)](#member-28)
- [public abstract Pipe.Op basic(Object id);](#member-29)
- [public abstract void basic(Object id, Pipe.Op state);](#member-30)
- [add(Global glob)](#member-31)
- [put(Global glob)](#member-32)
- [prerender(Render out)](#member-33)
- [postrender(Render out)](#member-34)
- [shader()](#member-35)
- [apply(Pipe p)](#member-36)

### Member Reference

#### Constants

<a id="member-14"></a>
##### `ORDER_RESOLVE`

- Description: TODO

<a id="member-15"></a>
##### `ORDER_TONEMAP`

- Description: TODO

<a id="member-16"></a>
##### `ORDER_DEFAULT`

- Description: TODO

<a id="member-17"></a>
##### `ORDER_RESAMPLE`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `slot`

- Description: TODO

<a id="member-2"></a>
##### `post`

- Description: TODO

<a id="member-3"></a>
##### `global`

- Description: TODO

<a id="member-4"></a>
##### `cfmt`

- Description: TODO

<a id="member-5"></a>
##### `samples`

- Description: TODO

<a id="member-6"></a>
##### `sz`

- Description: TODO

<a id="member-18"></a>
##### `buf`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `FrameFormat(VectorFormat cfmt, int samples, Coord sz)`

- Description: TODO

<a id="member-8"></a>
##### `FrameFormat(Texture tex)`

- Description: TODO

<a id="member-9"></a>
##### `FrameFormat(FrameFormat from)`

- Description: TODO

<a id="member-10"></a>
##### `equals(FrameFormat that)`

- Description: TODO

<a id="member-11"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-12"></a>
##### `maketex()`

- Description: TODO

<a id="member-13"></a>
##### `matching(Texture tex)`

- Description: TODO

<a id="member-19"></a>
##### `run(GOut g, Sampler2D in)`

- Description: TODO

<a id="member-20"></a>
##### `run(GOut g, Sampler in)`

- Description: TODO

<a id="member-21"></a>
##### `order()`

- Description: TODO

<a id="member-22"></a>
##### `outformat(FrameFormat in)`

- Description: TODO

<a id="member-23"></a>
##### `dispose()`

- Description: TODO

<a id="member-24"></a>
##### `prerender(Render out)`

- Description: TODO

<a id="member-25"></a>
##### `postrender(Render out)`

- Description: TODO

<a id="member-26"></a>
##### `postproc()`

- Description: TODO

<a id="member-27"></a>
##### `add(PostProcessor post)`

- Description: TODO

<a id="member-28"></a>
##### `remove(PostProcessor post)`

- Description: TODO

<a id="member-29"></a>
##### `public abstract Pipe.Op basic(Object id);`

- Description: TODO

<a id="member-30"></a>
##### `public abstract void basic(Object id, Pipe.Op state);`

- Description: TODO

<a id="member-31"></a>
##### `add(Global glob)`

- Description: TODO

<a id="member-32"></a>
##### `put(Global glob)`

- Description: TODO

<a id="member-33"></a>
##### `prerender(Render out)`

- Description: TODO

<a id="member-34"></a>
##### `postrender(Render out)`

- Description: TODO

<a id="member-35"></a>
##### `shader()`

- Description: TODO

<a id="member-36"></a>
##### `apply(Pipe p)`

- Description: TODO
