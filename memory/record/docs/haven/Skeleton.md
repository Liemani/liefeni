---
source: [Skeleton.java](../../../../src/haven/Skeleton.java)
created: 2026-06-13
updated: 2026-06-14
---

# Skeleton

Describes bone hierarchies, pose state, and animation tracks for rigged sprites.

## Nested Types

### Bone

- Role: Stores one bone definition.
- Description: Holds a bone name, bind transform, parent link, and computed index in the skeleton order.

### BoneAlign

- Role: Aligns one bone to a reference bone.
- Description: Builds a transform that reorients a bone relative to another bone and a reference position.

### BoneOffset

- Role: Describes a named bone offset.
- Description: Resolves a bone reference from resource data and exposes the matching transform supplier.

### CombinedMod

- Role: Combines multiple pose modifiers.
- Description: Collects multiple modifiers and applies them in sequence for one owner.

### Debug

- Role: Exposes skeleton debug helpers.
- Description: Wraps debug rendering and inspection helpers for pose state.

### Event

- Role: Represents one animation event.
- Description: Carries event timing and dispatch data used by tracks.

### EventListener

- Role: Receives skeleton animation events.
- Description: Handles callbacks emitted while an animation track plays.

### Frame

- Role: Stores one animation frame.
- Description: Holds pose data and timing for a single keyframe.

### FxOverlay

- Role: Represents an effect overlay track.
- Description: Attaches skeleton-driven effects to a gob overlay lifecycle.

### FxTrack

- Role: Represents an effect track.
- Description: Drives effect events and overlay creation over animation time.

### MkOverlay

- Role: Represents an overlay creation event.
- Description: Creates the overlay object when the animation reaches the event.

### ModFactory

- Role: Creates pose modifiers.
- Description: Builds a modifier for a specific owner and skeleton resource.

### ModOwner

- Role: Owns pose modifiers.
- Description: Exposes the context a modifier needs to bind to a skeleton instance.

### Pose

- Role: Represents one pose state.
- Description: Stores local and global transforms for each bone and updates them as a unit.

### PoseMod

- Role: Modifies a pose.
- Description: Applies animation or procedural changes to a pose over time.

### Res

- Role: Reads skeleton resource data.
- Description: Loads skeleton layers from resource data and turns them into runtime structures.

### ResMod

- Role: Applies resource-driven pose modifiers.
- Description: Reuses resource animation data as a pose modifier implementation.

### ResPose

- Role: Represents a resource pose track.
- Description: Loads pose data from a resource layer and exposes it as a track.

### ResourceSkeleton

- Role: Represents a skeleton backed by a resource.
- Description: Loads bones and track data directly from resource metadata.

### RmOverlay

- Role: Represents an overlay removal event.
- Description: Removes a previously created overlay when the animation reaches the event.

### SpawnSprite

- Role: Represents a sprite spawn event.
- Description: Spawns a sprite effect when the animation reaches the event.

### Tick

- Role: Represents a tick event.
- Description: Runs time-based callbacks during track playback.

### Track

- Role: Represents one animation track.
- Description: Stores ordered frames and events for a named animation channel.

### TrackMod

- Role: Adapts a track into a pose modifier.
- Description: Evaluates a track and applies its current frame to a pose.

### Trigger

- Role: Represents an animation trigger.
- Description: Fires a callback at a named event time in a track.

## Members

### Constants

#### `public static final ModOwner nil = new ModOwner()`
- Role: Provides an empty modifier owner.
- Description: Default owner used when no modifier context is available.
- Value: `new ModOwner()`

#### `public static final ModFactory def = new ModFactory()`
- Role: Provides the default modifier factory.
- Description: Factory used when a resource does not supply a custom modifier implementation.
- Value: `new ModFactory()`

#### `private static final BiFunction<Message, BoneOffset, Function<EquipTarget, Supplier<? extends Pipe.Op>>>[] opcodes = new BiFunction[256]`
- Role: Stores bone-offset opcodes.
- Description: Dispatch table used when decoding bone-offset resource data.
- Value: `new BiFunction[256]`

### Fields

#### `public final Map<String, Bone> bones = new HashMap<String, Bone>()`
- Role: Implements the bones operation.
- Description: Implements the public final map<string, bone> bones = new hash map<string, bone>() operation.

#### `public final Bone[] blist; /* Topologically sorted */`
- Role: Caches the */ value.
- Description: Caches the `*/` value for reuse.

#### `public final Pose bindpose`
- Role: Caches the bindpose value.
- Description: Caches the `bindpose` value for reuse.

#### `public String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public Coord3f ipos, irax`
- Role: Caches the irax value.
- Description: Caches the `irax` value for reuse.

