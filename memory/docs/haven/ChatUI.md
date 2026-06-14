# ChatUI

## Meta

- Source: [ChatUI.java](../../../src/haven/ChatUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles in-game chat UI composition.

## Code Members

### Member Index

#### Constants

- [HYPERLINK](#member-15)

#### Fields

- [fnd](#member-1)
- [qfnd](#member-2)
- [selw](#member-3)
- [marg](#member-4)
- [urgcols](#member-5)
- [sel](#member-6)
- [urgency](#member-7)
- [chansel](#member-8)
- [base](#member-9)
- [qline](#member-10)
- [notifs](#member-11)
- [qgrab](#member-12)
- [urlpat](#member-16)
- [urlstyle](#member-17)
- [rmsgs](#member-20)
- [urgency](#member-21)
- [sb](#member-22)
- [cb](#member-23)
- [dy](#member-24)
- [time](#member-25)
- [soldest](#member-31)
- [snewest](#member-32)
- [msg](#member-33)
- [idx](#member-34)
- [data](#member-35)
- [text](#member-36)
- [snext](#member-37)
- [sprev](#member-38)
- [lseen](#member-39)
- [w](#member-40)
- [y](#member-41)
- [sz](#member-47)
- [text](#member-54)
- [col](#member-55)
- [rm](#member-72)
- [pn](#member-73)
- [part](#member-74)
- [ch](#member-75)
- [poscmp](#member-80)
- [selorig](#member-82)
- [lasthit](#member-83)
- [selstart](#member-84)
- [selend](#member-85)
- [grab](#member-86)
- [dragging](#member-87)
- [iconres](#member-102)
- [name](#member-105)
- [in](#member-108)
- [history](#member-109)
- [hpos](#member-110)
- [hcurrent](#member-111)
- [name](#member-116)
- [urgency](#member-120)
- [name](#member-121)
- [pc](#member-122)
- [muted](#member-123)
- [mutewait](#member-124)
- [from](#member-125)
- [text](#member-126)
- [col](#member-127)
- [w](#member-129)
- [nm](#member-130)
- [colseq](#member-140)
- [other](#member-147)
- [muted](#member-148)
- [chandiv](#member-164)
- [chanseld](#member-165)
- [ctex](#member-166)
- [tf](#member-167)
- [uc](#member-168)
- [chls](#member-169)
- [iconsz](#member-170)
- [ellw](#member-171)
- [maxnmw](#member-172)
- [offset](#member-173)
- [ts](#member-174)
- [ds](#member-175)
- [cstart](#member-176)
- [chan](#member-181)
- [rname](#member-182)
- [ricon](#member-183)
- [urgency](#member-184)
- [icon](#member-185)
- [chan](#member-205)
- [msg](#member-206)
- [chnm](#member-207)
- [rmsg](#member-208)
- [time](#member-209)
- [rqline](#member-211)
- [rqpre](#member-212)
- [bulc](#member-214)
- [burc](#member-215)
- [bhb](#member-216)
- [bvlb](#member-217)
- [bvrb](#member-218)
- [bmf](#member-219)
- [bcbd](#member-220)
- [notifsfx](#member-222)
- [oy](#member-224)
- [ny](#member-225)
- [targetshow](#member-230)
- [buf](#member-238)
- [chan](#member-239)
- [dm](#member-244)
- [doff](#member-245)
- [minh](#member-246)
- [kb_quick](#member-251)

#### Methods

- [added()](#member-13)
- [ChatAttribute(String name)](#member-14)
- [ChatParser(Object... args)](#member-18)
- [protected RichText.Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException](#member-19)
- [public abstract Indir<Text> render(int w);](#member-26)
- [valid(Indir<Text> prev)](#member-27)
- [mousedown(Channel chan, CharPos pos, Coord c, int btn)](#member-28)
- [mouseup(Channel chan, CharPos pos, Coord c, int btn)](#member-29)
- [clicked(Channel chan, CharPos pos, Coord c, int btn)](#member-30)
- [RenderedMessage(Message msg, int idx, int iw)](#member-42)
- [data()](#member-43)
- [slink()](#member-44)
- [sunlink()](#member-45)
- [text()](#member-46)
- [h()](#member-48)
- [clear()](#member-49)
- [invalidate()](#member-50)
- [resize(int w)](#member-51)
- [update()](#member-52)
- [trimunseen()](#member-53)
- [SimpleMessage(String text, Color col)](#member-56)
- [render(int w)](#member-57)
- [Channel(boolean closable)](#member-58)
- [append(Message msg, int urgency)](#member-59)
- [append(Message msg)](#member-60)
- [append(String line, Color col)](#member-61)
- [iw()](#member-62)
- [ih()](#member-63)
- [updurgency(int urg)](#member-64)
- [messageat(int y, boolean nearest)](#member-65)
- [messageat(Coord c, Coord hc)](#member-66)
- [updyseq(int mi)](#member-67)
- [draw(GOut g)](#member-68)
- [tick(double dt)](#member-69)
- [mousewheel(MouseWheelEvent ev)](#member-70)
- [resize(Coord sz)](#member-71)
- [CharPos(RenderedMessage rm, RichText.TextPart part, TextHitInfo ch)](#member-76)
- [partnum(RichText text, RichText.TextPart part)](#member-77)
- [equals(Object oo)](#member-78)
- [toString()](#member-79)
- [charat(Coord c)](#member-81)
- [mousedown(MouseDownEvent ev)](#member-88)
- [mousemove(MouseMoveEvent ev)](#member-89)
- [mouseup(MouseUpEvent ev)](#member-90)
- [selected(CharPos start, CharPos end)](#member-91)
- [clicked(CharPos pos, int btn)](#member-92)
- [select()](#member-93)
- [display()](#member-94)
- [drawsel(GOut g, RenderedMessage rm, int y)](#member-95)
- [uimsg(String name, Object... args)](#member-96)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-97)
- [public abstract String name();](#member-98)
- [selmousedown(Coord c, int btn)](#member-99)
- [selmouseup(Coord c, int btn)](#member-100)
- [selclicked(Coord c, int btn)](#member-101)
- [icon(Indir<Resource> res)](#member-103)
- [icon()](#member-104)
- [Log(String name)](#member-106)
- [name()](#member-107)
- [EntryChannel(boolean closable)](#member-112)
- [ih()](#member-113)
- [resize(Coord sz)](#member-114)
- [send(String text)](#member-115)
- [SimpleChat(boolean closable, String name)](#member-117)
- [uimsg(String msg, Object... args)](#member-118)
- [name()](#member-119)
- [NamedMessage(int from, String text, Color col)](#member-128)
- [Rendered(int w, String nm)](#member-131)
- [get()](#member-132)
- [nm()](#member-133)
- [render(int w)](#member-134)
- [valid(Indir<Text> data)](#member-135)
- [clicked(Channel chan, CharPos pos, Coord c, int btn)](#member-136)
- [mutemenu(int pl, boolean cur)](#member-137)
- [MyMessage(String text)](#member-138)
- [MultiChat(boolean closable, String name, int urgency)](#member-139)
- [nextcol()](#member-141)
- [fromcolor(int from)](#member-142)
- [uimsg(String msg, Object... args)](#member-143)
- [name()](#member-144)
- [PartyChat()](#member-145)
- [uimsg(String msg, Object... args)](#member-146)
- [PrivChat(boolean closable, int other)](#member-149)
- [menu()](#member-150)
- [selclicked(Coord c, int btn)](#member-151)
- [InMessage(String text)](#member-152)
- [clicked(Channel chan, CharPos pos, Coord c, int btn)](#member-153)
- [OutMessage(String text)](#member-154)
- [uimsg(String msg, Object... args)](#member-155)
- [name()](#member-156)
- [create(UI ui, Object[] args)](#member-157)
- [create(UI ui, Object[] args)](#member-158)
- [create(UI ui, Object[] args)](#member-159)
- [create(UI ui, Object[] args)](#member-160)
- [addchild(Widget child, Object... args)](#member-161)
- [add(T w)](#member-162)
- [cdestroy(Widget w)](#member-163)
- [namedeco(String name, BufferedImage img, Color col)](#member-177)
- [nmrender(String name, Color col)](#member-178)
- [chidx(Channel chan)](#member-179)
- [resize(Coord sz)](#member-180)
- [DarkChannel(Channel chan)](#member-186)
- [rname()](#member-187)
- [ricon()](#member-188)
- [Selector(Coord sz)](#member-189)
- [add(Channel chan)](#member-190)
- [rm(Channel chan)](#member-191)
- [draw(GOut g)](#member-192)
- [tick(double dt)](#member-193)
- [show(int si)](#member-194)
- [show(Channel chan)](#member-195)
- [up()](#member-196)
- [down()](#member-197)
- [bypos(Coord c)](#member-198)
- [mousedown(MouseDownEvent ev)](#member-199)
- [mouseup(MouseUpEvent ev)](#member-200)
- [clips(int s)](#member-201)
- [mousewheel(MouseWheelEvent ev)](#member-202)
- [select(Channel chan, boolean focus)](#member-203)
- [select(Channel chan)](#member-204)
- [Notification(Channel chan, Channel.Message msg)](#member-210)
- [drawsmall(GOut g, Coord br, int h)](#member-213)
- [draw(GOut g)](#member-221)
- [notify(Channel chan, Channel.Message msg, int urgency)](#member-223)
- [Spring(int ny)](#member-226)
- [ntick(double a)](#member-227)
- [resize(Coord sz)](#member-228)
- [presize()](#member-229)
- [sshow(boolean show)](#member-231)
- [hresize(int h)](#member-232)
- [resize(int w)](#member-233)
- [move(Coord base)](#member-234)
- [expand()](#member-235)
- [show()](#member-236)
- [hide()](#member-237)
- [QuickLine(EntryChannel chan)](#member-240)
- [cancel()](#member-241)
- [done(ReadLine buf)](#member-242)
- [key(KbdEvent ev)](#member-243)
- [mousedown(MouseDownEvent ev)](#member-247)
- [mousemove(MouseMoveEvent ev)](#member-248)
- [mouseup(MouseUpEvent ev)](#member-249)
- [keydown(KeyDownEvent ev)](#member-250)
- [globtype(GlobKeyEvent ev)](#member-252)

### Member Reference

#### Constants

<a id="member-15"></a>
##### `HYPERLINK`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `fnd`

- Description: TODO

<a id="member-2"></a>
##### `qfnd`

- Description: TODO

<a id="member-3"></a>
##### `selw`

- Description: TODO

<a id="member-4"></a>
##### `marg`

- Description: TODO

<a id="member-5"></a>
##### `urgcols`

- Description: TODO

<a id="member-6"></a>
##### `sel`

- Description: TODO

<a id="member-7"></a>
##### `urgency`

- Description: TODO

<a id="member-8"></a>
##### `chansel`

- Description: TODO

<a id="member-9"></a>
##### `base`

- Description: TODO

<a id="member-10"></a>
##### `qline`

- Description: TODO

<a id="member-11"></a>
##### `notifs`

- Description: TODO

<a id="member-12"></a>
##### `qgrab`

- Description: TODO

<a id="member-16"></a>
##### `urlpat`

- Description: TODO

<a id="member-17"></a>
##### `urlstyle`

- Description: TODO

<a id="member-20"></a>
##### `rmsgs`

- Description: TODO

<a id="member-21"></a>
##### `urgency`

- Description: TODO

<a id="member-22"></a>
##### `sb`

- Description: TODO

<a id="member-23"></a>
##### `cb`

- Description: TODO

<a id="member-24"></a>
##### `dy`

- Description: TODO

<a id="member-25"></a>
##### `time`

- Description: TODO

<a id="member-31"></a>
##### `soldest`

- Description: TODO

<a id="member-32"></a>
##### `snewest`

- Description: TODO

<a id="member-33"></a>
##### `msg`

- Description: TODO

<a id="member-34"></a>
##### `idx`

- Description: TODO

<a id="member-35"></a>
##### `data`

- Description: TODO

<a id="member-36"></a>
##### `text`

- Description: TODO

<a id="member-37"></a>
##### `snext`

- Description: TODO

<a id="member-38"></a>
##### `sprev`

- Description: TODO

<a id="member-39"></a>
##### `lseen`

- Description: TODO

<a id="member-40"></a>
##### `w`

- Description: TODO

<a id="member-41"></a>
##### `y`

- Description: TODO

<a id="member-47"></a>
##### `sz`

- Description: TODO

<a id="member-54"></a>
##### `text`

- Description: TODO

<a id="member-55"></a>
##### `col`

- Description: TODO

<a id="member-72"></a>
##### `rm`

- Description: TODO

<a id="member-73"></a>
##### `pn`

- Description: TODO

<a id="member-74"></a>
##### `part`

- Description: TODO

<a id="member-75"></a>
##### `ch`

- Description: TODO

<a id="member-80"></a>
##### `poscmp`

- Description: TODO

<a id="member-82"></a>
##### `selorig`

- Description: TODO

<a id="member-83"></a>
##### `lasthit`

- Description: TODO

<a id="member-84"></a>
##### `selstart`

- Description: TODO

<a id="member-85"></a>
##### `selend`

- Description: TODO

<a id="member-86"></a>
##### `grab`

- Description: TODO

<a id="member-87"></a>
##### `dragging`

- Description: TODO

<a id="member-102"></a>
##### `iconres`

- Description: TODO

<a id="member-105"></a>
##### `name`

- Description: TODO

<a id="member-108"></a>
##### `in`

- Description: TODO

<a id="member-109"></a>
##### `history`

- Description: TODO

<a id="member-110"></a>
##### `hpos`

- Description: TODO

<a id="member-111"></a>
##### `hcurrent`

- Description: TODO

<a id="member-116"></a>
##### `name`

- Description: TODO

<a id="member-120"></a>
##### `urgency`

- Description: TODO

<a id="member-121"></a>
##### `name`

- Description: TODO

<a id="member-122"></a>
##### `pc`

- Description: TODO

<a id="member-123"></a>
##### `muted`

- Description: TODO

<a id="member-124"></a>
##### `mutewait`

- Description: TODO

<a id="member-125"></a>
##### `from`

- Description: TODO

<a id="member-126"></a>
##### `text`

- Description: TODO

<a id="member-127"></a>
##### `col`

- Description: TODO

<a id="member-129"></a>
##### `w`

- Description: TODO

<a id="member-130"></a>
##### `nm`

- Description: TODO

<a id="member-140"></a>
##### `colseq`

- Description: TODO

<a id="member-147"></a>
##### `other`

- Description: TODO

<a id="member-148"></a>
##### `muted`

- Description: TODO

<a id="member-164"></a>
##### `chandiv`

- Description: TODO

<a id="member-165"></a>
##### `chanseld`

- Description: TODO

<a id="member-166"></a>
##### `ctex`

- Description: TODO

<a id="member-167"></a>
##### `tf`

- Description: TODO

<a id="member-168"></a>
##### `uc`

- Description: TODO

<a id="member-169"></a>
##### `chls`

- Description: TODO

<a id="member-170"></a>
##### `iconsz`

- Description: TODO

<a id="member-171"></a>
##### `ellw`

- Description: TODO

<a id="member-172"></a>
##### `maxnmw`

- Description: TODO

<a id="member-173"></a>
##### `offset`

- Description: TODO

<a id="member-174"></a>
##### `ts`

- Description: TODO

<a id="member-175"></a>
##### `ds`

- Description: TODO

<a id="member-176"></a>
##### `cstart`

- Description: TODO

<a id="member-181"></a>
##### `chan`

- Description: TODO

<a id="member-182"></a>
##### `rname`

- Description: TODO

<a id="member-183"></a>
##### `ricon`

- Description: TODO

<a id="member-184"></a>
##### `urgency`

- Description: TODO

<a id="member-185"></a>
##### `icon`

- Description: TODO

<a id="member-205"></a>
##### `chan`

- Description: TODO

<a id="member-206"></a>
##### `msg`

- Description: TODO

<a id="member-207"></a>
##### `chnm`

- Description: TODO

<a id="member-208"></a>
##### `rmsg`

- Description: TODO

<a id="member-209"></a>
##### `time`

- Description: TODO

<a id="member-211"></a>
##### `rqline`

- Description: TODO

<a id="member-212"></a>
##### `rqpre`

- Description: TODO

<a id="member-214"></a>
##### `bulc`

- Description: TODO

<a id="member-215"></a>
##### `burc`

- Description: TODO

<a id="member-216"></a>
##### `bhb`

- Description: TODO

<a id="member-217"></a>
##### `bvlb`

- Description: TODO

<a id="member-218"></a>
##### `bvrb`

- Description: TODO

<a id="member-219"></a>
##### `bmf`

- Description: TODO

<a id="member-220"></a>
##### `bcbd`

- Description: TODO

<a id="member-222"></a>
##### `notifsfx`

- Description: TODO

<a id="member-224"></a>
##### `oy`

- Description: TODO

<a id="member-225"></a>
##### `ny`

- Description: TODO

<a id="member-230"></a>
##### `targetshow`

- Description: TODO

<a id="member-238"></a>
##### `buf`

- Description: TODO

<a id="member-239"></a>
##### `chan`

- Description: TODO

<a id="member-244"></a>
##### `dm`

- Description: TODO

<a id="member-245"></a>
##### `doff`

- Description: TODO

<a id="member-246"></a>
##### `minh`

- Description: TODO

<a id="member-251"></a>
##### `kb_quick`

- Description: TODO

#### Methods

<a id="member-13"></a>
##### `added()`

- Description: TODO

<a id="member-14"></a>
##### `ChatAttribute(String name)`

- Description: TODO

<a id="member-18"></a>
##### `ChatParser(Object... args)`

- Description: TODO

<a id="member-19"></a>
##### `protected RichText.Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-26"></a>
##### `public abstract Indir<Text> render(int w);`

- Description: TODO

<a id="member-27"></a>
##### `valid(Indir<Text> prev)`

- Description: TODO

<a id="member-28"></a>
##### `mousedown(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

<a id="member-29"></a>
##### `mouseup(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

<a id="member-30"></a>
##### `clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

<a id="member-42"></a>
##### `RenderedMessage(Message msg, int idx, int iw)`

- Description: TODO

<a id="member-43"></a>
##### `data()`

- Description: TODO

<a id="member-44"></a>
##### `slink()`

- Description: TODO

<a id="member-45"></a>
##### `sunlink()`

- Description: TODO

<a id="member-46"></a>
##### `text()`

- Description: TODO

<a id="member-48"></a>
##### `h()`

- Description: TODO

<a id="member-49"></a>
##### `clear()`

- Description: TODO

<a id="member-50"></a>
##### `invalidate()`

- Description: TODO

<a id="member-51"></a>
##### `resize(int w)`

- Description: TODO

<a id="member-52"></a>
##### `update()`

- Description: TODO

<a id="member-53"></a>
##### `trimunseen()`

- Description: TODO

<a id="member-56"></a>
##### `SimpleMessage(String text, Color col)`

- Description: TODO

<a id="member-57"></a>
##### `render(int w)`

- Description: TODO

<a id="member-58"></a>
##### `Channel(boolean closable)`

- Description: TODO

<a id="member-59"></a>
##### `append(Message msg, int urgency)`

- Description: TODO

<a id="member-60"></a>
##### `append(Message msg)`

- Description: TODO

<a id="member-61"></a>
##### `append(String line, Color col)`

- Description: TODO

<a id="member-62"></a>
##### `iw()`

- Description: TODO

<a id="member-63"></a>
##### `ih()`

- Description: TODO

<a id="member-64"></a>
##### `updurgency(int urg)`

- Description: TODO

<a id="member-65"></a>
##### `messageat(int y, boolean nearest)`

- Description: TODO

<a id="member-66"></a>
##### `messageat(Coord c, Coord hc)`

- Description: TODO

<a id="member-67"></a>
##### `updyseq(int mi)`

- Description: TODO

<a id="member-68"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-69"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-70"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-71"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-76"></a>
##### `CharPos(RenderedMessage rm, RichText.TextPart part, TextHitInfo ch)`

- Description: TODO

<a id="member-77"></a>
##### `partnum(RichText text, RichText.TextPart part)`

- Description: TODO

<a id="member-78"></a>
##### `equals(Object oo)`

- Description: TODO

<a id="member-79"></a>
##### `toString()`

- Description: TODO

<a id="member-81"></a>
##### `charat(Coord c)`

- Description: TODO

<a id="member-88"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-89"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-90"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-91"></a>
##### `selected(CharPos start, CharPos end)`

- Description: TODO

<a id="member-92"></a>
##### `clicked(CharPos pos, int btn)`

- Description: TODO

<a id="member-93"></a>
##### `select()`

- Description: TODO

<a id="member-94"></a>
##### `display()`

- Description: TODO

<a id="member-95"></a>
##### `drawsel(GOut g, RenderedMessage rm, int y)`

- Description: TODO

<a id="member-96"></a>
##### `uimsg(String name, Object... args)`

- Description: TODO

<a id="member-97"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-98"></a>
##### `public abstract String name();`

- Description: TODO

<a id="member-99"></a>
##### `selmousedown(Coord c, int btn)`

- Description: TODO

<a id="member-100"></a>
##### `selmouseup(Coord c, int btn)`

- Description: TODO

<a id="member-101"></a>
##### `selclicked(Coord c, int btn)`

- Description: TODO

<a id="member-103"></a>
##### `icon(Indir<Resource> res)`

- Description: TODO

<a id="member-104"></a>
##### `icon()`

- Description: TODO

<a id="member-106"></a>
##### `Log(String name)`

- Description: TODO

<a id="member-107"></a>
##### `name()`

- Description: TODO

<a id="member-112"></a>
##### `EntryChannel(boolean closable)`

- Description: TODO

<a id="member-113"></a>
##### `ih()`

- Description: TODO

<a id="member-114"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-115"></a>
##### `send(String text)`

- Description: TODO

<a id="member-117"></a>
##### `SimpleChat(boolean closable, String name)`

- Description: TODO

<a id="member-118"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-119"></a>
##### `name()`

- Description: TODO

<a id="member-128"></a>
##### `NamedMessage(int from, String text, Color col)`

- Description: TODO

<a id="member-131"></a>
##### `Rendered(int w, String nm)`

- Description: TODO

<a id="member-132"></a>
##### `get()`

- Description: TODO

<a id="member-133"></a>
##### `nm()`

- Description: TODO

<a id="member-134"></a>
##### `render(int w)`

- Description: TODO

<a id="member-135"></a>
##### `valid(Indir<Text> data)`

- Description: TODO

<a id="member-136"></a>
##### `clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

<a id="member-137"></a>
##### `mutemenu(int pl, boolean cur)`

- Description: TODO

<a id="member-138"></a>
##### `MyMessage(String text)`

- Description: TODO

<a id="member-139"></a>
##### `MultiChat(boolean closable, String name, int urgency)`

- Description: TODO

<a id="member-141"></a>
##### `nextcol()`

- Description: TODO

<a id="member-142"></a>
##### `fromcolor(int from)`

- Description: TODO

<a id="member-143"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-144"></a>
##### `name()`

- Description: TODO

<a id="member-145"></a>
##### `PartyChat()`

- Description: TODO

<a id="member-146"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-149"></a>
##### `PrivChat(boolean closable, int other)`

- Description: TODO

<a id="member-150"></a>
##### `menu()`

- Description: TODO

<a id="member-151"></a>
##### `selclicked(Coord c, int btn)`

- Description: TODO

<a id="member-152"></a>
##### `InMessage(String text)`

- Description: TODO

<a id="member-153"></a>
##### `clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

<a id="member-154"></a>
##### `OutMessage(String text)`

- Description: TODO

<a id="member-155"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-156"></a>
##### `name()`

- Description: TODO

<a id="member-157"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-158"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-159"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-160"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-161"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-162"></a>
##### `add(T w)`

- Description: TODO

<a id="member-163"></a>
##### `cdestroy(Widget w)`

- Description: TODO

<a id="member-177"></a>
##### `namedeco(String name, BufferedImage img, Color col)`

- Description: TODO

<a id="member-178"></a>
##### `nmrender(String name, Color col)`

- Description: TODO

<a id="member-179"></a>
##### `chidx(Channel chan)`

- Description: TODO

<a id="member-180"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-186"></a>
##### `DarkChannel(Channel chan)`

- Description: TODO

<a id="member-187"></a>
##### `rname()`

- Description: TODO

<a id="member-188"></a>
##### `ricon()`

- Description: TODO

<a id="member-189"></a>
##### `Selector(Coord sz)`

- Description: TODO

<a id="member-190"></a>
##### `add(Channel chan)`

- Description: TODO

<a id="member-191"></a>
##### `rm(Channel chan)`

- Description: TODO

<a id="member-192"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-193"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-194"></a>
##### `show(int si)`

- Description: TODO

<a id="member-195"></a>
##### `show(Channel chan)`

- Description: TODO

<a id="member-196"></a>
##### `up()`

- Description: TODO

<a id="member-197"></a>
##### `down()`

- Description: TODO

<a id="member-198"></a>
##### `bypos(Coord c)`

- Description: TODO

<a id="member-199"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-200"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-201"></a>
##### `clips(int s)`

- Description: TODO

<a id="member-202"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-203"></a>
##### `select(Channel chan, boolean focus)`

- Description: TODO

<a id="member-204"></a>
##### `select(Channel chan)`

- Description: TODO

<a id="member-210"></a>
##### `Notification(Channel chan, Channel.Message msg)`

- Description: TODO

<a id="member-213"></a>
##### `drawsmall(GOut g, Coord br, int h)`

- Description: TODO

<a id="member-221"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-223"></a>
##### `notify(Channel chan, Channel.Message msg, int urgency)`

- Description: TODO

<a id="member-226"></a>
##### `Spring(int ny)`

- Description: TODO

<a id="member-227"></a>
##### `ntick(double a)`

- Description: TODO

<a id="member-228"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-229"></a>
##### `presize()`

- Description: TODO

<a id="member-231"></a>
##### `sshow(boolean show)`

- Description: TODO

<a id="member-232"></a>
##### `hresize(int h)`

- Description: TODO

<a id="member-233"></a>
##### `resize(int w)`

- Description: TODO

<a id="member-234"></a>
##### `move(Coord base)`

- Description: TODO

<a id="member-235"></a>
##### `expand()`

- Description: TODO

<a id="member-236"></a>
##### `show()`

- Description: TODO

<a id="member-237"></a>
##### `hide()`

- Description: TODO

<a id="member-240"></a>
##### `QuickLine(EntryChannel chan)`

- Description: TODO

<a id="member-241"></a>
##### `cancel()`

- Description: TODO

<a id="member-242"></a>
##### `done(ReadLine buf)`

- Description: TODO

<a id="member-243"></a>
##### `key(KbdEvent ev)`

- Description: TODO

<a id="member-247"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-248"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-249"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-250"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-252"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO
