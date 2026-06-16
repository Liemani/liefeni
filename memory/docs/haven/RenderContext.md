# RenderContext

This file documents the responsibilities and members of `RenderContext`.

## Meta

- Source: [RenderContext.java](../../../src/haven/RenderContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the render context Haven component.

## Nested Types

### FrameFormat

- Role: Represents frame format within RenderContext.
- Description: Describes the nested frame format type used by the enclosing class.

### Global

- Role: Represents global within RenderContext.
- Description: Describes the nested global type used by the enclosing class.

### PostProcessor

- Role: Represents post processor within RenderContext.
- Description: Describes the nested post processor type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<RenderContext> slot = new Slot<>(Slot.Type.SYS, RenderContext.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`
- Role: Defines the shared order resolve constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`
- Role: Defines the shared order resolve constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`
- Role: Defines the shared order resolve constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`
- Role: Defines the shared order resolve constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final List<PostProcessor> post = new ArrayList<>()`
- Role: Caches post entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Global, Integer> global = new IdentityHashMap<>()`
- Role: Caches global entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public VectorFormat cfmt`
- Role: Holds the cfmt state.
- Description: Backs the cached state for this file.

#### `public int samples`
- Role: Stores the samples value.
- Description: Backs the cached state for this file.

#### `public Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public Sampler buf = null`
- Role: Holds the buf state.
- Description: Backs the cached state for this file.

### Methods

#### `public FrameFormat(VectorFormat cfmt, int samples, Coord sz)`
- Role: Performs frame format.
- Description: Supports the frame format operation used by the surrounding class.

#### `public FrameFormat(Texture tex)`
- Role: Performs frame format.
- Description: Supports the frame format operation used by the surrounding class.

#### `public FrameFormat(FrameFormat from)`
- Role: Performs frame format.
- Description: Supports the frame format operation used by the surrounding class.

#### `public boolean equals(FrameFormat that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Texture maketex()`
- Role: Performs maketex.
- Description: Supports the maketex operation used by the surrounding class.

#### `public boolean matching(Texture tex)`
- Role: Performs matching.
- Description: Supports the matching operation used by the surrounding class.

#### `public void run(GOut g, Sampler2D in)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void run(GOut g, Sampler in)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public FrameFormat outformat(FrameFormat in)`
- Role: Performs outformat.
- Description: Supports the outformat operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public default void prerender(Render out)`
- Role: Performs prerender.
- Description: Supports the prerender operation used by the surrounding class.

#### `public default void postrender(Render out)`
- Role: Performs postrender.
- Description: Supports the postrender operation used by the surrounding class.

#### `public Collection<PostProcessor> postproc()`
- Role: Performs postproc.
- Description: Supports the postproc operation used by the surrounding class.

#### `public void add(PostProcessor post)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(PostProcessor post)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public abstract Pipe.Op basic(Object id)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public abstract void basic(Object id, Pipe.Op state)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public void add(Global glob)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void put(Global glob)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public void prerender(Render out)`
- Role: Performs prerender.
- Description: Supports the prerender operation used by the surrounding class.

#### `public void postrender(Render out)`
- Role: Performs postrender.
- Description: Supports the postrender operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
