# WoundWnd

## Meta

- Source: [WoundWnd.java](../../../src/haven/WoundWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the wound window.

## Code Members

### Member Index

#### Fields

- [namef](#member-1)
- [woundbox](#member-2)
- [wounds](#member-3)
- [wound](#member-4)
- [doc](#member-9)
- [glob](#member-14)
- [id](#member-15)
- [parentid](#member-16)
- [res](#member-17)
- [level](#member-18)
- [rawinfo](#member-19)
- [sortkey](#member-20)
- [ctxr](#member-22)
- [info](#member-25)
- [id](#member-30)
- [info](#member-31)
- [wounds](#member-40)
- [loading](#member-41)
- [wcomp](#member-42)
- [w](#member-48)
- [qd](#member-49)
- [nm](#member-50)
- [dres](#member-51)
- [dinfo](#member-52)

#### Methods

- [create(UI ui, Object[] args)](#member-5)
- [qwdg(int h)](#member-6)
- [qstr()](#member-7)
- [qprio()](#member-8)
- [WoundPagina(Owner owner, RichText.Document doc)](#member-10)
- [WoundPagina(Owner owner, Resource.Pagina pag)](#member-11)
- [layout(Layout l)](#member-12)
- [order()](#member-13)
- [Wound(Glob glob, int id, Indir<Resource> res, int parentid)](#member-21)
- [context(Class<T> cl)](#member-23)
- [resource()](#member-24)
- [info()](#member-26)
- [icon()](#member-27)
- [name()](#member-28)
- [public int woundid();](#member-29)
- [WoundBox(int id)](#member-32)
- [added()](#member-33)
- [wound()](#member-34)
- [tick(double dt)](#member-35)
- [drawbg(GOut g)](#member-36)
- [renderinfo(int width)](#member-37)
- [woundid()](#member-38)
- [create(UI ui, Object[] args)](#member-39)
- [WoundList(Coord sz)](#member-43)
- [items()](#member-44)
- [makeitem(Wound w, int idx, Coord sz)](#member-45)
- [treesort(List<Wound> from, int pid, int level)](#member-46)
- [tick(double dt)](#member-47)
- [Item(Coord sz, Wound w)](#member-53)
- [getqdat(List<ItemInfo> info)](#member-54)
- [update()](#member-55)
- [drop(Coord cc, Coord ul)](#member-56)
- [iteminteract(Coord cc, Coord ul)](#member-57)
- [draw(GOut g)](#member-58)
- [mousedown(MouseDownEvent ev)](#member-59)
- [drawslot(GOut g, Wound w, int idx, Area area)](#member-60)
- [unselect(int button)](#member-61)
- [get(int id)](#member-62)
- [add(Wound w)](#member-63)
- [remove(int id)](#member-64)
- [addchild(Widget child, Object... args)](#member-65)
- [decwound(Object[] args, int a, int len)](#member-66)
- [uimsg(String nm, Object... args)](#member-67)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `namef`

- Description: TODO

<a id="member-2"></a>
##### `woundbox`

- Description: TODO

<a id="member-3"></a>
##### `wounds`

- Description: TODO

<a id="member-4"></a>
##### `wound`

- Description: TODO

<a id="member-9"></a>
##### `doc`

- Description: TODO

<a id="member-14"></a>
##### `glob`

- Description: TODO

<a id="member-15"></a>
##### `id`

- Description: TODO

<a id="member-16"></a>
##### `parentid`

- Description: TODO

<a id="member-17"></a>
##### `res`

- Description: TODO

<a id="member-18"></a>
##### `level`

- Description: TODO

<a id="member-19"></a>
##### `rawinfo`

- Description: TODO

<a id="member-20"></a>
##### `sortkey`

- Description: TODO

<a id="member-22"></a>
##### `ctxr`

- Description: TODO

<a id="member-25"></a>
##### `info`

- Description: TODO

<a id="member-30"></a>
##### `id`

- Description: TODO

<a id="member-31"></a>
##### `info`

- Description: TODO

<a id="member-40"></a>
##### `wounds`

- Description: TODO

<a id="member-41"></a>
##### `loading`

- Description: TODO

<a id="member-42"></a>
##### `wcomp`

- Description: TODO

<a id="member-48"></a>
##### `w`

- Description: TODO

<a id="member-49"></a>
##### `qd`

- Description: TODO

<a id="member-50"></a>
##### `nm`

- Description: TODO

<a id="member-51"></a>
##### `dres`

- Description: TODO

<a id="member-52"></a>
##### `dinfo`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-6"></a>
##### `qwdg(int h)`

- Description: TODO

<a id="member-7"></a>
##### `qstr()`

- Description: TODO

<a id="member-8"></a>
##### `qprio()`

- Description: TODO

<a id="member-10"></a>
##### `WoundPagina(Owner owner, RichText.Document doc)`

- Description: TODO

<a id="member-11"></a>
##### `WoundPagina(Owner owner, Resource.Pagina pag)`

- Description: TODO

<a id="member-12"></a>
##### `layout(Layout l)`

- Description: TODO

<a id="member-13"></a>
##### `order()`

- Description: TODO

<a id="member-21"></a>
##### `Wound(Glob glob, int id, Indir<Resource> res, int parentid)`

- Description: TODO

<a id="member-23"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-24"></a>
##### `resource()`

- Description: TODO

<a id="member-26"></a>
##### `info()`

- Description: TODO

<a id="member-27"></a>
##### `icon()`

- Description: TODO

<a id="member-28"></a>
##### `name()`

- Description: TODO

<a id="member-29"></a>
##### `public int woundid();`

- Description: TODO

<a id="member-32"></a>
##### `WoundBox(int id)`

- Description: TODO

<a id="member-33"></a>
##### `added()`

- Description: TODO

<a id="member-34"></a>
##### `wound()`

- Description: TODO

<a id="member-35"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-36"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-37"></a>
##### `renderinfo(int width)`

- Description: TODO

<a id="member-38"></a>
##### `woundid()`

- Description: TODO

<a id="member-39"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-43"></a>
##### `WoundList(Coord sz)`

- Description: TODO

<a id="member-44"></a>
##### `items()`

- Description: TODO

<a id="member-45"></a>
##### `makeitem(Wound w, int idx, Coord sz)`

- Description: TODO

<a id="member-46"></a>
##### `treesort(List<Wound> from, int pid, int level)`

- Description: TODO

<a id="member-47"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-53"></a>
##### `Item(Coord sz, Wound w)`

- Description: TODO

<a id="member-54"></a>
##### `getqdat(List<ItemInfo> info)`

- Description: TODO

<a id="member-55"></a>
##### `update()`

- Description: TODO

<a id="member-56"></a>
##### `drop(Coord cc, Coord ul)`

- Description: TODO

<a id="member-57"></a>
##### `iteminteract(Coord cc, Coord ul)`

- Description: TODO

<a id="member-58"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-59"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-60"></a>
##### `drawslot(GOut g, Wound w, int idx, Area area)`

- Description: TODO

<a id="member-61"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-62"></a>
##### `get(int id)`

- Description: TODO

<a id="member-63"></a>
##### `add(Wound w)`

- Description: TODO

<a id="member-64"></a>
##### `remove(int id)`

- Description: TODO

<a id="member-65"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-66"></a>
##### `decwound(Object[] args, int a, int len)`

- Description: TODO

<a id="member-67"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
