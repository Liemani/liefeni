---
source: [Tileset.java](../../../../src/haven/Tileset.java)
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
- Role: Caches the tn value.
- Description: Caches the `tn` value for reuse.

#### `public String[] tags =`
- Role: Stores the tileset state.
- Description: Caches the `tags` value for reuse.

#### `public Object[] ta = new Object[0]`
- Role: Caches the ta value.
- Description: Caches the `ta` value for reuse.

#### `private transient Tiler.Factory tfac`
- Role: Caches the tfac value.
- Description: Caches the `tfac` value for reuse.

#### `public Collection<Indir<Flavor>> flavors = new ArrayList<>()`
- Role: Implements the flavors operation.
- Description: Implements the public collection<indir<flavor>> flavors = new array list<>() operation.

#### `public NodeWrap flavobjmat = null`
- Role: Caches the flavobjmat value.
- Description: Caches the `flavobjmat` value for reuse.

#### `public WeightList<Tile> ground`
- Role: Caches the ground value.
- Description: Caches the `ground` value for reuse.

#### `public WeightList<Tile>[] ctrans, btrans`
- Role: Caches the btrans value.
- Description: Caches the `btrans` value for reuse.

#### `public WeightList<Tile>[] ctrans, btrans`
- Role: Caches the btrans value.
- Description: Caches the `btrans` value for reuse.

#### `public int flavprob`
- Role: Caches the flavprob value.
- Description: Caches the `flavprob` value for reuse.

#### `transient BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `transient private Tex tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public final char t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `private final long seed`
- Role: Caches the seed value.
- Description: Caches the `seed` value for reuse.

#### `public final Glob glob`
- Role: Caches the glob value.
- Description: Caches the `glob` value for reuse.

#### `public final Area area`
- Role: Caches the area value.
- Description: Caches the `area` value for reuse.

#### `public final long seed`
- Role: Caches the seed value.
- Description: Caches the `seed` value for reuse.

#### `final Map<NodeWrap, Collection<Gob>> mats = new HashMap<>()`
- Role: Implements the mats operation.
- Description: Implements the final map<node wrap, collection<gob>> mats = new hash map<>() operation.

#### `private final Map<Object, Object> data = new IdentityHashMap<>()`
- Role: Implements the data operation.
- Description: Implements the private final map<object, object> data = new identity hash map<>() operation.

#### `private final Collection<Runnable> finish = new LinkedList<>()`
- Role: Implements the finish operation.
- Description: Implements the private final collection<runnable> finish = new linked list<>() operation.

#### `public final MapSource grid, map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `public final MapSource grid, map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `public final int tile`
- Role: Caches the tile value.
- Description: Caches the `tile` value for reuse.

#### `public final Area area`
- Role: Caches the area value.
- Description: Caches the `area` value for reuse.

#### `private final Coord toff`
- Role: Caches the toff value.
- Description: Caches the `toff` value for reuse.

#### `private boolean[] mask = null`
- Role: Tracks the mask flag.
- Description: Caches the `mask` value for reuse.

#### `private List<Coord> tiles = null`
- Role: Caches the tiles value.
- Description: Caches the `tiles` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `private Flavor flav`
- Role: Caches the flav value.
- Description: Caches the `flav` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final double p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

### Methods

#### `public Tile(Resource res, Message buf)`
- Role: Handles the tile path.
- Description: Implements the tile operation.

#### `public synchronized Tex tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Obj(Buffer buf, Coord2d c, double a)`
- Role: Handles the obj path.
- Description: Implements the obj operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public GridObj(Buffer buf, Coord2d c, double a)`
- Role: Handles the grid obj path.
- Description: Implements the grid obj operation.

#### `public GridObj(Buffer buf)`
- Role: Handles the grid obj path.
- Description: Implements the grid obj operation.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Handles the getmapstate path.
- Description: Returns the mapstate.

#### `public Buffer(Glob glob, Area area, long seed)`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public Collection<Gob> matslot(NodeWrap mat)`
- Role: Handles the matslot path.
- Description: Implements the matslot operation.

#### `public void add(Gob ob, NodeWrap mat)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void add(Gob ob)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public <T> T datum(Function<Buffer, T> id)`
- Role: Handles the datum path.
- Description: Implements the datum operation.

#### `public void finish(Runnable act)`
- Role: Handles the finish path.
- Description: Implements the finish operation.

#### `public void finish()`
- Role: Handles the finish path.
- Description: Implements the finish operation.

#### `public Terrain(MapSource grid, MapSource map, int tile, Area area, Coord toff)`
- Role: Handles the terrain path.
- Description: Implements the terrain operation.

#### `public boolean[] mask()`
- Role: Handles the mask path.
- Description: Implements the mask operation.

#### `public List<Coord> tiles()`
- Role: Handles the tiles path.
- Description: Implements the tiles operation.

#### `public int gettile(Coord tc)`
- Role: Handles the gettile path.
- Description: Returns the tile.

#### `public double getfz(Coord tc)`
- Role: Handles the getfz path.
- Description: Returns the fz.

#### `public Tileset tileset(int t)`
- Role: Handles the tileset path.
- Description: Implements the tileset operation.

#### `public Tiler tiler(int t)`
- Role: Handles the tiler path.
- Description: Implements the tiler operation.

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`
- Role: Handles the flavor path.
- Description: Implements the flavor operation.

#### `public Flavor make(Tileset trn, Object... args)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Flavor get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public SpriteFlavor(Indir<Resource> res, double p)`
- Role: Handles the sprite flavor path.
- Description: Implements the sprite flavor operation.

#### `public void flavor(Buffer buf, Terrain trn, Random seed)`
- Role: Handles the flavor path.
- Description: Implements the flavor operation.

#### `private Tileset(Resource res)`
- Role: Creates a new Tileset instance.
- Description: Constructs the Tileset instance from the supplied inputs.

#### `public Tileset(Resource res, Message buf)`
- Role: Creates a new Tileset instance.
- Description: Constructs the Tileset instance from the supplied inputs.

#### `public Tiler.Factory tfac()`
- Role: Handles the tfac path.
- Description: Implements the tfac operation.

#### `private void packtiles(Collection<Tile> tiles, Coord tsz)`
- Role: Handles the packtiles path.
- Description: Implements the packtiles operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.