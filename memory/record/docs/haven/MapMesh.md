---
source: [MapMesh.java](../../../../src/haven/MapMesh.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapMesh

Builds terrain, overlay, and grid render data for a single map region.

## Nested Types

### ConsHooks

- Role: Defines lifecycle hooks used while a map mesh is being built.
- Description: Lets data objects react after surface creation, after normals are computed, and before cleanup.

### DataID

- Role: Creates typed per-mesh data on demand.
- Description: Builds cached `MapMesh`-scoped helper objects such as surfaces and overlay data.

### MLOrder

- Role: Orders mesh elements within the map-layer render pass.
- Description: Wraps a packed z-order value and exposes a comparator for render ordering.

### MapSurface

- Role: Represents the terrain surface geometry for one mesh cut.
- Description: Precomputes tile vertices, split flags, and border handling for the generated mesh.

### MatKey

- Role: Keys a `Model` instance by material wrapper.
- Description: Makes the material wrapper itself the cache key for `MapMesh.Model`.

### Model

- Role: Builds extra mesh geometry for one material wrapper.
- Description: Collects generated faces and attaches them to the parent `MapMesh` as render extras.

### OLArray

- Role: Stores overlay vertex buffers and their vertex lookup table.
- Description: Keeps the built `VertexArray` together with the per-surface vertex mapping.

### OLOrder

- Role: Orders overlay geometry by overlay identity.
- Description: Uses the overlay-info object identity as the render-order key.

### Scan

- Role: Describes a rectangular tile scan region.
- Description: Precomputes origin, size, bounds, and linear indexing helpers for mesh work.

### ShallowWrap

- Role: Wraps a rendered object with an extra render-tree state.
- Description: Applies a shallow state override while delegating draw and disposal to the wrapped object.

## Members

### Constants

#### `public static final DataID<MapSurface> gnd = makeid(MapSurface.class)`
- Role: Keys the terrain surface helper.
- Description: Returns the cached `MapSurface` instance for this mesh.
- Value: `makeid(MapSurface.class)`

#### `private static final VertexArray.Layout olvfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Defines the overlay vertex layout.
- Description: Packs world position data for overlay geometry.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`

#### `private static final VertexArray.Layout gridfmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 12))`
- Role: Defines the terrain grid vertex layout.
- Description: Packs only world position data for the ground grid.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 12))`

### Fields

#### `public final Coord ul, sz`
- Role: Stores the mesh origin and size.
- Description: Defines the rectangular tile region covered by this mesh.

#### `public final Coord ul, sz`
- Role: Stores the mesh extent.
- Description: Describes how many tiles wide and tall this mesh slice is.

#### `public final MCache map`
- Role: Stores the backing map cache.
- Description: Supplies terrain and overlay data while the mesh is being built.

#### `public RenderTree.Node flat`
- Role: Stores the flat render node.
- Description: Used for the plain terrain surface representation.

#### `private final long rnd`
- Role: Stores the random seed for mesh generation.
- Description: Keeps terrain generation stable for the same map region.

#### `private Map<DataID, Object> data = new LinkedHashMap<DataID, Object>()`
- Role: Caches per-mesh helper objects.
- Description: Stores lazily created `DataID` products such as surfaces and models.

#### `private List<RenderTree.Node> extras = new ArrayList<RenderTree.Node>()`
- Role: Stores extra render nodes.
- Description: Holds overlay or auxiliary geometry attached to this mesh.

#### `private List<Disposable> dparts = new ArrayList<Disposable>()`
- Role: Stores disposable sub-resources.
- Description: Tracks helper objects that must be released when the mesh is disposed.

#### `public final Coord ul, sz, br`
- Role: Stores the scan bounds.
- Description: Keeps the lower-left origin, size, and exclusive upper-right corner of the scan.

#### `public final Coord ul, sz, br`
- Role: Stores the scan bounds.
- Description: Repeats the same region metadata for the second scan helper.

#### `public final Coord ul, sz, br`
- Role: Stores the scan bounds.
- Description: Repeats the same region metadata for the third scan helper.

#### `public final int l`
- Role: Stores the linear scan length.
- Description: Precomputed count of cells inside the scan region.

#### `public final Scan vs = new Scan(Coord.of(-1, -1), sz.add(3, 3))`
- Role: Stores the vertex scan bounds.
- Description: Extends the mesh area so border vertices can be generated.

