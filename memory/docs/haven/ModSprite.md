# ModSprite

## Meta

- Source: [ModSprite.java](../../../src/haven/ModSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a modified sprite wrapper.

## Code Members

### Member Index

#### Fields

- [rmods](#member-1)
- [curcons](#member-2)
- [noparts](#member-3)
- [notickers](#member-4)
- [noeqtgts](#member-5)
- [nomods](#member-6)
- [gob](#member-7)
- [flags](#member-8)
- [resdata](#member-9)
- [slots](#member-10)
- [imods](#member-11)
- [parts](#member-12)
- [tickers](#member-13)
- [eqtgts](#member-14)
- [omods](#member-15)
- [lastupd](#member-16)
- [fact](#member-17)
- [obj](#member-26)
- [wraps](#member-27)
- [state](#member-28)
- [dynstate](#member-29)
- [info](#member-30)
- [mods](#member-35)
- [parts](#member-36)
- [tickers](#member-37)
- [eqtgts](#member-38)
- [res](#member-44)
- [mods](#member-45)
- [smods](#member-46)
- [rdcache](#member-50)
- [meshes](#member-73)
- [main](#member-77)
- [rlinks](#member-78)
- [parts](#member-79)
- [ctxr](#member-82)
- [descs](#member-87)
- [anims](#member-88)
- [ids](#member-89)
- [rigid](#member-96)
- [morphed](#member-97)
- [unboned](#member-98)
- [bonedb](#member-99)
- [ipollen](#member-100)
- [initids](#member-101)
- [spr](#member-102)
- [skel](#member-103)
- [pose](#member-104)
- [descs](#member-105)
- [mods](#member-106)
- [ids](#member-107)
- [stat](#member-108)
- [oldpose](#member-109)
- [ipold](#member-110)
- [ctxr](#member-116)

#### Methods

- [public void operate(ModSprite spr);](#member-18)
- [public void operate(Cons cons);](#member-19)
- [order()](#member-20)
- [age()](#member-21)
- [decdata(Message sdt)](#member-22)
- [of(Consumer<Cons> mod, int order)](#member-23)
- [tick(double dt)](#member-24)
- [gtick(Render g)](#member-25)
- [Part(RenderTree.Node obj, NodeWrap... wraps)](#member-31)
- [unwrap()](#member-32)
- [make()](#member-33)
- [info()](#member-34)
- [spr()](#member-39)
- [add(Mod mod)](#member-40)
- [add(Part part)](#member-41)
- [process()](#member-42)
- [parts()](#member-43)
- [ResData(Resource res)](#member-47)
- [ModMaker()](#member-48)
- [public void operate(ResData dat);](#member-49)
- [resdata(Resource res)](#member-51)
- [decflags(Message sdt)](#member-52)
- [decdata(Message sdt)](#member-53)
- [init()](#member-54)
- [imod(Mod mod)](#member-55)
- [imod(Class<T> cl)](#member-56)
- [cons()](#member-57)
- [curcons()](#member-58)
- [modifiers(Cons cons)](#member-59)
- [update()](#member-60)
- [update(Message sdt)](#member-61)
- [omods(Collection<Mod> buf, Gob gob)](#member-62)
- [getomods()](#member-63)
- [attrupdate()](#member-64)
- [tick(double dt)](#member-65)
- [gtick(Render g)](#member-66)
- [age()](#member-67)
- [parts(RenderTree.Slot slot)](#member-68)
- [added(RenderTree.Slot slot)](#member-69)
- [removed(RenderTree.Slot slot)](#member-70)
- [eqpoint(String nm, Message dat)](#member-71)
- [toString()](#member-72)
- [Meshes(FastMesh.MeshRes[] meshes)](#member-74)
- [operate(Cons cons)](#member-75)
- [operate(ResData dat)](#member-76)
- [RenderLinks(ModSprite spr, RenderLink.Res[] rlinks)](#member-80)
- [operate(Cons cons)](#member-81)
- [context(Class<T> cl)](#member-83)
- [mkrandoom()](#member-84)
- [order()](#member-85)
- [operate(ResData dat)](#member-86)
- [Animation(MeshAnim.Res[] descs)](#member-90)
- [operate(Cons cons)](#member-91)
- [tick(double ddt)](#member-92)
- [age()](#member-93)
- [order()](#member-94)
- [operate(ResData dat)](#member-95)
- [Poser(ModSprite spr, Skeleton skel, Skeleton.ResPose[] descs)](#member-111)
- [rebuild()](#member-112)
- [operate(Cons cons)](#member-113)
- [tick(double ddt)](#member-114)
- [eqpoint(String nm, Message dat)](#member-115)
- [context(Class<T> cl)](#member-117)
- [getloc()](#member-118)
- [getv()](#member-119)
- [age()](#member-120)
- [order()](#member-121)
- [operate(ResData dat)](#member-122)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `rmods`

- Description: TODO

<a id="member-2"></a>
##### `curcons`

- Description: TODO

<a id="member-3"></a>
##### `noparts`

- Description: TODO

<a id="member-4"></a>
##### `notickers`

- Description: TODO

<a id="member-5"></a>
##### `noeqtgts`

- Description: TODO

<a id="member-6"></a>
##### `nomods`

- Description: TODO

<a id="member-7"></a>
##### `gob`

- Description: TODO

<a id="member-8"></a>
##### `flags`

- Description: TODO

<a id="member-9"></a>
##### `resdata`

- Description: TODO

<a id="member-10"></a>
##### `slots`

- Description: TODO

<a id="member-11"></a>
##### `imods`

- Description: TODO

<a id="member-12"></a>
##### `parts`

- Description: TODO

<a id="member-13"></a>
##### `tickers`

- Description: TODO

<a id="member-14"></a>
##### `eqtgts`

- Description: TODO

<a id="member-15"></a>
##### `omods`

- Description: TODO

<a id="member-16"></a>
##### `lastupd`

- Description: TODO

<a id="member-17"></a>
##### `fact`

- Description: TODO

<a id="member-26"></a>
##### `obj`

- Description: TODO

<a id="member-27"></a>
##### `wraps`

- Description: TODO

<a id="member-28"></a>
##### `state`

- Description: TODO

<a id="member-29"></a>
##### `dynstate`

- Description: TODO

<a id="member-30"></a>
##### `info`

- Description: TODO

<a id="member-35"></a>
##### `mods`

- Description: TODO

<a id="member-36"></a>
##### `parts`

- Description: TODO

<a id="member-37"></a>
##### `tickers`

- Description: TODO

<a id="member-38"></a>
##### `eqtgts`

- Description: TODO

<a id="member-44"></a>
##### `res`

- Description: TODO

<a id="member-45"></a>
##### `mods`

- Description: TODO

<a id="member-46"></a>
##### `smods`

- Description: TODO

<a id="member-50"></a>
##### `rdcache`

- Description: TODO

<a id="member-73"></a>
##### `meshes`

- Description: TODO

<a id="member-77"></a>
##### `main`

- Description: TODO

<a id="member-78"></a>
##### `rlinks`

- Description: TODO

<a id="member-79"></a>
##### `parts`

- Description: TODO

<a id="member-82"></a>
##### `ctxr`

- Description: TODO

<a id="member-87"></a>
##### `descs`

- Description: TODO

<a id="member-88"></a>
##### `anims`

- Description: TODO

<a id="member-89"></a>
##### `ids`

- Description: TODO

<a id="member-96"></a>
##### `rigid`

- Description: TODO

<a id="member-97"></a>
##### `morphed`

- Description: TODO

<a id="member-98"></a>
##### `unboned`

- Description: TODO

<a id="member-99"></a>
##### `bonedb`

- Description: TODO

<a id="member-100"></a>
##### `ipollen`

- Description: TODO

<a id="member-101"></a>
##### `initids`

- Description: TODO

<a id="member-102"></a>
##### `spr`

- Description: TODO

<a id="member-103"></a>
##### `skel`

- Description: TODO

<a id="member-104"></a>
##### `pose`

- Description: TODO

<a id="member-105"></a>
##### `descs`

- Description: TODO

<a id="member-106"></a>
##### `mods`

- Description: TODO

<a id="member-107"></a>
##### `ids`

- Description: TODO

<a id="member-108"></a>
##### `stat`

- Description: TODO

<a id="member-109"></a>
##### `oldpose`

- Description: TODO

<a id="member-110"></a>
##### `ipold`

- Description: TODO

<a id="member-116"></a>
##### `ctxr`

- Description: TODO

#### Methods

<a id="member-18"></a>
##### `public void operate(ModSprite spr);`

- Description: TODO

<a id="member-19"></a>
##### `public void operate(Cons cons);`

- Description: TODO

<a id="member-20"></a>
##### `order()`

- Description: TODO

<a id="member-21"></a>
##### `age()`

- Description: TODO

<a id="member-22"></a>
##### `decdata(Message sdt)`

- Description: TODO

<a id="member-23"></a>
##### `of(Consumer<Cons> mod, int order)`

- Description: TODO

<a id="member-24"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-25"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-31"></a>
##### `Part(RenderTree.Node obj, NodeWrap... wraps)`

- Description: TODO

<a id="member-32"></a>
##### `unwrap()`

- Description: TODO

<a id="member-33"></a>
##### `make()`

- Description: TODO

<a id="member-34"></a>
##### `info()`

- Description: TODO

<a id="member-39"></a>
##### `spr()`

- Description: TODO

<a id="member-40"></a>
##### `add(Mod mod)`

- Description: TODO

<a id="member-41"></a>
##### `add(Part part)`

- Description: TODO

<a id="member-42"></a>
##### `process()`

- Description: TODO

<a id="member-43"></a>
##### `parts()`

- Description: TODO

<a id="member-47"></a>
##### `ResData(Resource res)`

- Description: TODO

<a id="member-48"></a>
##### `ModMaker()`

- Description: TODO

<a id="member-49"></a>
##### `public void operate(ResData dat);`

- Description: TODO

<a id="member-51"></a>
##### `resdata(Resource res)`

- Description: TODO

<a id="member-52"></a>
##### `decflags(Message sdt)`

- Description: TODO

<a id="member-53"></a>
##### `decdata(Message sdt)`

- Description: TODO

<a id="member-54"></a>
##### `init()`

- Description: TODO

<a id="member-55"></a>
##### `imod(Mod mod)`

- Description: TODO

<a id="member-56"></a>
##### `imod(Class<T> cl)`

- Description: TODO

<a id="member-57"></a>
##### `cons()`

- Description: TODO

<a id="member-58"></a>
##### `curcons()`

- Description: TODO

<a id="member-59"></a>
##### `modifiers(Cons cons)`

- Description: TODO

<a id="member-60"></a>
##### `update()`

- Description: TODO

<a id="member-61"></a>
##### `update(Message sdt)`

- Description: TODO

<a id="member-62"></a>
##### `omods(Collection<Mod> buf, Gob gob)`

- Description: TODO

<a id="member-63"></a>
##### `getomods()`

- Description: TODO

<a id="member-64"></a>
##### `attrupdate()`

- Description: TODO

<a id="member-65"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-66"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-67"></a>
##### `age()`

- Description: TODO

<a id="member-68"></a>
##### `parts(RenderTree.Slot slot)`

- Description: TODO

<a id="member-69"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-70"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-71"></a>
##### `eqpoint(String nm, Message dat)`

- Description: TODO

<a id="member-72"></a>
##### `toString()`

- Description: TODO

<a id="member-74"></a>
##### `Meshes(FastMesh.MeshRes[] meshes)`

- Description: TODO

<a id="member-75"></a>
##### `operate(Cons cons)`

- Description: TODO

<a id="member-76"></a>
##### `operate(ResData dat)`

- Description: TODO

<a id="member-80"></a>
##### `RenderLinks(ModSprite spr, RenderLink.Res[] rlinks)`

- Description: TODO

<a id="member-81"></a>
##### `operate(Cons cons)`

- Description: TODO

<a id="member-83"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-84"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-85"></a>
##### `order()`

- Description: TODO

<a id="member-86"></a>
##### `operate(ResData dat)`

- Description: TODO

<a id="member-90"></a>
##### `Animation(MeshAnim.Res[] descs)`

- Description: TODO

<a id="member-91"></a>
##### `operate(Cons cons)`

- Description: TODO

<a id="member-92"></a>
##### `tick(double ddt)`

- Description: TODO

<a id="member-93"></a>
##### `age()`

- Description: TODO

<a id="member-94"></a>
##### `order()`

- Description: TODO

<a id="member-95"></a>
##### `operate(ResData dat)`

- Description: TODO

<a id="member-111"></a>
##### `Poser(ModSprite spr, Skeleton skel, Skeleton.ResPose[] descs)`

- Description: TODO

<a id="member-112"></a>
##### `rebuild()`

- Description: TODO

<a id="member-113"></a>
##### `operate(Cons cons)`

- Description: TODO

<a id="member-114"></a>
##### `tick(double ddt)`

- Description: TODO

<a id="member-115"></a>
##### `eqpoint(String nm, Message dat)`

- Description: TODO

<a id="member-117"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-118"></a>
##### `getloc()`

- Description: TODO

<a id="member-119"></a>
##### `getv()`

- Description: TODO

<a id="member-120"></a>
##### `age()`

- Description: TODO

<a id="member-121"></a>
##### `order()`

- Description: TODO

<a id="member-122"></a>
##### `operate(ResData dat)`

- Description: TODO
