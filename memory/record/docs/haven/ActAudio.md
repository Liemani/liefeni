---
source: [ActAudio.java](../../../src/haven/ActAudio.java)
created: 2026-06-13
updated: 2026-06-14
---

# ActAudio

Adapts audio sources to active scene and UI state.

## Nested Types

### Adapter

- Role: Represents adapter within ActAudio.
- Description: Describes the nested adapter type used by the enclosing class.

### Ambience

- Role: Represents ambience within ActAudio.
- Description: Describes the nested ambience type used by the enclosing class.

### Channel

- Role: Represents channel within ActAudio.
- Description: Describes the nested channel type used by the enclosing class.

### Glob

- Role: Represents glob within ActAudio.
- Description: Describes the nested glob type used by the enclosing class.

### Global

- Role: Represents global within ActAudio.
- Description: Describes the nested global type used by the enclosing class.

### PosClip

- Role: Represents pos clip within ActAudio.
- Description: Describes the nested pos clip type used by the enclosing class.

### Root

- Role: Represents root within ActAudio.
- Description: Describes the nested root type used by the enclosing class.

### RootChannel

- Role: Represents root channel within ActAudio.
- Description: Describes the nested root channel type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<ActAudio> audio = new State.Slot<>(Slot.Type.SYS, ActAudio.class)`
- Role: Defines the shared audio constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Channel pos`
- Role: Holds the pos state.
- Description: Backs the cached state for this file.

#### `public final Channel amb`
- Role: Holds the amb state.
- Description: Backs the cached state for this file.

#### `private final Map<Global, Global> global = new HashMap<Global, Global>()`
- Role: Caches global entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Channel parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `private Collection<CS> clips = new HashSet<CS>()`
- Role: Caches clips entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public double volume`
- Role: Stores the volume value.
- Description: Backs the cached state for this file.

#### `private Audio.VolAdjust volc = null`
- Role: Stores the volc value.
- Description: Backs the cached state for this file.

#### `private Audio.Mixer mixer = null`
- Role: Stores the mixer value.
- Description: Backs the cached state for this file.

#### `public final RootChannel aui = new RootChannel("aui")`
- Role: Holds the aui state.
- Description: Backs the cached state for this file.

#### `public final RootChannel pos = new RootChannel("pos")`
- Role: Holds the pos state.
- Description: Backs the cached state for this file.

#### `public final RootChannel amb = new RootChannel("amb")`
- Role: Holds the amb state.
- Description: Backs the cached state for this file.

#### `private final VolAdjust clip`
- Role: Holds the clip state.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final double bvol`
- Role: Stores the bvol value.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private final VolAdjust clip`
- Role: Holds the clip state.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderList.Slot<Ambience>> active = new ArrayList<>()`
- Role: Caches active entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double lastupd = Utils.rtime()`
- Role: Stores the lastupd value.
- Description: Backs the cached state for this file.

#### `private boolean added = false, hasvol = false`
- Role: Tracks the added flag.
- Description: Supports the added operation used by the surrounding class.

#### `private boolean added = false, hasvol = false`
- Role: Tracks the added flag.
- Description: Supports the added operation used by the surrounding class.

### Methods

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public ActAudio(Root root)`
- Role: Creates a new ActAudio instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Pipe st)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void add(CS clip)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(CS clip)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Adapter(Channel parent)`
- Role: Performs adapter.
- Description: Supports the adapter operation used by the surrounding class.

#### `public void add(CS clip)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(CS clip)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `private RootChannel(String name)`
- Role: Performs root channel.
- Description: Supports the root channel operation used by the surrounding class.

#### `public Audio.Mixer mixer()`
- Role: Performs mixer.
- Description: Supports the mixer operation used by the surrounding class.

#### `public void setvolume(double volume)`
- Role: Performs setvolume.
- Description: Supports the setvolume operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void add(CS clip)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(CS clip)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public boolean cycle(ActAudio list)`
- Role: Performs cycle.
- Description: Supports the cycle operation used by the surrounding class.

#### `public static Coord3f spos(Pipe st)`
- Role: Performs spos.
- Description: Supports the spos operation used by the surrounding class.

#### `public PosClip(VolAdjust clip)`
- Role: Performs pos clip.
- Description: Supports the pos clip operation used by the surrounding class.

#### `public PosClip(CS clip)`
- Role: Performs pos clip.
- Description: Supports the pos clip operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `public Ambience(Resource res, double bvol)`
- Role: Performs ambience.
- Description: Supports the ambience operation used by the surrounding class.

#### `public Ambience(Resource res)`
- Role: Performs ambience.
- Description: Supports the ambience operation used by the surrounding class.

#### `public Glob(Resource res)`
- Role: Performs glob.
- Description: Supports the glob operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private double curvol()`
- Role: Performs curvol.
- Description: Supports the curvol operation used by the surrounding class.

#### `public boolean cycle(ActAudio list)`
- Role: Performs cycle.
- Description: Supports the cycle operation used by the surrounding class.

#### `public void add(RenderList.Slot<Ambience> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList.Slot<Ambience> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public <T extends Global> T intern(T glob)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public void cycle()`
- Role: Performs cycle.
- Description: Supports the cycle operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.
