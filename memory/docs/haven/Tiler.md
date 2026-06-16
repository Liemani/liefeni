# Tiler

This file documents the responsibilities and members of `Tiler`.

## Meta

- Source: [Tiler.java](../../../src/haven/Tiler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tiler Haven component.

## Nested Types

### CTrans

- Role: Represents ctrans within Tiler.
- Description: Describes the nested ctrans type used by the enclosing class.

### FactMaker

- Role: Represents fact maker within Tiler.
- Description: Describes the nested fact maker type used by the enclosing class.

### Factory

- Role: Represents factory within Tiler.
- Description: Describes the nested factory type used by the enclosing class.

### Key

- Role: Represents key within Tiler.
- Description: Describes the nested key type used by the enclosing class.

### MCons

- Role: Represents mcons within Tiler.
- Description: Describes the nested mcons type used by the enclosing class.

### MPart

- Role: Represents mpart within Tiler.
- Description: Describes the nested mpart type used by the enclosing class.

### MapZSurface

- Role: Represents map zsurface within Tiler.
- Description: Describes the nested map zsurface type used by the enclosing class.

### ResName

- Role: Represents res name within Tiler.
- Description: Describes the nested res name type used by the enclosing class.

### SModel

- Role: Represents smodel within Tiler.
- Description: Describes the nested smodel type used by the enclosing class.

### VertFactory

- Role: Represents vert factory within Tiler.
- Description: Describes the nested vert factory type used by the enclosing class.

## Members

### Constants

#### `public static final float[] ctcx =`
- Role: Defines the shared tiler constant.
- Description: Shared constant used by the rest of the class.

#### `public static final float[] ctcx =`
- Role: Defines the shared tiler constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int[] rdiag =`
- Role: Defines the shared tiler constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int[] rdiag =`
- Role: Defines the shared tiler constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MCons nil = new MCons()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VertFactory id = new VertFactory()`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Factory> rnames = new TreeMap<String, Factory>()`
- Role: Defines the shared rnames constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public Coord lc, gc`
- Role: Stores the gc value.
- Description: Backs the cached state for this file.

#### `public Coord lc, gc`
- Role: Stores the gc value.
- Description: Backs the cached state for this file.

#### `public Surface.Vertex[] v`
- Role: Stores the v value.
- Description: Backs the cached state for this file.

#### `public float[] tcx, tcy`
- Role: Stores the tcy value.
- Description: Backs the cached state for this file.

#### `public float[] tcx, tcy`
- Role: Stores the tcy value.
- Description: Backs the cached state for this file.

#### `public int[] f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public Pipe.Op mat = null`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `private final VertFactory f`
- Role: Holds the f state.
- Description: Backs the cached state for this file.

#### `private final MeshVertex[] map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

#### `public final NodeWrap mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `public final VertFactory f`
- Role: Holds the f state.
- Description: Backs the cached state for this file.

#### `private final int hash`
- Role: Stores the hash value.
- Description: Backs the cached state for this file.

#### `public final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

### Methods

#### `public Tiler(int id)`
- Role: Creates a new Tiler instance.
- Description: Constructs the instance and initializes its default state.

#### `public MPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`
- Role: Performs mpart.
- Description: Supports the mpart operation used by the surrounding class.

#### `public MPart(MPart... parts)`
- Role: Performs mpart.
- Description: Supports the mpart operation used by the surrounding class.

#### `protected void mapvertices(MPart[] parts, int[][] vmap)`
- Role: Performs mapvertices.
- Description: Supports the mapvertices operation used by the surrounding class.

#### `public Pipe.Op mcomb(Pipe.Op mat)`
- Role: Performs mcomb.
- Description: Supports the mcomb operation used by the surrounding class.

#### `public static MPart splitquad(Coord lc, Coord gc, Surface.Vertex[] corners, boolean diag)`
- Role: Performs splitquad.
- Description: Supports the splitquad operation used by the surrounding class.

#### `public void faces(MapMesh m, MPart desc)`
- Role: Performs faces.
- Description: Supports the faces operation used by the surrounding class.

#### `public MCons tcons(int z, int bmask, int cmask)`
- Role: Performs tcons.
- Description: Supports the tcons operation used by the surrounding class.

#### `public MeshVertex make(MeshBuf buf, MPart d, int i)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public SModel(MapMesh m, NodeWrap mat, VertFactory f)`
- Role: Performs smodel.
- Description: Supports the smodel operation used by the surrounding class.

#### `public MeshVertex get(MPart d, int i)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public MeshVertex[] get(MPart d)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Key(NodeWrap mat, VertFactory f)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public SModel make(MapMesh m)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public static SModel get(MapMesh m, NodeWrap mat, VertFactory f)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static void flatmodel(MapMesh m, Coord lc)`
- Role: Performs flatmodel.
- Description: Supports the flatmodel operation used by the surrounding class.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public abstract void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public abstract void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Performs trans.
- Description: Supports the trans operation used by the surrounding class.

#### `public MapZSurface(MapMesh m)`
- Role: Performs map zsurface.
- Description: Supports the map zsurface operation used by the surrounding class.

#### `public double getz(Coord tc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public MCache.ZSurface getsurf(MapMesh m, MCache.SurfaceID id)`
- Role: Returns the surface id for the supplied surface name.
- Description: Maps a surface name to the corresponding `MCache.SurfaceID` value.

#### `public Pipe.Op clickstate()`
- Role: Performs clickstate.
- Description: Supports the clickstate operation used by the surrounding class.

#### `public Pipe.Op drawstate(Glob glob, Coord3f c)`
- Role: Performs drawstate.
- Description: Supports the drawstate operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public static Factory byname(String name)`
- Role: Performs byname.
- Description: Supports the byname operation used by the surrounding class.
