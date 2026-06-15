# GroundTile

This file documents the responsibilities and members of `GroundTile`.

## Meta

- Source: [GroundTile.java](../../../../src/haven/resutil/GroundTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a ground tile helper.

## Nested Types

### Fac

- Description: TODO

## Members

### Constants

#### `private static final Pipe.Op gcol = new Light.PhongLight(true, new Color(128, 128, 128), new Color(255, 255, 255), new Color(0, 0, 0), new Color(0, 0, 0), 0)`

- Description: TODO

### Fields

#### `public final Tileset set`

- Description: TODO

### Methods

#### `public Tiler create(int id, Tileset set)`

- Description: TODO

#### `public GroundTile(int id, Tileset set)`

- Description: TODO

#### `public static float tcx(Tex t, int x)`

- Description: TODO

#### `public static float tcy(Tex t, int y)`

- Description: TODO

#### `private static Pipe.Op stfor(Tex tex, int z, boolean clip)`

- Description: TODO

#### `public void _faces(MapMesh m, Tile t, int z, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`

- Description: TODO

#### `public void faces(MapMesh m, MPart d)`

- Description: TODO

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `private MCons tcons(final int z, final Tile t)`

- Description: TODO

#### `public MCons tcons(final int z, final int bmask, final int cmask)`

- Description: TODO

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO
