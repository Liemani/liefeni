# Tileset

This file documents the responsibilities and members of `Tileset`.

## Meta

- Source: [Tileset.java](../../../src/haven/Tileset.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a tile set.

## Nested Types

### Flavor

- Description: TODO

### SpriteFlavor

- Description: TODO

### Tile

- Description: TODO

## Members

### Constants

### Fields

#### `private String tn = "gnd"`

- Description: TODO

#### `public String[] tags =`

- Description: TODO

#### `public Object[] ta = new Object[0]`

- Description: TODO

#### `private transient Tiler.Factory tfac`

- Description: TODO

#### `public Collection<Indir<Flavor>> flavors = new ArrayList<>()`

- Description: TODO

#### `public NodeWrap flavobjmat = null`

- Description: TODO

#### `public WeightList<Tile> ground`

- Description: TODO

#### `public WeightList<Tile>[] ctrans, btrans`

- Description: TODO

#### `public WeightList<Tile>[] ctrans, btrans`

- Description: TODO

#### `public int flavprob`

- Description: TODO

#### `transient BufferedImage img`

- Description: TODO

#### `transient private Tex tex`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final int w`

- Description: TODO

#### `public final char t`

- Description: TODO

#### `private final long seed`

- Description: TODO

#### `public final Glob glob`

- Description: TODO

#### `public final Area area`

- Description: TODO

#### `public final long seed`

- Description: TODO

#### `final Map<NodeWrap, Collection<Gob>> mats = new HashMap<>()`

- Description: TODO

#### `private final Map<Object, Object> data = new IdentityHashMap<>()`

- Description: TODO

#### `private final Collection<Runnable> finish = new LinkedList<>()`

- Description: TODO

#### `public final MapSource grid, map`

- Description: TODO

#### `public final MapSource grid, map`

- Description: TODO

#### `public final int tile`

- Description: TODO

#### `public final Area area`

- Description: TODO

#### `private final Coord toff`

- Description: TODO

#### `private boolean[] mask = null`

- Description: TODO

#### `private List<Coord> tiles = null`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

#### `private Flavor flav`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final double p`

- Description: TODO

### Methods

#### `public Tile(Resource res, Message buf)`

- Description: TODO

#### `public synchronized Tex tex()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Obj(Buffer buf, Coord2d c, double a)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public GridObj(Buffer buf, Coord2d c, double a)`

- Description: TODO

#### `public GridObj(Buffer buf)`

- Description: TODO

#### `public Placer placer()`

- Description: TODO

#### `protected Pipe.Op getmapstate(Coord3f pc)`

- Description: TODO

#### `public Buffer(Glob glob, Area area, long seed)`

- Description: TODO

#### `public Collection<Gob> matslot(NodeWrap mat)`

- Description: TODO

#### `public void add(Gob ob, NodeWrap mat)`

- Description: TODO

#### `public void add(Gob ob)`

- Description: TODO

#### `public <T> T datum(Function<Buffer, T> id)`

- Description: TODO

#### `public void finish(Runnable act)`

- Description: TODO

#### `public void finish()`

- Description: TODO

#### `public Terrain(MapSource grid, MapSource map, int tile, Area area, Coord toff)`

- Description: TODO

#### `public boolean[] mask()`

- Description: TODO

#### `public List<Coord> tiles()`

- Description: TODO

#### `public int gettile(Coord tc)`

- Description: TODO

#### `public double getfz(Coord tc)`

- Description: TODO

#### `public Tileset tileset(int t)`

- Description: TODO

#### `public Tiler tiler(int t)`

- Description: TODO

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`

- Description: TODO

#### `public Flavor make(Tileset trn, Object... args)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public Flavor get()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public SpriteFlavor(Indir<Resource> res, double p)`

- Description: TODO

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`

- Description: TODO

#### `private Tileset(Resource res)`

- Description: TODO

#### `public Tileset(Resource res, Message buf)`

- Description: TODO

#### `public Tiler.Factory tfac()`

- Description: TODO

#### `private void packtiles(Collection<Tile> tiles, Coord tsz)`

- Description: TODO

#### `public void init()`

- Description: TODO
