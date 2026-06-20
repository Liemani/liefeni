---
source: [Pipe.java](../../../../src/haven/render/Pipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pipe

Defines the pipe render pipeline component.

## Members

### Constants

#### `public static final Op nil = new Nil()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe nil = new Nil()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Op[] ops`
- Role: Holds the ops state.
- Description: Backs the cached state for this file.

#### `public final RenderTree.Node r`
- Role: Stores the r value.
- Description: Backs the cached state for this file.

#### `public final Op op`
- Role: Holds the op state.
- Description: Backs the cached state for this file.

#### `public final boolean locked`
- Role: Tracks the locked flag.
- Description: Supports the locked operation used by the surrounding class.

### Methods

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public default <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public default void copy(Pipe from)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Composed(Op... ops)`
- Role: Performs composed.
- Description: Supports the composed operation used by the surrounding class.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void apply(Pipe pipe)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static Op compose(Op... ops)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public Wrapping(RenderTree.Node r, Op op, boolean locked)`
- Role: Performs wrapping.
- Description: Supports the wrapping operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public NodeWrap wrap()`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.

#### `public RenderTree.Node wrapped()`
- Role: Performs wrapped.
- Description: Supports the wrapped operation used by the surrounding class.

#### `public default Wrapping apply(RenderTree.Node r, boolean locked)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public default Wrapping apply(RenderTree.Node r)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public default Pipe prep(Op op)`
- Role: Performs prep.
- Description: Supports the prep operation used by the surrounding class.

#### `public static int hashCode(State[] states)`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public static boolean equals(State[] as, State[] bs)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.
