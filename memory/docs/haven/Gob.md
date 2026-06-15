# Gob

This file documents the responsibilities and members of `Gob`.

## Meta

- Source: [Gob.java](../../../src/haven/Gob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an object in the world.

## Nested Types

### BasePlace

- Description: TODO

### DataLoading

- Description: TODO

### DefaultPlace

- Description: TODO

### GobClick

- Description: TODO

### GobState

- Description: TODO

### InclinePlace

- Description: TODO

### LinePlace

- Description: TODO

### Overlay

- Description: TODO

### Placed

- Description: TODO

### Placement

- Description: TODO

### Placer

- Description: TODO

### Placing

- Description: TODO

### PlanePlace

- Description: TODO

### SetupMod

- Description: TODO

## Members

### Constants

#### `private static final ClassResolver<Overlay> ctxr = new ClassResolver<Overlay>()`

- Description: TODO

#### `private static final ClassResolver<Gob> ctxr = new ClassResolver<Gob>()`

- Description: TODO

### Fields

#### `public Coord2d rc`

- Description: TODO

#### `public double a`

- Description: TODO

#### `public boolean virtual = false`

- Description: TODO

#### `int clprio = 0`

- Description: TODO

#### `public long id`

- Description: TODO

#### `public boolean removed = false`

- Description: TODO

#### `public final Glob glob`

- Description: TODO

#### `Map<Class<? extends GAttrib>, GAttrib> attr = new HashMap<Class<? extends GAttrib>, GAttrib>()`

- Description: TODO

#### `public final Collection<Overlay> ols = new ArrayList<Overlay>()`

- Description: TODO

#### `public final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `public int updateseq = 0, lastolid = 0`

- Description: TODO

#### `public int updateseq = 0, lastolid = 0`

- Description: TODO

#### `private final Collection<SetupMod> setupmods = new ArrayList<>()`

- Description: TODO

#### `private final LinkedList<Runnable> deferred = new LinkedList<>()`

- Description: TODO

#### `private Loader.Future<?> deferral = null`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Gob gob`

- Description: TODO

#### `public final Sprite.Mill<?> sm`

- Description: TODO

#### `public Sprite spr`

- Description: TODO

#### `public boolean delign = false, old = false`

- Description: TODO

#### `public boolean delign = false, old = false`

- Description: TODO

#### `private Collection<RenderTree.Slot> slots = null`

- Description: TODO

#### `private boolean added = false`

- Description: TODO

#### `public final MCache map`

- Description: TODO

#### `public final MCache.SurfaceID surf`

- Description: TODO

#### `public final Coord2d[][] obst`

- Description: TODO

#### `private Coord2d cc`

- Description: TODO

#### `private double ca`

- Description: TODO

#### `private int seq = -1`

- Description: TODO

#### `private float z`

- Description: TODO

#### `public final double max, min`

- Description: TODO

#### `public final double max, min`

- Description: TODO

#### `public final Coord2d k`

- Description: TODO

#### `private Coord3f c`

- Description: TODO

#### `private Matrix4f r = Matrix4f.id`

- Description: TODO

#### `private int seq = -1`

- Description: TODO

#### `private Coord2d cc`

- Description: TODO

#### `private double ca`

- Description: TODO

#### `public final Coord2d[] points`

- Description: TODO

#### `private Coord3f c`

- Description: TODO

#### `private Matrix4f r = Matrix4f.id`

- Description: TODO

#### `private int seq = -1`

- Description: TODO

#### `private Coord2d cc`

- Description: TODO

#### `private double ca`

- Description: TODO

#### `public final Gob gob`

- Description: TODO

#### `final Pipe.Op mods`

- Description: TODO

#### `private GobState curstate = null`

- Description: TODO

#### `private Waitable.Queue updwait = null`

- Description: TODO

#### `public final transient Gob gob`

- Description: TODO

#### `public final int updseq`

- Description: TODO

#### `private final Collection<RenderTree.Slot> slots = new java.util.concurrent.CopyOnWriteArrayList<>()`

- Description: TODO

#### `private Placement cur`

- Description: TODO

#### `final Pipe.Op flw, tilestate, mods`

- Description: TODO

#### `final Pipe.Op flw, tilestate, mods`

- Description: TODO

#### `final Pipe.Op flw, tilestate, mods`

- Description: TODO

#### `final Coord3f oc, rc`

- Description: TODO

#### `final Coord3f oc, rc`

- Description: TODO

#### `final Matrix4f rot`

- Description: TODO

#### `Pipe.Op gndst = null`

- Description: TODO

#### `public final Placed placed = new Placed()`

- Description: TODO

### Methods

#### `public Overlay(Gob gob, int id, Sprite.Mill<?> sm)`

- Description: TODO

#### `public Overlay(Gob gob, Sprite.Mill<?> sm)`

- Description: TODO

#### `public Overlay(Gob gob, int id, Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public Overlay(Gob gob, Sprite spr)`

- Description: TODO

#### `private void init()`

- Description: TODO

#### `private void add0()`

- Description: TODO

#### `private void remove0()`

- Description: TODO

#### `public void remove(boolean async)`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `protected void removed()`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public default Pipe.Op gobstate()`

- Description: TODO

#### `public default Pipe.Op placestate()`

- Description: TODO

#### `public Coord3f getc(Coord2d rc, double ra)`

- Description: TODO

#### `public Matrix4f getr(Coord2d rc, double ra)`

- Description: TODO

#### `public Placer placer()`

- Description: TODO

#### `public DefaultPlace(MCache map, MCache.SurfaceID surf)`

- Description: TODO

#### `public Coord3f getc(Coord2d rc, double ra)`

- Description: TODO

#### `public Matrix4f getr(Coord2d rc, double ra)`

- Description: TODO

#### `public InclinePlace(MCache map, MCache.SurfaceID surf)`

- Description: TODO

#### `public Matrix4f getr(Coord2d rc, double ra)`

- Description: TODO

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] obst)`

- Description: TODO

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`

