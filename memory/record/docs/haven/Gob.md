---
source: [Gob.java](../../../src/haven/Gob.java)
created: 2026-06-13
updated: 2026-06-14
---

# Gob

Represents a world object and its attached state.

## Nested Types

### BasePlace

- Role: Represents base place within Gob.
- Description: Describes the nested base place type used by the enclosing class.

### DataLoading

- Role: Represents data loading within Gob.
- Description: Describes the nested data loading type used by the enclosing class.

### DefaultPlace

- Role: Represents default place within Gob.
- Description: Describes the nested default place type used by the enclosing class.

### GobClick

- Role: Represents gob click within Gob.
- Description: Describes the nested gob click type used by the enclosing class.

### GobState

- Role: Represents gob state within Gob.
- Description: Describes the nested gob state type used by the enclosing class.

### InclinePlace

- Role: Represents incline place within Gob.
- Description: Describes the nested incline place type used by the enclosing class.

### LinePlace

- Role: Represents line place within Gob.
- Description: Describes the nested line place type used by the enclosing class.

### Overlay

- Role: Represents overlay within Gob.
- Description: Describes the nested overlay type used by the enclosing class.

### Placed

- Role: Represents placed within Gob.
- Description: Describes the nested placed type used by the enclosing class.

### Placement

- Role: Represents placement within Gob.
- Description: Describes the nested placement type used by the enclosing class.

### Placer

- Role: Represents placer within Gob.
- Description: Describes the nested placer type used by the enclosing class.

### Placing

- Role: Represents placing within Gob.
- Description: Describes the nested placing type used by the enclosing class.

### PlanePlace

- Role: Represents plane place within Gob.
- Description: Describes the nested plane place type used by the enclosing class.

### SetupMod

- Role: Represents setup mod within Gob.
- Description: Describes the nested setup mod type used by the enclosing class.

## Members

### Constants

#### `private static final ClassResolver<Overlay> ctxr = new ClassResolver<Overlay>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ClassResolver<Gob> ctxr = new ClassResolver<Gob>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Coord2d rc`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `public double a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public boolean virtual = false`
- Role: Tracks the virtual flag.
- Description: Supports the virtual operation used by the surrounding class.

#### `int clprio = 0`
- Role: Stores the clprio value.
- Description: Backs the cached state for this file.

#### `public long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public boolean removed = false`
- Role: Tracks the removed flag.
- Description: Supports the removed operation used by the surrounding class.

#### `public final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `Map<Class<? extends GAttrib>, GAttrib> attr = new HashMap<Class<? extends GAttrib>, GAttrib>()`
- Role: Caches attr entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Overlay> ols = new ArrayList<Overlay>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int updateseq = 0, lastolid = 0`
- Role: Stores the updateseq value.
- Description: Backs the cached state for this file.

#### `public int updateseq = 0, lastolid = 0`
- Role: Stores the updateseq value.
- Description: Backs the cached state for this file.

#### `private final Collection<SetupMod> setupmods = new ArrayList<>()`
- Role: Caches setupmods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final LinkedList<Runnable> deferred = new LinkedList<>()`
- Role: Caches deferred entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Loader.Future<?> deferral = null`
- Role: Holds the deferral state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public final Sprite.Mill<?> sm`
- Role: Holds the sm state.
- Description: Backs the cached state for this file.

#### `public Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `public boolean delign = false, old = false`
- Role: Tracks the delign flag.
- Description: Supports the delign operation used by the surrounding class.

#### `public boolean delign = false, old = false`
- Role: Tracks the delign flag.
- Description: Supports the delign operation used by the surrounding class.

#### `private Collection<RenderTree.Slot> slots = null`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean added = false`
- Role: Tracks the added flag.
- Description: Supports the added operation used by the surrounding class.

#### `public final MCache map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MCache.SurfaceID surf`
- Role: Caches surf entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Coord2d[][] obst`
- Role: Stores the obst value.
- Description: Backs the cached state for this file.

#### `private Coord2d cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private double ca`
- Role: Stores the ca value.
- Description: Backs the cached state for this file.

#### `private int seq = -1`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private float z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public final double max, min`
- Role: Stores the min value.
- Description: Backs the cached state for this file.

#### `public final double max, min`
- Role: Stores the min value.
- Description: Backs the cached state for this file.

#### `public final Coord2d k`
- Role: Stores the k value.
- Description: Backs the cached state for this file.

