# Type

## Meta

- Source: [Type.java](../../../../../src/haven/render/sl/Type.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a shader type.

## Code Members

### Member Index

#### Constants

- [VOID](#member-6)
- [INT](#member-7)
- [UINT](#member-8)
- [FLOAT](#member-9)
- [VEC2](#member-10)
- [VEC3](#member-11)
- [VEC4](#member-12)
- [IVEC2](#member-13)
- [IVEC3](#member-14)
- [IVEC4](#member-15)
- [UVEC2](#member-16)
- [UVEC3](#member-17)
- [UVEC4](#member-18)
- [MAT3](#member-19)
- [MAT4](#member-20)
- [SAMPLER1D](#member-21)
- [SAMPLER1DARRAY](#member-22)
- [SAMPLER2D](#member-23)
- [SAMPLER2DARRAY](#member-24)
- [SAMPLER2DMS](#member-25)
- [SAMPLER2DMSARRAY](#member-26)
- [SAMPLER3D](#member-27)
- [SAMPLERCUBE](#member-28)
- [SAMPLERCUBEARRAY](#member-29)
- [SAMPLERBUFFER](#member-30)
- [ISAMPLER1D](#member-31)
- [ISAMPLER1DARRAY](#member-32)
- [ISAMPLER2D](#member-33)
- [ISAMPLER2DARRAY](#member-34)
- [ISAMPLER2DMS](#member-35)
- [ISAMPLER2DMSARRAY](#member-36)
- [ISAMPLER3D](#member-37)
- [ISAMPLERCUBE](#member-38)
- [ISAMPLERCUBEARRAY](#member-39)
- [ISAMPLERBUFFER](#member-40)
- [USAMPLER1D](#member-41)
- [USAMPLER1DARRAY](#member-42)
- [USAMPLER2D](#member-43)
- [USAMPLER2DARRAY](#member-44)
- [USAMPLER2DMS](#member-45)
- [USAMPLER2DMSARRAY](#member-46)
- [USAMPLER3D](#member-47)
- [USAMPLERCUBE](#member-48)
- [USAMPLERCUBEARRAY](#member-49)
- [USAMPLERBUFFER](#member-50)
- [SAMPLER2DSHADOW](#member-51)
- [SAMPLERCUBESHADOW](#member-52)

#### Fields

- [name](#member-1)

#### Methods

- [Simple(String name)](#member-2)
- [name(Context ctx)](#member-3)
- [toString()](#member-4)
- [Sampler(String name)](#member-5)
- [public abstract String name(Context ctx);](#member-53)
- [use(Context ctx)](#member-54)

### Member Reference

#### Constants

<a id="member-6"></a>
##### `VOID`

- Description: TODO

<a id="member-7"></a>
##### `INT`

- Description: TODO

<a id="member-8"></a>
##### `UINT`

- Description: TODO

<a id="member-9"></a>
##### `FLOAT`

- Description: TODO

<a id="member-10"></a>
##### `VEC2`

- Description: TODO

<a id="member-11"></a>
##### `VEC3`

- Description: TODO

<a id="member-12"></a>
##### `VEC4`

- Description: TODO

<a id="member-13"></a>
##### `IVEC2`

- Description: TODO

<a id="member-14"></a>
##### `IVEC3`

- Description: TODO

<a id="member-15"></a>
##### `IVEC4`

- Description: TODO

<a id="member-16"></a>
##### `UVEC2`

- Description: TODO

<a id="member-17"></a>
##### `UVEC3`

- Description: TODO

<a id="member-18"></a>
##### `UVEC4`

- Description: TODO

<a id="member-19"></a>
##### `MAT3`

- Description: TODO

<a id="member-20"></a>
##### `MAT4`

- Description: TODO

<a id="member-21"></a>
##### `SAMPLER1D`

- Description: TODO

<a id="member-22"></a>
##### `SAMPLER1DARRAY`

- Description: TODO

<a id="member-23"></a>
##### `SAMPLER2D`

- Description: TODO

<a id="member-24"></a>
##### `SAMPLER2DARRAY`

- Description: TODO

<a id="member-25"></a>
##### `SAMPLER2DMS`

- Description: TODO

<a id="member-26"></a>
##### `SAMPLER2DMSARRAY`

- Description: TODO

<a id="member-27"></a>
##### `SAMPLER3D`

- Description: TODO

<a id="member-28"></a>
##### `SAMPLERCUBE`

- Description: TODO

<a id="member-29"></a>
##### `SAMPLERCUBEARRAY`

- Description: TODO

<a id="member-30"></a>
##### `SAMPLERBUFFER`

- Description: TODO

<a id="member-31"></a>
##### `ISAMPLER1D`

- Description: TODO

<a id="member-32"></a>
##### `ISAMPLER1DARRAY`

- Description: TODO

<a id="member-33"></a>
##### `ISAMPLER2D`

- Description: TODO

<a id="member-34"></a>
##### `ISAMPLER2DARRAY`

- Description: TODO

<a id="member-35"></a>
##### `ISAMPLER2DMS`

- Description: TODO

<a id="member-36"></a>
##### `ISAMPLER2DMSARRAY`

- Description: TODO

<a id="member-37"></a>
##### `ISAMPLER3D`

- Description: TODO

<a id="member-38"></a>
##### `ISAMPLERCUBE`

- Description: TODO

<a id="member-39"></a>
##### `ISAMPLERCUBEARRAY`

- Description: TODO

<a id="member-40"></a>
##### `ISAMPLERBUFFER`

- Description: TODO

<a id="member-41"></a>
##### `USAMPLER1D`

- Description: TODO

<a id="member-42"></a>
##### `USAMPLER1DARRAY`

- Description: TODO

<a id="member-43"></a>
##### `USAMPLER2D`

- Description: TODO

<a id="member-44"></a>
##### `USAMPLER2DARRAY`

- Description: TODO

<a id="member-45"></a>
##### `USAMPLER2DMS`

- Description: TODO

<a id="member-46"></a>
##### `USAMPLER2DMSARRAY`

- Description: TODO

<a id="member-47"></a>
##### `USAMPLER3D`

- Description: TODO

<a id="member-48"></a>
##### `USAMPLERCUBE`

- Description: TODO

<a id="member-49"></a>
##### `USAMPLERCUBEARRAY`

- Description: TODO

<a id="member-50"></a>
##### `USAMPLERBUFFER`

- Description: TODO

<a id="member-51"></a>
##### `SAMPLER2DSHADOW`

- Description: TODO

<a id="member-52"></a>
##### `SAMPLERCUBESHADOW`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `name`

- Description: TODO

#### Methods

<a id="member-2"></a>
##### `Simple(String name)`

- Description: TODO

<a id="member-3"></a>
##### `name(Context ctx)`

- Description: TODO

<a id="member-4"></a>
##### `toString()`

- Description: TODO

<a id="member-5"></a>
##### `Sampler(String name)`

- Description: TODO

<a id="member-53"></a>
##### `public abstract String name(Context ctx);`

- Description: TODO

<a id="member-54"></a>
##### `use(Context ctx)`

- Description: TODO