- Description: TODO

#### `public BasePlace(MCache map, MCache.SurfaceID surf, Resource res)`

- Description: TODO

#### `private float getz(Coord2d rc, double ra)`

- Description: TODO

#### `public Coord3f getc(Coord2d rc, double ra)`

- Description: TODO

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points, Coord2d k)`

- Description: TODO

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, String id, Coord2d k)`

- Description: TODO

#### `public LinePlace(MCache map, MCache.SurfaceID surf, Resource res, Coord2d k)`

- Description: TODO

#### `private void recalc(Coord2d rc, double ra)`

- Description: TODO

#### `private void check(Coord2d rc, double ra)`

- Description: TODO

#### `public Coord3f getc(Coord2d rc, double ra)`

- Description: TODO

#### `public Matrix4f getr(Coord2d rc, double ra)`

- Description: TODO

#### `public static Coord2d[] flatten(Coord2d[][] points)`

- Description: TODO

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[] points)`

- Description: TODO

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points)`

- Description: TODO

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`

- Description: TODO

#### `public PlanePlace(MCache map, MCache.SurfaceID surf, Resource res)`

- Description: TODO

#### `private void recalc(Coord2d rc, double ra)`

- Description: TODO

#### `private void check(Coord2d rc, double ra)`

- Description: TODO

#### `public Coord3f getc(Coord2d rc, double ra)`

- Description: TODO

#### `public Matrix4f getr(Coord2d rc, double ra)`

- Description: TODO

#### `public Gob(Glob glob, Coord2d c, long id)`

- Description: TODO

#### `public Gob(Glob glob, Coord2d c)`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `void removed()`

- Description: TODO

#### `private void deferred()`

- Description: TODO

#### `public void defer(Runnable task)`

- Description: TODO

#### `public static int olidcmp(int a, int b)`

- Description: TODO

#### `public void addol(Overlay ol, boolean async)`

- Description: TODO

#### `public void addol(Overlay ol)`

- Description: TODO

#### `public void addol(Sprite ol)`

- Description: TODO

#### `public void addol(Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public void addol(Sprite.Mill<?> ol)`

- Description: TODO

#### `public <S extends Sprite> S addolsync(Sprite.Mill<S> sm)`

- Description: TODO

#### `public Overlay findol(int id)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void move(Coord2d c, double a)`

- Description: TODO

#### `public Placer placer()`

- Description: TODO

#### `public Coord3f getc()`

- Description: TODO

#### `public Coord3f getrc()`

- Description: TODO

#### `protected Pipe.Op getmapstate(Coord3f pc)`

- Description: TODO

#### `private Class<? extends GAttrib> attrclass(Class<? extends GAttrib> cl)`

- Description: TODO

#### `public <C extends GAttrib> C getattr(Class<C> c)`

- Description: TODO

#### `private void setattr(Class<? extends GAttrib> ac, GAttrib a)`

- Description: TODO

#### `public void setattr(GAttrib a)`

- Description: TODO

#### `public void delattr(Class<? extends GAttrib> c)`

- Description: TODO

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public GobClick(Gob gob)`

- Description: TODO

#### `public Object[] clickargs(ClickData cd)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `protected void obstate(Pipe buf)`

- Description: TODO

#### `private GobState()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public boolean equals(GobState that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `private GobState curstate()`

- Description: TODO

#### `private void updstate()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `void updated()`

- Description: TODO

#### `public void updwait(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public DataLoading(Gob gob, String message)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `public Collection<Location.Chain> getloc()`

- Description: TODO

#### `private Placed()`

- Description: TODO

#### `Placement()`

- Description: TODO

#### `public boolean equals(Placement that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public Pipe.Op placement()`

- Description: TODO

#### `public void autotick(double dt)`

- Description: TODO

#### `private void update(Placement np)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public Pipe.Op curplace()`

- Description: TODO

#### `public Coord3f getc()`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Coord position()`

- Description: TODO

#### `public double velocity()`

- Description: TODO

#### `public int id()`

- Description: TODO

#### `public boolean isDirectingEast()`

- Description: TODO

#### `public boolean isDirectingSouth()`

- Description: TODO

#### `public boolean isDirectingWest()`

- Description: TODO

#### `public boolean isDirectingNorth()`

- Description: TODO

#### `public Map<Class<? extends GAttrib>, GAttrib> attributeMap()`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public String resourceName()`

- Description: TODO

#### `public String resourceBasename()`

- Description: TODO

#### `public boolean isResourceNameEndsWith(String suffix)`

- Description: TODO

#### `public String buddyName()`

- Description: TODO

#### `public Integer buddyGroup()`

- Description: TODO

#### `public boolean isAt(Coord coord)`

- Description: TODO

#### `public boolean isAt(Coord2d coord)`

- Description: TODO

#### `public boolean isMoving()`

- Description: TODO

#### `public boolean isStop()`

- Description: TODO

#### `public double distance(Coord coord)`

- Description: TODO

#### `public double distance(Gob gob)`

- Description: TODO

#### `public String baseResName()`

- Description: TODO

#### `public Stream<String> poseResNames()`

- Description: TODO

#### `public Stream<String> equResNames()`

- Description: TODO

#### `public Stream<String> modResNames()`

- Description: TODO

#### `public Stream<String> resNames()`

- Description: TODO

#### `public Stream<String> poseNames()`

- Description: TODO

#### `public boolean hasPose(String pose)`

- Description: TODO

#### `public Gob followingTarget()`

- Description: TODO

#### `public boolean isFollowing(Gob gob)`

- Description: TODO

#### `public boolean isLifting()`

- Description: TODO

#### `public boolean isLifting(Gob gob)`

- Description: TODO

#### `public void waitMove(Coord destination)`

- Description: TODO

#### `public void waitMove()`

- Description: TODO

#### `public void waitBuild()`

- Description: TODO

#### `public void waitLift(Gob gob)`

- Description: TODO

#### `public void waitPut()`

- Description: TODO

#### `public boolean isLog()`

- Description: TODO

#### `public boolean isTrunk()`

- Description: TODO

#### `public boolean isContainer()`

- Description: TODO

#### `public String debugDescription()`

- Description: TODO