#### `public final Scan ts = new Scan(Coord.z, sz)`
- Role: Stores the tile scan bounds.
- Description: Covers the exact tile area represented by the mesh.

#### `public final Scan bs = new Scan(Coord.of(-1, -1), sz.add(2, 2))`
- Role: Stores the border scan bounds.
- Description: Extends the mesh area by one cell for border handling.

#### `public final Vertex[] surf = new Vertex[vs.l]`
- Role: Stores the generated surface vertices.
- Description: Holds one vertex per vertex-scan cell.

#### `public final boolean[] split = new boolean[bs.l]`
- Role: Tracks split edges.
- Description: Marks border edges that need to be split while building the surface.

#### `public final int z`
- Role: Stores the mesh height offset.
- Description: Used when computing the render order and z bias.

#### `private final static Comparator<MLOrder> cmp = new Comparator<MLOrder>()`
- Role: Orders mesh-layer draw keys.
- Description: Sorts map-layer render work by packed z-order.

#### `public static Order premap = new Order.Default(990)`
- Role: Marks pre-map rendering.
- Description: Draws before the main map pass.

#### `public static Order postmap = new Order.Default(1010)`
- Role: Marks post-map rendering.
- Description: Draws after the main map pass.

#### `public final MapMesh m`
- Role: Stores the owning mesh.
- Description: Gives generated sub-models access to the parent map mesh.

#### `public final NodeWrap mat`
- Role: Stores the material wrapper.
- Description: Identifies the material state that produced this model.

#### `public final NodeWrap mat`
- Role: Stores the material wrapper.
- Description: Repeats the same material key on the duplicate model entry.

#### `private final int hash`
- Role: Stores the material wrapper hash.
- Description: Used for cache lookups and equality checks.

#### `private static Pipe.Op gmmat = Pipe.Op.compose(new States.DepthBias(-1, -1),`
- Role: Builds the ground-mesh material override.
- Description: Applies depth bias before drawing generated ground geometry.

#### `private Map<Pair<MCache.SurfaceID, Tiler>, MCache.ZSurface> zsurfaces = new HashMap<>()`
- Role: Caches generated z-surfaces.
- Description: Reuses computed surface data for a surface/tile pair.

#### `public final MCache.OverlayInfo id`
- Role: Stores the overlay identity.
- Description: Used to key overlay geometry and ordering.

#### `private final static Comparator<OLOrder> cmp = (a, b) ->`
- Role: Orders mesh-layer draw keys.
- Description: Sorts map-layer render work by packed z-order.

#### `VertexArray dat`
- Role: Stores the overlay vertex buffer.
- Description: Holds the generated overlay vertices.

#### `int[] vl`
- Role: Stores overlay vertex indices.
- Description: Maps overlay cells to vertex buffer positions.

#### `private OLArray olvert = null`
- Role: Caches the overlay vertex array.
- Description: Reused while building overlay render nodes.

#### `final Rendered r`
- Role: Stores the wrapped renderable.
- Description: Used by shallow render wrappers.

#### `final Pipe.Op st`
- Role: Stores the wrapped pipe state.
- Description: Applied before delegating draw calls.

#### `public static Order clickmain = Rendered.deflt`
- Role: Marks the main click pass.
- Description: Keeps click geometry in the default ordering group.

#### `public static Order clickpost = new Order.Default(100)`
- Role: Marks the post-click pass.
- Description: Renders click feedback after the main interaction geometry.

#### `private RenderTree.Node grid = null`
- Role: Caches the ground grid node.
- Description: Built lazily and reused for the mesh's ground overlay.

### Methods

#### `public T make(MapMesh m)`
- Role: Builds a per-mesh helper value.
- Description: Creates the `DataID`-specific helper for the supplied mesh.

#### `public static <T> DataID<T> makeid(Class<T> cl)`
- Role: Creates a typed mesh data key.
- Description: Returns a `DataID` that memoizes one value per mesh.

#### `public default void sfin()`
- Role: Finalizes surface generation.
- Description: Called after the surface geometry has been built.

#### `public default void calcnrm()`
- Role: Calculates normals.
- Description: Called after surface vertices are available.

#### `public default void postcalcnrm(Random rnd)`
- Role: Applies post-normal cleanup or variation.
- Description: Lets the helper use the mesh RNG after normals are computed.

#### `public default boolean clean()`
- Role: Reports whether the helper can be discarded.
- Description: Returns true when the helper has no more work to do.

