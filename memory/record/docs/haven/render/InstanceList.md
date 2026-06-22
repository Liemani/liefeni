---
source: [InstanceList.java](../../../../../src/haven/render/InstanceList.java)
created: 2026-06-13
updated: 2026-06-14
---

# InstanceList

Defines the instance list render pipeline component.

## Nested Types

### InstKey

- Role: Keys one instanced slot state.
- Description: Identifies a render slot and caches the instancing state derived from it.

### Instance

- Role: Stores one instanced render batch.
- Description: Holds the batch data emitted for one render slot instance.

### InstanceState

- Role: Captures one instance state snapshot.
- Description: Stores the pipe state that feeds the instancing cache.

### InstancedSlot

- Role: Manages one instanced render slot.
- Description: Bridges a render list slot to its batch and state bookkeeping.

### Sole

- Role: Tracks one unshared instance path.
- Description: Keeps the state for a slot that should be rendered without batching.

### StateSum

- Role: Summarizes a grouped state set.
- Description: Aggregates pipe state so instance batching can compare it cheaply.

## Members

### Constants

### Fields

#### `private final List<RenderList<Rendered>> clients = new ArrayList<>()`
- Role: Implements the clients operation.
- Description: Implements the private final list<render list<rendered>> clients = new array list<>() operation.

#### `private final Adapter master`
- Role: Caches the master value.
- Description: Caches the `master` value for reuse.

#### `private final Map<InstKey, Object> instreg = new HashMap<>()`
- Role: Implements the instreg operation.
- Description: Implements the private final map<inst key, object> instreg = new hash map<>() operation.

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`
- Role: Implements the bypassed operation.
- Description: Implements the private final map<slot<? extends rendered>, object> bypassed = new identity hash map<>(), invalid = new identity hash map<>() operation.

#### `private final Map<Slot<? extends Rendered>, Object> bypassed = new IdentityHashMap<>(), invalid = new IdentityHashMap<>()`
- Role: Implements the bypassed operation.
- Description: Implements the private final map<slot<? extends rendered>, object> bypassed = new identity hash map<>(), invalid = new identity hash map<>() operation.

#### `private final Map<Slot<? extends Rendered>, InstKey> uslotmap = new IdentityHashMap<>()`
- Role: Implements the uslotmap operation.
- Description: Implements the private final map<slot<? extends rendered>, inst key> uslotmap = new identity hash map<>() operation.

#### `private final Map<Slot<? extends Rendered>, InstancedSlot.Instance> islotmap = new IdentityHashMap<>()`
- Role: Returns whether the lotmap is true.
- Description: Returns whether the lotmap is true.

#### `private final Map<Pipe, Object> ipipemap = new IdentityHashMap<>()`
- Role: Implements the ipipemap operation.
- Description: Implements the private final map<pipe, object> ipipemap = new identity hash map<>() operation.

#### `private final Map<Pipe, Object> upipemap = new IdentityHashMap<>()`
- Role: Implements the upipemap operation.
- Description: Implements the private final map<pipe, object> upipemap = new identity hash map<>() operation.

#### `private final Set<InstancedSlot> dirty = new HashSet<>()`
- Role: Implements the dirty operation.
- Description: Implements the private final set<instanced slot> dirty = new hash set<>() operation.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `private int nbypass, ninvalid, nuinst, nbatches, ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `private static int[][][] _stcounts =`
- Role: Stores the instance list state.
- Description: Caches the `_stcounts` value for reuse.

#### `final Object instid`
- Role: Caches the instid value.
- Description: Caches the `instid` value for reuse.

#### `final Pipe[] ust`
- Role: Caches the ust value.
- Description: Caches the `ust` value for reuse.

#### `final Instancer[] instids`
- Role: Caches the instids value.
- Description: Caches the `instids` value for reuse.

#### `final int[] instidmap`
- Role: Caches the instidmap value.
- Description: Caches the `instidmap` value for reuse.

#### `final int[] mask`
- Role: Caches the mask value.
- Description: Caches the `mask` value for reuse.

#### `final InstKey key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `final Instanced rend`
- Role: Caches the rend value.
- Description: Caches the `rend` value for reuse.

#### `final InstanceState ist`
- Role: Caches the ist value.
- Description: Caches the `ist` value for reuse.

#### `final GroupPipe ust`
- Role: Caches the ust value.
- Description: Caches the `ust` value for reuse.

#### `Instance[] insts`
- Role: Caches the insts value.
- Description: Caches the `insts` value for reuse.

#### `int ni`
- Role: Caches the ni value.
- Description: Caches the `ni` value for reuse.

#### `boolean backdirty, selfdirty`
- Role: Tracks whether selfdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `boolean backdirty, selfdirty`
- Role: Tracks whether selfdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `final Slot<? extends Rendered> slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `final Pipe[] rpipes`
- Role: Caches the rpipes value.
- Description: Caches the `rpipes` value for reuse.

#### `int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `private GroupPipe state = null`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `final InstKey key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `final Slot<? extends Rendered> slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `final Pipe[] rpipes`
- Role: Caches the rpipes value.
- Description: Caches the `rpipes` value for reuse.

