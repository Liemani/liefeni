---
source: [InstanceList.java](../../../../src/haven/render/InstanceList.java)
created: 2026-06-13
updated: 2026-06-14
---

# InstanceList

Defines the instance list render pipeline component.

## Nested Types

### InstKey

- Role: Represents inst key within InstanceList.
- Description: Describes the nested inst key type used by the enclosing class.

### Instance

- Role: Represents instance within InstanceList.
- Description: Describes the nested instance type used by the enclosing class.

### InstanceState

- Role: Represents instance state within InstanceList.
- Description: Describes the nested instance state type used by the enclosing class.

### InstancedSlot

- Role: Represents instanced slot within InstanceList.
- Description: Describes the nested instanced slot type used by the enclosing class.

### Sole

- Role: Represents sole within InstanceList.
- Description: Describes the nested sole type used by the enclosing class.

### StateSum

- Role: Represents state sum within InstanceList.
- Description: Describes the nested state sum type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final List<RenderList<Rendered>> clients = new ArrayList<>()`
- Role: Caches clients entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Adapter master`
- Role: Holds the master state.
- Description: Backs the cached state for this file.

#### `private final Map<InstKey, Object> instreg = new HashMap<>()`
- Role: Caches instreg entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`
- Role: Caches bypassed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`
- Role: Caches bypassed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Slot<? extends Rendered>, InstKey> uslotmap = new IdentityHashMap<>()`
- Role: Caches uslotmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Slot<? extends Rendered>, InstancedSlot.Instance> islotmap = new IdentityHashMap<>()`
- Role: Caches islotmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Pipe, Object> ipipemap = new IdentityHashMap<>()`
- Role: Caches ipipemap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Pipe, Object> upipemap = new IdentityHashMap<>()`
- Role: Caches upipemap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<InstancedSlot> dirty = new HashSet<>()`
- Role: Caches dirty entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `private static int[][][] _stcounts =`
- Role: Stores the instance list state.
- Description: Backs the cached state for this file.

#### `final Object instid`
- Role: Holds the instid state.
- Description: Backs the cached state for this file.

#### `final Pipe[] ust`
- Role: Holds the ust state.
- Description: Backs the cached state for this file.

#### `final Instancer[] instids`
- Role: Holds the instids state.
- Description: Backs the cached state for this file.

#### `final int[] instidmap`
- Role: Stores the instidmap value.
- Description: Backs the cached state for this file.

#### `final int[] mask`
- Role: Stores the mask value.
- Description: Backs the cached state for this file.

#### `final InstKey key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `final Instanced rend`
- Role: Holds the rend state.
- Description: Backs the cached state for this file.

#### `final InstanceState ist`
- Role: Holds the ist state.
- Description: Backs the cached state for this file.

#### `final GroupPipe ust`
- Role: Holds the ust state.
- Description: Backs the cached state for this file.

#### `Instance[] insts`
- Role: Holds the insts state.
- Description: Backs the cached state for this file.

#### `int ni`
- Role: Stores the ni value.
- Description: Backs the cached state for this file.

#### `boolean backdirty, selfdirty`
- Role: Tracks whether selfdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `boolean backdirty, selfdirty`
- Role: Tracks whether selfdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `final Slot<? extends Rendered> slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `final Pipe[] rpipes`
- Role: Holds the rpipes state.
- Description: Backs the cached state for this file.

#### `int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `private GroupPipe state = null`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

#### `final InstKey key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `final Slot<? extends Rendered> slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `final Pipe[] rpipes`
- Role: Holds the rpipes state.
- Description: Backs the cached state for this file.

### Methods

#### `private static int[][] stcounts(int n)`
- Role: Performs stcounts.
- Description: Supports the stcounts operation used by the surrounding class.

#### `private static Pipe[] uinststate(GroupPipe st, int ls)`
- Role: Performs uinststate.
- Description: Supports the uinststate operation used by the surrounding class.

#### `private static <T extends State> Instancer<T> instid0(Pipe buf, State.Slot<T> slot)`
- Role: Performs instid0.
- Description: Supports the instid0 operation used by the surrounding class.

#### `private static Instancer[] instids(GroupPipe st, int ls)`
- Role: Performs instids.
- Description: Supports the instids operation used by the surrounding class.

