---
source: [OCache.java](../../../../src/haven/OCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# OCache

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
- Role: Caches the od rem value.
- Description: Caches the `OD_REM` value for reuse.
- Value: `0`

#### `public static final int OD_MOVE = 1`
- Role: Caches the od move value.
- Description: Caches the `OD_MOVE` value for reuse.
- Value: `1`

#### `public static final int OD_RES = 2`
- Role: Caches the od res value.
- Description: Caches the `OD_RES` value for reuse.
- Value: `2`

#### `public static final int OD_LINBEG = 3`
- Role: Caches the od linbeg value.
- Description: Caches the `OD_LINBEG` value for reuse.
- Value: `3`

#### `public static final int OD_LINSTEP = 4`
- Role: Caches the od linstep value.
- Description: Caches the `OD_LINSTEP` value for reuse.
- Value: `4`

#### `public static final int OD_SPEECH = 5`
- Role: Caches the od speech value.
- Description: Caches the `OD_SPEECH` value for reuse.
- Value: `5`

#### `public static final int OD_COMPOSE = 6`
- Role: Caches the od compose value.
- Description: Caches the `OD_COMPOSE` value for reuse.
- Value: `6`

#### `public static final int OD_ZOFF = 7`
- Role: Caches the od zoff value.
- Description: Caches the `OD_ZOFF` value for reuse.
- Value: `7`

#### `public static final int OD_LUMIN = 8`
- Role: Caches the od lumin value.
- Description: Caches the `OD_LUMIN` value for reuse.
- Value: `8`

#### `public static final int OD_AVATAR = 9`
- Role: Caches the od avatar value.
- Description: Caches the `OD_AVATAR` value for reuse.
- Value: `9`

#### `public static final int OD_FOLLOW = 10`
- Role: Caches the od follow value.
- Description: Caches the `OD_FOLLOW` value for reuse.
- Value: `10`

#### `public static final int OD_HOMING = 11`
- Role: Caches the od homing value.
- Description: Caches the `OD_HOMING` value for reuse.
- Value: `11`

#### `public static final int OD_OVERLAY = 12`
- Role: Caches the od overlay value.
- Description: Caches the `OD_OVERLAY` value for reuse.
- Value: `12`

#### `public static final int OD_HEALTH = 14`
- Role: Caches the od health value.
- Description: Caches the `OD_HEALTH` value for reuse.
- Value: `14`

#### `public static final int OD_CMPPOSE = 16`
- Role: Caches the od cmppose value.
- Description: Caches the `OD_CMPPOSE` value for reuse.
- Value: `16`

#### `public static final int OD_CMPMOD = 17`
- Role: Caches the od cmpmod value.
- Description: Caches the `OD_CMPMOD` value for reuse.
- Value: `17`

#### `public static final int OD_CMPEQU = 18`
- Role: Caches the od cmpequ value.
- Description: Caches the `OD_CMPEQU` value for reuse.
- Value: `18`

#### `public static final int OD_ICON = 19`
- Role: Caches the od icon value.
- Description: Caches the `OD_ICON` value for reuse.
- Value: `19`

#### `public static final int OD_RESATTR = 20`
- Role: Caches the od resattr value.
- Description: Caches the `OD_RESATTR` value for reuse.
- Value: `20`

#### `public static final int OD_END = 255`
- Role: Caches the od end value.
- Description: Caches the `OD_END` value for reuse.
- Value: `255`

#### `public static final int[] compodmap =`
- Role: Caches the compodmap value.
- Description: Caches the `compodmap` value for reuse.
- Value: ``

#### `public static final Coord2d posres = Coord2d.of(0x1.0p-10, 0x1.0p-10).mul(11, 11)`
- Role: Implements the posres operation.
- Description: Implements the mul operation.
- Value: `Coord2d.of(0x1.0p-10, 0x1.0p-10).mul(11, 11)`

#### `private static final Map<Integer, Delta> deltas = new HashMap<>()`
- Role: Implements the deltas operation.
- Description: Implements the private static final map<integer, delta> deltas = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `private Collection<Collection<Gob>> local = new LinkedList<Collection<Gob>>()`
- Role: Implements the local operation.
- Description: Implements the private collection<collection<gob>> local = new linked list<collection<gob>>() operation.

#### `private MultiMap<Long, Gob> objs = new HashMultiMap<Long, Gob>()`
- Role: Implements the objs operation.
- Description: Implements the private multi map<long, gob> objs = new hash multi map<long, gob>() operation.

#### `private Glob glob`
- Role: Caches the glob value.
- Description: Caches the `glob` value for reuse.

#### `private final Collection<ChangeCallback> cbs = new WeakList<ChangeCallback>()`
- Role: Implements the cbs operation.
- Description: Implements the private final collection<change callback> cbs = new weak list<change callback>() operation.

#### `private java.util.concurrent.atomic.AtomicLong nextvirt = new java.util.concurrent.atomic.AtomicLong(-1)`
- Role: Implements the nextvirt operation.
- Description: Implements the atomic long operation.

#### `public final Coord3f fc`
- Role: Caches the fc value.
- Description: Caches the `fc` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final LinkedList<AttrDelta> pending = new LinkedList<>()`
- Role: Implements the pending operation.
- Description: Implements the public final linked list<attr delta> pending = new linked list<>() operation.

#### `public int frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Caches the `virtual` value for reuse.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Caches the `virtual` value for reuse.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Caches the `virtual` value for reuse.

#### `public boolean nremoved, added, gremoved, virtual`
- Role: Tracks the virtual flag.
- Description: Caches the `virtual` value for reuse.

#### `public Gob gob`
- Role: Caches the gob value.
- Description: Caches the `gob` value for reuse.

#### `public Loader.Future<?> applier`
- Role: Caches the applier value.
- Description: Caches the `applier` value for reuse.

#### `private final Map<Long, GobInfo> netinfo = new HashMap<>()`
- Role: Implements the netinfo operation.
- Description: Implements the private final map<long, gob info> netinfo = new hash map<>() operation.

#### `public int fl, frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `public int fl, frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `public int initframe`
- Role: Caches the initframe value.
- Description: Caches the `initframe` value for reuse.

#### `public long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final List<AttrDelta> attrs = new LinkedList<>()`
- Role: Implements the attrs operation.
- Description: Implements the public final list<attr delta> attrs = new linked list<>() operation.

#### `public boolean rem = false`
- Role: Tracks the rem flag.
- Description: Caches the `rem` value for reuse.

#### `public boolean old`
- Role: Tracks the old flag.
- Description: Caches the `old` value for reuse.

#### `private ArrayList<Gob> _gobArray= new ArrayList<Gob>()`
- Role: Implements the gob array operation.
- Description: Implements the private array list<gob>  gob array= new array list<gob>() operation.

### Methods

#### `public void added(Gob ob)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(Gob ob)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public OCache(Glob glob)`
- Role: Creates a new OCache instance.
- Description: Constructs the OCache instance from the supplied inputs.

#### `public synchronized void callback(ChangeCallback cb)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public synchronized void uncallback(ChangeCallback cb)`
- Role: Handles the uncallback path.
- Description: Implements the uncallback operation.

#### `public void add(Gob ob)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Gob ob)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Iterator<Gob> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public void ladd(Collection<Gob> gob)`
- Role: Handles the ladd path.
- Description: Implements the ladd operation.

#### `public void lrem(Collection<Gob> gob)`
- Role: Handles the lrem path.
- Description: Implements the lrem operation.

#### `public synchronized Gob getgob(long id)`
- Role: Handles the getgob path.
- Description: Returns the gob.

#### `public Virtual(Coord2d c, double a)`
- Role: Handles the virtual path.
- Description: Implements the virtual operation.

#### `public FixedPlace(Coord3f fc, double a)`
- Role: Handles the fixed place path.
- Description: Implements the fixed place operation.

#### `public FixedPlace()`
- Role: Handles the fixed place path.
- Description: Implements the fixed place operation.

#### `public Coord3f getc()`
- Role: Handles the getc path.
- Description: Returns the c.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Handles the getmapstate path.
- Description: Returns the mapstate.

#### `public void apply(Gob gob, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static Indir<Resource> getres(Gob gob, int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public int value()`
- Role: Handles the value path.
- Description: Implements the value operation.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public OlSprite(Indir<Resource> res, byte[] sdt)`
- Role: Handles the ol sprite path.
- Description: Implements the ol sprite operation.

#### `public Sprite create(Sprite.Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this OCache for debugging and logging.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(Gob g, AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public GobInfo(long id, int frame)`
- Role: Handles the gob info path.
- Description: Implements the gob info operation.

#### `private void apply()`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void checkdirty(boolean interrupt)`
- Role: Handles the checkdirty path.
- Description: Implements the checkdirty operation.

#### `private GobInfo netremove(long id, int frame)`
- Role: Handles the netremove path.
- Description: Implements the netremove operation.

#### `private GobInfo netget(long id, int frame)`
- Role: Handles the netget path.
- Description: Implements the netget operation.

#### `public ObjDelta(int fl, long id, int frame)`
- Role: Handles the obj delta path.
- Description: Implements the obj delta operation.

#### `public ObjDelta(ObjDelta from)`
- Role: Handles the obj delta path.
- Description: Implements the obj delta operation.

#### `public ObjDelta()`
- Role: Handles the obj delta path.
- Description: Implements the obj delta operation.

#### `public ObjDelta clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public AttrDelta(ObjDelta od, int type, byte[] blob)`
- Role: Handles the attr delta path.
- Description: Implements the attr delta operation.

#### `public AttrDelta(ObjDelta od, int type, Message blob, int len)`
- Role: Handles the attr delta path.
- Description: Implements the attr delta operation.

#### `public AttrDelta(AttrDelta from)`
- Role: Handles the attr delta path.
- Description: Implements the attr delta operation.

#### `public AttrDelta clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public GobInfo receive(ObjDelta delta)`
- Role: Receives the current message.
- Description: Implements the receive operation.

#### `public ArrayList<Gob> gobArray()`
- Role: Handles the gob array path.
- Description: Implements the gob array operation.

#### `private void _setGobArray(ArrayList<Gob> gobArray)`
- Role: Handles the set gob array path.
- Description: Implements the set gob array operation.