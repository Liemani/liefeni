---
source: [RUtils.java](../../../../src/haven/RUtils.java)
created: 2026-06-13
updated: 2026-06-14
---

# RUtils

Represents the rutils Haven component.

## Nested Types

### AdHoc

- Role: Represents ad hoc within RUtils.
- Description: Describes the nested ad hoc type used by the enclosing class.

### ComposedNode

- Role: Represents composed node within RUtils.
- Description: Describes the nested composed node type used by the enclosing class.

### CubeFill

- Role: Represents cube fill within RUtils.
- Description: Describes the nested cube fill type used by the enclosing class.

### GeomAdHoc

- Role: Represents geom ad hoc within RUtils.
- Description: Describes the nested geom ad hoc type used by the enclosing class.

### StateNode

- Role: Represents state node within RUtils.
- Description: Describes the nested state node type used by the enclosing class.

### StateTickNode

- Role: Represents state tick node within RUtils.
- Description: Describes the nested state tick node type used by the enclosing class.

## Members

### Constants

#### `private static final int[][] deforder =`
- Role: Caches the deforder value.
- Description: Caches the `deforder` value for reuse.
- Value: ``

#### `public static final State.Slot<State> adhoc = new State.Slot<>(State.Slot.Type.DRAW, State.class)`
- Role: Implements the adhoc operation.
- Description: Implements the public static final state.slot<state> adhoc = new state.slot<>(state.slot.type.draw, state.class) operation.
- Value: `new State.Slot<>(State.Slot.Type.DRAW, State.class)`

#### `public static final State.Slot<State> adhocg = new State.Slot<State>(State.Slot.Type.GEOM, State.class)`
- Role: Implements the adhocg operation.
- Description: Implements the public static final state.slot<state> adhocg = new state.slot<state>(state.slot.type.geom, state.class) operation.
- Value: `new State.Slot<State>(State.Slot.Type.GEOM, State.class)`

### Fields

#### `public final R r`
- Role: Caches the r value.
- Description: Caches the `r` value for reuse.

#### `private final Collection<Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the private final collection<slot> slots = new array list<>(1) operation.

#### `private Op cstate`
- Role: Caches the cstate value.
- Description: Caches the `cstate` value for reuse.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Caches the `inited` value for reuse.

#### `public final Supplier<BufferedImage> src`
- Role: Caches the src value.
- Description: Carries the source drag widget.

#### `public final int[][] order`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

#### `private BufferedImage data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final ShaderMacro sh`
- Role: Caches the sh value.
- Description: Caches the `sh` value for reuse.

#### `private final ShaderMacro sh`
- Role: Caches the sh value.
- Description: Caches the `sh` value for reuse.

#### `private final Node[] children`
- Role: Caches the children value.
- Description: Caches the `children` value for reuse.

### Methods

#### `public static Collection<Slot> multiadd(Collection<Slot> slots, Node node)`
- Role: Handles the multiadd path.
- Description: Implements the multiadd operation.

#### `public static void multirem(Collection<Slot> slots)`
- Role: Handles the multirem path.
- Description: Implements the multirem operation.

#### `public static void readd(Collection<Slot> slots, Consumer<Slot> add, Runnable revert)`
- Role: Handles the readd path.
- Description: Implements the readd operation.

#### `public StateNode(R r)`
- Role: Handles the state node path.
- Description: Implements the state node operation.

#### `protected abstract Op state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void added(Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public static <R extends RenderTree.Node> StateNode<R> of(R r, Supplier<? extends Op> st)`
- Role: Builds a RUtils value from the supplied components.
- Description: Builds a RUtils value from the supplied components.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this RUtils for debugging and logging.

#### `public StateTickNode(R r)`
- Role: Handles the state tick node path.
- Description: Implements the state tick node operation.

#### `public TickList.Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void autotick(double dt)`
- Role: Handles the autotick path.
- Description: Implements the autotick operation.

#### `public static <R extends RenderTree.Node> StateTickNode<R> of(R r, Supplier<? extends Op> st)`
- Role: Builds a RUtils value from the supplied components.
- Description: Builds a RUtils value from the supplied components.

#### `public CubeFill(Supplier<BufferedImage> src)`
- Role: Handles the cube fill path.
- Description: Implements the cube fill operation.

#### `private Coord osz()`
- Role: Handles the osz path.
- Description: Implements the osz operation.

#### `private BufferedImage getsrc(TextureCube tex)`
- Role: Handles the getsrc path.
- Description: Returns the src.

#### `public FillBuffer fill(Image gimg, Environment env)`
- Role: Handles the fill path.
- Description: Implements the fill operation.

#### `public void done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public TextureCube mktex()`
- Role: Handles the mktex path.
- Description: Implements the mktex operation.

#### `public AdHoc(ShaderMacro sh)`
- Role: Handles the ad hoc path.
- Description: Implements the ad hoc operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public GeomAdHoc(ShaderMacro sh)`
- Role: Handles the geom ad hoc path.
- Description: Implements the geom ad hoc operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public ComposedNode(Node... children)`
- Role: Handles the composed node path.
- Description: Implements the composed node operation.

#### `public void added(Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public static Node compose(Node... children)`
- Role: Handles the compose path.
- Description: Implements the compose operation.

#### `public static Node compose(Collection<? extends Node> children)`
- Role: Handles the compose path.
- Description: Implements the compose operation.