# ActAudio

This file documents the responsibilities and members of `ActAudio`.

## Meta

- Source: [ActAudio.java](../../../src/haven/ActAudio.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles action-triggered audio playback.

## Nested Types

### Adapter

- Description: TODO

### Ambience

- Description: TODO

### Channel

- Description: TODO

### Glob

- Description: TODO

### Global

- Description: TODO

### PosClip

- Description: TODO

### Root

- Description: TODO

### RootChannel

- Description: TODO

## Members

### Constants

#### `public static final Slot<ActAudio> audio = new State.Slot<>(Slot.Type.SYS, ActAudio.class)`

- Description: TODO

### Fields

#### `public final Channel pos`

- Description: TODO

#### `public final Channel amb`

- Description: TODO

#### `private final Map<Global, Global> global = new HashMap<Global, Global>()`

- Description: TODO

#### `public final Channel parent`

- Description: TODO

#### `private Collection<CS> clips = new HashSet<CS>()`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public double volume`

- Description: TODO

#### `private Audio.VolAdjust volc = null`

- Description: TODO

#### `private Audio.Mixer mixer = null`

- Description: TODO

#### `public final RootChannel aui = new RootChannel("aui")`

- Description: TODO

#### `public final RootChannel pos = new RootChannel("pos")`

- Description: TODO

#### `public final RootChannel amb = new RootChannel("amb")`

- Description: TODO

#### `private final VolAdjust clip`

- Description: TODO

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final double bvol`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `private final VolAdjust clip`

- Description: TODO

#### `private final Collection<RenderList.Slot<Ambience>> active = new ArrayList<>()`

- Description: TODO

#### `private double lastupd = Utils.rtime()`

- Description: TODO

#### `private boolean added = false, hasvol = false`

- Description: TODO

#### `private boolean added = false, hasvol = false`

- Description: TODO

### Methods

#### `public haven.render.sl.ShaderMacro shader()`

- Description: TODO

#### `public ActAudio(Root root)`

- Description: TODO

#### `public void apply(Pipe st)`

- Description: TODO

#### `public void add(CS clip)`

- Description: TODO

#### `public void remove(CS clip)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public Adapter(Channel parent)`

- Description: TODO

#### `public void add(CS clip)`

- Description: TODO

#### `public void remove(CS clip)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `private RootChannel(String name)`

- Description: TODO

#### `public Audio.Mixer mixer()`

- Description: TODO

#### `public void setvolume(double volume)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public void add(CS clip)`

- Description: TODO

#### `public void remove(CS clip)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public boolean cycle(ActAudio list)`

- Description: TODO

#### `public static Coord3f spos(Pipe st)`

- Description: TODO

#### `public PosClip(VolAdjust clip)`

- Description: TODO

#### `public PosClip(CS clip)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public void autotick(double dt)`

- Description: TODO

#### `public Ambience(Resource res, double bvol)`

- Description: TODO

#### `public Ambience(Resource res)`

- Description: TODO

#### `public Glob(Resource res)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object other)`

- Description: TODO

#### `private double curvol()`

- Description: TODO

#### `public boolean cycle(ActAudio list)`

- Description: TODO

#### `public void add(RenderList.Slot<Ambience> slot)`

- Description: TODO

#### `public void remove(RenderList.Slot<Ambience> slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public <T extends Global> T intern(T glob)`

- Description: TODO

#### `public void cycle()`

- Description: TODO

#### `public void clear()`

- Description: TODO
