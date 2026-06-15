# GlobBridge

This file documents the responsibilities and members of `GlobBridge`.

## Meta

- Source: [Glob.java](../../../../src/haven/Glob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns the current Haven `Glob` reference and provides narrow world/map lookup helpers.

## Members

### Constants

#### `private static final double itimefac = 3.0`

- Description: TODO

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`

- Description: TODO

#### `public static final Uniform u_globtime = new Uniform(Type.FLOAT, "globtime", p ->`

- Description: TODO

### Fields

#### `public final OCache oc = new OCache(this)`

- Description: TODO

#### `public final MCache map`

- Description: TODO

#### `public final Session sess`

- Description: TODO

#### `public final Loader loader = new Loader()`

- Description: TODO

#### `public double gtime, sgtime, epoch = Utils.rtime()`

- Description: TODO

#### `public double gtime, sgtime, epoch = Utils.rtime()`

- Description: TODO

#### `public double gtime, sgtime, epoch = Utils.rtime()`

- Description: TODO

#### `public Astronomy ast`

- Description: TODO

#### `public Party party`

- Description: TODO

#### `public Color lightamb = null, lightdif = null, lightspc = null`

- Description: TODO

#### `public Color lightamb = null, lightdif = null, lightspc = null`

- Description: TODO

#### `public Color lightamb = null, lightdif = null, lightspc = null`

- Description: TODO

#### `public Color olightamb = null, olightdif = null, olightspc = null`

- Description: TODO

#### `public Color olightamb = null, olightdif = null, olightspc = null`

- Description: TODO

#### `public Color olightamb = null, olightdif = null, olightspc = null`

- Description: TODO

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`

- Description: TODO

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`

- Description: TODO

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`

- Description: TODO

#### `public double lightang = 0.0, lightelev = 0.0`

- Description: TODO

#### `public double lightang = 0.0, lightelev = 0.0`

- Description: TODO

#### `public double olightang = 0.0, olightelev = 0.0`

- Description: TODO

#### `public double olightang = 0.0, olightelev = 0.0`

- Description: TODO

#### `public double tlightang = 0.0, tlightelev = 0.0`

- Description: TODO

#### `public double tlightang = 0.0, tlightelev = 0.0`

- Description: TODO

#### `public double lchange = -1`

- Description: TODO

#### `public Indir<Resource> sky1 = null, sky2 = null`

- Description: TODO

#### `public Indir<Resource> sky1 = null, sky2 = null`

- Description: TODO

#### `public double skyblend = 0.0`

- Description: TODO

#### `private final Map<String, CAttr> cattr = new HashMap<String, CAttr>()`

- Description: TODO

#### `private Map<Indir<Resource>, Object> wmap = new HashMap<Indir<Resource>, Object>()`

- Description: TODO

#### `public final Glob glob`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public int base, comp`

- Description: TODO

#### `public int base, comp`

- Description: TODO

#### `public ItemInfo.Raw info`

- Description: TODO

#### `private double lastctick = 0`

- Description: TODO

#### `private double stimefac = itimefac, ctimefac = itimefac`

- Description: TODO

#### `private double stimefac = itimefac, ctimefac = itimefac`

- Description: TODO

#### `public final double globtime`

- Description: TODO

### Methods

#### `public Glob(Session sess)`

- Description: TODO

#### `public default Pipe.Op state()`

- Description: TODO

#### `public default void update(Object... args)`

- Description: TODO

#### `public default boolean remove()`

- Description: TODO

#### `public default boolean tick(double dt)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public Weather weather(Glob glob, Object... args)`

- Description: TODO

#### `public CAttr(Glob glob, String nm, int base, int comp, ItemInfo.Raw info)`

- Description: TODO

#### `public void update(int base, int comp, ItemInfo.Raw info)`

- Description: TODO

#### `public Indir<Resource> res()`

- Description: TODO

#### `private static Color colstep(Color o, Color t, double a)`

- Description: TODO

#### `private void ticklight(double dt)`

- Description: TODO

#### `public void ctick()`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `private void tickgtime(double now, double dt)`

- Description: TODO

#### `private void updgtime(double sgtime, boolean inc)`

- Description: TODO

#### `public String gtimestats()`

- Description: TODO

#### `public double globtime()`

- Description: TODO

#### `public void blob(Message msg)`

- Description: TODO

#### `public Collection<Weather> weather()`

- Description: TODO

#### `public static DirLight amblight(Pipe st)`

- Description: TODO

#### `public CAttr getcattr(String nm)`

- Description: TODO

#### `public void cattr(String nm, int base, int comp, ItemInfo.Raw info)`

- Description: TODO

#### `public FrameInfo(Glob glob)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public static Expression globtime()`

- Description: TODO

#### `public String toString()`

- Description: TODO