#### `private Coord3f c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `private Matrix4f r = Matrix4f.id`
- Role: Holds the r state.
- Description: Backs the cached state for this file.

#### `private int seq = -1`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private Coord2d cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private double ca`
- Role: Stores the ca value.
- Description: Backs the cached state for this file.

#### `public final Coord2d[] points`
- Role: Stores the points value.
- Description: Backs the cached state for this file.

#### `private Coord3f c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `private Matrix4f r = Matrix4f.id`
- Role: Holds the r state.
- Description: Backs the cached state for this file.

#### `private int seq = -1`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private Coord2d cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private double ca`
- Role: Stores the ca value.
- Description: Backs the cached state for this file.

#### `public final Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `final Pipe.Op mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `private GobState curstate = null`
- Role: Stores the curstate value.
- Description: Backs the cached state for this file.

#### `private Waitable.Queue updwait = null`
- Role: Caches updwait entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final transient Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public final int updseq`
- Role: Stores the updseq value.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderTree.Slot> slots = new java.util.concurrent.CopyOnWriteArrayList<>()`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Placement cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `final Coord3f oc, rc`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `final Coord3f oc, rc`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `final Matrix4f rot`
- Role: Holds the rot state.
- Description: Backs the cached state for this file.

#### `Pipe.Op gndst = null`
- Role: Holds the gndst state.
- Description: Backs the cached state for this file.

#### `public final Placed placed = new Placed()`
- Role: Holds the placed state.
- Description: Backs the cached state for this file.

### Methods

#### `public Overlay(Gob gob, int id, Sprite.Mill<?> sm)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public Overlay(Gob gob, Sprite.Mill<?> sm)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public Overlay(Gob gob, int id, Indir<Resource> res, Message sdt)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public Overlay(Gob gob, Sprite spr)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `private void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private void add0()`
- Role: Performs add0.
- Description: Supports the add0 operation used by the surrounding class.

#### `private void remove0()`
- Role: Performs remove0.
- Description: Supports the remove0 operation used by the surrounding class.

#### `public void remove(boolean async)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `protected void removed()`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public default Pipe.Op gobstate()`
- Role: Performs gobstate.
- Description: Supports the gobstate operation used by the surrounding class.

#### `public default Pipe.Op placestate()`
- Role: Performs placestate.
- Description: Supports the placestate operation used by the surrounding class.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public DefaultPlace(MCache map, MCache.SurfaceID surf)`
- Role: Performs default place.
- Description: Supports the default place operation used by the surrounding class.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public InclinePlace(MCache map, MCache.SurfaceID surf)`
- Role: Performs incline place.
- Description: Supports the incline place operation used by the surrounding class.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] obst)`
- Role: Performs base place.
- Description: Supports the base place operation used by the surrounding class.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`
- Role: Performs base place.
- Description: Supports the base place operation used by the surrounding class.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res)`
- Role: Performs base place.
- Description: Supports the base place operation used by the surrounding class.

#### `private float getz(Coord2d rc, double ra)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points, Coord2d k)`
- Role: Performs line place.
- Description: Supports the line place operation used by the surrounding class.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, String id, Coord2d k)`
- Role: Performs line place.
- Description: Supports the line place operation used by the surrounding class.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, Coord2d k)`
- Role: Performs line place.
- Description: Supports the line place operation used by the surrounding class.

#### `private void recalc(Coord2d rc, double ra)`
- Role: Performs recalc.
- Description: Supports the recalc operation used by the surrounding class.

#### `private void check(Coord2d rc, double ra)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public static Coord2d[] flatten(Coord2d[][] points)`
- Role: Performs flatten.
- Description: Supports the flatten operation used by the surrounding class.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[] points)`
- Role: Performs plane place.
- Description: Supports the plane place operation used by the surrounding class.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points)`
- Role: Performs plane place.
- Description: Supports the plane place operation used by the surrounding class.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`
- Role: Performs plane place.
- Description: Supports the plane place operation used by the surrounding class.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res)`
- Role: Performs plane place.
- Description: Supports the plane place operation used by the surrounding class.

#### `private void recalc(Coord2d rc, double ra)`
- Role: Performs recalc.
- Description: Supports the recalc operation used by the surrounding class.

#### `private void check(Coord2d rc, double ra)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public Gob(Glob glob, Coord2d c, long id)`
- Role: Creates a new Gob instance.
- Description: Constructs the instance and initializes its default state.

#### `public Gob(Glob glob, Coord2d c)`
- Role: Creates a new Gob instance.
- Description: Constructs the instance and initializes its default state.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `void removed()`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `private void deferred()`
- Role: Performs deferred.
- Description: Supports the deferred operation used by the surrounding class.

#### `public void defer(Runnable task)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public static int olidcmp(int a, int b)`
- Role: Performs olidcmp.
- Description: Supports the olidcmp operation used by the surrounding class.

#### `public void addol(Overlay ol, boolean async)`
- Role: Performs addol.
- Description: Supports the addol operation used by the surrounding class.

#### `public void addol(Overlay ol)`
- Role: Performs addol.
- Description: Supports the addol operation used by the surrounding class.

#### `public void addol(Sprite ol)`
- Role: Performs addol.
- Description: Supports the addol operation used by the surrounding class.

#### `public void addol(Indir<Resource> res, Message sdt)`
- Role: Performs addol.
- Description: Supports the addol operation used by the surrounding class.

#### `public void addol(Sprite.Mill<?> ol)`
- Role: Performs addol.
- Description: Supports the addol operation used by the surrounding class.

#### `public <S extends Sprite> S addolsync(Sprite.Mill<S> sm)`
- Role: Performs addolsync.
- Description: Supports the addolsync operation used by the surrounding class.

#### `public Overlay findol(int id)`
- Role: Performs findol.
- Description: Supports the findol operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void move(Coord2d c, double a)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public Coord3f getrc()`
- Role: Performs getrc.
- Description: Supports the getrc operation used by the surrounding class.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Performs getmapstate.
- Description: Supports the getmapstate operation used by the surrounding class.

