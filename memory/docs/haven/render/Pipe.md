# Pipe

This file documents the responsibilities and members of `Pipe`.

## Meta

- Source: [Pipe.java](../../../../src/haven/render/Pipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render pipe.

## Members

### Constants

#### `public static final Op nil = new Nil()`

- Description: TODO

#### `public static final Pipe nil = new Nil()`

- Description: TODO

### Fields

#### `private final Op[] ops`

- Description: TODO

#### `public final RenderTree.Node r`

- Description: TODO

#### `public final Op op`

- Description: TODO

#### `public final boolean locked`

- Description: TODO

### Methods

#### `public <T extends State> T get(Slot<T> slot)`

- Description: TODO

#### `public Pipe copy()`

- Description: TODO

#### `public State[] states()`

- Description: TODO

#### `public default <T extends State> void put(Slot<? super T> slot, T state)`

- Description: TODO

#### `public default void copy(Pipe from)`

- Description: TODO

#### `public void apply(Pipe pipe)`

- Description: TODO

#### `public Composed(Op... ops)`

- Description: TODO

#### `public void apply(Pipe pipe)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void apply(Pipe pipe)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static Op compose(Op... ops)`

- Description: TODO

#### `public Wrapping(RenderTree.Node r, Op op, boolean locked)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public NodeWrap wrap()`

- Description: TODO

#### `public RenderTree.Node wrapped()`

- Description: TODO

#### `public default Wrapping apply(RenderTree.Node r, boolean locked)`

- Description: TODO

#### `public default Wrapping apply(RenderTree.Node r)`

- Description: TODO

#### `public default Pipe prep(Op op)`

- Description: TODO

#### `public static int hashCode(State[] states)`

- Description: TODO

#### `public static boolean equals(State[] as, State[] bs)`

- Description: TODO

#### `public <T extends State> T get(Slot<T> slot)`

- Description: TODO

#### `public Pipe copy()`

- Description: TODO

#### `public State[] states()`

- Description: TODO
