# MiniMap

## Meta

- Source: [MiniMap.java](../../../src/haven/MiniMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the minimap.

## Code Members

### Member Index

#### Fields

- [bg](#member-1)
- [nomap](#member-2)
- [plp](#member-3)
- [file](#member-4)
- [markers](#member-5)
- [curloc](#member-6)
- [sessloc](#member-7)
- [iconconf](#member-8)
- [icons](#member-9)
- [setloc](#member-10)
- [follow](#member-11)
- [zoomlevel](#member-12)
- [maglevel](#member-13)
- [display](#member-14)
- [dgext](#member-15)
- [dtext](#member-16)
- [dseg](#member-17)
- [dlvl](#member-18)
- [dmag](#member-19)
- [dloc](#member-20)
- [seg](#member-22)
- [tc](#member-23)
- [sess](#member-27)
- [lastgrid](#member-28)
- [lastloc](#member-29)
- [mv](#member-32)
- [seg](#member-35)
- [tc](#member-36)
- [o](#member-39)
- [m](#member-40)
- [loader](#member-41)
- [load](#member-42)
- [icon](#member-43)
- [lseq](#member-44)
- [iseq](#member-45)
- [ctxr](#member-47)
- [info](#member-54)
- [mm](#member-56)
- [seq](#member-57)
- [icons](#member-58)
- [mseq](#member-59)
- [updater](#member-60)
- [loading](#member-61)
- [sesslocator](#member-71)
- [cc](#member-75)
- [f](#member-76)
- [notifcol](#member-79)
- [attr](#member-80)
- [gob](#member-81)
- [icon](#member-82)
- [conf](#member-83)
- [rc](#member-84)
- [sc](#member-85)
- [ang](#member-86)
- [z](#member-87)
- [stime](#member-88)
- [ntime](#member-89)
- [notify](#member-90)
- [snotify](#member-91)
- [markchecked](#member-92)
- [mark](#member-98)
- [res](#member-101)
- [fg](#member-102)
- [bg](#member-103)
- [cc](#member-104)
- [col](#member-105)
- [name](#member-106)
- [mm](#member-113)
- [m](#member-114)
- [sc](#member-115)
- [tseq](#member-120)
- [tooltip](#member-121)
- [mm](#member-123)
- [file](#member-124)
- [seg](#member-125)
- [sc](#member-126)
- [mapext](#member-127)
- [gref](#member-128)
- [dc](#member-129)
- [img](#member-130)
- [nextimg](#member-131)
- [src](#member-133)
- [cgrid](#member-134)
- [next](#member-135)
- [img](#member-136)
- [img_c](#member-139)
- [olimg_c](#member-141)
- [markers](#member-143)
- [markerseq](#member-144)
- [drag](#member-172)
- [dragging](#member-173)
- [dsc](#member-174)
- [dmc](#member-175)
- [dsloc](#member-177)
- [dsicon](#member-178)
- [dsmark](#member-179)
- [lasttname](#member-185)
- [lastobjid](#member-186)
- [lasttip](#member-187)

#### Methods

- [attached()](#member-21)
- [Location(Segment seg, Coord tc)](#member-24)
- [toString()](#member-25)
- [Location locate(MapFile file) throws Loading;](#member-26)
- [SessionLocator(Session sess)](#member-30)
- [locate(MapFile file)](#member-31)
- [MapLocator(MapView mv)](#member-33)
- [locate(MapFile file)](#member-34)
- [SpecLocator(long seg, Coord tc)](#member-37)
- [locate(MapFile file)](#member-38)
- [MarkerIcon(Markers o, Marker m)](#member-46)
- [context(Class<T> cl)](#member-48)
- [create()](#member-49)
- [ckload()](#member-50)
- [update()](#member-51)
- [icon()](#member-52)
- [name()](#member-53)
- [info()](#member-55)
- [Markers(MiniMap mm)](#member-62)
- [update0()](#member-63)
- [update()](#member-64)
- [get(Marker m)](#member-65)
- [known()](#member-66)
- [center(Location loc)](#member-67)
- [resolve(Locator loc)](#member-68)
- [xlate(Location loc)](#member-69)
- [xlate(Coord sc)](#member-70)
- [tick(double dt)](#member-72)
- [center(Locator loc)](#member-73)
- [follow(Locator loc)](#member-74)
- [Scale2D(Coord cc, float f)](#member-77)
- [apply(Pipe buf)](#member-78)
- [DisplayIcon(GobIcon attr, GobIcon.Setting conf)](#member-93)
- [update(Coord2d rc, double ang)](#member-94)
- [dispupdate()](#member-95)
- [draw(GOut g)](#member-96)
- [force()](#member-97)
- [MarkerID(Gob gob, Marker mark)](#member-99)
- [find(OCache oc, Marker mark)](#member-100)
- [Flag(OwnerContext owner, Color col, String name)](#member-107)
- [name()](#member-108)
- [image()](#member-109)
- [draw(GOut g, Coord c)](#member-110)
- [checkhit(Coord c)](#member-111)
- [id()](#member-112)
- [DisplayMarker(MiniMap mm, Marker marker)](#member-116)
- [icon()](#member-117)
- [dispupdate()](#member-118)
- [draw(GOut g, Coord c)](#member-119)
- [tooltip()](#member-122)
- [DisplayGrid(MiniMap mm, Segment seg, Coord sc, int lvl, Indir<? extends DataGrid> gref)](#member-132)
- [CachedImage(Function<DataGrid, Defer.Future<Tex>> src)](#member-137)
- [get()](#member-138)
- [img()](#member-140)
- [olimg(String tag)](#member-142)
- [markers(boolean remark)](#member-145)
- [l2dscale(Coord c)](#member-146)
- [d2lscale(Coord c)](#member-147)
- [st2c(Coord tc)](#member-148)
- [p2c(Coord2d pc)](#member-149)
- [redisplay(Location loc)](#member-150)
- [drawgrid(GOut g, Coord ul, DisplayGrid disp)](#member-151)
- [drawmap(GOut g)](#member-152)
- [drawmarkers(GOut g)](#member-153)
- [findicons(Collection<? extends DisplayIcon> prev)](#member-154)
- [drawicons(GOut g)](#member-155)
- [remparty()](#member-156)
- [drawparty(GOut g)](#member-157)
- [drawparts(GOut g)](#member-158)
- [draw(GOut g)](#member-159)
- [hascomplete(DisplayGrid[] disp, Area dext, Coord c)](#member-160)
- [allowzoomout()](#member-161)
- [iconat(Coord c)](#member-162)
- [gridat(Coord sc)](#member-163)
- [findmarker(Marker rm)](#member-164)
- [markerat(Coord tc)](#member-165)
- [markobjs()](#member-166)
- [filter(DisplayIcon icon)](#member-167)
- [filter(DisplayMarker marker)](#member-168)
- [clickloc(Location loc, int button, boolean press)](#member-169)
- [clickicon(DisplayIcon icon, Location loc, int button, boolean press)](#member-170)
- [clickmarker(DisplayMarker mark, Location loc, int button, boolean press)](#member-171)
- [dragp(int button)](#member-176)
- [mousedown(MouseDownEvent ev)](#member-180)
- [mousemove(MouseMoveEvent ev)](#member-181)
- [mouseup(MouseUpEvent ev)](#member-182)
- [mousewheel(MouseWheelEvent ev)](#member-183)
- [mousehover(MouseHoverEvent ev, boolean hovering)](#member-184)
- [tooltip(Coord c, Widget prev)](#member-188)
- [mvclick(MapView mv, Coord mc, Location loc, Gob gob, int button)](#member-189)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bg`

- Description: TODO

<a id="member-2"></a>
##### `nomap`

- Description: TODO

<a id="member-3"></a>
##### `plp`

- Description: TODO

<a id="member-4"></a>
##### `file`

- Description: TODO

<a id="member-5"></a>
##### `markers`

- Description: TODO

<a id="member-6"></a>
##### `curloc`

- Description: TODO

<a id="member-7"></a>
##### `sessloc`

- Description: TODO

<a id="member-8"></a>
##### `iconconf`

- Description: TODO

<a id="member-9"></a>
##### `icons`

- Description: TODO

<a id="member-10"></a>
##### `setloc`

- Description: TODO

<a id="member-11"></a>
##### `follow`

- Description: TODO

<a id="member-12"></a>
##### `zoomlevel`

- Description: TODO

<a id="member-13"></a>
##### `maglevel`

- Description: TODO

<a id="member-14"></a>
##### `display`

- Description: TODO

<a id="member-15"></a>
##### `dgext`

- Description: TODO

<a id="member-16"></a>
##### `dtext`

- Description: TODO

<a id="member-17"></a>
##### `dseg`

- Description: TODO

<a id="member-18"></a>
##### `dlvl`

- Description: TODO

<a id="member-19"></a>
##### `dmag`

- Description: TODO

<a id="member-20"></a>
##### `dloc`

- Description: TODO

<a id="member-22"></a>
##### `seg`

- Description: TODO

<a id="member-23"></a>
##### `tc`

- Description: TODO

<a id="member-27"></a>
##### `sess`

- Description: TODO

<a id="member-28"></a>
##### `lastgrid`

- Description: TODO

<a id="member-29"></a>
##### `lastloc`

- Description: TODO

<a id="member-32"></a>
##### `mv`

- Description: TODO

<a id="member-35"></a>
##### `seg`

- Description: TODO

<a id="member-36"></a>
##### `tc`

- Description: TODO

<a id="member-39"></a>
##### `o`

- Description: TODO

<a id="member-40"></a>
##### `m`

- Description: TODO

<a id="member-41"></a>
##### `loader`

- Description: TODO

<a id="member-42"></a>
##### `load`

- Description: TODO

<a id="member-43"></a>
##### `icon`

- Description: TODO

<a id="member-44"></a>
##### `lseq`

- Description: TODO

<a id="member-45"></a>
##### `iseq`

- Description: TODO

<a id="member-47"></a>
##### `ctxr`

- Description: TODO

<a id="member-54"></a>
##### `info`

- Description: TODO

<a id="member-56"></a>
##### `mm`

- Description: TODO

<a id="member-57"></a>
##### `seq`

- Description: TODO

<a id="member-58"></a>
##### `icons`

- Description: TODO

<a id="member-59"></a>
##### `mseq`

- Description: TODO

<a id="member-60"></a>
##### `updater`

- Description: TODO

<a id="member-61"></a>
##### `loading`

- Description: TODO

<a id="member-71"></a>
##### `sesslocator`

- Description: TODO

<a id="member-75"></a>
##### `cc`

- Description: TODO

<a id="member-76"></a>
##### `f`

- Description: TODO

<a id="member-79"></a>
##### `notifcol`

- Description: TODO

<a id="member-80"></a>
##### `attr`

- Description: TODO

<a id="member-81"></a>
##### `gob`

- Description: TODO

<a id="member-82"></a>
##### `icon`

- Description: TODO

<a id="member-83"></a>
##### `conf`

- Description: TODO

<a id="member-84"></a>
##### `rc`

- Description: TODO

<a id="member-85"></a>
##### `sc`

- Description: TODO

<a id="member-86"></a>
##### `ang`

- Description: TODO

<a id="member-87"></a>
##### `z`

- Description: TODO

<a id="member-88"></a>
##### `stime`

- Description: TODO

<a id="member-89"></a>
##### `ntime`

- Description: TODO

<a id="member-90"></a>
##### `notify`

- Description: TODO

<a id="member-91"></a>
##### `snotify`

- Description: TODO

<a id="member-92"></a>
##### `markchecked`

- Description: TODO

<a id="member-98"></a>
##### `mark`

- Description: TODO

<a id="member-101"></a>
##### `res`

- Description: TODO

<a id="member-102"></a>
##### `fg`

- Description: TODO

<a id="member-103"></a>
##### `bg`

- Description: TODO

<a id="member-104"></a>
##### `cc`

- Description: TODO

<a id="member-105"></a>
##### `col`

- Description: TODO

<a id="member-106"></a>
##### `name`

- Description: TODO

<a id="member-113"></a>
##### `mm`

- Description: TODO

<a id="member-114"></a>
##### `m`

- Description: TODO

<a id="member-115"></a>
##### `sc`

- Description: TODO

<a id="member-120"></a>
##### `tseq`

- Description: TODO

<a id="member-121"></a>
##### `tooltip`

- Description: TODO

<a id="member-123"></a>
##### `mm`

- Description: TODO

<a id="member-124"></a>
##### `file`

- Description: TODO

<a id="member-125"></a>
##### `seg`

- Description: TODO

<a id="member-126"></a>
##### `sc`

- Description: TODO

<a id="member-127"></a>
##### `mapext`

- Description: TODO

<a id="member-128"></a>
##### `gref`

- Description: TODO

<a id="member-129"></a>
##### `dc`

- Description: TODO

<a id="member-130"></a>
##### `img`

- Description: TODO

<a id="member-131"></a>
##### `nextimg`

- Description: TODO

<a id="member-133"></a>
##### `src`

- Description: TODO

<a id="member-134"></a>
##### `cgrid`

- Description: TODO

<a id="member-135"></a>
##### `next`

- Description: TODO

<a id="member-136"></a>
##### `img`

- Description: TODO

<a id="member-139"></a>
##### `img_c`

- Description: TODO

<a id="member-141"></a>
##### `olimg_c`

- Description: TODO

<a id="member-143"></a>
##### `markers`

- Description: TODO

<a id="member-144"></a>
##### `markerseq`

- Description: TODO

<a id="member-172"></a>
##### `drag`

- Description: TODO

<a id="member-173"></a>
##### `dragging`

- Description: TODO

<a id="member-174"></a>
##### `dsc`

- Description: TODO

<a id="member-175"></a>
##### `dmc`

- Description: TODO

<a id="member-177"></a>
##### `dsloc`

- Description: TODO

<a id="member-178"></a>
##### `dsicon`

- Description: TODO

<a id="member-179"></a>
##### `dsmark`

- Description: TODO

<a id="member-185"></a>
##### `lasttname`

- Description: TODO

<a id="member-186"></a>
##### `lastobjid`

- Description: TODO

<a id="member-187"></a>
##### `lasttip`

- Description: TODO

#### Methods

<a id="member-21"></a>
##### `attached()`

- Description: TODO

<a id="member-24"></a>
##### `Location(Segment seg, Coord tc)`

- Description: TODO

<a id="member-25"></a>
##### `toString()`

- Description: TODO

<a id="member-26"></a>
##### `Location locate(MapFile file) throws Loading;`

- Description: TODO

<a id="member-30"></a>
##### `SessionLocator(Session sess)`

- Description: TODO

<a id="member-31"></a>
##### `locate(MapFile file)`

- Description: TODO

<a id="member-33"></a>
##### `MapLocator(MapView mv)`

- Description: TODO

<a id="member-34"></a>
##### `locate(MapFile file)`

- Description: TODO

<a id="member-37"></a>
##### `SpecLocator(long seg, Coord tc)`

- Description: TODO

<a id="member-38"></a>
##### `locate(MapFile file)`

- Description: TODO

<a id="member-46"></a>
##### `MarkerIcon(Markers o, Marker m)`

- Description: TODO

<a id="member-48"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-49"></a>
##### `create()`

- Description: TODO

<a id="member-50"></a>
##### `ckload()`

- Description: TODO

<a id="member-51"></a>
##### `update()`

- Description: TODO

<a id="member-52"></a>
##### `icon()`

- Description: TODO

<a id="member-53"></a>
##### `name()`

- Description: TODO

<a id="member-55"></a>
##### `info()`

- Description: TODO

<a id="member-62"></a>
##### `Markers(MiniMap mm)`

- Description: TODO

<a id="member-63"></a>
##### `update0()`

- Description: TODO

<a id="member-64"></a>
##### `update()`

- Description: TODO

<a id="member-65"></a>
##### `get(Marker m)`

- Description: TODO

<a id="member-66"></a>
##### `known()`

- Description: TODO

<a id="member-67"></a>
##### `center(Location loc)`

- Description: TODO

<a id="member-68"></a>
##### `resolve(Locator loc)`

- Description: TODO

<a id="member-69"></a>
##### `xlate(Location loc)`

- Description: TODO

<a id="member-70"></a>
##### `xlate(Coord sc)`

- Description: TODO

<a id="member-72"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-73"></a>
##### `center(Locator loc)`

- Description: TODO

<a id="member-74"></a>
##### `follow(Locator loc)`

- Description: TODO

<a id="member-77"></a>
##### `Scale2D(Coord cc, float f)`

- Description: TODO

<a id="member-78"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-93"></a>
##### `DisplayIcon(GobIcon attr, GobIcon.Setting conf)`

- Description: TODO

<a id="member-94"></a>
##### `update(Coord2d rc, double ang)`

- Description: TODO

<a id="member-95"></a>
##### `dispupdate()`

- Description: TODO

<a id="member-96"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-97"></a>
##### `force()`

- Description: TODO

<a id="member-99"></a>
##### `MarkerID(Gob gob, Marker mark)`

- Description: TODO

<a id="member-100"></a>
##### `find(OCache oc, Marker mark)`

- Description: TODO

<a id="member-107"></a>
##### `Flag(OwnerContext owner, Color col, String name)`

- Description: TODO

<a id="member-108"></a>
##### `name()`

- Description: TODO

<a id="member-109"></a>
##### `image()`

- Description: TODO

<a id="member-110"></a>
##### `draw(GOut g, Coord c)`

- Description: TODO

<a id="member-111"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-112"></a>
##### `id()`

- Description: TODO

<a id="member-116"></a>
##### `DisplayMarker(MiniMap mm, Marker marker)`

- Description: TODO

<a id="member-117"></a>
##### `icon()`

- Description: TODO

<a id="member-118"></a>
##### `dispupdate()`

- Description: TODO

<a id="member-119"></a>
##### `draw(GOut g, Coord c)`

- Description: TODO

<a id="member-122"></a>
##### `tooltip()`

- Description: TODO

<a id="member-132"></a>
##### `DisplayGrid(MiniMap mm, Segment seg, Coord sc, int lvl, Indir<? extends DataGrid> gref)`

- Description: TODO

<a id="member-137"></a>
##### `CachedImage(Function<DataGrid, Defer.Future<Tex>> src)`

- Description: TODO

<a id="member-138"></a>
##### `get()`

- Description: TODO

<a id="member-140"></a>
##### `img()`

- Description: TODO

<a id="member-142"></a>
##### `olimg(String tag)`

- Description: TODO

<a id="member-145"></a>
##### `markers(boolean remark)`

- Description: TODO

<a id="member-146"></a>
##### `l2dscale(Coord c)`

- Description: TODO

<a id="member-147"></a>
##### `d2lscale(Coord c)`

- Description: TODO

<a id="member-148"></a>
##### `st2c(Coord tc)`

- Description: TODO

<a id="member-149"></a>
##### `p2c(Coord2d pc)`

- Description: TODO

<a id="member-150"></a>
##### `redisplay(Location loc)`

- Description: TODO

<a id="member-151"></a>
##### `drawgrid(GOut g, Coord ul, DisplayGrid disp)`

- Description: TODO

<a id="member-152"></a>
##### `drawmap(GOut g)`

- Description: TODO

<a id="member-153"></a>
##### `drawmarkers(GOut g)`

- Description: TODO

<a id="member-154"></a>
##### `findicons(Collection<? extends DisplayIcon> prev)`

- Description: TODO

<a id="member-155"></a>
##### `drawicons(GOut g)`

- Description: TODO

<a id="member-156"></a>
##### `remparty()`

- Description: TODO

<a id="member-157"></a>
##### `drawparty(GOut g)`

- Description: TODO

<a id="member-158"></a>
##### `drawparts(GOut g)`

- Description: TODO

<a id="member-159"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-160"></a>
##### `hascomplete(DisplayGrid[] disp, Area dext, Coord c)`

- Description: TODO

<a id="member-161"></a>
##### `allowzoomout()`

- Description: TODO

<a id="member-162"></a>
##### `iconat(Coord c)`

- Description: TODO

<a id="member-163"></a>
##### `gridat(Coord sc)`

- Description: TODO

<a id="member-164"></a>
##### `findmarker(Marker rm)`

- Description: TODO

<a id="member-165"></a>
##### `markerat(Coord tc)`

- Description: TODO

<a id="member-166"></a>
##### `markobjs()`

- Description: TODO

<a id="member-167"></a>
##### `filter(DisplayIcon icon)`

- Description: TODO

<a id="member-168"></a>
##### `filter(DisplayMarker marker)`

- Description: TODO

<a id="member-169"></a>
##### `clickloc(Location loc, int button, boolean press)`

- Description: TODO

<a id="member-170"></a>
##### `clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-171"></a>
##### `clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-176"></a>
##### `dragp(int button)`

- Description: TODO

<a id="member-180"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-181"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-182"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-183"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-184"></a>
##### `mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

<a id="member-188"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-189"></a>
##### `mvclick(MapView mv, Coord mc, Location loc, Gob gob, int button)`

- Description: TODO
