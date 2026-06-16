# RenderTree

This file documents the responsibilities and members of `RenderTree`.

## Meta

- Source: [RenderTree.java](../../../../src/haven/render/RenderTree.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the render tree render pipeline component.

## Nested Types

### Client

- Role: Represents client within RenderTree.
- Description: Describes the nested client type used by the enclosing class.

### DepInfo

- Role: Represents dep info within RenderTree.
- Description: Describes the nested dep info type used by the enclosing class.

### DepPipe

- Role: Represents dep pipe within RenderTree.
- Description: Describes the nested dep pipe type used by the enclosing class.

### Inheritance

- Role: Represents inheritance within RenderTree.
- Description: Describes the nested inheritance type used by the enclosing class.

### Node

- Role: Represents node within RenderTree.
- Description: Describes the nested node type used by the enclosing class.

### Slot

- Role: Represents slot within RenderTree.
- Description: Describes the nested slot type used by the enclosing class.

### SlotPipe

- Role: Represents slot pipe within RenderTree.
- Description: Describes the nested slot pipe type used by the enclosing class.

### SlotRemoved

- Role: Represents slot removed within RenderTree.
- Description: Describes the nested slot removed type used by the enclosing class.

### StaticPipe

- Role: Represents static pipe within RenderTree.
- Description: Describes the nested static pipe type used by the enclosing class.

### TreeSlot

- Role: Represents tree slot within RenderTree.
- Description: Describes the nested tree slot type used by the enclosing class.

## Members

### Constants

#### `private static final WeakHashedSet<DepInfo> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Defines the shared interned constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<DepInfo, Reference<StaticPipe>> interned = new WeakHashMap<>()`
- Role: Defines the shared interned constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Node nil = new Nil()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Lock lock = new ReentrantLock()`
- Role: Synchronizes access to the reentrant lock state.
- Description: Supports the reentrant lock operation used by the surrounding class.

#### `private final TreeSlot root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `private final List<Client<?>> clients = new ArrayList<>()`
- Role: Caches clients entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int nslots, nleaves`
- Role: Stores the nleaves value.
- Description: Backs the cached state for this file.

#### `private int nslots, nleaves`
- Role: Stores the nleaves value.
- Description: Backs the cached state for this file.

#### `final Class<? extends R> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `final RenderList<R> list`
- Role: Caches list entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Pipe[] groups`
- Role: Holds the groups state.
- Description: Backs the cached state for this file.

#### `private final int[] gstates`
- Role: Stores the gstates value.
- Description: Backs the cached state for this file.

#### `public State[] states =`
- Role: Holds the render tree state.
- Description: Backs the cached state for this file.

#### `public boolean[] def =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public boolean[] deps =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public int ndef = 0`
- Role: Stores the ndef value.
- Description: Backs the cached state for this file.

#### `public final DepInfo data = new DepInfo()`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `public final Pipe parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `private boolean lock = false`
- Role: Tracks the lock flag.
- Description: Supports the lock operation used by the surrounding class.

#### `public final DepInfo bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final String node`
- Role: Stores the node value.
- Description: Backs the cached state for this file.

#### `final TreeSlot parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `final RenderTree tree`
- Role: Holds the tree state.
- Description: Backs the cached state for this file.

#### `final Node node`
- Role: Stores the node value.
- Description: Backs the cached state for this file.

#### `private DepInfo dstate = null`
- Role: Holds the dstate state.
- Description: Backs the cached state for this file.

#### `private Collection<TreeSlot>[] rdeps = null`
- Role: Caches rdeps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private TreeSlot[] deps = null`
- Role: Holds the deps state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op cstate, ostate`
- Role: Holds the ostate state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op cstate, ostate`
- Role: Holds the ostate state.
- Description: Backs the cached state for this file.

#### `private boolean stlock = false`
- Role: Tracks the stlock flag.
- Description: Supports the stlock operation used by the surrounding class.

#### `private TreeSlot[] children = null`
- Role: Holds the children state.
- Description: Backs the cached state for this file.

#### `private int nchildren = 0`
- Role: Stores the nchildren value.
- Description: Backs the cached state for this file.

#### `private int pidx = -1`
- Role: Stores the pidx value.
- Description: Backs the cached state for this file.

#### `private Pipe pdstate = null`
- Role: Holds the pdstate state.
- Description: Backs the cached state for this file.

#### `private Inheritance istate = null`
- Role: Holds the istate state.
- Description: Backs the cached state for this file.

#### `protected Slot slot = null`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

### Methods

#### `public RenderTree()`
- Role: Creates a new RenderTree instance.
- Description: Constructs the instance and initializes its default state.

#### `public Locked lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `Client(Class<? extends R> type, RenderList<R> list)`
- Role: Handles the client workflow.
- Description: Supports the client operation used by the surrounding class.

#### `void added(TreeSlot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `void removed(TreeSlot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `void updated(TreeSlot slot)`
- Role: Performs updated.
- Description: Supports the updated operation used by the surrounding class.

#### `void updated(Pipe group, int[] mask)`
- Role: Performs updated.
- Description: Supports the updated operation used by the surrounding class.

#### `public Inheritance(Pipe[] groups, int[] gstates)`
- Role: Performs inheritance.
- Description: Supports the inheritance operation used by the surrounding class.

#### `public Pipe group(int g)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public int gstate(int id)`
- Role: Performs gstate.
- Description: Supports the gstate operation used by the surrounding class.

#### `public int nstates()`
- Role: Performs nstates.
- Description: Supports the nstates operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void alloc(int idx)`
- Role: Performs alloc.
- Description: Supports the alloc operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public DepInfo intern()`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public int[] defdiff(DepInfo that)`
- Role: Performs defdiff.
- Description: Supports the defdiff operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public DepPipe(Pipe parent)`
- Role: Performs dep pipe.
- Description: Supports the dep pipe operation used by the surrounding class.

#### `public DepPipe prep(Pipe.Op op)`
- Role: Performs prep.
- Description: Supports the prep operation used by the surrounding class.

#### `public DepInfo lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public <T extends State> void put(State.Slot<? super T> slot, T state)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public StaticPipe(DepInfo bk)`
- Role: Performs static pipe.
- Description: Supports the static pipe operation used by the surrounding class.

#### `public static StaticPipe get(DepInfo bk)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public Slot add(Node n, Pipe.Op state)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public default Slot add(Node n)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void cstate(Pipe.Op state)`
- Role: Performs cstate.
- Description: Supports the cstate operation used by the surrounding class.

#### `public void ostate(Pipe.Op state)`
- Role: Performs ostate.
- Description: Supports the ostate operation used by the surrounding class.

#### `public Slot parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default void lockstate()`
- Role: Performs lockstate.
- Description: Supports the lockstate operation used by the surrounding class.

#### `private SlotRemoved(String message, TreeSlot slot)`
- Role: Performs slot removed.
- Description: Supports the slot removed operation used by the surrounding class.

#### `private SlotRemoved(TreeSlot slot)`
- Role: Performs slot removed.
- Description: Supports the slot removed operation used by the surrounding class.

#### `private TreeSlot(RenderTree tree, TreeSlot parent, Node node)`
- Role: Performs tree slot.
- Description: Supports the tree slot operation used by the surrounding class.

#### `private void addch(TreeSlot ch)`
- Role: Performs addch.
- Description: Supports the addch operation used by the surrounding class.

#### `private void removech(TreeSlot ch)`
- Role: Performs removech.
- Description: Supports the removech operation used by the surrounding class.

#### `public Iterable<TreeSlot> children()`
- Role: Performs children.
- Description: Supports the children operation used by the surrounding class.

#### `public Slot parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `public TreeSlot add(Node n, Pipe.Op state)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `private DepInfo mkdstate(Pipe.Op cstate, Pipe.Op ostate)`
- Role: Performs mkdstate.
- Description: Supports the mkdstate operation used by the surrounding class.

#### `private void remrdep(int stidx, TreeSlot rdep)`
- Role: Performs remrdep.
- Description: Supports the remrdep operation used by the surrounding class.

#### `private void addrdep(int stidx, TreeSlot rdep)`
- Role: Performs addrdep.
- Description: Supports the addrdep operation used by the surrounding class.

#### `private void adddep(int stidx, TreeSlot dep)`
- Role: Performs adddep.
- Description: Supports the adddep operation used by the surrounding class.

#### `private void rdepupd()`
- Role: Performs rdepupd.
- Description: Supports the rdepupd operation used by the surrounding class.

#### `private DepInfo setdstate(DepInfo nst)`
- Role: Performs setdstate.
- Description: Supports the setdstate operation used by the surrounding class.

#### `private void upddstate(DepInfo nst)`
- Role: Performs upddstate.
- Description: Supports the upddstate operation used by the surrounding class.

#### `private void updtotal(boolean setds)`
- Role: Performs updtotal.
- Description: Supports the updtotal operation used by the surrounding class.

#### `private DepInfo dstate()`
- Role: Performs dstate.
- Description: Supports the dstate operation used by the surrounding class.

#### `private void checklockdeps()`
- Role: Performs checklockdeps.
- Description: Supports the checklockdeps operation used by the surrounding class.

#### `public void lockstate()`
- Role: Performs lockstate.
- Description: Supports the lockstate operation used by the surrounding class.

#### `private void chstate(Pipe.Op cstate, Pipe.Op ostate)`
- Role: Performs chstate.
- Description: Supports the chstate operation used by the surrounding class.

#### `public void cstate(Pipe.Op state)`
- Role: Performs cstate.
- Description: Supports the cstate operation used by the surrounding class.

#### `public void ostate(Pipe.Op state)`
- Role: Performs ostate.
- Description: Supports the ostate operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public <T extends State> T get(State.Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Pipe pdstate()`
- Role: Performs pdstate.
- Description: Supports the pdstate operation used by the surrounding class.

#### `private Inheritance istate()`
- Role: Performs istate.
- Description: Supports the istate operation used by the surrounding class.

#### `public Node obj()`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public GroupPipe state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public default void added(Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public default void removed(Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Iterable<Slot> slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public Slot add(Node n, Pipe.Op state)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Slot add(Node n)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList<?> list)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private void dump(TreeSlot slot, int ind)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public void dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.