#### `public Coord3f ipos, irax`
- Role: Caches the irax value.
- Description: Caches the `irax` value for reuse.

#### `public float irang`
- Role: Caches the irang value.
- Description: Caches the `irang` value for reuse.

#### `public Bone parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public float[][] lpos, gpos`
- Role: Caches the gpos value.
- Description: Caches the `gpos` value for reuse.

#### `public float[][] lpos, gpos`
- Role: Caches the gpos value.
- Description: Caches the `gpos` value for reuse.

#### `public float[][] lrot, grot`
- Role: Caches the grot value.
- Description: Caches the `grot` value for reuse.

#### `public float[][] lrot, grot`
- Role: Caches the grot value.
- Description: Caches the `grot` value for reuse.

#### `private Pose from = null`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `public int seq = 0`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `private final Coord3f ref`
- Role: Caches the ref value.
- Description: Caches the `ref` value for reuse.

#### `private final int orig, tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `private final int orig, tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `private Location cur`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private int cseq = -1`
- Role: Caches the cseq value.
- Description: Caches the `cseq` value for reuse.

#### `private final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Homo3D.vertex, new VectorFormat(3, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.

#### `private final VertexArray.Buffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final Model model`
- Role: Caches the model value.
- Description: Caches the `model` value for reuse.

#### `private final int[] bperm`
- Role: Caches the bperm value.
- Description: Caches the `bperm` value for reuse.

#### `public final ModOwner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public float[][] lpos, lrot`
- Role: Caches the lrot value.
- Description: Caches the `lrot` value for reuse.

#### `public float[][] lpos, lrot`
- Role: Caches the lrot value.
- Description: Caches the `lrot` value for reuse.

#### `protected final Collection<FxTrack.EventListener> cbl = new ArrayList<FxTrack.EventListener>(0)`
- Role: Implements the cbl operation.
- Description: Implements the protected final collection<fx track.event listener> cbl = new array list<fx track.event listener>(0) operation.

#### `private final PoseMod[] mods`
- Role: Caches the mods value.
- Description: Caches the `mods` value for reuse.

#### `private final boolean stat`
- Role: Tracks the stat flag.
- Description: Caches the `stat` value for reuse.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final transient Skeleton s`
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

#### `public final Track[] tracks`
- Role: Caches the tracks value.
- Description: Caches the `tracks` value for reuse.

#### `public final FxTrack[] effects`
- Role: Caches the effects value.
- Description: Caches the `effects` value for reuse.

#### `public final float len`
- Role: Caches the len value.
- Description: Caches the `len` value for reuse.

#### `public final WrapMode mode`
- Role: Caches the mode value.
- Description: Caches the `mode` value for reuse.

#### `private final boolean stat`
- Role: Tracks the stat flag.
- Description: Caches the `stat` value for reuse.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `public float time = 0.0f`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

#### `public float scale = 1.0f`
- Role: Caches the scale value.
- Description: Caches the `scale` value for reuse.

#### `protected boolean speedmod = false`
- Role: Tracks the speedmod flag.
- Description: Caches the `speedmod` value for reuse.

#### `protected double nspeed = 0.0`
- Role: Caches the nspeed value.
- Description: Caches the `nspeed` value for reuse.

#### `private boolean back = false`
- Role: Tracks the back flag.
- Description: Caches the `back` value for reuse.

#### `public final String bone`
- Role: Caches the bone value.
- Description: Caches the `bone` value for reuse.

#### `public final Frame[] frames`
- Role: Caches the frames value.
- Description: Caches the `frames` value for reuse.

#### `public final float time`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

#### `public final float[] trans, rot`
- Role: Caches the rot value.
- Description: Caches the `rot` value for reuse.

#### `public final float[] trans, rot`
- Role: Caches the rot value.
- Description: Caches the `rot` value for reuse.

#### `public final Event[] events`
- Role: Caches the events value.
- Description: Caches the `events` value for reuse.

#### `public final float time`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public final Function<ModOwner, Pipe.Op> loc`
- Role: Caches the loc value.
- Description: Caches the `loc` value for reuse.

#### `public final String fxid`
- Role: Caches the fxid value.
- Description: Caches the `fxid` value for reuse.

#### `private final PoseMod mod`
- Role: Caches the mod value.
- Description: Caches the `mod` value for reuse.

