# MapFile

This file documents the responsibilities and members of `MapFile`.

## Meta

- Source: [MapFile.java](../../../src/haven/MapFile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Stores map file data and markers.

## Nested Types

### GridInfo

Represents one cached Haven grid record inside `MapFile`.
`gridinfo` stores these records by Haven grid id.

`id: long`
  - Haven `MCache.Grid.id`
`seg: long`
  - Haven `MapFile.Segment.id` for the grid's containing segment
`sc: Coord`
  - stored scene coordinate for the grid inside the segment

`seg` is the segment id used by `MapFile.Segment` and is the value later mapped to waypoint `map_segment.id`.

## Members

### Constants

#### `public static final Config.Variable<java.net.URI> mapbase = Config.Variable.propu("haven.mapbase", "")`

- Description: TODO

#### `public static final Resource.Saved notile = new Resource.Saved(Resource.remote(), "gfx/tiles/notile", -1)`

- Description: TODO

#### `public static final DataGrid nogrid`

- Description: TODO

#### `public static final ExportFilter all = new ExportFilter()`

- Description: TODO

#### `private static final byte[] EXPORT_SIG = "Haven Mapfile 1".getBytes(Utils.ascii)`

- Description: TODO

#### `private static final Coord[] inout = new Coord[]`

- Description: TODO

### Fields

#### `public static boolean debug = false`

- Description: TODO

#### `public final ResCache store`

- Description: TODO

#### `public final String filename`

- Description: TODO

#### `public final Collection<Long> knownsegs = new HashSet<>()`

- Description: TODO

#### `public final Collection<Marker> markers = new ArrayList<>()`

- Description: TODO

#### `public volatile int markerseq = 0`

- Description: TODO

#### `public final ReentrantReadWriteLock lock = new ReentrantReadWriteLock()`

- Description: TODO

#### `private final Random rnd = new Random()`

- Description: TODO

#### `public final long id, seg`

- Description: TODO

#### `public final long id, seg`

- Description: TODO

#### `public final Coord sc`

- Description: TODO

#### `public final BackCache<Long, GridInfo> gridinfo = new BackCache<>(100, id ->`

- Description: TODO

#### `private final Object procmon = new Object()`

- Description: TODO

#### `private Thread processor = null`

- Description: TODO

#### `private final Collection<Pair<MCache, Collection<MCache.Grid>>> updqueue = new HashSet<>()`

- Description: TODO

#### `private final Collection<Segment> dirty = new HashSet<>()`

- Description: TODO

#### `private boolean gdirty = false`

- Description: TODO

#### `public final MapFile file`

- Description: TODO

#### `public long seg`

- Description: TODO

#### `public Coord tc`

- Description: TODO

#### `public String nm`

- Description: TODO

#### `public volatile int seq = 0`

- Description: TODO

#### `public Color color`

- Description: TODO

#### `public boolean onmap`

- Description: TODO

#### `public UID oid`

- Description: TODO

#### `public Resource.Saved res`

- Description: TODO

#### `public byte[] data`

- Description: TODO

#### `public final Resource.Saved res`

- Description: TODO

#### `public final int prio`

- Description: TODO

#### `public final Resource.Saved olid`

- Description: TODO

#### `public final boolean[] ol`

- Description: TODO

#### `public final TileInfo[] tilesets`

- Description: TODO

#### `public final int[] tiles`

- Description: TODO

#### `public final float[] zmap`

- Description: TODO

#### `public final Collection<Overlay> ols = new ArrayList<>()`

- Description: TODO

#### `public final long mtime`

- Description: TODO

#### `public final long id`

- Description: TODO

#### `private boolean[] norepl`

- Description: TODO

#### `private int useq = -1`

- Description: TODO

#### `public final long seg`

- Description: TODO

#### `public final int lvl`

- Description: TODO

#### `public final Coord sc`

- Description: TODO

#### `public final int lvl`

- Description: TODO

#### `public final Coord c`

- Description: TODO

#### `public final long id`

- Description: TODO

#### `private final BMap<Coord, Long> map = new HashBMap<>()`

- Description: TODO

#### `private final Map<Long, Cached> cache = new CacheMap<>(CacheMap.RefType.WEAK)`

- Description: TODO

#### `private final Map<Coord, ByCoord> ccache = new CacheMap<>(CacheMap.RefType.WEAK)`

- Description: TODO

#### `private final Map<ZoomCoord, ByZCoord> zcache = new CacheMap<>(CacheMap.RefType.WEAK)`

- Description: TODO

#### `Grid loaded`

- Description: TODO

#### `Future<Grid> loading`

- Description: TODO

#### `final Coord sc`

- Description: TODO

#### `Cached cur`

- Description: TODO

#### `final ZoomCoord zc`

- Description: TODO

#### `ZoomGrid loaded`

- Description: TODO

#### `boolean got = false`

- Description: TODO

#### `Future<ZoomGrid> loading`

- Description: TODO

#### `public final Segment seg`

- Description: TODO

#### `private final Map<Coord, GridMap> grids = new HashMap<>()`

- Description: TODO

#### `private Resource.Saved[] nsets`

- Description: TODO

#### `private Tileset[] tilesets`

- Description: TODO

#### `private Tiler[] tiles`

- Description: TODO

#### `final Grid grid`

- Description: TODO

#### `final Coord gc`

- Description: TODO

#### `int[] tilemap = null`

- Description: TODO

#### `private Coord cachedgc = null`

- Description: TODO

#### `private GridMap cached = null`

- Description: TODO

#### `public final BackCache<Long, Segment> segments = new BackCache<>(5, id ->`

- Description: TODO

#### `public long gid, segid, mtime`

- Description: TODO

#### `public long gid, segid, mtime`

- Description: TODO

#### `public long gid, segid, mtime`

- Description: TODO

#### `public Coord sc`

- Description: TODO

#### `public TileInfo[] tilesets`

- Description: TODO

#### `public int[] tiles`

- Description: TODO

#### `public float[] zmap`

- Description: TODO

#### `public Collection<Overlay> ols = new ArrayList<>()`

- Description: TODO

#### `public static ImportFilter all = new ImportFilter()`

- Description: TODO

#### `public static ImportFilter readonly = new ImportFilter()`

- Description: TODO

#### `final Map<Long, ImportedSegment> segs = new HashMap<>()`

- Description: TODO

#### `final ImportFilter filter`

- Description: TODO

#### `Segment curseg`

- Description: TODO

#### `final Map<Long, Coord> offs = new HashMap<>()`

- Description: TODO

#### `long nseg`

- Description: TODO

#### `Coord noff = null`

- Description: TODO

### Methods

#### `public MapFile(ResCache store, String filename)`

- Description: TODO

#### `private void checklock()`

- Description: TODO

#### `private String mangle(String datum)`

- Description: TODO

#### `private InputStream sfetch(String ctl, Object... args) throws IOException`

- Description: TODO

#### `private OutputStream sstore(String ctl, Object... args) throws IOException`

- Description: TODO

#### `public static void warn(Throwable cause, String msg)`

- Description: TODO

#### `public static void warn(Throwable cause, String fmt, Object... args)`

- Description: TODO

#### `public static void warn(String fmt, Object... args)`

- Description: TODO

#### `public static MapFile load(ResCache store, String filename) throws IOException`

- Description: TODO

#### `private void save()`

- Description: TODO

#### `public void defersave()`

- Description: TODO

#### `public GridInfo(long id, long seg, Coord sc)`

- Description: TODO

#### `private static Runnable locked(Runnable r, Lock lock)`

- Description: TODO

#### `private static <A> Defer.Callable<A> locked(Defer.Callable<A> f, Lock lock)`

- Description: TODO

#### `private static <A, R> Function<A, R> locked(Function<A, R> f, Lock lock)`

- Description: TODO

#### `Processor()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private void process()`

- Description: TODO

#### `public Marker(MapFile file, long seg, Coord tc, String nm)`

- Description: TODO

#### `public void update(boolean save)`

- Description: TODO

#### `public PMarker(MapFile file, long seg, Coord tc, String nm, Color color, boolean onmap)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public SMarker(MapFile file, long seg, Coord tc, String nm, UID oid, Resource.Saved res, byte[] data)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Marker loadmarker(Message fp)`

- Description: TODO

#### `private static void savemarker(Message fp, Marker mark)`

- Description: TODO

#### `public void add(Marker mark)`

- Description: TODO

#### `public void remove(Marker mark)`

- Description: TODO

#### `public void update(Marker mark)`

- Description: TODO

#### `public SMarker smarker(String resnm, long seg, Coord tc)`

- Description: TODO

#### `public TileInfo(Resource.Saved res, int prio)`

- Description: TODO

#### `public Overlay(Resource.Saved olid, boolean[] ol)`

- Description: TODO

#### `public boolean get(Coord c)`

- Description: TODO

#### `public DataGrid(TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

#### `public int gettile(Coord c)`

- Description: TODO

#### `public double getfz(Coord c)`

- Description: TODO

#### `private BufferedImage tiletex(int t, BufferedImage[] texes, boolean[] cached)`

- Description: TODO

#### `public BufferedImage render(Coord off)`

- Description: TODO

#### `private static Color olcol(MCache.OverlayInfo olid)`

- Description: TODO

#### `public BufferedImage olrender(Coord off, String tag)`

- Description: TODO

#### `public static void savetiles(Message fp, TileInfo[] tilesets, int[] tiles)`

- Description: TODO

#### `public static Pair<TileInfo[], int[]> loadtiles(Message fp, int ver)`

- Description: TODO

#### `public static void savez(Message fp, float[] zmap)`

- Description: TODO

#### `public static float[] loadz(Message fp, String nm)`

- Description: TODO

#### `public static void saveols(Message fp, Collection<Overlay> ols)`

- Description: TODO

#### `public static void loadols(Collection<Overlay> buf, Message fp, String nm)`

- Description: TODO

#### `public Grid(long id, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

#### `public static Grid from(MCache map, MCache.Grid cg)`

- Description: TODO

#### `public Grid mergeprev(Grid prev)`

- Description: TODO

#### `public void save(Message fp)`

- Description: TODO

#### `public void save(MapFile file)`

- Description: TODO

#### `public static Grid load(MapFile file, long id)`

- Description: TODO

#### `public ZoomGrid(long seg, int lvl, Coord sc, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`

- Description: TODO

#### `public static ZoomGrid fetch(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

#### `private static DataGrid fetchg(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

#### `public static ZoomGrid from(MapFile file, Segment seg, int lvl, Coord sc)`

- Description: TODO

#### `private static void zoomols(Collection<Overlay> buf, DataGrid[] lower)`

- Description: TODO

#### `public void save(Message fp)`

- Description: TODO

#### `public void save(MapFile file)`

- Description: TODO

#### `public static ZoomGrid load(MapFile file, long seg, int lvl, Coord sc)`

- Description: TODO

#### `public static int inval(MapFile file, long seg, Coord sc)`

- Description: TODO

#### `public ZoomCoord(int lvl, Coord c)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Segment(long id)`

- Description: TODO

#### `public MapFile file()`

- Description: TODO

#### `Cached(Future<Grid> loading)`

- Description: TODO

#### `public Grid get()`

- Description: TODO

#### `private Grid loaded(long id)`

- Description: TODO

#### `private Future<Grid> loadgrid(long id)`

- Description: TODO

#### `private Cached grid0(long id)`

- Description: TODO

#### `public Indir<Grid> grid(long id)`

- Description: TODO

#### `ByCoord(Coord sc, Cached cur)`

- Description: TODO

#### `public Grid get()`

- Description: TODO

#### `private Future<ZoomGrid> loadzgrid(ZoomCoord zc)`

- Description: TODO

#### `ByZCoord(ZoomCoord zc, Future<ZoomGrid> loading)`

- Description: TODO

#### `public ZoomGrid get()`

- Description: TODO

#### `public Indir<Grid> grid(Coord gc)`

- Description: TODO

#### `public Indir<? extends DataGrid> grid(int lvl, Coord gc)`

- Description: TODO

#### `private void include(long id, Coord sc)`

- Description: TODO

#### `private void include(Grid grid, Coord sc)`

- Description: TODO

#### `public View(Segment seg)`

- Description: TODO

#### `GridMap(Grid grid, Coord gc)`

- Description: TODO

#### `public void addgrid(Coord gc)`

- Description: TODO

#### `TileSort()`

- Description: TODO

#### `protected List<String> pick(Collection<String> from)`

- Description: TODO

#### `protected List<String> pickbad()`

- Description: TODO

#### `public void fin()`

- Description: TODO

#### `private GridMap getgrid(Coord gc)`

- Description: TODO

#### `public int gettile(Coord tc)`

- Description: TODO

#### `public double getfz(Coord tc)`

- Description: TODO

#### `public Tileset tileset(int n)`

- Description: TODO

#### `public Tiler tiler(int n)`

- Description: TODO

#### `private void merge(Segment dst, Segment src, Coord soff)`

- Description: TODO

#### `public void update(MCache map, Collection<MCache.Grid> grids)`

- Description: TODO

#### `public boolean includeseg(long id)`

- Description: TODO

#### `public boolean includegrid(Segment seg, Coord sc, long id)`

- Description: TODO

#### `public boolean includemark(Marker mark)`

- Description: TODO

#### `public static ExportFilter segment(long sid)`

- Description: TODO

#### `public static ExportFilter around(Marker mark, double rad)`

- Description: TODO

#### `public default void grid(int cs, int ns, int cg, int ng)`

- Description: TODO

#### `public default void mark(int cm, int nm)`

- Description: TODO

#### `public void export(Message out, ExportFilter filter, ExportStatus prog) throws InterruptedException`

- Description: TODO

#### `public void export(OutputStream out, ExportFilter filter, ExportStatus prog) throws InterruptedException`

- Description: TODO

#### `ImportedGrid(Message data)`

- Description: TODO

#### `Grid togrid()`

- Description: TODO

#### `public boolean includegrid(ImportedGrid grid, boolean hasprev)`

- Description: TODO

#### `public boolean includemark(Marker mark, Marker prev)`

- Description: TODO

#### `public default void handleerror(RuntimeException exc, String ctx)`

- Description: TODO

#### `Importer(ImportFilter filter)`

- Description: TODO

#### `void flush()`

- Description: TODO

#### `Segment chseg(Segment nseg)`

- Description: TODO

#### `Segment chseg(long id)`

- Description: TODO

#### `void importgrid(Message data)`

- Description: TODO

#### `Marker prevmark(Marker mark)`

- Description: TODO

#### `void importmark(Message data)`

- Description: TODO

#### `void reimport(Message data) throws InterruptedException`

- Description: TODO

#### `public void reimport(Message data, ImportFilter filter) throws InterruptedException`

- Description: TODO

#### `public void reimport(InputStream fp, ImportFilter filter) throws InterruptedException`

- Description: TODO

#### `public void update(MCache map, Coord cgc)`

- Description: TODO
