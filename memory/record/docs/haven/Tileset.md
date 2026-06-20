---
source: [Tileset.java](../../../src/haven/Tileset.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tileset

Represents the tileset Haven component.

## Nested Types

### Flavor

- Role: Represents flavor within Tileset.
- Description: Describes the nested flavor type used by the enclosing class.

### SpriteFlavor

- Role: Represents sprite flavor within Tileset.
- Description: Describes the nested sprite flavor type used by the enclosing class.

### Tile

- Role: Represents tile within Tileset.
- Description: Describes the nested tile type used by the enclosing class.

## Members

### Constants

### Fields

#### `private String tn = "gnd"`
- Role: Stores the tn value.
- Description: Backs the cached state for this file.

#### `public String[] tags =`
- Role: Stores the tileset state.
- Description: Backs the cached state for this file.

#### `public Object[] ta = new Object[0]`
- Role: Holds the ta state.
- Description: Backs the cached state for this file.

#### `private transient Tiler.Factory tfac`
- Role: Holds the tfac state.
- Description: Backs the cached state for this file.

#### `public Collection<Indir<Flavor>> flavors = new ArrayList<>()`
- Role: Caches flavors entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public NodeWrap flavobjmat = null`
- Role: Stores the flavobjmat value.
- Description: Backs the cached state for this file.

#### `public WeightList<Tile> ground`
- Role: Caches ground entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public WeightList<Tile>[] ctrans, btrans`
- Role: Caches btrans entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public WeightList<Tile>[] ctrans, btrans`
- Role: Caches btrans entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int flavprob`
- Role: Stores the flavprob value.
- Description: Backs the cached state for this file.

#### `transient BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `transient private Tex tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public final char t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private final long seed`
- Role: Stores the seed value.
- Description: Backs the cached state for this file.

#### `public final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `public final Area area`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `public final long seed`
- Role: Stores the seed value.
- Description: Backs the cached state for this file.

#### `final Map<NodeWrap, Collection<Gob>> mats = new HashMap<>()`
- Role: Caches mats entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Object, Object> data = new IdentityHashMap<>()`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Runnable> finish = new LinkedList<>()`
- Role: Caches finish entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MapSource grid, map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

#### `public final MapSource grid, map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

#### `public final int tile`
- Role: Stores the tile value.
- Description: Backs the cached state for this file.

#### `public final Area area`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `private final Coord toff`
- Role: Stores the toff value.
- Description: Backs the cached state for this file.

#### `private boolean[] mask = null`
- Role: Tracks the mask flag.
- Description: Supports the mask operation used by the surrounding class.

#### `private List<Coord> tiles = null`
- Role: Caches tiles entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `private Flavor flav`
- Role: Holds the flav state.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final double p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

### Methods

#### `public Tile(Resource res, Message buf)`
- Role: Performs tile.
- Description: Supports the tile operation used by the surrounding class.

#### `public synchronized Tex tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Obj(Buffer buf, Coord2d c, double a)`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public GridObj(Buffer buf, Coord2d c, double a)`
- Role: Performs grid obj.
- Description: Supports the grid obj operation used by the surrounding class.

#### `public GridObj(Buffer buf)`
- Role: Performs grid obj.
- Description: Supports the grid obj operation used by the surrounding class.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Performs getmapstate.
- Description: Supports the getmapstate operation used by the surrounding class.

#### `public Buffer(Glob glob, Area area, long seed)`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public Collection<Gob> matslot(NodeWrap mat)`
- Role: Performs matslot.
- Description: Supports the matslot operation used by the surrounding class.

#### `public void add(Gob ob, NodeWrap mat)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Gob ob)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public <T> T datum(Function<Buffer, T> id)`
- Role: Performs datum.
- Description: Supports the datum operation used by the surrounding class.

#### `public void finish(Runnable act)`
- Role: Performs finish.
- Description: Supports the finish operation used by the surrounding class.

#### `public void finish()`
- Role: Performs finish.
- Description: Supports the finish operation used by the surrounding class.

#### `public Terrain(MapSource grid, MapSource map, int tile, Area area, Coord toff)`
- Role: Performs terrain.
- Description: Supports the terrain operation used by the surrounding class.

#### `public boolean[] mask()`
- Role: Performs mask.
- Description: Supports the mask operation used by the surrounding class.

#### `public List<Coord> tiles()`
- Role: Performs tiles.
- Description: Supports the tiles operation used by the surrounding class.

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

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`
- Role: Performs flavor.
- Description: Supports the flavor operation used by the surrounding class.

#### `public Flavor make(Tileset trn, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Flavor get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public SpriteFlavor(Indir<Resource> res, double p)`
- Role: Performs sprite flavor.
- Description: Supports the sprite flavor operation used by the surrounding class.

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`
- Role: Performs flavor.
- Description: Supports the flavor operation used by the surrounding class.

#### `private Tileset(Resource res)`
- Role: Creates a new Tileset instance.
- Description: Constructs the instance and initializes its default state.

#### `public Tileset(Resource res, Message buf)`
- Role: Creates a new Tileset instance.
- Description: Constructs the instance and initializes its default state.

#### `public Tiler.Factory tfac()`
- Role: Performs tfac.
- Description: Supports the tfac operation used by the surrounding class.

#### `private void packtiles(Collection<Tile> tiles, Coord tsz)`
- Role: Performs packtiles.
- Description: Supports the packtiles operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.
