# QuestWnd

## Meta

- Source: [QuestWnd.java](../../../src/haven/QuestWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the quest window.

## Code Members

### Member Index

#### Constants

- [QST_PEND](#member-6)
- [QST_DONE](#member-7)
- [QST_FAIL](#member-8)
- [QST_DISABLED](#member-9)

#### Fields

- [questbox](#member-1)
- [cqst](#member-2)
- [dqst](#member-3)
- [quest](#member-4)
- [stcol](#member-10)
- [stsym](#member-11)
- [id](#member-12)
- [res](#member-13)
- [title](#member-14)
- [done](#member-15)
- [mtime](#member-16)
- [desc](#member-19)
- [done](#member-20)
- [status](#member-21)
- [wdata](#member-22)
- [qcmp](#member-24)
- [qfail](#member-25)
- [cond](#member-27)
- [text](#member-30)
- [id](#member-34)
- [res](#member-35)
- [title](#member-36)
- [cond](#member-37)
- [cqv](#member-38)
- [qw](#member-43)
- [qtfnd](#member-52)
- [qcfnd](#member-53)
- [info](#member-54)
- [ccond](#member-55)
- [rcond](#member-56)
- [rtitle](#member-57)
- [glow](#member-58)
- [glowon](#member-59)
- [glowt](#member-60)
- [current](#member-72)
- [refresh](#member-73)
- [options](#member-74)
- [condw](#member-75)
- [quests](#member-87)
- [loading](#member-88)
- [comp](#member-89)
- [q](#member-94)
- [nm](#member-95)
- [dres](#member-96)
- [dtit](#member-97)

#### Methods

- [create(UI ui, Object[] args)](#member-5)
- [Quest(int id, Indir<Resource> res, String title, int done, int mtime)](#member-17)
- [title()](#member-18)
- [Condition(String desc, int done, String status)](#member-23)
- [done(GameUI parent)](#member-26)
- [CondWidget(Condition cond)](#member-28)
- [update()](#member-29)
- [DefaultCond(Condition cond)](#member-31)
- [added()](#member-32)
- [draw(GOut g)](#member-33)
- [Box(int id, Indir<Resource> res, String title)](#member-39)
- [added()](#member-40)
- [title()](#member-41)
- [conds()](#member-42)
- [done()](#member-44)
- [refresh()](#member-45)
- [rendertext()](#member-46)
- [findcond(String desc)](#member-47)
- [uimsg(String msg, Object... args)](#member-48)
- [destroy()](#member-49)
- [questid()](#member-50)
- [qview()](#member-51)
- [public String title();](#member-61)
- [public Condition[] conds();](#member-62)
- [public int done();](#member-63)
- [QView(QVInfo info)](#member-64)
- [resize()](#member-65)
- [draw(GOut g)](#member-66)
- [mousedown(MouseDownEvent ev)](#member-67)
- [tick(double dt)](#member-68)
- [ct(Condition c)](#member-69)
- [update()](#member-70)
- [update(Condition c)](#member-71)
- [DefaultBox(int id, Indir<Resource> res, String title)](#member-76)
- [layouth(Widget cont)](#member-77)
- [layoutc(Widget cont)](#member-78)
- [layouto(Widget cont)](#member-79)
- [layout(Widget cont)](#member-80)
- [draw(GOut g)](#member-81)
- [refresh()](#member-82)
- [uimsg(String msg, Object... args)](#member-83)
- [create(UI ui, Object[] args)](#member-84)
- [public int questid();](#member-85)
- [public Widget qview();](#member-86)
- [QuestList(Coord sz)](#member-90)
- [items()](#member-91)
- [makeitem(Quest q, int idx, Coord sz)](#member-92)
- [tick(double dt)](#member-93)
- [Item(Coord sz, Quest q)](#member-98)
- [draw(GOut g)](#member-99)
- [mousedown(MouseDownEvent ev)](#member-100)
- [drawslot(GOut g, Quest q, int idx, Area area)](#member-101)
- [unselect(int button)](#member-102)
- [get(int id)](#member-103)
- [add(Quest q)](#member-104)
- [remove(int id)](#member-105)
- [remove(Quest q)](#member-106)
- [addchild(Widget child, Object... args)](#member-107)
- [uimsg(String nm, Object... args)](#member-108)

### Member Reference

#### Constants

<a id="member-6"></a>
##### `QST_PEND`

- Description: TODO

<a id="member-7"></a>
##### `QST_DONE`

- Description: TODO

<a id="member-8"></a>
##### `QST_FAIL`

- Description: TODO

<a id="member-9"></a>
##### `QST_DISABLED`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `questbox`

- Description: TODO

<a id="member-2"></a>
##### `cqst`

- Description: TODO

<a id="member-3"></a>
##### `dqst`

- Description: TODO

<a id="member-4"></a>
##### `quest`

- Description: TODO

<a id="member-10"></a>
##### `stcol`

- Description: TODO

<a id="member-11"></a>
##### `stsym`

- Description: TODO

<a id="member-12"></a>
##### `id`

- Description: TODO

<a id="member-13"></a>
##### `res`

- Description: TODO

<a id="member-14"></a>
##### `title`

- Description: TODO

<a id="member-15"></a>
##### `done`

- Description: TODO

<a id="member-16"></a>
##### `mtime`

- Description: TODO

<a id="member-19"></a>
##### `desc`

- Description: TODO

<a id="member-20"></a>
##### `done`

- Description: TODO

<a id="member-21"></a>
##### `status`

- Description: TODO

<a id="member-22"></a>
##### `wdata`

- Description: TODO

<a id="member-24"></a>
##### `qcmp`

- Description: TODO

<a id="member-25"></a>
##### `qfail`

- Description: TODO

<a id="member-27"></a>
##### `cond`

- Description: TODO

<a id="member-30"></a>
##### `text`

- Description: TODO

<a id="member-34"></a>
##### `id`

- Description: TODO

<a id="member-35"></a>
##### `res`

- Description: TODO

<a id="member-36"></a>
##### `title`

- Description: TODO

<a id="member-37"></a>
##### `cond`

- Description: TODO

<a id="member-38"></a>
##### `cqv`

- Description: TODO

<a id="member-43"></a>
##### `qw`

- Description: TODO

<a id="member-52"></a>
##### `qtfnd`

- Description: TODO

<a id="member-53"></a>
##### `qcfnd`

- Description: TODO

<a id="member-54"></a>
##### `info`

- Description: TODO

<a id="member-55"></a>
##### `ccond`

- Description: TODO

<a id="member-56"></a>
##### `rcond`

- Description: TODO

<a id="member-57"></a>
##### `rtitle`

- Description: TODO

<a id="member-58"></a>
##### `glow`

- Description: TODO

<a id="member-59"></a>
##### `glowon`

- Description: TODO

<a id="member-60"></a>
##### `glowt`

- Description: TODO

<a id="member-72"></a>
##### `current`

- Description: TODO

<a id="member-73"></a>
##### `refresh`

- Description: TODO

<a id="member-74"></a>
##### `options`

- Description: TODO

<a id="member-75"></a>
##### `condw`

- Description: TODO

<a id="member-87"></a>
##### `quests`

- Description: TODO

<a id="member-88"></a>
##### `loading`

- Description: TODO

<a id="member-89"></a>
##### `comp`

- Description: TODO

<a id="member-94"></a>
##### `q`

- Description: TODO

<a id="member-95"></a>
##### `nm`

- Description: TODO

<a id="member-96"></a>
##### `dres`

- Description: TODO

<a id="member-97"></a>
##### `dtit`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-17"></a>
##### `Quest(int id, Indir<Resource> res, String title, int done, int mtime)`

- Description: TODO

<a id="member-18"></a>
##### `title()`

- Description: TODO

<a id="member-23"></a>
##### `Condition(String desc, int done, String status)`

- Description: TODO

<a id="member-26"></a>
##### `done(GameUI parent)`

- Description: TODO

<a id="member-28"></a>
##### `CondWidget(Condition cond)`

- Description: TODO

<a id="member-29"></a>
##### `update()`

- Description: TODO

<a id="member-31"></a>
##### `DefaultCond(Condition cond)`

- Description: TODO

<a id="member-32"></a>
##### `added()`

- Description: TODO

<a id="member-33"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-39"></a>
##### `Box(int id, Indir<Resource> res, String title)`

- Description: TODO

<a id="member-40"></a>
##### `added()`

- Description: TODO

<a id="member-41"></a>
##### `title()`

- Description: TODO

<a id="member-42"></a>
##### `conds()`

- Description: TODO

<a id="member-44"></a>
##### `done()`

- Description: TODO

<a id="member-45"></a>
##### `refresh()`

- Description: TODO

<a id="member-46"></a>
##### `rendertext()`

- Description: TODO

<a id="member-47"></a>
##### `findcond(String desc)`

- Description: TODO

<a id="member-48"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-49"></a>
##### `destroy()`

- Description: TODO

<a id="member-50"></a>
##### `questid()`

- Description: TODO

<a id="member-51"></a>
##### `qview()`

- Description: TODO

<a id="member-61"></a>
##### `public String title();`

- Description: TODO

<a id="member-62"></a>
##### `public Condition[] conds();`

- Description: TODO

<a id="member-63"></a>
##### `public int done();`

- Description: TODO

<a id="member-64"></a>
##### `QView(QVInfo info)`

- Description: TODO

<a id="member-65"></a>
##### `resize()`

- Description: TODO

<a id="member-66"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-67"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-68"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-69"></a>
##### `ct(Condition c)`

- Description: TODO

<a id="member-70"></a>
##### `update()`

- Description: TODO

<a id="member-71"></a>
##### `update(Condition c)`

- Description: TODO

<a id="member-76"></a>
##### `DefaultBox(int id, Indir<Resource> res, String title)`

- Description: TODO

<a id="member-77"></a>
##### `layouth(Widget cont)`

- Description: TODO

<a id="member-78"></a>
##### `layoutc(Widget cont)`

- Description: TODO

<a id="member-79"></a>
##### `layouto(Widget cont)`

- Description: TODO

<a id="member-80"></a>
##### `layout(Widget cont)`

- Description: TODO

<a id="member-81"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-82"></a>
##### `refresh()`

- Description: TODO

<a id="member-83"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-84"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-85"></a>
##### `public int questid();`

- Description: TODO

<a id="member-86"></a>
##### `public Widget qview();`

- Description: TODO

<a id="member-90"></a>
##### `QuestList(Coord sz)`

- Description: TODO

<a id="member-91"></a>
##### `items()`

- Description: TODO

<a id="member-92"></a>
##### `makeitem(Quest q, int idx, Coord sz)`

- Description: TODO

<a id="member-93"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-98"></a>
##### `Item(Coord sz, Quest q)`

- Description: TODO

<a id="member-99"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-100"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-101"></a>
##### `drawslot(GOut g, Quest q, int idx, Area area)`

- Description: TODO

<a id="member-102"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-103"></a>
##### `get(int id)`

- Description: TODO

<a id="member-104"></a>
##### `add(Quest q)`

- Description: TODO

<a id="member-105"></a>
##### `remove(int id)`

- Description: TODO

<a id="member-106"></a>
##### `remove(Quest q)`

- Description: TODO

<a id="member-107"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-108"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
