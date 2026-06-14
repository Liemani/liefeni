# BAttrWnd

## Meta

- Source: [BAttrWnd.java](../../../src/haven/BAttrWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays body attribute information.

## Code Members

### Member Index

#### Fields

- [attrs](#member-1)
- [feps](#member-2)
- [cons](#member-3)
- [glut](#member-4)
- [rnm](#member-6)
- [img](#member-7)
- [bg](#member-8)
- [lvlt](#member-9)
- [ct](#member-10)
- [cbv](#member-11)
- [ccv](#member-12)
- [tflt](#member-17)
- [hilit](#member-18)
- [buffed](#member-19)
- [full](#member-20)
- [none](#member-21)
- [els](#member-22)
- [ecmp](#member-23)
- [t](#member-24)
- [a](#member-25)
- [hl](#member-26)
- [back](#member-30)
- [cmp](#member-31)
- [order](#member-32)
- [oels](#member-37)
- [spec](#member-40)
- [el](#member-45)
- [nm](#member-46)
- [a](#member-47)
- [da](#member-48)
- [lasttip](#member-52)
- [frame](#member-57)
- [marg](#member-58)
- [trmg](#member-59)
- [cap](#member-60)
- [els](#member-61)
- [enew](#member-62)
- [etr](#member-63)
- [trev](#member-64)
- [trol](#member-65)
- [trtm](#member-66)
- [col](#member-67)
- [nm](#member-68)
- [sort](#member-69)
- [res](#member-72)
- [a](#member-73)
- [ev](#member-75)
- [dcmp](#member-77)
- [rtip](#member-85)
- [frame](#member-87)
- [marg](#member-88)
- [fg](#member-89)
- [bg](#member-90)
- [glut](#member-91)
- [lglut](#member-92)
- [gmod](#member-93)
- [lbl](#member-94)
- [rtip](#member-98)

#### Methods

- [create(UI ui, Object[] args)](#member-5)
- [Attr(Glob glob, String attr, Color bg)](#member-13)
- [tick(double dt)](#member-14)
- [draw(GOut g)](#member-15)
- [lvlup()](#member-16)
- [El(ResData t, double a)](#member-27)
- [update(double a)](#member-28)
- [Constipations(Coord sz)](#member-29)
- [Reordered(List<T> back, Comparator<? super T> cmp)](#member-33)
- [size()](#member-34)
- [get(int i)](#member-35)
- [update()](#member-36)
- [items()](#member-38)
- [makeitem(El el, int idx, Coord sz)](#member-39)
- [ItemIcon(Coord sz, ItemSpec spec)](#member-41)
- [img()](#member-42)
- [text()](#member-43)
- [filter()](#member-44)
- [Item(Coord sz, El el)](#member-49)
- [update()](#member-50)
- [draw(GOut g)](#member-51)
- [draw(GOut g)](#member-53)
- [drawslot(GOut g, El el, int idx, Area area)](#member-54)
- [unselect(int button)](#member-55)
- [update(ResData t, double a)](#member-56)
- [Event(Resource res, Message buf)](#member-70)
- [init()](#member-71)
- [El(Indir<Resource> res, double a)](#member-74)
- [ev()](#member-76)
- [FoodMeter()](#member-78)
- [mktrol(List<El> els, Indir<Resource> trev)](#member-79)
- [drawels(GOut g, List<El> els, int alpha)](#member-80)
- [tick(double dt)](#member-81)
- [draw(GOut g)](#member-82)
- [update(Object... args)](#member-83)
- [trig(Indir<Resource> ev)](#member-84)
- [tooltip(Coord c, Widget prev)](#member-86)
- [GlutMeter()](#member-95)
- [draw(GOut g)](#member-96)
- [update(Object... args)](#member-97)
- [tooltip(Coord c, Widget prev)](#member-99)
- [uimsg(String nm, Object... args)](#member-100)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `attrs`

- Description: TODO

<a id="member-2"></a>
##### `feps`

- Description: TODO

<a id="member-3"></a>
##### `cons`

- Description: TODO

<a id="member-4"></a>
##### `glut`

- Description: TODO

<a id="member-6"></a>
##### `rnm`

- Description: TODO

<a id="member-7"></a>
##### `img`

- Description: TODO

<a id="member-8"></a>
##### `bg`

- Description: TODO

<a id="member-9"></a>
##### `lvlt`

- Description: TODO

<a id="member-10"></a>
##### `ct`

- Description: TODO

<a id="member-11"></a>
##### `cbv`

- Description: TODO

<a id="member-12"></a>
##### `ccv`

- Description: TODO

<a id="member-17"></a>
##### `tflt`

- Description: TODO

<a id="member-18"></a>
##### `hilit`

- Description: TODO

<a id="member-19"></a>
##### `buffed`

- Description: TODO

<a id="member-20"></a>
##### `full`

- Description: TODO

<a id="member-21"></a>
##### `none`

- Description: TODO

<a id="member-22"></a>
##### `els`

- Description: TODO

<a id="member-23"></a>
##### `ecmp`

- Description: TODO

<a id="member-24"></a>
##### `t`

- Description: TODO

<a id="member-25"></a>
##### `a`

- Description: TODO

<a id="member-26"></a>
##### `hl`

- Description: TODO

<a id="member-30"></a>
##### `back`

- Description: TODO

<a id="member-31"></a>
##### `cmp`

- Description: TODO

<a id="member-32"></a>
##### `order`

- Description: TODO

<a id="member-37"></a>
##### `oels`

- Description: TODO

<a id="member-40"></a>
##### `spec`

- Description: TODO

<a id="member-45"></a>
##### `el`

- Description: TODO

<a id="member-46"></a>
##### `nm`

- Description: TODO

<a id="member-47"></a>
##### `a`

- Description: TODO

<a id="member-48"></a>
##### `da`

- Description: TODO

<a id="member-52"></a>
##### `lasttip`

- Description: TODO

<a id="member-57"></a>
##### `frame`

- Description: TODO

<a id="member-58"></a>
##### `marg`

- Description: TODO

<a id="member-59"></a>
##### `trmg`

- Description: TODO

<a id="member-60"></a>
##### `cap`

- Description: TODO

<a id="member-61"></a>
##### `els`

- Description: TODO

<a id="member-62"></a>
##### `enew`

- Description: TODO

<a id="member-63"></a>
##### `etr`

- Description: TODO

<a id="member-64"></a>
##### `trev`

- Description: TODO

<a id="member-65"></a>
##### `trol`

- Description: TODO

<a id="member-66"></a>
##### `trtm`

- Description: TODO

<a id="member-67"></a>
##### `col`

- Description: TODO

<a id="member-68"></a>
##### `nm`

- Description: TODO

<a id="member-69"></a>
##### `sort`

- Description: TODO

<a id="member-72"></a>
##### `res`

- Description: TODO

<a id="member-73"></a>
##### `a`

- Description: TODO

<a id="member-75"></a>
##### `ev`

- Description: TODO

<a id="member-77"></a>
##### `dcmp`

- Description: TODO

<a id="member-85"></a>
##### `rtip`

- Description: TODO

<a id="member-87"></a>
##### `frame`

- Description: TODO

<a id="member-88"></a>
##### `marg`

- Description: TODO

<a id="member-89"></a>
##### `fg`

- Description: TODO

<a id="member-90"></a>
##### `bg`

- Description: TODO

<a id="member-91"></a>
##### `glut`

- Description: TODO

<a id="member-92"></a>
##### `lglut`

- Description: TODO

<a id="member-93"></a>
##### `gmod`

- Description: TODO

<a id="member-94"></a>
##### `lbl`

- Description: TODO

<a id="member-98"></a>
##### `rtip`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-13"></a>
##### `Attr(Glob glob, String attr, Color bg)`

- Description: TODO

<a id="member-14"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-15"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-16"></a>
##### `lvlup()`

- Description: TODO

<a id="member-27"></a>
##### `El(ResData t, double a)`

- Description: TODO

<a id="member-28"></a>
##### `update(double a)`

- Description: TODO

<a id="member-29"></a>
##### `Constipations(Coord sz)`

- Description: TODO

<a id="member-33"></a>
##### `Reordered(List<T> back, Comparator<? super T> cmp)`

- Description: TODO

<a id="member-34"></a>
##### `size()`

- Description: TODO

<a id="member-35"></a>
##### `get(int i)`

- Description: TODO

<a id="member-36"></a>
##### `update()`

- Description: TODO

<a id="member-38"></a>
##### `items()`

- Description: TODO

<a id="member-39"></a>
##### `makeitem(El el, int idx, Coord sz)`

- Description: TODO

<a id="member-41"></a>
##### `ItemIcon(Coord sz, ItemSpec spec)`

- Description: TODO

<a id="member-42"></a>
##### `img()`

- Description: TODO

<a id="member-43"></a>
##### `text()`

- Description: TODO

<a id="member-44"></a>
##### `filter()`

- Description: TODO

<a id="member-49"></a>
##### `Item(Coord sz, El el)`

- Description: TODO

<a id="member-50"></a>
##### `update()`

- Description: TODO

<a id="member-51"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-53"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-54"></a>
##### `drawslot(GOut g, El el, int idx, Area area)`

- Description: TODO

<a id="member-55"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-56"></a>
##### `update(ResData t, double a)`

- Description: TODO

<a id="member-70"></a>
##### `Event(Resource res, Message buf)`

- Description: TODO

<a id="member-71"></a>
##### `init()`

- Description: TODO

<a id="member-74"></a>
##### `El(Indir<Resource> res, double a)`

- Description: TODO

<a id="member-76"></a>
##### `ev()`

- Description: TODO

<a id="member-78"></a>
##### `FoodMeter()`

- Description: TODO

<a id="member-79"></a>
##### `mktrol(List<El> els, Indir<Resource> trev)`

- Description: TODO

<a id="member-80"></a>
##### `drawels(GOut g, List<El> els, int alpha)`

- Description: TODO

<a id="member-81"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-82"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-83"></a>
##### `update(Object... args)`

- Description: TODO

<a id="member-84"></a>
##### `trig(Indir<Resource> ev)`

- Description: TODO

<a id="member-86"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-95"></a>
##### `GlutMeter()`

- Description: TODO

<a id="member-96"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-97"></a>
##### `update(Object... args)`

- Description: TODO

<a id="member-99"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-100"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
