# MenuGrid

## Meta

- Source: [MenuGrid.java](../../../src/haven/MenuGrid.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the main menu grid.

## Code Members

### Member Index

#### Fields

- [bg](#member-1)
- [bgsz](#member-2)
- [ttfnd](#member-3)
- [gsz](#member-4)
- [paginae](#member-5)
- [cur](#member-6)
- [pmap](#member-7)
- [dragging](#member-8)
- [curbtns](#member-9)
- [pressed](#member-10)
- [layout](#member-11)
- [grab](#member-12)
- [curoff](#member-13)
- [recons](#member-14)
- [showkeys](#member-15)
- [fstart](#member-16)
- [scm](#member-18)
- [id](#member-19)
- [res](#member-20)
- [sdt](#member-21)
- [anew](#member-22)
- [tnew](#member-23)
- [rawinfo](#member-24)
- [button](#member-29)
- [btn](#member-32)
- [modflags](#member-33)
- [mc](#member-34)
- [click](#member-35)
- [pag](#member-39)
- [res](#member-40)
- [bind](#member-41)
- [spr](#member-42)
- [act](#member-43)
- [parent](#member-46)
- [rstate](#member-55)
- [ols](#member-56)
- [meter](#member-57)
- [keyfnd](#member-62)
- [keyrend](#member-63)
- [haskeyrend](#member-64)
- [info](#member-66)
- [ctxr](#member-68)
- [next](#member-75)
- [bk](#member-76)
- [curttp](#member-83)
- [curttl](#member-84)
- [curtt](#member-85)
- [hoverstart](#member-86)
- [kb_root](#member-96)
- [kb_back](#member-97)
- [kb_next](#member-98)

#### Methods

- [create(UI ui, Object[] args)](#member-17)
- [Pagina(MenuGrid scm, Object id, Indir<Resource> res)](#member-25)
- [res()](#member-26)
- [data()](#member-27)
- [invalidate()](#member-28)
- [button()](#member-30)
- [parent()](#member-31)
- [Interaction(int btn, int modflags, Coord2d mc, ClickData click)](#member-36)
- [Interaction(int btn, int modflags)](#member-37)
- [Interaction()](#member-38)
- [PagButton(Pagina pag)](#member-44)
- [act()](#member-45)
- [parent()](#member-47)
- [spr()](#member-48)
- [name()](#member-49)
- [hotkey()](#member-50)
- [binding()](#member-51)
- [use(Interaction iact)](#member-52)
- [tick(double dt)](#member-53)
- [img()](#member-54)
- [drawmain(GOut g, GSprite spr)](#member-58)
- [draw(GOut g, GSprite spr)](#member-59)
- [sortkey()](#member-60)
- [bindchr(KeyMatch key)](#member-61)
- [keyrend()](#member-65)
- [info()](#member-67)
- [context(Class<T> cl)](#member-69)
- [mkrandoom()](#member-70)
- [getres()](#member-71)
- [rendertt(boolean withpg)](#member-72)
- [FactMaker()](#member-73)
- [public PagButton make(Pagina info);](#member-74)
- [paginafor(Indir<Resource> res)](#member-77)
- [paginafor(Object id, Indir<Resource> res)](#member-78)
- [cons(Pagina p, Collection<PagButton> buf)](#member-79)
- [announce(Pagina pag)](#member-80)
- [updlayout()](#member-81)
- [draw(GOut g)](#member-82)
- [tooltip(Coord c, Widget prev)](#member-87)
- [bhit(Coord c)](#member-88)
- [mousedown(MouseDownEvent ev)](#member-89)
- [mousemove(MouseMoveEvent ev)](#member-90)
- [change(Pagina dst)](#member-91)
- [use(PagButton r, Interaction iact, boolean reset)](#member-92)
- [tick(double dt)](#member-93)
- [mouseup(MouseUpEvent ev)](#member-94)
- [uimsg(String msg, Object... args)](#member-95)
- [globtype(GlobKeyEvent ev)](#member-99)
- [getbinding(Coord cc)](#member-100)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bg`

- Description: TODO

<a id="member-2"></a>
##### `bgsz`

- Description: TODO

<a id="member-3"></a>
##### `ttfnd`

- Description: TODO

<a id="member-4"></a>
##### `gsz`

- Description: TODO

<a id="member-5"></a>
##### `paginae`

- Description: TODO

<a id="member-6"></a>
##### `cur`

- Description: TODO

<a id="member-7"></a>
##### `pmap`

- Description: TODO

<a id="member-8"></a>
##### `dragging`

- Description: TODO

<a id="member-9"></a>
##### `curbtns`

- Description: TODO

<a id="member-10"></a>
##### `pressed`

- Description: TODO

<a id="member-11"></a>
##### `layout`

- Description: TODO

<a id="member-12"></a>
##### `grab`

- Description: TODO

<a id="member-13"></a>
##### `curoff`

- Description: TODO

<a id="member-14"></a>
##### `recons`

- Description: TODO

<a id="member-15"></a>
##### `showkeys`

- Description: TODO

<a id="member-16"></a>
##### `fstart`

- Description: TODO

<a id="member-18"></a>
##### `scm`

- Description: TODO

<a id="member-19"></a>
##### `id`

- Description: TODO

<a id="member-20"></a>
##### `res`

- Description: TODO

<a id="member-21"></a>
##### `sdt`

- Description: TODO

<a id="member-22"></a>
##### `anew`

- Description: TODO

<a id="member-23"></a>
##### `tnew`

- Description: TODO

<a id="member-24"></a>
##### `rawinfo`

- Description: TODO

<a id="member-29"></a>
##### `button`

- Description: TODO

<a id="member-32"></a>
##### `btn`

- Description: TODO

<a id="member-33"></a>
##### `modflags`

- Description: TODO

<a id="member-34"></a>
##### `mc`

- Description: TODO

<a id="member-35"></a>
##### `click`

- Description: TODO

<a id="member-39"></a>
##### `pag`

- Description: TODO

<a id="member-40"></a>
##### `res`

- Description: TODO

<a id="member-41"></a>
##### `bind`

- Description: TODO

<a id="member-42"></a>
##### `spr`

- Description: TODO

<a id="member-43"></a>
##### `act`

- Description: TODO

<a id="member-46"></a>
##### `parent`

- Description: TODO

<a id="member-55"></a>
##### `rstate`

- Description: TODO

<a id="member-56"></a>
##### `ols`

- Description: TODO

<a id="member-57"></a>
##### `meter`

- Description: TODO

<a id="member-62"></a>
##### `keyfnd`

- Description: TODO

<a id="member-63"></a>
##### `keyrend`

- Description: TODO

<a id="member-64"></a>
##### `haskeyrend`

- Description: TODO

<a id="member-66"></a>
##### `info`

- Description: TODO

<a id="member-68"></a>
##### `ctxr`

- Description: TODO

<a id="member-75"></a>
##### `next`

- Description: TODO

<a id="member-76"></a>
##### `bk`

- Description: TODO

<a id="member-83"></a>
##### `curttp`

- Description: TODO

<a id="member-84"></a>
##### `curttl`

- Description: TODO

<a id="member-85"></a>
##### `curtt`

- Description: TODO

<a id="member-86"></a>
##### `hoverstart`

- Description: TODO

<a id="member-96"></a>
##### `kb_root`

- Description: TODO

<a id="member-97"></a>
##### `kb_back`

- Description: TODO

<a id="member-98"></a>
##### `kb_next`

- Description: TODO

#### Methods

<a id="member-17"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-25"></a>
##### `Pagina(MenuGrid scm, Object id, Indir<Resource> res)`

- Description: TODO

<a id="member-26"></a>
##### `res()`

- Description: TODO

<a id="member-27"></a>
##### `data()`

- Description: TODO

<a id="member-28"></a>
##### `invalidate()`

- Description: TODO

<a id="member-30"></a>
##### `button()`

- Description: TODO

<a id="member-31"></a>
##### `parent()`

- Description: TODO

<a id="member-36"></a>
##### `Interaction(int btn, int modflags, Coord2d mc, ClickData click)`

- Description: TODO

<a id="member-37"></a>
##### `Interaction(int btn, int modflags)`

- Description: TODO

<a id="member-38"></a>
##### `Interaction()`

- Description: TODO

<a id="member-44"></a>
##### `PagButton(Pagina pag)`

- Description: TODO

<a id="member-45"></a>
##### `act()`

- Description: TODO

<a id="member-47"></a>
##### `parent()`

- Description: TODO

<a id="member-48"></a>
##### `spr()`

- Description: TODO

<a id="member-49"></a>
##### `name()`

- Description: TODO

<a id="member-50"></a>
##### `hotkey()`

- Description: TODO

<a id="member-51"></a>
##### `binding()`

- Description: TODO

<a id="member-52"></a>
##### `use(Interaction iact)`

- Description: TODO

<a id="member-53"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-54"></a>
##### `img()`

- Description: TODO

<a id="member-58"></a>
##### `drawmain(GOut g, GSprite spr)`

- Description: TODO

<a id="member-59"></a>
##### `draw(GOut g, GSprite spr)`

- Description: TODO

<a id="member-60"></a>
##### `sortkey()`

- Description: TODO

<a id="member-61"></a>
##### `bindchr(KeyMatch key)`

- Description: TODO

<a id="member-65"></a>
##### `keyrend()`

- Description: TODO

<a id="member-67"></a>
##### `info()`

- Description: TODO

<a id="member-69"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-70"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-71"></a>
##### `getres()`

- Description: TODO

<a id="member-72"></a>
##### `rendertt(boolean withpg)`

- Description: TODO

<a id="member-73"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-74"></a>
##### `public PagButton make(Pagina info);`

- Description: TODO

<a id="member-77"></a>
##### `paginafor(Indir<Resource> res)`

- Description: TODO

<a id="member-78"></a>
##### `paginafor(Object id, Indir<Resource> res)`

- Description: TODO

<a id="member-79"></a>
##### `cons(Pagina p, Collection<PagButton> buf)`

- Description: TODO

<a id="member-80"></a>
##### `announce(Pagina pag)`

- Description: TODO

<a id="member-81"></a>
##### `updlayout()`

- Description: TODO

<a id="member-82"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-87"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-88"></a>
##### `bhit(Coord c)`

- Description: TODO

<a id="member-89"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-90"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-91"></a>
##### `change(Pagina dst)`

- Description: TODO

<a id="member-92"></a>
##### `use(PagButton r, Interaction iact, boolean reset)`

- Description: TODO

<a id="member-93"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-94"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-95"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-99"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-100"></a>
##### `getbinding(Coord cc)`

- Description: TODO