### Methods

#### `private static int[][] stcounts(int n)`
- Role: Handles the stcounts path.
- Description: Implements the stcounts operation.

#### `private static Pipe[] uinststate(GroupPipe st, int ls)`
- Role: Handles the uinststate path.
- Description: Implements the uinststate operation.

#### `private static <T extends State> Instancer<T> instid0(Pipe buf, State.Slot<T> slot)`
- Role: Handles the instid0 path.
- Description: Implements the instid0 operation.

#### `private static Instancer[] instids(GroupPipe st, int ls)`
- Role: Handles the instids path.
- Description: Implements the instids operation.

#### `InstKey(Slot<? extends Rendered> slot)`
- Role: Handles the inst key workflow.
- Description: Implements the inst key operation.

#### `boolean valid()`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private boolean equals(InstKey that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this InstanceList for debugging and logging.

#### `private <T extends State> void inststate0(State.Slot<T> slot, GroupPipe from, InstancedSlot batch)`
- Role: Handles the inststate0 path.
- Description: Implements the inststate0 operation.

#### `InstanceState(GroupPipe from, InstancedSlot batch)`
- Role: Handles the instance state workflow.
- Description: Implements the instance state operation.

#### `public static int compare(InstanceState x, InstanceState y)`
- Role: Handles the compare path.
- Description: Implements the compare operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this InstanceList for debugging and logging.

#### `Instance(Slot<? extends Rendered> slot)`
- Role: Handles the instance workflow.
- Description: Implements the instance operation.

#### `void register()`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `void unregister()`
- Role: Handles the unregister path.
- Description: Implements the unregister operation.

#### `void update(Pipe group, int[] mask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `InstancedSlot(InstKey key, Slot<? extends Rendered>[] slots)`
- Role: Handles the instanced slot workflow.
- Description: Implements the instanced slot operation.

#### `void register()`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `void unregister()`
- Role: Handles the unregister path.
- Description: Implements the unregister operation.

#### `private void iupdate(int idx)`
- Role: Handles the iupdate path.
- Description: Implements the iupdate operation.

#### `private void itrim(int idx)`
- Role: Handles the itrim path.
- Description: Implements the itrim operation.

#### `Instance add(Slot<? extends Rendered> ns, InstancedSlot replace)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `Instance remove(Instance inst)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `void update(Slot<? extends Rendered> ns)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Pipe group(int idx)`
- Role: Handles the group path.
- Description: Implements the group operation.

#### `public int gstate(int id)`
- Role: Handles the gstate path.
- Description: Implements the gstate operation.

#### `public int nstates()`
- Role: Handles the nstates path.
- Description: Implements the nstates operation.

#### `public Rendered obj()`
- Role: Handles the obj path.
- Description: Implements the obj operation.

#### `public GroupPipe state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public State.Slot<?>[] batchstates()`
- Role: Handles the batchstates path.
- Description: Implements the batchstates operation.

#### `public <T extends State> T batchstate(State.Slot<T> slot)`
- Role: Handles the batchstate path.
- Description: Implements the batchstate operation.

#### `public int instances()`
- Role: Handles the instances path.
- Description: Implements the instances operation.

#### `public Pipe inststate(int idx)`
- Role: Handles the inststate path.
- Description: Implements the inststate operation.

#### `public void instupdate()`
- Role: Handles the instupdate path.
- Description: Implements the instupdate operation.

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private void commit(Render g)`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `Sole(InstKey key, Slot<? extends Rendered> slot)`
- Role: Handles the sole workflow.
- Description: Implements the sole operation.

#### `void register()`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `void unregister()`
- Role: Handles the unregister path.
- Description: Implements the unregister operation.

#### `void update(Pipe group, int[] mask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private void cladd(Slot<? extends Rendered> slot)`
- Role: Handles the cladd path.
- Description: Implements the cladd operation.

#### `private void clremove(Slot<? extends Rendered> slot)`
- Role: Handles the clremove path.
- Description: Implements the clremove operation.

#### `private void clupdate(Slot<? extends Rendered> slot)`
- Role: Handles the clupdate path.
- Description: Implements the clupdate operation.

#### `private void clupdate(Pipe group, int[] mask)`
- Role: Handles the clupdate path.
- Description: Implements the clupdate operation.

#### `public InstanceList(Adapter master)`
- Role: Creates a new InstanceList instance.
- Description: Constructs the InstanceList instance from the supplied inputs.

#### `private void add0(Slot<? extends Rendered> slot, InstKey key, boolean prevsole, InstancedSlot previnst)`
- Role: Handles the add0 path.
- Description: Adds the 0.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private void remove0(InstancedSlot b, InstancedSlot.Instance inst, boolean unreg)`
- Role: Handles the remove0 path.
- Description: Removes the 0.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Pipe group, int[] mask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void commit(Render g)`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `public Locked lock()`
- Role: Handles the lock path.
- Description: Implements the lock operation.

#### `public Iterable<Slot<?>> slots()`
- Role: Handles the slots path.
- Description: Implements the slots operation.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList<?> list)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.