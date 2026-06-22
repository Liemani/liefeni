---
source: [ClipAmbiance.java](../../../../src/haven/ClipAmbiance.java)
created: 2026-06-13
updated: 2026-06-14
---

# ClipAmbiance

Represents the clip ambiance Haven component.

## Nested Types

### Desc

- Role: Describes one ambient clip set.
- Description: Resource layer that stores ambient channels, weights, and base volume.

### Glob

- Role: Manages the active ambient mixer state.
- Description: Runtime controller that schedules, mixes, and fades the clips for one ambient descriptor.

## Members

### Constants

### Fields

#### `public final Desc desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public double bvol`
- Role: Caches the bvol value.
- Description: Caches the `bvol` value for reuse.

#### `private Desc parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `private Glob glob = null`
- Role: Caches the glob value.
- Description: Caches the `glob` value for reuse.

#### `public final Desc desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final ActAudio list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private final Collection<RenderList.Slot<ClipAmbiance>> active = new ArrayList<>()`
- Role: Implements the active operation.
- Description: Implements the private final collection<render list.slot<clip ambiance>> active = new array list<>() operation.

#### `private final Mixer mixer = new Mixer(true)`
- Role: Implements the mixer operation.
- Description: Implements the mixer operation.

#### `private VolAdjust volc = null`
- Role: Caches the volc value.
- Description: Caches the `volc` value for reuse.

#### `private boolean dead = false`
- Role: Tracks the dead flag.
- Description: Caches the `dead` value for reuse.

#### `private Desc[] chans =`
- Role: Caches the chans value.
- Description: Caches the `chans` value for reuse.

#### `private CS[][] cur =`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private int curn`
- Role: Caches the curn value.
- Description: Caches the `curn` value for reuse.

#### `private int[] n =`
- Role: Stores the clip ambiance state.
- Description: Caches the `n` value for reuse.

#### `private double cvol`
- Role: Caches the cvol value.
- Description: Caches the `cvol` value for reuse.

#### `private double lastupd = Utils.rtime()`
- Role: Implements the lastupd operation.
- Description: Implements the rtime operation.

#### `public final Indir<Resource> parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public final int minc, maxc, maxi`
- Role: Caches the maxi value.
- Description: Caches the `maxi` value for reuse.

#### `public final int minc, maxc, maxi`
- Role: Caches the maxi value.
- Description: Caches the `maxi` value for reuse.

#### `public final int minc, maxc, maxi`
- Role: Caches the maxi value.
- Description: Caches the `maxi` value for reuse.

#### `public final double bvol`
- Role: Caches the bvol value.
- Description: Caches the `bvol` value for reuse.

#### `public final String[] cnms`
- Role: Caches the cnms value.
- Description: Caches the `cnms` value for reuse.

#### `public final double[] ieps`
- Role: Caches the ieps value.
- Description: Caches the `ieps` value for reuse.

#### `public final ClipAmbiance spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

### Methods

#### `public ClipAmbiance(Desc desc)`
- Role: Creates a new ClipAmbiance instance.
- Description: Constructs the ClipAmbiance instance from the supplied inputs.

#### `public Glob(Desc desc, ActAudio list)`
- Role: Handles the glob path.
- Description: Implements the glob operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `private void addclip(final int chan, final int idx)`
- Role: Handles the addclip path.
- Description: Adds the clip.

#### `private void addmin()`
- Role: Handles the addmin path.
- Description: Adds the min.

#### `private void addsome(double td)`
- Role: Handles the addsome path.
- Description: Adds the some.

#### `private boolean playing(int ch)`
- Role: Handles the playing path.
- Description: Implements the playing operation.

#### `private void trim()`
- Role: Handles the trim path.
- Description: Implements the trim operation.

#### `private double curvol()`
- Role: Handles the curvol path.
- Description: Implements the curvol operation.

#### `public boolean cycle(ActAudio list)`
- Role: Handles the cycle path.
- Description: Implements the cycle operation.

#### `public void add(Desc ch, RenderList.Slot<ClipAmbiance> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Desc ch, RenderList.Slot<ClipAmbiance> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public Desc(Resource res, Message buf)`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.