# GroundTile

This file documents the responsibilities and members of `GroundTile`.

## Meta

- Source: [GroundTile.java](../../../../src/haven/resutil/GroundTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for ground tile.

## Nested Types

### Fac

- Role: Represents fac within GroundTile.
- Description: Describes the nested fac type used by the enclosing class.

## Members

### Constants

#### `private static final Pipe.Op gcol = new Light.PhongLight(true, new Color(128, 128, 128), new Color(255, 255, 255), new Color(0, 0, 0), new Color(0, 0, 0), 0)`
- Role: Defines the shared gcol constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Tileset set`
- Role: Holds the set state.
- Description: Backs the cached state for this file.

### Methods

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public GroundTile(int id, Tileset set)`
- Role: Creates a new GroundTile instance.
- Description: Constructs the instance and initializes its default state.

#### `public static float tcx(Tex t, int x)`
- Role: Performs tcx.
- Description: Supports the tcx operation used by the surrounding class.

#### `public static float tcy(Tex t, int y)`
- Role: Performs tcy.
- Description: Supports the tcy operation used by the surrounding class.

#### `private static Pipe.Op stfor(Tex tex, int z, boolean clip)`
- Role: Performs stfor.
- Description: Supports the stfor operation used by the surrounding class.

#### `public void _faces(MapMesh m, Tile t, int z, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`
- Role: Performs  faces.
- Description: Supports the faces operation used by the surrounding class.

#### `public void faces(MapMesh m, MPart d)`
- Role: Performs faces.
- Description: Supports the faces operation used by the surrounding class.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `private MCons tcons(final int z, final Tile t)`
- Role: Performs tcons.
- Description: Supports the tcons operation used by the surrounding class.

#### `public MCons tcons(final int z, final int bmask, final int cmask)`
- Role: Performs tcons.
- Description: Supports the tcons operation used by the surrounding class.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Performs trans.
- Description: Supports the trans operation used by the surrounding class.
