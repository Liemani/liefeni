# PoseMorph

## Meta

- Source: [PoseMorph.java](../../../src/haven/PoseMorph.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents pose morphing support.

## Code Members

### Member Index

#### Fields

- [slot](#member-1)
- [pose](#member-2)
- [bperm](#member-3)
- [last](#member-7)
- [lastseq](#member-8)
- [vba](#member-10)
- [vbw](#member-11)
- [nb](#member-12)
- [bo](#member-13)
- [skanp](#member-14)
- [skand](#member-15)
- [interned](#member-22)
- [offs](#member-24)
- [shader](#member-25)
- [names](#member-29)

#### Methods

- [mkperm(Skeleton skel, BoneData bd)](#member-4)
- [boned(FastMesh mesh)](#member-5)
- [boneidp(FastMesh mesh)](#member-6)
- [state()](#member-9)
- [Shader(int nb)](#member-16)
- [skan(boolean pos)](#member-17)
- [morph(ValBlock.Value val, MeshMorph.MorphType type, VertexContext vctx)](#member-18)
- [modify(ProgramContext prog)](#member-19)
- [hashCode()](#member-20)
- [equals(Object that)](#member-21)
- [get(int nb)](#member-23)
- [Morphed(float[][] offs)](#member-26)
- [shader()](#member-27)
- [apply(Pipe p)](#member-28)
- [BoneData(int apv, IntBuffer data, String[] names)](#member-30)
- [WeightData(int apv, FloatBuffer data)](#member-31)
- [read(Collection<VertexBuf.AttribData> dst, Message buf, int nv, int mba, NumberFormat fmt)](#member-32)
- [cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)](#member-33)
- [cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)](#member-34)
- [sortweights(FloatBuffer bw, IntBuffer ba, int mba)](#member-35)
- [normweights(FloatBuffer bw, IntBuffer ba, int mba)](#member-36)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `slot`

- Description: TODO

<a id="member-2"></a>
##### `pose`

- Description: TODO

<a id="member-3"></a>
##### `bperm`

- Description: TODO

<a id="member-7"></a>
##### `last`

- Description: TODO

<a id="member-8"></a>
##### `lastseq`

- Description: TODO

<a id="member-10"></a>
##### `vba`

- Description: TODO

<a id="member-11"></a>
##### `vbw`

- Description: TODO

<a id="member-12"></a>
##### `nb`

- Description: TODO

<a id="member-13"></a>
##### `bo`

- Description: TODO

<a id="member-14"></a>
##### `skanp`

- Description: TODO

<a id="member-15"></a>
##### `skand`

- Description: TODO

<a id="member-22"></a>
##### `interned`

- Description: TODO

<a id="member-24"></a>
##### `offs`

- Description: TODO

<a id="member-25"></a>
##### `shader`

- Description: TODO

<a id="member-29"></a>
##### `names`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `mkperm(Skeleton skel, BoneData bd)`

- Description: TODO

<a id="member-5"></a>
##### `boned(FastMesh mesh)`

- Description: TODO

<a id="member-6"></a>
##### `boneidp(FastMesh mesh)`

- Description: TODO

<a id="member-9"></a>
##### `state()`

- Description: TODO

<a id="member-16"></a>
##### `Shader(int nb)`

- Description: TODO

<a id="member-17"></a>
##### `skan(boolean pos)`

- Description: TODO

<a id="member-18"></a>
##### `morph(ValBlock.Value val, MeshMorph.MorphType type, VertexContext vctx)`

- Description: TODO

<a id="member-19"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-20"></a>
##### `hashCode()`

- Description: TODO

<a id="member-21"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-23"></a>
##### `get(int nb)`

- Description: TODO

<a id="member-26"></a>
##### `Morphed(float[][] offs)`

- Description: TODO

<a id="member-27"></a>
##### `shader()`

- Description: TODO

<a id="member-28"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-30"></a>
##### `BoneData(int apv, IntBuffer data, String[] names)`

- Description: TODO

<a id="member-31"></a>
##### `WeightData(int apv, FloatBuffer data)`

- Description: TODO

<a id="member-32"></a>
##### `read(Collection<VertexBuf.AttribData> dst, Message buf, int nv, int mba, NumberFormat fmt)`

- Description: TODO

<a id="member-33"></a>
##### `cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-34"></a>
##### `cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

<a id="member-35"></a>
##### `sortweights(FloatBuffer bw, IntBuffer ba, int mba)`

- Description: TODO

<a id="member-36"></a>
##### `normweights(FloatBuffer bw, IntBuffer ba, int mba)`

- Description: TODO
