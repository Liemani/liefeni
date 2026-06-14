# Light

## Meta

- Source: [Light.java](../../../src/haven/Light.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a light source.

## Code Members

### Member Index

#### Fields

- [amb](#member-1)
- [dif](#member-2)
- [spc](#member-3)
- [prio](#member-4)
- [defamb](#member-5)
- [defdif](#member-6)
- [defspc](#member-7)
- [lights](#member-10)
- [ll](#member-11)
- [lighting](#member-21)
- [vlight](#member-22)
- [flight](#member-23)
- [shader](#member-24)
- [material](#member-25)
- [defamb](#member-26)
- [defdif](#member-27)
- [defspc](#member-28)
- [defemi](#member-29)
- [slot](#member-38)
- [shader](#member-40)
- [celshade](#member-43)
- [id](#member-45)
- [amb](#member-46)
- [dif](#member-47)
- [spc](#member-48)
- [hatt](#member-49)
- [hexp](#member-50)
- [ac](#member-51)
- [al](#member-52)
- [aq](#member-53)
- [exp](#member-54)
- [dir](#member-55)

#### Methods

- [prio(int prio)](#member-8)
- [public abstract Object[] params(GroupPipe state);](#member-9)
- [params()](#member-12)
- [compile()](#member-13)
- [add(RenderList.Slot<Light> light)](#member-14)
- [remove(RenderList.Slot<Light> light)](#member-15)
- [shader()](#member-16)
- [apply(Pipe p)](#member-17)
- [index(Light l)](#member-18)
- [added(RenderTree.Slot slot)](#member-19)
- [removed(RenderTree.Slot slot)](#member-20)
- [PhongLight(boolean frag, FColor amb, FColor dif, FColor spc, FColor emi, float shine)](#member-30)
- [PhongLight(boolean frag, Color amb, Color dif, Color spc, Color emi, float shine)](#member-31)
- [PhongLight(boolean frag, FColor col)](#member-32)
- [PhongLight(boolean frag)](#member-33)
- [shader()](#member-34)
- [apply(Pipe p)](#member-35)
- [cons(Material.Buffer buf, Object... args)](#member-36)
- [cons(Material.Buffer buf, Object... args)](#member-37)
- [CelShade(boolean dif, boolean spc)](#member-39)
- [shader()](#member-41)
- [apply(Pipe p)](#member-42)
- [cons(Material.Buffer buf, Object... args)](#member-44)
- [cold(Message buf)](#member-56)
- [cold2(Message buf)](#member-57)
- [Res(Resource res, Message buf)](#member-58)
- [make()](#member-59)
- [init()](#member-60)
- [layerid()](#member-61)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `amb`

- Description: TODO

<a id="member-2"></a>
##### `dif`

- Description: TODO

<a id="member-3"></a>
##### `spc`

- Description: TODO

<a id="member-4"></a>
##### `prio`

- Description: TODO

<a id="member-5"></a>
##### `defamb`

- Description: TODO

<a id="member-6"></a>
##### `defdif`

- Description: TODO

<a id="member-7"></a>
##### `defspc`

- Description: TODO

<a id="member-10"></a>
##### `lights`

- Description: TODO

<a id="member-11"></a>
##### `ll`

- Description: TODO

<a id="member-21"></a>
##### `lighting`

- Description: TODO

<a id="member-22"></a>
##### `vlight`

- Description: TODO

<a id="member-23"></a>
##### `flight`

- Description: TODO

<a id="member-24"></a>
##### `shader`

- Description: TODO

<a id="member-25"></a>
##### `material`

- Description: TODO

<a id="member-26"></a>
##### `defamb`

- Description: TODO

<a id="member-27"></a>
##### `defdif`

- Description: TODO

<a id="member-28"></a>
##### `defspc`

- Description: TODO

<a id="member-29"></a>
##### `defemi`

- Description: TODO

<a id="member-38"></a>
##### `slot`

- Description: TODO

<a id="member-40"></a>
##### `shader`

- Description: TODO

<a id="member-43"></a>
##### `celshade`

- Description: TODO

<a id="member-45"></a>
##### `id`

- Description: TODO

<a id="member-46"></a>
##### `amb`

- Description: TODO

<a id="member-47"></a>
##### `dif`

- Description: TODO

<a id="member-48"></a>
##### `spc`

- Description: TODO

<a id="member-49"></a>
##### `hatt`

- Description: TODO

<a id="member-50"></a>
##### `hexp`

- Description: TODO

<a id="member-51"></a>
##### `ac`

- Description: TODO

<a id="member-52"></a>
##### `al`

- Description: TODO

<a id="member-53"></a>
##### `aq`

- Description: TODO

<a id="member-54"></a>
##### `exp`

- Description: TODO

<a id="member-55"></a>
##### `dir`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `prio(int prio)`

- Description: TODO

<a id="member-9"></a>
##### `public abstract Object[] params(GroupPipe state);`

- Description: TODO

<a id="member-12"></a>
##### `params()`

- Description: TODO

<a id="member-13"></a>
##### `compile()`

- Description: TODO

<a id="member-14"></a>
##### `add(RenderList.Slot<Light> light)`

- Description: TODO

<a id="member-15"></a>
##### `remove(RenderList.Slot<Light> light)`

- Description: TODO

<a id="member-16"></a>
##### `shader()`

- Description: TODO

<a id="member-17"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-18"></a>
##### `index(Light l)`

- Description: TODO

<a id="member-19"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-20"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-30"></a>
##### `PhongLight(boolean frag, FColor amb, FColor dif, FColor spc, FColor emi, float shine)`

- Description: TODO

<a id="member-31"></a>
##### `PhongLight(boolean frag, Color amb, Color dif, Color spc, Color emi, float shine)`

- Description: TODO

<a id="member-32"></a>
##### `PhongLight(boolean frag, FColor col)`

- Description: TODO

<a id="member-33"></a>
##### `PhongLight(boolean frag)`

- Description: TODO

<a id="member-34"></a>
##### `shader()`

- Description: TODO

<a id="member-35"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-36"></a>
##### `cons(Material.Buffer buf, Object... args)`

- Description: TODO

<a id="member-37"></a>
##### `cons(Material.Buffer buf, Object... args)`

- Description: TODO

<a id="member-39"></a>
##### `CelShade(boolean dif, boolean spc)`

- Description: TODO

<a id="member-41"></a>
##### `shader()`

- Description: TODO

<a id="member-42"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-44"></a>
##### `cons(Material.Buffer buf, Object... args)`

- Description: TODO

<a id="member-56"></a>
##### `cold(Message buf)`

- Description: TODO

<a id="member-57"></a>
##### `cold2(Message buf)`

- Description: TODO

<a id="member-58"></a>
##### `Res(Resource res, Message buf)`

- Description: TODO

<a id="member-59"></a>
##### `make()`

- Description: TODO

<a id="member-60"></a>
##### `init()`

- Description: TODO

<a id="member-61"></a>
##### `layerid()`

- Description: TODO
