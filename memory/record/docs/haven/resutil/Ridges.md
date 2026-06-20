---
source: [Ridges.java](../../../../src/haven/resutil/Ridges.java)
created: 2026-06-13
updated: 2026-06-14
---

# Ridges

Provides resource helper logic for ridges.

## Nested Types

### RPart

- Role: Represents rpart within Ridges.
- Description: Describes the nested rpart type used by the enclosing class.

### RidgeTile

- Role: Represents ridge tile within Ridges.
- Description: Describes the nested ridge tile type used by the enclosing class.

### TexCons

- Role: Represents tex cons within Ridges.
- Description: Describes the nested tex cons type used by the enclosing class.

## Members

### Constants

#### `private static final float EPSILON = 0.01f`
- Role: Defines the shared epsilon constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MapMesh.DataID<Ridges> id = MapMesh.makeid(Ridges.class)`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `public static final double segh = 8`
- Role: Defines the shared segh constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord tilesz = MCache.tilesz2`
- Role: Defines the shared tilesz constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord[] tecs =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord[] tccs =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] srfi =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] d1rfi =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] d2rfi =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] cg1rfi =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] cg2rfi =`
- Role: Defines the shared ridges constant.
- Description: Shared constant used by the rest of the class.

#### `static final Tiler.MCons testcons = new Tiler.MCons()`
- Role: Defines the shared testcons constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `private final MapMesh.MapSurface ms`
- Role: Holds the ms state.
- Description: Backs the cached state for this file.

#### `private final boolean[] breaks`
- Role: Tracks the breaks flag.
- Description: Supports the breaks operation used by the surrounding class.

#### `private Vertex[][] edges, edgec`
- Role: Stores the edgec value.
- Description: Backs the cached state for this file.

#### `private Vertex[][] edges, edgec`
- Role: Stores the edgec value.
- Description: Backs the cached state for this file.

#### `private float[] edgeo`
- Role: Stores the edgeo value.
- Description: Backs the cached state for this file.

#### `private final MPart[] gnd, ridge`
- Role: Holds the ridge state.
- Description: Backs the cached state for this file.

#### `private final MPart[] gnd, ridge`
- Role: Holds the ridge state.
- Description: Backs the cached state for this file.

#### `public float[] rcx, rcy`
- Role: Stores the rcy value.
- Description: Backs the cached state for this file.

#### `public float[] rcx, rcy`
- Role: Stores the rcy value.
- Description: Backs the cached state for this file.

#### `public int[] rn`
- Role: Stores the rn value.
- Description: Backs the cached state for this file.

#### `public int[][] ledge, uedge`
- Role: Stores the uedge value.
- Description: Backs the cached state for this file.

#### `public int[][] ledge, uedge`
- Role: Stores the uedge value.
- Description: Backs the cached state for this file.

#### `public float[] rh`
- Role: Stores the rh value.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op mat`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `public final float texh`
- Role: Stores the texh value.
- Description: Backs the cached state for this file.

### Methods

#### `public double breakz()`
- Role: Performs breakz.
- Description: Supports the breakz operation used by the surrounding class.

#### `public RPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f, float[] rcx, float[] rcy, int[] rn, float[] rh, int[][] ledge, int[][] uedge)`
- Role: Performs rpart.
- Description: Supports the rpart operation used by the surrounding class.

#### `public RPart(RPart... parts)`
- Role: Performs rpart.
- Description: Supports the rpart operation used by the surrounding class.

#### `private void mapridges(RPart[] parts, int[][] vmap)`
- Role: Performs mapridges.
- Description: Supports the mapridges operation used by the surrounding class.

#### `protected void mapvertices(MPart[] mparts, int[][] vmap)`
- Role: Performs mapvertices.
- Description: Supports the mapvertices operation used by the surrounding class.

#### `private int eo(int x, int y, int e)`
- Role: Performs eo.
- Description: Supports the eo operation used by the surrounding class.

#### `private int eo(Coord c, int e)`
- Role: Performs eo.
- Description: Supports the eo operation used by the surrounding class.

#### `private boolean[] breaks()`
- Role: Performs breaks.
- Description: Supports the breaks operation used by the surrounding class.

#### `private static Coord3f dc(float m, int d)`
- Role: Performs dc.
- Description: Supports the dc operation used by the surrounding class.

