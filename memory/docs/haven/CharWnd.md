# CharWnd

## Meta

- Source: [CharWnd.java](../../../src/haven/CharWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the character window.

## Code Members

### Member Index

#### Fields

- [ifnd](#member-1)
- [catf](#member-2)
- [failf](#member-3)
- [attrf](#member-4)
- [iconfilter](#member-5)
- [attrw](#member-6)
- [debuff](#member-7)
- [buff](#member-8)
- [tbuff](#member-9)
- [every](#member-10)
- [other](#member-11)
- [width](#member-12)
- [height](#member-13)
- [battr](#member-14)
- [sattr](#member-15)
- [skill](#member-16)
- [fight](#member-17)
- [wound](#member-18)
- [quest](#member-19)
- [battrtab](#member-20)
- [sattrtab](#member-21)
- [skilltab](#member-22)
- [fighttab](#member-23)
- [woundtab](#member-24)
- [questtab](#member-25)
- [exp](#member-26)
- [enc](#member-27)
- [tcl](#member-28)
- [id](#member-29)
- [tab](#member-30)
- [val](#member-35)
- [fmt](#member-36)
- [col](#member-37)
- [oc](#member-38)
- [lc](#member-39)
- [lv](#member-40)
- [img](#member-52)
- [loading](#member-53)
- [sb](#member-54)
- [nm](#member-66)
- [attr](#member-67)
- [ctxr](#member-69)
- [rinfo](#member-71)
- [binfo](#member-72)
- [tipinfo](#member-74)
- [tipimg](#member-75)

#### Methods

- [TabProxy(Class<? extends Widget> tcl, String id)](#member-31)
- [added()](#member-32)
- [uimsg(String nm, Object... args)](#member-33)
- [getchild(Class<T> cl)](#member-34)
- [RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col, V ival)](#member-41)
- [RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col)](#member-42)
- [RLabel(Supplier<V> val, Function<V, String> fmt, Color col)](#member-43)
- [update()](#member-44)
- [attached()](#member-45)
- [settext(String text)](#member-46)
- [tick(double dt)](#member-47)
- [resimg(Resource res)](#member-48)
- [resdoc(Resource res, String text)](#member-49)
- [LoadingTextBox(Coord sz, String text, RichText.Foundry fnd)](#member-50)
- [LoadingTextBox(Coord sz, String text, Object... attrs)](#member-51)
- [ImageInfoBox(Coord sz)](#member-55)
- [drawbg(GOut g)](#member-56)
- [marg()](#member-57)
- [tick(double dt)](#member-58)
- [draw(GOut g)](#member-59)
- [set(Tex img)](#member-60)
- [set(Indir<Tex> loading)](#member-61)
- [mousewheel(MouseWheelEvent ev)](#member-62)
- [resize(Coord sz)](#member-63)
- [public void draw(BufferedImage img, Graphics g);](#member-64)
- [render(BufferedImage base, List<ItemInfo> info)](#member-65)
- [AttrWdg(Coord sz, Glob glob, String attr)](#member-68)
- [context(Class<T> cl)](#member-70)
- [info()](#member-73)
- [tooltip(Coord c, Widget prev)](#member-76)
- [create(UI ui, Object[] args)](#member-77)
- [settip(T wdg, String resnm)](#member-78)
- [addchild(Widget child, Object... args)](#member-79)
- [uimsg(String nm, Object... args)](#member-80)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `ifnd`

- Description: TODO

<a id="member-2"></a>
##### `catf`

- Description: TODO

<a id="member-3"></a>
##### `failf`

- Description: TODO

<a id="member-4"></a>
##### `attrf`

- Description: TODO

<a id="member-5"></a>
##### `iconfilter`

- Description: TODO

<a id="member-6"></a>
##### `attrw`

- Description: TODO

<a id="member-7"></a>
##### `debuff`

- Description: TODO

<a id="member-8"></a>
##### `buff`

- Description: TODO

<a id="member-9"></a>
##### `tbuff`

- Description: TODO

<a id="member-10"></a>
##### `every`

- Description: TODO

<a id="member-11"></a>
##### `other`

- Description: TODO

<a id="member-12"></a>
##### `width`

- Description: TODO

<a id="member-13"></a>
##### `height`

- Description: TODO

<a id="member-14"></a>
##### `battr`

- Description: TODO

<a id="member-15"></a>
##### `sattr`

- Description: TODO

<a id="member-16"></a>
##### `skill`

- Description: TODO

<a id="member-17"></a>
##### `fight`

- Description: TODO

<a id="member-18"></a>
##### `wound`

- Description: TODO

<a id="member-19"></a>
##### `quest`

- Description: TODO

<a id="member-20"></a>
##### `battrtab`

- Description: TODO

<a id="member-21"></a>
##### `sattrtab`

- Description: TODO

<a id="member-22"></a>
##### `skilltab`

- Description: TODO

<a id="member-23"></a>
##### `fighttab`

- Description: TODO

<a id="member-24"></a>
##### `woundtab`

- Description: TODO

<a id="member-25"></a>
##### `questtab`

- Description: TODO

<a id="member-26"></a>
##### `exp`

- Description: TODO

<a id="member-27"></a>
##### `enc`

- Description: TODO

<a id="member-28"></a>
##### `tcl`

- Description: TODO

<a id="member-29"></a>
##### `id`

- Description: TODO

<a id="member-30"></a>
##### `tab`

- Description: TODO

<a id="member-35"></a>
##### `val`

- Description: TODO

<a id="member-36"></a>
##### `fmt`

- Description: TODO

<a id="member-37"></a>
##### `col`

- Description: TODO

<a id="member-38"></a>
##### `oc`

- Description: TODO

<a id="member-39"></a>
##### `lc`

- Description: TODO

<a id="member-40"></a>
##### `lv`

- Description: TODO

<a id="member-52"></a>
##### `img`

- Description: TODO

<a id="member-53"></a>
##### `loading`

- Description: TODO

<a id="member-54"></a>
##### `sb`

- Description: TODO

<a id="member-66"></a>
##### `nm`

- Description: TODO

<a id="member-67"></a>
##### `attr`

- Description: TODO

<a id="member-69"></a>
##### `ctxr`

- Description: TODO

<a id="member-71"></a>
##### `rinfo`

- Description: TODO

<a id="member-72"></a>
##### `binfo`

- Description: TODO

<a id="member-74"></a>
##### `tipinfo`

- Description: TODO

<a id="member-75"></a>
##### `tipimg`

- Description: TODO

#### Methods

<a id="member-31"></a>
##### `TabProxy(Class<? extends Widget> tcl, String id)`

- Description: TODO

<a id="member-32"></a>
##### `added()`

- Description: TODO

<a id="member-33"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO

<a id="member-34"></a>
##### `getchild(Class<T> cl)`

- Description: TODO

<a id="member-41"></a>
##### `RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col, V ival)`

- Description: TODO

<a id="member-42"></a>
##### `RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col)`

- Description: TODO

<a id="member-43"></a>
##### `RLabel(Supplier<V> val, Function<V, String> fmt, Color col)`

- Description: TODO

<a id="member-44"></a>
##### `update()`

- Description: TODO

<a id="member-45"></a>
##### `attached()`

- Description: TODO

<a id="member-46"></a>
##### `settext(String text)`

- Description: TODO

<a id="member-47"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-48"></a>
##### `resimg(Resource res)`

- Description: TODO

<a id="member-49"></a>
##### `resdoc(Resource res, String text)`

- Description: TODO

<a id="member-50"></a>
##### `LoadingTextBox(Coord sz, String text, RichText.Foundry fnd)`

- Description: TODO

<a id="member-51"></a>
##### `LoadingTextBox(Coord sz, String text, Object... attrs)`

- Description: TODO

<a id="member-55"></a>
##### `ImageInfoBox(Coord sz)`

- Description: TODO

<a id="member-56"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-57"></a>
##### `marg()`

- Description: TODO

<a id="member-58"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-59"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-60"></a>
##### `set(Tex img)`

- Description: TODO

<a id="member-61"></a>
##### `set(Indir<Tex> loading)`

- Description: TODO

<a id="member-62"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-63"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-64"></a>
##### `public void draw(BufferedImage img, Graphics g);`

- Description: TODO

<a id="member-65"></a>
##### `render(BufferedImage base, List<ItemInfo> info)`

- Description: TODO

<a id="member-68"></a>
##### `AttrWdg(Coord sz, Glob glob, String attr)`

- Description: TODO

<a id="member-70"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-73"></a>
##### `info()`

- Description: TODO

<a id="member-76"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-77"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-78"></a>
##### `settip(T wdg, String resnm)`

- Description: TODO

<a id="member-79"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-80"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
