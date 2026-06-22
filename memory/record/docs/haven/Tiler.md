---
source: [Tiler.java](../../../../src/haven/Tiler.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tiler

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
- Role: Caches the ctcx value.
- Description: Caches the `ctcx` value for reuse.
- Value: ``

#### `public static final float[] ctcx =`
- Role: Caches the ctcx value.
- Description: Caches the `ctcx` value for reuse.
- Value: ``

#### `public static final int[] rdiag =`
- Role: Caches the rdiag value.
- Description: Caches the `rdiag` value for reuse.
- Value: ``

#### `public static final int[] rdiag =`
- Role: Caches the rdiag value.
- Description: Caches the `rdiag` value for reuse.
- Value: ``

#### `public static final MCons nil = new MCons()`
- Role: Implements the nil operation.
- Description: Implements the m cons operation.
- Value: `new MCons()`

#### `public static final VertFactory id = new VertFactory()`
- Role: Implements the id operation.
- Description: Implements the vert factory operation.
- Value: `new VertFactory()`

#### `private static final Map<String, Factory> rnames = new TreeMap<String, Factory>()`
- Role: Implements the rnames operation.
- Description: Implements the private static final map<string, factory> rnames = new tree map<string, factory>() operation.
- Value: `new TreeMap<String, Factory>()`

### Fields

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public Coord lc, gc`
- Role: Caches the gc value.
- Description: Caches the `gc` value for reuse.

#### `public Coord lc, gc`
- Role: Caches the gc value.
- Description: Caches the `gc` value for reuse.

#### `public Surface.Vertex[] v`
- Role: Caches the v value.
- Description: Caches the `v` value for reuse.

#### `public float[] tcx, tcy`
- Role: Caches the tcy value.
- Description: Caches the `tcy` value for reuse.

#### `public float[] tcx, tcy`
- Role: Caches the tcy value.
- Description: Caches the `tcy` value for reuse.

#### `public int[] f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public Pipe.Op mat = null`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `private final VertFactory f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `private final MeshVertex[] map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `public final NodeWrap mat`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `public final VertFactory f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `private final int hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `public final MapMesh m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

### Methods

#### `public Tiler(int id)`
- Role: Creates a new Tiler instance.
- Description: Constructs the Tiler instance from the supplied inputs.

#### `public MPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`
- Role: Handles the mpart path.
- Description: Implements the m part operation.

#### `public MPart(MPart... parts)`
- Role: Handles the mpart path.
- Description: Implements the m part operation.

#### `protected void mapvertices(MPart[] parts, int[][] vmap)`
- Role: Handles the mapvertices path.
- Description: Implements the mapvertices operation.

#### `public Pipe.Op mcomb(Pipe.Op mat)`
- Role: Handles the mcomb path.
- Description: Implements the mcomb operation.

#### `public static MPart splitquad(Coord lc, Coord gc, Surface.Vertex[] corners, boolean diag)`
- Role: Handles the splitquad path.
- Description: Implements the splitquad operation.

#### `public void faces(MapMesh m, MPart desc)`
- Role: Handles the faces path.
- Description: Implements the faces operation.

#### `public MCons tcons(int z, int bmask, int cmask)`
- Role: Handles the tcons path.
- Description: Implements the tcons operation.

#### `public MeshVertex make(MeshBuf buf, MPart d, int i)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public SModel(MapMesh m, NodeWrap mat, VertFactory f)`
- Role: Handles the smodel path.
- Description: Implements the s model operation.

#### `public MeshVertex get(MPart d, int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public MeshVertex[] get(MPart d)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Key(NodeWrap mat, VertFactory f)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public SModel make(MapMesh m)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public static SModel get(MapMesh m, NodeWrap mat, VertFactory f)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static void flatmodel(MapMesh m, Coord lc)`
- Role: Handles the flatmodel path.
- Description: Implements the flatmodel operation.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Handles the model path.
- Description: Implements the model operation.

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`
- Role: Handles the lay path.
- Description: Implements the lay operation.

#### `public abstract void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Handles the lay path.
- Description: Implements the lay operation.

#### `public abstract void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Handles the trans path.
- Description: Implements the trans operation.

#### `public MapZSurface(MapMesh m)`
- Role: Handles the map zsurface path.
- Description: Implements the map z surface operation.

#### `public double getz(Coord tc)`
- Role: Handles the getz path.
- Description: Returns the z.

#### `public MCache.ZSurface getsurf(MapMesh m, MCache.SurfaceID id)`
- Role: Returns the surface id for the supplied surface name.
- Description: Maps a surface name to the corresponding `MCache.SurfaceID` value.

#### `public Pipe.Op clickstate()`
- Role: Handles the clickstate path.
- Description: Handles state interaction.

#### `public Pipe.Op drawstate(Glob glob, Coord3f c)`
- Role: Handles the drawstate path.
- Description: Draws the state.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String value()`
- Role: Handles the value path.
- Description: Implements the value operation.

#### `public static Factory byname(String name)`
- Role: Handles the byname path.
- Description: Implements the byname operation.