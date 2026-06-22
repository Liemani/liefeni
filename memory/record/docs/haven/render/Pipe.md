---
source: [Pipe.java](../../../../../src/haven/render/Pipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pipe

Defines the pipe render pipeline component.

## Members

### Constants

#### `public static final Op nil = new Nil()`
- Role: Implements the nil operation.
- Description: Implements the nil operation.
- Value: `new Nil()`

#### `public static final Pipe nil = new Nil()`
- Role: Implements the nil operation.
- Description: Implements the nil operation.
- Value: `new Nil()`

### Fields

#### `private final Op[] ops`
- Role: Caches the ops value.
- Description: Caches the `ops` value for reuse.

#### `public final RenderTree.Node r`
- Role: Caches the r value.
- Description: Caches the `r` value for reuse.

#### `public final Op op`
- Role: Caches the op value.
- Description: Caches the `op` value for reuse.

#### `public final boolean locked`
- Role: Tracks the locked flag.
- Description: Caches the `locked` value for reuse.

### Methods

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.

#### `public default <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public default void copy(Pipe from)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public Composed(Op... ops)`
- Role: Handles the composed path.
- Description: Implements the composed operation.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Pipe for debugging and logging.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Pipe for debugging and logging.

#### `public static Op compose(Op... ops)`
- Role: Handles the compose path.
- Description: Implements the compose operation.

#### `public Wrapping(RenderTree.Node r, Op op, boolean locked)`
- Role: Handles the wrapping path.
- Description: Implements the wrapping operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Pipe for debugging and logging.

#### `public NodeWrap wrap()`
- Role: Handles the wrap path.
- Description: Implements the wrap operation.

#### `public RenderTree.Node wrapped()`
- Role: Handles the wrapped path.
- Description: Implements the wrapped operation.

#### `public default Wrapping apply(RenderTree.Node r, boolean locked)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public default Wrapping apply(RenderTree.Node r)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public default Pipe prep(Op op)`
- Role: Handles the prep path.
- Description: Implements the prep operation.

#### `public static int hashCode(State[] states)`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public static boolean equals(State[] as, State[] bs)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.