---
source: [Ridges.java](../../../../../src/haven/resutil/Ridges.java)
created: 2026-06-13
updated: 2026-06-20
---

# Ridges

Builds ridge geometry on top of a map mesh and keeps edge connectivity consistent across tiles.

## Nested Types

### RidgeTile
Marks tiles that can participate in ridge modeling.

#### Members

##### Methods

#### `public double breakz()`
- Role: Returns the ridge break height.
- Description: Used by ridge modeling to determine the cutoff height.

### RPart
Stores one ridge-part geometry snapshot.

#### Members

##### Fields

#### `public float[] rcx, rcy`
- Role: Stores ridge corner coordinates.
- Description: Used to map ridge vertices back into tile space.

#### `public int[] rn`
- Role: Stores ridge vertex indices.
- Description: Tracks which ridge parts are connected.

#### `public int[][] ledge, uedge`
- Role: Stores lower and upper edge connectivity.
- Description: Used when joining neighboring ridge parts.

#### `public float[] rh`
- Role: Stores ridge heights.
- Description: Controls the final vertical profile.

##### Methods

#### `public RPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f, float[] rcx, float[] rcy, int[] rn, float[] rh, int[][] ledge, int[][] uedge)`
- Role: Builds a ridge-part snapshot.
- Description: Captures vertices, texture coordinates, connectivity, and ridge height data.

#### `public RPart(RPart... parts)`
- Role: Merges multiple ridge parts.
- Description: Combines the supplied ridge segments into one snapshot.

#### `protected void mapvertices(MPart[] mparts, int[][] vmap)`
- Role: Maps the merged vertices.
- Description: Extends the base `MPart` mapping with ridge-specific arrays.

### TexCons
Builds textured ridge geometry using a material and texture height.

#### Members

##### Methods

#### `public TexCons(Pipe.Op mat, float texh)`
- Role: Builds a ridge mesh consumer.
- Description: Stores the material and texture height used for ridge faces.

#### `public void faces(MapMesh m, MPart mdesc)`
- Role: Emits ridge faces.
- Description: Uses the ridge part description to attach geometry to the mesh.

#### `public boolean laygnd(Coord tc, Tiler.MCons cons)`
- Role: Lays ridge ground geometry.
- Description: Places the ground-facing half of the ridge.

#### `public boolean layridge(Coord tc, Tiler.MCons cons)`
- Role: Lays ridge geometry.
- Description: Places the raised ridge-facing half.

#### `public RPart getrdesc(Coord tc)`
- Role: Returns the ridge description for a tile.
- Description: Public access to the cached ridge geometry snapshot.

#### `public boolean clean()`
- Role: Clears stale ridge caches.
- Description: Resets cached data after terrain changes.

## Members

### Constants

#### `private static final float EPSILON = 0.01f`
- Role: Defines the numerical tolerance for ridge comparisons.
- Description: Used when checking break and edge conditions.

#### `public static final MapMesh.DataID<Ridges> id = MapMesh.makeid(Ridges.class)`
- Role: Registers ridge data on the map mesh.
- Description: Lets each mesh cache one `Ridges` instance.

#### `public static final double segh = 8`
- Role: Defines the ridge segment height.
- Description: Used when computing ridge break geometry.

#### `private static final Coord tilesz = MCache.tilesz2`
- Role: Stores the tile size used by ridge calculations.
- Description: Matches the client map tile dimensions.

### Fields

#### `public final MapMesh m`
- Role: Stores the current map mesh.
- Description: All ridge geometry is attached to this mesh.

#### `private final MapMesh.MapSurface ms`
- Role: Stores the active surface helper.
- Description: Used while emitting ridge faces.

#### `private final boolean[] breaks`
- Role: Tracks which tile edges are broken.
- Description: Drives whether a ridge face should be created.

#### `private Vertex[][] edges, edgec`
- Role: Stores edge vertex caches.
- Description: Reused when constructing ridge connectivity.

#### `private float[] edgeo`
- Role: Stores edge offsets.
- Description: Used to shift ridge edge geometry vertically.

#### `private final MPart[] gnd, ridge`
- Role: Stores ground and ridge mesh parts.
- Description: Each part is used to model one side of the surface.

#### `public float[] rcx, rcy`
- Role: Stores ridge corner coordinates.
- Description: Used to map ridge vertices back to tile space.

#### `public int[] rn`
- Role: Stores ridge vertex indices.
- Description: Tracks which parts of the ridge are connected.

#### `public int[][] ledge, uedge`
- Role: Stores lower and upper edge connectivity.
- Description: Used when joining neighboring ridge parts.

#### `public float[] rh`
- Role: Stores ridge heights.
- Description: Controls the final vertical profile.

#### `public final Pipe.Op mat`
- Role: Stores the ridge material.
- Description: Applied to ridge geometry during rendering.

#### `public final float texh`
- Role: Stores the ridge texture height.
- Description: Used when mapping texture coordinates.

### Methods

