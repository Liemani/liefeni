# MeshAnim

## Meta

- Source: [MeshAnim.java](../../../src/haven/MeshAnim.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents mesh animation support.

## Code Members

### Member Index

#### Fields

- [anim](#member-1)
- [frame](#member-2)
- [frames](#member-3)
- [len](#member-4)
- [minv](#member-5)
- [maxv](#member-6)
- [time](#member-7)
- [idx](#member-8)
- [pos](#member-9)
- [nrm](#member-10)
- [minv](#member-11)
- [maxv](#member-12)
- [ptex](#member-16)
- [ntex](#member-17)
- [pdata](#member-20)
- [ndata](#member-21)
- [voff](#member-22)
- [frames](#member-23)
- [ipol](#member-24)
- [nrm](#member-25)
- [id](#member-26)
- [interned](#member-32)
- [anim](#member-34)
- [ff](#member-35)
- [tf](#member-36)
- [a](#member-37)
- [ianim](#member-46)
- [instancer](#member-47)
- [shader](#member-48)
- [cf](#member-55)
- [flen](#member-56)
- [ftm](#member-57)
- [fl](#member-62)
- [fp](#member-63)
- [cfi](#member-64)
- [nfi](#member-65)
- [rnd](#member-66)
- [id](#member-73)
- [a](#member-74)
- [rnd](#member-75)

#### Methods

- [Frame(float time, int[] idx, float[] pos, float[] nrm)](#member-13)
- [hasnrm()](#member-14)
- [dtex(boolean pos)](#member-15)
- [ptex()](#member-18)
- [ntex()](#member-19)
- [Shader(boolean nrm)](#member-27)
- [off(VertexContext vctx, boolean pos)](#member-28)
- [modify(ProgramContext prog)](#member-29)
- [hashCode()](#member-30)
- [equals(Object that)](#member-31)
- [get(boolean nrm)](#member-33)
- [Animated(MeshAnim anim, int ff, int tf, float a)](#member-38)
- [foff()](#member-39)
- [toff()](#member-40)
- [shader()](#member-41)
- [apply(Pipe p)](#member-42)
- [attribs()](#member-43)
- [Instanced(MeshAnim anim)](#member-44)
- [shader()](#member-45)
- [shader()](#member-49)
- [apply(Pipe p)](#member-50)
- [public abstract Animated state();](#member-51)
- [public abstract boolean tick(float dt);](#member-52)
- [public abstract void age();](#member-53)
- [desc()](#member-54)
- [SeqAnimation()](#member-58)
- [tick(float dt)](#member-59)
- [age()](#member-60)
- [state()](#member-61)
- [RandAnimation()](#member-67)
- [setfr(int fi)](#member-68)
- [tick(float dt)](#member-69)
- [age()](#member-70)
- [state()](#member-71)
- [animp(FastMesh mesh)](#member-72)
- [Res(Resource res, Message buf)](#member-76)
- [make()](#member-77)
- [init()](#member-78)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `anim`

- Description: TODO

<a id="member-2"></a>
##### `frame`

- Description: TODO

<a id="member-3"></a>
##### `frames`

- Description: TODO

<a id="member-4"></a>
##### `len`

- Description: TODO

<a id="member-5"></a>
##### `minv`

- Description: TODO

<a id="member-6"></a>
##### `maxv`

- Description: TODO

<a id="member-7"></a>
##### `time`

- Description: TODO

<a id="member-8"></a>
##### `idx`

- Description: TODO

<a id="member-9"></a>
##### `pos`

- Description: TODO

<a id="member-10"></a>
##### `nrm`

- Description: TODO

<a id="member-11"></a>
##### `minv`

- Description: TODO

<a id="member-12"></a>
##### `maxv`

- Description: TODO

<a id="member-16"></a>
##### `ptex`

- Description: TODO

<a id="member-17"></a>
##### `ntex`

- Description: TODO

<a id="member-20"></a>
##### `pdata`

- Description: TODO

<a id="member-21"></a>
##### `ndata`

- Description: TODO

<a id="member-22"></a>
##### `voff`

- Description: TODO

<a id="member-23"></a>
##### `frames`

- Description: TODO

<a id="member-24"></a>
##### `ipol`

- Description: TODO

<a id="member-25"></a>
##### `nrm`

- Description: TODO

<a id="member-26"></a>
##### `id`

- Description: TODO

<a id="member-32"></a>
##### `interned`

- Description: TODO

<a id="member-34"></a>
##### `anim`

- Description: TODO

<a id="member-35"></a>
##### `ff`

- Description: TODO

<a id="member-36"></a>
##### `tf`

- Description: TODO

<a id="member-37"></a>
##### `a`

- Description: TODO

<a id="member-46"></a>
##### `ianim`

- Description: TODO

<a id="member-47"></a>
##### `instancer`

- Description: TODO

<a id="member-48"></a>
##### `shader`

- Description: TODO

<a id="member-55"></a>
##### `cf`

- Description: TODO

<a id="member-56"></a>
##### `flen`

- Description: TODO

<a id="member-57"></a>
##### `ftm`

- Description: TODO

<a id="member-62"></a>
##### `fl`

- Description: TODO

<a id="member-63"></a>
##### `fp`

- Description: TODO

<a id="member-64"></a>
##### `cfi`

- Description: TODO

<a id="member-65"></a>
##### `nfi`

- Description: TODO

<a id="member-66"></a>
##### `rnd`

- Description: TODO

<a id="member-73"></a>
##### `id`

- Description: TODO

<a id="member-74"></a>
##### `a`

- Description: TODO

<a id="member-75"></a>
##### `rnd`

- Description: TODO

#### Methods

<a id="member-13"></a>
##### `Frame(float time, int[] idx, float[] pos, float[] nrm)`

- Description: TODO

<a id="member-14"></a>
##### `hasnrm()`

- Description: TODO

<a id="member-15"></a>
##### `dtex(boolean pos)`

- Description: TODO

<a id="member-18"></a>
##### `ptex()`

- Description: TODO

<a id="member-19"></a>
##### `ntex()`

- Description: TODO

<a id="member-27"></a>
##### `Shader(boolean nrm)`

- Description: TODO

<a id="member-28"></a>
##### `off(VertexContext vctx, boolean pos)`

- Description: TODO

<a id="member-29"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-30"></a>
##### `hashCode()`

- Description: TODO

<a id="member-31"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-33"></a>
##### `get(boolean nrm)`

- Description: TODO

<a id="member-38"></a>
##### `Animated(MeshAnim anim, int ff, int tf, float a)`

- Description: TODO

<a id="member-39"></a>
##### `foff()`

- Description: TODO

<a id="member-40"></a>
##### `toff()`

- Description: TODO

<a id="member-41"></a>
##### `shader()`

- Description: TODO

<a id="member-42"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-43"></a>
##### `attribs()`

- Description: TODO

<a id="member-44"></a>
##### `Instanced(MeshAnim anim)`

- Description: TODO

<a id="member-45"></a>
##### `shader()`

- Description: TODO

<a id="member-49"></a>
##### `shader()`

- Description: TODO

<a id="member-50"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-51"></a>
##### `public abstract Animated state();`

- Description: TODO

<a id="member-52"></a>
##### `public abstract boolean tick(float dt);`

- Description: TODO

<a id="member-53"></a>
##### `public abstract void age();`

- Description: TODO

<a id="member-54"></a>
##### `desc()`

- Description: TODO

<a id="member-58"></a>
##### `SeqAnimation()`

- Description: TODO

<a id="member-59"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-60"></a>
##### `age()`

- Description: TODO

<a id="member-61"></a>
##### `state()`

- Description: TODO

<a id="member-67"></a>
##### `RandAnimation()`

- Description: TODO

<a id="member-68"></a>
##### `setfr(int fi)`

- Description: TODO

<a id="member-69"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-70"></a>
##### `age()`

- Description: TODO

<a id="member-71"></a>
##### `state()`

- Description: TODO

<a id="member-72"></a>
##### `animp(FastMesh mesh)`

- Description: TODO

<a id="member-76"></a>
##### `Res(Resource res, Message buf)`

- Description: TODO

<a id="member-77"></a>
##### `make()`

- Description: TODO

<a id="member-78"></a>
##### `init()`

- Description: TODO
