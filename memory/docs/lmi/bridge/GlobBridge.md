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
- Role: Defines the shared itimefac constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_globtime = new Uniform(Type.FLOAT, "globtime", p ->`
- Role: Defines the shared u globtime constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final OCache oc = new OCache(this)`
- Role: Caches oc entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MCache map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `public final Loader loader = new Loader()`
- Role: Holds the loader state.
- Description: Backs the cached state for this file.

#### `public double gtime, sgtime, epoch = Utils.rtime()`
- Role: Stores the epoch value.
- Description: Backs the cached state for this file.

#### `public double gtime, sgtime, epoch = Utils.rtime()`
- Role: Stores the epoch value.
- Description: Backs the cached state for this file.

#### `public double gtime, sgtime, epoch = Utils.rtime()`
- Role: Stores the epoch value.
- Description: Backs the cached state for this file.

#### `public Astronomy ast`
- Role: Holds the ast state.
- Description: Backs the cached state for this file.

#### `public Party party`
- Role: Holds the party state.
- Description: Backs the cached state for this file.

#### `public Color lightamb = null, lightdif = null, lightspc = null`
- Role: Stores the lightamb value.
- Description: Backs the cached state for this file.

#### `public Color lightamb = null, lightdif = null, lightspc = null`
- Role: Stores the lightamb value.
- Description: Backs the cached state for this file.

#### `public Color lightamb = null, lightdif = null, lightspc = null`
- Role: Stores the lightamb value.
- Description: Backs the cached state for this file.

#### `public Color olightamb = null, olightdif = null, olightspc = null`
- Role: Stores the olightamb value.
- Description: Backs the cached state for this file.

#### `public Color olightamb = null, olightdif = null, olightspc = null`
- Role: Stores the olightamb value.
- Description: Backs the cached state for this file.

#### `public Color olightamb = null, olightdif = null, olightspc = null`
- Role: Stores the olightamb value.
- Description: Backs the cached state for this file.

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`
- Role: Stores the tlightamb value.
- Description: Backs the cached state for this file.

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`
- Role: Stores the tlightamb value.
- Description: Backs the cached state for this file.

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`
- Role: Stores the tlightamb value.
- Description: Backs the cached state for this file.

#### `public double lightang = 0.0, lightelev = 0.0`
- Role: Stores the lightang value.
- Description: Backs the cached state for this file.

#### `public double lightang = 0.0, lightelev = 0.0`
- Role: Stores the lightang value.
- Description: Backs the cached state for this file.

#### `public double olightang = 0.0, olightelev = 0.0`
- Role: Stores the olightang value.
- Description: Backs the cached state for this file.

#### `public double olightang = 0.0, olightelev = 0.0`
- Role: Stores the olightang value.
- Description: Backs the cached state for this file.

#### `public double tlightang = 0.0, tlightelev = 0.0`
- Role: Stores the tlightang value.
- Description: Backs the cached state for this file.

#### `public double tlightang = 0.0, tlightelev = 0.0`
- Role: Stores the tlightang value.
- Description: Backs the cached state for this file.

#### `public double lchange = -1`
- Role: Stores the lchange value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> sky1 = null, sky2 = null`
- Role: Stores the sky1 value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> sky1 = null, sky2 = null`
- Role: Stores the sky1 value.
- Description: Backs the cached state for this file.

#### `public double skyblend = 0.0`
- Role: Stores the skyblend value.
- Description: Backs the cached state for this file.

#### `private final Map<String, CAttr> cattr = new HashMap<String, CAttr>()`
- Role: Caches cattr entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Indir<Resource>, Object> wmap = new HashMap<Indir<Resource>, Object>()`
- Role: Caches wmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public int base, comp`
- Role: Stores the comp value.
- Description: Backs the cached state for this file.

#### `public int base, comp`
- Role: Stores the comp value.
- Description: Backs the cached state for this file.

#### `public ItemInfo.Raw info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `private double lastctick = 0`
- Role: Stores the lastctick value.
- Description: Backs the cached state for this file.

#### `private double stimefac = itimefac, ctimefac = itimefac`
- Role: Stores the stimefac value.
- Description: Backs the cached state for this file.

#### `private double stimefac = itimefac, ctimefac = itimefac`
- Role: Stores the stimefac value.
- Description: Backs the cached state for this file.

#### `public final double globtime`
- Role: Stores the globtime value.
- Description: Backs the cached state for this file.

### Methods

#### `public Glob(Session sess)`
- Role: Performs glob.
- Description: Supports the glob operation used by the surrounding class.

#### `public default Pipe.Op state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public default void update(Object... args)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default boolean remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public default boolean tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public Weather weather(Glob glob, Object... args)`
- Role: Performs weather.
- Description: Supports the weather operation used by the surrounding class.

#### `public CAttr(Glob glob, String nm, int base, int comp, ItemInfo.Raw info)`
- Role: Performs cattr.
- Description: Supports the cattr operation used by the surrounding class.

#### `public void update(int base, int comp, ItemInfo.Raw info)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Indir<Resource> res()`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `private static Color colstep(Color o, Color t, double a)`
- Role: Performs colstep.
- Description: Supports the colstep operation used by the surrounding class.

#### `private void ticklight(double dt)`
- Role: Advances the ticklight over time.
- Description: Supports the ticklight operation used by the surrounding class.

#### `public void ctick()`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `private void tickgtime(double now, double dt)`
- Role: Advances the tickgtime over time.
- Description: Supports the tickgtime operation used by the surrounding class.

#### `private void updgtime(double sgtime, boolean inc)`
- Role: Performs updgtime.
- Description: Supports the updgtime operation used by the surrounding class.

#### `public String gtimestats()`
- Role: Performs gtimestats.
- Description: Supports the gtimestats operation used by the surrounding class.

#### `public double globtime()`
- Role: Performs globtime.
- Description: Supports the globtime operation used by the surrounding class.

#### `public void blob(Message msg)`
- Role: Performs blob.
- Description: Supports the blob operation used by the surrounding class.

#### `public Collection<Weather> weather()`
- Role: Performs weather.
- Description: Supports the weather operation used by the surrounding class.

#### `public static DirLight amblight(Pipe st)`
- Role: Performs amblight.
- Description: Supports the amblight operation used by the surrounding class.

#### `public CAttr getcattr(String nm)`
- Role: Performs getcattr.
- Description: Supports the getcattr operation used by the surrounding class.

#### `public void cattr(String nm, int base, int comp, ItemInfo.Raw info)`
- Role: Performs cattr.
- Description: Supports the cattr operation used by the surrounding class.

#### `public FrameInfo(Glob glob)`
- Role: Performs frame info.
- Description: Supports the frame info operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Expression globtime()`
- Role: Performs globtime.
- Description: Supports the globtime operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