#### `public <T> T data(DataID<T> id)`
- Role: Returns cached mesh data by key.
- Description: Lazily creates and memoizes helper values for this mesh.

#### `public Scan(Coord ul, Coord sz)`
- Role: Creates a rectangular scan region.
- Description: Stores the bounds and precomputes the row-major length.

#### `public int o(int x, int y)`
- Role: Computes a linear scan offset.
- Description: Converts x/y coordinates into a flat index.

#### `public int o(Coord in)`
- Role: Computes a linear scan offset.
- Description: Converts a coordinate into a flat index.

#### `public boolean has(int x, int y)`
- Role: Tests whether a coordinate lies inside the scan.
- Description: Returns true when the x/y pair is inside the bounds.

#### `public boolean has(Coord in)`
- Role: Tests whether a coordinate lies inside the scan.
- Description: Returns true when the coordinate is inside the bounds.

#### `public MapSurface()`
- Role: Creates the terrain surface geometry.
- Description: Samples tile heights into vertices and computes split flags for the covered tile area.

#### `private void modelborder()`
- Role: Builds the mesh border geometry.
- Description: Adds flat border tiles around the mesh so edge quads can be built safely.

#### `public Vertex fortile(Coord c)`
- Role: Returns the vertex for one tile corner.
- Description: Looks up or creates the surface vertex for the supplied tile coordinate.

#### `public Vertex[] fortilea(Coord c)`
- Role: Returns the vertices for one tile area.
- Description: Looks up the vertex array that covers the supplied tile coordinate.

#### `public void sfin()`
- Role: Finalizes generated model geometry.
- Description: Runs the border model builder after the main surface has been generated.

#### `public void calcnrm()`
- Role: Calculates generated model normals.
- Description: Surface geometry does not need extra normal work here.

#### `public void postcalcnrm(Random rnd)`
- Role: Applies post-normal adjustments to generated models.
- Description: Surface geometry does not add post-normal variation here.

#### `public boolean clean()`
- Role: Reports whether the generated model is disposable.
- Description: Keeps the surface helper cached because it is reused by overlay generation.

#### `public MLOrder(int z, int subz)`
- Role: Creates a mesh-layer order key.
- Description: Packs z and sub-z for map-layer draw sorting.

#### `public MLOrder(int z)`
- Role: Creates a mesh-layer order key.
- Description: Uses a zero sub-z for simple ordering.

#### `public int mainorder()`
- Role: Returns the primary map-layer order.
- Description: Returns the render order bucket used by the map-layer pass.

#### `public boolean equals(Object x)`
- Role: Compares order keys.
- Description: Returns true when both z and sub-z values match.

#### `public int hashCode()`
- Role: Returns the order-key hash code.
- Description: Hashes the packed z-order fields.

#### `public Comparator<MLOrder> comparator()`
- Role: Returns the mesh-layer order comparator.
- Description: Exposes the shared comparator used by map-layer render sorting.

#### `private MapMesh(MCache map, Coord ul, Coord sz, Random rnd)`
- Role: Creates a new MapMesh instance.
- Description: Binds the map cache, tile bounds, and per-mesh seed used for generation.

#### `public Random rnd()`
- Role: Returns a mesh-local random generator.
- Description: Returns a fresh RNG seeded from this mesh's stored seed.

#### `public Random rnd(Coord c)`
- Role: Returns a coordinate-seeded random generator.
- Description: Derives a coordinate-specific RNG from the mesh seed.

#### `public static Random grnd(Coord c)`
- Role: Returns a global coordinate-seeded random generator.
- Description: Derives a deterministic RNG from the coordinate alone.

#### `private static void dotrans(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Builds tile transition geometry.
- Description: Emits transition faces for the global tile `gc` using the local mesh coordinate `lc`.

#### `public Model(MapMesh m, NodeWrap mat)`
- Role: Creates an auxiliary model for one material wrapper.
- Description: Binds the model to its parent mesh and material key.

#### `public void sfin()`
- Role: Finalizes generated model geometry.
- Description: Hook for post-surface completion.

#### `public void calcnrm()`
- Role: Calculates generated model normals.
- Description: Hook for computing lighting normals on extra geometry.

#### `public boolean clean()`
- Role: Reports whether the generated model is disposable.
- Description: Returns false while the model still needs to stay cached.

#### `public void postcalcnrm(Random rnd)`
- Role: Applies post-normal adjustments to generated models.
- Description: Adds the finished mesh to the parent mesh's extra render list.

