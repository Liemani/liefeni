# RUtils

This file documents the responsibilities and members of `RUtils`.

## Meta

- Source: [RUtils.java](../../../src/haven/RUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared rutils constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.Slot<State> adhoc = new State.Slot<>(State.Slot.Type.DRAW, State.class)`
- Role: Defines the shared adhoc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.Slot<State> adhocg = new State.Slot<State>(State.Slot.Type.GEOM, State.class)`
- Role: Defines the shared adhocg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final R r`
- Role: Holds the r state.
- Description: Backs the cached state for this file.

#### `private final Collection<Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Op cstate`
- Role: Holds the cstate state.
- Description: Backs the cached state for this file.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `public final Supplier<BufferedImage> src`
- Role: Stores the src value.
- Description: Backs the cached state for this file.

#### `public final int[][] order`
- Role: Stores the order value.
- Description: Backs the cached state for this file.

#### `private BufferedImage data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro sh`
- Role: Holds the sh state.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro sh`
- Role: Holds the sh state.
- Description: Backs the cached state for this file.

#### `private final Node[] children`
- Role: Stores the children value.
- Description: Backs the cached state for this file.

### Methods

#### `public static Collection<Slot> multiadd(Collection<Slot> slots, Node node)`
- Role: Performs multiadd.
- Description: Supports the multiadd operation used by the surrounding class.

#### `public static void multirem(Collection<Slot> slots)`
- Role: Performs multirem.
- Description: Supports the multirem operation used by the surrounding class.

#### `public static void readd(Collection<Slot> slots, Consumer<Slot> add, Runnable revert)`
- Role: Performs readd.
- Description: Supports the readd operation used by the surrounding class.

#### `public StateNode(R r)`
- Role: Performs state node.
- Description: Supports the state node operation used by the surrounding class.

#### `protected abstract Op state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void added(Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public static <R extends RenderTree.Node> StateNode<R> of(R r, Supplier<? extends Op> st)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public StateTickNode(R r)`
- Role: Performs state tick node.
- Description: Supports the state tick node operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `public static <R extends RenderTree.Node> StateTickNode<R> of(R r, Supplier<? extends Op> st)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public CubeFill(Supplier<BufferedImage> src)`
- Role: Performs cube fill.
- Description: Supports the cube fill operation used by the surrounding class.

#### `private Coord osz()`
- Role: Performs osz.
- Description: Supports the osz operation used by the surrounding class.

#### `private BufferedImage getsrc(TextureCube tex)`
- Role: Performs getsrc.
- Description: Supports the getsrc operation used by the surrounding class.

#### `public FillBuffer fill(Image gimg, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public TextureCube mktex()`
- Role: Performs mktex.
- Description: Supports the mktex operation used by the surrounding class.

#### `public AdHoc(ShaderMacro sh)`
- Role: Performs ad hoc.
- Description: Supports the ad hoc operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public GeomAdHoc(ShaderMacro sh)`
- Role: Performs geom ad hoc.
- Description: Supports the geom ad hoc operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public ComposedNode(Node... children)`
- Role: Performs composed node.
- Description: Supports the composed node operation used by the surrounding class.

#### `public void added(Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public static Node compose(Node... children)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public static Node compose(Collection<? extends Node> children)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.
