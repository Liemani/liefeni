# MCache

## Meta

- Source: [MCache.java](../../../src/haven/MCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Caches map grids and world tile data.

## Code Members

### Member Index

#### Fields

- [tilesz](#member-1)
- [tilesz2](#member-2)
- [cmaps](#member-3)
- [cutsz](#member-4)
- [cutn](#member-5)
- [setmon](#member-6)
- [sets](#member-7)
- [csets](#member-8)
- [tiles](#member-9)
- [gridwait](#member-10)
- [req](#member-11)
- [grids](#member-12)
- [sess](#member-13)
- [ols](#member-14)
- [olseq](#member-15)
- [chseq](#member-16)
- [fragbufs](#member-17)
- [gc](#member-18)
- [map](#member-19)
- [lastreq](#member-22)
- [reqs](#member-23)
- [parent](#member-29)
- [map](#member-32)
- [trn](#member-33)
- [mapplace](#member-34)
- [trnplace](#member-35)
- [tags](#member-39)
- [matid](#member-40)
- [omatid](#member-41)
- [id](#member-54)
- [a](#member-55)
- [gc](#member-64)
- [ul](#member-65)
- [tiles](#member-66)
- [z](#member-67)
- [ols](#member-68)
- [ol](#member-69)
- [id](#member-70)
- [seq](#member-71)
- [removed](#member-72)
- [olseq](#member-73)
- [cuts](#member-74)
- [def](#member-75)
- [val](#member-76)
- [inited](#member-77)
- [cc](#member-85)
- [mesh](#member-86)
- [fo](#member-87)
- [ols](#member-88)
- [olols](#member-89)
- [mats](#member-97)
- [all](#member-98)
- [fill_plots](#member-118)
- [cached](#member-130)
- [zsurf](#member-140)

#### Methods

- [LoadingMap(MCache map, Coord gc)](#member-20)
- [waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-21)
- [getz(Coord tc)](#member-24)
- [getz(Coord2d pc)](#member-25)
- [getnorm(Coord2d pc)](#member-26)
- [getnormt(Coord2d pc)](#member-27)
- [getnormp(Coord2d pc)](#member-28)
- [SurfaceID(SurfaceID parent)](#member-30)
- [hasparent(SurfaceID p)](#member-31)
- [public Collection<String> tags();](#member-36)
- [public Material mat();](#member-37)
- [omat()](#member-38)
- [ResOverlay(Resource res, Message buf)](#member-42)
- [init()](#member-43)
- [tags()](#member-44)
- [mat()](#member-45)
- [omat()](#member-46)
- [toString()](#member-47)
- [public OverlayInfo id();](#member-48)
- [public void fill(Area a, boolean[] buf);](#member-49)
- [filter(Area a)](#member-50)
- [tick()](#member-51)
- [add(LocalOverlay ol)](#member-52)
- [remove(LocalOverlay ol)](#member-53)
- [RectOverlay(OverlayInfo id, Area a)](#member-56)
- [id()](#member-57)
- [filter(Area b)](#member-58)
- [fill(Area b, boolean[] buf)](#member-59)
- [update(Area a)](#member-60)
- [Overlay(Area a, OverlayInfo id)](#member-61)
- [destroy()](#member-62)
- [cktileid(int id)](#member-63)
- [get()](#member-78)
- [update(T val)](#member-79)
- [cur()](#member-80)
- [rebuild()](#member-81)
- [dispose()](#member-82)
- [protected abstract T build();](#member-83)
- [protected abstract String message();](#member-84)
- [Cut(Coord cc)](#member-90)
- [invalidate()](#member-91)
- [dispose()](#member-92)
- [Grid(Coord gc)](#member-93)
- [gettile(Coord tc)](#member-94)
- [getz(Coord tc)](#member-95)
- [getol(OverlayInfo id, Area a, boolean[] buf)](#member-96)
- [Flavobjs(Map<NodeWrap, Collection<Gob>> flavobjs)](#member-99)
- [added(RenderTree.Slot slot)](#member-100)
- [tick(double dt)](#member-101)
- [gtick(Render g)](#member-102)
- [makeflavor(Coord cutc)](#member-103)
- [getfo(Coord cc)](#member-104)
- [geticut(Coord cc)](#member-105)
- [getcut(Coord cc)](#member-106)
- [getolcut(OverlayInfo id, Coord cc)](#member-107)
- [getololcut(OverlayInfo id, Coord cc)](#member-108)
- [ivneigh(Coord nc)](#member-109)
- [tick(double dt)](#member-110)
- [gtick(Render g)](#member-111)
- [invalidate()](#member-112)
- [dispose()](#member-113)
- [filltiles(Message buf)](#member-114)
- [filltiles2(Message buf)](#member-115)
- [filltiles3(Message buf)](#member-116)
- [fillz(Message buf)](#member-117)
- [decplots(Message buf)](#member-119)
- [fillplots(Message buf)](#member-120)
- [subfill(Message msg)](#member-121)
- [fill(Message msg)](#member-122)
- [getfz(Coord c)](#member-123)
- [tileset(int i)](#member-124)
- [tiler(int i)](#member-125)
- [ctick(double dt)](#member-126)
- [gtick(Render g)](#member-127)
- [invalidate(Coord cc)](#member-128)
- [invalblob(Message msg)](#member-129)
- [getgrid(Coord gc)](#member-131)
- [getgridt(Coord tc)](#member-132)
- [gettile(Coord tc)](#member-133)
- [getfz(Coord tc)](#member-134)
- [getcz(double px, double py)](#member-135)
- [getcz(Coord2d pc)](#member-136)
- [getcz(float px, float py)](#member-137)
- [getcz(Coord pc)](#member-138)
- [getzp(Coord2d pc)](#member-139)
- [getz(SurfaceID id, Coord tc)](#member-141)
- [getz(SurfaceID id, Coord2d pc)](#member-142)
- [getzp(SurfaceID id, Coord2d pc)](#member-143)
- [getnorm(SurfaceID id, Coord2d pc)](#member-144)
- [getols(Area a)](#member-145)
- [getol(OverlayInfo id, Area a, boolean[] buf)](#member-146)
- [getcut(Coord cc)](#member-147)
- [getfo(Coord cc)](#member-148)
- [getolcut(OverlayInfo id, Coord cc)](#member-149)
- [getololcut(OverlayInfo id, Coord cc)](#member-150)
- [mapdata2(Message msg)](#member-151)
- [mapdata(Message msg)](#member-152)
- [tilesetr(int i)](#member-153)
- [tileset(int i)](#member-154)
- [tiler(int i)](#member-155)
- [trimall()](#member-156)
- [trim(Coord ul, Coord lr)](#member-157)
- [request(Coord gc)](#member-158)
- [reqarea(Coord ul, Coord br)](#member-159)
- [sendreqs()](#member-160)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `tilesz`

- Description: TODO

<a id="member-2"></a>
##### `tilesz2`

- Description: TODO

<a id="member-3"></a>
##### `cmaps`

- Description: TODO

<a id="member-4"></a>
##### `cutsz`

- Description: TODO

<a id="member-5"></a>
##### `cutn`

- Description: TODO

<a id="member-6"></a>
##### `setmon`

- Description: TODO

<a id="member-7"></a>
##### `sets`

- Description: TODO

<a id="member-8"></a>
##### `csets`

- Description: TODO

<a id="member-9"></a>
##### `tiles`

- Description: TODO

<a id="member-10"></a>
##### `gridwait`

- Description: TODO

<a id="member-11"></a>
##### `req`

- Description: TODO

<a id="member-12"></a>
##### `grids`

- Description: TODO

<a id="member-13"></a>
##### `sess`

- Description: TODO

<a id="member-14"></a>
##### `ols`

- Description: TODO

<a id="member-15"></a>
##### `olseq`

- Description: TODO

<a id="member-16"></a>
##### `chseq`

- Description: TODO

<a id="member-17"></a>
##### `fragbufs`

- Description: TODO

<a id="member-18"></a>
##### `gc`

- Description: TODO

<a id="member-19"></a>
##### `map`

- Description: TODO

<a id="member-22"></a>
##### `lastreq`

- Description: TODO

<a id="member-23"></a>
##### `reqs`

- Description: TODO

<a id="member-29"></a>
##### `parent`

- Description: TODO

<a id="member-32"></a>
##### `map`

- Description: TODO

<a id="member-33"></a>
##### `trn`

- Description: TODO

<a id="member-34"></a>
##### `mapplace`

- Description: TODO

<a id="member-35"></a>
##### `trnplace`

- Description: TODO

<a id="member-39"></a>
##### `tags`

- Description: TODO

<a id="member-40"></a>
##### `matid`

- Description: TODO

<a id="member-41"></a>
##### `omatid`

- Description: TODO

<a id="member-54"></a>
##### `id`

- Description: TODO

<a id="member-55"></a>
##### `a`

- Description: TODO

<a id="member-64"></a>
##### `gc`

- Description: TODO

<a id="member-65"></a>
##### `ul`

- Description: TODO

<a id="member-66"></a>
##### `tiles`

- Description: TODO

<a id="member-67"></a>
##### `z`

- Description: TODO

<a id="member-68"></a>
##### `ols`

- Description: TODO

<a id="member-69"></a>
##### `ol`

- Description: TODO

<a id="member-70"></a>
##### `id`

- Description: TODO

<a id="member-71"></a>
##### `seq`

- Description: TODO

<a id="member-72"></a>
##### `removed`

- Description: TODO

<a id="member-73"></a>
##### `olseq`

- Description: TODO

<a id="member-74"></a>
##### `cuts`

- Description: TODO

<a id="member-75"></a>
##### `def`

- Description: TODO

<a id="member-76"></a>
##### `val`

- Description: TODO

<a id="member-77"></a>
##### `inited`

- Description: TODO

<a id="member-85"></a>
##### `cc`

- Description: TODO

<a id="member-86"></a>
##### `mesh`

- Description: TODO

<a id="member-87"></a>
##### `fo`

- Description: TODO

<a id="member-88"></a>
##### `ols`

- Description: TODO

<a id="member-89"></a>
##### `olols`

- Description: TODO

<a id="member-97"></a>
##### `mats`

- Description: TODO

<a id="member-98"></a>
##### `all`

- Description: TODO

<a id="member-118"></a>
##### `fill_plots`

- Description: TODO

<a id="member-130"></a>
##### `cached`

- Description: TODO

<a id="member-140"></a>
##### `zsurf`

- Description: TODO

#### Methods

<a id="member-20"></a>
##### `LoadingMap(MCache map, Coord gc)`

- Description: TODO

<a id="member-21"></a>
##### `waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-24"></a>
##### `getz(Coord tc)`

- Description: TODO

<a id="member-25"></a>
##### `getz(Coord2d pc)`

- Description: TODO

<a id="member-26"></a>
##### `getnorm(Coord2d pc)`

- Description: TODO

<a id="member-27"></a>
##### `getnormt(Coord2d pc)`

- Description: TODO

<a id="member-28"></a>
##### `getnormp(Coord2d pc)`

- Description: TODO

<a id="member-30"></a>
##### `SurfaceID(SurfaceID parent)`

- Description: TODO

<a id="member-31"></a>
##### `hasparent(SurfaceID p)`

- Description: TODO

<a id="member-36"></a>
##### `public Collection<String> tags();`

- Description: TODO

<a id="member-37"></a>
##### `public Material mat();`

- Description: TODO

<a id="member-38"></a>
##### `omat()`

- Description: TODO

<a id="member-42"></a>
##### `ResOverlay(Resource res, Message buf)`

- Description: TODO

<a id="member-43"></a>
##### `init()`

- Description: TODO

<a id="member-44"></a>
##### `tags()`

- Description: TODO

<a id="member-45"></a>
##### `mat()`

- Description: TODO

<a id="member-46"></a>
##### `omat()`

- Description: TODO

<a id="member-47"></a>
##### `toString()`

- Description: TODO

<a id="member-48"></a>
##### `public OverlayInfo id();`

- Description: TODO

<a id="member-49"></a>
##### `public void fill(Area a, boolean[] buf);`

- Description: TODO

<a id="member-50"></a>
##### `filter(Area a)`

- Description: TODO

<a id="member-51"></a>
##### `tick()`

- Description: TODO

<a id="member-52"></a>
##### `add(LocalOverlay ol)`

- Description: TODO

<a id="member-53"></a>
##### `remove(LocalOverlay ol)`

- Description: TODO

<a id="member-56"></a>
##### `RectOverlay(OverlayInfo id, Area a)`

- Description: TODO

<a id="member-57"></a>
##### `id()`

- Description: TODO

<a id="member-58"></a>
##### `filter(Area b)`

- Description: TODO

<a id="member-59"></a>
##### `fill(Area b, boolean[] buf)`

- Description: TODO

<a id="member-60"></a>
##### `update(Area a)`

- Description: TODO

<a id="member-61"></a>
##### `Overlay(Area a, OverlayInfo id)`

- Description: TODO

<a id="member-62"></a>
##### `destroy()`

- Description: TODO

<a id="member-63"></a>
##### `cktileid(int id)`

- Description: TODO

<a id="member-78"></a>
##### `get()`

- Description: TODO

<a id="member-79"></a>
##### `update(T val)`

- Description: TODO

<a id="member-80"></a>
##### `cur()`

- Description: TODO

<a id="member-81"></a>
##### `rebuild()`

- Description: TODO

<a id="member-82"></a>
##### `dispose()`

- Description: TODO

<a id="member-83"></a>
##### `protected abstract T build();`

- Description: TODO

<a id="member-84"></a>
##### `protected abstract String message();`

- Description: TODO

<a id="member-90"></a>
##### `Cut(Coord cc)`

- Description: TODO

<a id="member-91"></a>
##### `invalidate()`

- Description: TODO

<a id="member-92"></a>
##### `dispose()`

- Description: TODO

<a id="member-93"></a>
##### `Grid(Coord gc)`

- Description: TODO

<a id="member-94"></a>
##### `gettile(Coord tc)`

- Description: TODO

<a id="member-95"></a>
##### `getz(Coord tc)`

- Description: TODO

<a id="member-96"></a>
##### `getol(OverlayInfo id, Area a, boolean[] buf)`

- Description: TODO

<a id="member-99"></a>
##### `Flavobjs(Map<NodeWrap, Collection<Gob>> flavobjs)`

- Description: TODO

<a id="member-100"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-101"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-102"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-103"></a>
##### `makeflavor(Coord cutc)`

- Description: TODO

<a id="member-104"></a>
##### `getfo(Coord cc)`

- Description: TODO

<a id="member-105"></a>
##### `geticut(Coord cc)`

- Description: TODO

<a id="member-106"></a>
##### `getcut(Coord cc)`

- Description: TODO

<a id="member-107"></a>
##### `getolcut(OverlayInfo id, Coord cc)`

- Description: TODO

<a id="member-108"></a>
##### `getololcut(OverlayInfo id, Coord cc)`

- Description: TODO

<a id="member-109"></a>
##### `ivneigh(Coord nc)`

- Description: TODO

<a id="member-110"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-111"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-112"></a>
##### `invalidate()`

- Description: TODO

<a id="member-113"></a>
##### `dispose()`

- Description: TODO

<a id="member-114"></a>
##### `filltiles(Message buf)`

- Description: TODO

<a id="member-115"></a>
##### `filltiles2(Message buf)`

- Description: TODO

<a id="member-116"></a>
##### `filltiles3(Message buf)`

- Description: TODO

<a id="member-117"></a>
##### `fillz(Message buf)`

- Description: TODO

<a id="member-119"></a>
##### `decplots(Message buf)`

- Description: TODO

<a id="member-120"></a>
##### `fillplots(Message buf)`

- Description: TODO

<a id="member-121"></a>
##### `subfill(Message msg)`

- Description: TODO

<a id="member-122"></a>
##### `fill(Message msg)`

- Description: TODO

<a id="member-123"></a>
##### `getfz(Coord c)`

- Description: TODO

<a id="member-124"></a>
##### `tileset(int i)`

- Description: TODO

<a id="member-125"></a>
##### `tiler(int i)`

- Description: TODO

<a id="member-126"></a>
##### `ctick(double dt)`

- Description: TODO

<a id="member-127"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-128"></a>
##### `invalidate(Coord cc)`

- Description: TODO

<a id="member-129"></a>
##### `invalblob(Message msg)`

- Description: TODO

<a id="member-131"></a>
##### `getgrid(Coord gc)`

- Description: TODO

<a id="member-132"></a>
##### `getgridt(Coord tc)`

- Description: TODO

<a id="member-133"></a>
##### `gettile(Coord tc)`

- Description: TODO

<a id="member-134"></a>
##### `getfz(Coord tc)`

- Description: TODO

<a id="member-135"></a>
##### `getcz(double px, double py)`

- Description: TODO

<a id="member-136"></a>
##### `getcz(Coord2d pc)`

- Description: TODO

<a id="member-137"></a>
##### `getcz(float px, float py)`

- Description: TODO

<a id="member-138"></a>
##### `getcz(Coord pc)`

- Description: TODO

<a id="member-139"></a>
##### `getzp(Coord2d pc)`

- Description: TODO

<a id="member-141"></a>
##### `getz(SurfaceID id, Coord tc)`

- Description: TODO

<a id="member-142"></a>
##### `getz(SurfaceID id, Coord2d pc)`

- Description: TODO

<a id="member-143"></a>
##### `getzp(SurfaceID id, Coord2d pc)`

- Description: TODO

<a id="member-144"></a>
##### `getnorm(SurfaceID id, Coord2d pc)`

- Description: TODO

<a id="member-145"></a>
##### `getols(Area a)`

- Description: TODO

<a id="member-146"></a>
##### `getol(OverlayInfo id, Area a, boolean[] buf)`

- Description: TODO

<a id="member-147"></a>
##### `getcut(Coord cc)`

- Description: TODO

<a id="member-148"></a>
##### `getfo(Coord cc)`

- Description: TODO

<a id="member-149"></a>
##### `getolcut(OverlayInfo id, Coord cc)`

- Description: TODO

<a id="member-150"></a>
##### `getololcut(OverlayInfo id, Coord cc)`

- Description: TODO

<a id="member-151"></a>
##### `mapdata2(Message msg)`

- Description: TODO

<a id="member-152"></a>
##### `mapdata(Message msg)`

- Description: TODO

<a id="member-153"></a>
##### `tilesetr(int i)`

- Description: TODO

<a id="member-154"></a>
##### `tileset(int i)`

- Description: TODO

<a id="member-155"></a>
##### `tiler(int i)`

- Description: TODO

<a id="member-156"></a>
##### `trimall()`

- Description: TODO

<a id="member-157"></a>
##### `trim(Coord ul, Coord lr)`

- Description: TODO

<a id="member-158"></a>
##### `request(Coord gc)`

- Description: TODO

<a id="member-159"></a>
##### `reqarea(Coord ul, Coord br)`

- Description: TODO

<a id="member-160"></a>
##### `sendreqs()`

- Description: TODO
