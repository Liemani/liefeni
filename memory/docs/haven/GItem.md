# GItem

## Meta

- Source: [GItem.java](../../../src/haven/GItem.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a game item widget or object.

## Code Members

### Member Index

#### Fields

- [res](#member-1)
- [sdt](#member-2)
- [meter](#member-3)
- [num](#member-4)
- [contents](#member-5)
- [contentsnm](#member-6)
- [contentsid](#member-7)
- [contentswnd](#member-8)
- [infoseq](#member-9)
- [hovering](#member-10)
- [hoverset](#member-11)
- [spr](#member-12)
- [rawinfo](#member-13)
- [info](#member-14)
- [combine](#member-17)
- [inf](#member-22)
- [data](#member-23)
- [num](#member-33)
- [rnd](#member-36)
- [ctxr](#member-39)
- [lastcontseq](#member-49)
- [lastcontinfo](#member-50)
- [hovermarg](#member-56)
- [bg](#member-57)
- [box](#member-58)
- [ca](#member-59)
- [dm](#member-60)
- [doff](#member-61)
- [overlap](#member-69)
- [cont](#member-70)
- [inv](#member-71)
- [id](#member-72)
- [psz](#member-73)
- [st](#member-74)
- [hovering](#member-75)
- [lc](#member-80)

#### Methods

- [create(UI ui, Object[] args)](#member-15)
- [public Pipe.Op rstate();](#member-16)
- [public Color olcol();](#member-18)
- [rstate()](#member-19)
- [public T overlay();](#member-20)
- [public void drawoverlay(GOut g, T data);](#member-21)
- [InfoOverlay(OverlayInfo<T> inf)](#member-24)
- [draw(GOut g)](#member-25)
- [create(OverlayInfo<S> inf)](#member-26)
- [public int itemnum();](#member-27)
- [numcolor()](#member-28)
- [overlay()](#member-29)
- [drawoverlay(GOut g, Tex tex)](#member-30)
- [numrender(int num, Color col)](#member-31)
- [public double meter();](#member-32)
- [Amount(Owner owner, int num)](#member-34)
- [itemnum()](#member-35)
- [mkrandoom()](#member-37)
- [getres()](#member-38)
- [context(Class<T> cl)](#member-40)
- [spr()](#member-41)
- [tick(double dt)](#member-42)
- [info()](#member-43)
- [resource()](#member-44)
- [sprite()](#member-45)
- [uimsg(String name, Object... args)](#member-46)
- [addchild(Widget child, Object... args)](#member-47)
- [public void propagate(List<ItemInfo> buf, ItemInfo.Owner outer);](#member-48)
- [updcontinfo()](#member-51)
- [addcontinfo(List<ItemInfo> buf)](#member-52)
- [contparent()](#member-53)
- [destroy()](#member-54)
- [hovering(Widget hovering)](#member-55)
- [iresize(Coord isz)](#member-62)
- [contarea()](#member-63)
- [draw(GOut g)](#member-64)
- [checkhit(Coord c)](#member-65)
- [mousedown(MouseDownEvent ev)](#member-66)
- [mouseup(MouseUpEvent ev)](#member-67)
- [mousemove(MouseMoveEvent ev)](#member-68)
- [ContentsWindow(GItem cont, Widget inv)](#member-76)
- [chstate(String nst)](#member-77)
- [ckhover()](#member-78)
- [ckunhover()](#member-79)
- [tick(double dt)](#member-81)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-82)
- [cdestroy(Widget w)](#member-83)
- [mousehover(MouseHoverEvent ev, boolean on)](#member-84)
- [wndshow(boolean show)](#member-85)
- [describe()](#member-86)
- [resourceName()](#member-87)
- [isResourceNameEndsWith(String suffix)](#member-88)
- [isString()](#member-89)
- [transfer()](#member-90)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `res`

- Description: TODO

<a id="member-2"></a>
##### `sdt`

- Description: TODO

<a id="member-3"></a>
##### `meter`

- Description: TODO

<a id="member-4"></a>
##### `num`

- Description: TODO

<a id="member-5"></a>
##### `contents`

- Description: TODO

<a id="member-6"></a>
##### `contentsnm`

- Description: TODO

<a id="member-7"></a>
##### `contentsid`

- Description: TODO

<a id="member-8"></a>
##### `contentswnd`

- Description: TODO

<a id="member-9"></a>
##### `infoseq`

- Description: TODO

<a id="member-10"></a>
##### `hovering`

- Description: TODO

<a id="member-11"></a>
##### `hoverset`

- Description: TODO

<a id="member-12"></a>
##### `spr`

- Description: TODO

<a id="member-13"></a>
##### `rawinfo`

- Description: TODO

<a id="member-14"></a>
##### `info`

- Description: TODO

<a id="member-17"></a>
##### `combine`

- Description: TODO

<a id="member-22"></a>
##### `inf`

- Description: TODO

<a id="member-23"></a>
##### `data`

- Description: TODO

<a id="member-33"></a>
##### `num`

- Description: TODO

<a id="member-36"></a>
##### `rnd`

- Description: TODO

<a id="member-39"></a>
##### `ctxr`

- Description: TODO

<a id="member-49"></a>
##### `lastcontseq`

- Description: TODO

<a id="member-50"></a>
##### `lastcontinfo`

- Description: TODO

<a id="member-56"></a>
##### `hovermarg`

- Description: TODO

<a id="member-57"></a>
##### `bg`

- Description: TODO

<a id="member-58"></a>
##### `box`

- Description: TODO

<a id="member-59"></a>
##### `ca`

- Description: TODO

<a id="member-60"></a>
##### `dm`

- Description: TODO

<a id="member-61"></a>
##### `doff`

- Description: TODO

<a id="member-69"></a>
##### `overlap`

- Description: TODO

<a id="member-70"></a>
##### `cont`

- Description: TODO

<a id="member-71"></a>
##### `inv`

- Description: TODO

<a id="member-72"></a>
##### `id`

- Description: TODO

<a id="member-73"></a>
##### `psz`

- Description: TODO

<a id="member-74"></a>
##### `st`

- Description: TODO

<a id="member-75"></a>
##### `hovering`

- Description: TODO

<a id="member-80"></a>
##### `lc`

- Description: TODO

#### Methods

<a id="member-15"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-16"></a>
##### `public Pipe.Op rstate();`

- Description: TODO

<a id="member-18"></a>
##### `public Color olcol();`

- Description: TODO

<a id="member-19"></a>
##### `rstate()`

- Description: TODO

<a id="member-20"></a>
##### `public T overlay();`

- Description: TODO

<a id="member-21"></a>
##### `public void drawoverlay(GOut g, T data);`

- Description: TODO

<a id="member-24"></a>
##### `InfoOverlay(OverlayInfo<T> inf)`

- Description: TODO

<a id="member-25"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-26"></a>
##### `create(OverlayInfo<S> inf)`

- Description: TODO

<a id="member-27"></a>
##### `public int itemnum();`

- Description: TODO

<a id="member-28"></a>
##### `numcolor()`

- Description: TODO

<a id="member-29"></a>
##### `overlay()`

- Description: TODO

<a id="member-30"></a>
##### `drawoverlay(GOut g, Tex tex)`

- Description: TODO

<a id="member-31"></a>
##### `numrender(int num, Color col)`

- Description: TODO

<a id="member-32"></a>
##### `public double meter();`

- Description: TODO

<a id="member-34"></a>
##### `Amount(Owner owner, int num)`

- Description: TODO

<a id="member-35"></a>
##### `itemnum()`

- Description: TODO

<a id="member-37"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-38"></a>
##### `getres()`

- Description: TODO

<a id="member-40"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-41"></a>
##### `spr()`

- Description: TODO

<a id="member-42"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-43"></a>
##### `info()`

- Description: TODO

<a id="member-44"></a>
##### `resource()`

- Description: TODO

<a id="member-45"></a>
##### `sprite()`

- Description: TODO

<a id="member-46"></a>
##### `uimsg(String name, Object... args)`

- Description: TODO

<a id="member-47"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-48"></a>
##### `public void propagate(List<ItemInfo> buf, ItemInfo.Owner outer);`

- Description: TODO

<a id="member-51"></a>
##### `updcontinfo()`

- Description: TODO

<a id="member-52"></a>
##### `addcontinfo(List<ItemInfo> buf)`

- Description: TODO

<a id="member-53"></a>
##### `contparent()`

- Description: TODO

<a id="member-54"></a>
##### `destroy()`

- Description: TODO

<a id="member-55"></a>
##### `hovering(Widget hovering)`

- Description: TODO

<a id="member-62"></a>
##### `iresize(Coord isz)`

- Description: TODO

<a id="member-63"></a>
##### `contarea()`

- Description: TODO

<a id="member-64"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-65"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-66"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-67"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-68"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-76"></a>
##### `ContentsWindow(GItem cont, Widget inv)`

- Description: TODO

<a id="member-77"></a>
##### `chstate(String nst)`

- Description: TODO

<a id="member-78"></a>
##### `ckhover()`

- Description: TODO

<a id="member-79"></a>
##### `ckunhover()`

- Description: TODO

<a id="member-81"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-82"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-83"></a>
##### `cdestroy(Widget w)`

- Description: TODO

<a id="member-84"></a>
##### `mousehover(MouseHoverEvent ev, boolean on)`

- Description: TODO

<a id="member-85"></a>
##### `wndshow(boolean show)`

- Description: TODO

<a id="member-86"></a>
##### `describe()`

- Description: TODO

<a id="member-87"></a>
##### `resourceName()`

- Description: TODO

<a id="member-88"></a>
##### `isResourceNameEndsWith(String suffix)`

- Description: TODO

<a id="member-89"></a>
##### `isString()`

- Description: TODO

<a id="member-90"></a>
##### `transfer()`

- Description: TODO
