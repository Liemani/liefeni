---
source: [TerrainTile.java](../../../../../src/haven/resutil/TerrainTile.java)
created: 2026-06-13
updated: 2026-06-20
---

# TerrainTile

Builds terrain mesh geometry from noise, thresholded variants, and optional ridge behavior.

## Nested Types

### Var
Describes one thresholded material variant used by terrain blending.

#### Members

##### Fields

#### `public NodeWrap mat`
- Role: Stores the material node.
- Description: Selected when the variant becomes active.

#### `public double thrl, thrh`
- Role: Stores the active range.
- Description: The variant is used when noise falls inside this band.

#### `public double nz`
- Role: Stores the noise seed component.
- Description: Feeds the per-variant noise query.

#### `public Pipe.Op draw`
- Role: Stores the draw state.
- Description: Optional extra render state for the variant.

##### Methods

#### `public Var(NodeWrap mat, double thrl, double thrh, double nz)`
- Role: Builds a terrain variant.
- Description: Stores the material and activation thresholds.

### Blend
Caches per-mesh blend data for terrain rendering.

#### Members

##### Fields

#### `final MapMesh m`
- Role: Stores the owning map mesh.
- Description: Used during all blend calculations.

#### `final Scan vs, es`
- Role: Stores the vertex and edge scan windows.
- Description: Cover the local mesh neighborhood needed for blending.

#### `final float[][] bv`
- Role: Stores the blended weights.
- Description: One layer per terrain variant plus the base layer.

#### `final boolean[][] en`
- Role: Tracks enabled edge cells.
- Description: Marks which tiles still need geometry after blending.

##### Methods

#### `private Blend(MapMesh m)`
- Role: Builds the blend cache.
- Description: Computes the smoothed variant weights and edge enablement flags.

#### `private void setbase(float[][] bv)`
- Role: Seeds the base blend layer.
- Description: Fills the base weights from the variant thresholds.

### Factory
Creates standard terrain tiles from a tileset.

#### Members

##### Methods

#### `public TerrainTile create(int id, Tileset set)`
- Role: Builds a terrain tile.
- Description: Reads the tileset description and assembles the base/variant materials.

### RidgeTile
Special terrain tile that also participates in ridge modeling.

#### Members

##### Methods

#### `public RidgeTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset, int rth, Pipe.Op rmat, float texh)`
- Role: Builds a ridge-aware terrain tile.
- Description: Adds ridge thresholding and ridge material settings on top of terrain data.

#### `public RidgeTile(int id, RidgeTile from)`
- Role: Copies a ridge-aware terrain tile.
- Description: Reuses the ridge configuration with a new id.

#### `public double breakz()`
- Role: Returns the ridge break height.
- Description: Used by ridge modeling to determine the cutoff height.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Builds ridge geometry for the map.
- Description: Adds ridge-specific modeling on top of the terrain base.

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`
- Role: Lays ridge terrain through a supplied consumer.
- Description: Shared helper for ridge and cover placement.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Lays ridge terrain into the mesh.
- Description: Uses the ridge-aware geometry path.

### RFactory
Creates ridge-aware terrain tiles.

#### Members

##### Methods

#### `public Tiler create(int id, Tileset set)`
- Role: Builds a ridge-aware tile.
- Description: Reads the tileset description and creates a `RidgeTile`.

## Members

### Constants

#### `private static final int sr = 12`
- Role: Defines the sampling radius used by terrain blending.
- Description: Controls how many neighboring samples influence smoothing.

### Fields

#### `public final NodeWrap base`
- Role: Stores the base material node.
- Description: Used as the starting point for rendering.

#### `public final SNoise3 noise`
- Role: Stores the noise source.
- Description: Drives variation across the tile surface.

#### `public final Var[] var`
- Role: Stores the terrain variants.
- Description: Each variant describes one thresholded material choice.

#### `public final Tileset transset`
- Role: Stores the transition tileset.
- Description: Used when blending to neighboring terrain types.

#### `public final Pipe.Op draw`
- Role: Stores the draw state.
- Description: Applied when the terrain mesh is rendered.

#### `public NodeWrap mat`
- Role: Stores the current material node.
- Description: Updated when a variant becomes active.

#### `public double thrl, thrh`
- Role: Stores the active threshold band.
- Description: Used during variant selection.

#### `public double nz`
- Role: Stores the noise scale.
- Description: Used when querying terrain noise.

#### `final MapMesh m`
- Role: Stores the current map mesh.
- Description: Shared across blend and transition helpers.

#### `final Scan vs, es`
- Role: Stores vertex and edge scans.
- Description: Tracks the local terrain topology.

#### `final float[][] bv`
- Role: Stores cached blend values.
- Description: Reused while constructing mesh layers.

#### `final boolean[][] en`
- Role: Tracks edge enablement.
- Description: Marks which borders are active in the current tile.

#### `final VertFactory[] lvfac = new VertFactory[var.length + 1]`
- Role: Stores vertex factories for each variant.
- Description: Builds the correct vertex layout for the mesh.

#### `public final MapMesh.DataID<Blend> blend = new MapMesh.DataID<Blend>()`
- Role: Registers the blend cache for map meshes.
- Description: Allows the terrain builder to reuse computed blend data.

#### `private final static Map<TexRender, AlphaTex> transtex = new WeakHashMap<TexRender, AlphaTex>()`
- Role: Caches transition textures by renderer.
- Description: Avoids rebuilding the same alpha texture wrapper.

#### `public final Tiler.MCons rcons`
- Role: Stores the ridge mesh consumer.
- Description: Used by the ridge-aware tile path.

#### `public final int rth`
- Role: Stores the ridge threshold.
- Description: Controls when ridge handling becomes active.

### Methods

#### `public TerrainTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset)`
- Role: Builds a terrain tile definition.
- Description: Stores noise, base material, variants, and the transition tileset.

#### `public TerrainTile(int id, TerrainTile from)`
- Role: Copies an existing terrain tile definition.
- Description: Reuses the same terrain behavior with updated identifiers.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Lays the terrain mesh into the map.
- Description: Evaluates noise and variant thresholds for each tile.

#### `public void faces(MapMesh m, MPart d)`
- Role: Adds face geometry to the map mesh.
- Description: Emits the terrain surfaces for the current part.

#### `public void _faces(MapMesh m, int z, Tile trans, MPart d)`
- Role: Emits face geometry for a specific height and transition.
- Description: Shared helper behind the face builder.

#### `private MCons tcons(final int z, final Tile t)`
- Role: Builds a mesh consumer for a tile at a specific height.
- Description: Selects the proper geometry path for that layer.

#### `public MCons tcons(final int z, final int bmask, final int cmask)`
- Role: Selects a mesh consumer using border and corner masks.
- Description: Used during transition generation.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Builds transition geometry between terrain types.
- Description: Blends this tile into adjacent terrain.