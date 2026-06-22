---
source: [Rendered.java](../../../../../src/haven/render/Rendered.java)
created: 2026-06-13
updated: 2026-06-14
---

# Rendered

Defines the common contract for render-tree objects that can draw themselves.

## Nested Types

### Default

- Role: Provides a fixed render-order key.
- Description: Wraps a numeric order so renderables can be sorted consistently.

## Members

### Constants

#### `public static final State.Slot<Order> order = new State.Slot<>(State.Slot.Type.GEOM, Order.class)`
- Role: Stores the render-order key in the geometry pipe.
- Description: Lets the tree sort renderables by their declared order.
- Value: `new State.Slot<>(State.Slot.Type.GEOM, Order.class)`

#### `private static final Comparator<Order> cmp = new Comparator<Order>()`
- Role: Compares render-order keys.
- Description: Sorts renderables by numeric order.
- Value: `new Comparator<Order>()`

#### `public static final Comparator<Order> cmp = new Comparator<Order>()`
- Role: Exposes the render-order comparator.
- Description: Provides the shared comparator used by render sorting.
- Value: `new Comparator<Order>()`

#### `public static final Model data =`
- Role: Stores the fullscreen quad geometry.
- Description: Used by render helpers that draw a screen-space quad.
- Value: ``

### Fields

#### `private final int z`
- Role: Stores the numeric order key.
- Description: Used to sort renderables relative to one another.

#### `public final static Order deflt = new Order.Default(0)`
- Role: Represents the default draw order.
- Description: Uses the standard order value `0`.

#### `public final static Order first = new Order.Default(Integer.MIN_VALUE)`
- Role: Represents the earliest draw order.
- Description: Uses the minimum integer order value.

#### `public final static Order last = new Order.Default(Integer.MAX_VALUE)`
- Role: Represents the latest draw order.
- Description: Uses the maximum integer order value.

#### `public final static Order postfx = new Order.Default(5000)`
- Role: Represents post-processing draws.
- Description: Orders effects after ordinary world rendering.

#### `public final static Order postpfx = new Order.Default(5500)`
- Role: Represents post-processing passes that still precede final effects.
- Description: Sits after postfx but before later screen effects.

#### `public final static Pipe.Op eyesort = new Order.Default(10000); // XXXRENDER`
- Role: Represents camera-sorted world draws.
- Description: Used for geometry that should sort around the viewer.

#### `public final static Pipe.Op eeyesort = new Order.Default(4500); // XXXRENDER`
- Role: Represents a lower-priority camera-sorted pass.
- Description: Keeps related eye-sorted draws ordered below the main pass.

#### `public final Pipe.Op state`
- Role: Stores the render state used by this renderable.
- Description: Applied to the pipe before issuing the draw call.

### Methods

#### `public void draw(Pipe context, Render out)`
- Role: Issues the renderable's draw call.
- Description: Submits the object using the current pipe state.

#### `public default Object instanceid()`
- Role: Returns the instancing key.
- Description: Groups identical renderables for instanced drawing.

#### `public Instanced instancify(InstanceBatch batch)`
- Role: Creates an instanced renderable view.
- Description: Wraps the renderable so it can be drawn as part of a batch.

#### `public abstract int mainorder()`
- Role: Returns the primary sort key.
- Description: Controls where the renderable is placed in draw order.

#### `public abstract Comparator<? super C> comparator()`
- Role: Returns the comparator for render-order keys.
- Description: Compares two order keys while sorting the render tree.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro for this renderable.
- Description: Exposes any additional shader state contributed by the object.

#### `public void apply(Pipe p)`
- Role: Installs renderable state into the pipe.
- Description: Writes the renderable's state into the current draw pipeline.

#### `public Default(int z)`
- Role: Creates a fixed-order key.
- Description: Wraps one numeric sort value for ordinary renderables.

#### `public int mainorder()`
- Role: Returns the fixed draw order.
- Description: Reports the wrapped numeric order.

#### `public Comparator<Order> comparator()`
- Role: Returns the order comparator.
- Description: Compares two fixed order values by numeric rank.

#### `public String toString()`
- Role: Formats the render order for debugging.
- Description: Returns the numeric order as a string.

#### `public ScreenQuad(boolean invert)`
- Role: Creates a fullscreen quad renderable.
- Description: Optionally inverts the quad texture coordinates for screen passes.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the fullscreen quad.
- Description: Submits the screen-space quad with the provided pipe state.

#### `public void added(RenderTree.Slot slot)`
- Role: Hooks the quad into the render tree.
- Description: Installs the screen quad when the render-tree slot is added.
