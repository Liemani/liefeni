# RenderTree

This file documents the responsibilities and members of `RenderTree`.

## Meta

- Source: [RenderTree.java](../../../../src/haven/render/RenderTree.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render tree.

## Nested Types

### Client

- Description: TODO

### DepInfo

- Description: TODO

### DepPipe

- Description: TODO

### Inheritance

- Description: TODO

### Node

- Description: TODO

### Slot

- Description: TODO

### SlotPipe

- Description: TODO

### SlotRemoved

- Description: TODO

### StaticPipe

- Description: TODO

### TreeSlot

- Description: TODO

## Members

### Constants

#### `private static final WeakHashedSet<DepInfo> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

#### `private static final Map<DepInfo, Reference<StaticPipe>> interned = new WeakHashMap<>()`

- Description: TODO

#### `public static final Node nil = new Nil()`

- Description: TODO

### Fields

#### `private final Lock lock = new ReentrantLock()`

- Description: TODO

#### `private final TreeSlot root`

- Description: TODO

#### `private final List<Client<?>> clients = new ArrayList<>()`

- Description: TODO

#### `private int nslots, nleaves`

- Description: TODO

#### `private int nslots, nleaves`

- Description: TODO

#### `final Class<? extends R> type`

- Description: TODO

#### `final RenderList<R> list`

- Description: TODO

#### `private final Pipe[] groups`

- Description: TODO

#### `private final int[] gstates`

- Description: TODO

#### `public State[] states =`

- Description: TODO

#### `public boolean[] def =`

- Description: TODO

#### `public boolean[] deps =`

- Description: TODO

#### `public int ndef = 0`

- Description: TODO

#### `public final DepInfo data = new DepInfo()`

- Description: TODO

#### `public final Pipe parent`

- Description: TODO

#### `private boolean lock = false`

- Description: TODO

#### `public final DepInfo bk`

- Description: TODO

#### `public final String node`

- Description: TODO

#### `final TreeSlot parent`

- Description: TODO

#### `final RenderTree tree`

- Description: TODO

#### `final Node node`

- Description: TODO

#### `private DepInfo dstate = null`

- Description: TODO

#### `private Collection<TreeSlot>[] rdeps = null`

- Description: TODO

#### `private TreeSlot[] deps = null`

- Description: TODO

#### `private Pipe.Op cstate, ostate`

- Description: TODO

#### `private Pipe.Op cstate, ostate`

- Description: TODO

#### `private boolean stlock = false`

- Description: TODO

#### `private TreeSlot[] children = null`

- Description: TODO

#### `private int nchildren = 0`

- Description: TODO

#### `private int pidx = -1`

- Description: TODO

#### `private Pipe pdstate = null`

- Description: TODO

#### `private Inheritance istate = null`

- Description: TODO

#### `protected Slot slot = null`

- Description: TODO

### Methods

#### `public RenderTree()`

- Description: TODO

#### `public Locked lock()`

- Description: TODO

#### `Client(Class<? extends R> type, RenderList<R> list)`

- Description: TODO

#### `void added(TreeSlot slot)`

- Description: TODO

#### `void removed(TreeSlot slot)`

- Description: TODO

#### `void updated(TreeSlot slot)`

- Description: TODO

#### `void updated(Pipe group, int[] mask)`

- Description: TODO

#### `public Inheritance(Pipe[] groups, int[] gstates)`

- Description: TODO

#### `public Pipe group(int g)`

- Description: TODO

#### `public int gstate(int id)`

- Description: TODO

#### `public int nstates()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void alloc(int idx)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public DepInfo intern()`

- Description: TODO

#### `public int[] defdiff(DepInfo that)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public DepPipe(Pipe parent)`

- Description: TODO

#### `public DepPipe prep(Pipe.Op op)`

- Description: TODO

#### `public DepInfo lock()`

- Description: TODO

#### `public <T extends State> T get(State.Slot<T> slot)`

- Description: TODO

#### `public <T extends State> void put(State.Slot<? super T> slot, T state)`

- Description: TODO

#### `public Pipe copy()`

- Description: TODO

#### `public State[] states()`

- Description: TODO

#### `public StaticPipe(DepInfo bk)`

- Description: TODO

#### `public static StaticPipe get(DepInfo bk)`

- Description: TODO

#### `public <T extends State> T get(State.Slot<T> slot)`

- Description: TODO

#### `public Pipe copy()`

- Description: TODO

#### `public State[] states()`

- Description: TODO

#### `public Slot add(Node n, Pipe.Op state)`

- Description: TODO

#### `public default Slot add(Node n)`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public void cstate(Pipe.Op state)`

- Description: TODO

#### `public void ostate(Pipe.Op state)`

- Description: TODO

#### `public Slot parent()`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public default void lockstate()`

- Description: TODO

#### `private SlotRemoved(String message, TreeSlot slot)`

- Description: TODO

#### `private SlotRemoved(TreeSlot slot)`

- Description: TODO

#### `private TreeSlot(RenderTree tree, TreeSlot parent, Node node)`

- Description: TODO

#### `private void addch(TreeSlot ch)`

- Description: TODO

#### `private void removech(TreeSlot ch)`

- Description: TODO

#### `public Iterable<TreeSlot> children()`

- Description: TODO

#### `public Slot parent()`

- Description: TODO

#### `public TreeSlot add(Node n, Pipe.Op state)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `private DepInfo mkdstate(Pipe.Op cstate, Pipe.Op ostate)`

- Description: TODO

#### `private void remrdep(int stidx, TreeSlot rdep)`

- Description: TODO

#### `private void addrdep(int stidx, TreeSlot rdep)`

- Description: TODO

#### `private void adddep(int stidx, TreeSlot dep)`

- Description: TODO

#### `private void rdepupd()`

- Description: TODO

#### `private DepInfo setdstate(DepInfo nst)`

- Description: TODO

#### `private void upddstate(DepInfo nst)`

- Description: TODO

#### `private void updtotal(boolean setds)`

- Description: TODO

#### `private DepInfo dstate()`

- Description: TODO

#### `private void checklockdeps()`

- Description: TODO

#### `public void lockstate()`

- Description: TODO

#### `private void chstate(Pipe.Op cstate, Pipe.Op ostate)`

- Description: TODO

#### `public void cstate(Pipe.Op state)`

- Description: TODO

#### `public void ostate(Pipe.Op state)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public <T extends State> T get(State.Slot<T> slot)`

- Description: TODO

#### `public Pipe copy()`

- Description: TODO

#### `public State[] states()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Pipe pdstate()`

- Description: TODO

#### `private Inheritance istate()`

- Description: TODO

#### `public Node obj()`

- Description: TODO

#### `public GroupPipe state()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public default void added(Slot slot)`

- Description: TODO

#### `public default void removed(Slot slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Iterable<Slot> slots()`

- Description: TODO

#### `public Slot add(Node n, Pipe.Op state)`

- Description: TODO

#### `public Slot add(Node n)`

- Description: TODO

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

#### `public void remove(RenderList<?> list)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `private void dump(TreeSlot slot, int ind)`

- Description: TODO

#### `public void dump()`

- Description: TODO

#### `public String stats()`

- Description: TODO
