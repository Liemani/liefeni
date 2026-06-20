---
source: [Rendered.java](../../../../src/haven/render/Rendered.java)
created: 2026-06-13
updated: 2026-06-14
---

# Rendered

Defines the rendered render pipeline component.

## Nested Types

### Default

- Role: Represents default within Rendered.
- Description: Describes the nested default type used by the enclosing class.

## Members

### Constants

#### `public static final State.Slot<Order> order = new State.Slot<>(State.Slot.Type.GEOM, Order.class)`
- Role: Defines the shared order constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Comparator<Order> cmp = new Comparator<Order>()`
- Role: Defines the shared cmp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Comparator<Order> cmp = new Comparator<Order>()`
- Role: Defines the shared cmp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Model data =`
- Role: Defines the shared rendered constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final int z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public final static Order deflt = new Order.Default(0)`
- Role: Holds the deflt state.
- Description: Backs the cached state for this file.

#### `public final static Order first = new Order.Default(Integer.MIN_VALUE)`
- Role: Holds the first state.
- Description: Backs the cached state for this file.

#### `public final static Order last = new Order.Default(Integer.MAX_VALUE)`
- Role: Holds the last state.
- Description: Backs the cached state for this file.

#### `public final static Order postfx = new Order.Default(5000)`
- Role: Holds the postfx state.
- Description: Backs the cached state for this file.

#### `public final static Order postpfx = new Order.Default(5500)`
- Role: Holds the postpfx state.
- Description: Backs the cached state for this file.

#### `public final static Pipe.Op eyesort = new Order.Default(10000); // XXXRENDER`
- Role: Holds the eyesort state.
- Description: Backs the cached state for this file.

#### `public final static Pipe.Op eeyesort = new Order.Default(4500); // XXXRENDER`
- Role: Holds the eeyesort state.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op state`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

### Methods

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public default Object instanceid()`
- Role: Performs instanceid.
- Description: Supports the instanceid operation used by the surrounding class.

#### `public Instanced instancify(InstanceBatch batch)`
- Role: Performs instancify.
- Description: Supports the instancify operation used by the surrounding class.

#### `public abstract int mainorder()`
- Role: Performs mainorder.
- Description: Supports the mainorder operation used by the surrounding class.

#### `public abstract Comparator<? super C> comparator()`
- Role: Performs comparator.
- Description: Supports the comparator operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Default(int z)`
- Role: Performs default.
- Description: Supports the default operation used by the surrounding class.

#### `public int mainorder()`
- Role: Performs mainorder.
- Description: Supports the mainorder operation used by the surrounding class.

#### `public Comparator<Order> comparator()`
- Role: Performs comparator.
- Description: Supports the comparator operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public ScreenQuad(boolean invert)`
- Role: Performs screen quad.
- Description: Supports the screen quad operation used by the surrounding class.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.
