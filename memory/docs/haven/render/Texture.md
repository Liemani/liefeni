# Texture

## Meta

- Source: [Texture.java](../../../../src/haven/render/Texture.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a texture resource.

## Code Members

### Member Index

#### Constants

- [DEPTH](#member-1)

#### Fields

- [ifmt](#member-2)
- [efmt](#member-3)
- [usage](#member-4)
- [init](#member-5)
- [srgb](#member-6)
- [eperm](#member-7)
- [shared](#member-8)
- [ro](#member-9)
- [desc](#member-10)
- [tex](#member-11)
- [w](#member-12)
- [h](#member-13)
- [d](#member-14)
- [level](#member-15)
- [tex](#member-27)
- [magfilter](#member-28)
- [minfilter](#member-29)
- [mipfilter](#member-30)
- [swrap](#member-31)
- [twrap](#member-32)
- [rwrap](#member-33)
- [anisotropy](#member-34)
- [border](#member-35)
- [ro](#member-36)

#### Methods

- [Image(T tex, int w, int h, int d, int level)](#member-16)
- [size()](#member-17)
- [equals(Image that)](#member-18)
- [equals(Object that)](#member-19)
- [toString()](#member-20)
- [public abstract Collection<? extends Image<? extends Texture>> images();](#member-21)
- [public abstract Sampler<? extends Texture> sampler();](#member-22)
- [srgb()](#member-23)
- [eperm(Swizzle eperm)](#member-24)
- [shared()](#member-25)
- [dispose()](#member-26)
- [Sampler(T tex)](#member-37)
- [dispose()](#member-38)
- [magfilter(Filter v)](#member-39)
- [minfilter(Filter v)](#member-40)
- [mipfilter(Filter v)](#member-41)
- [swrap(Wrapping v)](#member-42)
- [twrap(Wrapping v)](#member-43)
- [rwrap(Wrapping v)](#member-44)
- [wrapmode(Wrapping v)](#member-45)
- [anisotropy(float v)](#member-46)
- [border(FColor v)](#member-47)
- [copy(Sampler<?> that)](#member-48)
- [parhash()](#member-49)
- [hashCode()](#member-50)
- [parequals(Sampler<?> that)](#member-51)
- [equals(Sampler<?> that)](#member-52)
- [equals(Object o)](#member-53)
- [toString()](#member-54)
- [descfmt()](#member-55)
- [desc(Object desc)](#member-56)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `DEPTH`

- Description: TODO

#### Fields

<a id="member-2"></a>
##### `ifmt`

- Description: TODO

<a id="member-3"></a>
##### `efmt`

- Description: TODO

<a id="member-4"></a>
##### `usage`

- Description: TODO

<a id="member-5"></a>
##### `init`

- Description: TODO

<a id="member-6"></a>
##### `srgb`

- Description: TODO

<a id="member-7"></a>
##### `eperm`

- Description: TODO

<a id="member-8"></a>
##### `shared`

- Description: TODO

<a id="member-9"></a>
##### `ro`

- Description: TODO

<a id="member-10"></a>
##### `desc`

- Description: TODO

<a id="member-11"></a>
##### `tex`

- Description: TODO

<a id="member-12"></a>
##### `w`

- Description: TODO

<a id="member-13"></a>
##### `h`

- Description: TODO

<a id="member-14"></a>
##### `d`

- Description: TODO

<a id="member-15"></a>
##### `level`

- Description: TODO

<a id="member-27"></a>
##### `tex`

- Description: TODO

<a id="member-28"></a>
##### `magfilter`

- Description: TODO

<a id="member-29"></a>
##### `minfilter`

- Description: TODO

<a id="member-30"></a>
##### `mipfilter`

- Description: TODO

<a id="member-31"></a>
##### `swrap`

- Description: TODO

<a id="member-32"></a>
##### `twrap`

- Description: TODO

<a id="member-33"></a>
##### `rwrap`

- Description: TODO

<a id="member-34"></a>
##### `anisotropy`

- Description: TODO

<a id="member-35"></a>
##### `border`

- Description: TODO

<a id="member-36"></a>
##### `ro`

- Description: TODO

#### Methods

<a id="member-16"></a>
##### `Image(T tex, int w, int h, int d, int level)`

- Description: TODO

<a id="member-17"></a>
##### `size()`

- Description: TODO

<a id="member-18"></a>
##### `equals(Image that)`

- Description: TODO

<a id="member-19"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-20"></a>
##### `toString()`

- Description: TODO

<a id="member-21"></a>
##### `public abstract Collection<? extends Image<? extends Texture>> images();`

- Description: TODO

<a id="member-22"></a>
##### `public abstract Sampler<? extends Texture> sampler();`

- Description: TODO

<a id="member-23"></a>
##### `srgb()`

- Description: TODO

<a id="member-24"></a>
##### `eperm(Swizzle eperm)`

- Description: TODO

<a id="member-25"></a>
##### `shared()`

- Description: TODO

<a id="member-26"></a>
##### `dispose()`

- Description: TODO

<a id="member-37"></a>
##### `Sampler(T tex)`

- Description: TODO

<a id="member-38"></a>
##### `dispose()`

- Description: TODO

<a id="member-39"></a>
##### `magfilter(Filter v)`

- Description: TODO

<a id="member-40"></a>
##### `minfilter(Filter v)`

- Description: TODO

<a id="member-41"></a>
##### `mipfilter(Filter v)`

- Description: TODO

<a id="member-42"></a>
##### `swrap(Wrapping v)`

- Description: TODO

<a id="member-43"></a>
##### `twrap(Wrapping v)`

- Description: TODO

<a id="member-44"></a>
##### `rwrap(Wrapping v)`

- Description: TODO

<a id="member-45"></a>
##### `wrapmode(Wrapping v)`

- Description: TODO

<a id="member-46"></a>
##### `anisotropy(float v)`

- Description: TODO

<a id="member-47"></a>
##### `border(FColor v)`

- Description: TODO

<a id="member-48"></a>
##### `copy(Sampler<?> that)`

- Description: TODO

<a id="member-49"></a>
##### `parhash()`

- Description: TODO

<a id="member-50"></a>
##### `hashCode()`

- Description: TODO

<a id="member-51"></a>
##### `parequals(Sampler<?> that)`

- Description: TODO

<a id="member-52"></a>
##### `equals(Sampler<?> that)`

- Description: TODO

<a id="member-53"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-54"></a>
##### `toString()`

- Description: TODO

<a id="member-55"></a>
##### `descfmt()`

- Description: TODO

<a id="member-56"></a>
##### `desc(Object desc)`

- Description: TODO