#### `private boolean ticked = true`
- Role: Tracks the ticked flag.
- Description: Caches the `ticked` value for reuse.

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final float len`
- Role: Caches the len value.
- Description: Caches the `len` value for reuse.

#### `public final transient Track[] tracks`
- Role: Caches the tracks value.
- Description: Caches the `tracks` value for reuse.

#### `public final transient FxTrack[] effects`
- Role: Caches the effects value.
- Description: Caches the `effects` value for reuse.

#### `public final double nspeed`
- Role: Caches the nspeed value.
- Description: Caches the `nspeed` value for reuse.

#### `public final WrapMode defmode`
- Role: Caches the defmode value.
- Description: Caches the `defmode` value for reuse.

#### `private Skeleton refskel`
- Role: Caches the refskel value.
- Description: Caches the `refskel` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final transient Function<EquipTarget, Supplier<Pipe.Op>>[] prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

### Methods

#### `public Skeleton(Collection<Bone> bones)`
- Role: Creates a new Skeleton instance.
- Description: Constructs the Skeleton instance from the supplied inputs.

#### `public Bone(String name, Coord3f ipos, Coord3f irax, float irang)`
- Role: Handles the bone path.
- Description: Implements the bone operation.

#### `private static float[] rotasq(float[] q, float[] axis, float angle)`
- Role: Handles the rotasq path.
- Description: Implements the rotasq operation.

#### `private static float[] qqmul(float[] d, float[] a, float[] b)`
- Role: Handles the qqmul path.
- Description: Implements the qqmul operation.

#### `private static float[] vqrot(float[] d, float[] v, float[] q)`
- Role: Handles the vqrot path.
- Description: Implements the vqrot operation.

#### `private static float[] vset(float[] d, float[] s)`
- Role: Handles the vset path.
- Description: Implements the vset operation.

#### `private static float[] qset(float[] d, float[] s)`
- Role: Handles the qset path.
- Description: Implements the qset operation.

#### `private static float[] vinv(float[] d, float[] s)`
- Role: Handles the vinv path.
- Description: Implements the vinv operation.

#### `private static float[] qinv(float[] d, float[] s)`
- Role: Handles the qinv path.
- Description: Implements the qinv operation.

#### `private static float[] vvadd(float[] d, float[] a, float[] b)`
- Role: Handles the vvadd path.
- Description: Implements the vvadd operation.

#### `private static float[] qqslerp(float[] d, float[] a, float[] b, float t)`
- Role: Handles the qqslerp path.
- Description: Implements the qqslerp operation.

#### `public Pose mkbindpose()`
- Role: Handles the mkbindpose path.
- Description: Implements the mkbindpose operation.

#### `private Pose()`
- Role: Handles the pose path.
- Description: Implements the pose operation.

#### `public Pose(Pose from)`
- Role: Handles the pose path.
- Description: Implements the pose operation.

#### `public Skeleton skel()`
- Role: Handles the skel path.
- Description: Implements the skel operation.

#### `public void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public void gbuild()`
- Role: Handles the gbuild path.
- Description: Implements the gbuild operation.

#### `public void blend(Pose o, float d)`
- Role: Handles the blend path.
- Description: Implements the blend operation.

#### `public Supplier<Pipe.Op> bonetrans(int bone)`
- Role: Handles the bonetrans path.
- Description: Implements the bonetrans operation.

#### `public Supplier<Pipe.Op> eqpoint(String name, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public Supplier<Pipe.Op> bonetrans2(int bone)`
- Role: Handles the bonetrans2 path.
- Description: Implements the bonetrans2 operation.

#### `public BoneAlign(Coord3f ref, Bone orig, Bone tgt)`
- Role: Handles the bone align path.
- Description: Implements the bone align operation.

#### `public Location get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void boneoff(int bone, float[] offtrans)`
- Role: Handles the boneoff path.
- Description: Implements the boneoff operation.

#### `public Debug()`
- Role: Handles the debug path.
- Description: Implements the debug operation.

#### `public void draw(Pipe state, Render g)`
- Role: Draws the current content.
- Description: Draws the Skeleton content.

#### `public void autogtick(Render g)`
- Role: Handles the autogtick path.
- Description: Implements the autogtick operation.

#### `public TickList.Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Returns the loc.

#### `public PoseMod(ModOwner owner)`
- Role: Handles the pose mod path.
- Description: Implements the pose mod operation.

#### `public Skeleton skel()`
- Role: Handles the skel path.
- Description: Implements the skel operation.

#### `public void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public void rot(int bone, float ang, float ax, float ay, float az)`
- Role: Handles the rot path.
- Description: Implements the rot operation.

#### `public void apply(Pose p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public void listen(FxTrack.EventListener l)`
- Role: Handles the listen path.
- Description: Implements the listen operation.

#### `public void remove(FxTrack.EventListener l)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void callback(FxTrack.Event ev)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public abstract boolean stat()`
- Role: Handles the stat path.
- Description: Implements the stat operation.

#### `public abstract boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public PoseMod nilmod()`
- Role: Handles the nilmod path.
- Description: Implements the nilmod operation.

#### `public CombinedMod(ModOwner owner, PoseMod... mods)`
- Role: Handles the combined mod path.
- Description: Implements the combined mod operation.

#### `public void apply(Pose p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public boolean stat()`
- Role: Handles the stat path.
- Description: Implements the stat operation.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Skeleton for debugging and logging.

#### `public static PoseMod combine(PoseMod... mods)`
- Role: Handles the combine path.
- Description: Implements the combine operation.

#### `public PoseMod create(Skeleton skel, ModOwner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public PoseMod mkposemod(ModOwner owner, Resource res, Message sdt)`
- Role: Handles the mkposemod path.
- Description: Implements the mkposemod operation.

#### `public ResourceSkeleton(Collection<Bone> bones, Res info)`
- Role: Handles the resource skeleton path.
- Description: Implements the resource skeleton operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Skeleton for debugging and logging.

#### `private void read(Map<String, Bone> bones, Map<Bone, String> pm, Message buf, int ver)`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public TrackMod(ModOwner owner, Track[] tracks, FxTrack[] effects, float len, WrapMode mode)`
- Role: Handles the track mod path.
- Description: Implements the track mod operation.

#### `public void aupdate(float time)`
- Role: Handles the aupdate path.
- Description: Implements the aupdate operation.

#### `private void playfx(float ot, float nt)`
- Role: Handles the playfx path.
- Description: Implements the playfx operation.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public boolean stat()`
- Role: Handles the stat path.
- Description: Implements the stat operation.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public Frame(float time, float[] trans, float[] rot)`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `public Track(String bone, Frame[] frames)`
- Role: Handles the track path.
- Description: Implements the track operation.

#### `public void event(Event ev)`
- Role: Handles the event path.
- Description: Implements the event operation.

#### `public Event(float time)`
- Role: Handles the event path.
- Description: Implements the event operation.

#### `public abstract void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public FxTrack(Event[] events)`
- Role: Handles the fx track path.
- Description: Implements the fx track operation.

#### `public SpawnSprite(float time, Indir<Resource> res, byte[] sdt, Function<ModOwner, Pipe.Op> loc)`
- Role: Handles the spawn sprite path.
- Description: Implements the spawn sprite operation.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public FxOverlay(Gob gob, PoseMod mod, String id, Indir<Resource> res, Message sdt)`
- Role: Handles the fx overlay path.
- Description: Implements the fx overlay operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `protected void removed()`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public void event(FxTrack.Event ev)`
- Role: Handles the event path.
- Description: Implements the event operation.

#### `public MkOverlay(float time, String id, Indir<Resource> res, byte[] sdt)`
- Role: Handles the mk overlay path.
- Description: Implements the mk overlay operation.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public RmOverlay(float time, String id)`
- Role: Handles the rm overlay path.
- Description: Implements the rm overlay operation.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public Trigger(float time, String id)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `public Tick(float time)`
- Role: Advances the time-based state.
- Description: Advances the time-based state.

#### `public void trigger(ModOwner owner, PoseMod mod)`
- Role: Handles the trigger path.
- Description: Implements the trigger operation.

#### `private Track.Frame[] parseframes(int fmt, Message buf)`
- Role: Handles the parseframes path.
- Description: Implements the parseframes operation.

#### `private FxTrack parsefx(int fmt, Message buf)`
- Role: Handles the parsefx path.
- Description: Implements the parsefx operation.

#### `public ResPose(Resource res, Message buf)`
- Role: Handles the resource pose path.
- Description: Implements the res pose operation.

#### `private Track[] iaIaCthulhuFhtagn(Skeleton skel)`
- Role: Handles the ia ia cthulhu fhtagn path.
- Description: Implements the ia ia cthulhu fhtagn operation.

#### `public float skelscale(Skeleton from, Skeleton to)`
- Role: Handles the skelscale path.
- Description: Implements the skelscale operation.

#### `public ResMod(ModOwner owner, Skeleton skel, WrapMode mode)`
- Role: Handles the resource mod path.
- Description: Implements the res mod operation.

#### `public ResMod(ModOwner owner, Skeleton skel)`
- Role: Handles the resource mod path.
- Description: Implements the res mod operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Skeleton for debugging and logging.

#### `public TrackMod forskel(ModOwner owner, Skeleton skel, WrapMode mode)`
- Role: Handles the forskel path.
- Description: Implements the forskel operation.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public BoneOffset(Resource res, Message buf)`
- Role: Handles the bone offset path.
- Description: Implements the bone offset operation.

#### `public String layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Supplier<Pipe.Op> from(EquipTarget equ)`
- Role: Handles the from path.
- Description: Implements the from operation.