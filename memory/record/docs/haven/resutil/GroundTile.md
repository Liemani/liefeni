---
source: [GroundTile.java](../../../../../src/haven/resutil/GroundTile.java)
created: 2026-06-13
updated: 2026-06-20
---

# GroundTile

Builds the default terrain tiler used for solid ground surfaces.

## Members

### Constants

#### `private static final Pipe.Op gcol = new Light.PhongLight(true, new Color(128, 128, 128), new Color(255, 255, 255), new Color(0, 0, 0), new Color(0, 0, 0), 0)`
- Role: Defines the default ground lighting state.
- Description: Supplies a neutral Phong light setup for ground tiles.

### Fields

#### `public final Tileset set`
- Role: Stores the tileset backing this tiler.
- Description: Used when constructing terrain from resource data.

### Methods

#### `public Tiler create(int id, Tileset set)`
- Role: Creates a ground tiler from a tileset.
- Description: Returns a `GroundTile` configured for the given tile resource.

#### `public GroundTile(int id, Tileset set)`
- Role: Builds a ground tile definition.
- Description: Stores the tileset used for later mesh generation.

#### `public static float tcx(Tex t, int x)`
- Role: Computes the X texture coordinate for a tile.
- Description: Converts a texture pixel position into normalized space.

#### `public static float tcy(Tex t, int y)`
- Role: Computes the Y texture coordinate for a tile.
- Description: Converts a texture pixel position into normalized space.

#### `private static Pipe.Op stfor(Tex tex, int z, boolean clip)`
- Role: Builds the render state for a textured face.
- Description: Chooses lighting and optional clipping based on tile height.

#### `public void _faces(MapMesh m, Tile t, int z, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`
- Role: Emits the tile faces for the mesh.
- Description: Builds the rendered surface geometry for a tile patch.

#### `public void faces(MapMesh m, MPart d)`
- Role: Adds tile faces to the current mesh part.
- Description: Dispatches face construction for the terrain section.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Lays ground geometry into the map mesh.
- Description: Creates the solid base terrain for the tile grid.

#### `private MCons tcons(final int z, final Tile t)`
- Role: Builds a tile mesh consumer for a specific height.
- Description: Used to attach ground triangles at the correct layer.

#### `public MCons tcons(final int z, final int bmask, final int cmask)`
- Role: Selects the mesh consumer for a masked tile state.
- Description: Filters base and clipping masks before geometry generation.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Builds transitional terrain between tilers.
- Description: Generates blended geometry when this tile borders another type.