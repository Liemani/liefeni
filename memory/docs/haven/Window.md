# Window

## Meta

- Source: [Window.java](../../../src/haven/Window.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a generic window widget.

## Code Members

### Member Index

#### Fields

- [bgblend](#member-1)
- [cblend](#member-2)
- [bg](#member-3)
- [bgl](#member-4)
- [bgr](#member-5)
- [cl](#member-6)
- [cm](#member-7)
- [cr](#member-8)
- [tm](#member-9)
- [tr](#member-10)
- [lm](#member-11)
- [lb](#member-12)
- [rm](#member-13)
- [bl](#member-14)
- [bm](#member-15)
- [br](#member-16)
- [sizer](#member-17)
- [tlm](#member-18)
- [brm](#member-19)
- [cpo](#member-20)
- [capo](#member-21)
- [capio](#member-22)
- [dlmrgn](#member-23)
- [dsmrgn](#member-24)
- [ctex](#member-25)
- [cf](#member-26)
- [ncf](#member-27)
- [wbox](#member-28)
- [cbtni](#member-29)
- [deco](#member-30)
- [cap](#member-31)
- [gbuf](#member-32)
- [gout](#member-33)
- [gbasic](#member-34)
- [dm](#member-35)
- [doff](#member-36)
- [large](#member-37)
- [cf](#member-47)
- [ncf](#member-48)
- [lg](#member-49)
- [cbtn](#member-50)
- [dragsize](#member-51)
- [cfocus](#member-52)
- [aa](#member-53)
- [ca](#member-54)
- [cptl](#member-55)
- [cpsz](#member-56)
- [cmw](#member-57)
- [cap](#member-58)
- [szdrag](#member-68)
- [szdragc](#member-69)
- [trans](#member-98)
- [anim](#member-99)
- [animst](#member-100)
- [niltrans](#member-112)
- [s](#member-113)
- [rev](#member-114)
- [a](#member-115)
- [na](#member-116)
- [minfac](#member-122)
- [time](#member-123)
- [trans](#member-126)

#### Methods

- [create(UI ui, Object[] args)](#member-38)
- [makedeco()](#member-39)
- [added()](#member-40)
- [chcap(String cap)](#member-41)
- [chdeco(Deco deco)](#member-42)
- [Deco()](#member-43)
- [public abstract void iresize(Coord isz);](#member-44)
- [public abstract Area contarea();](#member-45)
- [mousedown(MouseDownEvent ev)](#member-46)
- [DefaultDeco(boolean lg)](#member-59)
- [DefaultDeco()](#member-60)
- [dragsize(boolean v)](#member-61)
- [iresize(Coord isz)](#member-62)
- [contarea()](#member-63)
- [cdraw(GOut g)](#member-64)
- [drawbg(GOut g)](#member-65)
- [drawframe(GOut g)](#member-66)
- [draw(GOut g)](#member-67)
- [mousedown(MouseDownEvent ev)](#member-70)
- [mousemove(MouseMoveEvent ev)](#member-71)
- [mouseup(MouseUpEvent ev)](#member-72)
- [checkhit(Coord c)](#member-73)
- [cdraw(GOut g)](#member-74)
- [gbasic()](#member-75)
- [drawbuf(GOut g)](#member-76)
- [drawfin(GOut g, Tex buf)](#member-77)
- [draw(GOut og)](#member-78)
- [contentsz()](#member-79)
- [ca()](#member-80)
- [csz()](#member-81)
- [resize2(Coord sz)](#member-82)
- [resize(Coord sz)](#member-83)
- [uimsg(String msg, Object... args)](#member-84)
- [xlate(Coord c, boolean in)](#member-85)
- [drag(Coord off)](#member-86)
- [checkhit(Coord c)](#member-87)
- [mousedown(MouseDownEvent ev)](#member-88)
- [mouseup(MouseUpEvent ev)](#member-89)
- [mousemove(MouseMoveEvent ev)](#member-90)
- [handle(Event ev)](#member-91)
- [keydown(KeyDownEvent ev)](#member-92)
- [reqclose()](#member-93)
- [public boolean tick(double dt);](#member-94)
- [public void draw(GOut g, Tex tex);](#member-95)
- [public S show(Window wnd, H hiding);](#member-96)
- [public H hide(Window wnd, S showing);](#member-97)
- [tick(double dt)](#member-101)
- [show0(Transition<?, H> trans, Animation h)](#member-102)
- [hide0(Transition<S, ?> trans, Animation s)](#member-103)
- [settrans(Transition<?, ?> trans)](#member-104)
- [visible()](#member-105)
- [initanim()](#member-106)
- [show()](#member-107)
- [hide()](#member-108)
- [reqdestroy()](#member-109)
- [tick(double dt)](#member-110)
- [draw(GOut g, Tex tex)](#member-111)
- [NormAnim(double t, double fromn, boolean rev)](#member-117)
- [NormAnim(double t, NormAnim from, boolean rev)](#member-118)
- [NormAnim(double t)](#member-119)
- [tick(double dt)](#member-120)
- [stick(double a)](#member-121)
- [FadeAnim(boolean hide, FadeAnim from)](#member-124)
- [draw(GOut g, Tex tex)](#member-125)
- [deftrans()](#member-127)
- [main(String[] args)](#member-128)
- [isTitle(String text)](#member-129)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bgblend`

- Description: TODO

<a id="member-2"></a>
##### `cblend`

- Description: TODO

<a id="member-3"></a>
##### `bg`

- Description: TODO

<a id="member-4"></a>
##### `bgl`

- Description: TODO

<a id="member-5"></a>
##### `bgr`

- Description: TODO

<a id="member-6"></a>
##### `cl`

- Description: TODO

<a id="member-7"></a>
##### `cm`

- Description: TODO

<a id="member-8"></a>
##### `cr`

- Description: TODO

<a id="member-9"></a>
##### `tm`

- Description: TODO

<a id="member-10"></a>
##### `tr`

- Description: TODO

<a id="member-11"></a>
##### `lm`

- Description: TODO

<a id="member-12"></a>
##### `lb`

- Description: TODO

<a id="member-13"></a>
##### `rm`

- Description: TODO

<a id="member-14"></a>
##### `bl`

- Description: TODO

<a id="member-15"></a>
##### `bm`

- Description: TODO

<a id="member-16"></a>
##### `br`

- Description: TODO

<a id="member-17"></a>
##### `sizer`

- Description: TODO

<a id="member-18"></a>
##### `tlm`

- Description: TODO

<a id="member-19"></a>
##### `brm`

- Description: TODO

<a id="member-20"></a>
##### `cpo`

- Description: TODO

<a id="member-21"></a>
##### `capo`

- Description: TODO

<a id="member-22"></a>
##### `capio`

- Description: TODO

<a id="member-23"></a>
##### `dlmrgn`

- Description: TODO

<a id="member-24"></a>
##### `dsmrgn`

- Description: TODO

<a id="member-25"></a>
##### `ctex`

- Description: TODO

<a id="member-26"></a>
##### `cf`

- Description: TODO

<a id="member-27"></a>
##### `ncf`

- Description: TODO

<a id="member-28"></a>
##### `wbox`

- Description: TODO

<a id="member-29"></a>
##### `cbtni`

- Description: TODO

<a id="member-30"></a>
##### `deco`

- Description: TODO

<a id="member-31"></a>
##### `cap`

- Description: TODO

<a id="member-32"></a>
##### `gbuf`

- Description: TODO

<a id="member-33"></a>
##### `gout`

- Description: TODO

<a id="member-34"></a>
##### `gbasic`

- Description: TODO

<a id="member-35"></a>
##### `dm`

- Description: TODO

<a id="member-36"></a>
##### `doff`

- Description: TODO

<a id="member-37"></a>
##### `large`

- Description: TODO

<a id="member-47"></a>
##### `cf`

- Description: TODO

<a id="member-48"></a>
##### `ncf`

- Description: TODO

<a id="member-49"></a>
##### `lg`

- Description: TODO

<a id="member-50"></a>
##### `cbtn`

- Description: TODO

<a id="member-51"></a>
##### `dragsize`

- Description: TODO

<a id="member-52"></a>
##### `cfocus`

- Description: TODO

<a id="member-53"></a>
##### `aa`

- Description: TODO

<a id="member-54"></a>
##### `ca`

- Description: TODO

<a id="member-55"></a>
##### `cptl`

- Description: TODO

<a id="member-56"></a>
##### `cpsz`

- Description: TODO

<a id="member-57"></a>
##### `cmw`

- Description: TODO

<a id="member-58"></a>
##### `cap`

- Description: TODO

<a id="member-68"></a>
##### `szdrag`

- Description: TODO

<a id="member-69"></a>
##### `szdragc`

- Description: TODO

<a id="member-98"></a>
##### `trans`

- Description: TODO

<a id="member-99"></a>
##### `anim`

- Description: TODO

<a id="member-100"></a>
##### `animst`

- Description: TODO

<a id="member-112"></a>
##### `niltrans`

- Description: TODO

<a id="member-113"></a>
##### `s`

- Description: TODO

<a id="member-114"></a>
##### `rev`

- Description: TODO

<a id="member-115"></a>
##### `a`

- Description: TODO

<a id="member-116"></a>
##### `na`

- Description: TODO

<a id="member-122"></a>
##### `minfac`

- Description: TODO

<a id="member-123"></a>
##### `time`

- Description: TODO

<a id="member-126"></a>
##### `trans`

- Description: TODO

#### Methods

<a id="member-38"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-39"></a>
##### `makedeco()`

- Description: TODO

<a id="member-40"></a>
##### `added()`

- Description: TODO

<a id="member-41"></a>
##### `chcap(String cap)`

- Description: TODO

<a id="member-42"></a>
##### `chdeco(Deco deco)`

- Description: TODO

<a id="member-43"></a>
##### `Deco()`

- Description: TODO

<a id="member-44"></a>
##### `public abstract void iresize(Coord isz);`

- Description: TODO

<a id="member-45"></a>
##### `public abstract Area contarea();`

- Description: TODO

<a id="member-46"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-59"></a>
##### `DefaultDeco(boolean lg)`

- Description: TODO

<a id="member-60"></a>
##### `DefaultDeco()`

- Description: TODO

<a id="member-61"></a>
##### `dragsize(boolean v)`

- Description: TODO

<a id="member-62"></a>
##### `iresize(Coord isz)`

- Description: TODO

<a id="member-63"></a>
##### `contarea()`

- Description: TODO

<a id="member-64"></a>
##### `cdraw(GOut g)`

- Description: TODO

<a id="member-65"></a>
##### `drawbg(GOut g)`

- Description: TODO

<a id="member-66"></a>
##### `drawframe(GOut g)`

- Description: TODO

<a id="member-67"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-70"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-71"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-72"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-73"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-74"></a>
##### `cdraw(GOut g)`

- Description: TODO

<a id="member-75"></a>
##### `gbasic()`

- Description: TODO

<a id="member-76"></a>
##### `drawbuf(GOut g)`

- Description: TODO

<a id="member-77"></a>
##### `drawfin(GOut g, Tex buf)`

- Description: TODO

<a id="member-78"></a>
##### `draw(GOut og)`

- Description: TODO

<a id="member-79"></a>
##### `contentsz()`

- Description: TODO

<a id="member-80"></a>
##### `ca()`

- Description: TODO

<a id="member-81"></a>
##### `csz()`

- Description: TODO

<a id="member-82"></a>
##### `resize2(Coord sz)`

- Description: TODO

<a id="member-83"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-84"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-85"></a>
##### `xlate(Coord c, boolean in)`

- Description: TODO

<a id="member-86"></a>
##### `drag(Coord off)`

- Description: TODO

<a id="member-87"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-88"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-89"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-90"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-91"></a>
##### `handle(Event ev)`

- Description: TODO

<a id="member-92"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-93"></a>
##### `reqclose()`

- Description: TODO

<a id="member-94"></a>
##### `public boolean tick(double dt);`

- Description: TODO

<a id="member-95"></a>
##### `public void draw(GOut g, Tex tex);`

- Description: TODO

<a id="member-96"></a>
##### `public S show(Window wnd, H hiding);`

- Description: TODO

<a id="member-97"></a>
##### `public H hide(Window wnd, S showing);`

- Description: TODO

<a id="member-101"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-102"></a>
##### `show0(Transition<?, H> trans, Animation h)`

- Description: TODO

<a id="member-103"></a>
##### `hide0(Transition<S, ?> trans, Animation s)`

- Description: TODO

<a id="member-104"></a>
##### `settrans(Transition<?, ?> trans)`

- Description: TODO

<a id="member-105"></a>
##### `visible()`

- Description: TODO

<a id="member-106"></a>
##### `initanim()`

- Description: TODO

<a id="member-107"></a>
##### `show()`

- Description: TODO

<a id="member-108"></a>
##### `hide()`

- Description: TODO

<a id="member-109"></a>
##### `reqdestroy()`

- Description: TODO

<a id="member-110"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-111"></a>
##### `draw(GOut g, Tex tex)`

- Description: TODO

<a id="member-117"></a>
##### `NormAnim(double t, double fromn, boolean rev)`

- Description: TODO

<a id="member-118"></a>
##### `NormAnim(double t, NormAnim from, boolean rev)`

- Description: TODO

<a id="member-119"></a>
##### `NormAnim(double t)`

- Description: TODO

<a id="member-120"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-121"></a>
##### `stick(double a)`

- Description: TODO

<a id="member-124"></a>
##### `FadeAnim(boolean hide, FadeAnim from)`

- Description: TODO

<a id="member-125"></a>
##### `draw(GOut g, Tex tex)`

- Description: TODO

<a id="member-127"></a>
##### `deftrans()`

- Description: TODO

<a id="member-128"></a>
##### `main(String[] args)`

- Description: TODO

<a id="member-129"></a>
##### `isTitle(String text)`

- Description: TODO
