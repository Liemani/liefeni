# FightWnd

## Meta

- Source: [FightWnd.java](../../../src/haven/FightWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the fight window.

## Code Members

### Member Index

#### Fields

- [nsave](#member-1)
- [maxact](#member-2)
- [actlist](#member-3)
- [savelist](#member-4)
- [acts](#member-5)
- [order](#member-6)
- [usesave](#member-7)
- [saves](#member-8)
- [info](#member-9)
- [count](#member-10)
- [actrawinfo](#member-11)
- [actxr](#member-12)
- [namef](#member-13)
- [res](#member-14)
- [id](#member-15)
- [a](#member-16)
- [u](#member-17)
- [name](#member-18)
- [info](#member-24)
- [icon](#member-28)
- [loading](#member-32)
- [drag](#member-33)
- [grab](#member-34)
- [item](#member-38)
- [use](#member-39)
- [u](#member-40)
- [a](#member-41)
- [grab](#member-42)
- [dp](#member-43)
- [keys](#member-59)
- [grab](#member-60)
- [drag](#member-61)
- [dp](#member-62)
- [animoff](#member-63)
- [animpr](#member-64)
- [anim](#member-65)
- [keys](#member-69)
- [items](#member-77)
- [n](#member-81)
- [redit](#member-82)
- [ed](#member-83)
- [focusstart](#member-84)
- [lc](#member-87)
- [lt](#member-88)
- [unused](#member-98)

#### Methods

- [Action(Indir<Resource> res, int id, int a, int u)](#member-19)
- [rendertext()](#member-20)
- [a(int a)](#member-21)
- [u(int u)](#member-22)
- [resource()](#member-23)
- [info()](#member-25)
- [context(Class<T> cl)](#member-26)
- [rendericon()](#member-27)
- [icon()](#member-29)
- [renderinfo(int width)](#member-30)
- [recount()](#member-31)
- [Actions(Coord sz)](#member-35)
- [items()](#member-36)
- [makeitem(Action act, int idx, Coord sz)](#member-37)
- [Item(Coord sz, Action act)](#member-44)
- [tick(double dt)](#member-45)
- [mousewheel(MouseWheelEvent ev)](#member-46)
- [mousedown(MouseDownEvent ev)](#member-47)
- [mousemove(MouseMoveEvent ev)](#member-48)
- [mouseup(MouseUpEvent ev)](#member-49)
- [setu(int u)](#member-50)
- [drop(Coord cc, Coord ul)](#member-51)
- [iteminteract(Coord cc, Coord ul)](#member-52)
- [change(Action act)](#member-53)
- [tick(double dt)](#member-54)
- [draw(GOut g)](#member-55)
- [drag(Action act)](#member-56)
- [mouseup(MouseUpEvent ev)](#member-57)
- [findorder(Action a)](#member-58)
- [BView()](#member-66)
- [itemc(int i)](#member-67)
- [citem(Coord c)](#member-68)
- [draw(GOut g)](#member-70)
- [mousedown(MouseDownEvent ev)](#member-71)
- [mousemove(MouseMoveEvent ev)](#member-72)
- [mouseup(MouseUpEvent ev)](#member-73)
- [animate(int s, Coord off)](#member-74)
- [dropthing(Coord c, Object thing)](#member-75)
- [tick(double dt)](#member-76)
- [Savelist(Coord sz)](#member-78)
- [items()](#member-79)
- [makeitem(Integer n, int idx, Coord sz)](#member-80)
- [Item(Coord sz, int n)](#member-85)
- [draw(GOut g)](#member-86)
- [mousedown(MouseDownEvent ev)](#member-89)
- [done(ReadLine buf)](#member-90)
- [changed(ReadLine buf)](#member-91)
- [tick(double dt)](#member-92)
- [keydown(KeyDownEvent ev)](#member-93)
- [create(UI ui, Object[] args)](#member-94)
- [load(int n)](#member-95)
- [save(int n)](#member-96)
- [use(int n)](#member-97)
- [findact(int resid)](#member-99)
- [uimsg(String nm, Object... args)](#member-100)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `nsave`

- Description: TODO

<a id="member-2"></a>
##### `maxact`

- Description: TODO

<a id="member-3"></a>
##### `actlist`

- Description: TODO

<a id="member-4"></a>
##### `savelist`

- Description: TODO

<a id="member-5"></a>
##### `acts`

- Description: TODO

<a id="member-6"></a>
##### `order`

- Description: TODO

<a id="member-7"></a>
##### `usesave`

- Description: TODO

<a id="member-8"></a>
##### `saves`

- Description: TODO

<a id="member-9"></a>
##### `info`

- Description: TODO

<a id="member-10"></a>
##### `count`

- Description: TODO

<a id="member-11"></a>
##### `actrawinfo`

- Description: TODO

<a id="member-12"></a>
##### `actxr`

- Description: TODO

<a id="member-13"></a>
##### `namef`

- Description: TODO

<a id="member-14"></a>
##### `res`

- Description: TODO

<a id="member-15"></a>
##### `id`

- Description: TODO

<a id="member-16"></a>
##### `a`

- Description: TODO

<a id="member-17"></a>
##### `u`

- Description: TODO

<a id="member-18"></a>
##### `name`

- Description: TODO

<a id="member-24"></a>
##### `info`

- Description: TODO

<a id="member-28"></a>
##### `icon`

- Description: TODO

<a id="member-32"></a>
##### `loading`

- Description: TODO

<a id="member-33"></a>
##### `drag`

- Description: TODO

<a id="member-34"></a>
##### `grab`

- Description: TODO

<a id="member-38"></a>
##### `item`

- Description: TODO

<a id="member-39"></a>
##### `use`

- Description: TODO

<a id="member-40"></a>
##### `u`

- Description: TODO

<a id="member-41"></a>
##### `a`

- Description: TODO

<a id="member-42"></a>
##### `grab`

- Description: TODO

<a id="member-43"></a>
##### `dp`

- Description: TODO

<a id="member-59"></a>
##### `keys`

- Description: TODO

<a id="member-60"></a>
##### `grab`

- Description: TODO

<a id="member-61"></a>
##### `drag`

- Description: TODO

<a id="member-62"></a>
##### `dp`

- Description: TODO

<a id="member-63"></a>
##### `animoff`

- Description: TODO

<a id="member-64"></a>
##### `animpr`

- Description: TODO

<a id="member-65"></a>
##### `anim`

- Description: TODO

<a id="member-69"></a>
##### `keys`

- Description: TODO

<a id="member-77"></a>
##### `items`

- Description: TODO

<a id="member-81"></a>
##### `n`

- Description: TODO

<a id="member-82"></a>
##### `redit`

- Description: TODO

<a id="member-83"></a>
##### `ed`

- Description: TODO

<a id="member-84"></a>
##### `focusstart`

- Description: TODO

<a id="member-87"></a>
##### `lc`

- Description: TODO

<a id="member-88"></a>
##### `lt`

- Description: TODO

<a id="member-98"></a>
##### `unused`

- Description: TODO

#### Methods

<a id="member-19"></a>
##### `Action(Indir<Resource> res, int id, int a, int u)`

- Description: TODO

<a id="member-20"></a>
##### `rendertext()`

- Description: TODO

<a id="member-21"></a>
##### `a(int a)`

- Description: TODO

<a id="member-22"></a>
##### `u(int u)`

- Description: TODO

<a id="member-23"></a>
##### `resource()`

- Description: TODO

<a id="member-25"></a>
##### `info()`

- Description: TODO

<a id="member-26"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-27"></a>
##### `rendericon()`

- Description: TODO

<a id="member-29"></a>
##### `icon()`

- Description: TODO

<a id="member-30"></a>
##### `renderinfo(int width)`

- Description: TODO

<a id="member-31"></a>
##### `recount()`

- Description: TODO

<a id="member-35"></a>
##### `Actions(Coord sz)`

- Description: TODO

<a id="member-36"></a>
##### `items()`

- Description: TODO

<a id="member-37"></a>
##### `makeitem(Action act, int idx, Coord sz)`

- Description: TODO

<a id="member-44"></a>
##### `Item(Coord sz, Action act)`

- Description: TODO

<a id="member-45"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-46"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-47"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-48"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-49"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-50"></a>
##### `setu(int u)`

- Description: TODO

<a id="member-51"></a>
##### `drop(Coord cc, Coord ul)`

- Description: TODO

<a id="member-52"></a>
##### `iteminteract(Coord cc, Coord ul)`

- Description: TODO

<a id="member-53"></a>
##### `change(Action act)`

- Description: TODO

<a id="member-54"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-55"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-56"></a>
##### `drag(Action act)`

- Description: TODO

<a id="member-57"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-58"></a>
##### `findorder(Action a)`

- Description: TODO

<a id="member-66"></a>
##### `BView()`

- Description: TODO

<a id="member-67"></a>
##### `itemc(int i)`

- Description: TODO

<a id="member-68"></a>
##### `citem(Coord c)`

- Description: TODO

<a id="member-70"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-71"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-72"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-73"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-74"></a>
##### `animate(int s, Coord off)`

- Description: TODO

<a id="member-75"></a>
##### `dropthing(Coord c, Object thing)`

- Description: TODO

<a id="member-76"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-78"></a>
##### `Savelist(Coord sz)`

- Description: TODO

<a id="member-79"></a>
##### `items()`

- Description: TODO

<a id="member-80"></a>
##### `makeitem(Integer n, int idx, Coord sz)`

- Description: TODO

<a id="member-85"></a>
##### `Item(Coord sz, int n)`

- Description: TODO

<a id="member-86"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-89"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-90"></a>
##### `done(ReadLine buf)`

- Description: TODO

<a id="member-91"></a>
##### `changed(ReadLine buf)`

- Description: TODO

<a id="member-92"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-93"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-94"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-95"></a>
##### `load(int n)`

- Description: TODO

<a id="member-96"></a>
##### `save(int n)`

- Description: TODO

<a id="member-97"></a>
##### `use(int n)`

- Description: TODO

<a id="member-99"></a>
##### `findact(int resid)`

- Description: TODO

<a id="member-100"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
