# UI

## Meta

- Source: [UI.java](../../../src/haven/UI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Coordinates the client UI event loop.

## Code Members

### Member Index

#### Fields

- [MOD_SHIFT](#member-1)
- [MOD_CTRL](#member-2)
- [MOD_META](#member-3)
- [MOD_SUPER](#member-4)
- [root](#member-5)
- [grabs](#member-6)
- [widgets](#member-7)
- [rwidgets](#member-8)
- [env](#member-9)
- [rcvr](#member-10)
- [mc](#member-11)
- [lcc](#member-12)
- [sess](#member-13)
- [modshift](#member-14)
- [modctrl](#member-15)
- [modmeta](#member-16)
- [modsuper](#member-17)
- [lasttip](#member-18)
- [lastevent](#member-19)
- [lasttick](#member-20)
- [mouseon](#member-21)
- [cons](#member-22)
- [afterdraws](#member-23)
- [uictx](#member-24)
- [gprefs](#member-25)
- [gprefsdirty](#member-26)
- [audio](#member-27)
- [loader](#member-28)
- [queue](#member-29)
- [scalef](#member-30)
- [back](#member-35)
- [mname](#member-45)
- [args](#member-46)
- [mname](#member-49)
- [args](#member-50)
- [nextid](#member-52)
- [id](#member-53)
- [deps](#member-54)
- [bars](#member-55)
- [next](#member-56)
- [wait](#member-57)
- [action](#member-58)
- [cmd](#member-63)
- [cmdjitter](#member-66)
- [cmddump](#member-67)
- [score](#member-68)
- [inflight](#member-69)
- [or_deps](#member-84)
- [or_bars](#member-85)
- [id](#member-87)
- [typenm](#member-88)
- [cargs](#member-89)
- [type](#member-90)
- [wdg](#member-93)
- [shadowchildren](#member-98)
- [shadowparents](#member-99)
- [id](#member-100)
- [parent](#member-101)
- [pargs](#member-102)
- [owner](#member-110)
- [etype](#member-111)
- [handler](#member-112)
- [wdg](#member-117)
- [wdg](#member-120)
- [bk](#member-121)
- [id](#member-131)
- [id](#member-137)
- [msg](#member-138)
- [args](#member-139)
- [nosfx](#member-153)
- [msg](#member-154)
- [color](#member-155)
- [sfx](#member-156)
- [color](#member-164)
- [sfx](#member-165)
- [sfx](#member-169)
- [msg](#member-173)
- [prevtt](#member-192)
- [lastmsgsfx](#member-201)
- [maxscale](#member-219)
- [uiscale](#member-221)

#### Methods

- [public void rcvmsg(int widget, String msg, Object... args);](#member-31)
- [public Runner run(UI ui) throws InterruptedException;](#member-32)
- [init(UI ui)](#member-33)
- [title()](#member-34)
- [Proxy(Runner back)](#member-36)
- [public Runner run(UI ui) throws InterruptedException](#member-37)
- [init(UI ui)](#member-38)
- [title()](#member-39)
- [void setmousepos(Coord c);](#member-40)
- [public void draw(GOut g);](#member-41)
- [setgprefs(GSettings prefs)](#member-42)
- [findcmds(Map<String, Command> map, Widget wdg)](#member-43)
- [findcmds()](#member-44)
- [UIException(String message, String mname, Object... args)](#member-47)
- [printStackTrace(java.io.PrintStream out)](#member-48)
- [UIWarning(String message, String mname, Object... args)](#member-51)
- [Command(Runnable action)](#member-59)
- [dep(int id, boolean bar)](#member-60)
- [fl(String id, Collection<?> l)](#member-61)
- [toString()](#member-62)
- [CommandException(Command cmd, Throwable cause)](#member-64)
- [getMessage()](#member-65)
- [CommandQueue()](#member-70)
- [run(Command cmd)](#member-71)
- [execute(Command cmd)](#member-72)
- [submit(Command cmd)](#member-73)
- [finish(Command cmd)](#member-74)
- [drain()](#member-75)
- [setreceiver(Receiver rcvr)](#member-76)
- [bind(Widget w, int id)](#member-77)
- [getwidget(int id)](#member-78)
- [widgetid(Widget wdg)](#member-79)
- [drawafter(AfterDraw ad)](#member-80)
- [tick()](#member-81)
- [gtick(Render out)](#member-82)
- [draw(GOut g)](#member-83)
- [submitcmd(Command cmd)](#member-86)
- [NewWidget(int id, Widget.Factory type, Object... cargs)](#member-91)
- [NewWidget(int id, String type, Object... cargs)](#member-92)
- [run()](#member-94)
- [toString()](#member-95)
- [newwidget(int id, Widget.Factory type, Object... cargs)](#member-96)
- [public void newwidget(int id, String type, Object... cargs) throws InterruptedException](#member-97)
- [AddWidget(int id, int parent, Object... pargs)](#member-103)
- [run()](#member-104)
- [toString()](#member-105)
- [addwidget(int id, int parent, Object... pargs)](#member-106)
- [wdgbarrier(Collection<Integer> deps, Collection<Integer> bars)](#member-107)
- [newwidgetp(int id, Widget.Factory type, int parent, Object[] pargs, Object... cargs)](#member-108)
- [public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException](#member-109)
- [Grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)](#member-113)
- [remove()](#member-114)
- [check(Event ev)](#member-115)
- [grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)](#member-116)
- [WidgetGrab(Widget wdg)](#member-118)
- [handle(Event ev)](#member-119)
- [PointerGrab(Widget wdg, EventHandler<? super E> bk)](#member-122)
- [handle(E ev)](#member-123)
- [grabmouse(Widget wdg)](#member-124)
- [grabkeys(Widget wdg)](#member-125)
- [removeid(Widget wdg)](#member-126)
- [removed(Widget wdg)](#member-127)
- [destroy(Widget wdg)](#member-128)
- [dispatch(Widget to, Event ev)](#member-129)
- [dispatchq(Widget to, E ev)](#member-130)
- [DstWidget(int id)](#member-132)
- [run()](#member-133)
- [toString()](#member-134)
- [destroy(int id)](#member-135)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-136)
- [UiMessage(int id, String msg, Object[] args)](#member-140)
- [run()](#member-141)
- [toString()](#member-142)
- [uimsg(int id, String msg, Object... args)](#member-143)
- [public String message();](#member-144)
- [color()](#member-145)
- [sfx()](#member-146)
- [handle(Widget w)](#member-147)
- [handler(Widget w)](#member-148)
- [msg(Notice msg)](#member-149)
- [msg(NoticeEvent ev)](#member-150)
- [FactMaker()](#member-151)
- [public Notice format(OwnerContext owner, Object... args);](#member-152)
- [SimpleMessage(String msg, Color color, Audio.Clip sfx)](#member-157)
- [SimpleMessage(String msg)](#member-158)
- [message()](#member-159)
- [color()](#member-160)
- [sfx()](#member-161)
- [defcolor()](#member-162)
- [defsfx()](#member-163)
- [ErrorMessage(String msg)](#member-166)
- [defcolor()](#member-167)
- [defsfx()](#member-168)
- [InfoMessage(String msg)](#member-170)
- [InfoMessage(String msg, Color color, Audio.Clip sfx)](#member-171)
- [defsfx()](#member-172)
- [NoticeEvent(Notice msg)](#member-174)
- [propagation(Widget from)](#member-175)
- [shandle(Widget w)](#member-176)
- [msg(Notice msg)](#member-177)
- [msg(String msg, Color color, Audio.Clip sfx)](#member-178)
- [error(String msg)](#member-179)
- [msg(String msg)](#member-180)
- [setmods(InputEvent ev)](#member-181)
- [c(Collection<Grab> g)](#member-182)
- [keydown(KeyEvent ev)](#member-183)
- [keyup(KeyEvent ev)](#member-184)
- [mousedown(MouseEvent ev, Coord c, int button)](#member-185)
- [mouseup(MouseEvent ev, Coord c, int button)](#member-186)
- [mousemove(MouseEvent ev, Coord c)](#member-187)
- [mousehover(Coord c)](#member-188)
- [setmousepos(Coord c)](#member-189)
- [mousewheel(MouseEvent ev, Coord c, int ia, double sa)](#member-190)
- [getcurs(Coord c)](#member-191)
- [tooltip(Coord c)](#member-193)
- [modflags(InputEvent ev)](#member-194)
- [modflags()](#member-195)
- [getenv()](#member-196)
- [destroy()](#member-197)
- [sfx(Audio.CS clip)](#member-198)
- [sfx(Audio.Clip clip)](#member-199)
- [sfx(Resource clip)](#member-200)
- [sfxrl(Audio.Clip clip)](#member-202)
- [pool()](#member-203)
- [scale(double v)](#member-204)
- [scale(float v)](#member-205)
- [scale(int v)](#member-206)
- [rscale(double v)](#member-207)
- [scale(Coord v)](#member-208)
- [scale(int x, int y)](#member-209)
- [rscale(double x, double y)](#member-210)
- [scale(Coord2d v)](#member-211)
- [scale(Font f, float size)](#member-212)
- [scale(T tex)](#member-213)
- [scale(ScaledTex<T> tex)](#member-214)
- [unscale(double v)](#member-215)
- [unscale(float v)](#member-216)
- [unscale(int v)](#member-217)
- [unscale(Coord v)](#member-218)
- [maxscale()](#member-220)
- [loadscale()](#member-222)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `MOD_SHIFT`

- Description: TODO

<a id="member-2"></a>
##### `MOD_CTRL`

- Description: TODO

<a id="member-3"></a>
##### `MOD_META`

- Description: TODO

<a id="member-4"></a>
##### `MOD_SUPER`

- Description: TODO

<a id="member-5"></a>
##### `root`

- Description: TODO

<a id="member-6"></a>
##### `grabs`

- Description: TODO

<a id="member-7"></a>
##### `widgets`

- Description: TODO

<a id="member-8"></a>
##### `rwidgets`

- Description: TODO

<a id="member-9"></a>
##### `env`

- Description: TODO

<a id="member-10"></a>
##### `rcvr`

- Description: TODO

<a id="member-11"></a>
##### `mc`

- Description: TODO

<a id="member-12"></a>
##### `lcc`

- Description: TODO

<a id="member-13"></a>
##### `sess`

- Description: TODO

<a id="member-14"></a>
##### `modshift`

- Description: TODO

<a id="member-15"></a>
##### `modctrl`

- Description: TODO

<a id="member-16"></a>
##### `modmeta`

- Description: TODO

<a id="member-17"></a>
##### `modsuper`

- Description: TODO

<a id="member-18"></a>
##### `lasttip`

- Description: TODO

<a id="member-19"></a>
##### `lastevent`

- Description: TODO

<a id="member-20"></a>
##### `lasttick`

- Description: TODO

<a id="member-21"></a>
##### `mouseon`

- Description: TODO

<a id="member-22"></a>
##### `cons`

- Description: TODO

<a id="member-23"></a>
##### `afterdraws`

- Description: TODO

<a id="member-24"></a>
##### `uictx`

- Description: TODO

<a id="member-25"></a>
##### `gprefs`

- Description: TODO

<a id="member-26"></a>
##### `gprefsdirty`

- Description: TODO

<a id="member-27"></a>
##### `audio`

- Description: TODO

<a id="member-28"></a>
##### `loader`

- Description: TODO

<a id="member-29"></a>
##### `queue`

- Description: TODO

<a id="member-30"></a>
##### `scalef`

- Description: TODO

<a id="member-35"></a>
##### `back`

- Description: TODO

<a id="member-45"></a>
##### `mname`

- Description: TODO

<a id="member-46"></a>
##### `args`

- Description: TODO

<a id="member-49"></a>
##### `mname`

- Description: TODO

<a id="member-50"></a>
##### `args`

- Description: TODO

<a id="member-52"></a>
##### `nextid`

- Description: TODO

<a id="member-53"></a>
##### `id`

- Description: TODO

<a id="member-54"></a>
##### `deps`

- Description: TODO

<a id="member-55"></a>
##### `bars`

- Description: TODO

<a id="member-56"></a>
##### `next`

- Description: TODO

<a id="member-57"></a>
##### `wait`

- Description: TODO

<a id="member-58"></a>
##### `action`

- Description: TODO

<a id="member-63"></a>
##### `cmd`

- Description: TODO

<a id="member-66"></a>
##### `cmdjitter`

- Description: TODO

<a id="member-67"></a>
##### `cmddump`

- Description: TODO

<a id="member-68"></a>
##### `score`

- Description: TODO

<a id="member-69"></a>
##### `inflight`

- Description: TODO

<a id="member-84"></a>
##### `or_deps`

- Description: TODO

<a id="member-85"></a>
##### `or_bars`

- Description: TODO

<a id="member-87"></a>
##### `id`

- Description: TODO

<a id="member-88"></a>
##### `typenm`

- Description: TODO

<a id="member-89"></a>
##### `cargs`

- Description: TODO

<a id="member-90"></a>
##### `type`

- Description: TODO

<a id="member-93"></a>
##### `wdg`

- Description: TODO

<a id="member-98"></a>
##### `shadowchildren`

- Description: TODO

<a id="member-99"></a>
##### `shadowparents`

- Description: TODO

<a id="member-100"></a>
##### `id`

- Description: TODO

<a id="member-101"></a>
##### `parent`

- Description: TODO

<a id="member-102"></a>
##### `pargs`

- Description: TODO

<a id="member-110"></a>
##### `owner`

- Description: TODO

<a id="member-111"></a>
##### `etype`

- Description: TODO

<a id="member-112"></a>
##### `handler`

- Description: TODO

<a id="member-117"></a>
##### `wdg`

- Description: TODO

<a id="member-120"></a>
##### `wdg`

- Description: TODO

<a id="member-121"></a>
##### `bk`

- Description: TODO

<a id="member-131"></a>
##### `id`

- Description: TODO

<a id="member-137"></a>
##### `id`

- Description: TODO

<a id="member-138"></a>
##### `msg`

- Description: TODO

<a id="member-139"></a>
##### `args`

- Description: TODO

<a id="member-153"></a>
##### `nosfx`

- Description: TODO

<a id="member-154"></a>
##### `msg`

- Description: TODO

<a id="member-155"></a>
##### `color`

- Description: TODO

<a id="member-156"></a>
##### `sfx`

- Description: TODO

<a id="member-164"></a>
##### `color`

- Description: TODO

<a id="member-165"></a>
##### `sfx`

- Description: TODO

<a id="member-169"></a>
##### `sfx`

- Description: TODO

<a id="member-173"></a>
##### `msg`

- Description: TODO

<a id="member-192"></a>
##### `prevtt`

- Description: TODO

<a id="member-201"></a>
##### `lastmsgsfx`

- Description: TODO

<a id="member-219"></a>
##### `maxscale`

- Description: TODO

<a id="member-221"></a>
##### `uiscale`

- Description: TODO

#### Methods

<a id="member-31"></a>
##### `public void rcvmsg(int widget, String msg, Object... args);`

- Description: TODO

<a id="member-32"></a>
##### `public Runner run(UI ui) throws InterruptedException;`

- Description: TODO

<a id="member-33"></a>
##### `init(UI ui)`

- Description: TODO

<a id="member-34"></a>
##### `title()`

- Description: TODO

<a id="member-36"></a>
##### `Proxy(Runner back)`

- Description: TODO

<a id="member-37"></a>
##### `public Runner run(UI ui) throws InterruptedException`

- Description: TODO

<a id="member-38"></a>
##### `init(UI ui)`

- Description: TODO

<a id="member-39"></a>
##### `title()`

- Description: TODO

<a id="member-40"></a>
##### `void setmousepos(Coord c);`

- Description: TODO

<a id="member-41"></a>
##### `public void draw(GOut g);`

- Description: TODO

<a id="member-42"></a>
##### `setgprefs(GSettings prefs)`

- Description: TODO

<a id="member-43"></a>
##### `findcmds(Map<String, Command> map, Widget wdg)`

- Description: TODO

<a id="member-44"></a>
##### `findcmds()`

- Description: TODO

<a id="member-47"></a>
##### `UIException(String message, String mname, Object... args)`

- Description: TODO

<a id="member-48"></a>
##### `printStackTrace(java.io.PrintStream out)`

- Description: TODO

<a id="member-51"></a>
##### `UIWarning(String message, String mname, Object... args)`

- Description: TODO

<a id="member-59"></a>
##### `Command(Runnable action)`

- Description: TODO

<a id="member-60"></a>
##### `dep(int id, boolean bar)`

- Description: TODO

<a id="member-61"></a>
##### `fl(String id, Collection<?> l)`

- Description: TODO

<a id="member-62"></a>
##### `toString()`

- Description: TODO

<a id="member-64"></a>
##### `CommandException(Command cmd, Throwable cause)`

- Description: TODO

<a id="member-65"></a>
##### `getMessage()`

- Description: TODO

<a id="member-70"></a>
##### `CommandQueue()`

- Description: TODO

<a id="member-71"></a>
##### `run(Command cmd)`

- Description: TODO

<a id="member-72"></a>
##### `execute(Command cmd)`

- Description: TODO

<a id="member-73"></a>
##### `submit(Command cmd)`

- Description: TODO

<a id="member-74"></a>
##### `finish(Command cmd)`

- Description: TODO

<a id="member-75"></a>
##### `drain()`

- Description: TODO

<a id="member-76"></a>
##### `setreceiver(Receiver rcvr)`

- Description: TODO

<a id="member-77"></a>
##### `bind(Widget w, int id)`

- Description: TODO

<a id="member-78"></a>
##### `getwidget(int id)`

- Description: TODO

<a id="member-79"></a>
##### `widgetid(Widget wdg)`

- Description: TODO

<a id="member-80"></a>
##### `drawafter(AfterDraw ad)`

- Description: TODO

<a id="member-81"></a>
##### `tick()`

- Description: TODO

<a id="member-82"></a>
##### `gtick(Render out)`

- Description: TODO

<a id="member-83"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-86"></a>
##### `submitcmd(Command cmd)`

- Description: TODO

<a id="member-91"></a>
##### `NewWidget(int id, Widget.Factory type, Object... cargs)`

- Description: TODO

<a id="member-92"></a>
##### `NewWidget(int id, String type, Object... cargs)`

- Description: TODO

<a id="member-94"></a>
##### `run()`

- Description: TODO

<a id="member-95"></a>
##### `toString()`

- Description: TODO

<a id="member-96"></a>
##### `newwidget(int id, Widget.Factory type, Object... cargs)`

- Description: TODO

<a id="member-97"></a>
##### `public void newwidget(int id, String type, Object... cargs) throws InterruptedException`

- Description: TODO

<a id="member-103"></a>
##### `AddWidget(int id, int parent, Object... pargs)`

- Description: TODO

<a id="member-104"></a>
##### `run()`

- Description: TODO

<a id="member-105"></a>
##### `toString()`

- Description: TODO

<a id="member-106"></a>
##### `addwidget(int id, int parent, Object... pargs)`

- Description: TODO

<a id="member-107"></a>
##### `wdgbarrier(Collection<Integer> deps, Collection<Integer> bars)`

- Description: TODO

<a id="member-108"></a>
##### `newwidgetp(int id, Widget.Factory type, int parent, Object[] pargs, Object... cargs)`

- Description: TODO

<a id="member-109"></a>
##### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`

- Description: TODO

<a id="member-113"></a>
##### `Grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`

- Description: TODO

<a id="member-114"></a>
##### `remove()`

- Description: TODO

<a id="member-115"></a>
##### `check(Event ev)`

- Description: TODO

<a id="member-116"></a>
##### `grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`

- Description: TODO

<a id="member-118"></a>
##### `WidgetGrab(Widget wdg)`

- Description: TODO

<a id="member-119"></a>
##### `handle(Event ev)`

- Description: TODO

<a id="member-122"></a>
##### `PointerGrab(Widget wdg, EventHandler<? super E> bk)`

- Description: TODO

<a id="member-123"></a>
##### `handle(E ev)`

- Description: TODO

<a id="member-124"></a>
##### `grabmouse(Widget wdg)`

- Description: TODO

<a id="member-125"></a>
##### `grabkeys(Widget wdg)`

- Description: TODO

<a id="member-126"></a>
##### `removeid(Widget wdg)`

- Description: TODO

<a id="member-127"></a>
##### `removed(Widget wdg)`

- Description: TODO

<a id="member-128"></a>
##### `destroy(Widget wdg)`

- Description: TODO

<a id="member-129"></a>
##### `dispatch(Widget to, Event ev)`

- Description: TODO

<a id="member-130"></a>
##### `dispatchq(Widget to, E ev)`

- Description: TODO

<a id="member-132"></a>
##### `DstWidget(int id)`

- Description: TODO

<a id="member-133"></a>
##### `run()`

- Description: TODO

<a id="member-134"></a>
##### `toString()`

- Description: TODO

<a id="member-135"></a>
##### `destroy(int id)`

- Description: TODO

<a id="member-136"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-140"></a>
##### `UiMessage(int id, String msg, Object[] args)`

- Description: TODO

<a id="member-141"></a>
##### `run()`

- Description: TODO

<a id="member-142"></a>
##### `toString()`

- Description: TODO

<a id="member-143"></a>
##### `uimsg(int id, String msg, Object... args)`

- Description: TODO

<a id="member-144"></a>
##### `public String message();`

- Description: TODO

<a id="member-145"></a>
##### `color()`

- Description: TODO

<a id="member-146"></a>
##### `sfx()`

- Description: TODO

<a id="member-147"></a>
##### `handle(Widget w)`

- Description: TODO

<a id="member-148"></a>
##### `handler(Widget w)`

- Description: TODO

<a id="member-149"></a>
##### `msg(Notice msg)`

- Description: TODO

<a id="member-150"></a>
##### `msg(NoticeEvent ev)`

- Description: TODO

<a id="member-151"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-152"></a>
##### `public Notice format(OwnerContext owner, Object... args);`

- Description: TODO

<a id="member-157"></a>
##### `SimpleMessage(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

<a id="member-158"></a>
##### `SimpleMessage(String msg)`

- Description: TODO

<a id="member-159"></a>
##### `message()`

- Description: TODO

<a id="member-160"></a>
##### `color()`

- Description: TODO

<a id="member-161"></a>
##### `sfx()`

- Description: TODO

<a id="member-162"></a>
##### `defcolor()`

- Description: TODO

<a id="member-163"></a>
##### `defsfx()`

- Description: TODO

<a id="member-166"></a>
##### `ErrorMessage(String msg)`

- Description: TODO

<a id="member-167"></a>
##### `defcolor()`

- Description: TODO

<a id="member-168"></a>
##### `defsfx()`

- Description: TODO

<a id="member-170"></a>
##### `InfoMessage(String msg)`

- Description: TODO

<a id="member-171"></a>
##### `InfoMessage(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

<a id="member-172"></a>
##### `defsfx()`

- Description: TODO

<a id="member-174"></a>
##### `NoticeEvent(Notice msg)`

- Description: TODO

<a id="member-175"></a>
##### `propagation(Widget from)`

- Description: TODO

<a id="member-176"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-177"></a>
##### `msg(Notice msg)`

- Description: TODO

<a id="member-178"></a>
##### `msg(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

<a id="member-179"></a>
##### `error(String msg)`

- Description: TODO

<a id="member-180"></a>
##### `msg(String msg)`

- Description: TODO

<a id="member-181"></a>
##### `setmods(InputEvent ev)`

- Description: TODO

<a id="member-182"></a>
##### `c(Collection<Grab> g)`

- Description: TODO

<a id="member-183"></a>
##### `keydown(KeyEvent ev)`

- Description: TODO

<a id="member-184"></a>
##### `keyup(KeyEvent ev)`

- Description: TODO

<a id="member-185"></a>
##### `mousedown(MouseEvent ev, Coord c, int button)`

- Description: TODO

<a id="member-186"></a>
##### `mouseup(MouseEvent ev, Coord c, int button)`

- Description: TODO

<a id="member-187"></a>
##### `mousemove(MouseEvent ev, Coord c)`

- Description: TODO

<a id="member-188"></a>
##### `mousehover(Coord c)`

- Description: TODO

<a id="member-189"></a>
##### `setmousepos(Coord c)`

- Description: TODO

<a id="member-190"></a>
##### `mousewheel(MouseEvent ev, Coord c, int ia, double sa)`

- Description: TODO

<a id="member-191"></a>
##### `getcurs(Coord c)`

- Description: TODO

<a id="member-193"></a>
##### `tooltip(Coord c)`

- Description: TODO

<a id="member-194"></a>
##### `modflags(InputEvent ev)`

- Description: TODO

<a id="member-195"></a>
##### `modflags()`

- Description: TODO

<a id="member-196"></a>
##### `getenv()`

- Description: TODO

<a id="member-197"></a>
##### `destroy()`

- Description: TODO

<a id="member-198"></a>
##### `sfx(Audio.CS clip)`

- Description: TODO

<a id="member-199"></a>
##### `sfx(Audio.Clip clip)`

- Description: TODO

<a id="member-200"></a>
##### `sfx(Resource clip)`

- Description: TODO

<a id="member-202"></a>
##### `sfxrl(Audio.Clip clip)`

- Description: TODO

<a id="member-203"></a>
##### `pool()`

- Description: TODO

<a id="member-204"></a>
##### `scale(double v)`

- Description: TODO

<a id="member-205"></a>
##### `scale(float v)`

- Description: TODO

<a id="member-206"></a>
##### `scale(int v)`

- Description: TODO

<a id="member-207"></a>
##### `rscale(double v)`

- Description: TODO

<a id="member-208"></a>
##### `scale(Coord v)`

- Description: TODO

<a id="member-209"></a>
##### `scale(int x, int y)`

- Description: TODO

<a id="member-210"></a>
##### `rscale(double x, double y)`

- Description: TODO

<a id="member-211"></a>
##### `scale(Coord2d v)`

- Description: TODO

<a id="member-212"></a>
##### `scale(Font f, float size)`

- Description: TODO

<a id="member-213"></a>
##### `scale(T tex)`

- Description: TODO

<a id="member-214"></a>
##### `scale(ScaledTex<T> tex)`

- Description: TODO

<a id="member-215"></a>
##### `unscale(double v)`

- Description: TODO

<a id="member-216"></a>
##### `unscale(float v)`

- Description: TODO

<a id="member-217"></a>
##### `unscale(int v)`

- Description: TODO

<a id="member-218"></a>
##### `unscale(Coord v)`

- Description: TODO

<a id="member-220"></a>
##### `maxscale()`

- Description: TODO

<a id="member-222"></a>
##### `loadscale()`

- Description: TODO
