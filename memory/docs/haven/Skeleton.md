# Skeleton

This file documents the responsibilities and members of `Skeleton`.

## Meta

- Source: [Skeleton.java](../../../src/haven/Skeleton.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents skeleton data.

## Nested Types

### Bone

- Description: TODO

### BoneAlign

- Description: TODO

### BoneOffset

- Description: TODO

### CombinedMod

- Description: TODO

### Debug

- Description: TODO

### Event

- Description: TODO

### EventListener

- Description: TODO

### Frame

- Description: TODO

### FxOverlay

- Description: TODO

### FxTrack

- Description: TODO

### MkOverlay

- Description: TODO

### ModFactory

- Description: TODO

### ModOwner

- Description: TODO

### Pose

- Description: TODO

### PoseMod

- Description: TODO

### Res

- Description: TODO

### ResMod

- Description: TODO

### ResPose

- Description: TODO

### ResourceSkeleton

- Description: TODO

### RmOverlay

- Description: TODO

### SpawnSprite

- Description: TODO

### Tick

- Description: TODO

### Track

- Description: TODO

### TrackMod

- Description: TODO

### Trigger

- Description: TODO

## Members

### Constants

#### `public static final ModOwner nil = new ModOwner()`

- Description: TODO

#### `public static final ModFactory def = new ModFactory()`

- Description: TODO

#### `private static final BiFunction<Message, BoneOffset, Function<EquipTarget, Supplier<? extends Pipe.Op>>>[] opcodes = new BiFunction[256]`

- Description: TODO

### Fields

#### `public final Map<String, Bone> bones = new HashMap<String, Bone>()`

- Description: TODO

#### `public final Bone[] blist; /* Topologically sorted */`

- Description: TODO

#### `public final Pose bindpose`

- Description: TODO

#### `public String name`

- Description: TODO

#### `public Coord3f ipos, irax`

- Description: TODO

#### `public Coord3f ipos, irax`

- Description: TODO

#### `public float irang`

- Description: TODO

#### `public Bone parent`

- Description: TODO

#### `public int idx`

- Description: TODO

#### `public float[][] lpos, gpos`

- Description: TODO

#### `public float[][] lpos, gpos`

- Description: TODO

#### `public float[][] lrot, grot`

- Description: TODO

#### `public float[][] lrot, grot`

- Description: TODO

#### `private Pose from = null`

- Description: TODO

#### `public int seq = 0`

- Description: TODO

#### `private final Coord3f ref`

- Description: TODO

#### `private final int orig, tgt`

- Description: TODO

#### `private final int orig, tgt`

- Description: TODO

#### `private Location cur`

- Description: TODO

#### `private int cseq = -1`

- Description: TODO

#### `private final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`

- Description: TODO

#### `private final VertexArray.Buffer data`

- Description: TODO

#### `private final Model model`

- Description: TODO

#### `private final int[] bperm`

- Description: TODO

#### `public final ModOwner owner`

- Description: TODO

#### `public float[][] lpos, lrot`

- Description: TODO

#### `public float[][] lpos, lrot`

- Description: TODO

#### `protected final Collection<FxTrack.EventListener> cbl = new ArrayList<FxTrack.EventListener>(0)`

- Description: TODO

#### `private final PoseMod[] mods`

- Description: TODO

#### `private final boolean stat`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final transient Skeleton s`

- Description: TODO

#### `public final Track[] tracks`

- Description: TODO

#### `public final FxTrack[] effects`

- Description: TODO

#### `public final float len`

- Description: TODO

#### `public final WrapMode mode`

- Description: TODO

#### `private final boolean stat`

- Description: TODO

#### `private boolean done`

- Description: TODO

#### `public float time = 0.0f`

- Description: TODO

#### `public float scale = 1.0f`

- Description: TODO

#### `protected boolean speedmod = false`

- Description: TODO

#### `protected double nspeed = 0.0`

- Description: TODO

#### `private boolean back = false`

- Description: TODO

#### `public final String bone`

- Description: TODO

#### `public final Frame[] frames`

- Description: TODO

#### `public final float time`

- Description: TODO

#### `public final float[] trans, rot`

- Description: TODO

#### `public final float[] trans, rot`

- Description: TODO

#### `public final Event[] events`

- Description: TODO

#### `public final float time`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final byte[] sdt`

- Description: TODO

#### `public final Function<ModOwner, Pipe.Op> loc`

- Description: TODO

#### `public final String fxid`

- Description: TODO

#### `private final PoseMod mod`

- Description: TODO

#### `private boolean ticked = true`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final byte[] sdt`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final float len`

- Description: TODO

#### `public final transient Track[] tracks`

- Description: TODO

#### `public final transient FxTrack[] effects`

- Description: TODO

#### `public final double nspeed`

- Description: TODO

#### `public final WrapMode defmode`

- Description: TODO

#### `private Skeleton refskel`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public final transient Function<EquipTarget, Supplier<Pipe.Op>>[] prog`

- Description: TODO

### Methods

#### `public Skeleton(Collection<Bone> bones)`

- Description: TODO

#### `public Bone(String name, Coord3f ipos, Coord3f irax, float irang)`

- Description: TODO

#### `private static float[] rotasq(float[] q, float[] axis, float angle)`

- Description: TODO

#### `private static float[] qqmul(float[] d, float[] a, float[] b)`

- Description: TODO

#### `private static float[] vqrot(float[] d, float[] v, float[] q)`

- Description: TODO

#### `private static float[] vset(float[] d, float[] s)`

- Description: TODO

#### `private static float[] qset(float[] d, float[] s)`

- Description: TODO

#### `private static float[] vinv(float[] d, float[] s)`

- Description: TODO

#### `private static float[] qinv(float[] d, float[] s)`

- Description: TODO

#### `private static float[] vvadd(float[] d, float[] a, float[] b)`

- Description: TODO

#### `private static float[] qqslerp(float[] d, float[] a, float[] b, float t)`

- Description: TODO

#### `public Pose mkbindpose()`

- Description: TODO

#### `private Pose()`

- Description: TODO

#### `public Pose(Pose from)`

- Description: TODO

#### `public Skeleton skel()`

- Description: TODO

#### `public void reset()`

- Description: TODO

#### `public void gbuild()`

- Description: TODO

#### `public void blend(Pose o, float d)`

- Description: TODO

#### `public Supplier<Pipe.Op> bonetrans(int bone)`

- Description: TODO

#### `public Supplier<Pipe.Op> eqpoint(String name, Message dat)`

- Description: TODO

#### `public Supplier<Pipe.Op> bonetrans2(int bone)`

- Description: TODO

#### `public BoneAlign(Coord3f ref, Bone orig, Bone tgt)`

- Description: TODO

#### `public Location get()`

- Description: TODO

#### `public void boneoff(int bone, float[] offtrans)`

- Description: TODO

#### `public Debug()`

- Description: TODO

#### `public void draw(Pipe state, Render g)`

- Description: TODO

#### `public void autogtick(Render g)`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `public Collection<Location.Chain> getloc()`

- Description: TODO

#### `public PoseMod(ModOwner owner)`

- Description: TODO

#### `public Skeleton skel()`

- Description: TODO

#### `public void reset()`

- Description: TODO

#### `public void rot(int bone, float ang, float ax, float ay, float az)`

- Description: TODO

#### `public void apply(Pose p)`

- Description: TODO

#### `public boolean tick(float dt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public void listen(FxTrack.EventListener l)`

- Description: TODO

#### `public void remove(FxTrack.EventListener l)`

- Description: TODO

#### `public void callback(FxTrack.Event ev)`

- Description: TODO

#### `public abstract boolean stat()`

- Description: TODO

#### `public abstract boolean done()`

- Description: TODO

#### `public PoseMod nilmod()`

- Description: TODO

#### `public CombinedMod(ModOwner owner, PoseMod... mods)`

- Description: TODO

#### `public void apply(Pose p)`

- Description: TODO

#### `public boolean tick(float dt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public boolean stat()`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static PoseMod combine(PoseMod... mods)`

- Description: TODO

#### `public PoseMod create(Skeleton skel, ModOwner owner, Resource res, Message sdt)`

- Description: TODO

#### `public PoseMod mkposemod(ModOwner owner, Resource res, Message sdt)`

- Description: TODO

#### `public ResourceSkeleton(Collection<Bone> bones, Res info)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void read(Map<String, Bone> bones, Map<Bone, String> pm, Message buf, int ver)`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public TrackMod(ModOwner owner, Track[] tracks, FxTrack[] effects, float len, WrapMode mode)`

- Description: TODO

#### `public void aupdate(float time)`

- Description: TODO

#### `private void playfx(float ot, float nt)`

- Description: TODO

#### `public boolean tick(float dt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public boolean stat()`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public Frame(float time, float[] trans, float[] rot)`

- Description: TODO

#### `public Track(String bone, Frame[] frames)`

- Description: TODO

#### `public void event(Event ev)`

- Description: TODO

#### `public Event(float time)`

- Description: TODO

#### `public abstract void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `public FxTrack(Event[] events)`

- Description: TODO

#### `public SpawnSprite(float time, Indir<Resource> res, byte[] sdt, Function<ModOwner, Pipe.Op> loc)`

- Description: TODO

#### `public void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `public FxOverlay(Gob gob, PoseMod mod, String id, Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `protected void removed()`

- Description: TODO

#### `public void event(FxTrack.Event ev)`

- Description: TODO

#### `public MkOverlay(float time, String id, Indir<Resource> res, byte[] sdt)`

- Description: TODO

#### `public void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `public RmOverlay(float time, String id)`

- Description: TODO

#### `public void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `public Trigger(float time, String id)`

- Description: TODO

#### `public void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `public Tick(float time)`

- Description: TODO

#### `public void trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

#### `private Track.Frame[] parseframes(int fmt, Message buf)`

- Description: TODO

#### `private FxTrack parsefx(int fmt, Message buf)`

- Description: TODO

#### `public ResPose(Resource res, Message buf)`

- Description: TODO

#### `private Track[] iaIaCthulhuFhtagn(Skeleton skel)`

- Description: TODO

#### `public float skelscale(Skeleton from, Skeleton to)`

- Description: TODO

#### `public ResMod(ModOwner owner, Skeleton skel, WrapMode mode)`

- Description: TODO

#### `public ResMod(ModOwner owner, Skeleton skel)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public TrackMod forskel(ModOwner owner, Skeleton skel, WrapMode mode)`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public BoneOffset(Resource res, Message buf)`

- Description: TODO

#### `public String layerid()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Supplier<Pipe.Op> from(EquipTarget equ)`

- Description: TODO