#### `private Class<? extends GAttrib> attrclass(Class<? extends GAttrib> cl)`
- Role: Performs attrclass.
- Description: Supports the attrclass operation used by the surrounding class.

#### `public <C extends GAttrib> C getattr(Class<C> c)`
- Role: Performs getattr.
- Description: Supports the getattr operation used by the surrounding class.

#### `private void setattr(Class<? extends GAttrib> ac, GAttrib a)`
- Role: Performs setattr.
- Description: Supports the setattr operation used by the surrounding class.

#### `public void setattr(GAttrib a)`
- Role: Performs setattr.
- Description: Supports the setattr operation used by the surrounding class.

#### `public void delattr(Class<? extends GAttrib> c)`
- Role: Performs delattr.
- Description: Supports the delattr operation used by the surrounding class.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public GobClick(Gob gob)`
- Role: Performs gob click.
- Description: Supports the gob click operation used by the surrounding class.

#### `public Object[] clickargs(ClickData cd)`
- Role: Performs clickargs.
- Description: Supports the clickargs operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `protected void obstate(Pipe buf)`
- Role: Performs obstate.
- Description: Supports the obstate operation used by the surrounding class.

#### `private GobState()`
- Role: Performs gob state.
- Description: Supports the gob state operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(GobState that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private GobState curstate()`
- Role: Performs curstate.
- Description: Supports the curstate operation used by the surrounding class.

#### `private void updstate()`
- Role: Performs updstate.
- Description: Supports the updstate operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `void updated()`
- Role: Performs updated.
- Description: Supports the updated operation used by the surrounding class.

#### `public void updwait(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs updwait.
- Description: Supports the updwait operation used by the surrounding class.

#### `public DataLoading(Gob gob, String message)`
- Role: Performs data loading.
- Description: Supports the data loading operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Exposes the requested value without mutating state.

#### `private Placed()`
- Role: Performs placed.
- Description: Supports the placed operation used by the surrounding class.

#### `Placement()`
- Role: Handles the placement workflow.
- Description: Supports the placement operation used by the surrounding class.

#### `public boolean equals(Placement that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Pipe.Op placement()`
- Role: Performs placement.
- Description: Supports the placement operation used by the surrounding class.

#### `public void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `private void update(Placement np)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Pipe.Op curplace()`
- Role: Performs curplace.
- Description: Supports the curplace operation used by the surrounding class.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Coord position()`
- Role: Returns the local player world position.
- Description: Returns the current world-space position of the local player.

#### `public double velocity()`
- Role: Returns the local player velocity.
- Description: Returns the local player movement speed.

#### `public int id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public boolean isDirectingEast()`
- Role: Checks whether the directing east.
- Description: Returns a boolean result for the described condition.

#### `public boolean isDirectingSouth()`
- Role: Checks whether the directing south.
- Description: Returns a boolean result for the described condition.

#### `public boolean isDirectingWest()`
- Role: Checks whether the directing west.
- Description: Returns a boolean result for the described condition.

#### `public boolean isDirectingNorth()`
- Role: Checks whether the directing north.
- Description: Returns a boolean result for the described condition.

#### `public Map<Class<? extends GAttrib>, GAttrib> attributeMap()`
- Role: Performs attribute map.
- Description: Supports the attribute map operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public String resourceName()`
- Role: Performs resource name.
- Description: Supports the resource name operation used by the surrounding class.

#### `public String resourceBasename()`
- Role: Performs resource basename.
- Description: Supports the resource basename operation used by the surrounding class.

#### `public boolean isResourceNameEndsWith(String suffix)`
- Role: Checks whether the resource name ends with.
- Description: Returns a boolean result for the described condition.

#### `public String buddyName()`
- Role: Performs buddy name.
- Description: Supports the buddy name operation used by the surrounding class.

#### `public Integer buddyGroup()`
- Role: Performs buddy group.
- Description: Supports the buddy group operation used by the surrounding class.

#### `public boolean isAt(Coord coord)`
- Role: Checks whether the at.
- Description: Returns a boolean result for the described condition.

#### `public boolean isAt(Coord2d coord)`
- Role: Checks whether the at.
- Description: Returns a boolean result for the described condition.

#### `public boolean isMoving()`
- Role: Checks whether the moving.
- Description: Returns a boolean result for the described condition.

#### `public boolean isStop()`
- Role: Checks whether the stop.
- Description: Returns a boolean result for the described condition.

#### `public double distance(Coord coord)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public double distance(Gob gob)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public String baseResName()`
- Role: Performs base res name.
- Description: Supports the base res name operation used by the surrounding class.

#### `public Stream<String> poseResNames()`
- Role: Performs pose res names.
- Description: Supports the pose res names operation used by the surrounding class.

#### `public Stream<String> equResNames()`
- Role: Performs equ res names.
- Description: Supports the equ res names operation used by the surrounding class.

#### `public Stream<String> modResNames()`
- Role: Performs mod res names.
- Description: Supports the mod res names operation used by the surrounding class.

#### `public Stream<String> resNames()`
- Role: Performs res names.
- Description: Supports the res names operation used by the surrounding class.

#### `public Stream<String> poseNames()`
- Role: Performs pose names.
- Description: Supports the pose names operation used by the surrounding class.

#### `public boolean hasPose(String pose)`
- Role: Checks whether the local player has the named pose.
- Description: Checks the active pose set before driving pose-dependent behavior.

#### `public Gob followingTarget()`
- Role: Performs following target.
- Description: Supports the following target operation used by the surrounding class.

#### `public boolean isFollowing(Gob gob)`
- Role: Checks whether the following.
- Description: Returns a boolean result for the described condition.

#### `public boolean isLifting()`
- Role: Checks whether the lifting.
- Description: Returns a boolean result for the described condition.

#### `public boolean isLifting(Gob gob)`
- Role: Checks whether the lifting.
- Description: Returns a boolean result for the described condition.

#### `public void waitMove(Coord destination)`
- Role: Performs wait move.
- Description: Supports the wait move operation used by the surrounding class.

#### `public void waitMove()`
- Role: Performs wait move.
- Description: Supports the wait move operation used by the surrounding class.

#### `public void waitBuild()`
- Role: Performs wait build.
- Description: Supports the wait build operation used by the surrounding class.

#### `public void waitLift(Gob gob)`
- Role: Performs wait lift.
- Description: Supports the wait lift operation used by the surrounding class.

#### `public void waitPut()`
- Role: Performs wait put.
- Description: Supports the wait put operation used by the surrounding class.

#### `public boolean isLog()`
- Role: Checks whether the log.
- Description: Returns a boolean result for the described condition.

#### `public boolean isTrunk()`
- Role: Checks whether the trunk.
- Description: Returns a boolean result for the described condition.

#### `public boolean isContainer()`
- Role: Checks whether the container.
- Description: Returns a boolean result for the described condition.

#### `public String debugDescription()`
- Role: Logs the description.
- Description: Logs the description for diagnostics and debugging.
