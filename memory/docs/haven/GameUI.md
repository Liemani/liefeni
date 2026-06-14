# GameUI

## Meta

- Source: [GameUI.java](../../../src/haven/GameUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Composes the main in-game UI.

## Code Members

### Member Index

#### Fields

- [blpw](#member-1)
- [brpw](#member-2)
- [chrid](#member-3)
- [genus](#member-4)
- [plid](#member-5)
- [ulpanel](#member-6)
- [umpanel](#member-7)
- [urpanel](#member-8)
- [blpanel](#member-9)
- [mapmenupanel](#member-10)
- [brpanel](#member-11)
- [menupanel](#member-12)
- [portrait](#member-13)
- [menu](#member-14)
- [map](#member-15)
- [iconconf](#member-16)
- [mmap](#member-17)
- [fv](#member-18)
- [meters](#member-19)
- [lastmsg](#member-20)
- [msgtime](#member-21)
- [invwnd](#member-22)
- [equwnd](#member-23)
- [makewnd](#member-24)
- [srchwnd](#member-25)
- [iconwnd](#member-26)
- [makewndc](#member-27)
- [maininv](#member-28)
- [chrwdg](#member-29)
- [mapfile](#member-30)
- [qqview](#member-31)
- [buddies](#member-32)
- [zerg](#member-33)
- [polities](#member-34)
- [help](#member-35)
- [opts](#member-36)
- [hand](#member-37)
- [vhand](#member-38)
- [chat](#member-39)
- [syslog](#member-40)
- [prog](#member-41)
- [afk](#member-42)
- [belt](#member-43)
- [beltwdg](#member-44)
- [polowners](#member-45)
- [buffs](#member-46)
- [idx](#member-47)
- [beltctxr](#member-51)
- [rdt](#member-52)
- [spr](#member-54)
- [pag](#member-62)
- [minimapc](#member-77)
- [menugridc](#member-78)
- [kb_srch](#member-80)
- [fold_br](#member-82)
- [fold_bl](#member-83)
- [id](#member-88)
- [g](#member-89)
- [base](#member-90)
- [tvis](#member-91)
- [cur](#member-92)
- [tabs](#member-107)
- [kin](#member-108)
- [pol](#member-109)
- [pol2](#member-110)
- [tab](#member-111)
- [inv](#member-112)
- [item](#member-121)
- [dc](#member-122)
- [wndids](#member-128)
- [time](#member-130)
- [map](#member-131)
- [gobid](#member-132)
- [wnd](#member-135)
- [oc](#member-136)
- [progt](#member-142)
- [prog](#member-143)
- [curi](#member-144)
- [cmdmap](#member-160)
- [lastsavegrid](#member-162)
- [lastsaveseq](#member-163)
- [lastwndsave](#member-165)
- [fitmarg](#member-169)
- [kb_inv](#member-176)
- [kb_equ](#member-177)
- [kb_chr](#member-178)
- [kb_bud](#member-179)
- [kb_opt](#member-180)
- [menubg](#member-181)
- [kb_map](#member-184)
- [kb_claim](#member-185)
- [kb_vil](#member-186)
- [kb_rlm](#member-187)
- [kb_ico](#member-188)
- [mapmenubg](#member-189)
- [kb_shoot](#member-193)
- [kb_chat](#member-194)
- [kb_hide](#member-195)
- [kb_logout](#member-196)
- [kb_switchchr](#member-197)
- [uimode](#member-199)
- [beltkeys](#member-210)
- [curbelt](#member-211)
- [nkeybg](#member-217)
- [curbelt](#member-218)
- [pagoff](#member-219)
- [cmdmap](#member-225)

#### Methods

- [BeltSlot(int idx)](#member-48)
- [public abstract void draw(GOut g);](#member-49)
- [public abstract void use(MenuGrid.Interaction iact);](#member-50)
- [ResBeltSlot(int idx, ResData rdt)](#member-53)
- [spr()](#member-55)
- [draw(GOut g)](#member-56)
- [use(MenuGrid.Interaction iact)](#member-57)
- [getres()](#member-58)
- [mkrandoom()](#member-59)
- [context(Class<T> cl)](#member-60)
- [wdg()](#member-61)
- [PagBeltSlot(int idx, MenuGrid.Pagina pag)](#member-63)
- [draw(GOut g)](#member-64)
- [use(MenuGrid.Interaction iact)](#member-65)
- [resolve(MenuGrid scm, Indir<Resource> resid)](#member-66)
- [mkbeltslot(int idx, ResData rdt)](#member-67)
- [Belt(Coord sz)](#member-68)
- [act(int idx, MenuGrid.Interaction iact)](#member-69)
- [keyact(int slot)](#member-70)
- [public abstract int beltslot(Coord c);](#member-71)
- [mousedown(MouseDownEvent ev)](#member-72)
- [drop(Coord c, Coord ul)](#member-73)
- [iteminteract(Coord c, Coord ul)](#member-74)
- [dropthing(Coord c, Object thing)](#member-75)
- [create(UI ui, Object[] args)](#member-76)
- [attached()](#member-79)
- [menubuttons(Widget bg)](#member-81)
- [updfold(boolean reset)](#member-84)
- [foldbuttons()](#member-85)
- [added()](#member-86)
- [dispose()](#member-87)
- [Hidepanel(String id, Indir<Coord> base, Coord g)](#member-93)
- [add(T child)](#member-94)
- [base()](#member-95)
- [move(double a)](#member-96)
- [move()](#member-97)
- [presize()](#member-98)
- [cresize(Widget ch)](#member-99)
- [mshow(final boolean vis)](#member-100)
- [mshow()](#member-101)
- [cshow(boolean vis)](#member-102)
- [cdestroy(Widget w)](#member-103)
- [Hidewnd(Coord sz, String cap, boolean lg)](#member-104)
- [Hidewnd(Coord sz, String cap)](#member-105)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-106)
- [TButton(String nm, boolean g)](#member-113)
- [draw(GOut g)](#member-114)
- [click()](#member-115)
- [Zergwnd()](#member-116)
- [repack()](#member-117)
- [ntab(Widget ch, TButton btn)](#member-118)
- [dtab(TButton btn)](#member-119)
- [addpol(Polity p)](#member-120)
- [DraggedItem(GItem item, Coord dc)](#member-123)
- [updhand()](#member-124)
- [mapfilename()](#member-125)
- [optplacement(Widget child, Coord org)](#member-126)
- [savewndpos()](#member-127)
- [addchild(Widget child, Object... args)](#member-129)
- [GobTrans(MapView map, long gobid)](#member-133)
- [oc()](#member-134)
- [Anim(Window wnd, boolean hide, Anim from)](#member-137)
- [draw(GOut g, Tex tex)](#member-138)
- [show(Window wnd, Anim hide)](#member-139)
- [hide(Window wnd, Anim show)](#member-140)
- [cdestroy(Widget w)](#member-141)
- [Progress(double prog)](#member-145)
- [destroy()](#member-146)
- [set(double prog)](#member-147)
- [draw(GOut g)](#member-148)
- [checkhit(Coord c)](#member-149)
- [draw(GOut g)](#member-150)
- [iconconfname()](#member-151)
- [loadiconconf()](#member-152)
- [CornerMap(Coord sz, MapFile file)](#member-153)
- [dragp(int button)](#member-154)
- [clickmarker(DisplayMarker mark, Location loc, int button, boolean press)](#member-155)
- [clickicon(DisplayIcon icon, Location loc, int button, boolean press)](#member-156)
- [clickloc(Location loc, int button, boolean press)](#member-157)
- [draw(GOut g)](#member-158)
- [allowzoomout()](#member-159)
- [findcmds()](#member-161)
- [mapfiletick()](#member-164)
- [tick(double dt)](#member-166)
- [uimsg(String msg, Object... args)](#member-167)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-168)
- [fitwdg(Widget wdg, Coord c)](#member-170)
- [fitwdg(Widget wdg)](#member-171)
- [wndstate(Window wnd)](#member-172)
- [togglewnd(Window wnd)](#member-173)
- [MenuButton(String base, KeyBinding gkey, String tooltip)](#member-174)
- [MenuCheckBox(String base, KeyBinding gkey, String tooltip)](#member-175)
- [MainMenu()](#member-182)
- [draw(GOut g)](#member-183)
- [toggleol(String tag, boolean a)](#member-190)
- [MapMenu()](#member-191)
- [draw(GOut g)](#member-192)
- [globtype(GlobKeyEvent ev)](#member-198)
- [toggleui(int mode)](#member-200)
- [resetui()](#member-201)
- [toggleui()](#member-202)
- [resize(Coord sz)](#member-203)
- [presize()](#member-204)
- [public ChatUI.Channel.Message logmessage();](#member-205)
- [msg(UI.Notice msg)](#member-206)
- [error(String msg)](#member-207)
- [act(String... args)](#member-208)
- [act(int mods, Coord mc, Gob gob, String... args)](#member-209)
- [FKeyBelt()](#member-212)
- [beltc(int i)](#member-213)
- [beltslot(Coord c)](#member-214)
- [draw(GOut g)](#member-215)
- [globtype(GlobKeyEvent ev)](#member-216)
- [NKeyBelt()](#member-220)
- [beltc(int i)](#member-221)
- [beltslot(Coord c)](#member-222)
- [draw(GOut g)](#member-223)
- [globtype(GlobKeyEvent ev)](#member-224)
- [findcmds()](#member-226)
- [alert(String msg)](#member-227)
- [print(String msg, Color col)](#member-228)
- [print(String msg)](#member-229)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `blpw`

- Description: TODO

<a id="member-2"></a>
##### `brpw`

- Description: TODO

<a id="member-3"></a>
##### `chrid`

- Description: TODO

<a id="member-4"></a>
##### `genus`

- Description: TODO

<a id="member-5"></a>
##### `plid`

- Description: TODO

<a id="member-6"></a>
##### `ulpanel`

- Description: TODO

<a id="member-7"></a>
##### `umpanel`

- Description: TODO

<a id="member-8"></a>
##### `urpanel`

- Description: TODO

<a id="member-9"></a>
##### `blpanel`

- Description: TODO

<a id="member-10"></a>
##### `mapmenupanel`

- Description: TODO

<a id="member-11"></a>
##### `brpanel`

- Description: TODO

<a id="member-12"></a>
##### `menupanel`

- Description: TODO

<a id="member-13"></a>
##### `portrait`

- Description: TODO

<a id="member-14"></a>
##### `menu`

- Description: TODO

<a id="member-15"></a>
##### `map`

- Description: TODO

<a id="member-16"></a>
##### `iconconf`

- Description: TODO

<a id="member-17"></a>
##### `mmap`

- Description: TODO

<a id="member-18"></a>
##### `fv`

- Description: TODO

<a id="member-19"></a>
##### `meters`

- Description: TODO

<a id="member-20"></a>
##### `lastmsg`

- Description: TODO

<a id="member-21"></a>
##### `msgtime`

- Description: TODO

<a id="member-22"></a>
##### `invwnd`

- Description: TODO

<a id="member-23"></a>
##### `equwnd`

- Description: TODO

<a id="member-24"></a>
##### `makewnd`

- Description: TODO

<a id="member-25"></a>
##### `srchwnd`

- Description: TODO

<a id="member-26"></a>
##### `iconwnd`

- Description: TODO

<a id="member-27"></a>
##### `makewndc`

- Description: TODO

<a id="member-28"></a>
##### `maininv`

- Description: TODO

<a id="member-29"></a>
##### `chrwdg`

- Description: TODO

<a id="member-30"></a>
##### `mapfile`

- Description: TODO

<a id="member-31"></a>
##### `qqview`

- Description: TODO

<a id="member-32"></a>
##### `buddies`

- Description: TODO

<a id="member-33"></a>
##### `zerg`

- Description: TODO

<a id="member-34"></a>
##### `polities`

- Description: TODO

<a id="member-35"></a>
##### `help`

- Description: TODO

<a id="member-36"></a>
##### `opts`

- Description: TODO

<a id="member-37"></a>
##### `hand`

- Description: TODO

<a id="member-38"></a>
##### `vhand`

- Description: TODO

<a id="member-39"></a>
##### `chat`

- Description: TODO

<a id="member-40"></a>
##### `syslog`

- Description: TODO

<a id="member-41"></a>
##### `prog`

- Description: TODO

<a id="member-42"></a>
##### `afk`

- Description: TODO

<a id="member-43"></a>
##### `belt`

- Description: TODO

<a id="member-44"></a>
##### `beltwdg`

- Description: TODO

<a id="member-45"></a>
##### `polowners`

- Description: TODO

<a id="member-46"></a>
##### `buffs`

- Description: TODO

<a id="member-47"></a>
##### `idx`

- Description: TODO

<a id="member-51"></a>
##### `beltctxr`

- Description: TODO

<a id="member-52"></a>
##### `rdt`

- Description: TODO

<a id="member-54"></a>
##### `spr`

- Description: TODO

<a id="member-62"></a>
##### `pag`

- Description: TODO

<a id="member-77"></a>
##### `minimapc`

- Description: TODO

<a id="member-78"></a>
##### `menugridc`

- Description: TODO

<a id="member-80"></a>
##### `kb_srch`

- Description: TODO

<a id="member-82"></a>
##### `fold_br`

- Description: TODO

<a id="member-83"></a>
##### `fold_bl`

- Description: TODO

<a id="member-88"></a>
##### `id`

- Description: TODO

<a id="member-89"></a>
##### `g`

- Description: TODO

<a id="member-90"></a>
##### `base`

- Description: TODO

<a id="member-91"></a>
##### `tvis`

- Description: TODO

<a id="member-92"></a>
##### `cur`

- Description: TODO

<a id="member-107"></a>
##### `tabs`

- Description: TODO

<a id="member-108"></a>
##### `kin`

- Description: TODO

<a id="member-109"></a>
##### `pol`

- Description: TODO

<a id="member-110"></a>
##### `pol2`

- Description: TODO

<a id="member-111"></a>
##### `tab`

- Description: TODO

<a id="member-112"></a>
##### `inv`

- Description: TODO

<a id="member-121"></a>
##### `item`

- Description: TODO

<a id="member-122"></a>
##### `dc`

- Description: TODO

<a id="member-128"></a>
##### `wndids`

- Description: TODO

<a id="member-130"></a>
##### `time`

- Description: TODO

<a id="member-131"></a>
##### `map`

- Description: TODO

<a id="member-132"></a>
##### `gobid`

- Description: TODO

<a id="member-135"></a>
##### `wnd`

- Description: TODO

<a id="member-136"></a>
##### `oc`

- Description: TODO

<a id="member-142"></a>
##### `progt`

- Description: TODO

<a id="member-143"></a>
##### `prog`

- Description: TODO

<a id="member-144"></a>
##### `curi`

- Description: TODO

<a id="member-160"></a>
##### `cmdmap`

- Description: TODO

<a id="member-162"></a>
##### `lastsavegrid`

- Description: TODO

<a id="member-163"></a>
##### `lastsaveseq`

- Description: TODO

<a id="member-165"></a>
##### `lastwndsave`

- Description: TODO

<a id="member-169"></a>
##### `fitmarg`

- Description: TODO

<a id="member-176"></a>
##### `kb_inv`

- Description: TODO

<a id="member-177"></a>
##### `kb_equ`

- Description: TODO

<a id="member-178"></a>
##### `kb_chr`

- Description: TODO

<a id="member-179"></a>
##### `kb_bud`

- Description: TODO

<a id="member-180"></a>
##### `kb_opt`

- Description: TODO

<a id="member-181"></a>
##### `menubg`

- Description: TODO

<a id="member-184"></a>
##### `kb_map`

- Description: TODO

<a id="member-185"></a>
##### `kb_claim`

- Description: TODO

<a id="member-186"></a>
##### `kb_vil`

- Description: TODO

<a id="member-187"></a>
##### `kb_rlm`

- Description: TODO

<a id="member-188"></a>
##### `kb_ico`

- Description: TODO

<a id="member-189"></a>
##### `mapmenubg`

- Description: TODO

<a id="member-193"></a>
##### `kb_shoot`

- Description: TODO

<a id="member-194"></a>
##### `kb_chat`

- Description: TODO

<a id="member-195"></a>
##### `kb_hide`

- Description: TODO

<a id="member-196"></a>
##### `kb_logout`

- Description: TODO

<a id="member-197"></a>
##### `kb_switchchr`

- Description: TODO

<a id="member-199"></a>
##### `uimode`

- Description: TODO

<a id="member-210"></a>
##### `beltkeys`

- Description: TODO

<a id="member-211"></a>
##### `curbelt`

- Description: TODO

<a id="member-217"></a>
##### `nkeybg`

- Description: TODO

<a id="member-218"></a>
##### `curbelt`

- Description: TODO

<a id="member-219"></a>
##### `pagoff`

- Description: TODO

<a id="member-225"></a>
##### `cmdmap`

- Description: TODO

#### Methods

<a id="member-48"></a>
##### `BeltSlot(int idx)`

- Description: TODO

<a id="member-49"></a>
##### `public abstract void draw(GOut g);`

- Description: TODO

<a id="member-50"></a>
##### `public abstract void use(MenuGrid.Interaction iact);`

- Description: TODO

<a id="member-53"></a>
##### `ResBeltSlot(int idx, ResData rdt)`

- Description: TODO

<a id="member-55"></a>
##### `spr()`

- Description: TODO

<a id="member-56"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-57"></a>
##### `use(MenuGrid.Interaction iact)`

- Description: TODO

<a id="member-58"></a>
##### `getres()`

- Description: TODO

<a id="member-59"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-60"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-61"></a>
##### `wdg()`

- Description: TODO

<a id="member-63"></a>
##### `PagBeltSlot(int idx, MenuGrid.Pagina pag)`

- Description: TODO

<a id="member-64"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-65"></a>
##### `use(MenuGrid.Interaction iact)`

- Description: TODO

<a id="member-66"></a>
##### `resolve(MenuGrid scm, Indir<Resource> resid)`

- Description: TODO

<a id="member-67"></a>
##### `mkbeltslot(int idx, ResData rdt)`

- Description: TODO

<a id="member-68"></a>
##### `Belt(Coord sz)`

- Description: TODO

<a id="member-69"></a>
##### `act(int idx, MenuGrid.Interaction iact)`

- Description: TODO

<a id="member-70"></a>
##### `keyact(int slot)`

- Description: TODO

<a id="member-71"></a>
##### `public abstract int beltslot(Coord c);`

- Description: TODO

<a id="member-72"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-73"></a>
##### `drop(Coord c, Coord ul)`

- Description: TODO

<a id="member-74"></a>
##### `iteminteract(Coord c, Coord ul)`

- Description: TODO

<a id="member-75"></a>
##### `dropthing(Coord c, Object thing)`

- Description: TODO

<a id="member-76"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-79"></a>
##### `attached()`

- Description: TODO

<a id="member-81"></a>
##### `menubuttons(Widget bg)`

- Description: TODO

<a id="member-84"></a>
##### `updfold(boolean reset)`

- Description: TODO

<a id="member-85"></a>
##### `foldbuttons()`

- Description: TODO

<a id="member-86"></a>
##### `added()`

- Description: TODO

<a id="member-87"></a>
##### `dispose()`

- Description: TODO

<a id="member-93"></a>
##### `Hidepanel(String id, Indir<Coord> base, Coord g)`

- Description: TODO

<a id="member-94"></a>
##### `add(T child)`

- Description: TODO

<a id="member-95"></a>
##### `base()`

- Description: TODO

<a id="member-96"></a>
##### `move(double a)`

- Description: TODO

<a id="member-97"></a>
##### `move()`

- Description: TODO

<a id="member-98"></a>
##### `presize()`

- Description: TODO

<a id="member-99"></a>
##### `cresize(Widget ch)`

- Description: TODO

<a id="member-100"></a>
##### `mshow(final boolean vis)`

- Description: TODO

<a id="member-101"></a>
##### `mshow()`

- Description: TODO

<a id="member-102"></a>
##### `cshow(boolean vis)`

- Description: TODO

<a id="member-103"></a>
##### `cdestroy(Widget w)`

- Description: TODO

<a id="member-104"></a>
##### `Hidewnd(Coord sz, String cap, boolean lg)`

- Description: TODO

<a id="member-105"></a>
##### `Hidewnd(Coord sz, String cap)`

- Description: TODO

<a id="member-106"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-113"></a>
##### `TButton(String nm, boolean g)`

- Description: TODO

<a id="member-114"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-115"></a>
##### `click()`

- Description: TODO

<a id="member-116"></a>
##### `Zergwnd()`

- Description: TODO

<a id="member-117"></a>
##### `repack()`

- Description: TODO

<a id="member-118"></a>
##### `ntab(Widget ch, TButton btn)`

- Description: TODO

<a id="member-119"></a>
##### `dtab(TButton btn)`

- Description: TODO

<a id="member-120"></a>
##### `addpol(Polity p)`

- Description: TODO

<a id="member-123"></a>
##### `DraggedItem(GItem item, Coord dc)`

- Description: TODO

<a id="member-124"></a>
##### `updhand()`

- Description: TODO

<a id="member-125"></a>
##### `mapfilename()`

- Description: TODO

<a id="member-126"></a>
##### `optplacement(Widget child, Coord org)`

- Description: TODO

<a id="member-127"></a>
##### `savewndpos()`

- Description: TODO

<a id="member-129"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-133"></a>
##### `GobTrans(MapView map, long gobid)`

- Description: TODO

<a id="member-134"></a>
##### `oc()`

- Description: TODO

<a id="member-137"></a>
##### `Anim(Window wnd, boolean hide, Anim from)`

- Description: TODO

<a id="member-138"></a>
##### `draw(GOut g, Tex tex)`

- Description: TODO

<a id="member-139"></a>
##### `show(Window wnd, Anim hide)`

- Description: TODO

<a id="member-140"></a>
##### `hide(Window wnd, Anim show)`

- Description: TODO

<a id="member-141"></a>
##### `cdestroy(Widget w)`

- Description: TODO

<a id="member-145"></a>
##### `Progress(double prog)`

- Description: TODO

<a id="member-146"></a>
##### `destroy()`

- Description: TODO

<a id="member-147"></a>
##### `set(double prog)`

- Description: TODO

<a id="member-148"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-149"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-150"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-151"></a>
##### `iconconfname()`

- Description: TODO

<a id="member-152"></a>
##### `loadiconconf()`

- Description: TODO

<a id="member-153"></a>
##### `CornerMap(Coord sz, MapFile file)`

- Description: TODO

<a id="member-154"></a>
##### `dragp(int button)`

- Description: TODO

<a id="member-155"></a>
##### `clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-156"></a>
##### `clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-157"></a>
##### `clickloc(Location loc, int button, boolean press)`

- Description: TODO

<a id="member-158"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-159"></a>
##### `allowzoomout()`

- Description: TODO

<a id="member-161"></a>
##### `findcmds()`

- Description: TODO

<a id="member-164"></a>
##### `mapfiletick()`

- Description: TODO

<a id="member-166"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-167"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-168"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-170"></a>
##### `fitwdg(Widget wdg, Coord c)`

- Description: TODO

<a id="member-171"></a>
##### `fitwdg(Widget wdg)`

- Description: TODO

<a id="member-172"></a>
##### `wndstate(Window wnd)`

- Description: TODO

<a id="member-173"></a>
##### `togglewnd(Window wnd)`

- Description: TODO

<a id="member-174"></a>
##### `MenuButton(String base, KeyBinding gkey, String tooltip)`

- Description: TODO

<a id="member-175"></a>
##### `MenuCheckBox(String base, KeyBinding gkey, String tooltip)`

- Description: TODO

<a id="member-182"></a>
##### `MainMenu()`

- Description: TODO

<a id="member-183"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-190"></a>
##### `toggleol(String tag, boolean a)`

- Description: TODO

<a id="member-191"></a>
##### `MapMenu()`

- Description: TODO

<a id="member-192"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-198"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-200"></a>
##### `toggleui(int mode)`

- Description: TODO

<a id="member-201"></a>
##### `resetui()`

- Description: TODO

<a id="member-202"></a>
##### `toggleui()`

- Description: TODO

<a id="member-203"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-204"></a>
##### `presize()`

- Description: TODO

<a id="member-205"></a>
##### `public ChatUI.Channel.Message logmessage();`

- Description: TODO

<a id="member-206"></a>
##### `msg(UI.Notice msg)`

- Description: TODO

<a id="member-207"></a>
##### `error(String msg)`

- Description: TODO

<a id="member-208"></a>
##### `act(String... args)`

- Description: TODO

<a id="member-209"></a>
##### `act(int mods, Coord mc, Gob gob, String... args)`

- Description: TODO

<a id="member-212"></a>
##### `FKeyBelt()`

- Description: TODO

<a id="member-213"></a>
##### `beltc(int i)`

- Description: TODO

<a id="member-214"></a>
##### `beltslot(Coord c)`

- Description: TODO

<a id="member-215"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-216"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-220"></a>
##### `NKeyBelt()`

- Description: TODO

<a id="member-221"></a>
##### `beltc(int i)`

- Description: TODO

<a id="member-222"></a>
##### `beltslot(Coord c)`

- Description: TODO

<a id="member-223"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-224"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-226"></a>
##### `findcmds()`

- Description: TODO

<a id="member-227"></a>
##### `alert(String msg)`

- Description: TODO

<a id="member-228"></a>
##### `print(String msg, Color col)`

- Description: TODO

<a id="member-229"></a>
##### `print(String msg)`

- Description: TODO
