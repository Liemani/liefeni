---
source: [ActAudio.java](../../../../src/haven/ActAudio.java)
created: 2026-06-13
updated: 2026-06-14
---

# ActAudio

Routes world and UI audio sources into the active audio graph.

## Nested Types

### Adapter

- Role: Mirrors clips into a parent audio channel.
- Description: Keeps a local clip set and forwards add/remove operations to the wrapped channel.

### Ambience

- Role: Represents one ambient sound source in the scene.
- Description: Wraps a resource-backed ambient clip and its base volume.

### Channel

- Role: Defines a mutable audio sink.
- Description: Exposes add, remove, clear, and size for a clip collection or mixer.

### Glob

- Role: Keys shared ambient playback for one resource.
- Description: Groups ambient slots for a world resource and fades them in or out together.

### Global

- Role: Represents cycleable shared audio state.
- Description: Lets the world audio root advance and retire shared clip groups.

### PosClip

- Role: Attaches a clip to a world position.
- Description: Recomputes volume and stereo balance from the owning render slot's world position.

### Root

- Role: Holds the top-level audio channels.
- Description: Provides the UI, positional, and ambient roots and clears the world channels together.

### RootChannel

- Role: Owns one top-level mixer channel.
- Description: Lazily creates the mixer, restores its volume from preferences, and stops it on clear.

## Members

### Constants

#### `public static final Slot<ActAudio> audio = new State.Slot<>(Slot.Type.SYS, ActAudio.class)`
- Role: Stores the active audio state in the render pipe.
- Description: Lets render-tree nodes find the current `ActAudio` instance.
- Value: `new State.Slot<>(Slot.Type.SYS, ActAudio.class)`

### Fields

#### `public final Channel pos`
- Role: Holds the positional audio channel.
- Description: Receives spatialized clips that track render-tree slots.

#### `public final Channel amb`
- Role: Holds the ambient audio channel.
- Description: Receives looping world ambience and fades it with scene visibility.

#### `private final Map<Global, Global> global = new HashMap<Global, Global>()`
- Role: Caches shared audio groups by identity.
- Description: Interns `Global` instances so the same resource group is updated once per frame.

#### `public final Channel parent`
- Role: Stores the wrapped parent channel.
- Description: Every adapter forwards to this channel after tracking local membership.

#### `private Collection<CS> clips = new HashSet<CS>()`
- Role: Tracks clips currently attached to the adapter.
- Description: Used to mirror removals back into the wrapped channel during clear.

#### `public final String name`
- Role: Stores the mixer channel name.
- Description: Used for preference keys and stats output.

#### `public double volume`
- Role: Stores the persisted volume for the channel.
- Description: Mirrored into the mixer volume adjuster when the channel is active.

#### `private Audio.VolAdjust volc = null`
- Role: Holds the volume adjuster that wraps the mixer.
- Description: Exists only after the mixer has been created.

#### `private Audio.Mixer mixer = null`
- Role: Holds the lazily created mixer.
- Description: Created on demand when clips are first added.

#### `public final RootChannel aui = new RootChannel("aui")`
- Role: Holds the UI sound channel.
- Description: Used for interface audio such as clicks and menu feedback.

#### `public final RootChannel pos = new RootChannel("pos")`
- Role: Holds the positional world sound channel.
- Description: Receives clips whose volume depends on world-space distance.

#### `public final RootChannel amb = new RootChannel("amb")`
- Role: Holds the ambient world sound channel.
- Description: Receives looping ambience mixed from active world resources.

#### `private final VolAdjust clip`
- Role: Wraps the positional or ambient clip with volume control.
- Description: Updated each tick before the clip is mixed into the parent channel.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Tracks the render-tree slots currently driving this positional clip.
- Description: The first slot is used to calculate distance and stereo balance.

#### `public final Resource res`
- Role: Stores the ambient resource.
- Description: Used to locate ambient clip layers and identify shared glob state.

