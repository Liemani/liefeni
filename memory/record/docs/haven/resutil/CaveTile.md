---
source: [CaveTile.java](../../../../src/haven/resutil/CaveTile.java)
created: 2026-06-13
updated: 2026-06-14
---

# CaveTile

Provides resource helper logic for cave tile.

## Nested Types

### Factory

- Role: Represents factory within CaveTile.
- Description: Describes the nested factory type used by the enclosing class.

### Walls

- Role: Represents walls within CaveTile.
- Description: Describes the nested walls type used by the enclosing class.

## Members

### Constants

#### `public static final float h = 16`
- Role: Defines the shared h constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MapMesh.DataID<Walls> walls = MapMesh.makeid(Walls.class)`
- Role: Defines the shared walls constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord[] tces =`
- Role: Defines the shared cave tile constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord[] tccs =`
- Role: Defines the shared cave tile constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Material wtex`
- Role: Holds the wtex state.
- Description: Backs the cached state for this file.

#### `public final Tiler ground`
- Role: Holds the ground state.
- Description: Backs the cached state for this file.

#### `public final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public final Scan cs`
- Role: Holds the cs state.
- Description: Backs the cached state for this file.

#### `public final Vertex[][] wv`
- Role: Stores the wv value.
- Description: Backs the cached state for this file.

#### `private MapMesh.MapSurface ms`
- Role: Holds the ms state.
- Description: Backs the cached state for this file.

### Methods

#### `public Walls(MapMesh m)`
- Role: Performs walls.
- Description: Supports the walls operation used by the surrounding class.

#### `public Vertex[] fortile(Coord tc)`
- Role: Performs fortile.
- Description: Supports the fortile operation used by the surrounding class.

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public CaveTile(int id, Tileset set, Material wtex, Tiler ground)`
- Role: Creates a new CaveTile instance.
- Description: Constructs the instance and initializes its default state.

#### `private void modelwall(Walls w, Coord ltc, Coord rtc)`
- Role: Performs modelwall.
- Description: Supports the modelwall operation used by the surrounding class.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `private void mkwall(MapMesh m, Walls w, Coord ltc, Coord rtc)`
- Role: Performs mkwall.
- Description: Supports the mkwall operation used by the surrounding class.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Performs trans.
- Description: Supports the trans operation used by the surrounding class.
