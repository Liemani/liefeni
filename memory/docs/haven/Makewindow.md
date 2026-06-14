# Makewindow

## Meta

- Source: [Makewindow.java](../../../src/haven/Makewindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the crafting/make window.

## Code Members

### Member Index

#### Fields

- [qmodl](#member-1)
- [tooll](#member-2)
- [boff](#member-3)
- [rcpnm](#member-4)
- [inputs](#member-5)
- [outputs](#member-6)
- [qmod](#member-7)
- [tools](#member-8)
- [xoff](#member-9)
- [qmy](#member-10)
- [outy](#member-11)
- [ctxr](#member-13)
- [res](#member-14)
- [sdt](#member-15)
- [num](#member-16)
- [spr](#member-17)
- [rawinfo](#member-18)
- [info](#member-19)
- [opt](#member-23)
- [info](#member-25)
- [tex](#member-26)
- [rnd](#member-32)
- [kb_make](#member-38)
- [kb_makeall](#member-39)
- [qmodsz](#member-41)
- [qmicons](#member-42)
- [spec](#member-44)
- [opt](#member-45)
- [num](#member-46)
- [rstate](#member-50)
- [hoverstart](#member-53)
- [stip](#member-54)
- [ltip](#member-55)
- [idx](#member-58)
- [using](#member-59)
- [rpag](#member-60)
- [cc](#member-61)
- [qmx](#member-69)
- [toolx](#member-70)
- [text](#member-72)

#### Methods

- [create(UI ui, Object[] args)](#member-12)
- [Spec(Indir<Resource> res, Message sdt, int num, Object[] info)](#member-20)
- [sprite()](#member-21)
- [draw(GOut g)](#member-22)
- [opt()](#member-24)
- [SpecTip(List<ItemInfo> info, BufferedImage img)](#member-27)
- [info()](#member-28)
- [get()](#member-29)
- [shorttip()](#member-30)
- [longtip()](#member-31)
- [mkrandoom()](#member-33)
- [getres()](#member-34)
- [context(Class<T> cl)](#member-35)
- [info()](#member-36)
- [resource()](#member-37)
- [uimsg(String msg, Object... args)](#member-40)
- [qmicon(Indir<Resource> qm)](#member-43)
- [SpecWidget(Spec spec)](#member-47)
- [info()](#member-48)
- [drawbg(GOut g)](#member-49)
- [drawicon(GOut g)](#member-51)
- [draw(GOut g)](#member-52)
- [tooltip(Coord c, Widget prev)](#member-56)
- [tick(double dt)](#member-57)
- [Input(Spec spec, int idx)](#member-62)
- [drawbg(GOut g)](#member-63)
- [mousedown(MouseDownEvent ev)](#member-64)
- [tick(double dt)](#member-65)
- [recipes(List<MenuGrid.Pagina> pag)](#member-66)
- [using(int a)](#member-67)
- [draw(GOut g)](#member-68)
- [tooltip(Coord mc, Widget prev)](#member-71)
- [Optional(Owner owner)](#member-73)
- [tipimg()](#member-74)
- [shortvar()](#member-75)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `qmodl`

- Description: TODO

<a id="member-2"></a>
##### `tooll`

- Description: TODO

<a id="member-3"></a>
##### `boff`

- Description: TODO

<a id="member-4"></a>
##### `rcpnm`

- Description: TODO

<a id="member-5"></a>
##### `inputs`

- Description: TODO

<a id="member-6"></a>
##### `outputs`

- Description: TODO

<a id="member-7"></a>
##### `qmod`

- Description: TODO

<a id="member-8"></a>
##### `tools`

- Description: TODO

<a id="member-9"></a>
##### `xoff`

- Description: TODO

<a id="member-10"></a>
##### `qmy`

- Description: TODO

<a id="member-11"></a>
##### `outy`

- Description: TODO

<a id="member-13"></a>
##### `ctxr`

- Description: TODO

<a id="member-14"></a>
##### `res`

- Description: TODO

<a id="member-15"></a>
##### `sdt`

- Description: TODO

<a id="member-16"></a>
##### `num`

- Description: TODO

<a id="member-17"></a>
##### `spr`

- Description: TODO

<a id="member-18"></a>
##### `rawinfo`

- Description: TODO

<a id="member-19"></a>
##### `info`

- Description: TODO

<a id="member-23"></a>
##### `opt`

- Description: TODO

<a id="member-25"></a>
##### `info`

- Description: TODO

<a id="member-26"></a>
##### `tex`

- Description: TODO

<a id="member-32"></a>
##### `rnd`

- Description: TODO

<a id="member-38"></a>
##### `kb_make`

- Description: TODO

<a id="member-39"></a>
##### `kb_makeall`

- Description: TODO

<a id="member-41"></a>
##### `qmodsz`

- Description: TODO

<a id="member-42"></a>
##### `qmicons`

- Description: TODO

<a id="member-44"></a>
##### `spec`

- Description: TODO

<a id="member-45"></a>
##### `opt`

- Description: TODO

<a id="member-46"></a>
##### `num`

- Description: TODO

<a id="member-50"></a>
##### `rstate`

- Description: TODO

<a id="member-53"></a>
##### `hoverstart`

- Description: TODO

<a id="member-54"></a>
##### `stip`

- Description: TODO

<a id="member-55"></a>
##### `ltip`

- Description: TODO

<a id="member-58"></a>
##### `idx`

- Description: TODO

<a id="member-59"></a>
##### `using`

- Description: TODO

<a id="member-60"></a>
##### `rpag`

- Description: TODO

<a id="member-61"></a>
##### `cc`

- Description: TODO

<a id="member-69"></a>
##### `qmx`

- Description: TODO

<a id="member-70"></a>
##### `toolx`

- Description: TODO

<a id="member-72"></a>
##### `text`

- Description: TODO

#### Methods

<a id="member-12"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-20"></a>
##### `Spec(Indir<Resource> res, Message sdt, int num, Object[] info)`

- Description: TODO

<a id="member-21"></a>
##### `sprite()`

- Description: TODO

<a id="member-22"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-24"></a>
##### `opt()`

- Description: TODO

<a id="member-27"></a>
##### `SpecTip(List<ItemInfo> info, BufferedImage img)`

- Description: TODO

<a id="member-28"></a>
##### `info()`

- Description: TODO

<a id="member-29"></a>
##### `get()`

- Description: TODO

<a id="member-30"></a>
##### `shorttip()`

- Description: TODO

<a id="member-31"></a>
##### `longtip()`

- Description: TODO

<a id="member-33"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-34"></a>
##### `getres()`

- Description: TODO

<a id="member-35"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-36"></a>
##### `info()`

- Description: TODO

<a id="member-37"></a>
##### `resource()`

- Description: TODO

<a id="member-40"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-43"></a>
##### `qmicon(Indir<Resource> qm)`

- Description: TODO

<a id="member-47"></a>
##### `SpecWidget(Spec spec)`

- Description: TODO

<a id="member-48"></a>
##### `info()`

- Description: TODO

<a id="member-49"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-51"></a>
##### `drawicon(GOut g)`

- Description: TODO

<a id="member-52"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-56"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-57"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-62"></a>
##### `Input(Spec spec, int idx)`

- Description: TODO

<a id="member-63"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-64"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-65"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-66"></a>
##### `recipes(List<MenuGrid.Pagina> pag)`

- Description: TODO

<a id="member-67"></a>
##### `using(int a)`

- Description: TODO

<a id="member-68"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-71"></a>
##### `tooltip(Coord mc, Widget prev)`

- Description: TODO

<a id="member-73"></a>
##### `Optional(Owner owner)`

- Description: TODO

<a id="member-74"></a>
##### `tipimg()`

- Description: TODO

<a id="member-75"></a>
##### `shortvar()`

- Description: TODO
