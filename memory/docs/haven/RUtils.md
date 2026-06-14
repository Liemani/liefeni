# RUtils

## Meta

- Source: [RUtils.java](../../../src/haven/RUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides runtime utilities.

## Code Members

### Member Index

#### Fields

- [r](#member-4)
- [slots](#member-5)
- [cstate](#member-6)
- [inited](#member-7)
- [src](#member-19)
- [order](#member-20)
- [data](#member-21)
- [deforder](#member-22)
- [adhoc](#member-29)
- [sh](#member-30)
- [adhocg](#member-34)
- [sh](#member-35)
- [children](#member-39)

#### Methods

- [multiadd(Collection<Slot> slots, Node node)](#member-1)
- [multirem(Collection<Slot> slots)](#member-2)
- [readd(Collection<Slot> slots, Consumer<Slot> add, Runnable revert)](#member-3)
- [StateNode(R r)](#member-8)
- [protected abstract Op state();](#member-9)
- [update()](#member-10)
- [added(Slot slot)](#member-11)
- [removed(Slot slot)](#member-12)
- [of(R r, Supplier<? extends Op> st)](#member-13)
- [toString()](#member-14)
- [StateTickNode(R r)](#member-15)
- [ticker()](#member-16)
- [autotick(double dt)](#member-17)
- [of(R r, Supplier<? extends Op> st)](#member-18)
- [CubeFill(Supplier<BufferedImage> src)](#member-23)
- [osz()](#member-24)
- [getsrc(TextureCube tex)](#member-25)
- [fill(Image gimg, Environment env)](#member-26)
- [done()](#member-27)
- [mktex()](#member-28)
- [AdHoc(ShaderMacro sh)](#member-31)
- [shader()](#member-32)
- [apply(Pipe buf)](#member-33)
- [GeomAdHoc(ShaderMacro sh)](#member-36)
- [shader()](#member-37)
- [apply(Pipe buf)](#member-38)
- [ComposedNode(Node... children)](#member-40)
- [added(Slot slot)](#member-41)
- [compose(Node... children)](#member-42)
- [compose(Collection<? extends Node> children)](#member-43)

### Member Reference

#### Fields

<a id="member-4"></a>
##### `r`

- Description: TODO

<a id="member-5"></a>
##### `slots`

- Description: TODO

<a id="member-6"></a>
##### `cstate`

- Description: TODO

<a id="member-7"></a>
##### `inited`

- Description: TODO

<a id="member-19"></a>
##### `src`

- Description: TODO

<a id="member-20"></a>
##### `order`

- Description: TODO

<a id="member-21"></a>
##### `data`

- Description: TODO

<a id="member-22"></a>
##### `deforder`

- Description: TODO

<a id="member-29"></a>
##### `adhoc`

- Description: TODO

<a id="member-30"></a>
##### `sh`

- Description: TODO

<a id="member-34"></a>
##### `adhocg`

- Description: TODO

<a id="member-35"></a>
##### `sh`

- Description: TODO

<a id="member-39"></a>
##### `children`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `multiadd(Collection<Slot> slots, Node node)`

- Description: TODO

<a id="member-2"></a>
##### `multirem(Collection<Slot> slots)`

- Description: TODO

<a id="member-3"></a>
##### `readd(Collection<Slot> slots, Consumer<Slot> add, Runnable revert)`

- Description: TODO

<a id="member-8"></a>
##### `StateNode(R r)`

- Description: TODO

<a id="member-9"></a>
##### `protected abstract Op state();`

- Description: TODO

<a id="member-10"></a>
##### `update()`

- Description: TODO

<a id="member-11"></a>
##### `added(Slot slot)`

- Description: TODO

<a id="member-12"></a>
##### `removed(Slot slot)`

- Description: TODO

<a id="member-13"></a>
##### `of(R r, Supplier<? extends Op> st)`

- Description: TODO

<a id="member-14"></a>
##### `toString()`

- Description: TODO

<a id="member-15"></a>
##### `StateTickNode(R r)`

- Description: TODO

<a id="member-16"></a>
##### `ticker()`

- Description: TODO

<a id="member-17"></a>
##### `autotick(double dt)`

- Description: TODO

<a id="member-18"></a>
##### `of(R r, Supplier<? extends Op> st)`

- Description: TODO

<a id="member-23"></a>
##### `CubeFill(Supplier<BufferedImage> src)`

- Description: TODO

<a id="member-24"></a>
##### `osz()`

- Description: TODO

<a id="member-25"></a>
##### `getsrc(TextureCube tex)`

- Description: TODO

<a id="member-26"></a>
##### `fill(Image gimg, Environment env)`

- Description: TODO

<a id="member-27"></a>
##### `done()`

- Description: TODO

<a id="member-28"></a>
##### `mktex()`

- Description: TODO

<a id="member-31"></a>
##### `AdHoc(ShaderMacro sh)`

- Description: TODO

<a id="member-32"></a>
##### `shader()`

- Description: TODO

<a id="member-33"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-36"></a>
##### `GeomAdHoc(ShaderMacro sh)`

- Description: TODO

<a id="member-37"></a>
##### `shader()`

- Description: TODO

<a id="member-38"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-40"></a>
##### `ComposedNode(Node... children)`

- Description: TODO

<a id="member-41"></a>
##### `added(Slot slot)`

- Description: TODO

<a id="member-42"></a>
##### `compose(Node... children)`

- Description: TODO

<a id="member-43"></a>
##### `compose(Collection<? extends Node> children)`

- Description: TODO
