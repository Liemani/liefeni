# GLFrameBuffer

## Meta

- Source: [GLFrameBuffer.java](../../../../../src/haven/render/gl/GLFrameBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL framebuffer.

## Code Members

### Member Index

#### Fields

- [color](#member-1)
- [depth](#member-2)
- [sz](#member-3)
- [id](#member-4)
- [sz](#member-12)
- [cfmt](#member-13)
- [dfmt](#member-14)
- [tex](#member-16)
- [level](#member-20)
- [w](#member-21)
- [h](#member-22)

#### Methods

- [create(GL gl)](#member-5)
- [delete(GL gl)](#member-6)
- [glid()](#member-7)
- [register(GLTexture tex)](#member-8)
- [register()](#member-9)
- [unregister(GLTexture tex)](#member-10)
- [dispose()](#member-11)
- [FormatException(String message, GLFrameBuffer fbo)](#member-15)
- [Attachment(GLTexture tex)](#member-17)
- [public abstract void attach(BGL gl, GLFrameBuffer fbo, int point);](#member-18)
- [public abstract Coord sz();](#member-19)
- [Attach2D(GLTexture.Tex2D tex, Texture.Image<Texture2D> img)](#member-23)
- [attach(BGL gl, GLFrameBuffer fbo, int point)](#member-24)
- [sz()](#member-25)
- [hashCode()](#member-26)
- [equals(Object o)](#member-27)
- [prepimg(GLEnvironment env, Texture.Image<?> img)](#member-28)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `color`

- Description: TODO

<a id="member-2"></a>
##### `depth`

- Description: TODO

<a id="member-3"></a>
##### `sz`

- Description: TODO

<a id="member-4"></a>
##### `id`

- Description: TODO

<a id="member-12"></a>
##### `sz`

- Description: TODO

<a id="member-13"></a>
##### `cfmt`

- Description: TODO

<a id="member-14"></a>
##### `dfmt`

- Description: TODO

<a id="member-16"></a>
##### `tex`

- Description: TODO

<a id="member-20"></a>
##### `level`

- Description: TODO

<a id="member-21"></a>
##### `w`

- Description: TODO

<a id="member-22"></a>
##### `h`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `create(GL gl)`

- Description: TODO

<a id="member-6"></a>
##### `delete(GL gl)`

- Description: TODO

<a id="member-7"></a>
##### `glid()`

- Description: TODO

<a id="member-8"></a>
##### `register(GLTexture tex)`

- Description: TODO

<a id="member-9"></a>
##### `register()`

- Description: TODO

<a id="member-10"></a>
##### `unregister(GLTexture tex)`

- Description: TODO

<a id="member-11"></a>
##### `dispose()`

- Description: TODO

<a id="member-15"></a>
##### `FormatException(String message, GLFrameBuffer fbo)`

- Description: TODO

<a id="member-17"></a>
##### `Attachment(GLTexture tex)`

- Description: TODO

<a id="member-18"></a>
##### `public abstract void attach(BGL gl, GLFrameBuffer fbo, int point);`

- Description: TODO

<a id="member-19"></a>
##### `public abstract Coord sz();`

- Description: TODO

<a id="member-23"></a>
##### `Attach2D(GLTexture.Tex2D tex, Texture.Image<Texture2D> img)`

- Description: TODO

<a id="member-24"></a>
##### `attach(BGL gl, GLFrameBuffer fbo, int point)`

- Description: TODO

<a id="member-25"></a>
##### `sz()`

- Description: TODO

<a id="member-26"></a>
##### `hashCode()`

- Description: TODO

<a id="member-27"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-28"></a>
##### `prepimg(GLEnvironment env, Texture.Image<?> img)`

- Description: TODO
