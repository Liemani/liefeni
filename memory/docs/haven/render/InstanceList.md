# InstanceList

This file documents the responsibilities and members of `InstanceList`.

## Meta

- Source: [InstanceList.java](../../../../src/haven/render/InstanceList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a list of instances.

## Nested Types

### InstKey

- Description: TODO

### Instance

- Description: TODO

### InstanceState

- Description: TODO

### InstancedSlot

- Description: TODO

### Sole

- Description: TODO

### StateSum

- Description: TODO

## Members

### Constants

### Fields

#### `private final List<RenderList<Rendered>> clients = new ArrayList<>()`

- Description: TODO

#### `private final Adapter master`

- Description: TODO

#### `private final Map<InstKey, Object> instreg = new HashMap<>()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, InstKey> uslotmap = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, InstancedSlot.Instance> islotmap = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Pipe, Object> ipipemap = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Pipe, Object> upipemap = new IdentityHashMap<>()`

- Description: TODO

#### `private final Set<InstancedSlot> dirty = new HashSet<>()`

- Description: TODO

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`

- Description: TODO

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`

- Description: TODO

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`

- Description: TODO

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`

- Description: TODO

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`

- Description: TODO

#### `private static int[][][] _stcounts =`

- Description: TODO

#### `final Object instid`

- Description: TODO

#### `final Pipe[] ust`

- Description: TODO

#### `final Instancer[] instids`

- Description: TODO

#### `final int[] instidmap`

- Description: TODO

#### `final int[] mask`

- Description: TODO

#### `final InstKey key`

- Description: TODO

#### `final Instanced rend`

- Description: TODO

#### `final InstanceState ist`

- Description: TODO

#### `final GroupPipe ust`

- Description: TODO

#### `Instance[] insts`

- Description: TODO

#### `int ni`

- Description: TODO

#### `boolean backdirty, selfdirty`

- Description: TODO

#### `boolean backdirty, selfdirty`

- Description: TODO

#### `final Slot<? extends Rendered> slot`

- Description: TODO

#### `final Pipe[] rpipes`

- Description: TODO

#### `int idx`

- Description: TODO

#### `private GroupPipe state = null`

- Description: TODO

#### `final InstKey key`

- Description: TODO

#### `final Slot<? extends Rendered> slot`

- Description: TODO

#### `final Pipe[] rpipes`

- Description: TODO

### Methods

#### `private static int[][] stcounts(int n)`

- Description: TODO

#### `private static Pipe[] uinststate(GroupPipe st, int ls)`

- Description: TODO

#### `private static <T extends State> Instancer<T> instid0(Pipe buf, State.Slot<T> slot)`

- Description: TODO

#### `private static Instancer[] instids(GroupPipe st, int ls)`

- Description: TODO

#### `InstKey(Slot<? extends Rendered> slot)`

- Description: TODO

#### `boolean valid()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private boolean equals(InstKey that)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private <T extends State> void inststate0(State.Slot<T> slot, GroupPipe from, InstancedSlot batch)`

- Description: TODO

#### `InstanceState(GroupPipe from, InstancedSlot batch)`

- Description: TODO

#### `public static int compare(InstanceState x, InstanceState y)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `Instance(Slot<? extends Rendered> slot)`

- Description: TODO

#### `void register()`

- Description: TODO

#### `void unregister()`

- Description: TODO

#### `void update(Pipe group, int[] mask)`

- Description: TODO

#### `InstancedSlot(InstKey key, Slot<? extends Rendered>[] slots)`

- Description: TODO

#### `void register()`

- Description: TODO

#### `void unregister()`

- Description: TODO

#### `private void iupdate(int idx)`

- Description: TODO

#### `private void itrim(int idx)`

- Description: TODO

#### `Instance add(Slot<? extends Rendered> ns, InstancedSlot replace)`

- Description: TODO

#### `Instance remove(Instance inst)`

- Description: TODO

#### `void dispose()`

- Description: TODO

#### `void update(Slot<? extends Rendered> ns)`

- Description: TODO

#### `public Pipe group(int idx)`

- Description: TODO

#### `public int gstate(int id)`

- Description: TODO

#### `public int nstates()`

- Description: TODO

#### `public Rendered obj()`

- Description: TODO

#### `public GroupPipe state()`

- Description: TODO

#### `public State.Slot<?>[] batchstates()`

- Description: TODO

#### `public <T extends State> T batchstate(State.Slot<T> slot)`

- Description: TODO

#### `public int instances()`

- Description: TODO

#### `public Pipe inststate(int idx)`

- Description: TODO

#### `public void instupdate()`

- Description: TODO

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`

- Description: TODO

#### `private void commit(Render g)`

- Description: TODO

#### `Sole(InstKey key, Slot<? extends Rendered> slot)`

- Description: TODO

#### `void register()`

- Description: TODO

#### `void unregister()`

- Description: TODO

#### `void update(Pipe group, int[] mask)`

- Description: TODO

#### `private void cladd(Slot<? extends Rendered> slot)`

- Description: TODO

#### `private void clremove(Slot<? extends Rendered> slot)`

- Description: TODO

#### `private void clupdate(Slot<? extends Rendered> slot)`

- Description: TODO

#### `private void clupdate(Pipe group, int[] mask)`

- Description: TODO

#### `public InstanceList(Adapter master)`

- Description: TODO

#### `private void add0(Slot<? extends Rendered> slot, InstKey key, boolean prevsole, InstancedSlot previnst)`

- Description: TODO

#### `public void add(Slot<? extends Rendered> slot)`

- Description: TODO

#### `private void remove0(InstancedSlot b, InstancedSlot.Instance inst, boolean unreg)`

- Description: TODO

#### `public void remove(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] mask)`

- Description: TODO

#### `public void commit(Render g)`

- Description: TODO

#### `public Locked lock()`

- Description: TODO

#### `public Iterable<Slot<?>> slots()`

- Description: TODO

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

#### `public void remove(RenderList<?> list)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String stats()`

- Description: TODO
