# ClipAmbiance

This file documents the responsibilities and members of `ClipAmbiance`.

## Meta

- Source: [ClipAmbiance.java](../../../src/haven/ClipAmbiance.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles ambiance clipping behavior.

## Nested Types

### Desc

- Description: TODO

### Glob

- Description: TODO

## Members

### Constants

### Fields

#### `public final Desc desc`

- Description: TODO

#### `public double bvol`

- Description: TODO

#### `private Desc parent`

- Description: TODO

#### `private Glob glob = null`

- Description: TODO

#### `public final Desc desc`

- Description: TODO

#### `public final ActAudio list`

- Description: TODO

#### `private final Collection<RenderList.Slot<ClipAmbiance>> active = new ArrayList<>()`

- Description: TODO

#### `private final Mixer mixer = new Mixer(true)`

- Description: TODO

#### `private VolAdjust volc = null`

- Description: TODO

#### `private boolean dead = false`

- Description: TODO

#### `private Desc[] chans =`

- Description: TODO

#### `private CS[][] cur =`

- Description: TODO

#### `private int curn`

- Description: TODO

#### `private int[] n =`

- Description: TODO

#### `private double cvol`

- Description: TODO

#### `private double lastupd = Utils.rtime()`

- Description: TODO

#### `public final Indir<Resource> parent`

- Description: TODO

#### `public final int minc, maxc, maxi`

- Description: TODO

#### `public final int minc, maxc, maxi`

- Description: TODO

#### `public final int minc, maxc, maxi`

- Description: TODO

#### `public final double bvol`

- Description: TODO

#### `public final String[] cnms`

- Description: TODO

#### `public final double[] ieps`

- Description: TODO

#### `public final ClipAmbiance spr`

- Description: TODO

### Methods

#### `public ClipAmbiance(Desc desc)`

- Description: TODO

#### `public Glob(Desc desc, ActAudio list)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object other)`

- Description: TODO

#### `private void addclip(final int chan, final int idx)`

- Description: TODO

#### `private void addmin()`

- Description: TODO

#### `private void addsome(double td)`

- Description: TODO

#### `private boolean playing(int ch)`

- Description: TODO

#### `private void trim()`

- Description: TODO

#### `private double curvol()`

- Description: TODO

#### `public boolean cycle(ActAudio list)`

- Description: TODO

#### `public void add(Desc ch, RenderList.Slot<ClipAmbiance> slot)`

- Description: TODO

#### `public void remove(Desc ch, RenderList.Slot<ClipAmbiance> slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public Desc(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO
