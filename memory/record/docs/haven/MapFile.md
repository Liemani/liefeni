---
source: [MapFile.java](../../../../src/haven/MapFile.java)
created: 2026-06-13
updated: 2026-06-20
---

# MapFile

Haven-side map cache that stores grids, segments, markers, export data, and import state in `ResCache`.

## Nested Types

### `GridInfo`
- Role: Bridges a Haven grid id to its stored map segment id and segment-local coordinate.
- Description: `gridinfo` uses this record to locate a grid inside `map_segment` and to keep `WaypointGridSaveCoordinator` aligned with Haven map state.

### `Marker`, `PMarker`, `SMarker`
- Role: Represent user markers stored in the map file.
- Description: `PMarker` stores a colored marker; `SMarker` stores a resource-backed marker with object id and optional payload.

### `TileInfo`, `Overlay`, `DataGrid`
- Role: Hold the serialized tile, overlay, and height data for one map snapshot.

### `Grid`, `ZoomGrid`
- Role: Store cached grids at full and zoomed resolution.
- Description: `Grid` wraps one Haven grid; `ZoomGrid` is generated from lower-level grids for larger-scale rendering.

### `Segment`, `ZoomCoord`, `View`, `ImportedGrid`, `Importer`
- Role: Manage segment layout, cached access, map source views, and export/import traversal.

## Members

### Constants

#### `public static final Config.Variable<java.net.URI> mapbase`
#### `public static final Config.Variable<java.net.URI> mapbase`
- Role: Configures the base map URI.
- Value: `Config.Variable.propu("haven.mapbase", "")`

#### `public static boolean debug`
#### `public static boolean debug`
- Role: Enables verbose mapfile logging.
- Value: `false`

#### `public static final Resource.Saved notile`
#### `public static final Resource.Saved notile`
- Role: Fallback tile resource used when a real tile is unavailable.
- Value: `new Resource.Saved(Resource.remote(), "gfx/tiles/notile", -1)`

#### `public static final DataGrid nogrid`
#### `public static final DataGrid nogrid`
- Role: Empty grid used when zoom data has no backing grid.
- Value: `new DataGrid(new TileInfo[] {new TileInfo(notile, 0)}, new int[cmaps.x * cmaps.y], new float[cmaps.x * cmaps.y], 0)`

#### `private static final byte[] EXPORT_SIG`
#### `private static final byte[] EXPORT_SIG`
- Role: Magic header for export and reimport streams.
- Value: `"Haven Mapfile 1".getBytes(Utils.ascii)`

#### `private static final Coord[] inout`
#### `private static final Coord[] inout`
- Role: Neighbor offsets used when updating around a changed center grid.
- Value: `new Coord[] {new Coord(0, 0), new Coord(0, -1), new Coord(1, 0), new Coord(0, 1), new Coord(-1, 0), new Coord(1, -1), new Coord(1, 1), new Coord(-1, 1), new Coord(-1, -1)}`

### Fields

#### `public final ResCache store`
- Role: Backing resource cache for mapfile persistence.

#### `public final String filename`
- Role: Mapfile namespace suffix inside the cache.

#### `public final Collection<Long> knownsegs`
- Role: Tracks known segment ids.

#### `public final Collection<Marker> markers`
- Role: Stores loaded markers.

#### `public final BackCache<Long, GridInfo> gridinfo`
- Role: Lazily loads `gi-%x` records by Haven grid id.

#### `public final BackCache<Long, Segment> segments`
- Role: Lazily loads `seg-%x` segment records.

### Methods

#### `public static MapFile load(ResCache store, String filename)`
- Role: Loads mapfile index data from cache.

#### `public void defersave()`
- Role: Schedules index persistence on the internal processor thread.

#### `public void update(MCache map, Collection<MCache.Grid> grids)`
- Role: Refreshes mapfile records from Haven grids, creating missing grid and segment records as needed.

#### `public void update(MCache map, Coord cgc)`
- Role: Queues an update around one center grid and its neighbors.

#### `public void export(...)` / `public void reimport(...)`
- Role: Serializes and restores grid and marker data.

#### `public void add(Marker mark)` / `public void remove(Marker mark)` / `public void update(Marker mark)`
- Role: Mutate marker state and mark the index dirty.

#### `public SMarker smarker(String resnm, long seg, Coord tc)`
- Role: Finds a stored scripted marker by resource name and position.