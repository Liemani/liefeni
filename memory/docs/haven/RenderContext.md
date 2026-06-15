# RenderContext

This file documents the responsibilities and members of `RenderContext`.

## Meta

- Source: [RenderContext.java](../../../src/haven/RenderContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render context contract.

## Nested Types

### FrameFormat

- Description: TODO

### Global

- Description: TODO

### PostProcessor

- Description: TODO

## Members

### Constants

#### `public static final Slot<RenderContext> slot = new Slot<>(Slot.Type.SYS, RenderContext.class)`

- Description: TODO

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`

- Description: TODO

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`

- Description: TODO

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`

- Description: TODO

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`

- Description: TODO

### Fields

#### `private final List<PostProcessor> post = new ArrayList<>()`

- Description: TODO

#### `private final Map<Global, Integer> global = new IdentityHashMap<>()`

- Description: TODO

#### `public VectorFormat cfmt`

- Description: TODO

#### `public int samples`

- Description: TODO

#### `public Coord sz`

- Description: TODO

#### `public Sampler buf = null`

- Description: TODO

### Methods

#### `public FrameFormat(VectorFormat cfmt, int samples, Coord sz)`

- Description: TODO

#### `public FrameFormat(Texture tex)`

- Description: TODO

#### `public FrameFormat(FrameFormat from)`

- Description: TODO

#### `public boolean equals(FrameFormat that)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public Texture maketex()`

- Description: TODO

#### `public boolean matching(Texture tex)`

- Description: TODO

#### `public void run(GOut g, Sampler2D in)`

- Description: TODO

#### `public void run(GOut g, Sampler in)`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public FrameFormat outformat(FrameFormat in)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public default void prerender(Render out)`

- Description: TODO

#### `public default void postrender(Render out)`

- Description: TODO

#### `public Collection<PostProcessor> postproc()`

- Description: TODO

#### `public void add(PostProcessor post)`

- Description: TODO

#### `public void remove(PostProcessor post)`

- Description: TODO

#### `public abstract Pipe.Op basic(Object id)`

- Description: TODO

#### `public abstract void basic(Object id, Pipe.Op state)`

- Description: TODO

#### `public void add(Global glob)`

- Description: TODO

#### `public void put(Global glob)`

- Description: TODO

#### `public void prerender(Render out)`

- Description: TODO

#### `public void postrender(Render out)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
