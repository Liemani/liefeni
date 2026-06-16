# TerrainTile

This file documents the responsibilities and members of `TerrainTile`.

## Meta

- Source: [TerrainTile.java](../../../../src/haven/resutil/TerrainTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for terrain tile.

## Nested Types

### Blend

- Role: Represents blend within TerrainTile.
- Description: Describes the nested blend type used by the enclosing class.

### Factory

- Role: Represents factory within TerrainTile.
- Description: Describes the nested factory type used by the enclosing class.

### RFactory

- Role: Represents rfactory within TerrainTile.
- Description: Describes the nested rfactory type used by the enclosing class.

### RidgeTile

- Role: Represents ridge tile within TerrainTile.
- Description: Describes the nested ridge tile type used by the enclosing class.

### Var

- Role: Represents var within TerrainTile.
- Description: Describes the nested var type used by the enclosing class.

## Members

### Constants

#### `private static final int sr = 12`
- Role: Defines the shared sr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final NodeWrap base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public final SNoise3 noise`
- Role: Holds the noise state.
- Description: Backs the cached state for this file.

#### `public final Var[] var`
- Role: Holds the var state.
- Description: Backs the cached state for this file.

#### `public final Tileset transset`
- Role: Holds the transset state.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op draw`
- Role: Holds the draw state.
- Description: Backs the cached state for this file.

#### `public NodeWrap mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `public double thrl, thrh`
- Role: Stores the thrh value.
- Description: Backs the cached state for this file.

#### `public double thrl, thrh`
- Role: Stores the thrh value.
- Description: Backs the cached state for this file.

#### `public double nz`
- Role: Stores the nz value.
- Description: Backs the cached state for this file.

#### `public Pipe.Op draw`
- Role: Holds the draw state.
- Description: Backs the cached state for this file.

#### `final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `final Scan vs, es`
- Role: Holds the es state.
- Description: Backs the cached state for this file.

#### `final Scan vs, es`
- Role: Holds the es state.
- Description: Backs the cached state for this file.

#### `final float[][] bv`
- Role: Stores the bv value.
- Description: Backs the cached state for this file.

#### `final boolean[][] en`
- Role: Tracks the en flag.
- Description: Supports the en operation used by the surrounding class.

#### `final VertFactory[] lvfac = new VertFactory[var.length + 1]`
- Role: Holds the lvfac state.
- Description: Backs the cached state for this file.

#### `public final MapMesh.DataID<Blend> blend = new MapMesh.DataID<Blend>()`
- Role: Holds the blend state.
- Description: Backs the cached state for this file.

#### `private final static Map<TexRender, AlphaTex> transtex = new WeakHashMap<TexRender, AlphaTex>()`
- Role: Caches transtex entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Tiler.MCons rcons`
- Role: Holds the rcons state.
- Description: Backs the cached state for this file.

#### `public final int rth`
- Role: Stores the rth value.
- Description: Backs the cached state for this file.

### Methods

#### `public Var(NodeWrap mat, double thrl, double thrh, double nz)`
- Role: Performs var.
- Description: Supports the var operation used by the surrounding class.

#### `private Blend(MapMesh m)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `private void setbase(float[][] bv)`
- Role: Performs setbase.
- Description: Supports the setbase operation used by the surrounding class.

#### `public TerrainTile create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public TerrainTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset)`
- Role: Creates a new TerrainTile instance.
- Description: Constructs the instance and initializes its default state.

#### `public TerrainTile(int id, TerrainTile from)`
- Role: Creates a new TerrainTile instance.
- Description: Constructs the instance and initializes its default state.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public void faces(MapMesh m, MPart d)`
- Role: Performs faces.
- Description: Supports the faces operation used by the surrounding class.

#### `public void _faces(MapMesh m, int z, Tile trans, MPart d)`
- Role: Performs  faces.
- Description: Supports the faces operation used by the surrounding class.

#### `private MCons tcons(final int z, final Tile t)`
- Role: Performs tcons.
- Description: Supports the tcons operation used by the surrounding class.

#### `public MCons tcons(final int z, final int bmask, final int cmask)`
- Role: Performs tcons.
- Description: Supports the tcons operation used by the surrounding class.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Performs trans.
- Description: Supports the trans operation used by the surrounding class.

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public RidgeTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset, int rth, Pipe.Op rmat, float texh)`
- Role: Performs ridge tile.
- Description: Supports the ridge tile operation used by the surrounding class.

#### `public RidgeTile(int id, RidgeTile from)`
- Role: Performs ridge tile.
- Description: Supports the ridge tile operation used by the surrounding class.

#### `public double breakz()`
- Role: Performs breakz.
- Description: Supports the breakz operation used by the surrounding class.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.
