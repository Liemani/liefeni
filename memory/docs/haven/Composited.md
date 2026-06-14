# Composited

## Meta

- Source: [Composited.java](../../../src/haven/Composited.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles composited render state and clicks.

## Code Members

### Member Index

#### Fields

- [skel](#member-1)
- [pose](#member-2)
- [eqowner](#member-3)
- [mod](#member-4)
- [equ](#member-5)
- [poses](#member-6)
- [cmod](#member-7)
- [cequ](#member-8)
- [slots](#member-9)
- [mods](#member-10)
- [old](#member-11)
- [ipold](#member-12)
- [ipol](#member-13)
- [limit](#member-14)
- [stat](#member-15)
- [ldone](#member-16)
- [srnd](#member-17)
- [rsmod](#member-18)
- [z1](#member-25)
- [z2](#member-26)
- [cmp](#member-29)
- [m](#member-31)
- [morph](#member-32)
- [id](#member-33)
- [slots](#member-34)
- [z](#member-35)
- [lz](#member-36)
- [mat](#member-37)
- [order](#member-38)
- [lay](#member-41)
- [eqctxr](#member-48)
- [spr](#member-49)
- [n](#member-50)
- [desc](#member-51)
- [id](#member-52)
- [mod](#member-60)
- [tex](#member-61)
- [id](#member-62)
- [real](#member-63)
- [t](#member-68)
- [id](#member-69)
- [at](#member-70)
- [res](#member-71)
- [off](#member-72)
- [real](#member-73)
- [base](#member-79)
- [mod](#member-80)
- [equ](#member-81)
- [matowner](#member-87)
- [gi](#member-90)
- [prep](#member-93)

#### Methods

- [Poses()](#member-19)
- [Poses(List<? extends PoseMod> mods)](#member-20)
- [rebuild()](#member-21)
- [set(float ipol)](#member-22)
- [tick(float dt)](#member-23)
- [done()](#member-24)
- [ModOrder(int z1, int z2)](#member-27)
- [mainorder()](#member-28)
- [comparator()](#member-30)
- [Layer(Material mat, int z1, int z2)](#member-39)
- [added(RenderTree.Slot slot)](#member-40)
- [Model(FastMesh m, int id)](#member-42)
- [addlay(Material mat)](#member-43)
- [added(RenderTree.Slot slot)](#member-44)
- [removed(RenderTree.Slot slot)](#member-45)
- [ticker()](#member-46)
- [autotick(double dt)](#member-47)
- [Equipped(ED ed)](#member-53)
- [tick(double dt)](#member-54)
- [gtick(Render g)](#member-55)
- [context(Class<T> cl)](#member-56)
- [mkrandoom()](#member-57)
- [comp()](#member-58)
- [toString()](#member-59)
- [MD(Indir<Resource> mod, List<ResData> tex)](#member-64)
- [equals(Object o)](#member-65)
- [clone()](#member-66)
- [toString()](#member-67)
- [ED(int t, String at, ResData res, Coord3f off)](#member-74)
- [equals(Object o)](#member-75)
- [equals2(Object o)](#member-76)
- [clone()](#member-77)
- [toString()](#member-78)
- [Desc()](#member-82)
- [Desc(Indir<Resource> base)](#member-83)
- [decode(Resource.Resolver sess, Object[] args)](#member-84)
- [clone()](#member-85)
- [toString()](#member-86)
- [nmod(Collection<MD> nmod)](#member-88)
- [nequ(List<ED> nequ)](#member-89)
- [CompositeClick(Gob.GobClick gi)](#member-91)
- [clickargs(ClickData cd)](#member-92)
- [toString()](#member-94)
- [parts(RenderTree.Slot slot)](#member-95)
- [added(RenderTree.Slot slot)](#member-96)
- [removed(RenderTree.Slot slot)](#member-97)
- [eqpoint(String nm, Message dat)](#member-98)
- [draw(GOut g)](#member-99)
- [tick(double dt)](#member-100)
- [gtick(Render g)](#member-101)
- [chmod(List<MD> mod)](#member-102)
- [chequ(List<ED> equ)](#member-103)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `skel`

- Description: TODO

<a id="member-2"></a>
##### `pose`

- Description: TODO

<a id="member-3"></a>
##### `eqowner`

- Description: TODO

<a id="member-4"></a>
##### `mod`

- Description: TODO

<a id="member-5"></a>
##### `equ`

- Description: TODO

<a id="member-6"></a>
##### `poses`

- Description: TODO

<a id="member-7"></a>
##### `cmod`

- Description: TODO

<a id="member-8"></a>
##### `cequ`

- Description: TODO

<a id="member-9"></a>
##### `slots`

- Description: TODO

<a id="member-10"></a>
##### `mods`

- Description: TODO

<a id="member-11"></a>
##### `old`

- Description: TODO

<a id="member-12"></a>
##### `ipold`

- Description: TODO

<a id="member-13"></a>
##### `ipol`

- Description: TODO

<a id="member-14"></a>
##### `limit`

- Description: TODO

<a id="member-15"></a>
##### `stat`

- Description: TODO

<a id="member-16"></a>
##### `ldone`

- Description: TODO

<a id="member-17"></a>
##### `srnd`

- Description: TODO

<a id="member-18"></a>
##### `rsmod`

- Description: TODO

<a id="member-25"></a>
##### `z1`

- Description: TODO

<a id="member-26"></a>
##### `z2`

- Description: TODO

<a id="member-29"></a>
##### `cmp`

- Description: TODO

<a id="member-31"></a>
##### `m`

- Description: TODO

<a id="member-32"></a>
##### `morph`

- Description: TODO

<a id="member-33"></a>
##### `id`

- Description: TODO

<a id="member-34"></a>
##### `slots`

- Description: TODO

<a id="member-35"></a>
##### `z`

- Description: TODO

<a id="member-36"></a>
##### `lz`

- Description: TODO

<a id="member-37"></a>
##### `mat`

- Description: TODO

<a id="member-38"></a>
##### `order`

- Description: TODO

<a id="member-41"></a>
##### `lay`

- Description: TODO

<a id="member-48"></a>
##### `eqctxr`

- Description: TODO

<a id="member-49"></a>
##### `spr`

- Description: TODO

<a id="member-50"></a>
##### `n`

- Description: TODO

<a id="member-51"></a>
##### `desc`

- Description: TODO

<a id="member-52"></a>
##### `id`

- Description: TODO

<a id="member-60"></a>
##### `mod`

- Description: TODO

<a id="member-61"></a>
##### `tex`

- Description: TODO

<a id="member-62"></a>
##### `id`

- Description: TODO

<a id="member-63"></a>
##### `real`

- Description: TODO

<a id="member-68"></a>
##### `t`

- Description: TODO

<a id="member-69"></a>
##### `id`

- Description: TODO

<a id="member-70"></a>
##### `at`

- Description: TODO

<a id="member-71"></a>
##### `res`

- Description: TODO

<a id="member-72"></a>
##### `off`

- Description: TODO

<a id="member-73"></a>
##### `real`

- Description: TODO

<a id="member-79"></a>
##### `base`

- Description: TODO

<a id="member-80"></a>
##### `mod`

- Description: TODO

<a id="member-81"></a>
##### `equ`

- Description: TODO

<a id="member-87"></a>
##### `matowner`

- Description: TODO

<a id="member-90"></a>
##### `gi`

- Description: TODO

<a id="member-93"></a>
##### `prep`

- Description: TODO

#### Methods

<a id="member-19"></a>
##### `Poses()`

- Description: TODO

<a id="member-20"></a>
##### `Poses(List<? extends PoseMod> mods)`

- Description: TODO

<a id="member-21"></a>
##### `rebuild()`

- Description: TODO

<a id="member-22"></a>
##### `set(float ipol)`

- Description: TODO

<a id="member-23"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-24"></a>
##### `done()`

- Description: TODO

<a id="member-27"></a>
##### `ModOrder(int z1, int z2)`

- Description: TODO

<a id="member-28"></a>
##### `mainorder()`

- Description: TODO

<a id="member-30"></a>
##### `comparator()`

- Description: TODO

<a id="member-39"></a>
##### `Layer(Material mat, int z1, int z2)`

- Description: TODO

<a id="member-40"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-42"></a>
##### `Model(FastMesh m, int id)`

- Description: TODO

<a id="member-43"></a>
##### `addlay(Material mat)`

- Description: TODO

<a id="member-44"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-45"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-46"></a>
##### `ticker()`

- Description: TODO

<a id="member-47"></a>
##### `autotick(double dt)`

- Description: TODO

<a id="member-53"></a>
##### `Equipped(ED ed)`

- Description: TODO

<a id="member-54"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-55"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-56"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-57"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-58"></a>
##### `comp()`

- Description: TODO

<a id="member-59"></a>
##### `toString()`

- Description: TODO

<a id="member-64"></a>
##### `MD(Indir<Resource> mod, List<ResData> tex)`

- Description: TODO

<a id="member-65"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-66"></a>
##### `clone()`

- Description: TODO

<a id="member-67"></a>
##### `toString()`

- Description: TODO

<a id="member-74"></a>
##### `ED(int t, String at, ResData res, Coord3f off)`

- Description: TODO

<a id="member-75"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-76"></a>
##### `equals2(Object o)`

- Description: TODO

<a id="member-77"></a>
##### `clone()`

- Description: TODO

<a id="member-78"></a>
##### `toString()`

- Description: TODO

<a id="member-82"></a>
##### `Desc()`

- Description: TODO

<a id="member-83"></a>
##### `Desc(Indir<Resource> base)`

- Description: TODO

<a id="member-84"></a>
##### `decode(Resource.Resolver sess, Object[] args)`

- Description: TODO

<a id="member-85"></a>
##### `clone()`

- Description: TODO

<a id="member-86"></a>
##### `toString()`

- Description: TODO

<a id="member-88"></a>
##### `nmod(Collection<MD> nmod)`

- Description: TODO

<a id="member-89"></a>
##### `nequ(List<ED> nequ)`

- Description: TODO

<a id="member-91"></a>
##### `CompositeClick(Gob.GobClick gi)`

- Description: TODO

<a id="member-92"></a>
##### `clickargs(ClickData cd)`

- Description: TODO

<a id="member-94"></a>
##### `toString()`

- Description: TODO

<a id="member-95"></a>
##### `parts(RenderTree.Slot slot)`

- Description: TODO

<a id="member-96"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-97"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-98"></a>
##### `eqpoint(String nm, Message dat)`

- Description: TODO

<a id="member-99"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-100"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-101"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-102"></a>
##### `chmod(List<MD> mod)`

- Description: TODO

<a id="member-103"></a>
##### `chequ(List<ED> equ)`

- Description: TODO
