# MapMesh

This file documents the responsibilities and members of `MapMesh`.

## Meta

- Source: [MapMesh.java](../../../src/haven/MapMesh.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents map mesh rendering data.

## Nested Types

### ConsHooks

- Description: TODO

### DataID

- Description: TODO

### MLOrder

- Description: TODO

### MapSurface

- Description: TODO

### MatKey

- Description: TODO

### Model

- Description: TODO

### OLArray

- Description: TODO

### OLOrder

- Description: TODO

### Scan

- Description: TODO

### ShallowWrap

- Description: TODO

## Members

### Constants

#### `public static final DataID<MapSurface> gnd = makeid(MapSurface.class)`

- Description: TODO

#### `private static final VertexArray.Layout olvfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`

- Description: TODO

#### `private static final VertexArray.Layout gridfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 12))`

- Description: TODO

### Fields

#### `public final Coord ul, sz`

- Description: TODO

#### `public final Coord ul, sz`

- Description: TODO

#### `public final MCache map`

- Description: TODO

#### `public RenderTree.Node flat`

- Description: TODO

#### `private final long rnd`

- Description: TODO

#### `private Map<DataID, Object> data = new LinkedHashMap<DataID, Object>()`

- Description: TODO

#### `private List<RenderTree.Node> extras = new ArrayList<RenderTree.Node>()`

- Description: TODO

#### `private List<Disposable> dparts = new ArrayList<Disposable>()`

- Description: TODO

#### `public final Coord ul, sz, br`

- Description: TODO

#### `public final Coord ul, sz, br`

- Description: TODO

#### `public final Coord ul, sz, br`

- Description: TODO

#### `public final int l`

- Description: TODO

#### `public final Scan vs = new Scan(Coord.of(-1, -1), sz.add(3, 3))`

- Description: TODO

#### `public final Scan ts = new Scan(Coord.z, sz)`

- Description: TODO

#### `public final Scan bs = new Scan(Coord.of(-1, -1), sz.add(2, 2))`

- Description: TODO

#### `public final Vertex[] surf = new Vertex[vs.l]`

- Description: TODO

#### `public final boolean[] split = new boolean[bs.l]`

- Description: TODO

#### `public final int z`

- Description: TODO

#### `private final static Comparator<MLOrder> cmp = new Comparator<MLOrder>()`

- Description: TODO

#### `public static Order premap = new Order.Default(990)`

- Description: TODO

#### `public static Order postmap = new Order.Default(1010)`

- Description: TODO

#### `public final MapMesh m`

- Description: TODO

#### `public final NodeWrap mat`

- Description: TODO

#### `public final NodeWrap mat`

- Description: TODO

#### `private final int hash`

- Description: TODO

#### `private static Pipe.Op gmmat = Pipe.Op.compose(new States.DepthBias(-1, -1),`

- Description: TODO

#### `private Map<Pair<MCache.SurfaceID, Tiler>, MCache.ZSurface> zsurfaces = new HashMap<>()`

- Description: TODO

#### `public final MCache.OverlayInfo id`

- Description: TODO

#### `private final static Comparator<OLOrder> cmp = (a, b) ->`

- Description: TODO

#### `VertexArray dat`

- Description: TODO

#### `int[] vl`

- Description: TODO

#### `private OLArray olvert = null`

- Description: TODO

#### `final Rendered r`

- Description: TODO

#### `final Pipe.Op st`

- Description: TODO

#### `public static Order clickmain = Rendered.deflt`

- Description: TODO

#### `public static Order clickpost = new Order.Default(100)`

- Description: TODO

#### `private RenderTree.Node grid = null`

- Description: TODO

### Methods

#### `public T make(MapMesh m)`

- Description: TODO

#### `public static <T> DataID<T> makeid(Class<T> cl)`

- Description: TODO

#### `public default void sfin()`

- Description: TODO

#### `public default void calcnrm()`

- Description: TODO

#### `public default void postcalcnrm(Random rnd)`

- Description: TODO

#### `public default boolean clean()`

- Description: TODO

#### `public <T> T data(DataID<T> id)`

- Description: TODO

#### `public Scan(Coord ul, Coord sz)`

- Description: TODO

#### `public int o(int x, int y)`

- Description: TODO

#### `public int o(Coord in)`

- Description: TODO

#### `public boolean has(int x, int y)`

- Description: TODO

#### `public boolean has(Coord in)`

- Description: TODO

#### `public MapSurface()`

- Description: TODO

#### `private void modelborder()`

- Description: TODO

#### `public Vertex fortile(Coord c)`

- Description: TODO

#### `public Vertex[] fortilea(Coord c)`

- Description: TODO

#### `public void sfin()`

- Description: TODO

#### `public void calcnrm()`

- Description: TODO

#### `public void postcalcnrm(Random rnd)`

- Description: TODO

#### `public boolean clean()`

- Description: TODO

#### `public MLOrder(int z, int subz)`

- Description: TODO

#### `public MLOrder(int z)`

- Description: TODO

#### `public int mainorder()`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public Comparator<MLOrder> comparator()`

- Description: TODO

#### `private MapMesh(MCache map, Coord ul, Coord sz, Random rnd)`

- Description: TODO

#### `public Random rnd()`

- Description: TODO

#### `public Random rnd(Coord c)`

- Description: TODO

#### `public static Random grnd(Coord c)`

- Description: TODO

#### `private static void dotrans(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public Model(MapMesh m, NodeWrap mat)`

- Description: TODO

#### `public void sfin()`

- Description: TODO

#### `public void calcnrm()`

- Description: TODO

#### `public boolean clean()`

- Description: TODO

#### `public void postcalcnrm(Random rnd)`

- Description: TODO

#### `public MatKey(NodeWrap mat)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public Model make(MapMesh m)`

- Description: TODO

#### `public static Model get(MapMesh m, NodeWrap mat)`

- Description: TODO

#### `public static MapMesh build(MCache mc, Random rnd, Coord ul, Coord sz)`

- Description: TODO

#### `public static RenderTree.Node groundmod(MCache map, Coord2d cc, Coord2d ul, Coord2d br, double a)`

- Description: TODO

#### `public MCache.ZSurface getsurf(MCache.SurfaceID id, Tiler tile)`

- Description: TODO

#### `public OLOrder(MCache.OverlayInfo id)`

- Description: TODO

#### `public int mainorder()`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public Comparator<OLOrder> comparator()`

- Description: TODO

#### `OLArray(VertexArray dat, int[] vl)`

- Description: TODO

#### `private OLArray makeolvbuf()`

- Description: TODO

#### `ShallowWrap(Rendered r, Pipe.Op st)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void draw(Pipe context, Render out)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public RenderTree.Node makeol(MCache.OverlayInfo id)`

- Description: TODO

#### `public RenderTree.Node makeolol(MCache.OverlayInfo id)`

- Description: TODO

#### `private void clean()`

- Description: TODO

#### `private void consflat()`

- Description: TODO

#### `private RenderTree.Node consgrid()`

- Description: TODO

#### `public RenderTree.Node grid()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public String toString()`

- Description: TODO
