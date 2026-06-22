---
source: [RenderContext.java](../../../../src/haven/RenderContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderContext

Owns render-state composition, post-processing, and render-wide lifecycle hooks.

## Nested Types

### FrameFormat

- Role: Describes a framebuffer format.
- Description: Captures the color format, sample count, and size of one render target.

### Global

- Role: Hooks render lifecycle callbacks.
- Description: Interface for state objects that need pre-render and post-render callbacks.

### PostProcessor

- Role: Applies a post-processing pass.
- Description: Ordered render pass that transforms the current frame buffer.

## Members

### Constants

#### `public static final Slot<RenderContext> slot = new Slot<>(Slot.Type.SYS, RenderContext.class)`
- Role: Publishes the render-context slot.
- Description: System pipe slot used to attach the active render context.
- Value: `new Slot<>(Slot.Type.SYS, RenderContext.class)`

#### `public static final int ORDER_RESOLVE = -200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`
- Role: Defines render-pass order constants.
- Description: Shared ordering values for resolve, tonemap, default, and resample passes.
- Value: `-200, ORDER_TONEMAP = -100, ORDER_DEFAULT = 0, ORDER_RESAMPLE = 100`

### Fields

#### `private final List<PostProcessor> post = new ArrayList<>()`
- Role: Stores post-processors.
- Description: Holds the ordered render post-processing pipeline.

#### `private final Map<Global, Integer> global = new IdentityHashMap<>()`
- Role: Stores global hooks.
- Description: Tracks active render-wide lifecycle hooks with reference counts.

#### `public VectorFormat cfmt`
- Role: Stores the color format.
- Description: Describes the framebuffer color layout.

#### `public int samples`
- Role: Stores the sample count.
- Description: Describes multisample depth for the framebuffer format.

#### `public Coord sz`
- Role: Stores the framebuffer size.
- Description: Describes the target render-target dimensions.

#### `public Sampler buf = null`
- Role: Stores the current sampler.
- Description: Caches the sampler used by post-processing passes.

### Methods

#### `public FrameFormat(VectorFormat cfmt, int samples, Coord sz)`
- Role: Creates a framebuffer format.
- Description: Stores the color layout, sample count, and size directly.

#### `public FrameFormat(Texture tex)`
- Role: Derives a framebuffer format.
- Description: Reads the layout and sample count from an existing texture.

#### `public FrameFormat(FrameFormat from)`
- Role: Copies a framebuffer format.
- Description: Duplicates the layout, sample count, and size from another format.

#### `public boolean equals(FrameFormat that)`
- Role: Compares framebuffer formats.
- Description: Returns true when color format, size, and sample count all match.

#### `public boolean equals(Object x)`
- Role: Compares framebuffer formats.
- Description: Returns true when the other object is a matching `FrameFormat`.

#### `public Texture maketex()`
- Role: Creates a matching texture.
- Description: Builds a texture with the current framebuffer size, format, and sample count.

#### `public boolean matching(Texture tex)`
- Role: Tests a texture against the format.
- Description: Returns true when the supplied texture matches this framebuffer format.

#### `public void run(GOut g, Sampler2D in)`
- Role: Runs a post-process pass.
- Description: Applies the post-processor using a 2D texture sampler.

#### `public void run(GOut g, Sampler in)`
- Role: Runs a post-process pass.
- Description: Delegates the sampler to the 2D variant.

#### `public int order()`
- Role: Returns the pass order.
- Description: Uses the default post-process ordering.

#### `public FrameFormat outformat(FrameFormat in)`
- Role: Returns the output format.
- Description: Defaults to the same format as the input pass.

#### `public void dispose()`
- Role: Releases the post-process buffer.
- Description: Disposes the cached sampler when the post-processor is discarded.

#### `public default void prerender(Render out)`
- Role: Runs a pre-render hook.
- Description: Called before the frame is rendered.

#### `public default void postrender(Render out)`
- Role: Runs a post-render hook.
- Description: Called after the frame has been rendered.

#### `public Collection<PostProcessor> postproc()`
- Role: Returns the post-process list.
- Description: Exposes the current ordered post-process pipeline.

#### `public void add(PostProcessor post)`
- Role: Adds a post-processor.
- Description: Inserts the processor and keeps the list ordered by pass sequence.

#### `public void remove(PostProcessor post)`
- Role: Removes a post-processor.
- Description: Deletes the processor from the current render pipeline.

#### `public abstract Pipe.Op basic(Object id)`
- Role: Returns a basic render state.
- Description: Looks up the pipe operation stored under the supplied identifier.

#### `public abstract void basic(Object id, Pipe.Op state)`
- Role: Updates a basic render state.
- Description: Stores or removes the pipe operation for the supplied identifier.

#### `public void add(Global glob)`
- Role: Registers a global hook.
- Description: Adds one reference to a render-global lifecycle hook.

#### `public void put(Global glob)`
- Role: Releases a global hook.
- Description: Drops one reference and disposes the hook when the count reaches zero.

#### `public void prerender(Render out)`
- Role: Runs pre-render hooks.
- Description: Calls every registered global hook before rendering starts.

#### `public void postrender(Render out)`
- Role: Runs post-render hooks.
- Description: Calls every registered global hook after rendering ends.

#### `public ShaderMacro shader()`
- Role: Returns a shader macro.
- Description: Supplies an optional shader override for this render context.

#### `public void apply(Pipe p)`
- Role: Applies the context to a pipe.
- Description: Installs this render context into the supplied pipe.