#### `public MatKey(NodeWrap mat)`
- Role: Creates a material cache key.
- Description: Wraps the material node so the model cache can reuse it.

#### `public int hashCode()`
- Role: Returns the order-key hash code.
- Description: Hashes the packed z-order fields.

#### `public boolean equals(Object x)`
- Role: Compares order keys.
- Description: Returns true when both z and sub-z values match.

#### `public Model make(MapMesh m)`
- Role: Creates the material-specific mesh model.
- Description: Instantiates the `Model` helper for the requested mesh and material wrapper.

#### `public static Model get(MapMesh m, NodeWrap mat)`
- Role: Returns the cached material-specific mesh model.
- Description: Reuses the `Model` helper for the supplied mesh and material wrapper.

#### `public static MapMesh build(MCache mc, Random rnd, Coord ul, Coord sz)`
- Role: Builds the map mesh for a tile region.
- Description: Scans the covered tiles, builds surfaces and overlays, and finalizes cached helpers.

#### `public static RenderTree.Node groundmod(MCache map, Coord2d cc, Coord2d ul, Coord2d br, double a)`
- Role: Builds a rotated ground overlay mesh.
- Description: Projects a rotated patch of map tiles into a renderable modification node.

#### `public MCache.ZSurface getsurf(MCache.SurfaceID id, Tiler tile)`
- Role: Returns the surface id for the supplied surface name.
- Description: Caches and returns the z-surface built for the given surface and tile pair.

#### `public OLOrder(MCache.OverlayInfo id)`
- Role: Orders overlay render nodes by overlay identity.
- Description: Wraps the overlay info object so draw sorting can stay stable.

#### `public int mainorder()`
- Role: Returns the primary map-layer order.
- Description: Uses the packed z-order value for sorting.

#### `public boolean equals(Object x)`
- Role: Compares order keys.
- Description: Returns true when both z and sub-z values match.

#### `public int hashCode()`
- Role: Returns the order-key hash code.
- Description: Hashes the packed z-order fields.

#### `public Comparator<OLOrder> comparator()`
- Role: Returns the overlay order comparator.
- Description: Exposes the shared comparator used to sort overlay render nodes.

#### `OLArray(VertexArray dat, int[] vl)`
- Role: Stores overlay geometry and its lookup table.
- Description: Pairs the generated `VertexArray` with the vertex remapping used by overlay rendering.

#### `private OLArray makeolvbuf()`
- Role: Builds the shared overlay vertex buffer.
- Description: Extracts the overlay vertex data from the cached surface normals.

#### `ShallowWrap(Rendered r, Pipe.Op st)`
- Role: Wraps a renderable with a shallow render state override.
- Description: Keeps the wrapped renderable unchanged while supplying an extra pipe state at draw time.

#### `public void added(RenderTree.Slot slot)`
- Role: Attaches mesh extras to the render tree slot.
- Description: Adds every cached auxiliary node when the mesh is inserted into the render tree.

#### `public void draw(Pipe context, Render out)`
- Role: Delegates rendering to the wrapped shallow node.
- Description: Forwards the draw call to the wrapped renderable with the current pipe state.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Disposes any mesh-owned disposable parts.

#### `public RenderTree.Node makeol(MCache.OverlayInfo id)`
- Role: Builds filled overlay geometry for one overlay id.
- Description: Generates triangle overlay geometry inside the mesh area.

#### `public RenderTree.Node makeolol(MCache.OverlayInfo id)`
- Role: Builds outline overlay geometry for one overlay id.
- Description: Generates line overlay geometry around overlay boundaries.

#### `private void clean()`
- Role: Drops unneeded cached helpers.
- Description: Removes per-mesh data objects whose lifecycle hooks report they are no longer needed.

#### `private void consflat()`
- Role: Builds the flat terrain mesh.
- Description: Groups tiles by click state and converts them into a composited flat mesh.

#### `private RenderTree.Node consgrid()`
- Role: Builds the wireframe grid node.
- Description: Converts tile edges into a line mesh used for the ground grid overlay.

#### `public RenderTree.Node grid()`
- Role: Returns the cached grid overlay node.
- Description: Lazily builds the wireframe ground grid and reuses it afterward.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Disposes the mesh's transient resources.

#### `public void added(RenderTree.Slot slot)`
- Role: Attaches the flat mesh to the render tree slot.
- Description: Adds the composed flat terrain node when this mesh is inserted.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this MapMesh for debugging and logging.
