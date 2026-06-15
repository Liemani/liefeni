# RUtils

This file documents the responsibilities and members of `RUtils`.

## Meta

- Source: [RUtils.java](../../../src/haven/RUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides runtime utilities.

## Nested Types

### AdHoc

- Description: TODO

### ComposedNode

- Description: TODO

### CubeFill

- Description: TODO

### GeomAdHoc

- Description: TODO

### StateNode

- Description: TODO

### StateTickNode

- Description: TODO

## Members

### Constants

#### `private static final int[][] deforder =`

- Description: TODO

#### `public static final State.Slot<State> adhoc = new State.Slot<>(State.Slot.Type.DRAW, State.class)`

- Description: TODO

#### `public static final State.Slot<State> adhocg = new State.Slot<State>(State.Slot.Type.GEOM, State.class)`

- Description: TODO

### Fields

#### `public final R r`

- Description: TODO

#### `private final Collection<Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `private Op cstate`

- Description: TODO

#### `private boolean inited = false`

- Description: TODO

#### `public final Supplier<BufferedImage> src`

- Description: TODO

#### `public final int[][] order`

- Description: TODO

#### `private BufferedImage data`

- Description: TODO

#### `private final ShaderMacro sh`

- Description: TODO

#### `private final ShaderMacro sh`

- Description: TODO

#### `private final Node[] children`

- Description: TODO

### Methods

#### `public static Collection<Slot> multiadd(Collection<Slot> slots, Node node)`

- Description: TODO

#### `public static void multirem(Collection<Slot> slots)`

- Description: TODO

#### `public static void readd(Collection<Slot> slots, Consumer<Slot> add, Runnable revert)`

- Description: TODO

#### `public StateNode(R r)`

- Description: TODO

#### `protected abstract Op state()`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public void added(Slot slot)`

- Description: TODO

#### `public void removed(Slot slot)`

- Description: TODO

#### `public static <R extends RenderTree.Node> StateNode<R> of(R r, Supplier<? extends Op> st)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public StateTickNode(R r)`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public void autotick(double dt)`

- Description: TODO

#### `public static <R extends RenderTree.Node> StateTickNode<R> of(R r, Supplier<? extends Op> st)`

- Description: TODO

#### `public CubeFill(Supplier<BufferedImage> src)`

- Description: TODO

#### `private Coord osz()`

- Description: TODO

#### `private BufferedImage getsrc(TextureCube tex)`

- Description: TODO

#### `public FillBuffer fill(Image gimg, Environment env)`

- Description: TODO

#### `public void done()`

- Description: TODO

#### `public TextureCube mktex()`

- Description: TODO

#### `public AdHoc(ShaderMacro sh)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public GeomAdHoc(ShaderMacro sh)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public ComposedNode(Node... children)`

- Description: TODO

#### `public void added(Slot slot)`

- Description: TODO

#### `public static Node compose(Node... children)`

- Description: TODO

#### `public static Node compose(Collection<? extends Node> children)`

- Description: TODO