#### `InstKey(Slot<? extends Rendered> slot)`
- Role: Handles the inst key workflow.
- Description: Supports the inst key operation used by the surrounding class.

#### `boolean valid()`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private boolean equals(InstKey that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private <T extends State> void inststate0(State.Slot<T> slot, GroupPipe from, InstancedSlot batch)`
- Role: Performs inststate0.
- Description: Supports the inststate0 operation used by the surrounding class.

#### `InstanceState(GroupPipe from, InstancedSlot batch)`
- Role: Handles the instance state workflow.
- Description: Supports the instance state operation used by the surrounding class.

#### `public static int compare(InstanceState x, InstanceState y)`
- Role: Performs compare.
- Description: Supports the compare operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `Instance(Slot<? extends Rendered> slot)`
- Role: Handles the instance workflow.
- Description: Supports the instance operation used by the surrounding class.

#### `void register()`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `void unregister()`
- Role: Performs unregister.
- Description: Supports the unregister operation used by the surrounding class.

#### `void update(Pipe group, int[] mask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `InstancedSlot(InstKey key, Slot<? extends Rendered>[] slots)`
- Role: Handles the instanced slot workflow.
- Description: Supports the instanced slot operation used by the surrounding class.

#### `void register()`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `void unregister()`
- Role: Performs unregister.
- Description: Supports the unregister operation used by the surrounding class.

#### `private void iupdate(int idx)`
- Role: Performs iupdate.
- Description: Supports the iupdate operation used by the surrounding class.

#### `private void itrim(int idx)`
- Role: Performs itrim.
- Description: Supports the itrim operation used by the surrounding class.

#### `Instance add(Slot<? extends Rendered> ns, InstancedSlot replace)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `Instance remove(Instance inst)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `void update(Slot<? extends Rendered> ns)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Pipe group(int idx)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public int gstate(int id)`
- Role: Performs gstate.
- Description: Supports the gstate operation used by the surrounding class.

#### `public int nstates()`
- Role: Performs nstates.
- Description: Supports the nstates operation used by the surrounding class.

#### `public Rendered obj()`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public GroupPipe state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public State.Slot<?>[] batchstates()`
- Role: Performs batchstates.
- Description: Supports the batchstates operation used by the surrounding class.

#### `public <T extends State> T batchstate(State.Slot<T> slot)`
- Role: Performs batchstate.
- Description: Supports the batchstate operation used by the surrounding class.

#### `public int instances()`
- Role: Performs instances.
- Description: Supports the instances operation used by the surrounding class.

#### `public Pipe inststate(int idx)`
- Role: Performs inststate.
- Description: Supports the inststate operation used by the surrounding class.

#### `public void instupdate()`
- Role: Performs instupdate.
- Description: Supports the instupdate operation used by the surrounding class.

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private void commit(Render g)`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `Sole(InstKey key, Slot<? extends Rendered> slot)`
- Role: Handles the sole workflow.
- Description: Supports the sole operation used by the surrounding class.

#### `void register()`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `void unregister()`
- Role: Performs unregister.
- Description: Supports the unregister operation used by the surrounding class.

#### `void update(Pipe group, int[] mask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private void cladd(Slot<? extends Rendered> slot)`
- Role: Performs cladd.
- Description: Supports the cladd operation used by the surrounding class.

#### `private void clremove(Slot<? extends Rendered> slot)`
- Role: Performs clremove.
- Description: Supports the clremove operation used by the surrounding class.

#### `private void clupdate(Slot<? extends Rendered> slot)`
- Role: Performs clupdate.
- Description: Supports the clupdate operation used by the surrounding class.

#### `private void clupdate(Pipe group, int[] mask)`
- Role: Performs clupdate.
- Description: Supports the clupdate operation used by the surrounding class.

#### `public InstanceList(Adapter master)`
- Role: Creates a new InstanceList instance.
- Description: Constructs the instance and initializes its default state.

#### `private void add0(Slot<? extends Rendered> slot, InstKey key, boolean prevsole, InstancedSlot previnst)`
- Role: Performs add0.
- Description: Supports the add0 operation used by the surrounding class.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private void remove0(InstancedSlot b, InstancedSlot.Instance inst, boolean unreg)`
- Role: Performs remove0.
- Description: Supports the remove0 operation used by the surrounding class.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] mask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void commit(Render g)`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `public Locked lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public Iterable<Slot<?>> slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList<?> list)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.