#### `public final double bvol`
- Role: Stores the base ambient volume.
- Description: Multiplies the spatial fade for this ambience slot.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private final VolAdjust clip`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.

#### `private final Collection<RenderList.Slot<Ambience>> active = new ArrayList<>()`
- Role: Tracks ambience slots currently active for the resource.
- Description: These slots are summed into a shared volume for the resource's repeating clip.

#### `private double lastupd = Utils.rtime()`
- Role: Stores the last ambient cycle time.
- Description: Used to smooth ambient fade-in and fade-out across frames.

#### `private boolean added = false, hasvol = false`
- Role: Tracks the added flag.
- Description: Caches the `added` value for reuse.

#### `private boolean added = false, hasvol = false`
- Role: Tracks the added flag.
- Description: Caches the `added` value for reuse.

### Methods

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Exposes the audio state as a render shader hook.
- Description: This state does not contribute a shader macro, so it returns `null`.

#### `public ActAudio(Root root)`
- Role: Binds the audio state to the supplied root channels.
- Description: Wraps the root positional and ambient channels with adapters.

#### `public void apply(Pipe st)`
- Role: Installs this audio state into the render pipe.
- Description: Makes the current `ActAudio` available to downstream render-tree nodes.

#### `public void add(CS clip)`
- Role: Adds a clip to the channel.
- Description: Forwards the clip into the underlying mixer or wrapped channel.

#### `public void remove(CS clip)`
- Role: Removes a clip from the channel.
- Description: Stops the clip from the underlying mixer or wrapped channel.

#### `public void clear()`
- Role: Clears every clip from the channel.
- Description: Drops the channel's current membership and detaches it from the parent.

#### `public int size()`
- Role: Returns the number of active clips.
- Description: Reports the current channel membership count.

#### `public Adapter(Channel parent)`
- Role: Handles the adapter path.
- Description: Implements the adapter operation.

#### `public void add(CS clip)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(CS clip)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `private RootChannel(String name)`
- Role: Creates a named top-level channel.
- Description: Restores the persisted volume for that channel name.

#### `public Audio.Mixer mixer()`
- Role: Returns the lazily created mixer.
- Description: Builds the mixer and volume adjuster on first use.

#### `public void setvolume(double volume)`
- Role: Updates the channel volume.
- Description: Stores the new preference and pushes it to the live mixer when present.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void add(CS clip)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(CS clip)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public String stats()`
- Role: Summarizes the three root channel sizes.
- Description: Returns the UI, positional, and ambient clip counts as a compact string.

#### `public boolean cycle(ActAudio list)`
- Role: Advances shared ambient state.
- Description: Updates fade state, adds the shared clip when needed, and removes it once it becomes silent.

#### `public static Coord3f spos(Pipe st)`
- Role: Computes the world-space position for a render pipe.
- Description: Applies the current location chain and camera transform to the origin.

#### `public PosClip(VolAdjust clip)`
- Role: Wraps an existing volume-adjusted clip for positional playback.
- Description: Stores the supplied volume controller without adding another wrapper.

#### `public PosClip(CS clip)`
- Role: Wraps a raw clip for positional playback.
- Description: Creates the internal `VolAdjust` wrapper used for distance attenuation.

#### `public void added(RenderTree.Slot slot)`
- Role: Registers a new positional clip slot.
- Description: Starts ticking the slot and attaches the clip to the active positional channel.

#### `public void removed(RenderTree.Slot slot)`
- Role: Unregisters a positional clip slot.
- Description: Removes the clip from the active positional channel.

#### `public TickList.Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void autotick(double dt)`
- Role: Handles the autotick path.
- Description: Implements the autotick operation.

#### `public Ambience(Resource res, double bvol)`
- Role: Handles the ambience path.
- Description: Implements the ambience operation.

#### `public Ambience(Resource res)`
- Role: Handles the ambience path.
- Description: Implements the ambience operation.

#### `public Glob(Resource res)`
- Role: Handles the glob path.
- Description: Implements the glob operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `private double curvol()`
- Role: Handles the curvol path.
- Description: Implements the curvol operation.

#### `public boolean cycle(ActAudio list)`
- Role: Handles the cycle path.
- Description: Implements the cycle operation.

#### `public void add(RenderList.Slot<Ambience> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList.Slot<Ambience> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public <T extends Global> T intern(T glob)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public void cycle()`
- Role: Handles the cycle path.
- Description: Implements the cycle operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.
