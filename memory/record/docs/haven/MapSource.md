---
source: [MapSource.java](../../../../src/haven/MapSource.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapSource

Exposes tile ids, heights, and tile resources for map rendering.

## Members

### Constants

### Fields

### Methods

#### `public int gettile(Coord tc)`
- Role: Returns a tile id.
- Description: Looks up the tile index at the supplied map coordinate.

#### `public double getfz(Coord tc)`
- Role: Returns terrain height.
- Description: Looks up the floor height at the supplied map coordinate.

#### `public Tileset tileset(int t)`
- Role: Returns a tileset.
- Description: Resolves the resource-backed tileset for a tile id.

#### `public Tiler tiler(int t)`
- Role: Returns a tiler.
- Description: Resolves the tile behavior object for a tile id.

#### `static BufferedImage tileimg(MapSource m, BufferedImage[] texes, int t)`
- Role: Resolves a tile image.
- Description: Caches and returns the source image for one tile id.

#### `public static BufferedImage drawmap(MapSource m, Area a)`
- Role: Draws a map preview.
- Description: Renders map tiles for the requested area and overlays ridge and edge highlights.