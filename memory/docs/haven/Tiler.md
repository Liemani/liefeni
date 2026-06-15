# Tiler

This file documents the responsibilities and members of `Tiler`.

## Meta

- Source: [Tiler.java](../../../src/haven/Tiler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a tile helper.

## Nested Types

### CTrans

- Description: TODO

### FactMaker

- Description: TODO

### Factory

- Description: TODO

### Key

- Description: TODO

### MCons

- Description: TODO

### MPart

- Description: TODO

### MapZSurface

- Description: TODO

### ResName

- Description: TODO

### SModel

- Description: TODO

### VertFactory

- Description: TODO

## Members

### Constants

#### `public static final float[] ctcx =`

- Description: TODO

#### `public static final float[] ctcx =`

- Description: TODO

#### `public static final int[] rdiag =`

- Description: TODO

#### `public static final int[] rdiag =`

- Description: TODO

#### `public static final MCons nil = new MCons()`

- Description: TODO

#### `public static final VertFactory id = new VertFactory()`

- Description: TODO

#### `private static final Map<String, Factory> rnames = new TreeMap<String, Factory>()`

- Description: TODO

### Fields

#### `public final int id`

- Description: TODO

#### `public Coord lc, gc`

- Description: TODO

#### `public Coord lc, gc`

- Description: TODO

#### `public Surface.Vertex[] v`

- Description: TODO

#### `public float[] tcx, tcy`

- Description: TODO

#### `public float[] tcx, tcy`

- Description: TODO

#### `public int[] f`

- Description: TODO

#### `public Pipe.Op mat = null`

- Description: TODO

#### `private final VertFactory f`

- Description: TODO

#### `private final MeshVertex[] map`

- Description: TODO

#### `public final NodeWrap mat`

- Description: TODO

#### `public final VertFactory f`

- Description: TODO

#### `private final int hash`

- Description: TODO

#### `public final MapMesh m`

- Description: TODO

### Methods

#### `public Tiler(int id)`

- Description: TODO

#### `public MPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`

- Description: TODO

#### `public MPart(MPart... parts)`

- Description: TODO

#### `protected void mapvertices(MPart[] parts, int[][] vmap)`

- Description: TODO

#### `public Pipe.Op mcomb(Pipe.Op mat)`

- Description: TODO

#### `public static MPart splitquad(Coord lc, Coord gc, Surface.Vertex[] corners, boolean diag)`

- Description: TODO

#### `public void faces(MapMesh m, MPart desc)`

- Description: TODO

#### `public MCons tcons(int z, int bmask, int cmask)`

- Description: TODO

#### `public MeshVertex make(MeshBuf buf, MPart d, int i)`

- Description: TODO

#### `public SModel(MapMesh m, NodeWrap mat, VertFactory f)`

- Description: TODO

#### `public MeshVertex get(MPart d, int i)`

- Description: TODO

#### `public MeshVertex[] get(MPart d)`

- Description: TODO

#### `public Key(NodeWrap mat, VertFactory f)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public SModel make(MapMesh m)`

- Description: TODO

#### `public static SModel get(MapMesh m, NodeWrap mat, VertFactory f)`

- Description: TODO

#### `public static void flatmodel(MapMesh m, Coord lc)`

- Description: TODO

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`

- Description: TODO

#### `public abstract void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public abstract void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO

#### `public MapZSurface(MapMesh m)`

- Description: TODO

#### `public double getz(Coord tc)`

- Description: TODO

#### `public MCache.ZSurface getsurf(MapMesh m, MCache.SurfaceID id)`

- Description: TODO

#### `public Pipe.Op clickstate()`

- Description: TODO

#### `public Pipe.Op drawstate(Glob glob, Coord3f c)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public Tiler create(int id, Tileset set)`

- Description: TODO

#### `public String value()`

- Description: TODO

#### `public static Factory byname(String name)`

- Description: TODO
