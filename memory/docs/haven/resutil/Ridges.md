# Ridges

This file documents the responsibilities and members of `Ridges`.

## Meta

- Source: [Ridges.java](../../../../src/haven/resutil/Ridges.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents ridge rendering helpers.

## Nested Types

### RPart

- Description: TODO

### RidgeTile

- Description: TODO

### TexCons

- Description: TODO

## Members

### Constants

#### `private static final float EPSILON = 0.01f`

- Description: TODO

#### `public static final MapMesh.DataID<Ridges> id = MapMesh.makeid(Ridges.class)`

- Description: TODO

#### `public static final double segh = 8`

- Description: TODO

#### `private static final Coord tilesz = MCache.tilesz2`

- Description: TODO

#### `private static final Coord[] tecs =`

- Description: TODO

#### `private static final Coord[] tccs =`

- Description: TODO

#### `private static final int[] srfi =`

- Description: TODO

#### `private static final int[] d1rfi =`

- Description: TODO

#### `private static final int[] d2rfi =`

- Description: TODO

#### `private static final int[] cg1rfi =`

- Description: TODO

#### `private static final int[] cg2rfi =`

- Description: TODO

#### `static final Tiler.MCons testcons = new Tiler.MCons()`

- Description: TODO

### Fields

#### `public final MapMesh m`

- Description: TODO

#### `private final MapMesh.MapSurface ms`

- Description: TODO

#### `private final boolean[] breaks`

- Description: TODO

#### `private Vertex[][] edges, edgec`

- Description: TODO

#### `private Vertex[][] edges, edgec`

- Description: TODO

#### `private float[] edgeo`

- Description: TODO

#### `private final MPart[] gnd, ridge`

- Description: TODO

#### `private final MPart[] gnd, ridge`

- Description: TODO

#### `public float[] rcx, rcy`

- Description: TODO

#### `public float[] rcx, rcy`

- Description: TODO

#### `public int[] rn`

- Description: TODO

#### `public int[][] ledge, uedge`

- Description: TODO

#### `public int[][] ledge, uedge`

- Description: TODO

#### `public float[] rh`

- Description: TODO

#### `public final Pipe.Op mat`

- Description: TODO

#### `public final float texh`

- Description: TODO

### Methods

#### `public double breakz()`

- Description: TODO

#### `public RPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f, float[] rcx, float[] rcy, int[] rn, float[] rh, int[][] ledge, int[][] uedge)`

- Description: TODO

#### `public RPart(RPart... parts)`

- Description: TODO

#### `private void mapridges(RPart[] parts, int[][] vmap)`

- Description: TODO

#### `protected void mapvertices(MPart[] mparts, int[][] vmap)`

- Description: TODO

#### `private int eo(int x, int y, int e)`

- Description: TODO

#### `private int eo(Coord c, int e)`

- Description: TODO

#### `private boolean[] breaks()`

- Description: TODO

#### `private static Coord3f dc(float m, int d)`

- Description: TODO

#### `private boolean edgelc(Coord tc, int e)`

- Description: TODO

#### `private Vertex[] makeedge(Coord tc, int e)`

- Description: TODO

#### `private Vertex[] ensureedge(Coord tc, int e)`

- Description: TODO

#### `public Ridges(MapMesh m)`

- Description: TODO

#### `public boolean[] breaks(Coord tc)`

- Description: TODO

#### `private float[] tczs(Coord tc)`

- Description: TODO

#### `private static int isend(boolean[] b)`

- Description: TODO

#### `private static int isdiag(boolean[] b)`

- Description: TODO

#### `private int isdiag2(Coord tc, boolean[] b)`

- Description: TODO

#### `private void mkfaces(Vertex[] va, int[] fa)`

- Description: TODO

#### `private RPart connect(Coord tc, Vertex[] l, Vertex[] r)`

- Description: TODO

#### `private void modelcap(Coord tc, int dir)`

- Description: TODO

#### `private void modelstraight(Coord tc, int dir)`

- Description: TODO

#### `private void modeldiag1(Coord tc, int dir)`

- Description: TODO

#### `private void modeldiag2(Coord tc, int dir)`

- Description: TODO

#### `private static Coord3f zmatch(Coord3f[] cl, float z)`

- Description: TODO

#### `private Vertex[] colzmatch(Coord3f[] cl, float lo, float hi)`

- Description: TODO

#### `private static float[] mktcx(Vertex[] v, Coord pc)`

- Description: TODO

#### `private static float[] mktcy(Vertex[] v, Coord pc)`

- Description: TODO

#### `private void modelcomplex(Coord tc, boolean[] breaks)`

- Description: TODO

#### `public boolean model(Coord tc)`

- Description: TODO

#### `public TexCons(Pipe.Op mat, float texh)`

- Description: TODO

#### `public void faces(MapMesh m, MPart mdesc)`

- Description: TODO

#### `public boolean laygnd(Coord tc, Tiler.MCons cons)`

- Description: TODO

#### `public boolean layridge(Coord tc, Tiler.MCons cons)`

- Description: TODO

#### `public RPart getrdesc(Coord tc)`

- Description: TODO

#### `public boolean clean()`

- Description: TODO

#### `public static boolean brokenp(MapSource map, Coord tc)`

- Description: TODO

#### `public static float edgeoff(MCache map, Coord tc, int edge, boolean hi)`

- Description: TODO
