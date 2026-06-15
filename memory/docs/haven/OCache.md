# OCache

This file documents the responsibilities and members of `OCache`.

## Meta

- Source: [OCache.java](../../../src/haven/OCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches world gobs and object state.

## Nested Types

### $move

- Description: TODO

### $overlay

- Description: TODO

### $resattr

- Description: TODO

### AttrDelta

- Description: TODO

### ChangeCallback

- Description: TODO

### Delta

- Description: TODO

### DeltaType

- Description: TODO

### FixedPlace

- Description: TODO

### GobInfo

- Description: TODO

### ObjDelta

- Description: TODO

### OlSprite

- Description: TODO

### Virtual

- Description: TODO

## Members

### Constants

#### `public static final int OD_REM = 0`

- Description: TODO

#### `public static final int OD_MOVE = 1`

- Description: TODO

#### `public static final int OD_RES = 2`

- Description: TODO

#### `public static final int OD_LINBEG = 3`

- Description: TODO

#### `public static final int OD_LINSTEP = 4`

- Description: TODO

#### `public static final int OD_SPEECH = 5`

- Description: TODO

#### `public static final int OD_COMPOSE = 6`

- Description: TODO

#### `public static final int OD_ZOFF = 7`

- Description: TODO

#### `public static final int OD_LUMIN = 8`

- Description: TODO

#### `public static final int OD_AVATAR = 9`

- Description: TODO

#### `public static final int OD_FOLLOW = 10`

- Description: TODO

#### `public static final int OD_HOMING = 11`

- Description: TODO

#### `public static final int OD_OVERLAY = 12`

- Description: TODO

#### `public static final int OD_HEALTH = 14`

- Description: TODO

#### `public static final int OD_CMPPOSE = 16`

- Description: TODO

#### `public static final int OD_CMPMOD = 17`

- Description: TODO

#### `public static final int OD_CMPEQU = 18`

- Description: TODO

#### `public static final int OD_ICON = 19`

- Description: TODO

#### `public static final int OD_RESATTR = 20`

- Description: TODO

#### `public static final int OD_END = 255`

- Description: TODO

#### `public static final int[] compodmap =`

- Description: TODO

#### `public static final Coord2d posres = Coord2d.of(0x1.0p-10, 0x1.0p-10).mul(11, 11)`

- Description: TODO

#### `private static final Map<Integer, Delta> deltas = new HashMap<>()`

- Description: TODO

### Fields

#### `private Collection<Collection<Gob>> local = new LinkedList<Collection<Gob>>()`

- Description: TODO

#### `private MultiMap<Long, Gob> objs = new HashMultiMap<Long, Gob>()`

- Description: TODO

#### `private Glob glob`

- Description: TODO

#### `private final Collection<ChangeCallback> cbs = new WeakList<ChangeCallback>()`

- Description: TODO

#### `private java.util.concurrent.atomic.AtomicLong nextvirt = new java.util.concurrent.atomic.AtomicLong(-1)`

- Description: TODO

#### `public final Coord3f fc`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public byte[] sdt`

- Description: TODO

#### `public final long id`

- Description: TODO

#### `public final LinkedList<AttrDelta> pending = new LinkedList<>()`

- Description: TODO

#### `public int frame`

- Description: TODO

#### `public boolean nremoved, added, gremoved, virtual`

- Description: TODO

#### `public boolean nremoved, added, gremoved, virtual`

- Description: TODO

#### `public boolean nremoved, added, gremoved, virtual`

- Description: TODO

#### `public boolean nremoved, added, gremoved, virtual`

- Description: TODO

#### `public Gob gob`

- Description: TODO

#### `public Loader.Future<?> applier`

- Description: TODO

#### `private final Map<Long, GobInfo> netinfo = new HashMap<>()`

- Description: TODO

#### `public int fl, frame`

- Description: TODO

#### `public int fl, frame`

- Description: TODO

#### `public int initframe`

- Description: TODO

#### `public long id`

- Description: TODO

#### `public final List<AttrDelta> attrs = new LinkedList<>()`

- Description: TODO

#### `public boolean rem = false`

- Description: TODO

#### `public boolean old`

- Description: TODO

#### `private ArrayList<Gob> _gobArray= new ArrayList<Gob>()`

- Description: TODO

### Methods

#### `public void added(Gob ob)`

- Description: TODO

#### `public void removed(Gob ob)`

- Description: TODO

#### `public OCache(Glob glob)`

- Description: TODO

#### `public synchronized void callback(ChangeCallback cb)`

- Description: TODO

#### `public synchronized void uncallback(ChangeCallback cb)`

- Description: TODO

#### `public void add(Gob ob)`

- Description: TODO

#### `public void remove(Gob ob)`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public Iterator<Gob> iterator()`

- Description: TODO

#### `public void ladd(Collection<Gob> gob)`

- Description: TODO

#### `public void lrem(Collection<Gob> gob)`

- Description: TODO

#### `public synchronized Gob getgob(long id)`

- Description: TODO

#### `public Virtual(Coord2d c, double a)`

- Description: TODO

#### `public FixedPlace(Coord3f fc, double a)`

- Description: TODO

#### `public FixedPlace()`

- Description: TODO

#### `public Coord3f getc()`

- Description: TODO

#### `protected Pipe.Op getmapstate(Coord3f pc)`

- Description: TODO

#### `public void apply(Gob gob, AttrDelta msg)`

- Description: TODO

#### `public static Indir<Resource> getres(Gob gob, int id)`

- Description: TODO

#### `public int value()`

- Description: TODO

#### `public void apply(Gob g, AttrDelta msg)`

- Description: TODO

#### `public OlSprite(Indir<Resource> res, byte[] sdt)`

- Description: TODO

#### `public Sprite create(Sprite.Owner owner)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void apply(Gob g, AttrDelta msg)`

- Description: TODO

#### `public void apply(Gob g, AttrDelta msg)`

- Description: TODO

#### `public GobInfo(long id, int frame)`

- Description: TODO

#### `private void apply()`

- Description: TODO

#### `public void checkdirty(boolean interrupt)`

- Description: TODO

#### `private GobInfo netremove(long id, int frame)`

- Description: TODO

#### `private GobInfo netget(long id, int frame)`

- Description: TODO

#### `public ObjDelta(int fl, long id, int frame)`

- Description: TODO

#### `public ObjDelta(ObjDelta from)`

- Description: TODO

#### `public ObjDelta()`

- Description: TODO

#### `public ObjDelta clone()`

- Description: TODO

#### `public AttrDelta(ObjDelta od, int type, byte[] blob)`

- Description: TODO

#### `public AttrDelta(ObjDelta od, int type, Message blob, int len)`

- Description: TODO

#### `public AttrDelta(AttrDelta from)`

- Description: TODO

#### `public AttrDelta clone()`

- Description: TODO

#### `public GobInfo receive(ObjDelta delta)`

- Description: TODO

#### `public ArrayList<Gob> gobArray()`

- Description: TODO

#### `private void _setGobArray(ArrayList<Gob> gobArray)`

- Description: TODO
