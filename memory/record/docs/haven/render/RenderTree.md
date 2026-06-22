---
source: [RenderTree.java](../../../../../src/haven/render/RenderTree.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderTree

Defines the render tree render pipeline component.

## Nested Types

### Client

- Role: Tracks one render-list client.
- Description: Connects a render tree slot type to a consumer list.

### DepInfo

- Role: Captures dependency state.
- Description: Stores the defined and read render states for one tree slot.

### DepPipe

- Role: Records pipe dependencies.
- Description: Wraps a pipe while tracking state reads and writes during evaluation.

### Inheritance

- Role: Represents inherited pipe state.
- Description: Provides the resolved group pipes inherited by a tree slot.

### Node

- Role: Represents one render-tree node.
- Description: Marks a node that can be inserted into the render tree.

### Slot

- Role: Represents one tree slot handle.
- Description: Connects render-tree operations to a slot entry in the list.

### SlotPipe

- Role: Caches a slot-local pipe.
- Description: Reuses the current dependency state while preserving identity across updates.

### SlotRemoved

- Role: Signals slot removal.
- Description: Marks that a render-tree slot has already been detached.

### StaticPipe

- Role: Caches a locked pipe.
- Description: Keeps a stable pipe for state-locked slots.

### TreeSlot

- Role: Stores one render-tree slot.
- Description: Holds the tree node, dependency state, and child relationships.

## Members

### Constants

#### `private static final WeakHashedSet<DepInfo> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Implements the interned operation.
- Description: Implements the private static final weak hashed set<dep info> interned = new weak hashed set<>(hash.eq) operation.
- Value: `new WeakHashedSet<>(Hash.eq)`

#### `private static final Map<DepInfo, Reference<StaticPipe>> interned = new WeakHashMap<>()`
- Role: Implements the interned operation.
- Description: Implements the private static final map<dep info, reference<static pipe>> interned = new weak hash map<>() operation.
- Value: `new WeakHashMap<>()`

#### `public static final Node nil = new Nil()`
- Role: Implements the nil operation.
- Description: Implements the nil operation.
- Value: `new Nil()`

### Fields

#### `private final Lock lock = new ReentrantLock()`
- Role: Synchronizes access to the reentrant lock state.
- Description: Implements the reentrant lock operation.

#### `private final TreeSlot root`
- Role: Caches the root value.
- Description: Keeps the root event so acceptance can be reported back.

#### `private final List<Client<?>> clients = new ArrayList<>()`
- Role: Implements the clients operation.
- Description: Implements the private final list<client<?>> clients = new array list<>() operation.

#### `private int nslots, nleaves`
- Role: Caches the nleaves value.
- Description: Caches the `nleaves` value for reuse.

#### `private int nslots, nleaves`
- Role: Caches the nleaves value.
- Description: Caches the `nleaves` value for reuse.

#### `final Class<? extends R> type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `final RenderList<R> list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private final Pipe[] groups`
- Role: Caches the groups value.
- Description: Caches the `groups` value for reuse.

#### `private final int[] gstates`
- Role: Caches the gstates value.
- Description: Caches the `gstates` value for reuse.

#### `public State[] states =`
- Role: Caches the states value.
- Description: Caches the `states` value for reuse.

#### `public boolean[] def =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public boolean[] deps =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public int ndef = 0`
- Role: Caches the ndef value.
- Description: Caches the `ndef` value for reuse.

#### `public final DepInfo data = new DepInfo()`
- Role: Implements the data operation.
- Description: Implements the dep info operation.

#### `public final Pipe parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `private boolean lock = false`
- Role: Tracks the lock flag.
- Description: Caches the `lock` value for reuse.

#### `public final DepInfo bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final String node`
- Role: Caches the node value.
- Description: Caches the `node` value for reuse.

#### `final TreeSlot parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `final RenderTree tree`
- Role: Caches the tree value.
- Description: Caches the `tree` value for reuse.

#### `final Node node`
- Role: Caches the node value.
- Description: Caches the `node` value for reuse.

#### `private DepInfo dstate = null`
- Role: Caches the dstate value.
- Description: Caches the `dstate` value for reuse.

#### `private Collection<TreeSlot>[] rdeps = null`
- Role: Caches the rdeps value.
- Description: Caches the `rdeps` value for reuse.

#### `private TreeSlot[] deps = null`
- Role: Caches the deps value.
- Description: Caches the `deps` value for reuse.

#### `private Pipe.Op cstate, ostate`
- Role: Caches the ostate value.
- Description: Caches the `ostate` value for reuse.

#### `private Pipe.Op cstate, ostate`
- Role: Caches the ostate value.
- Description: Caches the `ostate` value for reuse.

#### `private boolean stlock = false`
- Role: Tracks the stlock flag.
- Description: Caches the `stlock` value for reuse.

#### `private TreeSlot[] children = null`
- Role: Caches the children value.
- Description: Caches the `children` value for reuse.

#### `private int nchildren = 0`
- Role: Caches the nchildren value.
- Description: Caches the `nchildren` value for reuse.

#### `private int pidx = -1`
- Role: Caches the pidx value.
- Description: Caches the `pidx` value for reuse.

#### `private Pipe pdstate = null`
- Role: Caches the pdstate value.
- Description: Caches the `pdstate` value for reuse.

#### `private Inheritance istate = null`
- Role: Caches the istate value.
- Description: Caches the `istate` value for reuse.

#### `protected Slot slot = null`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

### Methods

#### `public RenderTree()`
- Role: Creates a new RenderTree instance.
- Description: Constructs the RenderTree instance from the supplied inputs.

#### `public Locked lock()`
- Role: Handles the lock path.
- Description: Implements the lock operation.

#### `Client(Class<? extends R> type, RenderList<R> list)`
- Role: Handles the client workflow.
- Description: Implements the client operation.

#### `void added(TreeSlot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `void removed(TreeSlot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `void updated(TreeSlot slot)`
- Role: Handles the updated path.
- Description: Updates the d.

#### `void updated(Pipe group, int[] mask)`
- Role: Handles the updated path.
- Description: Updates the d.

#### `public Inheritance(Pipe[] groups, int[] gstates)`
- Role: Handles the inheritance path.
- Description: Implements the inheritance operation.

#### `public Pipe group(int g)`
- Role: Handles the group path.
- Description: Implements the group operation.

#### `public int gstate(int id)`
- Role: Handles the gstate path.
- Description: Implements the gstate operation.

#### `public int nstates()`
- Role: Handles the nstates path.
- Description: Implements the nstates operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RenderTree for debugging and logging.

#### `private void alloc(int idx)`
- Role: Handles the alloc path.
- Description: Implements the alloc operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public DepInfo intern()`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public int[] defdiff(DepInfo that)`
- Role: Handles the defdiff path.
- Description: Implements the defdiff operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RenderTree for debugging and logging.

#### `public DepPipe(Pipe parent)`
- Role: Handles the dep pipe path.
- Description: Implements the dep pipe operation.

#### `public DepPipe prep(Pipe.Op op)`
- Role: Handles the prep path.
- Description: Implements the prep operation.

#### `public DepInfo lock()`
- Role: Handles the lock path.
- Description: Implements the lock operation.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public <T extends State> void put(State.Slot<? super T> slot, T state)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.

#### `public StaticPipe(DepInfo bk)`
- Role: Handles the static pipe path.
- Description: Implements the static pipe operation.

#### `public static StaticPipe get(DepInfo bk)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.

#### `public Slot add(Node n, Pipe.Op state)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public default Slot add(Node n)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void cstate(Pipe.Op state)`
- Role: Handles the cstate path.
- Description: Implements the cstate operation.

#### `public void ostate(Pipe.Op state)`
- Role: Handles the ostate path.
- Description: Implements the ostate operation.

#### `public Slot parent()`
- Role: Handles the parent path.
- Description: Implements the parent operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public default void lockstate()`
- Role: Handles the lockstate path.
- Description: Implements the lockstate operation.

#### `private SlotRemoved(String message, TreeSlot slot)`
- Role: Handles the slot removed path.
- Description: Implements the slot removed operation.

#### `private SlotRemoved(TreeSlot slot)`
- Role: Handles the slot removed path.
- Description: Implements the slot removed operation.

#### `private TreeSlot(RenderTree tree, TreeSlot parent, Node node)`
- Role: Handles the tree slot path.
- Description: Implements the tree slot operation.

#### `private void addch(TreeSlot ch)`
- Role: Handles the addch path.
- Description: Adds the ch.

#### `private void removech(TreeSlot ch)`
- Role: Handles the removech path.
- Description: Removes the ch.

#### `public Iterable<TreeSlot> children()`
- Role: Handles the children path.
- Description: Implements the children operation.

#### `public Slot parent()`
- Role: Handles the parent path.
- Description: Implements the parent operation.

#### `public TreeSlot add(Node n, Pipe.Op state)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `private DepInfo mkdstate(Pipe.Op cstate, Pipe.Op ostate)`
- Role: Handles the mkdstate path.
- Description: Implements the mkdstate operation.

#### `private void remrdep(int stidx, TreeSlot rdep)`
- Role: Handles the remrdep path.
- Description: Implements the remrdep operation.

#### `private void addrdep(int stidx, TreeSlot rdep)`
- Role: Handles the addrdep path.
- Description: Adds the rdep.

#### `private void adddep(int stidx, TreeSlot dep)`
- Role: Handles the adddep path.
- Description: Adds the dep.

#### `private void rdepupd()`
- Role: Handles the rdepupd path.
- Description: Implements the rdepupd operation.

#### `private DepInfo setdstate(DepInfo nst)`
- Role: Handles the setdstate path.
- Description: Updates the dstate.

#### `private void upddstate(DepInfo nst)`
- Role: Handles the upddstate path.
- Description: Implements the upddstate operation.

#### `private void updtotal(boolean setds)`
- Role: Handles the updtotal path.
- Description: Implements the updtotal operation.

#### `private DepInfo dstate()`
- Role: Handles the dstate path.
- Description: Implements the dstate operation.

#### `private void checklockdeps()`
- Role: Handles the checklockdeps path.
- Description: Implements the checklockdeps operation.

#### `public void lockstate()`
- Role: Handles the lockstate path.
- Description: Implements the lockstate operation.

#### `private void chstate(Pipe.Op cstate, Pipe.Op ostate)`
- Role: Handles the chstate path.
- Description: Implements the chstate operation.

#### `public void cstate(Pipe.Op state)`
- Role: Handles the cstate path.
- Description: Implements the cstate operation.

#### `public void ostate(Pipe.Op state)`
- Role: Handles the ostate path.
- Description: Implements the ostate operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RenderTree for debugging and logging.

#### `private Pipe pdstate()`
- Role: Handles the pdstate path.
- Description: Implements the pdstate operation.

#### `private Inheritance istate()`
- Role: Handles the istate path.
- Description: Returns whether the tate is true.

#### `public Node obj()`
- Role: Handles the obj path.
- Description: Implements the obj operation.

#### `public GroupPipe state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RenderTree for debugging and logging.

#### `public default void added(Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public default void removed(Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RenderTree for debugging and logging.

#### `public Iterable<Slot> slots()`
- Role: Handles the slots path.
- Description: Implements the slots operation.

#### `public Slot add(Node n, Pipe.Op state)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Slot add(Node n)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList<?> list)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `private void dump(TreeSlot slot, int ind)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public void dump()`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.