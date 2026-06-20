---
source: [MapSource.java](../../../src/haven/MapSource.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapSource

Represents the map source Haven component.

## Members

### Constants

### Fields

### Methods

#### `public int gettile(Coord tc)`
- Role: Performs gettile.
- Description: Supports the gettile operation used by the surrounding class.

#### `public double getfz(Coord tc)`
- Role: Performs getfz.
- Description: Supports the getfz operation used by the surrounding class.

#### `public Tileset tileset(int t)`
- Role: Performs tileset.
- Description: Supports the tileset operation used by the surrounding class.

#### `public Tiler tiler(int t)`
- Role: Performs tiler.
- Description: Supports the tiler operation used by the surrounding class.

#### `static BufferedImage tileimg(MapSource m, BufferedImage[] texes, int t)`
- Role: Performs tileimg.
- Description: Supports the tileimg operation used by the surrounding class.

#### `public static BufferedImage drawmap(MapSource m, Area a)`
- Role: Performs drawmap.
- Description: Supports the drawmap operation used by the surrounding class.
