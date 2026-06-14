# MapViewBridge

## Meta

- Source: [MapView.java](../../../../src/haven/MapView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Serves as the main in-world map interaction surface.
- Provides a place to own the current Haven `MapView` reference and map-view specific helpers.

## Code Members

### Member Index

#### Constants

- [MAXID](#member-220)

#### Fields

- [clickdb](#member-1)
- [plgob](#member-2)
- [cc](#member-3)
- [glob](#member-4)
- [view](#member-5)
- [delayed](#member-6)
- [delayed2](#member-7)
- [camera](#member-8)
- [placing](#member-9)
- [grab](#member-10)
- [selection](#member-11)
- [camoff](#member-12)
- [shake](#member-13)
- [plobpgran](#member-14)
- [plobagran](#member-15)
- [camtypes](#member-16)
- [view](#member-22)
- [proj](#member-23)
- [fr](#member-35)
- [h](#member-36)
- [ca](#member-37)
- [cd](#member-38)
- [curc](#member-39)
- [elev](#member-40)
- [telev](#member-41)
- [angl](#member-42)
- [tangl](#member-43)
- [dragorig](#member-44)
- [anglorig](#member-45)
- [f0](#member-50)
- [f1](#member-51)
- [f2](#member-52)
- [fl](#member-53)
- [fa](#member-54)
- [fb](#member-55)
- [maxang](#member-60)
- [mindist](#member-61)
- [dist](#member-64)
- [elev](#member-65)
- [angl](#member-66)
- [dragorig](#member-67)
- [elevorig](#member-68)
- [anglorig](#member-69)
- [dist](#member-75)
- [tdist](#member-76)
- [elev](#member-77)
- [telev](#member-78)
- [angl](#member-79)
- [tangl](#member-80)
- [dragorig](#member-81)
- [elevorig](#member-82)
- [anglorig](#member-83)
- [pi2](#member-84)
- [cc](#member-85)
- [exact](#member-91)
- [dfield](#member-92)
- [dist](#member-93)
- [elev](#member-94)
- [angl](#member-95)
- [field](#member-96)
- [dragorig](#member-97)
- [anglorig](#member-98)
- [cc](#member-99)
- [jc](#member-100)
- [kb_camleft](#member-107)
- [kb_camright](#member-108)
- [kb_camin](#member-109)
- [kb_camout](#member-110)
- [kb_camreset](#member-111)
- [dragorig](#member-112)
- [anglorig](#member-113)
- [tangl](#member-114)
- [tfield](#member-115)
- [isometric](#member-116)
- [pi2](#member-117)
- [tf](#member-118)
- [gobs](#member-133)
- [oc](#member-134)
- [adding](#member-135)
- [current](#member-136)
- [slot](#member-137)
- [map](#member-144)
- [area](#member-145)
- [lastload](#member-146)
- [cuts](#member-147)
- [position](#member-148)
- [lastload](#member-149)
- [terrain](#member-158)
- [main](#member-159)
- [flavobjs](#member-160)
- [id](#member-165)
- [rc](#member-166)
- [used](#member-167)
- [base](#member-168)
- [outl](#member-169)
- [oltags](#member-175)
- [ols](#member-176)
- [gridmat](#member-178)
- [grid](#member-179)
- [gridlines](#member-184)
- [cut](#member-186)
- [clickmap](#member-189)
- [grid](#member-190)
- [smapcc](#member-196)
- [slist](#member-197)
- [smap](#member-198)
- [lsmch](#member-199)
- [amblight](#member-202)
- [s_amblight](#member-203)
- [gprefs](#member-205)
- [zgrid](#member-206)
- [maxlights](#member-207)
- [lighting](#member-211)
- [amblight_idx](#member-213)
- [rweather](#member-214)
- [clickbasic](#member-219)
- [master](#member-221)
- [doinst](#member-222)
- [basic](#member-223)
- [slots](#member-224)
- [idmap](#member-225)
- [curbasic](#member-226)
- [back](#member-227)
- [draw](#member-228)
- [instancer](#member-229)
- [nextid](#member-230)
- [bk](#member-231)
- [id](#member-232)
- [idp](#member-233)
- [state](#member-234)
- [idx_bas](#member-238)
- [idx_idp](#member-239)
- [idx_back](#member-240)
- [back](#member-241)
- [clmaptree](#member-262)
- [clmaplist](#member-263)
- [clobjlist](#member-264)
- [clickid](#member-265)
- [clickloc](#member-266)
- [clickdepth](#member-267)
- [curclickbasic](#member-268)
- [gobclfuzz](#member-271)
- [text](#member-276)
- [tm](#member-277)
- [polownertf](#member-279)
- [polowners](#member-280)
- [camload](#member-290)
- [lastload](#member-291)
- [initload](#member-293)
- [initdraw](#member-294)
- [freerot](#member-301)
- [adjust](#member-304)
- [lastmc](#member-305)
- [slot](#member-306)
- [modflags](#member-313)
- [olflash](#member-317)
- [olftimer](#member-318)
- [pc](#member-322)
- [pc](#member-327)
- [mapcl](#member-328)
- [objcl](#member-329)
- [dfl](#member-330)
- [clickb](#member-336)
- [camdrag](#member-341)
- [kb_grid](#member-349)
- [bk](#member-352)
- [mv](#member-353)
- [selol](#member-359)
- [max](#member-360)
- [sc](#member-361)
- [modflags](#member-362)
- [ol](#member-363)
- [mgrab](#member-364)
- [tt](#member-365)
- [xl](#member-366)
- [cmdmap](#member-376)

#### Methods

- [public void run(GOut g);](#member-17)
- [boolean mmousedown(Coord mc, int button);](#member-18)
- [boolean mmouseup(Coord mc, int button);](#member-19)
- [boolean mmousewheel(Coord mc, int amount);](#member-20)
- [void mmousemove(Coord mc);](#member-21)
- [Camera()](#member-24)
- [keydown(KeyDownEvent ev)](#member-25)
- [click(Coord sc)](#member-26)
- [drag(Coord sc)](#member-27)
- [release()](#member-28)
- [wheel(MouseWheelEvent ev)](#member-29)
- [resized()](#member-30)
- [apply(Pipe p)](#member-31)
- [public abstract float angle();](#member-32)
- [public abstract void tick(double dt);](#member-33)
- [stats()](#member-34)
- [FollowCam()](#member-46)
- [resized()](#member-47)
- [click(Coord c)](#member-48)
- [drag(Coord c)](#member-49)
- [field(float elev)](#member-56)
- [dist(float elev)](#member-57)
- [tick(double dt)](#member-58)
- [angle()](#member-59)
- [wheel(MouseWheelEvent ev)](#member-62)
- [stats()](#member-63)
- [tick(double dt)](#member-70)
- [angle()](#member-71)
- [click(Coord c)](#member-72)
- [drag(Coord c)](#member-73)
- [wheel(MouseWheelEvent ev)](#member-74)
- [tick(double dt)](#member-86)
- [angle()](#member-87)
- [click(Coord c)](#member-88)
- [drag(Coord c)](#member-89)
- [wheel(MouseWheelEvent ev)](#member-90)
- [tick2(double dt)](#member-101)
- [tick(double dt)](#member-102)
- [angle()](#member-103)
- [click(Coord c)](#member-104)
- [drag(Coord c)](#member-105)
- [stats()](#member-106)
- [SOrthoCam(String... args)](#member-119)
- [tick2(double dt)](#member-120)
- [click(Coord c)](#member-121)
- [drag(Coord c)](#member-122)
- [release()](#member-123)
- [chfield(float nf)](#member-124)
- [wheel(MouseWheelEvent ev)](#member-125)
- [keydown(KeyDownEvent ev)](#member-126)
- [create(UI ui, Object[] args)](#member-127)
- [envdispose()](#member-128)
- [dispose()](#member-129)
- [visol(String tag)](#member-130)
- [enol(String tag)](#member-131)
- [disol(String tag)](#member-132)
- [addgob(Gob ob)](#member-138)
- [added(RenderTree.Slot slot)](#member-139)
- [removed(RenderTree.Slot slot)](#member-140)
- [added(Gob ob)](#member-141)
- [removed(Gob ob)](#member-142)
- [loading()](#member-143)
- [Grid(boolean position)](#member-150)
- [Grid()](#member-151)
- [abstract T getcut(Coord cc);](#member-152)
- [produce(T cut)](#member-153)
- [tick()](#member-154)
- [removed(RenderTree.Slot slot)](#member-155)
- [tick()](#member-156)
- [loading()](#member-157)
- [Terrain()](#member-161)
- [tick()](#member-162)
- [added(RenderTree.Slot slot)](#member-163)
- [loading()](#member-164)
- [Overlay(OverlayInfo id)](#member-170)
- [tick()](#member-171)
- [added(RenderTree.Slot slot)](#member-172)
- [loading()](#member-173)
- [remove()](#member-174)
- [oltick()](#member-177)
- [GridLines()](#member-180)
- [tick()](#member-181)
- [added(RenderTree.Slot slot)](#member-182)
- [remove()](#member-183)
- [showgrid(boolean show)](#member-185)
- [MapClick(MapMesh cut)](#member-187)
- [toString()](#member-188)
- [tick()](#member-191)
- [added(RenderTree.Slot slot)](#member-192)
- [loading()](#member-193)
- [camstats()](#member-194)
- [stats()](#member-195)
- [updsmap(DirLight light)](#member-200)
- [drawsmap(Render out)](#member-201)
- [amblight()](#member-204)
- [LightCompiler(GSettings gprefs)](#member-208)
- [valid(GSettings prefs)](#member-209)
- [compile(Object[][] params, Projection proj)](#member-210)
- [lights()](#member-212)
- [updweather()](#member-215)
- [drawadd(RenderTree.Node extra)](#member-216)
- [player()](#member-217)
- [getcc()](#member-218)
- [Clickslot(Slot<? extends Rendered> bk, int id)](#member-235)
- [obj()](#member-236)
- [state()](#member-237)
- [IDState(GroupPipe back)](#member-242)
- [group(int idx)](#member-243)
- [gstate(int id)](#member-244)
- [nstates()](#member-245)
- [Clicklist(RenderList.Adapter master, boolean doinst)](#member-246)
- [add(Slot<? extends Rendered> slot)](#member-247)
- [remove(Slot<? extends Rendered> slot)](#member-248)
- [update(Slot<? extends Rendered> slot)](#member-249)
- [update(Pipe group, int[] statemask)](#member-250)
- [lock()](#member-251)
- [slots()](#member-252)
- [add(RenderList<R> list, Class<? extends R> type)](#member-253)
- [remove(RenderList<?> list)](#member-254)
- [basic(Pipe.Op st)](#member-255)
- [sz()](#member-256)
- [draw(Render out)](#member-257)
- [get(Render out, Coord c, Consumer<ClickData> cb)](#member-258)
- [fuzzyget(Render out, Coord c, int rad, Consumer<ClickData> cb)](#member-259)
- [dispose()](#member-260)
- [stats()](#member-261)
- [clickbasic(Coord sz)](#member-269)
- [checkmapclick(Render out, Pipe.Op basic, Coord c, Consumer<Coord2d> cb)](#member-270)
- [checkgobclick(Render out, Pipe.Op basic, Coord c, Consumer<ClickData> cb)](#member-272)
- [delay(Delayed d)](#member-273)
- [delay2(Delayed d)](#member-274)
- [undelay(Collection<Delayed> list, GOut g)](#member-275)
- [PolText(Text text, double tm)](#member-278)
- [setpoltext(int id, String text)](#member-281)
- [poldraw(GOut g)](#member-282)
- [drawarrow(GOut g, double a)](#member-283)
- [clipxf(Coord3f mc, boolean doclip)](#member-284)
- [screenxf(Coord3f mc)](#member-285)
- [screenxf(Coord2d mc)](#member-286)
- [screenangle(Coord2d mc, boolean clip)](#member-287)
- [partydraw(GOut g)](#member-288)
- [maindraw(Render out)](#member-289)
- [draw(GOut g)](#member-292)
- [checkload()](#member-295)
- [tick(double dt)](#member-296)
- [resize(Coord sz)](#member-297)
- [public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags);](#member-298)
- [rotate(Plob plob, MouseWheelEvent data, int modflags)](#member-299)
- [rotate(Plob plob, int amount, int modflags)](#member-300)
- [adjust(Plob plob, Coord pc, Coord2d mc, int modflags)](#member-302)
- [rotate(Plob plob, MouseWheelEvent data, int modflags)](#member-303)
- [Plob(Indir<Resource> res, Message sdt)](#member-307)
- [mv()](#member-308)
- [move(Coord2d c, double a)](#member-309)
- [move(Coord2d c)](#member-310)
- [move(double a)](#member-311)
- [place()](#member-312)
- [Adjust(Coord c, int modflags)](#member-314)
- [hit(Coord pc, Coord2d mc)](#member-315)
- [toString()](#member-316)
- [unflashol()](#member-319)
- [flashol(Collection<String> ols, double tm)](#member-320)
- [uimsg(String msg, Object... args)](#member-321)
- [Maptest(Coord c)](#member-323)
- [run()](#member-324)
- [protected abstract void hit(Coord pc, Coord2d mc);](#member-325)
- [nohit(Coord pc)](#member-326)
- [Hittest(Coord c)](#member-331)
- [run()](#member-332)
- [ckdone(int fl)](#member-333)
- [protected abstract void hit(Coord pc, Coord2d mc, ClickData inf);](#member-334)
- [nohit(Coord pc)](#member-335)
- [Click(Coord c, int b)](#member-337)
- [hit(Coord pc, Coord2d mc, ClickData inf)](#member-338)
- [grab(Grabber grab)](#member-339)
- [release(Grabber grab)](#member-340)
- [mousedown(MouseDownEvent ev)](#member-342)
- [mousemove(MouseMoveEvent ev)](#member-343)
- [mouseup(MouseUpEvent ev)](#member-344)
- [mousewheel(MouseWheelEvent ev)](#member-345)
- [drop(final Coord cc, Coord ul)](#member-346)
- [iteminteract(Coord cc, Coord ul)](#member-347)
- [keydown(KeyDownEvent ev)](#member-348)
- [globtype(GlobKeyEvent ev)](#member-350)
- [tooltip(Coord c, Widget prev)](#member-351)
- [GrabXL(Grabber bk)](#member-354)
- [mmousedown(Coord cc, final int button)](#member-355)
- [mmouseup(Coord cc, final int button)](#member-356)
- [mmousewheel(Coord cc, final int amount)](#member-357)
- [mmousemove(Coord cc)](#member-358)
- [Selector(Coord max)](#member-367)
- [mmousedown(Coord mc, int button)](#member-368)
- [getec(Coord mc)](#member-369)
- [mmouseup(Coord mc, int button)](#member-370)
- [mmousewheel(Coord mc, int amount)](#member-371)
- [mmousemove(Coord mc)](#member-372)
- [destroy()](#member-373)
- [makecam(Class<? extends Camera> ct, String... args)](#member-374)
- [restorecam()](#member-375)
- [findcmds()](#member-377)
- [newSelector()](#member-378)
- [destroySelector()](#member-379)
- [isPlanningObject()](#member-380)
- [public void waitPlanObject() throws InterruptedException](#member-381)

### Member Reference

#### Constants

<a id="member-220"></a>
##### `MAXID`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `clickdb`

- Description: TODO

<a id="member-2"></a>
##### `plgob`

- Description: TODO

<a id="member-3"></a>
##### `cc`

- Description: TODO

<a id="member-4"></a>
##### `glob`

- Description: TODO

<a id="member-5"></a>
##### `view`

- Description: TODO

<a id="member-6"></a>
##### `delayed`

- Description: TODO

<a id="member-7"></a>
##### `delayed2`

- Description: TODO

<a id="member-8"></a>
##### `camera`

- Description: TODO

<a id="member-9"></a>
##### `placing`

- Description: TODO

<a id="member-10"></a>
##### `grab`

- Description: TODO

<a id="member-11"></a>
##### `selection`

- Description: TODO

<a id="member-12"></a>
##### `camoff`

- Description: TODO

<a id="member-13"></a>
##### `shake`

- Description: TODO

<a id="member-14"></a>
##### `plobpgran`

- Description: TODO

<a id="member-15"></a>
##### `plobagran`

- Description: TODO

<a id="member-16"></a>
##### `camtypes`

- Description: TODO

<a id="member-22"></a>
##### `view`

- Description: TODO

<a id="member-23"></a>
##### `proj`

- Description: TODO

<a id="member-35"></a>
##### `fr`

- Description: TODO

<a id="member-36"></a>
##### `h`

- Description: TODO

<a id="member-37"></a>
##### `ca`

- Description: TODO

<a id="member-38"></a>
##### `cd`

- Description: TODO

<a id="member-39"></a>
##### `curc`

- Description: TODO

<a id="member-40"></a>
##### `elev`

- Description: TODO

<a id="member-41"></a>
##### `telev`

- Description: TODO

<a id="member-42"></a>
##### `angl`

- Description: TODO

<a id="member-43"></a>
##### `tangl`

- Description: TODO

<a id="member-44"></a>
##### `dragorig`

- Description: TODO

<a id="member-45"></a>
##### `anglorig`

- Description: TODO

<a id="member-50"></a>
##### `f0`

- Description: TODO

<a id="member-51"></a>
##### `f1`

- Description: TODO

<a id="member-52"></a>
##### `f2`

- Description: TODO

<a id="member-53"></a>
##### `fl`

- Description: TODO

<a id="member-54"></a>
##### `fa`

- Description: TODO

<a id="member-55"></a>
##### `fb`

- Description: TODO

<a id="member-60"></a>
##### `maxang`

- Description: TODO

<a id="member-61"></a>
##### `mindist`

- Description: TODO

<a id="member-64"></a>
##### `dist`

- Description: TODO

<a id="member-65"></a>
##### `elev`

- Description: TODO

<a id="member-66"></a>
##### `angl`

- Description: TODO

<a id="member-67"></a>
##### `dragorig`

- Description: TODO

<a id="member-68"></a>
##### `elevorig`

- Description: TODO

<a id="member-69"></a>
##### `anglorig`

- Description: TODO

<a id="member-75"></a>
##### `dist`

- Description: TODO

<a id="member-76"></a>
##### `tdist`

- Description: TODO

<a id="member-77"></a>
##### `elev`

- Description: TODO

<a id="member-78"></a>
##### `telev`

- Description: TODO

<a id="member-79"></a>
##### `angl`

- Description: TODO

<a id="member-80"></a>
##### `tangl`

- Description: TODO

<a id="member-81"></a>
##### `dragorig`

- Description: TODO

<a id="member-82"></a>
##### `elevorig`

- Description: TODO

<a id="member-83"></a>
##### `anglorig`

- Description: TODO

<a id="member-84"></a>
##### `pi2`

- Description: TODO

<a id="member-85"></a>
##### `cc`

- Description: TODO

<a id="member-91"></a>
##### `exact`

- Description: TODO

<a id="member-92"></a>
##### `dfield`

- Description: TODO

<a id="member-93"></a>
##### `dist`

- Description: TODO

<a id="member-94"></a>
##### `elev`

- Description: TODO

<a id="member-95"></a>
##### `angl`

- Description: TODO

<a id="member-96"></a>
##### `field`

- Description: TODO

<a id="member-97"></a>
##### `dragorig`

- Description: TODO

<a id="member-98"></a>
##### `anglorig`

- Description: TODO

<a id="member-99"></a>
##### `cc`

- Description: TODO

<a id="member-100"></a>
##### `jc`

- Description: TODO

<a id="member-107"></a>
##### `kb_camleft`

- Description: TODO

<a id="member-108"></a>
##### `kb_camright`

- Description: TODO

<a id="member-109"></a>
##### `kb_camin`

- Description: TODO

<a id="member-110"></a>
##### `kb_camout`

- Description: TODO

<a id="member-111"></a>
##### `kb_camreset`

- Description: TODO

<a id="member-112"></a>
##### `dragorig`

- Description: TODO

<a id="member-113"></a>
##### `anglorig`

- Description: TODO

<a id="member-114"></a>
##### `tangl`

- Description: TODO

<a id="member-115"></a>
##### `tfield`

- Description: TODO

<a id="member-116"></a>
##### `isometric`

- Description: TODO

<a id="member-117"></a>
##### `pi2`

- Description: TODO

<a id="member-118"></a>
##### `tf`

- Description: TODO

<a id="member-133"></a>
##### `gobs`

- Description: TODO

<a id="member-134"></a>
##### `oc`

- Description: TODO

<a id="member-135"></a>
##### `adding`

- Description: TODO

<a id="member-136"></a>
##### `current`

- Description: TODO

<a id="member-137"></a>
##### `slot`

- Description: TODO

<a id="member-144"></a>
##### `map`

- Description: TODO

<a id="member-145"></a>
##### `area`

- Description: TODO

<a id="member-146"></a>
##### `lastload`

- Description: TODO

<a id="member-147"></a>
##### `cuts`

- Description: TODO

<a id="member-148"></a>
##### `position`

- Description: TODO

<a id="member-149"></a>
##### `lastload`

- Description: TODO

<a id="member-158"></a>
##### `terrain`

- Description: TODO

<a id="member-159"></a>
##### `main`

- Description: TODO

<a id="member-160"></a>
##### `flavobjs`

- Description: TODO

<a id="member-165"></a>
##### `id`

- Description: TODO

<a id="member-166"></a>
##### `rc`

- Description: TODO

<a id="member-167"></a>
##### `used`

- Description: TODO

<a id="member-168"></a>
##### `base`

- Description: TODO

<a id="member-169"></a>
##### `outl`

- Description: TODO

<a id="member-175"></a>
##### `oltags`

- Description: TODO

<a id="member-176"></a>
##### `ols`

- Description: TODO

<a id="member-178"></a>
##### `gridmat`

- Description: TODO

<a id="member-179"></a>
##### `grid`

- Description: TODO

<a id="member-184"></a>
##### `gridlines`

- Description: TODO

<a id="member-186"></a>
##### `cut`

- Description: TODO

<a id="member-189"></a>
##### `clickmap`

- Description: TODO

<a id="member-190"></a>
##### `grid`

- Description: TODO

<a id="member-196"></a>
##### `smapcc`

- Description: TODO

<a id="member-197"></a>
##### `slist`

- Description: TODO

<a id="member-198"></a>
##### `smap`

- Description: TODO

<a id="member-199"></a>
##### `lsmch`

- Description: TODO

<a id="member-202"></a>
##### `amblight`

- Description: TODO

<a id="member-203"></a>
##### `s_amblight`

- Description: TODO

<a id="member-205"></a>
##### `gprefs`

- Description: TODO

<a id="member-206"></a>
##### `zgrid`

- Description: TODO

<a id="member-207"></a>
##### `maxlights`

- Description: TODO

<a id="member-211"></a>
##### `lighting`

- Description: TODO

<a id="member-213"></a>
##### `amblight_idx`

- Description: TODO

<a id="member-214"></a>
##### `rweather`

- Description: TODO

<a id="member-219"></a>
##### `clickbasic`

- Description: TODO

<a id="member-221"></a>
##### `master`

- Description: TODO

<a id="member-222"></a>
##### `doinst`

- Description: TODO

<a id="member-223"></a>
##### `basic`

- Description: TODO

<a id="member-224"></a>
##### `slots`

- Description: TODO

<a id="member-225"></a>
##### `idmap`

- Description: TODO

<a id="member-226"></a>
##### `curbasic`

- Description: TODO

<a id="member-227"></a>
##### `back`

- Description: TODO

<a id="member-228"></a>
##### `draw`

- Description: TODO

<a id="member-229"></a>
##### `instancer`

- Description: TODO

<a id="member-230"></a>
##### `nextid`

- Description: TODO

<a id="member-231"></a>
##### `bk`

- Description: TODO

<a id="member-232"></a>
##### `id`

- Description: TODO

<a id="member-233"></a>
##### `idp`

- Description: TODO

<a id="member-234"></a>
##### `state`

- Description: TODO

<a id="member-238"></a>
##### `idx_bas`

- Description: TODO

<a id="member-239"></a>
##### `idx_idp`

- Description: TODO

<a id="member-240"></a>
##### `idx_back`

- Description: TODO

<a id="member-241"></a>
##### `back`

- Description: TODO

<a id="member-262"></a>
##### `clmaptree`

- Description: TODO

<a id="member-263"></a>
##### `clmaplist`

- Description: TODO

<a id="member-264"></a>
##### `clobjlist`

- Description: TODO

<a id="member-265"></a>
##### `clickid`

- Description: TODO

<a id="member-266"></a>
##### `clickloc`

- Description: TODO

<a id="member-267"></a>
##### `clickdepth`

- Description: TODO

<a id="member-268"></a>
##### `curclickbasic`

- Description: TODO

<a id="member-271"></a>
##### `gobclfuzz`

- Description: TODO

<a id="member-276"></a>
##### `text`

- Description: TODO

<a id="member-277"></a>
##### `tm`

- Description: TODO

<a id="member-279"></a>
##### `polownertf`

- Description: TODO

<a id="member-280"></a>
##### `polowners`

- Description: TODO

<a id="member-290"></a>
##### `camload`

- Description: TODO

<a id="member-291"></a>
##### `lastload`

- Description: TODO

<a id="member-293"></a>
##### `initload`

- Description: TODO

<a id="member-294"></a>
##### `initdraw`

- Description: TODO

<a id="member-301"></a>
##### `freerot`

- Description: TODO

<a id="member-304"></a>
##### `adjust`

- Description: TODO

<a id="member-305"></a>
##### `lastmc`

- Description: TODO

<a id="member-306"></a>
##### `slot`

- Description: TODO

<a id="member-313"></a>
##### `modflags`

- Description: TODO

<a id="member-317"></a>
##### `olflash`

- Description: TODO

<a id="member-318"></a>
##### `olftimer`

- Description: TODO

<a id="member-322"></a>
##### `pc`

- Description: TODO

<a id="member-327"></a>
##### `pc`

- Description: TODO

<a id="member-328"></a>
##### `mapcl`

- Description: TODO

<a id="member-329"></a>
##### `objcl`

- Description: TODO

<a id="member-330"></a>
##### `dfl`

- Description: TODO

<a id="member-336"></a>
##### `clickb`

- Description: TODO

<a id="member-341"></a>
##### `camdrag`

- Description: TODO

<a id="member-349"></a>
##### `kb_grid`

- Description: TODO

<a id="member-352"></a>
##### `bk`

- Description: TODO

<a id="member-353"></a>
##### `mv`

- Description: TODO

<a id="member-359"></a>
##### `selol`

- Description: TODO

<a id="member-360"></a>
##### `max`

- Description: TODO

<a id="member-361"></a>
##### `sc`

- Description: TODO

<a id="member-362"></a>
##### `modflags`

- Description: TODO

<a id="member-363"></a>
##### `ol`

- Description: TODO

<a id="member-364"></a>
##### `mgrab`

- Description: TODO

<a id="member-365"></a>
##### `tt`

- Description: TODO

<a id="member-366"></a>
##### `xl`

- Description: TODO

<a id="member-376"></a>
##### `cmdmap`

- Description: TODO

#### Methods

<a id="member-17"></a>
##### `public void run(GOut g);`

- Description: TODO

<a id="member-18"></a>
##### `boolean mmousedown(Coord mc, int button);`

- Description: TODO

<a id="member-19"></a>
##### `boolean mmouseup(Coord mc, int button);`

- Description: TODO

<a id="member-20"></a>
##### `boolean mmousewheel(Coord mc, int amount);`

- Description: TODO

<a id="member-21"></a>
##### `void mmousemove(Coord mc);`

- Description: TODO

<a id="member-24"></a>
##### `Camera()`

- Description: TODO

<a id="member-25"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-26"></a>
##### `click(Coord sc)`

- Description: TODO

<a id="member-27"></a>
##### `drag(Coord sc)`

- Description: TODO

<a id="member-28"></a>
##### `release()`

- Description: TODO

<a id="member-29"></a>
##### `wheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-30"></a>
##### `resized()`

- Description: TODO

<a id="member-31"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-32"></a>
##### `public abstract float angle();`

- Description: TODO

<a id="member-33"></a>
##### `public abstract void tick(double dt);`

- Description: TODO

<a id="member-34"></a>
##### `stats()`

- Description: TODO

<a id="member-46"></a>
##### `FollowCam()`

- Description: TODO

<a id="member-47"></a>
##### `resized()`

- Description: TODO

<a id="member-48"></a>
##### `click(Coord c)`

- Description: TODO

<a id="member-49"></a>
##### `drag(Coord c)`

- Description: TODO

<a id="member-56"></a>
##### `field(float elev)`

- Description: TODO

<a id="member-57"></a>
##### `dist(float elev)`

- Description: TODO

<a id="member-58"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-59"></a>
##### `angle()`

- Description: TODO

<a id="member-62"></a>
##### `wheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-63"></a>
##### `stats()`

- Description: TODO

<a id="member-70"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-71"></a>
##### `angle()`

- Description: TODO

<a id="member-72"></a>
##### `click(Coord c)`

- Description: TODO

<a id="member-73"></a>
##### `drag(Coord c)`

- Description: TODO

<a id="member-74"></a>
##### `wheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-86"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-87"></a>
##### `angle()`

- Description: TODO

<a id="member-88"></a>
##### `click(Coord c)`

- Description: TODO

<a id="member-89"></a>
##### `drag(Coord c)`

- Description: TODO

<a id="member-90"></a>
##### `wheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-101"></a>
##### `tick2(double dt)`

- Description: TODO

<a id="member-102"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-103"></a>
##### `angle()`

- Description: TODO

<a id="member-104"></a>
##### `click(Coord c)`

- Description: TODO

<a id="member-105"></a>
##### `drag(Coord c)`

- Description: TODO

<a id="member-106"></a>
##### `stats()`

- Description: TODO

<a id="member-119"></a>
##### `SOrthoCam(String... args)`

- Description: TODO

<a id="member-120"></a>
##### `tick2(double dt)`

- Description: TODO

<a id="member-121"></a>
##### `click(Coord c)`

- Description: TODO

<a id="member-122"></a>
##### `drag(Coord c)`

- Description: TODO

<a id="member-123"></a>
##### `release()`

- Description: TODO

<a id="member-124"></a>
##### `chfield(float nf)`

- Description: TODO

<a id="member-125"></a>
##### `wheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-126"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-127"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-128"></a>
##### `envdispose()`

- Description: TODO

<a id="member-129"></a>
##### `dispose()`

- Description: TODO

<a id="member-130"></a>
##### `visol(String tag)`

- Description: TODO

<a id="member-131"></a>
##### `enol(String tag)`

- Description: TODO

<a id="member-132"></a>
##### `disol(String tag)`

- Description: TODO

<a id="member-138"></a>
##### `addgob(Gob ob)`

- Description: TODO

<a id="member-139"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-140"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-141"></a>
##### `added(Gob ob)`

- Description: TODO

<a id="member-142"></a>
##### `removed(Gob ob)`

- Description: TODO

<a id="member-143"></a>
##### `loading()`

- Description: TODO

<a id="member-150"></a>
##### `Grid(boolean position)`

- Description: TODO

<a id="member-151"></a>
##### `Grid()`

- Description: TODO

<a id="member-152"></a>
##### `abstract T getcut(Coord cc);`

- Description: TODO

<a id="member-153"></a>
##### `produce(T cut)`

- Description: TODO

<a id="member-154"></a>
##### `tick()`

- Description: TODO

<a id="member-155"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-156"></a>
##### `tick()`

- Description: TODO

<a id="member-157"></a>
##### `loading()`

- Description: TODO

<a id="member-161"></a>
##### `Terrain()`

- Description: TODO

<a id="member-162"></a>
##### `tick()`

- Description: TODO

<a id="member-163"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-164"></a>
##### `loading()`

- Description: TODO

<a id="member-170"></a>
##### `Overlay(OverlayInfo id)`

- Description: TODO

<a id="member-171"></a>
##### `tick()`

- Description: TODO

<a id="member-172"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-173"></a>
##### `loading()`

- Description: TODO

<a id="member-174"></a>
##### `remove()`

- Description: TODO

<a id="member-177"></a>
##### `oltick()`

- Description: TODO

<a id="member-180"></a>
##### `GridLines()`

- Description: TODO

<a id="member-181"></a>
##### `tick()`

- Description: TODO

<a id="member-182"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-183"></a>
##### `remove()`

- Description: TODO

<a id="member-185"></a>
##### `showgrid(boolean show)`

- Description: TODO

<a id="member-187"></a>
##### `MapClick(MapMesh cut)`

- Description: TODO

<a id="member-188"></a>
##### `toString()`

- Description: TODO

<a id="member-191"></a>
##### `tick()`

- Description: TODO

<a id="member-192"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-193"></a>
##### `loading()`

- Description: TODO

<a id="member-194"></a>
##### `camstats()`

- Description: TODO

<a id="member-195"></a>
##### `stats()`

- Description: TODO

<a id="member-200"></a>
##### `updsmap(DirLight light)`

- Description: TODO

<a id="member-201"></a>
##### `drawsmap(Render out)`

- Description: TODO

<a id="member-204"></a>
##### `amblight()`

- Description: TODO

<a id="member-208"></a>
##### `LightCompiler(GSettings gprefs)`

- Description: TODO

<a id="member-209"></a>
##### `valid(GSettings prefs)`

- Description: TODO

<a id="member-210"></a>
##### `compile(Object[][] params, Projection proj)`

- Description: TODO

<a id="member-212"></a>
##### `lights()`

- Description: TODO

<a id="member-215"></a>
##### `updweather()`

- Description: TODO

<a id="member-216"></a>
##### `drawadd(RenderTree.Node extra)`

- Description: TODO

<a id="member-217"></a>
##### `player()`

- Description: TODO

<a id="member-218"></a>
##### `getcc()`

- Description: TODO

<a id="member-235"></a>
##### `Clickslot(Slot<? extends Rendered> bk, int id)`

- Description: TODO

<a id="member-236"></a>
##### `obj()`

- Description: TODO

<a id="member-237"></a>
##### `state()`

- Description: TODO

<a id="member-242"></a>
##### `IDState(GroupPipe back)`

- Description: TODO

<a id="member-243"></a>
##### `group(int idx)`

- Description: TODO

<a id="member-244"></a>
##### `gstate(int id)`

- Description: TODO

<a id="member-245"></a>
##### `nstates()`

- Description: TODO

<a id="member-246"></a>
##### `Clicklist(RenderList.Adapter master, boolean doinst)`

- Description: TODO

<a id="member-247"></a>
##### `add(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-248"></a>
##### `remove(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-249"></a>
##### `update(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-250"></a>
##### `update(Pipe group, int[] statemask)`

- Description: TODO

<a id="member-251"></a>
##### `lock()`

- Description: TODO

<a id="member-252"></a>
##### `slots()`

- Description: TODO

<a id="member-253"></a>
##### `add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

<a id="member-254"></a>
##### `remove(RenderList<?> list)`

- Description: TODO

<a id="member-255"></a>
##### `basic(Pipe.Op st)`

- Description: TODO

<a id="member-256"></a>
##### `sz()`

- Description: TODO

<a id="member-257"></a>
##### `draw(Render out)`

- Description: TODO

<a id="member-258"></a>
##### `get(Render out, Coord c, Consumer<ClickData> cb)`

- Description: TODO

<a id="member-259"></a>
##### `fuzzyget(Render out, Coord c, int rad, Consumer<ClickData> cb)`

- Description: TODO

<a id="member-260"></a>
##### `dispose()`

- Description: TODO

<a id="member-261"></a>
##### `stats()`

- Description: TODO

<a id="member-269"></a>
##### `clickbasic(Coord sz)`

- Description: TODO

<a id="member-270"></a>
##### `checkmapclick(Render out, Pipe.Op basic, Coord c, Consumer<Coord2d> cb)`

- Description: TODO

<a id="member-272"></a>
##### `checkgobclick(Render out, Pipe.Op basic, Coord c, Consumer<ClickData> cb)`

- Description: TODO

<a id="member-273"></a>
##### `delay(Delayed d)`

- Description: TODO

<a id="member-274"></a>
##### `delay2(Delayed d)`

- Description: TODO

<a id="member-275"></a>
##### `undelay(Collection<Delayed> list, GOut g)`

- Description: TODO

<a id="member-278"></a>
##### `PolText(Text text, double tm)`

- Description: TODO

<a id="member-281"></a>
##### `setpoltext(int id, String text)`

- Description: TODO

<a id="member-282"></a>
##### `poldraw(GOut g)`

- Description: TODO

<a id="member-283"></a>
##### `drawarrow(GOut g, double a)`

- Description: TODO

<a id="member-284"></a>
##### `clipxf(Coord3f mc, boolean doclip)`

- Description: TODO

<a id="member-285"></a>
##### `screenxf(Coord3f mc)`

- Description: TODO

<a id="member-286"></a>
##### `screenxf(Coord2d mc)`

- Description: TODO

<a id="member-287"></a>
##### `screenangle(Coord2d mc, boolean clip)`

- Description: TODO

<a id="member-288"></a>
##### `partydraw(GOut g)`

- Description: TODO

<a id="member-289"></a>
##### `maindraw(Render out)`

- Description: TODO

<a id="member-292"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-295"></a>
##### `checkload()`

- Description: TODO

<a id="member-296"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-297"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-298"></a>
##### `public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags);`

- Description: TODO

<a id="member-299"></a>
##### `rotate(Plob plob, MouseWheelEvent data, int modflags)`

- Description: TODO

<a id="member-300"></a>
##### `rotate(Plob plob, int amount, int modflags)`

- Description: TODO

<a id="member-302"></a>
##### `adjust(Plob plob, Coord pc, Coord2d mc, int modflags)`

- Description: TODO

<a id="member-303"></a>
##### `rotate(Plob plob, MouseWheelEvent data, int modflags)`

- Description: TODO

<a id="member-307"></a>
##### `Plob(Indir<Resource> res, Message sdt)`

- Description: TODO

<a id="member-308"></a>
##### `mv()`

- Description: TODO

<a id="member-309"></a>
##### `move(Coord2d c, double a)`

- Description: TODO

<a id="member-310"></a>
##### `move(Coord2d c)`

- Description: TODO

<a id="member-311"></a>
##### `move(double a)`

- Description: TODO

<a id="member-312"></a>
##### `place()`

- Description: TODO

<a id="member-314"></a>
##### `Adjust(Coord c, int modflags)`

- Description: TODO

<a id="member-315"></a>
##### `hit(Coord pc, Coord2d mc)`

- Description: TODO

<a id="member-316"></a>
##### `toString()`

- Description: TODO

<a id="member-319"></a>
##### `unflashol()`

- Description: TODO

<a id="member-320"></a>
##### `flashol(Collection<String> ols, double tm)`

- Description: TODO

<a id="member-321"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-323"></a>
##### `Maptest(Coord c)`

- Description: TODO

<a id="member-324"></a>
##### `run()`

- Description: TODO

<a id="member-325"></a>
##### `protected abstract void hit(Coord pc, Coord2d mc);`

- Description: TODO

<a id="member-326"></a>
##### `nohit(Coord pc)`

- Description: TODO

<a id="member-331"></a>
##### `Hittest(Coord c)`

- Description: TODO

<a id="member-332"></a>
##### `run()`

- Description: TODO

<a id="member-333"></a>
##### `ckdone(int fl)`

- Description: TODO

<a id="member-334"></a>
##### `protected abstract void hit(Coord pc, Coord2d mc, ClickData inf);`

- Description: TODO

<a id="member-335"></a>
##### `nohit(Coord pc)`

- Description: TODO

<a id="member-337"></a>
##### `Click(Coord c, int b)`

- Description: TODO

<a id="member-338"></a>
##### `hit(Coord pc, Coord2d mc, ClickData inf)`

- Description: TODO

<a id="member-339"></a>
##### `grab(Grabber grab)`

- Description: TODO

<a id="member-340"></a>
##### `release(Grabber grab)`

- Description: TODO

<a id="member-342"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-343"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-344"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-345"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-346"></a>
##### `drop(final Coord cc, Coord ul)`

- Description: TODO

<a id="member-347"></a>
##### `iteminteract(Coord cc, Coord ul)`

- Description: TODO

<a id="member-348"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-350"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-351"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-354"></a>
##### `GrabXL(Grabber bk)`

- Description: TODO

<a id="member-355"></a>
##### `mmousedown(Coord cc, final int button)`

- Description: TODO

<a id="member-356"></a>
##### `mmouseup(Coord cc, final int button)`

- Description: TODO

<a id="member-357"></a>
##### `mmousewheel(Coord cc, final int amount)`

- Description: TODO

<a id="member-358"></a>
##### `mmousemove(Coord cc)`

- Description: TODO

<a id="member-367"></a>
##### `Selector(Coord max)`

- Description: TODO

<a id="member-368"></a>
##### `mmousedown(Coord mc, int button)`

- Description: TODO

<a id="member-369"></a>
##### `getec(Coord mc)`

- Description: TODO

<a id="member-370"></a>
##### `mmouseup(Coord mc, int button)`

- Description: TODO

<a id="member-371"></a>
##### `mmousewheel(Coord mc, int amount)`

- Description: TODO

<a id="member-372"></a>
##### `mmousemove(Coord mc)`

- Description: TODO

<a id="member-373"></a>
##### `destroy()`

- Description: TODO

<a id="member-374"></a>
##### `makecam(Class<? extends Camera> ct, String... args)`

- Description: TODO

<a id="member-375"></a>
##### `restorecam()`

- Description: TODO

<a id="member-377"></a>
##### `findcmds()`

- Description: TODO

<a id="member-378"></a>
##### `newSelector()`

- Description: TODO

<a id="member-379"></a>
##### `destroySelector()`

- Description: TODO

<a id="member-380"></a>
##### `isPlanningObject()`

- Description: TODO

<a id="member-381"></a>
##### `public void waitPlanObject() throws InterruptedException`

- Description: TODO## Rules

- `MapView` reference ownership should live in the bridge layer, not in `AppContext`.
- map-view reads and map-view message sending should stay in one interaction area.
- bridge helpers should keep raw Haven access narrow and hand structured results to runtime/waypoint code.
