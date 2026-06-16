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

- Role: Represents one cached Haven grid record inside `MapFile`.

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
- Role: Defines the shared mapbase constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource.Saved notile = new Resource.Saved(Resource.remote(), "gfx/tiles/notile", -1)`
- Role: Defines the shared notile constant.
- Description: Shared constant used by the rest of the class.

#### `public static final DataGrid nogrid`
- Role: Defines the shared nogrid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ExportFilter all = new ExportFilter()`
- Role: Defines the shared all constant.
- Description: Shared constant used by the rest of the class.

#### `private static final byte[] EXPORT_SIG = "Haven Mapfile 1".getBytes(Utils.ascii)`
- Role: Defines the shared export sig constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord[] inout = new Coord[]`
- Role: Defines the shared inout constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean debug = false`
- Role: Tracks the debug flag.
- Description: Supports the debug operation used by the surrounding class.

#### `public final ResCache store`
- Role: Caches store entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String filename`
- Role: Stores the filename value.
- Description: Backs the cached state for this file.

#### `public final Collection<Long> knownsegs = new HashSet<>()`
- Role: Caches knownsegs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Marker> markers = new ArrayList<>()`
- Role: Caches markers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public volatile int markerseq = 0`
- Role: Stores the markerseq value.
- Description: Backs the cached state for this file.

#### `public final ReentrantReadWriteLock lock = new ReentrantReadWriteLock()`
- Role: Holds the lock state.
- Description: Backs the cached state for this file.

#### `private final Random rnd = new Random()`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `public final long id, seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final long id, seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public final BackCache<Long, GridInfo> gridinfo = new BackCache<>(100, id ->`
- Role: Caches gridinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Object procmon = new Object()`
- Role: Holds the procmon state.
- Description: Backs the cached state for this file.

#### `private Thread processor = null`
- Role: Holds the processor state.
- Description: Backs the cached state for this file.

#### `private final Collection<Pair<MCache, Collection<MCache.Grid>>> updqueue = new HashSet<>()`
- Role: Caches updqueue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Segment> dirty = new HashSet<>()`
- Role: Caches dirty entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean gdirty = false`
- Role: Tracks whether gdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final MapFile file`
- Role: Stores the file value.
- Description: Backs the cached state for this file.

#### `public long seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public Coord tc`
- Role: Stores the tc value.
- Description: Backs the cached state for this file.

#### `public String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public volatile int seq = 0`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `public Color color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

#### `public boolean onmap`
- Role: Tracks the onmap flag.
- Description: Supports the onmap operation used by the surrounding class.

#### `public UID oid`
- Role: Stores the oid value.
- Description: Backs the cached state for this file.

#### `public Resource.Saved res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `public final Resource.Saved res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final int prio`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `public final Resource.Saved olid`
- Role: Stores the olid value.
- Description: Backs the cached state for this file.

#### `public final boolean[] ol`
- Role: Tracks the ol flag.
- Description: Supports the ol operation used by the surrounding class.

#### `public final TileInfo[] tilesets`
- Role: Holds the tilesets state.
- Description: Backs the cached state for this file.

#### `public final int[] tiles`
- Role: Stores the tiles value.
- Description: Backs the cached state for this file.

#### `public final float[] zmap`
- Role: Stores the zmap value.
- Description: Backs the cached state for this file.

#### `public final Collection<Overlay> ols = new ArrayList<>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final long mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private boolean[] norepl`
- Role: Tracks the norepl flag.
- Description: Supports the norepl operation used by the surrounding class.

#### `private int useq = -1`
- Role: Stores the useq value.
- Description: Backs the cached state for this file.

#### `public final long seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final int lvl`
- Role: Stores the lvl value.
- Description: Backs the cached state for this file.

#### `public final Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public final int lvl`
- Role: Stores the lvl value.
- Description: Backs the cached state for this file.

#### `public final Coord c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final BMap<Coord, Long> map = new HashBMap<>()`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Cached> cache = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Coord, ByCoord> ccache = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Caches ccache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<ZoomCoord, ByZCoord> zcache = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Caches zcache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Grid loaded`
- Role: Stores the loaded value.
- Description: Backs the cached state for this file.

#### `Future<Grid> loading`
- Role: Stores the loading value.
- Description: Backs the cached state for this file.

#### `final Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `Cached cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `final ZoomCoord zc`
- Role: Stores the zc value.
- Description: Backs the cached state for this file.

#### `ZoomGrid loaded`
- Role: Stores the loaded value.
- Description: Backs the cached state for this file.

#### `boolean got = false`
- Role: Tracks the got flag.
- Description: Supports the got operation used by the surrounding class.

#### `Future<ZoomGrid> loading`
- Role: Stores the loading value.
- Description: Backs the cached state for this file.

#### `public final Segment seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `private final Map<Coord, GridMap> grids = new HashMap<>()`
- Role: Caches grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Resource.Saved[] nsets`
- Role: Stores the nsets value.
- Description: Backs the cached state for this file.

#### `private Tileset[] tilesets`
- Role: Holds the tilesets state.
- Description: Backs the cached state for this file.

#### `private Tiler[] tiles`
- Role: Holds the tiles state.
- Description: Backs the cached state for this file.

#### `final Grid grid`
- Role: Stores the grid value.
- Description: Backs the cached state for this file.

#### `final Coord gc`
- Role: Stores the gc value.
- Description: Backs the cached state for this file.

#### `int[] tilemap = null`
- Role: Stores the tilemap value.
- Description: Backs the cached state for this file.

#### `private Coord cachedgc = null`
- Role: Stores the cachedgc value.
- Description: Backs the cached state for this file.

#### `private GridMap cached = null`
- Role: Caches cached entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final BackCache<Long, Segment> segments = new BackCache<>(5, id ->`
- Role: Caches segments entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public long gid, segid, mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `public long gid, segid, mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `public long gid, segid, mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `public Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public TileInfo[] tilesets`
- Role: Holds the tilesets state.
- Description: Backs the cached state for this file.

#### `public int[] tiles`
- Role: Stores the tiles value.
- Description: Backs the cached state for this file.

#### `public float[] zmap`
- Role: Stores the zmap value.
- Description: Backs the cached state for this file.

#### `public Collection<Overlay> ols = new ArrayList<>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static ImportFilter all = new ImportFilter()`
- Role: Holds the all state.
- Description: Backs the cached state for this file.

#### `public static ImportFilter readonly = new ImportFilter()`
- Role: Holds the readonly state.
- Description: Backs the cached state for this file.

#### `final Map<Long, ImportedSegment> segs = new HashMap<>()`
- Role: Caches segs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final ImportFilter filter`
- Role: Holds the filter state.
- Description: Backs the cached state for this file.

#### `Segment curseg`
- Role: Stores the curseg value.
- Description: Backs the cached state for this file.

#### `final Map<Long, Coord> offs = new HashMap<>()`
- Role: Caches offs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `long nseg`
- Role: Stores the nseg value.
- Description: Backs the cached state for this file.

#### `Coord noff = null`
- Role: Stores the noff value.
- Description: Backs the cached state for this file.

### Methods

#### `public MapFile(ResCache store, String filename)`
- Role: Creates a new MapFile instance.
- Description: Constructs the instance and initializes its default state.

#### `private void checklock()`
- Role: Performs checklock.
- Description: Supports the checklock operation used by the surrounding class.

#### `private String mangle(String datum)`
- Role: Performs mangle.
- Description: Supports the mangle operation used by the surrounding class.

#### `private InputStream sfetch(String ctl, Object... args) throws IOException`
- Role: Handles the sfetch workflow.
- Description: Supports the sfetch operation used by the surrounding class.

#### `private OutputStream sstore(String ctl, Object... args) throws IOException`
- Role: Handles the sstore workflow.
- Description: Supports the sstore operation used by the surrounding class.

#### `public static void warn(Throwable cause, String msg)`
- Role: Performs warn.
- Description: Supports the warn operation used by the surrounding class.

#### `public static void warn(Throwable cause, String fmt, Object... args)`
- Role: Performs warn.
- Description: Supports the warn operation used by the surrounding class.

#### `public static void warn(String fmt, Object... args)`
- Role: Performs warn.
- Description: Supports the warn operation used by the surrounding class.

#### `public static MapFile load(ResCache store, String filename) throws IOException`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `private void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void defersave()`
- Role: Performs defersave.
- Description: Supports the defersave operation used by the surrounding class.

#### `public GridInfo(long id, long seg, Coord sc)`
- Role: Performs grid info.
- Description: Supports the grid info operation used by the surrounding class.

#### `private static Runnable locked(Runnable r, Lock lock)`
- Role: Performs locked.
- Description: Supports the locked operation used by the surrounding class.

#### `private static <A> Defer.Callable<A> locked(Defer.Callable<A> f, Lock lock)`
- Role: Performs locked.
- Description: Supports the locked operation used by the surrounding class.

#### `private static <A, R> Function<A, R> locked(Function<A, R> f, Lock lock)`
- Role: Performs locked.
- Description: Supports the locked operation used by the surrounding class.

#### `Processor()`
- Role: Handles the processor workflow.
- Description: Supports the processor operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void process()`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public Marker(MapFile file, long seg, Coord tc, String nm)`
- Role: Performs marker.
- Description: Supports the marker operation used by the surrounding class.

#### `public void update(boolean save)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public PMarker(MapFile file, long seg, Coord tc, String nm, Color color, boolean onmap)`
- Role: Performs pmarker.
- Description: Supports the pmarker operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public SMarker(MapFile file, long seg, Coord tc, String nm, UID oid, Resource.Saved res, byte[] data)`
- Role: Performs smarker.
- Description: Supports the smarker operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Marker loadmarker(Message fp)`
- Role: Performs loadmarker.
- Description: Supports the loadmarker operation used by the surrounding class.

#### `private static void savemarker(Message fp, Marker mark)`
- Role: Performs savemarker.
- Description: Supports the savemarker operation used by the surrounding class.

#### `public void add(Marker mark)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Marker mark)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Marker mark)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public SMarker smarker(String resnm, long seg, Coord tc)`
- Role: Performs smarker.
- Description: Supports the smarker operation used by the surrounding class.

#### `public TileInfo(Resource.Saved res, int prio)`
- Role: Performs tile info.
- Description: Supports the tile info operation used by the surrounding class.

#### `public Overlay(Resource.Saved olid, boolean[] ol)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public boolean get(Coord c)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public DataGrid(TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`
- Role: Performs data grid.
- Description: Supports the data grid operation used by the surrounding class.

#### `public int gettile(Coord c)`
- Role: Performs gettile.
- Description: Supports the gettile operation used by the surrounding class.

#### `public double getfz(Coord c)`
- Role: Performs getfz.
- Description: Supports the getfz operation used by the surrounding class.

#### `private BufferedImage tiletex(int t, BufferedImage[] texes, boolean[] cached)`
- Role: Performs tiletex.
- Description: Supports the tiletex operation used by the surrounding class.

#### `public BufferedImage render(Coord off)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `private static Color olcol(MCache.OverlayInfo olid)`
- Role: Performs olcol.
- Description: Supports the olcol operation used by the surrounding class.

#### `public BufferedImage olrender(Coord off, String tag)`
- Role: Performs olrender.
- Description: Supports the olrender operation used by the surrounding class.

#### `public static void savetiles(Message fp, TileInfo[] tilesets, int[] tiles)`
- Role: Performs savetiles.
- Description: Supports the savetiles operation used by the surrounding class.

#### `public static Pair<TileInfo[], int[]> loadtiles(Message fp, int ver)`
- Role: Performs loadtiles.
- Description: Supports the loadtiles operation used by the surrounding class.

#### `public static void savez(Message fp, float[] zmap)`
- Role: Performs savez.
- Description: Supports the savez operation used by the surrounding class.

#### `public static float[] loadz(Message fp, String nm)`
- Role: Performs loadz.
- Description: Supports the loadz operation used by the surrounding class.

#### `public static void saveols(Message fp, Collection<Overlay> ols)`
- Role: Performs saveols.
- Description: Supports the saveols operation used by the surrounding class.

#### `public static void loadols(Collection<Overlay> buf, Message fp, String nm)`
- Role: Performs loadols.
- Description: Supports the loadols operation used by the surrounding class.

#### `public Grid(long id, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public static Grid from(MCache map, MCache.Grid cg)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.

#### `public Grid mergeprev(Grid prev)`
- Role: Performs mergeprev.
- Description: Supports the mergeprev operation used by the surrounding class.

#### `public void save(Message fp)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void save(MapFile file)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public static Grid load(MapFile file, long id)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public ZoomGrid(long seg, int lvl, Coord sc, TileInfo[] tilesets, int[] tiles, float[] zmap, long mtime)`
- Role: Performs zoom grid.
- Description: Supports the zoom grid operation used by the surrounding class.

#### `public static ZoomGrid fetch(MapFile file, Segment seg, int lvl, Coord sc)`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `private static DataGrid fetchg(MapFile file, Segment seg, int lvl, Coord sc)`
- Role: Performs fetchg.
- Description: Supports the fetchg operation used by the surrounding class.

#### `public static ZoomGrid from(MapFile file, Segment seg, int lvl, Coord sc)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.

#### `private static void zoomols(Collection<Overlay> buf, DataGrid[] lower)`
- Role: Performs zoomols.
- Description: Supports the zoomols operation used by the surrounding class.

#### `public void save(Message fp)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void save(MapFile file)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public static ZoomGrid load(MapFile file, long seg, int lvl, Coord sc)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public static int inval(MapFile file, long seg, Coord sc)`
- Role: Performs inval.
- Description: Supports the inval operation used by the surrounding class.

#### `public ZoomCoord(int lvl, Coord c)`
- Role: Performs zoom coord.
- Description: Supports the zoom coord operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Segment(long id)`
- Role: Performs segment.
- Description: Supports the segment operation used by the surrounding class.

#### `public MapFile file()`
- Role: Performs file.
- Description: Supports the file operation used by the surrounding class.

#### `Cached(Future<Grid> loading)`
- Role: Handles the cached workflow.
- Description: Supports the cached operation used by the surrounding class.

#### `public Grid get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private Grid loaded(long id)`
- Role: Performs loaded.
- Description: Supports the loaded operation used by the surrounding class.

#### `private Future<Grid> loadgrid(long id)`
- Role: Performs loadgrid.
- Description: Supports the loadgrid operation used by the surrounding class.

#### `private Cached grid0(long id)`
- Role: Performs grid0.
- Description: Supports the grid0 operation used by the surrounding class.

#### `public Indir<Grid> grid(long id)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `ByCoord(Coord sc, Cached cur)`
- Role: Handles the by coord workflow.
- Description: Supports the by coord operation used by the surrounding class.

#### `public Grid get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private Future<ZoomGrid> loadzgrid(ZoomCoord zc)`
- Role: Performs loadzgrid.
- Description: Supports the loadzgrid operation used by the surrounding class.

#### `ByZCoord(ZoomCoord zc, Future<ZoomGrid> loading)`
- Role: Handles the by zcoord workflow.
- Description: Supports the by zcoord operation used by the surrounding class.

#### `public ZoomGrid get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Indir<Grid> grid(Coord gc)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public Indir<? extends DataGrid> grid(int lvl, Coord gc)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `private void include(long id, Coord sc)`
- Role: Performs include.
- Description: Supports the include operation used by the surrounding class.

#### `private void include(Grid grid, Coord sc)`
- Role: Performs include.
- Description: Supports the include operation used by the surrounding class.

#### `public View(Segment seg)`
- Role: Performs view.
- Description: Supports the view operation used by the surrounding class.

#### `GridMap(Grid grid, Coord gc)`
- Role: Handles the grid map workflow.
- Description: Supports the grid map operation used by the surrounding class.

#### `public void addgrid(Coord gc)`
- Role: Performs addgrid.
- Description: Supports the addgrid operation used by the surrounding class.

#### `TileSort()`
- Role: Handles the tile sort workflow.
- Description: Supports the tile sort operation used by the surrounding class.

#### `protected List<String> pick(Collection<String> from)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `protected List<String> pickbad()`
- Role: Performs pickbad.
- Description: Supports the pickbad operation used by the surrounding class.

#### `public void fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `private GridMap getgrid(Coord gc)`
- Role: Performs getgrid.
- Description: Supports the getgrid operation used by the surrounding class.

#### `public int gettile(Coord tc)`
- Role: Performs gettile.
- Description: Supports the gettile operation used by the surrounding class.

#### `public double getfz(Coord tc)`
- Role: Performs getfz.
- Description: Supports the getfz operation used by the surrounding class.

#### `public Tileset tileset(int n)`
- Role: Performs tileset.
- Description: Supports the tileset operation used by the surrounding class.

#### `public Tiler tiler(int n)`
- Role: Performs tiler.
- Description: Supports the tiler operation used by the surrounding class.

#### `private void merge(Segment dst, Segment src, Coord soff)`
- Role: Performs merge.
- Description: Supports the merge operation used by the surrounding class.

#### `public void update(MCache map, Collection<MCache.Grid> grids)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public boolean includeseg(long id)`
- Role: Performs includeseg.
- Description: Supports the includeseg operation used by the surrounding class.

#### `public boolean includegrid(Segment seg, Coord sc, long id)`
- Role: Performs includegrid.
- Description: Supports the includegrid operation used by the surrounding class.

#### `public boolean includemark(Marker mark)`
- Role: Performs includemark.
- Description: Supports the includemark operation used by the surrounding class.

#### `public static ExportFilter segment(long sid)`
- Role: Performs segment.
- Description: Supports the segment operation used by the surrounding class.

#### `public static ExportFilter around(Marker mark, double rad)`
- Role: Performs around.
- Description: Supports the around operation used by the surrounding class.

#### `public default void grid(int cs, int ns, int cg, int ng)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public default void mark(int cm, int nm)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void export(Message out, ExportFilter filter, ExportStatus prog) throws InterruptedException`
- Role: Handles the export workflow.
- Description: Supports the export operation used by the surrounding class.

#### `public void export(OutputStream out, ExportFilter filter, ExportStatus prog) throws InterruptedException`
- Role: Handles the export workflow.
- Description: Supports the export operation used by the surrounding class.

#### `ImportedGrid(Message data)`
- Role: Handles the imported grid workflow.
- Description: Supports the imported grid operation used by the surrounding class.

#### `Grid togrid()`
- Role: Performs togrid.
- Description: Supports the togrid operation used by the surrounding class.

#### `public boolean includegrid(ImportedGrid grid, boolean hasprev)`
- Role: Performs includegrid.
- Description: Supports the includegrid operation used by the surrounding class.

#### `public boolean includemark(Marker mark, Marker prev)`
- Role: Performs includemark.
- Description: Supports the includemark operation used by the surrounding class.

#### `public default void handleerror(RuntimeException exc, String ctx)`
- Role: Performs handleerror.
- Description: Supports the handleerror operation used by the surrounding class.

#### `Importer(ImportFilter filter)`
- Role: Handles the importer workflow.
- Description: Supports the importer operation used by the surrounding class.

#### `void flush()`
- Role: Performs flush.
- Description: Supports the flush operation used by the surrounding class.

#### `Segment chseg(Segment nseg)`
- Role: Performs chseg.
- Description: Supports the chseg operation used by the surrounding class.

#### `Segment chseg(long id)`
- Role: Performs chseg.
- Description: Supports the chseg operation used by the surrounding class.

#### `void importgrid(Message data)`
- Role: Performs importgrid.
- Description: Supports the importgrid operation used by the surrounding class.

#### `Marker prevmark(Marker mark)`
- Role: Performs prevmark.
- Description: Supports the prevmark operation used by the surrounding class.

#### `void importmark(Message data)`
- Role: Performs importmark.
- Description: Supports the importmark operation used by the surrounding class.

#### `void reimport(Message data) throws InterruptedException`
- Role: Handles the reimport workflow.
- Description: Supports the reimport operation used by the surrounding class.

#### `public void reimport(Message data, ImportFilter filter) throws InterruptedException`
- Role: Handles the reimport workflow.
- Description: Supports the reimport operation used by the surrounding class.

#### `public void reimport(InputStream fp, ImportFilter filter) throws InterruptedException`
- Role: Handles the reimport workflow.
- Description: Supports the reimport operation used by the surrounding class.

#### `public void update(MCache map, Coord cgc)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.
