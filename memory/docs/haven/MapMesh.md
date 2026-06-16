# MapMesh

This file documents the responsibilities and members of `MapMesh`.

## Meta

- Source: [MapMesh.java](../../../src/haven/MapMesh.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the map mesh Haven component.

## Nested Types

### ConsHooks

- Role: Represents cons hooks within MapMesh.
- Description: Describes the nested cons hooks type used by the enclosing class.

### DataID

- Role: Represents data id within MapMesh.
- Description: Describes the nested data id type used by the enclosing class.

### MLOrder

- Role: Represents mlorder within MapMesh.
- Description: Describes the nested mlorder type used by the enclosing class.

### MapSurface

- Role: Represents map surface within MapMesh.
- Description: Describes the nested map surface type used by the enclosing class.

### MatKey

- Role: Represents mat key within MapMesh.
- Description: Describes the nested mat key type used by the enclosing class.

### Model

- Role: Represents model within MapMesh.
- Description: Describes the nested model type used by the enclosing class.

### OLArray

- Role: Represents olarray within MapMesh.
- Description: Describes the nested olarray type used by the enclosing class.

### OLOrder

- Role: Represents olorder within MapMesh.
- Description: Describes the nested olorder type used by the enclosing class.

### Scan

- Role: Represents scan within MapMesh.
- Description: Describes the nested scan type used by the enclosing class.

### ShallowWrap

- Role: Represents shallow wrap within MapMesh.
- Description: Describes the nested shallow wrap type used by the enclosing class.

## Members

### Constants

#### `public static final DataID<MapSurface> gnd = makeid(MapSurface.class)`
- Role: Defines the shared gnd constant.
- Description: Shared constant used by the rest of the class.

#### `private static final VertexArray.Layout olvfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Defines the shared olvfmt constant.
- Description: Shared constant used by the rest of the class.

#### `private static final VertexArray.Layout gridfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 12))`
- Role: Defines the shared gridfmt constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Coord ul, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final Coord ul, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final MCache map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public RenderTree.Node flat`
- Role: Stores the flat value.
- Description: Backs the cached state for this file.

#### `private final long rnd`
- Role: Stores the rnd value.
- Description: Backs the cached state for this file.

#### `private Map<DataID, Object> data = new LinkedHashMap<DataID, Object>()`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<RenderTree.Node> extras = new ArrayList<RenderTree.Node>()`
- Role: Caches extras entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<Disposable> dparts = new ArrayList<Disposable>()`
- Role: Caches dparts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Coord ul, sz, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

#### `public final Coord ul, sz, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

#### `public final Coord ul, sz, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

#### `public final int l`
- Role: Stores the l value.
- Description: Backs the cached state for this file.

#### `public final Scan vs = new Scan(Coord.of(-1, -1), sz.add(3, 3))`
- Role: Holds the vs state.
- Description: Backs the cached state for this file.

#### `public final Scan ts = new Scan(Coord.z, sz)`
- Role: Holds the ts state.
- Description: Backs the cached state for this file.

#### `public final Scan bs = new Scan(Coord.of(-1, -1), sz.add(2, 2))`
- Role: Holds the bs state.
- Description: Backs the cached state for this file.

#### `public final Vertex[] surf = new Vertex[vs.l]`
- Role: Stores the surf value.
- Description: Backs the cached state for this file.

#### `public final boolean[] split = new boolean[bs.l]`
- Role: Tracks the split flag.
- Description: Supports the split operation used by the surrounding class.

#### `public final int z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `private final static Comparator<MLOrder> cmp = new Comparator<MLOrder>()`
- Role: Holds the cmp state.
- Description: Backs the cached state for this file.

#### `public static Order premap = new Order.Default(990)`
- Role: Holds the premap state.
- Description: Backs the cached state for this file.

#### `public static Order postmap = new Order.Default(1010)`
- Role: Holds the postmap state.
- Description: Backs the cached state for this file.

#### `public final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public final NodeWrap mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `public final NodeWrap mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `private final int hash`
- Role: Stores the hash value.
- Description: Backs the cached state for this file.

#### `private static Pipe.Op gmmat = Pipe.Op.compose(new States.DepthBias(-1, -1),`
- Role: Holds the gmmat state.
- Description: Backs the cached state for this file.

#### `private Map<Pair<MCache.SurfaceID, Tiler>, MCache.ZSurface> zsurfaces = new HashMap<>()`
- Role: Caches zsurfaces entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MCache.OverlayInfo id`
- Role: Caches id entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final static Comparator<OLOrder> cmp = (a, b) ->`
- Role: Holds the cmp state.
- Description: Backs the cached state for this file.

#### `VertexArray dat`
- Role: Caches dat entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `int[] vl`
- Role: Stores the vl value.
- Description: Backs the cached state for this file.

#### `private OLArray olvert = null`
- Role: Caches olvert entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Rendered r`
- Role: Holds the r state.
- Description: Backs the cached state for this file.

#### `final Pipe.Op st`
- Role: Holds the st state.
- Description: Backs the cached state for this file.

#### `public static Order clickmain = Rendered.deflt`
- Role: Holds the clickmain state.
- Description: Backs the cached state for this file.

#### `public static Order clickpost = new Order.Default(100)`
- Role: Holds the clickpost state.
- Description: Backs the cached state for this file.

#### `private RenderTree.Node grid = null`
- Role: Stores the grid value.
- Description: Backs the cached state for this file.

### Methods

#### `public T make(MapMesh m)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public static <T> DataID<T> makeid(Class<T> cl)`
- Role: Performs makeid.
- Description: Supports the makeid operation used by the surrounding class.

#### `public default void sfin()`
- Role: Performs sfin.
- Description: Supports the sfin operation used by the surrounding class.

#### `public default void calcnrm()`
- Role: Performs calcnrm.
- Description: Supports the calcnrm operation used by the surrounding class.

#### `public default void postcalcnrm(Random rnd)`
- Role: Performs postcalcnrm.
- Description: Supports the postcalcnrm operation used by the surrounding class.

#### `public default boolean clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public <T> T data(DataID<T> id)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public Scan(Coord ul, Coord sz)`
- Role: Performs scan.
- Description: Supports the scan operation used by the surrounding class.

#### `public int o(int x, int y)`
- Role: Performs o.
- Description: Supports the o operation used by the surrounding class.

#### `public int o(Coord in)`
- Role: Performs o.
- Description: Supports the o operation used by the surrounding class.

#### `public boolean has(int x, int y)`
- Role: Performs has.
- Description: Supports the has operation used by the surrounding class.

#### `public boolean has(Coord in)`
- Role: Performs has.
- Description: Supports the has operation used by the surrounding class.

#### `public MapSurface()`
- Role: Performs map surface.
- Description: Supports the map surface operation used by the surrounding class.

#### `private void modelborder()`
- Role: Performs modelborder.
- Description: Supports the modelborder operation used by the surrounding class.

#### `public Vertex fortile(Coord c)`
- Role: Performs fortile.
- Description: Supports the fortile operation used by the surrounding class.

#### `public Vertex[] fortilea(Coord c)`
- Role: Performs fortilea.
- Description: Supports the fortilea operation used by the surrounding class.

#### `public void sfin()`
- Role: Performs sfin.
- Description: Supports the sfin operation used by the surrounding class.

#### `public void calcnrm()`
- Role: Performs calcnrm.
- Description: Supports the calcnrm operation used by the surrounding class.

#### `public void postcalcnrm(Random rnd)`
- Role: Performs postcalcnrm.
- Description: Supports the postcalcnrm operation used by the surrounding class.

#### `public boolean clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public MLOrder(int z, int subz)`
- Role: Performs mlorder.
- Description: Supports the mlorder operation used by the surrounding class.

#### `public MLOrder(int z)`
- Role: Performs mlorder.
- Description: Supports the mlorder operation used by the surrounding class.

#### `public int mainorder()`
- Role: Performs mainorder.
- Description: Supports the mainorder operation used by the surrounding class.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public Comparator<MLOrder> comparator()`
- Role: Performs comparator.
- Description: Supports the comparator operation used by the surrounding class.

#### `private MapMesh(MCache map, Coord ul, Coord sz, Random rnd)`
- Role: Creates a new MapMesh instance.
- Description: Constructs the instance and initializes its default state.

#### `public Random rnd()`
- Role: Performs rnd.
- Description: Supports the rnd operation used by the surrounding class.

#### `public Random rnd(Coord c)`
- Role: Performs rnd.
- Description: Supports the rnd operation used by the surrounding class.

#### `public static Random grnd(Coord c)`
- Role: Performs grnd.
- Description: Supports the grnd operation used by the surrounding class.

#### `private static void dotrans(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs dotrans.
- Description: Supports the dotrans operation used by the surrounding class.

#### `public Model(MapMesh m, NodeWrap mat)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `public void sfin()`
- Role: Performs sfin.
- Description: Supports the sfin operation used by the surrounding class.

#### `public void calcnrm()`
- Role: Performs calcnrm.
- Description: Supports the calcnrm operation used by the surrounding class.

#### `public boolean clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public void postcalcnrm(Random rnd)`
- Role: Performs postcalcnrm.
- Description: Supports the postcalcnrm operation used by the surrounding class.

#### `public MatKey(NodeWrap mat)`
- Role: Performs mat key.
- Description: Supports the mat key operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Model make(MapMesh m)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public static Model get(MapMesh m, NodeWrap mat)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static MapMesh build(MCache mc, Random rnd, Coord ul, Coord sz)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public static RenderTree.Node groundmod(MCache map, Coord2d cc, Coord2d ul, Coord2d br, double a)`
- Role: Performs groundmod.
- Description: Supports the groundmod operation used by the surrounding class.

#### `public MCache.ZSurface getsurf(MCache.SurfaceID id, Tiler tile)`
- Role: Returns the surface id for the supplied surface name.
- Description: Maps a surface name to the corresponding `MCache.SurfaceID` value.

#### `public OLOrder(MCache.OverlayInfo id)`
- Role: Performs olorder.
- Description: Supports the olorder operation used by the surrounding class.

#### `public int mainorder()`
- Role: Performs mainorder.
- Description: Supports the mainorder operation used by the surrounding class.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public Comparator<OLOrder> comparator()`
- Role: Performs comparator.
- Description: Supports the comparator operation used by the surrounding class.

#### `OLArray(VertexArray dat, int[] vl)`
- Role: Handles the olarray workflow.
- Description: Supports the olarray operation used by the surrounding class.

#### `private OLArray makeolvbuf()`
- Role: Performs makeolvbuf.
- Description: Supports the makeolvbuf operation used by the surrounding class.

#### `ShallowWrap(Rendered r, Pipe.Op st)`
- Role: Handles the shallow wrap workflow.
- Description: Supports the shallow wrap operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public RenderTree.Node makeol(MCache.OverlayInfo id)`
- Role: Performs makeol.
- Description: Supports the makeol operation used by the surrounding class.

#### `public RenderTree.Node makeolol(MCache.OverlayInfo id)`
- Role: Performs makeolol.
- Description: Supports the makeolol operation used by the surrounding class.

#### `private void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `private void consflat()`
- Role: Performs consflat.
- Description: Supports the consflat operation used by the surrounding class.

#### `private RenderTree.Node consgrid()`
- Role: Performs consgrid.
- Description: Supports the consgrid operation used by the surrounding class.

#### `public RenderTree.Node grid()`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
