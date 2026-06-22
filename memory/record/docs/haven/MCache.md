---
source: [MCache.java](../../../../src/haven/MCache.java)
created: 2026-06-13
updated: 2026-06-20
---

# MCache

Caches Haven map-grid data, overlays, cut rendering, and asynchronous grid loading.

## Nested Types

### Loading and request tracking
- `LoadingMap`, `Request`
- Role: Wait for missing grid data and deduplicate in-flight requests.

### Surface and overlay helpers
- `ZSurface`, `SurfaceID`, `OverlayInfo`, `ResOverlay`, `LocalOverlay`, `RectOverlay`, `Overlay`
- Role: Describe map surfaces and renderable overlays.

### Grid data
- `Grid`
- Role: Wrap one loaded Haven map grid with tile, height, and overlay data.

## Members

### Constants

#### `public static final Coord2d tilesz = Coord2d.of(11, 11)`
- Role: World tile size in map coordinates.
- Value: `Coord2d.of(11, 11)`

#### `public static final Coord tilesz2 = tilesz.round(); /* XXX: Remove me in due time. */`
- Role: Rounded integer tile size kept for compatibility.
- Value: `tilesz.round(); /* XXX: Remove me in due time. */`

#### `public static final Coord cmaps = Coord.of(100, 100)`
- Role: Size of one full map grid in tiles.
- Value: `Coord.of(100, 100)`

#### `public static final Coord cutsz = Coord.of(25, 25)`
- Role: Size of one cut region.
- Value: `Coord.of(25, 25)`

#### `public static final Coord cutn = cmaps.div(cutsz)`
- Role: Number of cuts per grid.
- Value: `cmaps.div(cutsz)`

#### `public static final SurfaceID map = new SurfaceID(null)`
- Role: Base surface id for map placement.
- Value: `new SurfaceID(null)`

#### `public static final SurfaceID trn = new SurfaceID(map)`
- Role: Surface id for terrain-relative placement.
- Value: `new SurfaceID(map)`

### Fields

#### `private final Object setmon = new Object()`
- Role: Serializes tileset loading and trimming.

#### `private Indir<Resource>[] sets = new Indir[16]`
- Role: Stores tileset resource references.

#### `private Reference<Tileset>[] csets = new Reference[16]`
- Role: Caches resolved tilesets.

#### `private Reference<Tiler>[] tiles = new Reference[16]`
- Role: Caches resolved tilers.

#### `private final Waitable.Queue gridwait = new Waitable.Queue()`
- Role: Wakes callers waiting for grid availability.

#### `Map<Coord, Request> req = new HashMap<Coord, Request>()`
- Role: Tracks pending grid requests by coordinate.

#### `Map<Coord, Grid> grids = new HashMap<Coord, Grid>()`
- Role: Stores loaded grids by grid coordinate.

#### `Session sess`
- Role: Stores the owning session.

#### `Set<LocalOverlay> ols = new HashSet<>()`
- Role: Stores local overlays.

#### `public volatile int olseq = 0, chseq = 0`
- Role: Track overlay and change sequence numbers.

#### `Map<Integer, Defrag> fragbufs = new TreeMap<Integer, Defrag>()`
- Role: Stores defragmentation buffers for map data.

### Methods

#### `public MCache(Session sess)`
- Role: Creates the map cache for one session.

#### `public void ctick(double dt)` / `public void gtick(Render g)`
- Role: Advance client-side map cache state and rendering.

#### `public void invalidate(Coord cc)` / `public void invalblob(Message msg)`
- Role: Mark cached map data dirty from server updates.

#### `public Grid getgrid(Coord gc)` / `public Grid getgridt(Coord tc)`
- Role: Load or return one cached grid.

#### `public int gettile(Coord tc)` / `public double getfz(Coord tc)` / `public double getcz(...)` / `public Coord3f getzp(...)`
- Role: Read terrain tiles and height data.

#### `public Collection<OverlayInfo> getols(Area a)` / `public void getol(OverlayInfo id, Area a, boolean[] buf)`
- Role: Read overlay coverage for a map area.

#### `public MapMesh getcut(Coord cc)` / `public RenderTree.Node getfo(Coord cc)` / `public RenderTree.Node getolcut(...)` / `public RenderTree.Node getololcut(...)`
- Role: Build render-tree nodes for map content.

#### `public void mapdata(Message msg)` / `public void mapdata2(Message msg)`
- Role: Decode server map data into the cache.

#### `public Resource tilesetr(int i)` / `public Tileset tileset(int i)` / `public Tiler tiler(int i)`
- Role: Resolve tileset and tiler resources.

#### `public void trimall()` / `public void trim(Coord ul, Coord lr)`
- Role: Release cached grid data outside a requested area.

#### `public void request(Coord gc)` / `public void reqarea(Coord ul, Coord br)` / `public void sendreqs()`
- Role: Request missing map data from the server.

