---
source: [MCache.java](../../../src/haven/MCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# MCache

Caches map grid data and loading state.

## Nested Types

### Cut

- Role: Represents cut within MCache.
- Description: Describes the nested cut type used by the enclosing class.

### Deferred

- Role: Represents deferred within MCache.
- Description: Describes the nested deferred type used by the enclosing class.

### Flavobjs

- Role: Represents flavobjs within MCache.
- Description: Describes the nested flavobjs type used by the enclosing class.

### Grid

- Role: Represents grid within MCache.
- Description: Describes the nested grid type used by the enclosing class.

### LoadingMap

- Role: Represents loading map within MCache.
- Description: Describes the nested loading map type used by the enclosing class.

### LocalOverlay

- Role: Represents local overlay within MCache.
- Description: Describes the nested local overlay type used by the enclosing class.

### Overlay

- Role: Represents overlay within MCache.
- Description: Describes the nested overlay type used by the enclosing class.

### OverlayInfo

- Role: Represents overlay info within MCache.
- Description: Describes the nested overlay info type used by the enclosing class.

### RectOverlay

- Role: Represents rect overlay within MCache.
- Description: Describes the nested rect overlay type used by the enclosing class.

### Request

- Role: Represents request within MCache.
- Description: Describes the nested request type used by the enclosing class.

### ResOverlay

- Role: Represents res overlay within MCache.
- Description: Describes the nested res overlay type used by the enclosing class.

### SurfaceID

- Role: Represents surface id within MCache.
- Description: Describes the nested surface id type used by the enclosing class.

### ZSurface

- Role: Represents zsurface within MCache.
- Description: Describes the nested zsurface type used by the enclosing class.

## Members

### Constants

#### `public static final Coord2d tilesz = Coord2d.of(11, 11)`
- Role: Defines the shared tilesz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord tilesz2 = tilesz.round(); /* XXX: Remove me in due time. */`
- Role: Defines the shared tilesz2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cmaps = Coord.of(100, 100)`
- Role: Defines the shared cmaps constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cutsz = Coord.of(25, 25)`
- Role: Defines the shared cutsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cutn = cmaps.div(cutsz)`
- Role: Defines the shared cutn constant.
- Description: Shared constant used by the rest of the class.

#### `public static final SurfaceID map = new SurfaceID(null)`
- Role: Defines the shared map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final SurfaceID trn = new SurfaceID(map)`
- Role: Defines the shared trn constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Object setmon = new Object()`
- Role: Holds the setmon state.
- Description: Backs the cached state for this file.

#### `private Indir<Resource>[] sets = new Indir[16]`
- Role: Stores the sets value.
- Description: Backs the cached state for this file.

#### `private Reference<Tileset>[] csets = new Reference[16]`
- Role: Holds the csets state.
- Description: Backs the cached state for this file.

#### `private Reference<Tiler>[] tiles = new Reference[16]`
- Role: Holds the tiles state.
- Description: Backs the cached state for this file.

#### `private final Waitable.Queue gridwait = new Waitable.Queue()`
- Role: Caches gridwait entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Map<Coord, Request> req = new HashMap<Coord, Request>()`
- Role: Caches req entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Map<Coord, Grid> grids = new HashMap<Coord, Grid>()`
- Role: Caches grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `Set<LocalOverlay> ols = new HashSet<>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public volatile int olseq = 0, chseq = 0`
- Role: Stores the olseq value.
- Description: Backs the cached state for this file.

#### `public volatile int olseq = 0, chseq = 0`
- Role: Stores the olseq value.
- Description: Backs the cached state for this file.

#### `Map<Integer, Defrag> fragbufs = new TreeMap<Integer, Defrag>()`
- Role: Caches fragbufs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Coord gc`
- Role: Stores the gc value.
- Description: Backs the cached state for this file.

#### `private transient final MCache map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private long lastreq = 0`
- Role: Stores the lastreq value.
- Description: Backs the cached state for this file.

#### `private int reqs = 0`
- Role: Stores the reqs value.
- Description: Backs the cached state for this file.

#### `public final SurfaceID parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `public final Gob.Placer mapplace = new Gob.DefaultPlace(this, SurfaceID.map)`
- Role: Stores the mapplace value.
- Description: Backs the cached state for this file.

#### `public final Gob.Placer trnplace = new Gob.DefaultPlace(this, SurfaceID.trn)`
- Role: Stores the trnplace value.
- Description: Backs the cached state for this file.

#### `public final Collection<String> tags`
- Role: Caches tags entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int matid, omatid`
- Role: Stores the omatid value.
- Description: Backs the cached state for this file.

#### `private final int matid, omatid`
- Role: Stores the omatid value.
- Description: Backs the cached state for this file.

#### `public final OverlayInfo id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public Area a`
- Role: Holds the a state.
- Description: Backs the cached state for this file.

#### `public final Coord gc, ul`
- Role: Stores the ul value.
- Description: Backs the cached state for this file.

#### `public final Coord gc, ul`
- Role: Stores the ul value.
- Description: Backs the cached state for this file.

#### `public final int tiles[] = new int[cmaps.x * cmaps.y]`
- Role: Stores the mcache state.
- Description: Backs the cached state for this file.

#### `public final float z[] = new float[cmaps.x * cmaps.y]`
- Role: Stores the mcache state.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> ols[]`
- Role: Holds the mcache state.
- Description: Backs the cached state for this file.

#### `public boolean ol[][]`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public int seq = -1`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `public boolean removed = false`
- Role: Tracks the removed flag.
- Description: Supports the removed operation used by the surrounding class.

#### `private int olseq = -1`
- Role: Stores the olseq value.
- Description: Backs the cached state for this file.

#### `private final Cut cuts[]`
- Role: Holds the mcache state.
- Description: Backs the cached state for this file.

#### `private Defer.Future<T> def`
- Role: Holds the def state.
- Description: Backs the cached state for this file.

#### `private T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `public final Coord cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `public final Deferred<MapMesh> mesh`
- Role: Holds the mesh state.
- Description: Backs the cached state for this file.

#### `public final Deferred<Flavobjs> fo`
- Role: Holds the fo state.
- Description: Backs the cached state for this file.

#### `public final Map<OverlayInfo, RenderTree.Node> ols = new HashMap<>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<OverlayInfo, RenderTree.Node> olols = new HashMap<>()`
- Role: Caches olols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final RenderTree.Node[] mats`
- Role: Stores the mats value.
- Description: Backs the cached state for this file.

#### `final Gob[] all`
- Role: Stores the all value.
- Description: Backs the cached state for this file.

#### `private Indir<Resource>[] fill_plots`
- Role: Stores the fill plots value.
- Description: Backs the cached state for this file.

#### `private final ThreadLocal<Reference<Grid>> cached = new ThreadLocal<>()`
- Role: Stores the cached value.
- Description: Backs the cached state for this file.

#### `public final ZSurface zsurf = new ZSurface()`
- Role: Holds the zsurf state.
- Description: Backs the cached state for this file.

### Methods

#### `public LoadingMap(MCache map, Coord gc)`
- Role: Performs loading map.
- Description: Supports the loading map operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public default double getz(Coord tc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public default double getz(Coord2d pc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public default Coord3f getnorm(Coord2d pc)`
- Role: Performs getnorm.
- Description: Supports the getnorm operation used by the surrounding class.

#### `public default Coord3f getnormt(Coord2d pc)`
- Role: Performs getnormt.
- Description: Supports the getnormt operation used by the surrounding class.

#### `public default Coord3f getnormp(Coord2d pc)`
- Role: Performs getnormp.
- Description: Supports the getnormp operation used by the surrounding class.

#### `public SurfaceID(SurfaceID parent)`
- Role: Performs surface id.
- Description: Supports the surface id operation used by the surrounding class.

#### `public boolean hasparent(SurfaceID p)`
- Role: Performs hasparent.
- Description: Supports the hasparent operation used by the surrounding class.

#### `public Collection<String> tags()`
- Role: Performs tags.
- Description: Supports the tags operation used by the surrounding class.

#### `public Material mat()`
- Role: Performs mat.
- Description: Supports the mat operation used by the surrounding class.

#### `public default Material omat()`
- Role: Performs omat.
- Description: Supports the omat operation used by the surrounding class.

#### `public ResOverlay(Resource res, Message buf)`
- Role: Performs res overlay.
- Description: Supports the res overlay operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Collection<String> tags()`
- Role: Performs tags.
- Description: Supports the tags operation used by the surrounding class.

#### `public Material mat()`
- Role: Performs mat.
- Description: Supports the mat operation used by the surrounding class.

#### `public Material omat()`
- Role: Performs omat.
- Description: Supports the omat operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public OverlayInfo id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public void fill(Area a, boolean[] buf)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public default boolean filter(Area a)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public default void tick()`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void add(LocalOverlay ol)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(LocalOverlay ol)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public RectOverlay(OverlayInfo id, Area a)`
- Role: Performs rect overlay.
- Description: Supports the rect overlay operation used by the surrounding class.

#### `public OverlayInfo id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public boolean filter(Area b)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public void fill(Area b, boolean[] buf)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public void update(Area a)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Overlay(Area a, OverlayInfo id)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `private void cktileid(int id)`
- Role: Performs cktileid.
- Description: Supports the cktileid operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `protected void update(T val)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public T cur()`
- Role: Performs cur.
- Description: Supports the cur operation used by the surrounding class.

#### `public void rebuild()`
- Role: Performs rebuild.
- Description: Supports the rebuild operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `protected abstract T build()`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `protected abstract String message()`
- Role: Performs message.
- Description: Supports the message operation used by the surrounding class.

#### `public Cut(Coord cc)`
- Role: Performs cut.
- Description: Supports the cut operation used by the surrounding class.

#### `public void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Grid(Coord gc)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public int gettile(Coord tc)`
- Role: Performs gettile.
- Description: Supports the gettile operation used by the surrounding class.

#### `public double getz(Coord tc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public void getol(OverlayInfo id, Area a, boolean[] buf)`
- Role: Performs getol.
- Description: Supports the getol operation used by the surrounding class.

#### `Flavobjs(Map<NodeWrap, Collection<Gob>> flavobjs)`
- Role: Handles the flavobjs workflow.
- Description: Supports the flavobjs operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `private Flavobjs makeflavor(Coord cutc)`
- Role: Performs makeflavor.
- Description: Supports the makeflavor operation used by the surrounding class.

#### `public RenderTree.Node getfo(Coord cc)`
- Role: Performs getfo.
- Description: Supports the getfo operation used by the surrounding class.

#### `private Cut geticut(Coord cc)`
- Role: Performs geticut.
- Description: Supports the geticut operation used by the surrounding class.

#### `public MapMesh getcut(Coord cc)`
- Role: Performs getcut.
- Description: Supports the getcut operation used by the surrounding class.

#### `public RenderTree.Node getolcut(OverlayInfo id, Coord cc)`
- Role: Performs getolcut.
- Description: Supports the getolcut operation used by the surrounding class.

#### `public RenderTree.Node getololcut(OverlayInfo id, Coord cc)`
- Role: Performs getololcut.
- Description: Supports the getololcut operation used by the surrounding class.

#### `public void ivneigh(Coord nc)`
- Role: Performs ivneigh.
- Description: Supports the ivneigh operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `private void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private void filltiles(Message buf)`
- Role: Performs filltiles.
- Description: Supports the filltiles operation used by the surrounding class.

#### `private void filltiles2(Message buf)`
- Role: Performs filltiles2.
- Description: Supports the filltiles2 operation used by the surrounding class.

#### `private void filltiles3(Message buf)`
- Role: Performs filltiles3.
- Description: Supports the filltiles3 operation used by the surrounding class.

#### `private void fillz(Message buf)`
- Role: Performs fillz.
- Description: Supports the fillz operation used by the surrounding class.

#### `private void decplots(Message buf)`
- Role: Performs decplots.
- Description: Supports the decplots operation used by the surrounding class.

#### `private void fillplots(Message buf)`
- Role: Performs fillplots.
- Description: Supports the fillplots operation used by the surrounding class.

#### `private void subfill(Message msg)`
- Role: Performs subfill.
- Description: Supports the subfill operation used by the surrounding class.

#### `public void fill(Message msg)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public double getfz(Coord c)`
- Role: Performs getfz.
- Description: Supports the getfz operation used by the surrounding class.

#### `public Tileset tileset(int i)`
- Role: Performs tileset.
- Description: Supports the tileset operation used by the surrounding class.

#### `public Tiler tiler(int i)`
- Role: Performs tiler.
- Description: Supports the tiler operation used by the surrounding class.

#### `public MCache(Session sess)`
- Role: Creates a new MCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void invalidate(Coord cc)`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public void invalblob(Message msg)`
- Role: Performs invalblob.
- Description: Supports the invalblob operation used by the surrounding class.

#### `public Grid getgrid(Coord gc)`
- Role: Performs getgrid.
- Description: Supports the getgrid operation used by the surrounding class.

#### `public Grid getgridt(Coord tc)`
- Role: Performs getgridt.
- Description: Supports the getgridt operation used by the surrounding class.

#### `public int gettile(Coord tc)`
- Role: Performs gettile.
- Description: Supports the gettile operation used by the surrounding class.

#### `public double getfz(Coord tc)`
- Role: Performs getfz.
- Description: Supports the getfz operation used by the surrounding class.

#### `public double getcz(double px, double py)`
- Role: Performs getcz.
- Description: Supports the getcz operation used by the surrounding class.

#### `public double getcz(Coord2d pc)`
- Role: Performs getcz.
- Description: Supports the getcz operation used by the surrounding class.

#### `public float getcz(float px, float py)`
- Role: Performs getcz.
- Description: Supports the getcz operation used by the surrounding class.

#### `public float getcz(Coord pc)`
- Role: Performs getcz.
- Description: Supports the getcz operation used by the surrounding class.

#### `public Coord3f getzp(Coord2d pc)`
- Role: Performs getzp.
- Description: Supports the getzp operation used by the surrounding class.

#### `public double getz(SurfaceID id, Coord tc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public double getz(SurfaceID id, Coord2d pc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public Coord3f getzp(SurfaceID id, Coord2d pc)`
- Role: Performs getzp.
- Description: Supports the getzp operation used by the surrounding class.

#### `public Coord3f getnorm(SurfaceID id, Coord2d pc)`
- Role: Performs getnorm.
- Description: Supports the getnorm operation used by the surrounding class.

#### `public Collection<OverlayInfo> getols(Area a)`
- Role: Performs getols.
- Description: Supports the getols operation used by the surrounding class.

#### `public void getol(OverlayInfo id, Area a, boolean[] buf)`
- Role: Performs getol.
- Description: Supports the getol operation used by the surrounding class.

#### `public MapMesh getcut(Coord cc)`
- Role: Performs getcut.
- Description: Supports the getcut operation used by the surrounding class.

#### `public RenderTree.Node getfo(Coord cc)`
- Role: Performs getfo.
- Description: Supports the getfo operation used by the surrounding class.

#### `public RenderTree.Node getolcut(OverlayInfo id, Coord cc)`
- Role: Performs getolcut.
- Description: Supports the getolcut operation used by the surrounding class.

#### `public RenderTree.Node getololcut(OverlayInfo id, Coord cc)`
- Role: Performs getololcut.
- Description: Supports the getololcut operation used by the surrounding class.

#### `public void mapdata2(Message msg)`
- Role: Performs mapdata2.
- Description: Supports the mapdata2 operation used by the surrounding class.

#### `public void mapdata(Message msg)`
- Role: Performs mapdata.
- Description: Supports the mapdata operation used by the surrounding class.

#### `public Resource tilesetr(int i)`
- Role: Performs tilesetr.
- Description: Supports the tilesetr operation used by the surrounding class.

#### `public Tileset tileset(int i)`
- Role: Performs tileset.
- Description: Supports the tileset operation used by the surrounding class.

#### `public Tiler tiler(int i)`
- Role: Performs tiler.
- Description: Supports the tiler operation used by the surrounding class.

#### `public void trimall()`
- Role: Performs trimall.
- Description: Supports the trimall operation used by the surrounding class.

#### `public void trim(Coord ul, Coord lr)`
- Role: Performs trim.
- Description: Supports the trim operation used by the surrounding class.

#### `public void request(Coord gc)`
- Role: Performs request.
- Description: Supports the request operation used by the surrounding class.

#### `public void reqarea(Coord ul, Coord br)`
- Role: Performs reqarea.
- Description: Supports the reqarea operation used by the surrounding class.

#### `public void sendreqs()`
- Role: Performs sendreqs.
- Description: Supports the sendreqs operation used by the surrounding class.
