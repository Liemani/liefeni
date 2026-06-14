# MapWnd

## Meta

- Source: [MapWnd.java](../../../src/haven/MapWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the map window.

## Code Members

### Member Index

#### Fields

- [markcurs](#member-1)
- [file](#member-2)
- [view](#member-3)
- [mv](#member-4)
- [tool](#member-5)
- [overlays](#member-6)
- [markcfg](#member-7)
- [cmarkers](#member-8)
- [player](#member-9)
- [toolbar](#member-10)
- [viewf](#member-11)
- [mvmarks](#member-12)
- [colsel](#member-13)
- [onmapbtn](#member-14)
- [mremove](#member-15)
- [mflt](#member-16)
- [mcmp](#member-17)
- [markers](#member-18)
- [markerseq](#member-19)
- [mrefocus](#member-20)
- [olalpha](#member-21)
- [deferred](#member-22)
- [pmarkers](#member-23)
- [smarkers](#member-24)
- [namecmp](#member-25)
- [typecmp](#member-26)
- [kb_home](#member-27)
- [kb_mark](#member-28)
- [kb_hmark](#member-29)
- [kb_compact](#member-30)
- [kb_prov](#member-31)
- [sc](#member-35)
- [drag](#member-39)
- [dragc](#member-40)
- [btnw](#member-44)
- [list](#member-45)
- [listf](#member-46)
- [pmbtn](#member-47)
- [smbtn](#member-48)
- [nobtn](#member-49)
- [tobtn](#member-50)
- [mebtn](#member-51)
- [mibtn](#member-52)
- [namesel](#member-53)
- [grab](#member-64)
- [iconsz](#member-79)
- [types](#member-80)
- [col](#member-84)
- [icon](#member-85)
- [spec](#member-93)
- [icon](#member-94)
- [showall](#member-102)
- [hideall](#member-103)
- [sel](#member-104)
- [showsel](#member-105)
- [mark](#member-116)
- [type](#member-117)
- [lm](#member-122)
- [flag](#member-139)
- [mm](#member-140)
- [dcurrent](#member-141)
- [acurrent](#member-142)
- [curloc](#member-143)
- [loading](#member-144)
- [area](#member-146)
- [markerseq](#member-147)
- [th](#member-155)
- [prog](#member-156)
- [th](#member-164)
- [prog](#member-165)
- [sprog](#member-166)
- [cmdmap](#member-178)

#### Methods

- [added()](#member-32)
- [remove()](#member-33)
- [toggleol(String tag, boolean a)](#member-34)
- [ViewFrame()](#member-36)
- [resize(Coord sz)](#member-37)
- [draw(GOut g)](#member-38)
- [mousedown(MouseDownEvent ev)](#member-41)
- [mousemove(MouseMoveEvent ev)](#member-42)
- [mouseup(MouseUpEvent ev)](#member-43)
- [Toolbox()](#member-54)
- [resize(int h)](#member-55)
- [View(MapFile file)](#member-56)
- [drawgrid(GOut g, Coord ul, DisplayGrid disp)](#member-57)
- [filter(DisplayMarker mark)](#member-58)
- [clickmarker(DisplayMarker mark, Location loc, int button, boolean press)](#member-59)
- [clickicon(DisplayIcon icon, Location loc, int button, boolean press)](#member-60)
- [clickloc(Location loc, int button, boolean press)](#member-61)
- [mousedown(MouseDownEvent ev)](#member-62)
- [draw(GOut g)](#member-63)
- [MarkButton()](#member-65)
- [state()](#member-66)
- [click()](#member-67)
- [mark(Location loc, boolean onmap)](#member-68)
- [ungrab()](#member-69)
- [FindMark(MapView mv, Coord c)](#member-70)
- [hit(Coord pc, Coord2d mc)](#member-71)
- [PlaceMarker(Coord c)](#member-72)
- [PlaceMarker(PlaceMarker from, Coord c)](#member-73)
- [derive(Coord c)](#member-74)
- [shandle(Widget w)](#member-75)
- [mousedown(MouseDownEvent ev)](#member-76)
- [getcurs(CursorQuery ev)](#member-77)
- [tick(double dt)](#member-78)
- [public abstract Tex icon();](#member-81)
- [of(Marker mark)](#member-82)
- [compareTo(MarkerType that)](#member-83)
- [PMarkerType(Color col)](#member-86)
- [icon()](#member-87)
- [equals(PMarkerType that)](#member-88)
- [equals(Object that)](#member-89)
- [hashCode()](#member-90)
- [compareTo(PMarkerType that)](#member-91)
- [compareTo(MarkerType that)](#member-92)
- [SMarkerType(Resource.Saved spec)](#member-95)
- [icon()](#member-96)
- [equals(SMarkerType that)](#member-97)
- [equals(Object that)](#member-98)
- [hashCode()](#member-99)
- [compareTo(SMarkerType that)](#member-100)
- [compareTo(MarkerType that)](#member-101)
- [MarkerConfig()](#member-106)
- [MarkerConfig(MarkerConfig from)](#member-107)
- [showsel(boolean showsel)](#member-108)
- [add(MarkerType type)](#member-109)
- [remove(MarkerType type)](#member-110)
- [toggle(MarkerType type)](#member-111)
- [filter(MarkerType type)](#member-112)
- [filter(Marker mark)](#member-113)
- [equals(MarkerConfig that)](#member-114)
- [equals(Object that)](#member-115)
- [ListMarker(Marker mark)](#member-118)
- [MarkerList(Coord sz)](#member-119)
- [allitems()](#member-120)
- [searchmatch(ListMarker lm, String txt)](#member-121)
- [Item(Coord sz, ListMarker lm)](#member-123)
- [img()](#member-124)
- [text()](#member-125)
- [valid(String text)](#member-126)
- [drawicon(GOut g)](#member-127)
- [mousedown(MouseDownEvent ev)](#member-128)
- [makeitem(ListMarker lm, int idx, Coord sz)](#member-129)
- [toggletype(MarkerType type)](#member-130)
- [change(ListMarker lm)](#member-131)
- [change2(ListMarker lm)](#member-132)
- [resize(Coord sz)](#member-133)
- [compact()](#member-134)
- [compact(boolean a)](#member-135)
- [recenter()](#member-136)
- [focus(Marker m)](#member-137)
- [makedeco()](#member-138)
- [MarkerObjs(MapWnd mm)](#member-145)
- [updatepos()](#member-148)
- [updateobjs()](#member-149)
- [ticker()](#member-150)
- [autotick(double dt)](#member-151)
- [autogtick(Render out)](#member-152)
- [remove()](#member-153)
- [markobj(long gobid, UID oid, Indir<Resource> resid, byte[] data, String nm)](#member-154)
- [ExportWindow()](#member-157)
- [run(Thread th)](#member-158)
- [cdraw(GOut g)](#member-159)
- [cancel()](#member-160)
- [tick(double dt)](#member-161)
- [grid(int cs, int ns, int cg, int ng)](#member-162)
- [mark(int cm, int nm)](#member-163)
- [ImportWindow()](#member-167)
- [run(Thread th)](#member-168)
- [cdraw(GOut g)](#member-169)
- [cancel()](#member-170)
- [tick(double dt)](#member-171)
- [prog(String prog)](#member-172)
- [sprog(double sprog)](#member-173)
- [exportmap(Path path)](#member-174)
- [importmap(Path path)](#member-175)
- [exportmap()](#member-176)
- [importmap()](#member-177)
- [findcmds()](#member-179)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `markcurs`

- Description: TODO

<a id="member-2"></a>
##### `file`

- Description: TODO

<a id="member-3"></a>
##### `view`

- Description: TODO

<a id="member-4"></a>
##### `mv`

- Description: TODO

<a id="member-5"></a>
##### `tool`

- Description: TODO

<a id="member-6"></a>
##### `overlays`

- Description: TODO

<a id="member-7"></a>
##### `markcfg`

- Description: TODO

<a id="member-8"></a>
##### `cmarkers`

- Description: TODO

<a id="member-9"></a>
##### `player`

- Description: TODO

<a id="member-10"></a>
##### `toolbar`

- Description: TODO

<a id="member-11"></a>
##### `viewf`

- Description: TODO

<a id="member-12"></a>
##### `mvmarks`

- Description: TODO

<a id="member-13"></a>
##### `colsel`

- Description: TODO

<a id="member-14"></a>
##### `onmapbtn`

- Description: TODO

<a id="member-15"></a>
##### `mremove`

- Description: TODO

<a id="member-16"></a>
##### `mflt`

- Description: TODO

<a id="member-17"></a>
##### `mcmp`

- Description: TODO

<a id="member-18"></a>
##### `markers`

- Description: TODO

<a id="member-19"></a>
##### `markerseq`

- Description: TODO

<a id="member-20"></a>
##### `mrefocus`

- Description: TODO

<a id="member-21"></a>
##### `olalpha`

- Description: TODO

<a id="member-22"></a>
##### `deferred`

- Description: TODO

<a id="member-23"></a>
##### `pmarkers`

- Description: TODO

<a id="member-24"></a>
##### `smarkers`

- Description: TODO

<a id="member-25"></a>
##### `namecmp`

- Description: TODO

<a id="member-26"></a>
##### `typecmp`

- Description: TODO

<a id="member-27"></a>
##### `kb_home`

- Description: TODO

<a id="member-28"></a>
##### `kb_mark`

- Description: TODO

<a id="member-29"></a>
##### `kb_hmark`

- Description: TODO

<a id="member-30"></a>
##### `kb_compact`

- Description: TODO

<a id="member-31"></a>
##### `kb_prov`

- Description: TODO

<a id="member-35"></a>
##### `sc`

- Description: TODO

<a id="member-39"></a>
##### `drag`

- Description: TODO

<a id="member-40"></a>
##### `dragc`

- Description: TODO

<a id="member-44"></a>
##### `btnw`

- Description: TODO

<a id="member-45"></a>
##### `list`

- Description: TODO

<a id="member-46"></a>
##### `listf`

- Description: TODO

<a id="member-47"></a>
##### `pmbtn`

- Description: TODO

<a id="member-48"></a>
##### `smbtn`

- Description: TODO

<a id="member-49"></a>
##### `nobtn`

- Description: TODO

<a id="member-50"></a>
##### `tobtn`

- Description: TODO

<a id="member-51"></a>
##### `mebtn`

- Description: TODO

<a id="member-52"></a>
##### `mibtn`

- Description: TODO

<a id="member-53"></a>
##### `namesel`

- Description: TODO

<a id="member-64"></a>
##### `grab`

- Description: TODO

<a id="member-79"></a>
##### `iconsz`

- Description: TODO

<a id="member-80"></a>
##### `types`

- Description: TODO

<a id="member-84"></a>
##### `col`

- Description: TODO

<a id="member-85"></a>
##### `icon`

- Description: TODO

<a id="member-93"></a>
##### `spec`

- Description: TODO

<a id="member-94"></a>
##### `icon`

- Description: TODO

<a id="member-102"></a>
##### `showall`

- Description: TODO

<a id="member-103"></a>
##### `hideall`

- Description: TODO

<a id="member-104"></a>
##### `sel`

- Description: TODO

<a id="member-105"></a>
##### `showsel`

- Description: TODO

<a id="member-116"></a>
##### `mark`

- Description: TODO

<a id="member-117"></a>
##### `type`

- Description: TODO

<a id="member-122"></a>
##### `lm`

- Description: TODO

<a id="member-139"></a>
##### `flag`

- Description: TODO

<a id="member-140"></a>
##### `mm`

- Description: TODO

<a id="member-141"></a>
##### `dcurrent`

- Description: TODO

<a id="member-142"></a>
##### `acurrent`

- Description: TODO

<a id="member-143"></a>
##### `curloc`

- Description: TODO

<a id="member-144"></a>
##### `loading`

- Description: TODO

<a id="member-146"></a>
##### `area`

- Description: TODO

<a id="member-147"></a>
##### `markerseq`

- Description: TODO

<a id="member-155"></a>
##### `th`

- Description: TODO

<a id="member-156"></a>
##### `prog`

- Description: TODO

<a id="member-164"></a>
##### `th`

- Description: TODO

<a id="member-165"></a>
##### `prog`

- Description: TODO

<a id="member-166"></a>
##### `sprog`

- Description: TODO

<a id="member-178"></a>
##### `cmdmap`

- Description: TODO

#### Methods

<a id="member-32"></a>
##### `added()`

- Description: TODO

<a id="member-33"></a>
##### `remove()`

- Description: TODO

<a id="member-34"></a>
##### `toggleol(String tag, boolean a)`

- Description: TODO

<a id="member-36"></a>
##### `ViewFrame()`

- Description: TODO

<a id="member-37"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-38"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-41"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-42"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-43"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-54"></a>
##### `Toolbox()`

- Description: TODO

<a id="member-55"></a>
##### `resize(int h)`

- Description: TODO

<a id="member-56"></a>
##### `View(MapFile file)`

- Description: TODO

<a id="member-57"></a>
##### `drawgrid(GOut g, Coord ul, DisplayGrid disp)`

- Description: TODO

<a id="member-58"></a>
##### `filter(DisplayMarker mark)`

- Description: TODO

<a id="member-59"></a>
##### `clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-60"></a>
##### `clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

<a id="member-61"></a>
##### `clickloc(Location loc, int button, boolean press)`

- Description: TODO

<a id="member-62"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-63"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-65"></a>
##### `MarkButton()`

- Description: TODO

<a id="member-66"></a>
##### `state()`

- Description: TODO

<a id="member-67"></a>
##### `click()`

- Description: TODO

<a id="member-68"></a>
##### `mark(Location loc, boolean onmap)`

- Description: TODO

<a id="member-69"></a>
##### `ungrab()`

- Description: TODO

<a id="member-70"></a>
##### `FindMark(MapView mv, Coord c)`

- Description: TODO

<a id="member-71"></a>
##### `hit(Coord pc, Coord2d mc)`

- Description: TODO

<a id="member-72"></a>
##### `PlaceMarker(Coord c)`

- Description: TODO

<a id="member-73"></a>
##### `PlaceMarker(PlaceMarker from, Coord c)`

- Description: TODO

<a id="member-74"></a>
##### `derive(Coord c)`

- Description: TODO

<a id="member-75"></a>
##### `shandle(Widget w)`

- Description: TODO

<a id="member-76"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-77"></a>
##### `getcurs(CursorQuery ev)`

- Description: TODO

<a id="member-78"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-81"></a>
##### `public abstract Tex icon();`

- Description: TODO

<a id="member-82"></a>
##### `of(Marker mark)`

- Description: TODO

<a id="member-83"></a>
##### `compareTo(MarkerType that)`

- Description: TODO

<a id="member-86"></a>
##### `PMarkerType(Color col)`

- Description: TODO

<a id="member-87"></a>
##### `icon()`

- Description: TODO

<a id="member-88"></a>
##### `equals(PMarkerType that)`

- Description: TODO

<a id="member-89"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-90"></a>
##### `hashCode()`

- Description: TODO

<a id="member-91"></a>
##### `compareTo(PMarkerType that)`

- Description: TODO

<a id="member-92"></a>
##### `compareTo(MarkerType that)`

- Description: TODO

<a id="member-95"></a>
##### `SMarkerType(Resource.Saved spec)`

- Description: TODO

<a id="member-96"></a>
##### `icon()`

- Description: TODO

<a id="member-97"></a>
##### `equals(SMarkerType that)`

- Description: TODO

<a id="member-98"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-99"></a>
##### `hashCode()`

- Description: TODO

<a id="member-100"></a>
##### `compareTo(SMarkerType that)`

- Description: TODO

<a id="member-101"></a>
##### `compareTo(MarkerType that)`

- Description: TODO

<a id="member-106"></a>
##### `MarkerConfig()`

- Description: TODO

<a id="member-107"></a>
##### `MarkerConfig(MarkerConfig from)`

- Description: TODO

<a id="member-108"></a>
##### `showsel(boolean showsel)`

- Description: TODO

<a id="member-109"></a>
##### `add(MarkerType type)`

- Description: TODO

<a id="member-110"></a>
##### `remove(MarkerType type)`

- Description: TODO

<a id="member-111"></a>
##### `toggle(MarkerType type)`

- Description: TODO

<a id="member-112"></a>
##### `filter(MarkerType type)`

- Description: TODO

<a id="member-113"></a>
##### `filter(Marker mark)`

- Description: TODO

<a id="member-114"></a>
##### `equals(MarkerConfig that)`

- Description: TODO

<a id="member-115"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-118"></a>
##### `ListMarker(Marker mark)`

- Description: TODO

<a id="member-119"></a>
##### `MarkerList(Coord sz)`

- Description: TODO

<a id="member-120"></a>
##### `allitems()`

- Description: TODO

<a id="member-121"></a>
##### `searchmatch(ListMarker lm, String txt)`

- Description: TODO

<a id="member-123"></a>
##### `Item(Coord sz, ListMarker lm)`

- Description: TODO

<a id="member-124"></a>
##### `img()`

- Description: TODO

<a id="member-125"></a>
##### `text()`

- Description: TODO

<a id="member-126"></a>
##### `valid(String text)`

- Description: TODO

<a id="member-127"></a>
##### `drawicon(GOut g)`

- Description: TODO

<a id="member-128"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-129"></a>
##### `makeitem(ListMarker lm, int idx, Coord sz)`

- Description: TODO

<a id="member-130"></a>
##### `toggletype(MarkerType type)`

- Description: TODO

<a id="member-131"></a>
##### `change(ListMarker lm)`

- Description: TODO

<a id="member-132"></a>
##### `change2(ListMarker lm)`

- Description: TODO

<a id="member-133"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-134"></a>
##### `compact()`

- Description: TODO

<a id="member-135"></a>
##### `compact(boolean a)`

- Description: TODO

<a id="member-136"></a>
##### `recenter()`

- Description: TODO

<a id="member-137"></a>
##### `focus(Marker m)`

- Description: TODO

<a id="member-138"></a>
##### `makedeco()`

- Description: TODO

<a id="member-145"></a>
##### `MarkerObjs(MapWnd mm)`

- Description: TODO

<a id="member-148"></a>
##### `updatepos()`

- Description: TODO

<a id="member-149"></a>
##### `updateobjs()`

- Description: TODO

<a id="member-150"></a>
##### `ticker()`

- Description: TODO

<a id="member-151"></a>
##### `autotick(double dt)`

- Description: TODO

<a id="member-152"></a>
##### `autogtick(Render out)`

- Description: TODO

<a id="member-153"></a>
##### `remove()`

- Description: TODO

<a id="member-154"></a>
##### `markobj(long gobid, UID oid, Indir<Resource> resid, byte[] data, String nm)`

- Description: TODO

<a id="member-157"></a>
##### `ExportWindow()`

- Description: TODO

<a id="member-158"></a>
##### `run(Thread th)`

- Description: TODO

<a id="member-159"></a>
##### `cdraw(GOut g)`

- Description: TODO

<a id="member-160"></a>
##### `cancel()`

- Description: TODO

<a id="member-161"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-162"></a>
##### `grid(int cs, int ns, int cg, int ng)`

- Description: TODO

<a id="member-163"></a>
##### `mark(int cm, int nm)`

- Description: TODO

<a id="member-167"></a>
##### `ImportWindow()`

- Description: TODO

<a id="member-168"></a>
##### `run(Thread th)`

- Description: TODO

<a id="member-169"></a>
##### `cdraw(GOut g)`

- Description: TODO

<a id="member-170"></a>
##### `cancel()`

- Description: TODO

<a id="member-171"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-172"></a>
##### `prog(String prog)`

- Description: TODO

<a id="member-173"></a>
##### `sprog(double sprog)`

- Description: TODO

<a id="member-174"></a>
##### `exportmap(Path path)`

- Description: TODO

<a id="member-175"></a>
##### `importmap(Path path)`

- Description: TODO

<a id="member-176"></a>
##### `exportmap()`

- Description: TODO

<a id="member-177"></a>
##### `importmap()`

- Description: TODO

<a id="member-179"></a>
##### `findcmds()`

- Description: TODO
