---
source: [Glob.java](../../../../src/haven/Glob.java)
created: 2026-06-13
updated: 2026-06-20
---

# Glob

Owns the shared world state for one session, including map access, weather, lighting, and global time.

## Nested Types

### `CAttr`
- Role: Holds a cached creature attribute value bound to the global world state.

### `FrameInfo`
- Role: Stores frame timing and world interpolation metadata.

### `Weather`
- Role: Stores the current weather state used by rendering.

## Members

### Constants

#### `private static final double itimefac = 3.0`
- Role: Scales in-game time relative to real time.
- Value: `3.0`

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`
- Role: Registers `FrameInfo` as a system render slot.
- Value: `new Slot<>(Slot.Type.SYS, FrameInfo.class)`

#### `public static final Uniform u_globtime = new Uniform(Type.FLOAT, "globtime", p ->`
- Role: Exposes global time to shaders.
- Value: `new Uniform(Type.FLOAT, "globtime", p ->`

### Fields

#### `public final OCache oc = new OCache(this)`
- Role: Holds the object cache for gobs and their attributes.

#### `public final MCache map`
- Role: Holds the current map cache.

#### `public final Session sess`
- Role: Holds the active network session.

#### `public final Loader loader = new Loader()`
- Role: Executes deferred world/resource loading.

#### `public double gtime, sgtime, epoch = Utils.rtime()`
- Role: Tracks global world time and the local epoch baseline.

#### `public Astronomy ast`
- Role: Holds astronomical state.

#### `public Party party`
- Role: Holds current party state.

#### `public Color lightamb = null, lightdif = null, lightspc = null`
- Role: Stores the current ambient, diffuse, and specular light colors.

#### `public Color olightamb = null, olightdif = null, olightspc = null`
- Role: Stores the previous lighting colors used for interpolation.

#### `public Color tlightamb = null, tlightdif = null, tlightspc = null`
- Role: Stores the target lighting colors.

#### `public double lightang = 0.0, lightelev = 0.0`
- Role: Stores the current lighting direction.

#### `public double olightang = 0.0, olightelev = 0.0`
- Role: Stores the previous lighting direction.

#### `public double tlightang = 0.0, tlightelev = 0.0`
- Role: Stores the target lighting direction.

#### `public double lchange = -1`
- Role: Tracks the last lighting change timestamp.

#### `public Indir<Resource> sky1 = null, sky2 = null`
- Role: Stores the active sky resources.

#### `public double skyblend = 0.0`
- Role: Stores the blend factor between the active sky resources.

#### `private final Map<String, CAttr> cattr = new HashMap<String, CAttr>()`
- Role: Caches creature attribute wrappers by name.

#### `private Map<Indir<Resource>, Object> wmap = new HashMap<Indir<Resource>, Object>()`
- Role: Caches weather state objects by resource.

### Methods

#### `public Glob(Session sess)`
- Role: Creates the world-state container for one session.

#### `public void ctick()`
- Role: Advances client-side world state and lighting interpolation.

#### `public void gtick(Render g)`
- Role: Advances game-time state and applies the current global render state.

#### `public double globtime()`
- Role: Implements the globtime operation.

#### `public void blob(Message msg)`
- Role: Loads serialized world-state data from the server.

#### `public Collection<Weather> weather()`
- Role: Returns the weather state list for the current world.

#### `public static DirLight amblight(Pipe st)`
- Role: Builds the ambient light from a render pipe.

#### `public CAttr getcattr(String nm)`
- Role: Returns the cached creature attribute wrapper for a named attribute.

#### `public void cattr(String nm, int base, int comp, ItemInfo.Raw info)`
- Role: Updates a creature attribute entry from raw item info.