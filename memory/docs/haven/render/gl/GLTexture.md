# GLTexture

## Meta

- Source: [GLTexture.java](../../../../../src/haven/render/gl/GLTexture.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL texture.

## Code Members

### Member Index

#### Fields

- [id](#member-1)
- [state](#member-2)
- [fbos](#member-3)
- [desc](#member-20)
- [sampler](#member-21)
- [desc](#member-29)
- [sampler](#member-30)
- [desc](#member-38)
- [sampler](#member-39)
- [desc](#member-47)
- [desc](#member-55)
- [sampler](#member-56)

#### Methods

- [create(GL gl)](#member-4)
- [delete(GL gl)](#member-5)
- [glid()](#member-6)
- [toString()](#member-7)
- [dispose0()](#member-8)
- [public abstract void bind(BGL gl);](#member-9)
- [public abstract void unbind(BGL gl);](#member-10)
- [magfilter(Sampler smp)](#member-11)
- [minfilter(Sampler smp)](#member-12)
- [wrapmode(Texture.Wrapping w)](#member-13)
- [glattribint(NumberFormat fmt)](#member-14)
- [texifmt(Texture data)](#member-15)
- [texefmt1(VectorFormat ifmt, VectorFormat efmt, Swizzle perm)](#member-16)
- [texefmt2(VectorFormat ifmt, VectorFormat efmt)](#member-17)
- [texface(TextureCube.Face face)](#member-18)
- [public abstract Texture desc();](#member-19)
- [Tex2D(GLEnvironment env, Texture2D data, FillBuffers.Array[] pixels)](#member-22)
- [create(GLEnvironment env, Texture2D data)](#member-23)
- [setsampler(Sampler2D data)](#member-24)
- [bind(BGL gl)](#member-25)
- [unbind(BGL gl)](#member-26)
- [toString()](#member-27)
- [desc()](#member-28)
- [Tex3D(GLEnvironment env, Texture3D data, FillBuffers.Array[] pixels)](#member-31)
- [create(GLEnvironment env, Texture3D data)](#member-32)
- [setsampler(Sampler3D data)](#member-33)
- [bind(BGL gl)](#member-34)
- [unbind(BGL gl)](#member-35)
- [toString()](#member-36)
- [desc()](#member-37)
- [Tex2DArray(GLEnvironment env, Texture2DArray data, FillBuffers.Array[][] pixels)](#member-40)
- [create(GLEnvironment env, Texture2DArray data)](#member-41)
- [setsampler(Sampler2DArray data)](#member-42)
- [bind(BGL gl)](#member-43)
- [unbind(BGL gl)](#member-44)
- [toString()](#member-45)
- [desc()](#member-46)
- [Tex2DMS(GLEnvironment env, Texture2DMS data)](#member-48)
- [create(GLEnvironment env, Texture2DMS data)](#member-49)
- [setsampler(Sampler2DMS data)](#member-50)
- [bind(BGL gl)](#member-51)
- [unbind(BGL gl)](#member-52)
- [toString()](#member-53)
- [desc()](#member-54)
- [TexCube(GLEnvironment env, TextureCube data, CubeImage[] images, FillBuffers.Array[] pixels)](#member-57)
- [create(GLEnvironment env, TextureCube data)](#member-58)
- [setsampler(SamplerCube data)](#member-59)
- [bind(BGL gl)](#member-60)
- [unbind(BGL gl)](#member-61)
- [toString()](#member-62)
- [desc()](#member-63)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `id`

- Description: TODO

<a id="member-2"></a>
##### `state`

- Description: TODO

<a id="member-3"></a>
##### `fbos`

- Description: TODO

<a id="member-20"></a>
##### `desc`

- Description: TODO

<a id="member-21"></a>
##### `sampler`

- Description: TODO

<a id="member-29"></a>
##### `desc`

- Description: TODO

<a id="member-30"></a>
##### `sampler`

- Description: TODO

<a id="member-38"></a>
##### `desc`

- Description: TODO

<a id="member-39"></a>
##### `sampler`

- Description: TODO

<a id="member-47"></a>
##### `desc`

- Description: TODO

<a id="member-55"></a>
##### `desc`

- Description: TODO

<a id="member-56"></a>
##### `sampler`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `create(GL gl)`

- Description: TODO

<a id="member-5"></a>
##### `delete(GL gl)`

- Description: TODO

<a id="member-6"></a>
##### `glid()`

- Description: TODO

<a id="member-7"></a>
##### `toString()`

- Description: TODO

<a id="member-8"></a>
##### `dispose0()`

- Description: TODO

<a id="member-9"></a>
##### `public abstract void bind(BGL gl);`

- Description: TODO

<a id="member-10"></a>
##### `public abstract void unbind(BGL gl);`

- Description: TODO

<a id="member-11"></a>
##### `magfilter(Sampler smp)`

- Description: TODO

<a id="member-12"></a>
##### `minfilter(Sampler smp)`

- Description: TODO

<a id="member-13"></a>
##### `wrapmode(Texture.Wrapping w)`

- Description: TODO

<a id="member-14"></a>
##### `glattribint(NumberFormat fmt)`

- Description: TODO

<a id="member-15"></a>
##### `texifmt(Texture data)`

- Description: TODO

<a id="member-16"></a>
##### `texefmt1(VectorFormat ifmt, VectorFormat efmt, Swizzle perm)`

- Description: TODO

<a id="member-17"></a>
##### `texefmt2(VectorFormat ifmt, VectorFormat efmt)`

- Description: TODO

<a id="member-18"></a>
##### `texface(TextureCube.Face face)`

- Description: TODO

<a id="member-19"></a>
##### `public abstract Texture desc();`

- Description: TODO

<a id="member-22"></a>
##### `Tex2D(GLEnvironment env, Texture2D data, FillBuffers.Array[] pixels)`

- Description: TODO

<a id="member-23"></a>
##### `create(GLEnvironment env, Texture2D data)`

- Description: TODO

<a id="member-24"></a>
##### `setsampler(Sampler2D data)`

- Description: TODO

<a id="member-25"></a>
##### `bind(BGL gl)`

- Description: TODO

<a id="member-26"></a>
##### `unbind(BGL gl)`

- Description: TODO

<a id="member-27"></a>
##### `toString()`

- Description: TODO

<a id="member-28"></a>
##### `desc()`

- Description: TODO

<a id="member-31"></a>
##### `Tex3D(GLEnvironment env, Texture3D data, FillBuffers.Array[] pixels)`

- Description: TODO

<a id="member-32"></a>
##### `create(GLEnvironment env, Texture3D data)`

- Description: TODO

<a id="member-33"></a>
##### `setsampler(Sampler3D data)`

- Description: TODO

<a id="member-34"></a>
##### `bind(BGL gl)`

- Description: TODO

<a id="member-35"></a>
##### `unbind(BGL gl)`

- Description: TODO

<a id="member-36"></a>
##### `toString()`

- Description: TODO

<a id="member-37"></a>
##### `desc()`

- Description: TODO

<a id="member-40"></a>
##### `Tex2DArray(GLEnvironment env, Texture2DArray data, FillBuffers.Array[][] pixels)`

- Description: TODO

<a id="member-41"></a>
##### `create(GLEnvironment env, Texture2DArray data)`

- Description: TODO

<a id="member-42"></a>
##### `setsampler(Sampler2DArray data)`

- Description: TODO

<a id="member-43"></a>
##### `bind(BGL gl)`

- Description: TODO

<a id="member-44"></a>
##### `unbind(BGL gl)`

- Description: TODO

<a id="member-45"></a>
##### `toString()`

- Description: TODO

<a id="member-46"></a>
##### `desc()`

- Description: TODO

<a id="member-48"></a>
##### `Tex2DMS(GLEnvironment env, Texture2DMS data)`

- Description: TODO

<a id="member-49"></a>
##### `create(GLEnvironment env, Texture2DMS data)`

- Description: TODO

<a id="member-50"></a>
##### `setsampler(Sampler2DMS data)`

- Description: TODO

<a id="member-51"></a>
##### `bind(BGL gl)`

- Description: TODO

<a id="member-52"></a>
##### `unbind(BGL gl)`

- Description: TODO

<a id="member-53"></a>
##### `toString()`

- Description: TODO

<a id="member-54"></a>
##### `desc()`

- Description: TODO

<a id="member-57"></a>
##### `TexCube(GLEnvironment env, TextureCube data, CubeImage[] images, FillBuffers.Array[] pixels)`

- Description: TODO

<a id="member-58"></a>
##### `create(GLEnvironment env, TextureCube data)`

- Description: TODO

<a id="member-59"></a>
##### `setsampler(SamplerCube data)`

- Description: TODO

<a id="member-60"></a>
##### `bind(BGL gl)`

- Description: TODO

<a id="member-61"></a>
##### `unbind(BGL gl)`

- Description: TODO

<a id="member-62"></a>
##### `toString()`

- Description: TODO

<a id="member-63"></a>
##### `desc()`

- Description: TODO