#### `private boolean edgelc(Coord tc, int e)`
- Role: Performs edgelc.
- Description: Supports the edgelc operation used by the surrounding class.

#### `private Vertex[] makeedge(Coord tc, int e)`
- Role: Performs makeedge.
- Description: Supports the makeedge operation used by the surrounding class.

#### `private Vertex[] ensureedge(Coord tc, int e)`
- Role: Performs ensureedge.
- Description: Supports the ensureedge operation used by the surrounding class.

#### `public Ridges(MapMesh m)`
- Role: Creates a new Ridges instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean[] breaks(Coord tc)`
- Role: Performs breaks.
- Description: Supports the breaks operation used by the surrounding class.

#### `private float[] tczs(Coord tc)`
- Role: Performs tczs.
- Description: Supports the tczs operation used by the surrounding class.

#### `private static int isend(boolean[] b)`
- Role: Performs isend.
- Description: Supports the isend operation used by the surrounding class.

#### `private static int isdiag(boolean[] b)`
- Role: Performs isdiag.
- Description: Supports the isdiag operation used by the surrounding class.

#### `private int isdiag2(Coord tc, boolean[] b)`
- Role: Performs isdiag2.
- Description: Supports the isdiag2 operation used by the surrounding class.

#### `private void mkfaces(Vertex[] va, int[] fa)`
- Role: Performs mkfaces.
- Description: Supports the mkfaces operation used by the surrounding class.

#### `private RPart connect(Coord tc, Vertex[] l, Vertex[] r)`
- Role: Performs connect.
- Description: Supports the connect operation used by the surrounding class.

#### `private void modelcap(Coord tc, int dir)`
- Role: Performs modelcap.
- Description: Supports the modelcap operation used by the surrounding class.

#### `private void modelstraight(Coord tc, int dir)`
- Role: Performs modelstraight.
- Description: Supports the modelstraight operation used by the surrounding class.

#### `private void modeldiag1(Coord tc, int dir)`
- Role: Performs modeldiag1.
- Description: Supports the modeldiag1 operation used by the surrounding class.

#### `private void modeldiag2(Coord tc, int dir)`
- Role: Performs modeldiag2.
- Description: Supports the modeldiag2 operation used by the surrounding class.

#### `private static Coord3f zmatch(Coord3f[] cl, float z)`
- Role: Performs zmatch.
- Description: Supports the zmatch operation used by the surrounding class.

#### `private Vertex[] colzmatch(Coord3f[] cl, float lo, float hi)`
- Role: Performs colzmatch.
- Description: Supports the colzmatch operation used by the surrounding class.

#### `private static float[] mktcx(Vertex[] v, Coord pc)`
- Role: Performs mktcx.
- Description: Supports the mktcx operation used by the surrounding class.

#### `private static float[] mktcy(Vertex[] v, Coord pc)`
- Role: Performs mktcy.
- Description: Supports the mktcy operation used by the surrounding class.

#### `private void modelcomplex(Coord tc, boolean[] breaks)`
- Role: Performs modelcomplex.
- Description: Supports the modelcomplex operation used by the surrounding class.

#### `public boolean model(Coord tc)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `public TexCons(Pipe.Op mat, float texh)`
- Role: Performs tex cons.
- Description: Supports the tex cons operation used by the surrounding class.

#### `public void faces(MapMesh m, MPart mdesc)`
- Role: Performs faces.
- Description: Supports the faces operation used by the surrounding class.

#### `public boolean laygnd(Coord tc, Tiler.MCons cons)`
- Role: Performs laygnd.
- Description: Supports the laygnd operation used by the surrounding class.

#### `public boolean layridge(Coord tc, Tiler.MCons cons)`
- Role: Performs layridge.
- Description: Supports the layridge operation used by the surrounding class.

#### `public RPart getrdesc(Coord tc)`
- Role: Performs getrdesc.
- Description: Supports the getrdesc operation used by the surrounding class.

#### `public boolean clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public static boolean brokenp(MapSource map, Coord tc)`
- Role: Performs brokenp.
- Description: Supports the brokenp operation used by the surrounding class.

#### `public static float edgeoff(MCache map, Coord tc, int edge, boolean hi)`
- Role: Performs edgeoff.
- Description: Supports the edgeoff operation used by the surrounding class.
