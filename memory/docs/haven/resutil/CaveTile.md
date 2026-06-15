# CaveTile

This file documents the responsibilities and members of `CaveTile`.

## Meta

- Source: [CaveTile.java](../../../../src/haven/resutil/CaveTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a cave tile resource helper.

## Nested Types

### Factory

- Description: TODO

### Walls

- Description: TODO

## Members

### Constants

#### `public static final float h = 16`

- Description: TODO

#### `public static final MapMesh.DataID<Walls> walls = MapMesh.makeid(Walls.class)`

- Description: TODO

#### `private static final Coord[] tces =`

- Description: TODO

#### `private static final Coord[] tccs =`

- Description: TODO

### Fields

#### `public final Material wtex`

- Description: TODO

#### `public final Tiler ground`

- Description: TODO

#### `public final MapMesh m`

- Description: TODO

#### `public final Scan cs`

- Description: TODO

#### `public final Vertex[][] wv`

- Description: TODO

#### `private MapMesh.MapSurface ms`

- Description: TODO

### Methods

#### `public Walls(MapMesh m)`

- Description: TODO

#### `public Vertex[] fortile(Coord tc)`

- Description: TODO

#### `public Tiler create(int id, Tileset set)`

- Description: TODO

#### `public CaveTile(int id, Tileset set, Material wtex, Tiler ground)`

- Description: TODO

#### `private void modelwall(Walls w, Coord ltc, Coord rtc)`

- Description: TODO

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `private void mkwall(MapMesh m, Walls w, Coord ltc, Coord rtc)`

- Description: TODO

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO
