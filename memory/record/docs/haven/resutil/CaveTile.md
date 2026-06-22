---
source: [CaveTile.java](../../../../../src/haven/resutil/CaveTile.java)
created: 2026-06-13
updated: 2026-06-20
---

# CaveTile

Builds cave walls and cave-floor transitions for tiles that border open terrain.

## Nested Types

### Walls
Caches the wall vertex strips for a specific map mesh.

#### Members

##### Fields

#### `public final MapMesh m`
- Role: Stores the owning map mesh.
- Description: Used when sampling ground height and random seeds.

#### `public final Scan cs`
- Role: Stores the tile scan window.
- Description: Covers the mesh neighborhood used by wall generation.

#### `public final Vertex[][] wv`
- Role: Caches per-tile wall vertices.
- Description: Each tile position stores its prebuilt wall strip.

#### `private MapMesh.MapSurface ms`
- Role: Stores the active surface helper.
- Description: Used to create wall vertices from the ground surface.

##### Methods

#### `public Walls(MapMesh m)`
- Role: Builds the wall cache for a map mesh.
- Description: Prepares the scan window and per-tile cache arrays.

#### `public Vertex[] fortile(Coord tc)`
- Role: Returns the wall vertices for one tile.
- Description: Lazily creates the strip and reuses it for later calls.

### Factory
Creates cave tiles from the `cave` tileset resource.

#### Members

##### Methods

#### `public Tiler create(int id, Tileset set)`
- Role: Builds a `CaveTile`.
- Description: Resolves wall material and optional ground tiler from resource data.

## Members

### Constants

#### `public static final float h = 16`
- Role: Defines the wall height.
- Description: Controls how tall the cave wall geometry is built.

#### `public static final MapMesh.DataID<Walls> walls = MapMesh.makeid(Walls.class)`
- Role: Registers the wall cache on the map mesh.
- Description: Lets the mesh store cave-wall data per mesh instance.

#### `private static final Coord[] tces = {new Coord(0, -1), new Coord(1, 0), new Coord(0, 1), new Coord(-1, 0)}`
- Role: Lists tile-edge offsets.
- Description: Used when checking the four sides of a tile.

#### `private static final Coord[] tccs = {new Coord(0, 0), new Coord(1, 0), new Coord(1, 1), new Coord(0, 1)}`
- Role: Lists tile-corner offsets.
- Description: Used when building wall geometry around a tile.

### Fields

#### `public final Material wtex`
- Role: Stores the wall material.
- Description: Applied to the wall faces.

#### `public final Tiler ground`
- Role: Stores the optional ground tiler.
- Description: Reused when laying the cave floor.

### Methods

#### `public CaveTile(int id, Tileset set, Material wtex, Tiler ground)`
- Role: Builds a cave tile definition.
- Description: Stores the wall material and optional ground tiler.

#### `private void modelwall(Walls w, Coord ltc, Coord rtc)`
- Role: Builds a wall segment.
- Description: Adds vertical wall faces between neighboring tile strips.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Builds cave wall model data.
- Description: Adds wall geometry only where the neighbor is not another cave tile.

#### `private void mkwall(MapMesh m, Walls w, Coord ltc, Coord rtc)`
- Role: Emits a wall segment into the mesh.
- Description: Creates textured wall faces for the visible edge.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Lays cave geometry into the mesh.
- Description: Builds visible walls and then delegates to the optional ground tiler.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Handles cave transitions.
- Description: This tile does not add extra transition geometry.