# OCache

This file documents the responsibilities and members of `OCache`.

## Meta

- Source: [OCache.java](../../../src/haven/OCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches observed gob state from network updates.

## Nested Types

### $move

- Role: Represents $move within OCache.
- Description: Describes the nested $move type used by the enclosing class.

### $overlay

- Role: Represents $overlay within OCache.
- Description: Describes the nested $overlay type used by the enclosing class.

### $resattr

- Role: Represents $resattr within OCache.
- Description: Describes the nested $resattr type used by the enclosing class.

### AttrDelta

- Role: Represents attr delta within OCache.
- Description: Describes the nested attr delta type used by the enclosing class.

### ChangeCallback

- Role: Represents change callback within OCache.
- Description: Describes the nested change callback type used by the enclosing class.

### Delta

- Role: Represents delta within OCache.
- Description: Describes the nested delta type used by the enclosing class.

### DeltaType

- Role: Represents delta type within OCache.
- Description: Describes the nested delta type type used by the enclosing class.

### FixedPlace

- Role: Represents fixed place within OCache.
- Description: Describes the nested fixed place type used by the enclosing class.

### GobInfo

- Role: Represents gob info within OCache.
- Description: Describes the nested gob info type used by the enclosing class.

### ObjDelta

- Role: Represents obj delta within OCache.
- Description: Describes the nested obj delta type used by the enclosing class.

### OlSprite

- Role: Represents ol sprite within OCache.
- Description: Describes the nested ol sprite type used by the enclosing class.

### Virtual

- Role: Represents virtual within OCache.
- Description: Describes the nested virtual type used by the enclosing class.

## Members

### Constants

#### `public static final int OD_REM = 0`
- Role: Defines the shared od rem constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_MOVE = 1`
- Role: Defines the shared od move constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_RES = 2`
- Role: Defines the shared od res constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_LINBEG = 3`
- Role: Defines the shared od linbeg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_LINSTEP = 4`
- Role: Defines the shared od linstep constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_SPEECH = 5`
- Role: Defines the shared od speech constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_COMPOSE = 6`
- Role: Defines the shared od compose constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_ZOFF = 7`
- Role: Defines the shared od zoff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_LUMIN = 8`
- Role: Defines the shared od lumin constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_AVATAR = 9`
- Role: Defines the shared od avatar constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_FOLLOW = 10`
- Role: Defines the shared od follow constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_HOMING = 11`
- Role: Defines the shared od homing constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_OVERLAY = 12`
- Role: Defines the shared od overlay constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_HEALTH = 14`
- Role: Defines the shared od health constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_CMPPOSE = 16`
- Role: Defines the shared od cmppose constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_CMPMOD = 17`
- Role: Defines the shared od cmpmod constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_CMPEQU = 18`
- Role: Defines the shared od cmpequ constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_ICON = 19`
- Role: Defines the shared od icon constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_RESATTR = 20`
- Role: Defines the shared od resattr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OD_END = 255`
- Role: Defines the shared od end constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int[] compodmap =`
- Role: Defines the shared ocache constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord2d posres = Coord2d.of(0x1.0p-10, 0x1.0p-10).mul(11, 11)`
- Role: Defines the shared posres constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Integer, Delta> deltas = new HashMap<>()`
- Role: Defines the shared deltas constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private Collection<Collection<Gob>> local = new LinkedList<Collection<Gob>>()`
- Role: Caches local entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private MultiMap<Long, Gob> objs = new HashMultiMap<Long, Gob>()`
- Role: Caches objs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `private final Collection<ChangeCallback> cbs = new WeakList<ChangeCallback>()`
- Role: Caches cbs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private java.util.concurrent.atomic.AtomicLong nextvirt = new java.util.concurrent.atomic.AtomicLong(-1)`
- Role: Stores the nextvirt value.
- Description: Backs the cached state for this file.

#### `public final Coord3f fc`
- Role: Stores the fc value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final LinkedList<AttrDelta> pending = new LinkedList<>()`
- Role: Caches pending entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int frame`
- Role: Stores the frame value.
- Description: Backs the cached state for this file.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Supports the virtual operation used by the surrounding class.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Supports the virtual operation used by the surrounding class.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Supports the virtual operation used by the surrounding class.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Supports the virtual operation used by the surrounding class.

#### `public Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public Loader.Future<?> applier`
- Role: Holds the applier state.
- Description: Backs the cached state for this file.

#### `private final Map<Long, GobInfo> netinfo = new HashMap<>()`
- Role: Caches netinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int fl, frame`
- Role: Stores the frame value.
- Description: Backs the cached state for this file.

#### `public int fl, frame`
- Role: Stores the frame value.
- Description: Backs the cached state for this file.

#### `public int initframe`
- Role: Stores the initframe value.
- Description: Backs the cached state for this file.

#### `public long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final List<AttrDelta> attrs = new LinkedList<>()`
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public boolean rem = false`
- Role: Tracks the rem flag.
- Description: Supports the rem operation used by the surrounding class.

#### `public boolean old`
- Role: Tracks the old flag.
- Description: Supports the old operation used by the surrounding class.

#### `private ArrayList<Gob> _gobArray= new ArrayList<Gob>()`
- Role: Caches gob array entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void added(Gob ob)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(Gob ob)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public OCache(Glob glob)`
- Role: Creates a new OCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public synchronized void callback(ChangeCallback cb)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public synchronized void uncallback(ChangeCallback cb)`
- Role: Performs uncallback.
- Description: Supports the uncallback operation used by the surrounding class.

#### `public void add(Gob ob)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Gob ob)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Iterator<Gob> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public void ladd(Collection<Gob> gob)`
- Role: Performs ladd.
- Description: Supports the ladd operation used by the surrounding class.

#### `public void lrem(Collection<Gob> gob)`
- Role: Performs lrem.
- Description: Supports the lrem operation used by the surrounding class.

#### `public synchronized Gob getgob(long id)`
- Role: Performs getgob.
- Description: Supports the getgob operation used by the surrounding class.

#### `public Virtual(Coord2d c, double a)`
- Role: Performs virtual.
- Description: Supports the virtual operation used by the surrounding class.

#### `public FixedPlace(Coord3f fc, double a)`
- Role: Performs fixed place.
- Description: Supports the fixed place operation used by the surrounding class.

#### `public FixedPlace()`
- Role: Performs fixed place.
- Description: Supports the fixed place operation used by the surrounding class.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Performs getmapstate.
- Description: Supports the getmapstate operation used by the surrounding class.

#### `public void apply(Gob gob, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Indir<Resource> getres(Gob gob, int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public int value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public OlSprite(Indir<Resource> res, byte[] sdt)`
- Role: Performs ol sprite.
- Description: Supports the ol sprite operation used by the surrounding class.

#### `public Sprite create(Sprite.Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public GobInfo(long id, int frame)`
- Role: Performs gob info.
- Description: Supports the gob info operation used by the surrounding class.

#### `private void apply()`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void checkdirty(boolean interrupt)`
- Role: Performs checkdirty.
- Description: Supports the checkdirty operation used by the surrounding class.

#### `private GobInfo netremove(long id, int frame)`
- Role: Performs netremove.
- Description: Supports the netremove operation used by the surrounding class.

#### `private GobInfo netget(long id, int frame)`
- Role: Performs netget.
- Description: Supports the netget operation used by the surrounding class.

#### `public ObjDelta(int fl, long id, int frame)`
- Role: Performs obj delta.
- Description: Supports the obj delta operation used by the surrounding class.

#### `public ObjDelta(ObjDelta from)`
- Role: Performs obj delta.
- Description: Supports the obj delta operation used by the surrounding class.

#### `public ObjDelta()`
- Role: Performs obj delta.
- Description: Supports the obj delta operation used by the surrounding class.

#### `public ObjDelta clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public AttrDelta(ObjDelta od, int type, byte[] blob)`
- Role: Performs attr delta.
- Description: Supports the attr delta operation used by the surrounding class.

#### `public AttrDelta(ObjDelta od, int type, Message blob, int len)`
- Role: Performs attr delta.
- Description: Supports the attr delta operation used by the surrounding class.

#### `public AttrDelta(AttrDelta from)`
- Role: Performs attr delta.
- Description: Supports the attr delta operation used by the surrounding class.

#### `public AttrDelta clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public GobInfo receive(ObjDelta delta)`
- Role: Receives the current message.
- Description: Supports the receive operation used by the surrounding class.

#### `public ArrayList<Gob> gobArray()`
- Role: Performs gob array.
- Description: Supports the gob array operation used by the surrounding class.

#### `private void _setGobArray(ArrayList<Gob> gobArray)`
- Role: Performs  set gob array.
- Description: Supports the set gob array operation used by the surrounding class.
