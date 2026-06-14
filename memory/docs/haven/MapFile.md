# MapFile

## Meta

- Source: [MapFile.java](../../../src/haven/MapFile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Stores map file data and markers.

## State

- `gridinfo: BackCache<Long, MapFile.GridInfo>`
  - cache keyed by `Long` Haven grid id
  - each entry tracks the grid's segment id and stored scene coordinate

## Nested Types

## GridInfo

- `id: long`
  - Haven `MCache.Grid.id`
- `seg: long`
  - Haven `MapFile.Segment.id` for the grid's containing segment
- `sc: Coord`
  - stored scene coordinate for the grid inside the segment

`seg` is the segment id used by `MapFile.Segment` and is the value later mapped to waypoint `map_segment.id`.

## Code Members

### Member Index

#### Constants

- [EXPORT_SIG](#member-175)

#### Fields

- [mapbase](#member-1)
- [debug](#member-2)
- [store](#member-3)
- [filename](#member-4)
- [knownsegs](#member-5)
- [markers](#member-6)
- [markerseq](#member-7)
- [lock](#member-8)
- [rnd](#member-9)
- [id](#member-20)
- [seg](#member-21)
- [sc](#member-22)
- [gridinfo](#member-24)
- [procmon](#member-28)
- [processor](#member-29)
- [updqueue](#member-30)
- [dirty](#member-31)
- [gdirty](#member-32)
- [file](#member-36)
- [seg](#member-37)
- [tc](#member-38)
- [nm](#member-39)
- [seq](#member-40)
- [color](#member-43)
- [onmap](#member-44)
- [oid](#member-47)
- [res](#member-48)
- [data](#member-49)
- [res](#member-58)
- [prio](#member-59)
- [olid](#member-61)
- [ol](#member-62)
- [tilesets](#member-65)
- [tiles](#member-66)
- [zmap](#member-67)
- [ols](#member-68)
- [mtime](#member-69)
- [notile](#member-83)
- [nogrid](#member-84)
- [id](#member-85)
- [norepl](#member-86)
- [useq](#member-87)
- [seg](#member-94)
- [lvl](#member-95)
- [sc](#member-96)
- [lvl](#member-106)
- [c](#member-107)
- [id](#member-112)
- [map](#member-113)
- [cache](#member-114)
- [ccache](#member-115)
- [zcache](#member-116)
- [loaded](#member-119)
- [loading](#member-120)
- [sc](#member-127)
- [cur](#member-128)
- [zc](#member-132)
- [loaded](#member-133)
- [got](#member-134)
- [loading](#member-135)
- [seg](#member-142)
- [grids](#member-143)
- [nsets](#member-144)
- [tilesets](#member-145)
- [tiles](#member-146)
- [grid](#member-148)
- [gc](#member-149)
- [tilemap](#member-150)
- [cachedgc](#member-157)
- [cached](#member-158)
- [segments](#member-164)
- [all](#member-170)
- [gid](#member-178)
- [segid](#member-179)
- [mtime](#member-180)
- [sc](#member-181)
- [tilesets](#member-182)
- [tiles](#member-183)
- [zmap](#member-184)
- [ols](#member-185)
- [all](#member-191)
- [readonly](#member-192)
- [segs](#member-193)
- [filter](#member-194)
- [curseg](#member-195)
- [offs](#member-196)
- [nseg](#member-197)
- [noff](#member-198)
- [inout](#member-209)

#### Methods

- [checklock()](#member-10)
- [mangle(String datum)](#member-11)
- [private InputStream sfetch(String ctl, Object... args) throws IOException](#member-12)
- [private OutputStream sstore(String ctl, Object... args) throws IOException](#member-13)
- [warn(Throwable cause, String msg)](#member-14)
- [warn(Throwable cause, String fmt, Object... args)](#member-15)
- [warn(String fmt, Object... args)](#member-16)
- [public static MapFile load(ResCache store, String filename) throws IOException](#member-17)
- [save()](#member-18)
- [defersave()](#member-19)
- [GridInfo(long id, long seg, Coord sc)](#member-23)
- [locked(Runnable r, Lock lock)](#member-25)
- [locked(Defer.Callable<A> f, Lock lock)](#member-26)
- [locked(Function<A, R> f, Lock lock)](#member-27)
- [Processor()](#member-33)
- [run()](#member-34)
- [process()](#member-35)
- [Marker(MapFile file, long seg, Coord tc, String nm)](#member-41)
- [update(boolean save)](#member-42)
- [PMarker(MapFile file, long seg, Coord tc, String nm, Color color, boolean onmap)](#member-45)
- [toString()](#member-46)
- [SMarker(MapFile file, long seg, Coord tc, String nm, UID oid, Resource.Saved res, byte[] data)](#member-50)
- [toString()](#member-51)
- [loadmarker(Message fp)](#member-52)
- [savemarker(Message fp, Marker mark)](#member-53)
- [add(Marker mark)](#member-54)
- [remove(Marker mark)](#member-55)
- [update(Marker mark)](#member-56)
- [smarker(String resnm, long seg, Coord tc)](#member-57)
- [TileInfo(Resource.Saved res, int prio)](#member-60)
- [Overlay(Resource.Saved olid, boolean[] ol)](#member-63)
- [get(Coord c)](#member-64)
- [DataGrid(TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)](#member-70)
- [gettile(Coord c)](#member-71)
- [getfz(Coord c)](#member-72)
- [tiletex(int t, BufferedImage[] texes, boolean[] cached)](#member-73)
- [render(Coord off)](#member-74)
- [olcol(MCache.OverlayInfo olid)](#member-75)
- [olrender(Coord off, String tag)](#member-76)
- [savetiles(Message fp, TileInfo[] tilesets, int[] tiles)](#member-77)
- [loadtiles(Message fp, int ver)](#member-78)
- [savez(Message fp, float[] zmap)](#member-79)
- [loadz(Message fp, String nm)](#member-80)
- [saveols(Message fp, Collection<Overlay> ols)](#member-81)
- [loadols(Collection<Overlay> buf, Message fp, String nm)](#member-82)
- [Grid(long id, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)](#member-88)
- [from(MCache map, MCache.Grid cg)](#member-89)
- [mergeprev(Grid prev)](#member-90)
- [save(Message fp)](#member-91)
- [save(MapFile file)](#member-92)
- [load(MapFile file, long id)](#member-93)
- [ZoomGrid(long seg, int lvl, Coord sc, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)](#member-97)
- [fetch(MapFile file, Segment seg, int lvl, Coord sc)](#member-98)
- [fetchg(MapFile file, Segment seg, int lvl, Coord sc)](#member-99)
- [from(MapFile file, Segment seg, int lvl, Coord sc)](#member-100)
- [zoomols(Collection<Overlay> buf, DataGrid[] lower)](#member-101)
- [save(Message fp)](#member-102)
- [save(MapFile file)](#member-103)
- [load(MapFile file, long seg, int lvl, Coord sc)](#member-104)
- [inval(MapFile file, long seg, Coord sc)](#member-105)
- [ZoomCoord(int lvl, Coord c)](#member-108)
- [hashCode()](#member-109)
- [equals(Object o)](#member-110)
- [toString()](#member-111)
- [Segment(long id)](#member-117)
- [file()](#member-118)
- [Cached(Future<Grid> loading)](#member-121)
- [get()](#member-122)
- [loaded(long id)](#member-123)
- [loadgrid(long id)](#member-124)
- [grid0(long id)](#member-125)
- [grid(long id)](#member-126)
- [ByCoord(Coord sc, Cached cur)](#member-129)
- [get()](#member-130)
- [loadzgrid(ZoomCoord zc)](#member-131)
- [ByZCoord(ZoomCoord zc, Future<ZoomGrid> loading)](#member-136)
- [get()](#member-137)
- [grid(Coord gc)](#member-138)
- [grid(int lvl, Coord gc)](#member-139)
- [include(long id, Coord sc)](#member-140)
- [include(Grid grid, Coord sc)](#member-141)
- [View(Segment seg)](#member-147)
- [GridMap(Grid grid, Coord gc)](#member-151)
- [addgrid(Coord gc)](#member-152)
- [TileSort()](#member-153)
- [pick(Collection<String> from)](#member-154)
- [pickbad()](#member-155)
- [fin()](#member-156)
- [getgrid(Coord gc)](#member-159)
- [gettile(Coord tc)](#member-160)
- [getfz(Coord tc)](#member-161)
- [tileset(int n)](#member-162)
- [tiler(int n)](#member-163)
- [merge(Segment dst, Segment src, Coord soff)](#member-165)
- [update(MCache map, Collection<MCache.Grid> grids)](#member-166)
- [public boolean includeseg(long id);](#member-167)
- [public boolean includegrid(Segment seg, Coord sc, long id);](#member-168)
- [public boolean includemark(Marker mark);](#member-169)
- [segment(long sid)](#member-171)
- [around(Marker mark, double rad)](#member-172)
- [grid(int cs, int ns, int cg, int ng)](#member-173)
- [mark(int cm, int nm)](#member-174)
- [public void export(Message out, ExportFilter filter, ExportStatus prog) throws InterruptedException](#member-176)
- [public void export(OutputStream out, ExportFilter filter, ExportStatus prog) throws InterruptedException](#member-177)
- [ImportedGrid(Message data)](#member-186)
- [togrid()](#member-187)
- [public boolean includegrid(ImportedGrid grid, boolean hasprev);](#member-188)
- [public boolean includemark(Marker mark, Marker prev);](#member-189)
- [handleerror(RuntimeException exc, String ctx)](#member-190)
- [Importer(ImportFilter filter)](#member-199)
- [flush()](#member-200)
- [chseg(Segment nseg)](#member-201)
- [chseg(long id)](#member-202)
- [importgrid(Message data)](#member-203)
- [prevmark(Marker mark)](#member-204)
- [importmark(Message data)](#member-205)
- [void reimport(Message data) throws InterruptedException](#member-206)
- [public void reimport(Message data, ImportFilter filter) throws InterruptedException](#member-207)
- [public void reimport(InputStream fp, ImportFilter filter) throws InterruptedException](#member-208)
- [update(MCache map, Coord cgc)](#member-210)

### Member Reference

#### Constants

<a id="member-175"></a>
##### `EXPORT_SIG`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `mapbase`

- Description: TODO

<a id="member-2"></a>
##### `debug`

- Description: TODO

<a id="member-3"></a>
##### `store`

- Description: TODO

<a id="member-4"></a>
##### `filename`

- Description: TODO

<a id="member-5"></a>
##### `knownsegs`

- Description: TODO

<a id="member-6"></a>
##### `markers`

- Description: TODO

<a id="member-7"></a>
##### `markerseq`

- Description: TODO

<a id="member-8"></a>
##### `lock`

- Description: TODO

<a id="member-9"></a>
##### `rnd`

- Description: TODO

<a id="member-20"></a>
##### `id`

- Description: TODO

<a id="member-21"></a>
##### `seg`

- Description: TODO

<a id="member-22"></a>
##### `sc`

- Description: TODO

<a id="member-24"></a>
##### `gridinfo`

- Description: TODO

<a id="member-28"></a>
##### `procmon`

- Description: TODO

<a id="member-29"></a>
##### `processor`

- Description: TODO

<a id="member-30"></a>
##### `updqueue`

- Description: TODO

<a id="member-31"></a>
##### `dirty`

- Description: TODO

<a id="member-32"></a>
##### `gdirty`

- Description: TODO

<a id="member-36"></a>
##### `file`

- Description: TODO

<a id="member-37"></a>
##### `seg`

- Description: TODO

<a id="member-38"></a>
##### `tc`

- Description: TODO

<a id="member-39"></a>
##### `nm`

- Description: TODO

<a id="member-40"></a>
##### `seq`

- Description: TODO

<a id="member-43"></a>
##### `color`

- Description: TODO

<a id="member-44"></a>
##### `onmap`

- Description: TODO

<a id="member-47"></a>
##### `oid`

- Description: TODO

<a id="member-48"></a>
##### `res`

- Description: TODO

<a id="member-49"></a>
##### `data`

- Description: TODO

<a id="member-58"></a>
##### `res`

- Description: TODO

<a id="member-59"></a>
##### `prio`

- Description: TODO

<a id="member-61"></a>
##### `olid`

- Description: TODO

<a id="member-62"></a>
##### `ol`

- Description: TODO

<a id="member-65"></a>
##### `tilesets`

- Description: TODO

<a id="member-66"></a>
##### `tiles`

- Description: TODO

<a id="member-67"></a>
##### `zmap`

- Description: TODO

<a id="member-68"></a>
##### `ols`

- Description: TODO

<a id="member-69"></a>
##### `mtime`

- Description: TODO

<a id="member-83"></a>
##### `notile`

- Description: TODO

<a id="member-84"></a>
##### `nogrid`

- Description: TODO

<a id="member-85"></a>
##### `id`

- Description: TODO

<a id="member-86"></a>
##### `norepl`

- Description: TODO

<a id="member-87"></a>
##### `useq`

- Description: TODO

<a id="member-94"></a>
##### `seg`

- Description: TODO

<a id="member-95"></a>
##### `lvl`

- Description: TODO

<a id="member-96"></a>
##### `sc`

- Description: TODO

<a id="member-106"></a>
##### `lvl`

- Description: TODO

<a id="member-107"></a>
##### `c`

- Description: TODO

<a id="member-112"></a>
##### `id`

- Description: TODO

<a id="member-113"></a>
##### `map`

- Description: TODO

<a id="member-114"></a>
##### `cache`

- Description: TODO

<a id="member-115"></a>
##### `ccache`

- Description: TODO

<a id="member-116"></a>
##### `zcache`

- Description: TODO

<a id="member-119"></a>
##### `loaded`

- Description: TODO

<a id="member-120"></a>
##### `loading`

- Description: TODO

<a id="member-127"></a>
##### `sc`

- Description: TODO

<a id="member-128"></a>
##### `cur`

- Description: TODO

<a id="member-132"></a>
##### `zc`

- Description: TODO

<a id="member-133"></a>
##### `loaded`

- Description: TODO

<a id="member-134"></a>
##### `got`

- Description: TODO

<a id="member-135"></a>
##### `loading`

- Description: TODO

<a id="member-142"></a>
##### `seg`

- Description: TODO

<a id="member-143"></a>
##### `grids`

- Description: TODO

<a id="member-144"></a>
##### `nsets`

- Description: TODO

<a id="member-145"></a>
##### `tilesets`

- Description: TODO

<a id="member-146"></a>
##### `tiles`

- Description: TODO

<a id="member-148"></a>
##### `grid`

- Description: TODO

<a id="member-149"></a>
##### `gc`

- Description: TODO

<a id="member-150"></a>
##### `tilemap`

- Description: TODO

<a id="member-157"></a>
##### `cachedgc`

- Description: TODO

<a id="member-158"></a>
##### `cached`

- Description: TODO

<a id="member-164"></a>
##### `segments`

- Description: TODO

<a id="member-170"></a>
##### `all`

- Description: TODO

<a id="member-178"></a>
##### `gid`

- Description: TODO

<a id="member-179"></a>
##### `segid`

- Description: TODO

<a id="member-180"></a>
##### `mtime`

- Description: TODO

<a id="member-181"></a>
##### `sc`

- Description: TODO

<a id="member-182"></a>
##### `tilesets`

- Description: TODO

<a id="member-183"></a>
##### `tiles`

- Description: TODO

<a id="member-184"></a>
##### `zmap`

- Description: TODO

<a id="member-185"></a>
##### `ols`

- Description: TODO

<a id="member-191"></a>
##### `all`

- Description: TODO

<a id="member-192"></a>
##### `readonly`

- Description: TODO

<a id="member-193"></a>
##### `segs`

- Description: TODO

<a id="member-194"></a>
##### `filter`

- Description: TODO

<a id="member-195"></a>
##### `curseg`

- Description: TODO

<a id="member-196"></a>
##### `offs`

- Description: TODO

<a id="member-197"></a>
##### `nseg`

- Description: TODO

<a id="member-198"></a>
##### `noff`

- Description: TODO

<a id="member-209"></a>
##### `inout`

- Description: TODO

#### Methods

<a id="member-10"></a>
##### `checklock()`

- Description: TODO

<a id="member-11"></a>
##### `mangle(String datum)`

- Description: TODO

<a id="member-12"></a>
##### `private InputStream sfetch(String ctl, Object... args) throws IOException`

- Description: TODO

<a id="member-13"></a>
##### `private OutputStream sstore(String ctl, Object... args) throws IOException`

- Description: TODO

<a id="member-14"></a>
##### `warn(Throwable cause, String msg)`

- Description: TODO

<a id="member-15"></a>
##### `warn(Throwable cause, String fmt, Object... args)`

- Description: TODO

<a id="member-16"></a>
##### `warn(String fmt, Object... args)`

- Description: TODO

<a id="member-17"></a>
##### `public static MapFile load(ResCache store, String filename) throws IOException`

- Description: TODO

<a id="member-18"></a>
##### `save()`

- Description: TODO

<a id="member-19"></a>
##### `defersave()`

- Description: TODO

<a id="member-23"></a>
##### `GridInfo(long id, long seg, Coord sc)`

- Description: TODO

<a id="member-25"></a>
##### `locked(Runnable r, Lock lock)`

- Description: TODO

<a id="member-26"></a>
##### `locked(Defer.Callable<A> f, Lock lock)`

- Description: TODO

<a id="member-27"></a>
##### `locked(Function<A, R> f, Lock lock)`

- Description: TODO

<a id="member-33"></a>
##### `Processor()`

- Description: TODO

<a id="member-34"></a>
##### `run()`

- Description: TODO

<a id="member-35"></a>
##### `process()`

- Description: TODO

<a id="member-41"></a>
##### `Marker(MapFile file, long seg, Coord tc, String nm)`

- Description: TODO

<a id="member-42"></a>
##### `update(boolean save)`

- Description: TODO

<a id="member-45"></a>
##### `PMarker(MapFile file, long seg, Coord tc, String nm, Color color, boolean onmap)`

- Description: TODO

<a id="member-46"></a>
##### `toString()`

- Description: TODO

<a id="member-50"></a>
##### `SMarker(MapFile file, long seg, Coord tc, String nm, UID oid, Resource.Saved res, byte[] data)`

- Description: TODO

<a id="member-51"></a>
##### `toString()`

- Description: TODO

<a id="member-52"></a>
##### `loadmarker(Message fp)`

- Description: TODO

<a id="member-53"></a>
##### `savemarker(Message fp, Marker mark)`

- Description: TODO

<a id="member-54"></a>
##### `add(Marker mark)`

- Description: TODO

<a id="member-55"></a>
##### `remove(Marker mark)`

- Description: TODO

<a id="member-56"></a>
##### `update(Marker mark)`

- Description: TODO

<a id="member-57"></a>
##### `smarker(String resnm, long seg, Coord tc)`

- Description: TODO

<a id="member-60"></a>
##### `TileInfo(Resource.Saved res, int prio)`

- Description: TODO

<a id="member-63"></a>
##### `Overlay(Resource.Saved olid, boolean[] ol)`

- Description: TODO

<a id="member-64"></a>
##### `get(Coord c)`

- Description: TODO

<a id="member-70"></a>
##### `DataGrid(TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

<a id="member-71"></a>
##### `gettile(Coord c)`

- Description: TODO

<a id="member-72"></a>
##### `getfz(Coord c)`

- Description: TODO

<a id="member-73"></a>
##### `tiletex(int t, BufferedImage[] texes, boolean[] cached)`

- Description: TODO

<a id="member-74"></a>
##### `render(Coord off)`

- Description: TODO

<a id="member-75"></a>
##### `olcol(MCache.OverlayInfo olid)`

- Description: TODO

<a id="member-76"></a>
##### `olrender(Coord off, String tag)`

- Description: TODO

<a id="member-77"></a>
##### `savetiles(Message fp, TileInfo[] tilesets, int[] tiles)`

- Description: TODO

<a id="member-78"></a>
##### `loadtiles(Message fp, int ver)`

- Description: TODO

<a id="member-79"></a>
##### `savez(Message fp, float[] zmap)`

- Description: TODO

<a id="member-80"></a>
##### `loadz(Message fp, String nm)`

- Description: TODO

<a id="member-81"></a>
##### `saveols(Message fp, Collection<Overlay> ols)`

- Description: TODO

<a id="member-82"></a>
##### `loadols(Collection<Overlay> buf, Message fp, String nm)`

- Description: TODO

<a id="member-88"></a>
##### `Grid(long id, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

<a id="member-89"></a>
##### `from(MCache map, MCache.Grid cg)`

- Description: TODO

<a id="member-90"></a>
##### `mergeprev(Grid prev)`

- Description: TODO

<a id="member-91"></a>
##### `save(Message fp)`

- Description: TODO

<a id="member-92"></a>
##### `save(MapFile file)`

- Description: TODO

<a id="member-93"></a>
##### `load(MapFile file, long id)`

- Description: TODO

<a id="member-97"></a>
##### `ZoomGrid(long seg, int lvl, Coord sc, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

<a id="member-98"></a>
##### `fetch(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

<a id="member-99"></a>
##### `fetchg(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

<a id="member-100"></a>
##### `from(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

<a id="member-101"></a>
##### `zoomols(Collection<Overlay> buf, DataGrid[] lower)`

- Description: TODO

<a id="member-102"></a>
##### `save(Message fp)`

- Description: TODO

<a id="member-103"></a>
##### `save(MapFile file)`

- Description: TODO

<a id="member-104"></a>
##### `load(MapFile file, long seg, int lvl, Coord sc)`

- Description: TODO

<a id="member-105"></a>
##### `inval(MapFile file, long seg, Coord sc)`

- Description: TODO

<a id="member-108"></a>
##### `ZoomCoord(int lvl, Coord c)`

- Description: TODO

<a id="member-109"></a>
##### `hashCode()`

- Description: TODO

<a id="member-110"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-111"></a>
##### `toString()`

- Description: TODO

<a id="member-117"></a>
##### `Segment(long id)`

- Description: TODO

<a id="member-118"></a>
##### `file()`

- Description: TODO

<a id="member-121"></a>
##### `Cached(Future<Grid> loading)`

- Description: TODO

<a id="member-122"></a>
##### `get()`

- Description: TODO

<a id="member-123"></a>
##### `loaded(long id)`

- Description: TODO

<a id="member-124"></a>
##### `loadgrid(long id)`

- Description: TODO

<a id="member-125"></a>
##### `grid0(long id)`

- Description: TODO

<a id="member-126"></a>
##### `grid(long id)`

- Description: TODO

<a id="member-129"></a>
##### `ByCoord(Coord sc, Cached cur)`

- Description: TODO

<a id="member-130"></a>
##### `get()`

- Description: TODO

<a id="member-131"></a>
##### `loadzgrid(ZoomCoord zc)`

- Description: TODO

<a id="member-136"></a>
##### `ByZCoord(ZoomCoord zc, Future<ZoomGrid> loading)`

- Description: TODO

<a id="member-137"></a>
##### `get()`

- Description: TODO

<a id="member-138"></a>
##### `grid(Coord gc)`

- Description: TODO

<a id="member-139"></a>
##### `grid(int lvl, Coord gc)`

- Description: TODO

<a id="member-140"></a>
##### `include(long id, Coord sc)`

- Description: TODO

<a id="member-141"></a>
##### `include(Grid grid, Coord sc)`

- Description: TODO

<a id="member-147"></a>
##### `View(Segment seg)`

- Description: TODO

<a id="member-151"></a>
##### `GridMap(Grid grid, Coord gc)`

- Description: TODO

<a id="member-152"></a>
##### `addgrid(Coord gc)`

- Description: TODO

<a id="member-153"></a>
##### `TileSort()`

- Description: TODO

<a id="member-154"></a>
##### `pick(Collection<String> from)`

- Description: TODO

<a id="member-155"></a>
##### `pickbad()`

- Description: TODO

<a id="member-156"></a>
##### `fin()`

- Description: TODO

<a id="member-159"></a>
##### `getgrid(Coord gc)`

- Description: TODO

<a id="member-160"></a>
##### `gettile(Coord tc)`

- Description: TODO

<a id="member-161"></a>
##### `getfz(Coord tc)`

- Description: TODO

<a id="member-162"></a>
##### `tileset(int n)`

- Description: TODO

<a id="member-163"></a>
##### `tiler(int n)`

- Description: TODO

<a id="member-165"></a>
##### `merge(Segment dst, Segment src, Coord soff)`

- Description: TODO

<a id="member-166"></a>
##### `update(MCache map, Collection<MCache.Grid> grids)`

- Description: TODO

<a id="member-167"></a>
##### `public boolean includeseg(long id);`

- Description: TODO

<a id="member-168"></a>
##### `public boolean includegrid(Segment seg, Coord sc, long id);`

- Description: TODO

<a id="member-169"></a>
##### `public boolean includemark(Marker mark);`

- Description: TODO

<a id="member-171"></a>
##### `segment(long sid)`

- Description: TODO

<a id="member-172"></a>
##### `around(Marker mark, double rad)`

- Description: TODO

<a id="member-173"></a>
##### `grid(int cs, int ns, int cg, int ng)`

- Description: TODO

<a id="member-174"></a>
##### `mark(int cm, int nm)`

- Description: TODO

<a id="member-176"></a>
##### `public void export(Message out, ExportFilter filter, ExportStatus prog) throws InterruptedException`

- Description: TODO

<a id="member-177"></a>
##### `public void export(OutputStream out, ExportFilter filter, ExportStatus prog) throws InterruptedException`

- Description: TODO

<a id="member-186"></a>
##### `ImportedGrid(Message data)`

- Description: TODO

<a id="member-187"></a>
##### `togrid()`

- Description: TODO

<a id="member-188"></a>
##### `public boolean includegrid(ImportedGrid grid, boolean hasprev);`

- Description: TODO

<a id="member-189"></a>
##### `public boolean includemark(Marker mark, Marker prev);`

- Description: TODO

<a id="member-190"></a>
##### `handleerror(RuntimeException exc, String ctx)`

- Description: TODO

<a id="member-199"></a>
##### `Importer(ImportFilter filter)`

- Description: TODO

<a id="member-200"></a>
##### `flush()`

- Description: TODO

<a id="member-201"></a>
##### `chseg(Segment nseg)`

- Description: TODO

<a id="member-202"></a>
##### `chseg(long id)`

- Description: TODO

<a id="member-203"></a>
##### `importgrid(Message data)`

- Description: TODO

<a id="member-204"></a>
##### `prevmark(Marker mark)`

- Description: TODO

<a id="member-205"></a>
##### `importmark(Message data)`

- Description: TODO

<a id="member-206"></a>
##### `void reimport(Message data) throws InterruptedException`

- Description: TODO

<a id="member-207"></a>
##### `public void reimport(Message data, ImportFilter filter) throws InterruptedException`

- Description: TODO

<a id="member-208"></a>
##### `public void reimport(InputStream fp, ImportFilter filter) throws InterruptedException`

- Description: TODO

<a id="member-210"></a>
##### `update(MCache map, Coord cgc)`

- Description: TODO
