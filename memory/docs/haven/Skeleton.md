# Skeleton

This file documents the responsibilities and members of `Skeleton`.

## Meta

- Source: [Skeleton.java](../../../src/haven/Skeleton.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the skeleton Haven component.

## Nested Types

### Bone

- Role: Represents bone within Skeleton.
- Description: Describes the nested bone type used by the enclosing class.

### BoneAlign

- Role: Represents bone align within Skeleton.
- Description: Describes the nested bone align type used by the enclosing class.

### BoneOffset

- Role: Represents bone offset within Skeleton.
- Description: Describes the nested bone offset type used by the enclosing class.

### CombinedMod

- Role: Represents combined mod within Skeleton.
- Description: Describes the nested combined mod type used by the enclosing class.

### Debug

- Role: Represents debug within Skeleton.
- Description: Describes the nested debug type used by the enclosing class.

### Event

- Role: Represents event within Skeleton.
- Description: Describes the nested event type used by the enclosing class.

### EventListener

- Role: Represents event listener within Skeleton.
- Description: Describes the nested event listener type used by the enclosing class.

### Frame

- Role: Represents frame within Skeleton.
- Description: Describes the nested frame type used by the enclosing class.

### FxOverlay

- Role: Represents fx overlay within Skeleton.
- Description: Describes the nested fx overlay type used by the enclosing class.

### FxTrack

- Role: Represents fx track within Skeleton.
- Description: Describes the nested fx track type used by the enclosing class.

### MkOverlay

- Role: Represents mk overlay within Skeleton.
- Description: Describes the nested mk overlay type used by the enclosing class.

### ModFactory

- Role: Represents mod factory within Skeleton.
- Description: Describes the nested mod factory type used by the enclosing class.

### ModOwner

- Role: Represents mod owner within Skeleton.
- Description: Describes the nested mod owner type used by the enclosing class.

### Pose

- Role: Represents pose within Skeleton.
- Description: Describes the nested pose type used by the enclosing class.

### PoseMod

- Role: Represents pose mod within Skeleton.
- Description: Describes the nested pose mod type used by the enclosing class.

### Res

- Role: Represents res within Skeleton.
- Description: Describes the nested res type used by the enclosing class.

### ResMod

- Role: Represents res mod within Skeleton.
- Description: Describes the nested res mod type used by the enclosing class.

### ResPose

- Role: Represents res pose within Skeleton.
- Description: Describes the nested res pose type used by the enclosing class.

### ResourceSkeleton

- Role: Represents resource skeleton within Skeleton.
- Description: Describes the nested resource skeleton type used by the enclosing class.

### RmOverlay

- Role: Represents rm overlay within Skeleton.
- Description: Describes the nested rm overlay type used by the enclosing class.

### SpawnSprite

- Role: Represents spawn sprite within Skeleton.
- Description: Describes the nested spawn sprite type used by the enclosing class.

### Tick

- Role: Represents tick within Skeleton.
- Description: Describes the nested tick type used by the enclosing class.

### Track

- Role: Represents track within Skeleton.
- Description: Describes the nested track type used by the enclosing class.

### TrackMod

- Role: Represents track mod within Skeleton.
- Description: Describes the nested track mod type used by the enclosing class.

### Trigger

- Role: Represents trigger within Skeleton.
- Description: Describes the nested trigger type used by the enclosing class.

## Members

### Constants

#### `public static final ModOwner nil = new ModOwner()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ModFactory def = new ModFactory()`
- Role: Defines the shared def constant.
- Description: Shared constant used by the rest of the class.

#### `private static final BiFunction<Message, BoneOffset, Function<EquipTarget, Supplier<? extends Pipe.Op>>>[] opcodes = new BiFunction[256]`
- Role: Defines the shared opcodes constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Map<String, Bone> bones = new HashMap<String, Bone>()`
- Role: Caches bones entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Bone[] blist; /* Topologically sorted */`
- Role: Holds the skeleton state.
- Description: Backs the cached state for this file.

#### `public final Pose bindpose`
- Role: Holds the bindpose state.
- Description: Backs the cached state for this file.

#### `public String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public Coord3f ipos, irax`
- Role: Stores the irax value.
- Description: Backs the cached state for this file.

#### `public Coord3f ipos, irax`
- Role: Stores the irax value.
- Description: Backs the cached state for this file.

#### `public float irang`
- Role: Stores the irang value.
- Description: Backs the cached state for this file.

#### `public Bone parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `public int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public float[][] lpos, gpos`
- Role: Stores the gpos value.
- Description: Backs the cached state for this file.

#### `public float[][] lpos, gpos`
- Role: Stores the gpos value.
- Description: Backs the cached state for this file.

#### `public float[][] lrot, grot`
- Role: Stores the grot value.
- Description: Backs the cached state for this file.

#### `public float[][] lrot, grot`
- Role: Stores the grot value.
- Description: Backs the cached state for this file.

#### `private Pose from = null`
- Role: Holds the from state.
- Description: Backs the cached state for this file.

#### `public int seq = 0`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private final Coord3f ref`
- Role: Stores the ref value.
- Description: Backs the cached state for this file.

#### `private final int orig, tgt`
- Role: Stores the tgt value.
- Description: Backs the cached state for this file.

#### `private final int orig, tgt`
- Role: Stores the tgt value.
- Description: Backs the cached state for this file.

#### `private Location cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `private int cseq = -1`
- Role: Stores the cseq value.
- Description: Backs the cached state for this file.

#### `private final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Caches fmt entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final VertexArray.Buffer data`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Model model`
- Role: Holds the model state.
- Description: Backs the cached state for this file.

#### `private final int[] bperm`
- Role: Stores the bperm value.
- Description: Backs the cached state for this file.

#### `public final ModOwner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `public float[][] lpos, lrot`
- Role: Stores the lrot value.
- Description: Backs the cached state for this file.

#### `public float[][] lpos, lrot`
- Role: Stores the lrot value.
- Description: Backs the cached state for this file.

#### `protected final Collection<FxTrack.EventListener> cbl = new ArrayList<FxTrack.EventListener>(0)`
- Role: Caches cbl entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final PoseMod[] mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `private final boolean stat`
- Role: Tracks the stat flag.
- Description: Supports the stat operation used by the surrounding class.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final transient Skeleton s`
- Role: Holds the s state.
- Description: Backs the cached state for this file.

#### `public final Track[] tracks`
- Role: Holds the tracks state.
- Description: Backs the cached state for this file.

#### `public final FxTrack[] effects`
- Role: Holds the effects state.
- Description: Backs the cached state for this file.

#### `public final float len`
- Role: Stores the len value.
- Description: Backs the cached state for this file.

#### `public final WrapMode mode`
- Role: Holds the mode state.
- Description: Backs the cached state for this file.

#### `private final boolean stat`
- Role: Tracks the stat flag.
- Description: Supports the stat operation used by the surrounding class.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `public float time = 0.0f`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public float scale = 1.0f`
- Role: Stores the scale value.
- Description: Backs the cached state for this file.

#### `protected boolean speedmod = false`
- Role: Tracks the speedmod flag.
- Description: Supports the speedmod operation used by the surrounding class.

#### `protected double nspeed = 0.0`
- Role: Stores the nspeed value.
- Description: Backs the cached state for this file.

#### `private boolean back = false`
- Role: Tracks the back flag.
- Description: Supports the back operation used by the surrounding class.

#### `public final String bone`
- Role: Stores the bone value.
- Description: Backs the cached state for this file.

#### `public final Frame[] frames`
- Role: Holds the frames state.
- Description: Backs the cached state for this file.

#### `public final float time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public final float[] trans, rot`
- Role: Stores the rot value.
- Description: Backs the cached state for this file.

#### `public final float[] trans, rot`
- Role: Stores the rot value.
- Description: Backs the cached state for this file.

#### `public final Event[] events`
- Role: Holds the events state.
- Description: Backs the cached state for this file.

#### `public final float time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public final Function<ModOwner, Pipe.Op> loc`
- Role: Holds the loc state.
- Description: Backs the cached state for this file.

#### `public final String fxid`
- Role: Stores the fxid value.
- Description: Backs the cached state for this file.

#### `private final PoseMod mod`
- Role: Holds the mod state.
- Description: Backs the cached state for this file.

#### `private boolean ticked = true`
- Role: Tracks the ticked flag.
- Description: Supports the ticked operation used by the surrounding class.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final float len`
- Role: Stores the len value.
- Description: Backs the cached state for this file.

#### `public final transient Track[] tracks`
- Role: Holds the tracks state.
- Description: Backs the cached state for this file.

#### `public final transient FxTrack[] effects`
- Role: Holds the effects state.
- Description: Backs the cached state for this file.

#### `public final double nspeed`
- Role: Stores the nspeed value.
- Description: Backs the cached state for this file.

#### `public final WrapMode defmode`
- Role: Holds the defmode state.
- Description: Backs the cached state for this file.

#### `private Skeleton refskel`
- Role: Holds the refskel state.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final transient Function<EquipTarget, Supplier<Pipe.Op>>[] prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

### Methods

#### `public Skeleton(Collection<Bone> bones)`
- Role: Creates a new Skeleton instance.
- Description: Constructs the instance and initializes its default state.

#### `public Bone(String name, Coord3f ipos, Coord3f irax, float irang)`
- Role: Performs bone.
- Description: Supports the bone operation used by the surrounding class.

#### `private static float[] rotasq(float[] q, float[] axis, float angle)`
- Role: Performs rotasq.
- Description: Supports the rotasq operation used by the surrounding class.

#### `private static float[] qqmul(float[] d, float[] a, float[] b)`
- Role: Performs qqmul.
- Description: Supports the qqmul operation used by the surrounding class.

#### `private static float[] vqrot(float[] d, float[] v, float[] q)`
- Role: Performs vqrot.
- Description: Supports the vqrot operation used by the surrounding class.

#### `private static float[] vset(float[] d, float[] s)`
- Role: Performs vset.
- Description: Supports the vset operation used by the surrounding class.

#### `private static float[] qset(float[] d, float[] s)`
- Role: Performs qset.
- Description: Supports the qset operation used by the surrounding class.

#### `private static float[] vinv(float[] d, float[] s)`
- Role: Performs vinv.
- Description: Supports the vinv operation used by the surrounding class.

#### `private static float[] qinv(float[] d, float[] s)`
- Role: Performs qinv.
- Description: Supports the qinv operation used by the surrounding class.

#### `private static float[] vvadd(float[] d, float[] a, float[] b)`
- Role: Performs vvadd.
- Description: Supports the vvadd operation used by the surrounding class.

#### `private static float[] qqslerp(float[] d, float[] a, float[] b, float t)`
- Role: Performs qqslerp.
- Description: Supports the qqslerp operation used by the surrounding class.

#### `public Pose mkbindpose()`
- Role: Performs mkbindpose.
- Description: Supports the mkbindpose operation used by the surrounding class.

#### `private Pose()`
- Role: Performs pose.
- Description: Supports the pose operation used by the surrounding class.

#### `public Pose(Pose from)`
- Role: Performs pose.
- Description: Supports the pose operation used by the surrounding class.

#### `public Skeleton skel()`
- Role: Performs skel.
- Description: Supports the skel operation used by the surrounding class.

#### `public void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public void gbuild()`
- Role: Performs gbuild.
- Description: Supports the gbuild operation used by the surrounding class.

#### `public void blend(Pose o, float d)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `public Supplier<Pipe.Op> bonetrans(int bone)`
- Role: Performs bonetrans.
- Description: Supports the bonetrans operation used by the surrounding class.

#### `public Supplier<Pipe.Op> eqpoint(String name, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public Supplier<Pipe.Op> bonetrans2(int bone)`
- Role: Performs bonetrans2.
- Description: Supports the bonetrans2 operation used by the surrounding class.

#### `public BoneAlign(Coord3f ref, Bone orig, Bone tgt)`
- Role: Performs bone align.
- Description: Supports the bone align operation used by the surrounding class.

#### `public Location get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void boneoff(int bone, float[] offtrans)`
- Role: Performs boneoff.
- Description: Supports the boneoff operation used by the surrounding class.

#### `public Debug()`
- Role: Performs debug.
- Description: Supports the debug operation used by the surrounding class.

#### `public void draw(Pipe state, Render g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void autogtick(Render g)`
- Role: Performs autogtick.
- Description: Supports the autogtick operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Exposes the requested value without mutating state.

#### `public PoseMod(ModOwner owner)`
- Role: Performs pose mod.
- Description: Supports the pose mod operation used by the surrounding class.

#### `public Skeleton skel()`
- Role: Performs skel.
- Description: Supports the skel operation used by the surrounding class.

#### `public void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public void rot(int bone, float ang, float ax, float ay, float az)`
- Role: Performs rot.
- Description: Supports the rot operation used by the surrounding class.

#### `public void apply(Pose p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public void listen(FxTrack.EventListener l)`
- Role: Performs listen.
- Description: Supports the listen operation used by the surrounding class.

#### `public void remove(FxTrack.EventListener l)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void callback(FxTrack.Event ev)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public abstract boolean stat()`
- Role: Performs stat.
- Description: Supports the stat operation used by the surrounding class.

#### `public abstract boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public PoseMod nilmod()`
- Role: Performs nilmod.
- Description: Supports the nilmod operation used by the surrounding class.

#### `public CombinedMod(ModOwner owner, PoseMod... mods)`
- Role: Performs combined mod.
- Description: Supports the combined mod operation used by the surrounding class.

#### `public void apply(Pose p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public boolean stat()`
- Role: Performs stat.
- Description: Supports the stat operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static PoseMod combine(PoseMod... mods)`
- Role: Performs combine.
- Description: Supports the combine operation used by the surrounding class.

#### `public PoseMod create(Skeleton skel, ModOwner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public PoseMod mkposemod(ModOwner owner, Resource res, Message sdt)`
- Role: Performs mkposemod.
- Description: Supports the mkposemod operation used by the surrounding class.

#### `public ResourceSkeleton(Collection<Bone> bones, Res info)`
- Role: Performs resource skeleton.
- Description: Supports the resource skeleton operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void read(Map<String, Bone> bones, Map<Bone, String> pm, Message buf, int ver)`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public TrackMod(ModOwner owner, Track[] tracks, FxTrack[] effects, float len, WrapMode mode)`
- Role: Performs track mod.
- Description: Supports the track mod operation used by the surrounding class.

#### `public void aupdate(float time)`
- Role: Performs aupdate.
- Description: Supports the aupdate operation used by the surrounding class.

#### `private void playfx(float ot, float nt)`
- Role: Performs playfx.
- Description: Supports the playfx operation used by the surrounding class.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public boolean stat()`
- Role: Performs stat.
- Description: Supports the stat operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public Frame(float time, float[] trans, float[] rot)`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `public Track(String bone, Frame[] frames)`
- Role: Performs track.
- Description: Supports the track operation used by the surrounding class.

#### `public void event(Event ev)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public Event(float time)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public abstract void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public FxTrack(Event[] events)`
- Role: Performs fx track.
- Description: Supports the fx track operation used by the surrounding class.

#### `public SpawnSprite(float time, Indir<Resource> res, byte[] sdt, Function<ModOwner, Pipe.Op> loc)`
- Role: Performs spawn sprite.
- Description: Supports the spawn sprite operation used by the surrounding class.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public FxOverlay(Gob gob, PoseMod mod, String id, Indir<Resource> res, Message sdt)`
- Role: Performs fx overlay.
- Description: Supports the fx overlay operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `protected void removed()`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public void event(FxTrack.Event ev)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public MkOverlay(float time, String id, Indir<Resource> res, byte[] sdt)`
- Role: Performs mk overlay.
- Description: Supports the mk overlay operation used by the surrounding class.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public RmOverlay(float time, String id)`
- Role: Performs rm overlay.
- Description: Supports the rm overlay operation used by the surrounding class.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public Trigger(float time, String id)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `public Tick(float time)`
- Role: Performs tick.
- Description: Supports the tick operation used by the surrounding class.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Performs trigger.
- Description: Supports the trigger operation used by the surrounding class.

#### `private Track.Frame[] parseframes(int fmt, Message buf)`
- Role: Performs parseframes.
- Description: Supports the parseframes operation used by the surrounding class.

#### `private FxTrack parsefx(int fmt, Message buf)`
- Role: Performs parsefx.
- Description: Supports the parsefx operation used by the surrounding class.

#### `public ResPose(Resource res, Message buf)`
- Role: Performs res pose.
- Description: Supports the res pose operation used by the surrounding class.

#### `private Track[] iaIaCthulhuFhtagn(Skeleton skel)`
- Role: Performs ia ia cthulhu fhtagn.
- Description: Supports the ia ia cthulhu fhtagn operation used by the surrounding class.

#### `public float skelscale(Skeleton from, Skeleton to)`
- Role: Performs skelscale.
- Description: Supports the skelscale operation used by the surrounding class.

#### `public ResMod(ModOwner owner, Skeleton skel, WrapMode mode)`
- Role: Performs res mod.
- Description: Supports the res mod operation used by the surrounding class.

#### `public ResMod(ModOwner owner, Skeleton skel)`
- Role: Performs res mod.
- Description: Supports the res mod operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public TrackMod forskel(ModOwner owner, Skeleton skel, WrapMode mode)`
- Role: Performs forskel.
- Description: Supports the forskel operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public BoneOffset(Resource res, Message buf)`
- Role: Performs bone offset.
- Description: Supports the bone offset operation used by the surrounding class.

#### `public String layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Supplier<Pipe.Op> from(EquipTarget equ)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.
