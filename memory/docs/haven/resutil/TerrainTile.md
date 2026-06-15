# TerrainTile

This file documents the responsibilities and members of `TerrainTile`.

## Meta

- Source: [TerrainTile.java](../../../../src/haven/resutil/TerrainTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a terrain tile helper.

## Nested Types

### Blend

- Description: TODO

### Factory

- Description: TODO

### RFactory

- Description: TODO

### RidgeTile

- Description: TODO

### Var

- Description: TODO

## Members

### Constants

#### `private static final int sr = 12`

- Description: TODO

### Fields

#### `public final NodeWrap base`

- Description: TODO

#### `public final SNoise3 noise`

- Description: TODO

#### `public final Var[] var`

- Description: TODO

#### `public final Tileset transset`

- Description: TODO

#### `public final Pipe.Op draw`

- Description: TODO

#### `public NodeWrap mat`

- Description: TODO

#### `public double thrl, thrh`

- Description: TODO

#### `public double thrl, thrh`

- Description: TODO

#### `public double nz`

- Description: TODO

#### `public Pipe.Op draw`

- Description: TODO

#### `final MapMesh m`

- Description: TODO

#### `final Scan vs, es`

- Description: TODO

#### `final Scan vs, es`

- Description: TODO

#### `final float[][] bv`

- Description: TODO

#### `final boolean[][] en`

- Description: TODO

#### `final VertFactory[] lvfac = new VertFactory[var.length + 1]`

- Description: TODO

#### `public final MapMesh.DataID<Blend> blend = new MapMesh.DataID<Blend>()`

- Description: TODO

#### `private final static Map<TexRender, AlphaTex> transtex = new WeakHashMap<TexRender, AlphaTex>()`

- Description: TODO

#### `public final Tiler.MCons rcons`

- Description: TODO

#### `public final int rth`

- Description: TODO

### Methods

#### `public Var(NodeWrap mat, double thrl, double thrh, double nz)`

- Description: TODO

#### `private Blend(MapMesh m)`

- Description: TODO

#### `private void setbase(float[][] bv)`

- Description: TODO

#### `public TerrainTile create(int id, Tileset set)`

- Description: TODO

#### `public TerrainTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset)`

- Description: TODO

#### `public TerrainTile(int id, TerrainTile from)`

- Description: TODO

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public void faces(MapMesh m, MPart d)`

- Description: TODO

#### `public void _faces(MapMesh m, int z, Tile trans, MPart d)`

- Description: TODO

#### `private MCons tcons(final int z, final Tile t)`

- Description: TODO

#### `public MCons tcons(final int z, final int bmask, final int cmask)`

- Description: TODO

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO

#### `public Tiler create(int id, Tileset set)`

- Description: TODO

#### `public RidgeTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset, int rth, Pipe.Op rmat, float texh)`

- Description: TODO

#### `public RidgeTile(int id, RidgeTile from)`

- Description: TODO

#### `public double breakz()`

- Description: TODO

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public void lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`

- Description: TODO

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO
