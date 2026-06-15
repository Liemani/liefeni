# Rendered

This file documents the responsibilities and members of `Rendered`.

## Meta

- Source: [Rendered.java](../../../../src/haven/render/Rendered.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Marks a renderable object.

## Nested Types

### Default

- Description: TODO

## Members

### Constants

#### `public static final State.Slot<Order> order = new State.Slot<>(State.Slot.Type.GEOM, Order.class)`

- Description: TODO

#### `private static final Comparator<Order> cmp = new Comparator<Order>()`

- Description: TODO

#### `public static final Comparator<Order> cmp = new Comparator<Order>()`

- Description: TODO

#### `public static final Model data =`

- Description: TODO

### Fields

#### `private final int z`

- Description: TODO

#### `public final static Order deflt = new Order.Default(0)`

- Description: TODO

#### `public final static Order first = new Order.Default(Integer.MIN_VALUE)`

- Description: TODO

#### `public final static Order last = new Order.Default(Integer.MAX_VALUE)`

- Description: TODO

#### `public final static Order postfx = new Order.Default(5000)`

- Description: TODO

#### `public final static Order postpfx = new Order.Default(5500)`

- Description: TODO

#### `public final static Pipe.Op eyesort = new Order.Default(10000); // XXXRENDER`

- Description: TODO

#### `public final static Pipe.Op eeyesort = new Order.Default(4500); // XXXRENDER`

- Description: TODO

#### `public final Pipe.Op state`

- Description: TODO

### Methods

#### `public void draw(Pipe context, Render out)`

- Description: TODO

#### `public default Object instanceid()`

- Description: TODO

#### `public Instanced instancify(InstanceBatch batch)`

- Description: TODO

#### `public abstract int mainorder()`

- Description: TODO

#### `public abstract Comparator<? super C> comparator()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public Default(int z)`

- Description: TODO

#### `public int mainorder()`

- Description: TODO

#### `public Comparator<Order> comparator()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public ScreenQuad(boolean invert)`

- Description: TODO

#### `public void draw(Pipe state, Render out)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO
