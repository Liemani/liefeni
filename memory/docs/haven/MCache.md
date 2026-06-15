# MCache

This file documents the responsibilities and members of `MCache`.

## Meta

- Source: [MCache.java](../../../src/haven/MCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches map grids and world tile data.

## Nested Types

### Cut

- Description: TODO

### Deferred

- Description: TODO

### Flavobjs

- Description: TODO

### Grid

- Description: TODO

### LoadingMap

- Description: TODO

### LocalOverlay

- Description: TODO

### Overlay

- Description: TODO

### OverlayInfo

- Description: TODO

### RectOverlay

- Description: TODO

### Request

- Description: TODO

### ResOverlay

- Description: TODO

### SurfaceID

- Description: TODO

### ZSurface

- Description: TODO

## Members

### Constants

#### `public static final Coord2d tilesz = Coord2d.of(11, 11)`

- Description: TODO

#### `public static final Coord tilesz2 = tilesz.round(); /* XXX: Remove me in due time. */`

- Description: TODO

#### `public static final Coord cmaps = Coord.of(100, 100)`

- Description: TODO

#### `public static final Coord cutsz = Coord.of(25, 25)`

- Description: TODO

#### `public static final Coord cutn = cmaps.div(cutsz)`

- Description: TODO

#### `public static final SurfaceID map = new SurfaceID(null)`

- Description: TODO

#### `public static final SurfaceID trn = new SurfaceID(map)`

- Description: TODO

### Fields

#### `private final Object setmon = new Object()`

- Description: TODO

#### `private Indir<Resource>[] sets = new Indir[16]`

- Description: TODO

#### `private Reference<Tileset>[] csets = new Reference[16]`

- Description: TODO

#### `private Reference<Tiler>[] tiles = new Reference[16]`

- Description: TODO

#### `private final Waitable.Queue gridwait = new Waitable.Queue()`

- Description: TODO

#### `Map<Coord, Request> req = new HashMap<Coord, Request>()`

- Description: TODO

#### `Map<Coord, Grid> grids = new HashMap<Coord, Grid>()`

- Description: TODO

#### `Session sess`

- Description: TODO

#### `Set<LocalOverlay> ols = new HashSet<>()`

- Description: TODO

#### `public volatile int olseq = 0, chseq = 0`

- Description: TODO

#### `public volatile int olseq = 0, chseq = 0`

- Description: TODO

#### `Map<Integer, Defrag> fragbufs = new TreeMap<Integer, Defrag>()`

- Description: TODO

#### `public final Coord gc`

- Description: TODO

#### `private transient final MCache map`

- Description: TODO

#### `private long lastreq = 0`

- Description: TODO

#### `private int reqs = 0`

- Description: TODO

#### `public final SurfaceID parent`

- Description: TODO

#### `public final Gob.Placer mapplace = new Gob.DefaultPlace(this, SurfaceID.map)`

- Description: TODO

#### `public final Gob.Placer trnplace = new Gob.DefaultPlace(this, SurfaceID.trn)`

- Description: TODO

#### `public final Collection<String> tags`

- Description: TODO

#### `private final int matid, omatid`

- Description: TODO

#### `private final int matid, omatid`

- Description: TODO

#### `public final OverlayInfo id`

- Description: TODO

#### `public Area a`

- Description: TODO

#### `public final Coord gc, ul`

- Description: TODO

#### `public final Coord gc, ul`

- Description: TODO

#### `public final int tiles[] = new int[cmaps.x * cmaps.y]`

- Description: TODO

#### `public final float z[] = new float[cmaps.x * cmaps.y]`

- Description: TODO

#### `public Indir<Resource> ols[]`

- Description: TODO

#### `public boolean ol[][]`

- Description: TODO

#### `public long id`

- Description: TODO

#### `public int seq = -1`

- Description: TODO

#### `public boolean removed = false`

- Description: TODO

#### `private int olseq = -1`

- Description: TODO

#### `private final Cut cuts[]`

- Description: TODO

#### `private Defer.Future<T> def`

- Description: TODO

#### `private T val`

- Description: TODO

#### `private boolean inited = false`

- Description: TODO

#### `public final Coord cc`

- Description: TODO

#### `public final Deferred<MapMesh> mesh`

- Description: TODO

#### `public final Deferred<Flavobjs> fo`

- Description: TODO

#### `public final Map<OverlayInfo, RenderTree.Node> ols = new HashMap<>()`

- Description: TODO

#### `public final Map<OverlayInfo, RenderTree.Node> olols = new HashMap<>()`

- Description: TODO

#### `final RenderTree.Node[] mats`

- Description: TODO

#### `final Gob[] all`

- Description: TODO

#### `private Indir<Resource>[] fill_plots`

- Description: TODO

#### `private final ThreadLocal<Reference<Grid>> cached = new ThreadLocal<>()`

- Description: TODO

#### `public final ZSurface zsurf = new ZSurface()`

- Description: TODO

### Methods

#### `public LoadingMap(MCache map, Coord gc)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public default double getz(Coord tc)`

- Description: TODO

#### `public default double getz(Coord2d pc)`

- Description: TODO

#### `public default Coord3f getnorm(Coord2d pc)`

- Description: TODO

#### `public default Coord3f getnormt(Coord2d pc)`

- Description: TODO

#### `public default Coord3f getnormp(Coord2d pc)`

- Description: TODO

#### `public SurfaceID(SurfaceID parent)`

- Description: TODO

#### `public boolean hasparent(SurfaceID p)`

- Description: TODO

#### `public Collection<String> tags()`

- Description: TODO

#### `public Material mat()`

- Description: TODO

#### `public default Material omat()`

- Description: TODO

#### `public ResOverlay(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Collection<String> tags()`

- Description: TODO

#### `public Material mat()`

- Description: TODO

#### `public Material omat()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public OverlayInfo id()`

- Description: TODO

#### `public void fill(Area a, boolean[] buf)`

- Description: TODO

#### `public default boolean filter(Area a)`

- Description: TODO

#### `public default void tick()`

- Description: TODO

#### `public void add(LocalOverlay ol)`

- Description: TODO

#### `public void remove(LocalOverlay ol)`

- Description: TODO

#### `public RectOverlay(OverlayInfo id, Area a)`

- Description: TODO

#### `public OverlayInfo id()`

- Description: TODO

#### `public boolean filter(Area b)`

- Description: TODO

#### `public void fill(Area b, boolean[] buf)`

- Description: TODO

#### `public void update(Area a)`

- Description: TODO

#### `public Overlay(Area a, OverlayInfo id)`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `private void cktileid(int id)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `protected void update(T val)`

- Description: TODO

#### `public T cur()`

- Description: TODO

#### `public void rebuild()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `protected abstract T build()`

- Description: TODO

#### `protected abstract String message()`

- Description: TODO

#### `public Cut(Coord cc)`

- Description: TODO

#### `public void invalidate()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public Grid(Coord gc)`

- Description: TODO

#### `public int gettile(Coord tc)`

- Description: TODO

#### `public double getz(Coord tc)`

- Description: TODO

#### `public void getol(OverlayInfo id, Area a, boolean[] buf)`

- Description: TODO

#### `Flavobjs(Map<NodeWrap, Collection<Gob>> flavobjs)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `void tick(double dt)`

- Description: TODO

#### `void gtick(Render g)`

- Description: TODO

#### `private Flavobjs makeflavor(Coord cutc)`

- Description: TODO

#### `public RenderTree.Node getfo(Coord cc)`

- Description: TODO

#### `private Cut geticut(Coord cc)`

- Description: TODO

#### `public MapMesh getcut(Coord cc)`

- Description: TODO

#### `public RenderTree.Node getolcut(OverlayInfo id, Coord cc)`

- Description: TODO

#### `public RenderTree.Node getololcut(OverlayInfo id, Coord cc)`

- Description: TODO

#### `public void ivneigh(Coord nc)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `private void invalidate()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `private void filltiles(Message buf)`

- Description: TODO

#### `private void filltiles2(Message buf)`

- Description: TODO

#### `private void filltiles3(Message buf)`

- Description: TODO

#### `private void fillz(Message buf)`

- Description: TODO

#### `private void decplots(Message buf)`

- Description: TODO

#### `private void fillplots(Message buf)`

- Description: TODO

#### `private void subfill(Message msg)`

- Description: TODO

#### `public void fill(Message msg)`

- Description: TODO

#### `public double getfz(Coord c)`

- Description: TODO

#### `public Tileset tileset(int i)`

- Description: TODO

#### `public Tiler tiler(int i)`

- Description: TODO

#### `public MCache(Session sess)`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public void invalidate(Coord cc)`

- Description: TODO

#### `public void invalblob(Message msg)`

- Description: TODO

#### `public Grid getgrid(Coord gc)`

- Description: TODO

#### `public Grid getgridt(Coord tc)`

- Description: TODO

#### `public int gettile(Coord tc)`

- Description: TODO

#### `public double getfz(Coord tc)`

- Description: TODO

#### `public double getcz(double px, double py)`

- Description: TODO

#### `public double getcz(Coord2d pc)`

- Description: TODO

#### `public float getcz(float px, float py)`

- Description: TODO

#### `public float getcz(Coord pc)`

- Description: TODO

#### `public Coord3f getzp(Coord2d pc)`

- Description: TODO

#### `public double getz(SurfaceID id, Coord tc)`

- Description: TODO

#### `public double getz(SurfaceID id, Coord2d pc)`

- Description: TODO

#### `public Coord3f getzp(SurfaceID id, Coord2d pc)`

- Description: TODO

#### `public Coord3f getnorm(SurfaceID id, Coord2d pc)`

- Description: TODO

#### `public Collection<OverlayInfo> getols(Area a)`

- Description: TODO

#### `public void getol(OverlayInfo id, Area a, boolean[] buf)`

- Description: TODO

#### `public MapMesh getcut(Coord cc)`

- Description: TODO

#### `public RenderTree.Node getfo(Coord cc)`

- Description: TODO

#### `public RenderTree.Node getolcut(OverlayInfo id, Coord cc)`

- Description: TODO

#### `public RenderTree.Node getololcut(OverlayInfo id, Coord cc)`

- Description: TODO

#### `public void mapdata2(Message msg)`

- Description: TODO

#### `public void mapdata(Message msg)`

- Description: TODO

#### `public Resource tilesetr(int i)`

- Description: TODO

#### `public Tileset tileset(int i)`

- Description: TODO

#### `public Tiler tiler(int i)`

- Description: TODO

#### `public void trimall()`

- Description: TODO

#### `public void trim(Coord ul, Coord lr)`

- Description: TODO

#### `public void request(Coord gc)`

- Description: TODO

#### `public void reqarea(Coord ul, Coord br)`

- Description: TODO

#### `public void sendreqs()`

- Description: TODO