#### `public double breakz()`
- Role: Returns the ridge break height.
- Description: Used by callers that need the cutoff value.

#### `private int eo(int x, int y, int e)`
- Role: Computes an edge offset by tile coordinates.
- Description: Convenience overload for edge lookup.

#### `private int eo(Coord c, int e)`
- Role: Computes an edge offset by tile coordinate.
- Description: Convenience overload for edge lookup.

#### `private boolean[] breaks()`
- Role: Computes the break mask for the current mesh.
- Description: Determines which edges need ridge breaks.

#### `private static Coord3f dc(float m, int d)`
- Role: Computes a directional 3D offset.
- Description: Used when forming ridge vertices.

#### `private boolean edgelc(Coord tc, int e)`
- Role: Tests whether an edge is local.
- Description: Helps decide whether the edge can be generated here.

#### `private Vertex[] makeedge(Coord tc, int e)`
- Role: Builds a new edge vertex strip.
- Description: Creates the geometry for one tile edge.

#### `private Vertex[] ensureedge(Coord tc, int e)`
- Role: Returns a cached edge strip or builds one.
- Description: Reuses existing geometry when possible.

#### `public Ridges(MapMesh m)`
- Role: Builds ridge helpers for a map mesh.
- Description: Prepares caches used for ridge generation.

#### `public boolean[] breaks(Coord tc)`
- Role: Returns the break mask for a tile coordinate.
- Description: Public entry point used by callers that need ridge checks.

#### `private float[] tczs(Coord tc)`
- Role: Computes tile corner heights.
- Description: Used when building ridge vertex positions.

#### `private static int isend(boolean[] b)`
- Role: Tests for an end edge in the break mask.
- Description: Used by ridge topology analysis.

#### `private static int isdiag(boolean[] b)`
- Role: Tests for a diagonal break pattern.
- Description: Used by ridge topology analysis.

#### `private int isdiag2(Coord tc, boolean[] b)`
- Role: Tests the second diagonal break pattern.
- Description: Uses local tile context in addition to the mask.

#### `private void mkfaces(Vertex[] va, int[] fa)`
- Role: Emits faces from a vertex array.
- Description: Shared face-building helper.

#### `private RPart connect(Coord tc, Vertex[] l, Vertex[] r)`
- Role: Connects two ridge vertex strips.
- Description: Builds the geometry between neighboring ridge sides.

#### `private void modelcap(Coord tc, int dir)`
- Role: Builds ridge cap geometry.
- Description: Used when a ridge terminates at an edge.

#### `private void modelstraight(Coord tc, int dir)`
- Role: Builds a straight ridge segment.
- Description: Used when the ridge continues without a bend.

#### `private void modeldiag1(Coord tc, int dir)`
- Role: Builds the first diagonal ridge pattern.
- Description: Handles one of the two diagonal ridge topologies.

#### `private void modeldiag2(Coord tc, int dir)`
- Role: Builds the second diagonal ridge pattern.
- Description: Handles the alternate diagonal ridge topology.

#### `private static Coord3f zmatch(Coord3f[] cl, float z)`
- Role: Finds the 3D corner closest to a height.
- Description: Used when matching ridge vertices to a target elevation.

#### `private Vertex[] colzmatch(Coord3f[] cl, float lo, float hi)`
- Role: Builds a vertex strip between two heights.
- Description: Used when connecting ridge layers.

#### `private static float[] mktcx(Vertex[] v, Coord pc)`
- Role: Computes texture X coordinates for a vertex strip.
- Description: Used while laying out ridge texture mapping.

#### `private static float[] mktcy(Vertex[] v, Coord pc)`
- Role: Computes texture Y coordinates for a vertex strip.
- Description: Used while laying out ridge texture mapping.

#### `private void modelcomplex(Coord tc, boolean[] breaks)`
- Role: Builds complex ridge geometry.
- Description: Handles mixed break patterns that are not straight or simple diagonal cases.

#### `public boolean model(Coord tc)`
- Role: Builds ridge geometry for a tile.
- Description: Public entry point for ridge modeling.

#### `public boolean laygnd(Coord tc, Tiler.MCons cons)`
- Role: Lays ridge ground geometry.
- Description: Places the ground-facing half of the ridge.

#### `public boolean layridge(Coord tc, Tiler.MCons cons)`
- Role: Lays ridge geometry.
- Description: Places the raised ridge-facing geometry.

#### `public RPart getrdesc(Coord tc)`
- Role: Returns the ridge description for a tile.
- Description: Public access to the cached ridge geometry snapshot.

#### `public boolean clean()`
- Role: Clears stale ridge caches.
- Description: Resets cached data after terrain changes.

#### `public static boolean brokenp(MapSource map, Coord tc)`
- Role: Tests whether a map tile is broken.
- Description: Used by ridge modeling to detect discontinuities.

#### `public static float edgeoff(MCache map, Coord tc, int edge, boolean hi)`
- Role: Computes a vertical offset for a ridge edge.
- Description: Returns the edge elevation adjustment used in modeling.