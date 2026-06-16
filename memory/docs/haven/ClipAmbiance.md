# ClipAmbiance

This file documents the responsibilities and members of `ClipAmbiance`.

## Meta

- Source: [ClipAmbiance.java](../../../src/haven/ClipAmbiance.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the clip ambiance Haven component.

## Nested Types

### Desc

- Role: Represents desc within ClipAmbiance.
- Description: Describes the nested desc type used by the enclosing class.

### Glob

- Role: Represents glob within ClipAmbiance.
- Description: Describes the nested glob type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Desc desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `public double bvol`
- Role: Stores the bvol value.
- Description: Backs the cached state for this file.

#### `private Desc parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `private Glob glob = null`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `public final Desc desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `public final ActAudio list`
- Role: Stores the list value.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderList.Slot<ClipAmbiance>> active = new ArrayList<>()`
- Role: Caches active entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Mixer mixer = new Mixer(true)`
- Role: Holds the mixer state.
- Description: Backs the cached state for this file.

#### `private VolAdjust volc = null`
- Role: Holds the volc state.
- Description: Backs the cached state for this file.

#### `private boolean dead = false`
- Role: Tracks the dead flag.
- Description: Supports the dead operation used by the surrounding class.

#### `private Desc[] chans =`
- Role: Holds the clip ambiance state.
- Description: Backs the cached state for this file.

#### `private CS[][] cur =`
- Role: Holds the clip ambiance state.
- Description: Backs the cached state for this file.

#### `private int curn`
- Role: Stores the curn value.
- Description: Backs the cached state for this file.

#### `private int[] n =`
- Role: Stores the clip ambiance state.
- Description: Backs the cached state for this file.

#### `private double cvol`
- Role: Stores the cvol value.
- Description: Backs the cached state for this file.

#### `private double lastupd = Utils.rtime()`
- Role: Stores the lastupd value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public final int minc, maxc, maxi`
- Role: Stores the maxi value.
- Description: Backs the cached state for this file.

#### `public final int minc, maxc, maxi`
- Role: Stores the maxi value.
- Description: Backs the cached state for this file.

#### `public final int minc, maxc, maxi`
- Role: Stores the maxi value.
- Description: Backs the cached state for this file.

#### `public final double bvol`
- Role: Stores the bvol value.
- Description: Backs the cached state for this file.

#### `public final String[] cnms`
- Role: Stores the cnms value.
- Description: Backs the cached state for this file.

#### `public final double[] ieps`
- Role: Stores the ieps value.
- Description: Backs the cached state for this file.

#### `public final ClipAmbiance spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

### Methods

#### `public ClipAmbiance(Desc desc)`
- Role: Creates a new ClipAmbiance instance.
- Description: Constructs the instance and initializes its default state.

#### `public Glob(Desc desc, ActAudio list)`
- Role: Performs glob.
- Description: Supports the glob operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private void addclip(final int chan, final int idx)`
- Role: Performs addclip.
- Description: Supports the addclip operation used by the surrounding class.

#### `private void addmin()`
- Role: Performs addmin.
- Description: Supports the addmin operation used by the surrounding class.

#### `private void addsome(double td)`
- Role: Performs addsome.
- Description: Supports the addsome operation used by the surrounding class.

#### `private boolean playing(int ch)`
- Role: Performs playing.
- Description: Supports the playing operation used by the surrounding class.

#### `private void trim()`
- Role: Performs trim.
- Description: Supports the trim operation used by the surrounding class.

#### `private double curvol()`
- Role: Performs curvol.
- Description: Supports the curvol operation used by the surrounding class.

#### `public boolean cycle(ActAudio list)`
- Role: Performs cycle.
- Description: Supports the cycle operation used by the surrounding class.

#### `public void add(Desc ch, RenderList.Slot<ClipAmbiance> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Desc ch, RenderList.Slot<ClipAmbiance> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Desc(Resource res, Message buf)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.
