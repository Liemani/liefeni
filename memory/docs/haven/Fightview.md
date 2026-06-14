# Fightview

## Meta

- Source: [Fightview.java](../../../src/haven/Fightview.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays fight view information.

## Code Members

### Member Index

#### Fields

- [bg](#member-1)
- [height](#member-2)
- [ymarg](#member-3)
- [width](#member-4)
- [avasz](#member-5)
- [cavac](#member-6)
- [cgivec](#member-7)
- [cpursc](#member-8)
- [lsrel](#member-9)
- [buffs](#member-10)
- [obinfo](#member-11)
- [lsdisp](#member-12)
- [current](#member-13)
- [blk](#member-14)
- [batk](#member-15)
- [iatk](#member-16)
- [atkcs](#member-17)
- [atkct](#member-18)
- [lastact](#member-19)
- [lastuse](#member-20)
- [curdisp](#member-21)
- [nonmain](#member-22)
- [gobid](#member-23)
- [buffs](#member-24)
- [relbuffs](#member-25)
- [gst](#member-26)
- [ip](#member-27)
- [oip](#member-28)
- [lastact](#member-29)
- [lastuse](#member-30)
- [invalid](#member-31)
- [rel](#member-36)
- [ava](#member-37)
- [give](#member-38)
- [purs](#member-39)
- [rel](#member-49)
- [ava](#member-50)
- [give](#member-51)
- [purs](#member-52)
- [id](#member-68)

#### Methods

- [Relation(long gobid)](#member-32)
- [give(int state)](#member-33)
- [remove()](#member-34)
- [use(Indir<Resource> act)](#member-35)
- [Relbox(Relation rel)](#member-40)
- [draw(GOut g)](#member-41)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-42)
- [Rellist(int h)](#member-43)
- [items()](#member-44)
- [makeitem(Relation rel, int idx, Coord sz)](#member-45)
- [drawslot(GOut g, Relation item, int idx, Area area)](#member-46)
- [mousewheel(MouseWheelEvent ev)](#member-47)
- [unselect(int button)](#member-48)
- [Mainrel(Relation rel)](#member-53)
- [lpack()](#member-54)
- [draw(GOut g)](#member-55)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-56)
- [use(Indir<Resource> act)](#member-57)
- [create(UI ui, Object[] args)](#member-58)
- [addchild(Widget child, Object... args)](#member-59)
- [obinfo(long gobid, boolean creat)](#member-60)
- [obinfo(long gobid, Class<T> cl, boolean creat)](#member-61)
- [prio()](#member-62)
- [grav()](#member-63)
- [layout()](#member-64)
- [updrel()](#member-65)
- [setcur(Relation rel)](#member-66)
- [tick(double dt)](#member-67)
- [Notfound(long id)](#member-69)
- [getrel(long gobid)](#member-70)
- [uimsg(String msg, Object... args)](#member-71)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bg`

- Description: TODO

<a id="member-2"></a>
##### `height`

- Description: TODO

<a id="member-3"></a>
##### `ymarg`

- Description: TODO

<a id="member-4"></a>
##### `width`

- Description: TODO

<a id="member-5"></a>
##### `avasz`

- Description: TODO

<a id="member-6"></a>
##### `cavac`

- Description: TODO

<a id="member-7"></a>
##### `cgivec`

- Description: TODO

<a id="member-8"></a>
##### `cpursc`

- Description: TODO

<a id="member-9"></a>
##### `lsrel`

- Description: TODO

<a id="member-10"></a>
##### `buffs`

- Description: TODO

<a id="member-11"></a>
##### `obinfo`

- Description: TODO

<a id="member-12"></a>
##### `lsdisp`

- Description: TODO

<a id="member-13"></a>
##### `current`

- Description: TODO

<a id="member-14"></a>
##### `blk`

- Description: TODO

<a id="member-15"></a>
##### `batk`

- Description: TODO

<a id="member-16"></a>
##### `iatk`

- Description: TODO

<a id="member-17"></a>
##### `atkcs`

- Description: TODO

<a id="member-18"></a>
##### `atkct`

- Description: TODO

<a id="member-19"></a>
##### `lastact`

- Description: TODO

<a id="member-20"></a>
##### `lastuse`

- Description: TODO

<a id="member-21"></a>
##### `curdisp`

- Description: TODO

<a id="member-22"></a>
##### `nonmain`

- Description: TODO

<a id="member-23"></a>
##### `gobid`

- Description: TODO

<a id="member-24"></a>
##### `buffs`

- Description: TODO

<a id="member-25"></a>
##### `relbuffs`

- Description: TODO

<a id="member-26"></a>
##### `gst`

- Description: TODO

<a id="member-27"></a>
##### `ip`

- Description: TODO

<a id="member-28"></a>
##### `oip`

- Description: TODO

<a id="member-29"></a>
##### `lastact`

- Description: TODO

<a id="member-30"></a>
##### `lastuse`

- Description: TODO

<a id="member-31"></a>
##### `invalid`

- Description: TODO

<a id="member-36"></a>
##### `rel`

- Description: TODO

<a id="member-37"></a>
##### `ava`

- Description: TODO

<a id="member-38"></a>
##### `give`

- Description: TODO

<a id="member-39"></a>
##### `purs`

- Description: TODO

<a id="member-49"></a>
##### `rel`

- Description: TODO

<a id="member-50"></a>
##### `ava`

- Description: TODO

<a id="member-51"></a>
##### `give`

- Description: TODO

<a id="member-52"></a>
##### `purs`

- Description: TODO

<a id="member-68"></a>
##### `id`

- Description: TODO

#### Methods

<a id="member-32"></a>
##### `Relation(long gobid)`

- Description: TODO

<a id="member-33"></a>
##### `give(int state)`

- Description: TODO

<a id="member-34"></a>
##### `remove()`

- Description: TODO

<a id="member-35"></a>
##### `use(Indir<Resource> act)`

- Description: TODO

<a id="member-40"></a>
##### `Relbox(Relation rel)`

- Description: TODO

<a id="member-41"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-42"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-43"></a>
##### `Rellist(int h)`

- Description: TODO

<a id="member-44"></a>
##### `items()`

- Description: TODO

<a id="member-45"></a>
##### `makeitem(Relation rel, int idx, Coord sz)`

- Description: TODO

<a id="member-46"></a>
##### `drawslot(GOut g, Relation item, int idx, Area area)`

- Description: TODO

<a id="member-47"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-48"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-53"></a>
##### `Mainrel(Relation rel)`

- Description: TODO

<a id="member-54"></a>
##### `lpack()`

- Description: TODO

<a id="member-55"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-56"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-57"></a>
##### `use(Indir<Resource> act)`

- Description: TODO

<a id="member-58"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-59"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-60"></a>
##### `obinfo(long gobid, boolean creat)`

- Description: TODO

<a id="member-61"></a>
##### `obinfo(long gobid, Class<T> cl, boolean creat)`

- Description: TODO

<a id="member-62"></a>
##### `prio()`

- Description: TODO

<a id="member-63"></a>
##### `grav()`

- Description: TODO

<a id="member-64"></a>
##### `layout()`

- Description: TODO

<a id="member-65"></a>
##### `updrel()`

- Description: TODO

<a id="member-66"></a>
##### `setcur(Relation rel)`

- Description: TODO

<a id="member-67"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-69"></a>
##### `Notfound(long id)`

- Description: TODO

<a id="member-70"></a>
##### `getrel(long gobid)`

- Description: TODO

<a id="member-71"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO
