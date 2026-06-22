---
source: [Gob.java](../../../../src/haven/Gob.java)
created: 2026-06-13
updated: 2026-06-14
---

# Gob

Represents one world object, its attributes, overlays, and render-tree attachments.

## Nested Types

### BasePlace

- Role: Models a placement strategy for gob-local coordinates.
- Description: Placement strategy used to compute gob render position.

### DataLoading

- Role: Tracks gob data while resources are still loading.
- Description: Deferred loading state used until gob resources arrive.

### DefaultPlace

- Role: Provides the default placement strategy.
- Description: Fallback placement strategy for gobs without a special handler.

### GobClick

- Role: Carries gob interaction click data.
- Description: Click payload used when the player interacts with a gob.

### GobState

- Role: Captures the gob state passed through placement logic.
- Description: Mutable state snapshot used by the gob update pipeline.

### InclinePlace

- Role: Models placement on an incline.
- Description: Placement strategy used when the gob sits on sloped terrain.

### LinePlace

- Role: Models placement along a line.
- Description: Placement strategy used for line-based gob attachment.

### Overlay

- Role: Represents one gob overlay attachment.
- Description: Overlay record attached to the gob render tree.

### Placed

- Role: Marks a gob as placed in the world.
- Description: Placement state used after the gob has been attached.

### Placement

- Role: Collects placement data for a gob.
- Description: Shared placement data used by gob placement helpers.

### Placer

- Role: Builds placement data for a gob.
- Description: Factory used to create placement helpers for gobs.

### Placing

- Role: Tracks placement in progress.
- Description: Temporary placement state used while building gob placement.

### PlanePlace

- Role: Models placement on a plane.
- Description: Placement strategy used for flat-surface gob attachment.

### SetupMod

- Role: Wraps a modifier applied during gob setup.
- Description: Modifier wrapper used when building gob setup data.

## Members

### Constants

#### `private static final ClassResolver<Overlay> ctxr = new ClassResolver<Overlay>()`
- Role: Resolves overlay owner context.
- Description: Context resolver used by gob overlays.
- Value: `new ClassResolver<Overlay>()`

#### `private static final ClassResolver<Gob> ctxr = new ClassResolver<Gob>()`
- Role: Resolves gob owner context.
- Description: Context resolver used by gob-attached systems.
- Value: `new ClassResolver<Gob>()`

### Fields

#### `public Coord2d rc`
- Role: Stores the gob world coordinate.
- Description: World coordinate of the gob.

#### `public double a`
- Role: Stores the gob angle.
- Description: World-space facing angle in radians.

#### `public boolean virtual = false`
- Role: Tracks virtual status.
- Description: Whether this gob exists only as a client-side placeholder.

#### `int clprio = 0`
- Role: Keeps the clprio state.
- Description: Client-side priority used while ordering gob updates.

#### `public long id`
- Role: Keeps the id state.
- Description: Server-issued gob id.

#### `public boolean removed = false`
- Role: Tracks whether removed is enabled.
- Description: Whether the gob has been removed from the world.

#### `public final Glob glob`
- Role: Keeps the glob state.
- Description: Owning global world state.

#### `Map<Class<? extends GAttrib>, GAttrib> attr = new HashMap<Class<? extends GAttrib>, GAttrib>()`
- Role: Caches the attr lookup results.
- Description: Caches the computed value for repeated access.

#### `public final Collection<Overlay> ols = new ArrayList<Overlay>()`
- Role: Caches the ols lookup results.
- Description: Caches the computed value for repeated access.

#### `public final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches the slots lookup results.
- Description: Caches the computed value for repeated access.

#### `public int updateseq = 0, lastolid = 0`
- Role: Keeps the updateseq state.
- Description: Sequence counter used to detect gob updates.

#### `public int updateseq = 0, lastolid = 0`
- Role: Keeps the updateseq state.
- Description: Sequence counter used to detect gob updates.

#### `private final Collection<SetupMod> setupmods = new ArrayList<>()`
- Role: Caches the setupmods lookup results.
- Description: Caches the computed value for repeated access.

#### `private final LinkedList<Runnable> deferred = new LinkedList<>()`
- Role: Caches the deferred lookup results.
- Description: Caches the computed value for repeated access.

#### `private Loader.Future<?> deferral = null`
- Role: Keeps the deferral state.
- Description: Active future tracking deferred gob work.

#### `public final int id`
- Role: Keeps the id state.
- Description: Server-issued gob id.

#### `public final Gob gob`
- Role: Keeps the gob state.
- Description: Stores the gob state used by this component.

#### `public final Sprite.Mill<?> sm`
- Role: Keeps the sm state.
- Description: Sprite mill used to construct gob sprites.

#### `public Sprite spr`
- Role: Keeps the spr state.
- Description: Active sprite instance attached to the gob.

#### `public boolean delign = false, old = false`
- Role: Tracks whether delign is enabled.
- Description: Lifecycle flag used while cleaning up or reusing gob state.

#### `public boolean delign = false, old = false`
- Role: Tracks whether delign is enabled.
- Description: Lifecycle flag used while cleaning up or reusing gob state.

#### `private Collection<RenderTree.Slot> slots = null`
- Role: Caches the slots lookup results.
- Description: Render-tree slots currently attached to the gob.

#### `private boolean added = false`
- Role: Tracks whether added is enabled.
- Description: Whether the gob has been attached to the world.

#### `public final MCache map`
- Role: Caches the map lookup results.
- Description: Map cache reference used for gob placement.

#### `public final MCache.SurfaceID surf`
- Role: Caches the surf lookup results.
- Description: Cached surface id used for gob placement.

#### `public final Coord2d[][] obst`
- Role: Keeps the obst state.
- Description: Obstacle polygon data used for collision checks.

#### `private Coord2d cc`
- Role: Keeps the cc state.
- Description: Local coordinate on the current grid.

#### `private double ca`
- Role: Keeps the ca state.
- Description: Local facing angle used for placement.

#### `private int seq = -1`
- Role: Keeps the seq state.
- Description: Update sequence marker for the gob.

#### `private float z`
- Role: Keeps the z state.
- Description: Vertical render offset for the gob.

#### `public final double max, min`
- Role: Keeps the min state.
- Description: Bound used while computing obstacle or placement extents.

#### `public final double max, min`
- Role: Keeps the min state.
- Description: Bound used while computing obstacle or placement extents.

#### `public final Coord2d k`
- Role: Keeps the k state.
- Description: World-space key coordinate used by placement logic.

#### `private Coord3f c`
- Role: Keeps the c state.
- Description: 3D coordinate used by the render transform.

#### `private Matrix4f r = Matrix4f.id`
- Role: Keeps the r state.
- Description: Cached transform matrix used for rendering.

#### `private int seq = -1`
- Role: Keeps the seq state.
- Description: Update sequence marker for the gob.

#### `private Coord2d cc`
- Role: Keeps the cc state.
- Description: Local coordinate on the current grid.

#### `private double ca`
- Role: Keeps the ca state.
- Description: Local facing angle used for placement.

#### `public final Coord2d[] points`
- Role: Keeps the points state.
- Description: Polygon points used by placement or collision logic.

#### `private Coord3f c`
- Role: Keeps the c state.
- Description: 3D coordinate used by the render transform.

#### `private Matrix4f r = Matrix4f.id`
- Role: Keeps the r state.
- Description: Cached transform matrix used for rendering.

#### `private int seq = -1`
- Role: Keeps the seq state.
- Description: Update sequence marker for the gob.

#### `private Coord2d cc`
- Role: Keeps the cc state.
- Description: Local coordinate on the current grid.

#### `private double ca`
- Role: Keeps the ca state.
- Description: Local facing angle used for placement.

#### `public final Gob gob`
- Role: Keeps the gob state.
- Description: Stores the gob state used by this component.

#### `final Pipe.Op mods`
- Role: Keeps the mods state.
- Description: Stores the mods state used by this component.

#### `private GobState curstate = null`
- Role: Keeps the curstate state.
- Description: Stores the curstate state used by this component.

#### `private Waitable.Queue updwait = null`
- Role: Caches the updwait lookup results.
- Description: Caches the computed value for repeated access.

#### `public final transient Gob gob`
- Role: Keeps the gob state.
- Description: Stores the gob state used by this component.

#### `public final int updseq`
- Role: Keeps the updseq state.
- Description: Stores the updseq state used by this component.

#### `private final Collection<RenderTree.Slot> slots = new java.util.concurrent.CopyOnWriteArrayList<>()`
- Role: Caches the slots lookup results.
- Description: Caches the computed value for repeated access.

#### `private Placement cur`
- Role: Keeps the cur state.
- Description: Stores the current value state used by this component.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Keeps the mods state.
- Description: Stores the mods state used by this component.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Keeps the mods state.
- Description: Stores the mods state used by this component.

#### `final Pipe.Op flw, tilestate, mods`
- Role: Keeps the mods state.
- Description: Stores the mods state used by this component.

#### `final Coord3f oc, rc`
- Role: Keeps the rc state.
- Description: World coordinate of the gob.

#### `final Coord3f oc, rc`
- Role: Keeps the rc state.
- Description: World coordinate of the gob.

#### `final Matrix4f rot`
- Role: Keeps the rot state.
- Description: Stores the rot state used by this component.

#### `Pipe.Op gndst = null`
- Role: Keeps the gndst state.
- Description: Stores the gndst state used by this component.

#### `public final Placed placed = new Placed()`
- Role: Keeps the placed state.
- Description: Stores the placed state used by this component.

### Methods

#### `public Overlay(Gob gob, int id, Sprite.Mill<?> sm)`
- Role: Implements the overlay operation.
- Description: Implements the overlay operation.

#### `public Overlay(Gob gob, Sprite.Mill<?> sm)`
- Role: Implements the overlay operation.
- Description: Implements the overlay operation.

#### `public Overlay(Gob gob, int id, Indir<Resource> res, Message sdt)`
- Role: Implements the overlay operation.
- Description: Implements the overlay operation.

#### `public Overlay(Gob gob, Sprite spr)`
- Role: Implements the overlay operation.
- Description: Implements the overlay operation.

#### `private void init()`
- Role: Initializes the class-local cache or runtime state.
- Description: Initializes the class-local cache or runtime state.

#### `private void add0()`
- Role: Adds the 0.
- Description: Adds the 0.

#### `private void remove0()`
- Role: Removes the 0.
- Description: Removes the 0.

#### `public void remove(boolean async)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `protected void removed()`
- Role: Removes the d.
- Description: Removes the d.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void added(RenderTree.Slot slot)`
- Role: Adds the ed.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Removes the d.
- Description: Removes the d.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Returns the cached value without mutating the gob.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public default Pipe.Op gobstate()`
- Role: Implements the gobstate operation.
- Description: Implements the gobstate operation.

#### `public default Pipe.Op placestate()`
- Role: Implements the placestate operation.
- Description: Implements the placestate operation.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Returns the c.
- Description: Returns the c.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Returns the r.
- Description: Returns the r.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public DefaultPlace(MCache map, MCache.SurfaceID surf)`
- Role: Implements the default place operation.
- Description: Implements the default place operation.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Returns the c.
- Description: Returns the c.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Returns the r.
- Description: Returns the r.

#### `public InclinePlace(MCache map, MCache.SurfaceID surf)`
- Role: Implements the incline place operation.
- Description: Implements the incline place operation.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Returns the r.
- Description: Returns the r.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] obst)`
- Role: Implements the base place operation.
- Description: Implements the base place operation.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`
- Role: Implements the base place operation.
- Description: Implements the base place operation.

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res)`
- Role: Implements the base place operation.
- Description: Implements the base place operation.

#### `private float getz(Coord2d rc, double ra)`
- Role: Returns the z.
- Description: Returns the z.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Returns the c.
- Description: Returns the c.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points, Coord2d k)`
- Role: Implements the line place operation.
- Description: Implements the line place operation.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, String id, Coord2d k)`
- Role: Implements the line place operation.
- Description: Implements the line place operation.

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, Coord2d k)`
- Role: Implements the line place operation.
- Description: Implements the line place operation.

#### `private void recalc(Coord2d rc, double ra)`
- Role: Implements the recalc operation.
- Description: Implements the recalc operation.

#### `private void check(Coord2d rc, double ra)`
- Role: Implements the check operation.
- Description: Implements the check operation.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Returns the c.
- Description: Returns the c.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Returns the r.
- Description: Returns the r.

#### `public static Coord2d[] flatten(Coord2d[][] points)`
- Role: Implements the flatten operation.
- Description: Implements the flatten operation.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[] points)`
- Role: Implements the plane place operation.
- Description: Implements the plane place operation.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points)`
- Role: Implements the plane place operation.
- Description: Implements the plane place operation.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`
- Role: Implements the plane place operation.
- Description: Implements the plane place operation.

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res)`
- Role: Implements the plane place operation.
- Description: Implements the plane place operation.

#### `private void recalc(Coord2d rc, double ra)`
- Role: Implements the recalc operation.
- Description: Implements the recalc operation.

#### `private void check(Coord2d rc, double ra)`
- Role: Implements the check operation.
- Description: Implements the check operation.

#### `public Coord3f getc(Coord2d rc, double ra)`
- Role: Returns the c.
- Description: Returns the c.

#### `public Matrix4f getr(Coord2d rc, double ra)`
- Role: Returns the r.
- Description: Returns the r.

#### `public Gob(Glob glob, Coord2d c, long id)`
- Role: Creates a new Gob instance.
- Description: Constructs the Gob instance from the supplied inputs.

#### `public Gob(Glob glob, Coord2d c)`
- Role: Creates a new Gob instance.
- Description: Constructs the Gob instance from the supplied inputs.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `void removed()`
- Role: Removes the d.
- Description: Removes the d.

#### `private void deferred()`
- Role: Implements the deferred operation.
- Description: Implements the deferred operation.

#### `public void defer(Runnable task)`
- Role: Implements the defer operation.
- Description: Implements the defer operation.

#### `public static int olidcmp(int a, int b)`
- Role: Implements the olidcmp operation.
- Description: Implements the olidcmp operation.

#### `public void addol(Overlay ol, boolean async)`
- Role: Adds the ol.
- Description: Adds the ol.

#### `public void addol(Overlay ol)`
- Role: Adds the ol.
- Description: Adds the ol.

#### `public void addol(Sprite ol)`
- Role: Adds the ol.
- Description: Adds the ol.

#### `public void addol(Indir<Resource> res, Message sdt)`
- Role: Adds the ol.
- Description: Adds the ol.

#### `public void addol(Sprite.Mill<?> ol)`
- Role: Adds the ol.
- Description: Adds the ol.

#### `public <S extends Sprite> S addolsync(Sprite.Mill<S> sm)`
- Role: Adds the olsync.
- Description: Adds the olsync.

#### `public Overlay findol(int id)`
- Role: Finds the ol.
- Description: Finds the ol.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void move(Coord2d c, double a)`
- Role: Moves the current state.
- Description: Handles the move flow for this type.

#### `public Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public Coord3f getc()`
- Role: Returns the c.
- Description: Returns the c.

#### `public Coord3f getrc()`
- Role: Returns the rc.
- Description: Returns the rc.

#### `protected Pipe.Op getmapstate(Coord3f pc)`
- Role: Returns the mapstate.
- Description: Returns the mapstate.

#### `private Class<? extends GAttrib> attrclass(Class<? extends GAttrib> cl)`
- Role: Implements the attrclass operation.
- Description: Implements the attrclass operation.

#### `public <C extends GAttrib> C getattr(Class<C> c)`
- Role: Returns the attr.
- Description: Returns the attr.

#### `private void setattr(Class<? extends GAttrib> ac, GAttrib a)`
- Role: Updates the attr.
- Description: Updates the attr.

#### `public void setattr(GAttrib a)`
- Role: Updates the attr.
- Description: Updates the attr.

#### `public void delattr(Class<? extends GAttrib> c)`
- Role: Implements the delattr operation.
- Description: Implements the delattr operation.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Implements the eqpoint operation.
- Description: Implements the eqpoint operation.

#### `public GobClick(Gob gob)`
- Role: Implements the gob click operation.
- Description: Implements the gob click operation.

#### `public Object[] clickargs(ClickData cd)`
- Role: Handles args interaction.
- Description: Handles args interaction.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Gob for debugging and logging.

#### `protected void obstate(Pipe buf)`
- Role: Implements the obstate operation.
- Description: Implements the obstate operation.

#### `private GobState()`
- Role: Implements the gob state operation.
- Description: Implements the gob state operation.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean equals(GobState that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `private GobState curstate()`
- Role: Implements the curstate operation.
- Description: Implements the curstate operation.

#### `private void updstate()`
- Role: Implements the updstate operation.
- Description: Implements the updstate operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Adds the ed.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Removes the d.
- Description: Removes the d.

#### `void updated()`
- Role: Updates the d.
- Description: Updates the d.

#### `public void updwait(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Implements the updwait operation.
- Description: Implements the updwait operation.

#### `public DataLoading(Gob gob, String message)`
- Role: Implements the data loading operation.
- Description: Implements the data loading operation.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Returns the cached value without mutating the gob.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Returns the cached value without mutating the gob.

#### `private Placed()`
- Role: Implements the placed operation.
- Description: Implements the placed operation.

#### `Placement()`
- Role: Handles the placement workflow.
- Description: Handles the placement flow for this type.

#### `public boolean equals(Placement that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public Pipe.Op placement()`
- Role: Implements the placement operation.
- Description: Implements the placement operation.

#### `public void autotick(double dt)`
- Role: Implements the autotick operation.
- Description: Implements the autotick operation.

#### `private void update(Placement np)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void added(RenderTree.Slot slot)`
- Role: Adds the ed.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Removes the d.
- Description: Removes the d.

#### `public Pipe.Op curplace()`
- Role: Implements the curplace operation.
- Description: Implements the curplace operation.

#### `public Coord3f getc()`
- Role: Returns the c.
- Description: Returns the c.

#### `public TickList.Ticking ticker()`
- Role: Advances the er state.
- Description: Advances the er state.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Gob for debugging and logging.

#### `public Coord position()`
- Role: Returns the local player world position.
- Description: Returns the current world-space position tracked for this gob.

#### `public double velocity()`
- Role: Returns the local player velocity.
- Description: Returns the local player movement speed.

#### `public int id()`
- Role: Implements the id operation.
- Description: Implements the id operation.

#### `public boolean isDirectingEast()`
- Role: Checks whether the directing east.
- Description: Returns whether the condition is satisfied.

#### `public boolean isDirectingSouth()`
- Role: Checks whether the directing south.
- Description: Returns whether the condition is satisfied.

#### `public boolean isDirectingWest()`
- Role: Checks whether the directing west.
- Description: Returns whether the condition is satisfied.

#### `public boolean isDirectingNorth()`
- Role: Checks whether the directing north.
- Description: Returns whether the condition is satisfied.

#### `public Map<Class<? extends GAttrib>, GAttrib> attributeMap()`
- Role: Implements the attribute map operation.
- Description: Implements the attribute map operation.

#### `public Resource resource()`
- Role: Implements the resource operation.
- Description: Implements the resource operation.

#### `public String resourceName()`
- Role: Implements the resource name operation.
- Description: Implements the resource name operation.

#### `public String resourceBasename()`
- Role: Implements the resource basename operation.
- Description: Implements the resource basename operation.

#### `public boolean isResourceNameEndsWith(String suffix)`
- Role: Checks whether the resource name ends with.
- Description: Returns whether the condition is satisfied.

#### `public String buddyName()`
- Role: Implements the buddy name operation.
- Description: Implements the buddy name operation.

#### `public Integer buddyGroup()`
- Role: Implements the buddy group operation.
- Description: Implements the buddy group operation.

#### `public boolean isAt(Coord coord)`
- Role: Checks whether the at.
- Description: Returns whether the condition is satisfied.

#### `public boolean isAt(Coord2d coord)`
- Role: Checks whether the at.
- Description: Returns whether the condition is satisfied.

#### `public boolean isMoving()`
- Role: Checks whether the moving.
- Description: Returns whether the condition is satisfied.

#### `public boolean isStop()`
- Role: Checks whether the stop.
- Description: Returns whether the condition is satisfied.

#### `public double distance(Coord coord)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public double distance(Gob gob)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public String baseResName()`
- Role: Implements the base res name operation.
- Description: Implements the base res name operation.

#### `public Stream<String> poseResNames()`
- Role: Implements the pose res names operation.
- Description: Implements the pose res names operation.

#### `public Stream<String> equResNames()`
- Role: Implements the equ res names operation.
- Description: Implements the equ res names operation.

#### `public Stream<String> modResNames()`
- Role: Implements the mod res names operation.
- Description: Implements the mod res names operation.

#### `public Stream<String> resNames()`
- Role: Implements the res names operation.
- Description: Implements the res names operation.

#### `public Stream<String> poseNames()`
- Role: Implements the pose names operation.
- Description: Implements the pose names operation.

#### `public boolean hasPose(String pose)`
- Role: Checks whether the local player has the named pose.
- Description: Checks the active pose set before driving pose-dependent behavior.

#### `public Gob followingTarget()`
- Role: Follows the ing target.
- Description: Follows the ing target.

#### `public boolean isFollowing(Gob gob)`
- Role: Checks whether the following.
- Description: Returns whether the condition is satisfied.

#### `public boolean isLifting()`
- Role: Checks whether the lifting.
- Description: Returns whether the condition is satisfied.

#### `public boolean isLifting(Gob gob)`
- Role: Checks whether the lifting.
- Description: Returns whether the condition is satisfied.

#### `public void waitMove(Coord destination)`
- Role: Implements the wait move operation.
- Description: Implements the wait move operation.

#### `public void waitMove()`
- Role: Implements the wait move operation.
- Description: Implements the wait move operation.

#### `public void waitBuild()`
- Role: Implements the wait build operation.
- Description: Implements the wait build operation.

#### `public void waitLift(Gob gob)`
- Role: Implements the wait lift operation.
- Description: Implements the wait lift operation.

#### `public void waitPut()`
- Role: Implements the wait put operation.
- Description: Implements the wait put operation.

#### `public boolean isLog()`
- Role: Checks whether the log.
- Description: Returns whether the condition is satisfied.

#### `public boolean isTrunk()`
- Role: Checks whether the trunk.
- Description: Returns whether the condition is satisfied.

#### `public boolean isContainer()`
- Role: Checks whether the container.
- Description: Returns whether the condition is satisfied.

#### `public String debugDescription()`
- Role: Logs the description.
- Description: Logs the description for diagnostics and debugging.