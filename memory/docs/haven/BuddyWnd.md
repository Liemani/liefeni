# BuddyWnd

## Meta

- Source: [BuddyWnd.java](../../../src/haven/BuddyWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays buddy list UI.

## Code Members

### Member Index

#### Fields

- [buddies](#member-1)
- [idmap](#member-2)
- [bl](#member-3)
- [pname](#member-4)
- [charpass](#member-5)
- [opass](#member-6)
- [menu](#member-7)
- [info](#member-8)
- [infof](#member-9)
- [serial](#member-10)
- [width](#member-11)
- [margin1](#member-12)
- [margin2](#member-13)
- [margin3](#member-14)
- [offset](#member-15)
- [online](#member-16)
- [offline](#member-17)
- [gc](#member-18)
- [bcmp](#member-19)
- [alphacmp](#member-20)
- [groupcmp](#member-21)
- [statuscmp](#member-22)
- [id](#member-24)
- [name](#member-25)
- [rname](#member-26)
- [online](#member-27)
- [group](#member-28)
- [seen](#member-29)
- [offset](#member-43)
- [selsz](#member-44)
- [colsz](#member-45)
- [selector](#member-46)
- [group](#member-47)
- [selected](#member-48)
- [group](#member-54)
- [groups](#member-55)
- [buddy](#member-61)
- [ava](#member-62)
- [nick](#member-63)
- [grp](#member-64)
- [atime](#member-65)
- [utime](#member-66)
- [atimel](#member-67)
- [opts](#member-68)

#### Methods

- [create(UI ui, Object[] args)](#member-23)
- [Buddy(int id, String name, int online, int group, boolean seen)](#member-30)
- [forget()](#member-31)
- [endkin()](#member-32)
- [chat()](#member-33)
- [invite()](#member-34)
- [describe()](#member-35)
- [chname(String name)](#member-36)
- [chgrp(int grp)](#member-37)
- [chstatus(int status)](#member-38)
- [rname()](#member-39)
- [opts()](#member-40)
- [iterator()](#member-41)
- [find(int id)](#member-42)
- [GroupRect(GroupSelector selector, int group, boolean selected)](#member-49)
- [draw(GOut g)](#member-50)
- [mousedown(MouseDownEvent ev)](#member-51)
- [select()](#member-52)
- [unselect()](#member-53)
- [GroupSelector(int group)](#member-56)
- [changed(int group)](#member-57)
- [update(int group)](#member-58)
- [select(int group)](#member-59)
- [create(UI ui, Object[] args)](#member-60)
- [BuddyInfo(Coord sz, Buddy buddy)](#member-69)
- [draw(GOut g)](#member-70)
- [tick(double dt)](#member-71)
- [setatime()](#member-72)
- [setopts()](#member-73)
- [uimsg(String msg, Object... args)](#member-74)
- [update()](#member-75)
- [BuddyList(Coord sz)](#member-76)
- [allitems()](#member-77)
- [searchmatch(Buddy b, String txt)](#member-78)
- [makeitem(Buddy b, int idx, Coord sz)](#member-79)
- [drawbg(GOut g)](#member-80)
- [drawbg(GOut g, Buddy item, int idx, Area area)](#member-81)
- [draw(GOut g)](#member-82)
- [change(Buddy b)](#member-83)
- [opts(final Buddy b, Coord c)](#member-84)
- [randpwd()](#member-85)
- [setpwd(String pass)](#member-86)
- [setpname(String name)](#member-87)
- [setcmp(Comparator<Buddy> cmp)](#member-88)
- [uimsg(String msg, Object... args)](#member-89)
- [hide()](#member-90)
- [destroy()](#member-91)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `buddies`

- Description: TODO

<a id="member-2"></a>
##### `idmap`

- Description: TODO

<a id="member-3"></a>
##### `bl`

- Description: TODO

<a id="member-4"></a>
##### `pname`

- Description: TODO

<a id="member-5"></a>
##### `charpass`

- Description: TODO

<a id="member-6"></a>
##### `opass`

- Description: TODO

<a id="member-7"></a>
##### `menu`

- Description: TODO

<a id="member-8"></a>
##### `info`

- Description: TODO

<a id="member-9"></a>
##### `infof`

- Description: TODO

<a id="member-10"></a>
##### `serial`

- Description: TODO

<a id="member-11"></a>
##### `width`

- Description: TODO

<a id="member-12"></a>
##### `margin1`

- Description: TODO

<a id="member-13"></a>
##### `margin2`

- Description: TODO

<a id="member-14"></a>
##### `margin3`

- Description: TODO

<a id="member-15"></a>
##### `offset`

- Description: TODO

<a id="member-16"></a>
##### `online`

- Description: TODO

<a id="member-17"></a>
##### `offline`

- Description: TODO

<a id="member-18"></a>
##### `gc`

- Description: TODO

<a id="member-19"></a>
##### `bcmp`

- Description: TODO

<a id="member-20"></a>
##### `alphacmp`

- Description: TODO

<a id="member-21"></a>
##### `groupcmp`

- Description: TODO

<a id="member-22"></a>
##### `statuscmp`

- Description: TODO

<a id="member-24"></a>
##### `id`

- Description: TODO

<a id="member-25"></a>
##### `name`

- Description: TODO

<a id="member-26"></a>
##### `rname`

- Description: TODO

<a id="member-27"></a>
##### `online`

- Description: TODO

<a id="member-28"></a>
##### `group`

- Description: TODO

<a id="member-29"></a>
##### `seen`

- Description: TODO

<a id="member-43"></a>
##### `offset`

- Description: TODO

<a id="member-44"></a>
##### `selsz`

- Description: TODO

<a id="member-45"></a>
##### `colsz`

- Description: TODO

<a id="member-46"></a>
##### `selector`

- Description: TODO

<a id="member-47"></a>
##### `group`

- Description: TODO

<a id="member-48"></a>
##### `selected`

- Description: TODO

<a id="member-54"></a>
##### `group`

- Description: TODO

<a id="member-55"></a>
##### `groups`

- Description: TODO

<a id="member-61"></a>
##### `buddy`

- Description: TODO

<a id="member-62"></a>
##### `ava`

- Description: TODO

<a id="member-63"></a>
##### `nick`

- Description: TODO

<a id="member-64"></a>
##### `grp`

- Description: TODO

<a id="member-65"></a>
##### `atime`

- Description: TODO

<a id="member-66"></a>
##### `utime`

- Description: TODO

<a id="member-67"></a>
##### `atimel`

- Description: TODO

<a id="member-68"></a>
##### `opts`

- Description: TODO

#### Methods

<a id="member-23"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-30"></a>
##### `Buddy(int id, String name, int online, int group, boolean seen)`

- Description: TODO

<a id="member-31"></a>
##### `forget()`

- Description: TODO

<a id="member-32"></a>
##### `endkin()`

- Description: TODO

<a id="member-33"></a>
##### `chat()`

- Description: TODO

<a id="member-34"></a>
##### `invite()`

- Description: TODO

<a id="member-35"></a>
##### `describe()`

- Description: TODO

<a id="member-36"></a>
##### `chname(String name)`

- Description: TODO

<a id="member-37"></a>
##### `chgrp(int grp)`

- Description: TODO

<a id="member-38"></a>
##### `chstatus(int status)`

- Description: TODO

<a id="member-39"></a>
##### `rname()`

- Description: TODO

<a id="member-40"></a>
##### `opts()`

- Description: TODO

<a id="member-41"></a>
##### `iterator()`

- Description: TODO

<a id="member-42"></a>
##### `find(int id)`

- Description: TODO

<a id="member-49"></a>
##### `GroupRect(GroupSelector selector, int group, boolean selected)`

- Description: TODO

<a id="member-50"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-51"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-52"></a>
##### `select()`

- Description: TODO

<a id="member-53"></a>
##### `unselect()`

- Description: TODO

<a id="member-56"></a>
##### `GroupSelector(int group)`

- Description: TODO

<a id="member-57"></a>
##### `changed(int group)`

- Description: TODO

<a id="member-58"></a>
##### `update(int group)`

- Description: TODO

<a id="member-59"></a>
##### `select(int group)`

- Description: TODO

<a id="member-60"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-69"></a>
##### `BuddyInfo(Coord sz, Buddy buddy)`

- Description: TODO

<a id="member-70"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-71"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-72"></a>
##### `setatime()`

- Description: TODO

<a id="member-73"></a>
##### `setopts()`

- Description: TODO

<a id="member-74"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-75"></a>
##### `update()`

- Description: TODO

<a id="member-76"></a>
##### `BuddyList(Coord sz)`

- Description: TODO

<a id="member-77"></a>
##### `allitems()`

- Description: TODO

<a id="member-78"></a>
##### `searchmatch(Buddy b, String txt)`

- Description: TODO

<a id="member-79"></a>
##### `makeitem(Buddy b, int idx, Coord sz)`

- Description: TODO

<a id="member-80"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-81"></a>
##### `drawbg(GOut g, Buddy item, int idx, Area area)`

- Description: TODO

<a id="member-82"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-83"></a>
##### `change(Buddy b)`

- Description: TODO

<a id="member-84"></a>
##### `opts(final Buddy b, Coord c)`

- Description: TODO

<a id="member-85"></a>
##### `randpwd()`

- Description: TODO

<a id="member-86"></a>
##### `setpwd(String pass)`

- Description: TODO

<a id="member-87"></a>
##### `setpname(String name)`

- Description: TODO

<a id="member-88"></a>
##### `setcmp(Comparator<Buddy> cmp)`

- Description: TODO

<a id="member-89"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-90"></a>
##### `hide()`

- Description: TODO

<a id="member-91"></a>
##### `destroy()`

- Description: TODO
