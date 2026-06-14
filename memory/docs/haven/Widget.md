# Widget

## Meta

- Source: [Widget.java](../../../src/haven/Widget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Defines the base UI widget.

## Code Members

### Member Index

#### Fields

- [ui](#member-1)
- [c](#member-2)
- [sz](#member-3)
- [z](#member-4)
- [next](#member-5)
- [prev](#member-6)
- [child](#member-7)
- [lchild](#member-8)
- [parent](#member-9)
- [childseq](#member-10)
- [focustab](#member-11)
- [focusctl](#member-12)
- [hasfocus](#member-13)
- [visible](#member-14)
- [attached](#member-15)
- [canfocus](#member-16)
- [autofocus](#member-17)
- [canactivate](#member-18)
- [cancancel](#member-19)
- [focused](#member-20)
- [cursor](#member-21)
- [tooltip](#member-22)
- [gkey](#member-23)
- [kb_gkey](#member-24)
- [types](#member-25)
- [inited](#member-38)
- [spec](#member-53)
- [pos](#member-54)
- [stack](#member-55)
- [propagate](#member-98)
- [grabbed](#member-99)
- [handling](#member-100)
- [target](#member-101)
- [phandled](#member-102)
- [listening](#member-112)
- [dt](#member-117)
- [out](#member-121)
- [msg](#member-125)
- [args](#member-126)
- [c](#member-130)
- [b](#member-139)
- [a](#member-156)
- [s](#member-157)
- [hovering](#member-162)
- [key_act](#member-169)
- [key_esc](#member-170)
- [key_tab](#member-171)
- [awt](#member-172)
- [code](#member-173)
- [mods](#member-174)
- [c](#member-175)
- [root](#member-187)
- [ret](#member-188)
- [root](#member-193)
- [last](#member-194)
- [ret](#member-195)
- [from](#member-196)
- [defcurs](#member-202)
- [gkeys](#member-214)
- [title](#member-269)
- [res](#member-270)
- [tiptitle](#member-271)
- [rend](#member-272)
- [hasrend](#member-273)
- [base](#member-278)
- [rich](#member-279)
- [rend](#member-280)
- [hrend](#member-281)
- [rkey](#member-282)
- [anims](#member-297)
- [nanims](#member-298)
- [a](#member-303)
- [s](#member-304)
- [wdgctx](#member-308)

#### Methods

- [public String value();](#member-26)
- [create(UI ui, Object[] args)](#member-27)
- [create(UI ui, Object[] args)](#member-28)
- [create(UI ui, Object[] args)](#member-29)
- [protected abstract Coord getc();](#member-30)
- [add(T child)](#member-31)
- [cresize(Widget ch)](#member-32)
- [presize()](#member-33)
- [added()](#member-34)
- [create(UI ui, final Object[] args)](#member-35)
- [public Widget create(UI ui, Object[] par);](#member-36)
- [FactMaker()](#member-37)
- [initnames()](#member-39)
- [gettype3(String name)](#member-40)
- [public static Factory gettype2(String name) throws InterruptedException](#member-41)
- [gettype(String name)](#member-42)
- [attach(UI ui)](#member-43)
- [attached()](#member-44)
- [add0(T child)](#member-45)
- [add(T child)](#member-46)
- [add(T child, Coord c)](#member-47)
- [add(T child, int x, int y)](#member-48)
- [adda(T child, int x, int y, double ax, double ay)](#member-49)
- [adda(T child, Coord c, double ax, double ay)](#member-50)
- [adda(T child, double ax, double ay)](#member-51)
- [added()](#member-52)
- [RelposError(Throwable cause, String spec, int pos, Stack<Object> stack)](#member-56)
- [getMessage()](#member-57)
- [relpos(String spec, Object self, Object[] args, int off)](#member-58)
- [addchild(Widget child, Object... args)](#member-59)
- [link()](#member-60)
- [linkfirst()](#member-61)
- [unlink()](#member-62)
- [xlate(Coord c, boolean in)](#member-63)
- [parentpos(Widget in)](#member-64)
- [parentpos(Widget in, Coord c)](#member-65)
- [rootpos()](#member-66)
- [rootpos(Coord c)](#member-67)
- [rootxlate(Coord c)](#member-68)
- [hasparent(Widget w2)](#member-69)
- [gotfocus()](#member-70)
- [dispose()](#member-71)
- [rdispose()](#member-72)
- [remove()](#member-73)
- [reqdestroy()](#member-74)
- [destroy()](#member-75)
- [cdestroy(Widget w)](#member-76)
- [wdgid()](#member-77)
- [lostfocus()](#member-78)
- [setfocus(Widget w)](#member-79)
- [setcanfocus(boolean canfocus)](#member-80)
- [newfocusable(Widget w)](#member-81)
- [delfocusable(Widget w)](#member-82)
- [findfocus()](#member-83)
- [setfocusctl(boolean focusctl)](#member-84)
- [setfocustab(boolean focustab)](#member-85)
- [HandlerMaker()](#member-86)
- [public void handle(Widget tgt, Object... args);](#member-87)
- [uimsg(String msg, Object... args)](#member-88)
- [wdgmsg(String msg, Object... args)](#member-89)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-90)
- [tick(double dt)](#member-91)
- [tick(TickEvent ev)](#member-92)
- [gtick(haven.render.Render out)](#member-93)
- [gtick(GTickEvent ev)](#member-94)
- [draw(GOut g, boolean strict)](#member-95)
- [draw(GOut g)](#member-96)
- [checkhit(Coord c)](#member-97)
- [Event()](#member-103)
- [Event(Event from)](#member-104)
- [grabbed(boolean g)](#member-105)
- [protected abstract boolean propagation(Widget from);](#member-106)
- [stop()](#member-107)
- [shandle(Widget w)](#member-108)
- [propagate(Widget from)](#member-109)
- [fpropagate(Widget from)](#member-110)
- [dispatch(Widget w)](#member-111)
- [listen(Class<E> t, EventHandler<? super E> h)](#member-113)
- [deafen(EventHandler<?> h)](#member-114)
- [listening(Class<H> cl)](#member-115)
- [handle(Event ev)](#member-116)
- [TickEvent(double dt)](#member-118)
- [propagation(Widget from)](#member-119)
- [shandle(Widget w)](#member-120)
- [GTickEvent(haven.render.Render out)](#member-122)
- [propagation(Widget from)](#member-123)
- [shandle(Widget w)](#member-124)
- [MessageEvent(String msg, Object[] args)](#member-127)
- [propagation(Widget from)](#member-128)
- [shandle(Widget w)](#member-129)
- [PointerEvent(Coord c)](#member-131)
- [PointerEvent(PointerEvent from, Coord c)](#member-132)
- [public abstract PointerEvent derive(Coord c);](#member-133)
- [propagation(Widget from)](#member-134)
- [MouseEvent(Coord c)](#member-135)
- [MouseEvent(MouseEvent from, Coord c)](#member-136)
- [MouseActionEvent(Coord c)](#member-137)
- [MouseActionEvent(MouseEvent from, Coord c)](#member-138)
- [MouseButtonEvent(Coord c, int b)](#member-140)
- [MouseButtonEvent(MouseButtonEvent from, Coord c)](#member-141)
- [public abstract MouseButtonEvent derive(Coord c);](#member-142)
- [MouseDownEvent(Coord c, int b)](#member-143)
- [MouseDownEvent(MouseDownEvent from, Coord c)](#member-144)
- [derive(Coord c)](#member-145)
- [shandle(Widget w)](#member-146)
- [MouseUpEvent(Coord c, int b)](#member-147)
- [MouseUpEvent(MouseUpEvent from, Coord c)](#member-148)
- [derive(Coord c)](#member-149)
- [shandle(Widget w)](#member-150)
- [MouseMoveEvent(Coord c)](#member-151)
- [MouseMoveEvent(MouseMoveEvent from, Coord c)](#member-152)
- [derive(Coord c)](#member-153)
- [propagation(Widget from)](#member-154)
- [shandle(Widget w)](#member-155)
- [MouseWheelEvent(Coord c, int a, double s)](#member-158)
- [MouseWheelEvent(MouseWheelEvent from, Coord c)](#member-159)
- [derive(Coord c)](#member-160)
- [shandle(Widget w)](#member-161)
- [MouseHoverEvent(Coord c)](#member-163)
- [MouseHoverEvent(MouseHoverEvent from, Coord c)](#member-164)
- [derive(Coord c)](#member-165)
- [hovering(boolean h)](#member-166)
- [propagation(Widget from)](#member-167)
- [shandle(Widget w)](#member-168)
- [KbdEvent(KeyEvent awt)](#member-176)
- [FocusedKeyEvent(KeyEvent awt)](#member-177)
- [propagation(Widget from)](#member-178)
- [KeyDownEvent(KeyEvent awt)](#member-179)
- [shandle(Widget w)](#member-180)
- [KeyUpEvent(KeyEvent awt)](#member-181)
- [shandle(Widget w)](#member-182)
- [GlobKeyEvent(KeyEvent awt)](#member-183)
- [propagation(Widget from)](#member-184)
- [shandle(Widget w)](#member-185)
- [propagation(Widget from)](#member-186)
- [QueryEvent(Coord c)](#member-189)
- [QueryEvent(QueryEvent<R> from, Coord c)](#member-190)
- [set(R ret)](#member-191)
- [defvalue()](#member-192)
- [TooltipQuery(Coord c, Widget last)](#member-197)
- [TooltipQuery(TooltipQuery from, Coord c)](#member-198)
- [derive(Coord c)](#member-199)
- [set(Object ret, Widget from)](#member-200)
- [shandle(Widget w)](#member-201)
- [CursorQuery(Coord c)](#member-203)
- [CursorQuery(CursorQuery from, Coord c)](#member-204)
- [derive(Coord c)](#member-205)
- [public boolean getcurs(CursorQuery ev);](#member-206)
- [shandle(Widget w)](#member-207)
- [defvalue()](#member-208)
- [mousedown(MouseDownEvent ev)](#member-209)
- [mouseup(MouseUpEvent ev)](#member-210)
- [mousewheel(MouseWheelEvent ev)](#member-211)
- [mousemove(MouseMoveEvent ev)](#member-212)
- [mousehover(MouseHoverEvent ev, boolean hovering)](#member-213)
- [gkeymatch(int gkey)](#member-215)
- [gkeytype(GlobKeyEvent ev)](#member-216)
- [keydown(KeyDownEvent ev)](#member-217)
- [keyup(KeyUpEvent ev)](#member-218)
- [globtype(GlobKeyEvent ev)](#member-219)
- [setgkey(KeyMatch gkey)](#member-220)
- [setgkey(KeyBinding gkey)](#member-221)
- [area()](#member-222)
- [parentarea(Widget in)](#member-223)
- [rootarea()](#member-224)
- [contentsz()](#member-225)
- [pack()](#member-226)
- [move(Coord c)](#member-227)
- [resize(Coord sz)](#member-228)
- [z(int z)](#member-229)
- [move(Area a)](#member-230)
- [resize(int x, int y)](#member-231)
- [resizew(int w)](#member-232)
- [resizeh(int h)](#member-233)
- [cresize(Widget ch)](#member-234)
- [presize()](#member-235)
- [Position(int x, int y)](#member-236)
- [Position(Coord c)](#member-237)
- [add(int X, int Y)](#member-238)
- [add(Coord c)](#member-239)
- [adds(int x, int y)](#member-240)
- [adds(Coord c)](#member-241)
- [sub(int X, int Y)](#member-242)
- [sub(Coord c)](#member-243)
- [subs(int x, int y)](#member-244)
- [subs(Coord c)](#member-245)
- [x(int X)](#member-246)
- [y(int Y)](#member-247)
- [xs(int x)](#member-248)
- [ys(int y)](#member-249)
- [getpos(String nm)](#member-250)
- [pos(String nm)](#member-251)
- [addhlp(Coord c, int pad, Widget... children)](#member-252)
- [addhlp(Coord c, int pad, int w, Widget... children)](#member-253)
- [addhl(Coord c, int w, Widget... children)](#member-254)
- [addvlp(Coord c, int pad, Widget... children)](#member-255)
- [addvlp(Coord c, int pad, int h, Widget... children)](#member-256)
- [addvl(Coord c, int h, Widget... children)](#member-257)
- [raise()](#member-258)
- [lower()](#member-259)
- [getchild(Class<T> cl)](#member-260)
- [findchild(Class<T> cl)](#member-261)
- [rprev()](#member-262)
- [rnext()](#member-263)
- [Children()](#member-264)
- [size()](#member-265)
- [listIterator(int idx)](#member-266)
- [children()](#member-267)
- [children(final Class<T> cl)](#member-268)
- [PaginaTip(Indir<Resource> res, String title)](#member-274)
- [PaginaTip(Indir<Resource> res, boolean tiptitle)](#member-275)
- [PaginaTip(Indir<Resource> res)](#member-276)
- [get()](#member-277)
- [KeyboundTip(String base, boolean rich)](#member-283)
- [KeyboundTip(String base)](#member-284)
- [KeyboundTip()](#member-285)
- [get()](#member-286)
- [tooltip(Coord c, Widget prev)](#member-287)
- [tooltip(TooltipQuery ev)](#member-288)
- [settip(String text, boolean rich)](#member-289)
- [settip(String text)](#member-290)
- [getparent(Class<T> cl)](#member-291)
- [hide()](#member-292)
- [show()](#member-293)
- [show(boolean show)](#member-294)
- [visible()](#member-295)
- [tvisible()](#member-296)
- [clearanims(Class<T> type)](#member-299)
- [Anim()](#member-300)
- [clear()](#member-301)
- [public abstract boolean tick(double dt);](#member-302)
- [NormAnim(double s)](#member-305)
- [tick(double dt)](#member-306)
- [public abstract void ntick(double a);](#member-307)
- [getChildOf(Class<T> c)](#member-309)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `ui`

- Description: TODO

<a id="member-2"></a>
##### `c`

- Description: TODO

<a id="member-3"></a>
##### `sz`

- Description: TODO

<a id="member-4"></a>
##### `z`

- Description: TODO

<a id="member-5"></a>
##### `next`

- Description: TODO

<a id="member-6"></a>
##### `prev`

- Description: TODO

<a id="member-7"></a>
##### `child`

- Description: TODO

<a id="member-8"></a>
##### `lchild`

- Description: TODO

<a id="member-9"></a>
##### `parent`

- Description: TODO

<a id="member-10"></a>
##### `childseq`

- Description: TODO

<a id="member-11"></a>
##### `focustab`

- Description: TODO

<a id="member-12"></a>
##### `focusctl`

- Description: TODO

<a id="member-13"></a>
##### `hasfocus`

- Description: TODO

<a id="member-14"></a>
##### `visible`

- Description: TODO

<a id="member-15"></a>
##### `attached`

- Description: TODO

<a id="member-16"></a>
##### `canfocus`

- Description: TODO

<a id="member-17"></a>
##### `autofocus`

- Description: TODO

<a id="member-18"></a>
##### `canactivate`

- Description: TODO

<a id="member-19"></a>
##### `cancancel`

- Description: TODO

<a id="member-20"></a>
##### `focused`

- Description: TODO

<a id="member-21"></a>
##### `cursor`

- Description: TODO

<a id="member-22"></a>
##### `tooltip`

- Description: TODO

<a id="member-23"></a>
##### `gkey`

- Description: TODO

<a id="member-24"></a>
##### `kb_gkey`

- Description: TODO

<a id="member-25"></a>
##### `types`

- Description: TODO

<a id="member-38"></a>
##### `inited`

- Description: TODO

<a id="member-53"></a>
##### `spec`

- Description: TODO

<a id="member-54"></a>
##### `pos`

- Description: TODO

<a id="member-55"></a>
##### `stack`

- Description: TODO

<a id="member-98"></a>
##### `propagate`

- Description: TODO

<a id="member-99"></a>
##### `grabbed`

- Description: TODO

<a id="member-100"></a>
##### `handling`

- Description: TODO

<a id="member-101"></a>
##### `target`

- Description: TODO

<a id="member-102"></a>
##### `phandled`

- Description: TODO

<a id="member-112"></a>
##### `listening`

- Description: TODO

<a id="member-117"></a>
##### `dt`

- Description: TODO

<a id="member-121"></a>
##### `out`

- Description: TODO

<a id="member-125"></a>
##### `msg`

- Description: TODO

<a id="member-126"></a>
##### `args`

- Description: TODO

<a id="member-130"></a>
##### `c`

- Description: TODO

<a id="member-139"></a>
##### `b`

- Description: TODO

<a id="member-156"></a>
##### `a`

- Description: TODO

<a id="member-157"></a>
##### `s`

- Description: TODO

<a id="member-162"></a>
##### `hovering`

- Description: TODO

<a id="member-169"></a>
##### `key_act`

- Description: TODO

<a id="member-170"></a>
##### `key_esc`

- Description: TODO

<a id="member-171"></a>
##### `key_tab`

- Description: TODO

<a id="member-172"></a>
##### `awt`

- Description: TODO

<a id="member-173"></a>
##### `code`

- Description: TODO

<a id="member-174"></a>
##### `mods`

- Description: TODO

<a id="member-175"></a>
##### `c`

- Description: TODO

<a id="member-187"></a>
##### `root`

- Description: TODO

<a id="member-188"></a>
##### `ret`

- Description: TODO

<a id="member-193"></a>
##### `root`

- Description: TODO

<a id="member-194"></a>
##### `last`

- Description: TODO

<a id="member-195"></a>
##### `ret`

- Description: TODO

<a id="member-196"></a>
##### `from`

- Description: TODO

<a id="member-202"></a>
##### `defcurs`

- Description: TODO

<a id="member-214"></a>
##### `gkeys`

- Description: TODO

<a id="member-269"></a>
##### `title`

- Description: TODO

<a id="member-270"></a>
##### `res`

- Description: TODO

<a id="member-271"></a>
##### `tiptitle`

- Description: TODO

<a id="member-272"></a>
##### `rend`

- Description: TODO

<a id="member-273"></a>
##### `hasrend`

- Description: TODO

<a id="member-278"></a>
##### `base`

- Description: TODO

<a id="member-279"></a>
##### `rich`

- Description: TODO

<a id="member-280"></a>
##### `rend`

- Description: TODO

<a id="member-281"></a>
##### `hrend`

- Description: TODO

<a id="member-282"></a>
##### `rkey`

- Description: TODO

<a id="member-297"></a>
##### `anims`

- Description: TODO

<a id="member-298"></a>
##### `nanims`

- Description: TODO

<a id="member-303"></a>
##### `a`

- Description: TODO

<a id="member-304"></a>
##### `s`

- Description: TODO

<a id="member-308"></a>
##### `wdgctx`

- Description: TODO

#### Methods

<a id="member-26"></a>
##### `public String value();`

- Description: TODO

<a id="member-27"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-28"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-29"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-30"></a>
##### `protected abstract Coord getc();`

- Description: TODO

<a id="member-31"></a>
##### `add(T child)`

- Description: TODO

<a id="member-32"></a>
##### `cresize(Widget ch)`

- Description: TODO

<a id="member-33"></a>
##### `presize()`

- Description: TODO

<a id="member-34"></a>
##### `added()`

- Description: TODO

<a id="member-35"></a>
##### `create(UI ui, final Object[] args)`

- Description: TODO

<a id="member-36"></a>
##### `public Widget create(UI ui, Object[] par);`

- Description: TODO

<a id="member-37"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-39"></a>
##### `initnames()`

- Description: TODO

<a id="member-40"></a>
##### `gettype3(String name)`

- Description: TODO

<a id="member-41"></a>
##### `public static Factory gettype2(String name) throws InterruptedException`

- Description: TODO

<a id="member-42"></a>
##### `gettype(String name)`

- Description: TODO

<a id="member-43"></a>
##### `attach(UI ui)`

- Description: TODO

<a id="member-44"></a>
##### `attached()`

- Description: TODO

<a id="member-45"></a>
##### `add0(T child)`

- Description: TODO

<a id="member-46"></a>
##### `add(T child)`

- Description: TODO

<a id="member-47"></a>
##### `add(T child, Coord c)`

- Description: TODO

<a id="member-48"></a>
##### `add(T child, int x, int y)`

- Description: TODO

<a id="member-49"></a>
##### `adda(T child, int x, int y, double ax, double ay)`

- Description: TODO

<a id="member-50"></a>
##### `adda(T child, Coord c, double ax, double ay)`

- Description: TODO

<a id="member-51"></a>
##### `adda(T child, double ax, double ay)`

- Description: TODO

<a id="member-52"></a>
##### `added()`

- Description: TODO

<a id="member-56"></a>
##### `RelposError(Throwable cause, String spec, int pos, Stack<Object> stack)`

- Description: TODO

<a id="member-57"></a>
##### `getMessage()`

- Description: TODO

<a id="member-58"></a>
##### `relpos(String spec, Object self, Object[] args, int off)`

- Description: TODO

<a id="member-59"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-60"></a>
##### `link()`

- Description: TODO

<a id="member-61"></a>
##### `linkfirst()`

- Description: TODO

<a id="member-62"></a>
##### `unlink()`

- Description: TODO

<a id="member-63"></a>
##### `xlate(Coord c, boolean in)`

- Description: TODO

<a id="member-64"></a>
##### `parentpos(Widget in)`

- Description: TODO

<a id="member-65"></a>
##### `parentpos(Widget in, Coord c)`

- Description: TODO

<a id="member-66"></a>
##### `rootpos()`

- Description: TODO

<a id="member-67"></a>
##### `rootpos(Coord c)`

- Description: TODO

<a id="member-68"></a>
##### `rootxlate(Coord c)`

- Description: TODO

<a id="member-69"></a>
##### `hasparent(Widget w2)`

- Description: TODO

<a id="member-70"></a>
##### `gotfocus()`

- Description: TODO

<a id="member-71"></a>
##### `dispose()`

- Description: TODO

<a id="member-72"></a>
##### `rdispose()`

- Description: TODO

<a id="member-73"></a>
##### `remove()`

- Description: TODO

<a id="member-74"></a>
##### `reqdestroy()`

- Description: TODO

<a id="member-75"></a>
##### `destroy()`

- Description: TODO

<a id="member-76"></a>
##### `cdestroy(Widget w)`

- Description: TODO

<a id="member-77"></a>
##### `wdgid()`

- Description: TODO

<a id="member-78"></a>
##### `lostfocus()`

- Description: TODO

<a id="member-79"></a>
##### `setfocus(Widget w)`

- Description: TODO

<a id="member-80"></a>
##### `setcanfocus(boolean canfocus)`

- Description: TODO

<a id="member-81"></a>
##### `newfocusable(Widget w)`

- Description: TODO

<a id="member-82"></a>
##### `delfocusable(Widget w)`

- Description: TODO

<a id="member-83"></a>
##### `findfocus()`

- Description: TODO

<a id="member-84"></a>
##### `setfocusctl(boolean focusctl)`

- Description: TODO

<a id="member-85"></a>
##### `setfocustab(boolean focustab)`

- Description: TODO

<a id="member-86"></a>
##### `HandlerMaker()`

- Description: TODO

<a id="member-87"></a>
##### `public void handle(Widget tgt, Object... args);`

- Description: TODO

<a id="member-88"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-89"></a>
##### `wdgmsg(String msg, Object... args)`

- Description: TODO

<a id="member-90"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-91"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-92"></a>
##### `tick(TickEvent ev)`

- Description: TODO

<a id="member-93"></a>
##### `gtick(haven.render.Render out)`

- Description: TODO

<a id="member-94"></a>
##### `gtick(GTickEvent ev)`

- Description: TODO

<a id="member-95"></a>
##### `draw(GOut g, boolean strict)`

- Description: TODO

<a id="member-96"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-97"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-103"></a>
##### `Event()`

- Description: TODO

<a id="member-104"></a>
##### `Event(Event from)`

- Description: TODO

<a id="member-105"></a>
##### `grabbed(boolean g)`

- Description: TODO

<a id="member-106"></a>
##### `protected abstract boolean propagation(Widget from);`

- Description: TODO

<a id="member-107"></a>
##### `stop()`

- Description: TODO

<a id="member-108"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-109"></a>
##### `propagate(Widget from)`

- Description: TODO

<a id="member-110"></a>
##### `fpropagate(Widget from)`

- Description: TODO

<a id="member-111"></a>
##### `dispatch(Widget w)`

- Description: TODO

<a id="member-113"></a>
##### `listen(Class<E> t, EventHandler<? super E> h)`

- Description: TODO

<a id="member-114"></a>
##### `deafen(EventHandler<?> h)`

- Description: TODO

<a id="member-115"></a>
##### `listening(Class<H> cl)`

- Description: TODO

<a id="member-116"></a>
##### `handle(Event ev)`

- Description: TODO

<a id="member-118"></a>
##### `TickEvent(double dt)`

- Description: TODO

<a id="member-119"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-120"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-122"></a>
##### `GTickEvent(haven.render.Render out)`

- Description: TODO

<a id="member-123"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-124"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-127"></a>
##### `MessageEvent(String msg, Object[] args)`

- Description: TODO

<a id="member-128"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-129"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-131"></a>
##### `PointerEvent(Coord c)`

- Description: TODO

<a id="member-132"></a>
##### `PointerEvent(PointerEvent from, Coord c)`

- Description: TODO

<a id="member-133"></a>
##### `public abstract PointerEvent derive(Coord c);`

- Description: TODO

<a id="member-134"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-135"></a>
##### `MouseEvent(Coord c)`

- Description: TODO

<a id="member-136"></a>
##### `MouseEvent(MouseEvent from, Coord c)`

- Description: TODO

<a id="member-137"></a>
##### `MouseActionEvent(Coord c)`

- Description: TODO

<a id="member-138"></a>
##### `MouseActionEvent(MouseEvent from, Coord c)`

- Description: TODO

<a id="member-140"></a>
##### `MouseButtonEvent(Coord c, int b)`

- Description: TODO

<a id="member-141"></a>
##### `MouseButtonEvent(MouseButtonEvent from, Coord c)`

- Description: TODO

<a id="member-142"></a>
##### `public abstract MouseButtonEvent derive(Coord c);`

- Description: TODO

<a id="member-143"></a>
##### `MouseDownEvent(Coord c, int b)`

- Description: TODO

<a id="member-144"></a>
##### `MouseDownEvent(MouseDownEvent from, Coord c)`

- Description: TODO

<a id="member-145"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-146"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-147"></a>
##### `MouseUpEvent(Coord c, int b)`

- Description: TODO

<a id="member-148"></a>
##### `MouseUpEvent(MouseUpEvent from, Coord c)`

- Description: TODO

<a id="member-149"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-150"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-151"></a>
##### `MouseMoveEvent(Coord c)`

- Description: TODO

<a id="member-152"></a>
##### `MouseMoveEvent(MouseMoveEvent from, Coord c)`

- Description: TODO

<a id="member-153"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-154"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-155"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-158"></a>
##### `MouseWheelEvent(Coord c, int a, double s)`

- Description: TODO

<a id="member-159"></a>
##### `MouseWheelEvent(MouseWheelEvent from, Coord c)`

- Description: TODO

<a id="member-160"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-161"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-163"></a>
##### `MouseHoverEvent(Coord c)`

- Description: TODO

<a id="member-164"></a>
##### `MouseHoverEvent(MouseHoverEvent from, Coord c)`

- Description: TODO

<a id="member-165"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-166"></a>
##### `hovering(boolean h)`

- Description: TODO

<a id="member-167"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-168"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-176"></a>
##### `KbdEvent(KeyEvent awt)`

- Description: TODO

<a id="member-177"></a>
##### `FocusedKeyEvent(KeyEvent awt)`

- Description: TODO

<a id="member-178"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-179"></a>
##### `KeyDownEvent(KeyEvent awt)`

- Description: TODO

<a id="member-180"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-181"></a>
##### `KeyUpEvent(KeyEvent awt)`

- Description: TODO

<a id="member-182"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-183"></a>
##### `GlobKeyEvent(KeyEvent awt)`

- Description: TODO

<a id="member-184"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-185"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-186"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-189"></a>
##### `QueryEvent(Coord c)`

- Description: TODO

<a id="member-190"></a>
##### `QueryEvent(QueryEvent<R> from, Coord c)`

- Description: TODO

<a id="member-191"></a>
##### `set(R ret)`

- Description: TODO

<a id="member-192"></a>
##### `defvalue()`

- Description: TODO

<a id="member-197"></a>
##### `TooltipQuery(Coord c, Widget last)`

- Description: TODO

<a id="member-198"></a>
##### `TooltipQuery(TooltipQuery from, Coord c)`

- Description: TODO

<a id="member-199"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-200"></a>
##### `set(Object ret, Widget from)`

- Description: TODO

<a id="member-201"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-203"></a>
##### `CursorQuery(Coord c)`

- Description: TODO

<a id="member-204"></a>
##### `CursorQuery(CursorQuery from, Coord c)`

- Description: TODO

<a id="member-205"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-206"></a>
##### `public boolean getcurs(CursorQuery ev);`

- Description: TODO

<a id="member-207"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-208"></a>
##### `defvalue()`

- Description: TODO

<a id="member-209"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-210"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-211"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-212"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-213"></a>
##### `mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

<a id="member-215"></a>
##### `gkeymatch(int gkey)`

- Description: TODO

<a id="member-216"></a>
##### `gkeytype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-217"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-218"></a>
##### `keyup(KeyUpEvent ev)`

- Description: TODO

<a id="member-219"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-220"></a>
##### `setgkey(KeyMatch gkey)`

- Description: TODO

<a id="member-221"></a>
##### `setgkey(KeyBinding gkey)`

- Description: TODO

<a id="member-222"></a>
##### `area()`

- Description: TODO

<a id="member-223"></a>
##### `parentarea(Widget in)`

- Description: TODO

<a id="member-224"></a>
##### `rootarea()`

- Description: TODO

<a id="member-225"></a>
##### `contentsz()`

- Description: TODO

<a id="member-226"></a>
##### `pack()`

- Description: TODO

<a id="member-227"></a>
##### `move(Coord c)`

- Description: TODO

<a id="member-228"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-229"></a>
##### `z(int z)`

- Description: TODO

<a id="member-230"></a>
##### `move(Area a)`

- Description: TODO

<a id="member-231"></a>
##### `resize(int x, int y)`

- Description: TODO

<a id="member-232"></a>
##### `resizew(int w)`

- Description: TODO

<a id="member-233"></a>
##### `resizeh(int h)`

- Description: TODO

<a id="member-234"></a>
##### `cresize(Widget ch)`

- Description: TODO

<a id="member-235"></a>
##### `presize()`

- Description: TODO

<a id="member-236"></a>
##### `Position(int x, int y)`

- Description: TODO

<a id="member-237"></a>
##### `Position(Coord c)`

- Description: TODO

<a id="member-238"></a>
##### `add(int X, int Y)`

- Description: TODO

<a id="member-239"></a>
##### `add(Coord c)`

- Description: TODO

<a id="member-240"></a>
##### `adds(int x, int y)`

- Description: TODO

<a id="member-241"></a>
##### `adds(Coord c)`

- Description: TODO

<a id="member-242"></a>
##### `sub(int X, int Y)`

- Description: TODO

<a id="member-243"></a>
##### `sub(Coord c)`

- Description: TODO

<a id="member-244"></a>
##### `subs(int x, int y)`

- Description: TODO

<a id="member-245"></a>
##### `subs(Coord c)`

- Description: TODO

<a id="member-246"></a>
##### `x(int X)`

- Description: TODO

<a id="member-247"></a>
##### `y(int Y)`

- Description: TODO

<a id="member-248"></a>
##### `xs(int x)`

- Description: TODO

<a id="member-249"></a>
##### `ys(int y)`

- Description: TODO

<a id="member-250"></a>
##### `getpos(String nm)`

- Description: TODO

<a id="member-251"></a>
##### `pos(String nm)`

- Description: TODO

<a id="member-252"></a>
##### `addhlp(Coord c, int pad, Widget... children)`

- Description: TODO

<a id="member-253"></a>
##### `addhlp(Coord c, int pad, int w, Widget... children)`

- Description: TODO

<a id="member-254"></a>
##### `addhl(Coord c, int w, Widget... children)`

- Description: TODO

<a id="member-255"></a>
##### `addvlp(Coord c, int pad, Widget... children)`

- Description: TODO

<a id="member-256"></a>
##### `addvlp(Coord c, int pad, int h, Widget... children)`

- Description: TODO

<a id="member-257"></a>
##### `addvl(Coord c, int h, Widget... children)`

- Description: TODO

<a id="member-258"></a>
##### `raise()`

- Description: TODO

<a id="member-259"></a>
##### `lower()`

- Description: TODO

<a id="member-260"></a>
##### `getchild(Class<T> cl)`

- Description: TODO

<a id="member-261"></a>
##### `findchild(Class<T> cl)`

- Description: TODO

<a id="member-262"></a>
##### `rprev()`

- Description: TODO

<a id="member-263"></a>
##### `rnext()`

- Description: TODO

<a id="member-264"></a>
##### `Children()`

- Description: TODO

<a id="member-265"></a>
##### `size()`

- Description: TODO

<a id="member-266"></a>
##### `listIterator(int idx)`

- Description: TODO

<a id="member-267"></a>
##### `children()`

- Description: TODO

<a id="member-268"></a>
##### `children(final Class<T> cl)`

- Description: TODO

<a id="member-274"></a>
##### `PaginaTip(Indir<Resource> res, String title)`

- Description: TODO

<a id="member-275"></a>
##### `PaginaTip(Indir<Resource> res, boolean tiptitle)`

- Description: TODO

<a id="member-276"></a>
##### `PaginaTip(Indir<Resource> res)`

- Description: TODO

<a id="member-277"></a>
##### `get()`

- Description: TODO

<a id="member-283"></a>
##### `KeyboundTip(String base, boolean rich)`

- Description: TODO

<a id="member-284"></a>
##### `KeyboundTip(String base)`

- Description: TODO

<a id="member-285"></a>
##### `KeyboundTip()`

- Description: TODO

<a id="member-286"></a>
##### `get()`

- Description: TODO

<a id="member-287"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-288"></a>
##### `tooltip(TooltipQuery ev)`

- Description: TODO

<a id="member-289"></a>
##### `settip(String text, boolean rich)`

- Description: TODO

<a id="member-290"></a>
##### `settip(String text)`

- Description: TODO

<a id="member-291"></a>
##### `getparent(Class<T> cl)`

- Description: TODO

<a id="member-292"></a>
##### `hide()`

- Description: TODO

<a id="member-293"></a>
##### `show()`

- Description: TODO

<a id="member-294"></a>
##### `show(boolean show)`

- Description: TODO

<a id="member-295"></a>
##### `visible()`

- Description: TODO

<a id="member-296"></a>
##### `tvisible()`

- Description: TODO

<a id="member-299"></a>
##### `clearanims(Class<T> type)`

- Description: TODO

<a id="member-300"></a>
##### `Anim()`

- Description: TODO

<a id="member-301"></a>
##### `clear()`

- Description: TODO

<a id="member-302"></a>
##### `public abstract boolean tick(double dt);`

- Description: TODO

<a id="member-305"></a>
##### `NormAnim(double s)`

- Description: TODO

<a id="member-306"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-307"></a>
##### `public abstract void ntick(double a);`

- Description: TODO

<a id="member-309"></a>
##### `getChildOf(Class<T> c)`

- Description: TODO
