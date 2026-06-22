---
source: [PView.java](../../../../src/haven/PView.java)
created: 2026-06-13
updated: 2026-06-14
---

# PView

Represents the pview Haven component.

## Nested Types

### IntResampler

- Role: Downsamples a render buffer with nearest-neighbor integer scaling.
- Description: Uses integer scale factors when the render size is close to the display size.

### LinResampler

- Role: Rescales a render buffer with linear sampling.
- Description: Draws the offscreen texture back into the widget with linear filtering.

### Render2D

- Role: Marks a render-tree node that can draw into screen space.
- Description: Extends the render tree with a `draw(GOut, Pipe)` callback.

### Resampler

- Role: Base class for post-process resampling passes.
- Description: Carries input and output sizes for resize-aware post-processing.

### ScreenList

- Role: Collects active 2D render nodes.
- Description: Keeps a thread-safe snapshot of screen-space renderers and draws them each frame.

### WidgetContext

- Role: Exposes `PView` as a render context.
- Description: Resolves render-context lookups back to the owning widget and its session/Glob state.

## Members

### Constants

#### `private static final ClassResolver<PView> ctxr = new ClassResolver<PView>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final class resolver<p view> ctxr = new class resolver<p view>() operation.
- Value: `new ClassResolver<PView>()`

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Implements the id fb operation.
- Description: Implements the object operation.
- Value: `new Object(), id_view = new Object(), id_misc = new Object()`

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Implements the id fb operation.
- Description: Implements the object operation.
- Value: `new Object(), id_view = new Object(), id_misc = new Object()`

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Implements the id fb operation.
- Description: Implements the object operation.
- Value: `new Object(), id_view = new Object(), id_misc = new Object()`

### Fields

#### `public final RenderTree tree`
- Role: Caches the tree value.
- Description: Caches the `tree` value for reuse.

#### `public final RenderTree.Slot conf`
- Role: Caches the conf value.
- Description: Caches the `conf` value for reuse.

#### `public final RenderTree.Slot basic`
- Role: Caches the basic value.
- Description: Caches the `basic` value for reuse.

#### `public Texture fragcol = null, depth = null`
- Role: Caches the fragcol value.
- Description: Caches the `fragcol` value for reuse.

#### `public Texture fragcol = null, depth = null`
- Role: Caches the fragcol value.
- Description: Caches the `fragcol` value for reuse.

#### `protected final Light.LightList lights = new Light.LightList()`
- Role: Implements the lights operation.
- Description: Implements the light list operation.

#### `protected Environment env = null`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `protected InstanceList instancer`
- Role: Caches the instancer value.
- Description: Caches the `instancer` value for reuse.

#### `protected DrawList back = null`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `protected Coord rsz`
- Role: Caches the rsz value.
- Description: Caches the `rsz` value for reuse.

#### `private final Map<Object, Pipe.Op> basicstates = new IdentityHashMap<>()`
- Role: Implements the basicstates operation.
- Description: Implements the private final map<object, pipe.op> basicstates = new identity hash map<>() operation.

#### `private ActAudio audio`
- Role: Caches the audio value.
- Description: Caches the `audio` value for reuse.

#### `private final ScreenList list2d = new ScreenList()`
- Role: Implements the list2d operation.
- Description: Implements the screen list operation.

#### `private final TickList ticklist = new TickList()`
- Role: Advances the list state.
- Description: Advances the list state.

#### `private Sampler fragsamp`
- Role: Caches the fragsamp value.
- Description: Caches the `fragsamp` value for reuse.

#### `private PostProcessor tonemap = null`
- Role: Caches the tonemap value.
- Description: Caches the `tonemap` value for reuse.

#### `private final PView wdg`
- Role: Caches the wdg value.
- Description: Caches the `wdg` value for reuse.

#### `private final WidgetContext ctx = new WidgetContext(this)`
- Role: Implements the ctx operation.
- Description: Implements the widget context operation.

#### `private Pipe.Op curconf = null`
- Role: Caches the curconf value.
- Description: Caches the `curconf` value for reuse.

#### `private GSettings curprefs = null`
- Role: Caches the curprefs value.
- Description: Caches the `curprefs` value for reuse.

#### `final Coord isz, osz`
- Role: Caches the osz value.
- Description: Caches the `osz` value for reuse.

#### `final Coord isz, osz`
- Role: Caches the osz value.
- Description: Caches the `osz` value for reuse.

#### `public final int scale`
- Role: Caches the scale value.
- Description: Caches the `scale` value for reuse.

#### `private Resampler pp_resamp = null`
- Role: Caches the pp resamp value.
- Description: Caches the `pp_resamp` value for reuse.

#### `private final Set<Slot<? extends Render2D>> cur = new HashSet<>()`
- Role: Implements the cur operation.
- Description: Implements the private final set<slot<? extends render2 d>> cur = new hash set<>() operation.

### Methods

#### `public PView(Coord sz)`
- Role: Creates a new PView instance.
- Description: Constructs the PView instance from the supplied inputs.

#### `public WidgetContext(PView wdg)`
- Role: Handles the widget context path.
- Description: Implements the widget context operation.

#### `public PView widget()`
- Role: Handles the widget path.
- Description: Implements the widget operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Pipe.Op basic(Object id)`
- Role: Returns the pipe state stored under the supplied identifier.
- Description: Returns the pipe state stored under the supplied identifier.

#### `public void basic(Object id, Pipe.Op state)`
- Role: Stores a basic pipe state under the supplied identifier.
- Description: Stores a basic pipe state under the supplied identifier.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this PView for debugging and logging.

#### `protected Coord rendersz()`
- Role: Handles the rendersz path.
- Description: Renders the sz.

#### `private Pipe.Op conf()`
- Role: Handles the conf path.
- Description: Implements the conf operation.

#### `private Pipe.Op curconf()`
- Role: Handles the current configuration path.
- Description: Implements the curconf operation.

#### `protected GSettings gprefs()`
- Role: Handles the gprefs path.
- Description: Implements the gprefs operation.

#### `private Pipe.Op frame()`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `protected void reconf()`
- Role: Handles the reconf path.
- Description: Implements the reconf operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public Pipe.Op basic(Object id)`
- Role: Returns the pipe state stored under the supplied identifier.
- Description: Returns the pipe state stored under the supplied identifier.

#### `public void basic(Object id, Pipe.Op state)`
- Role: Stores a basic pipe state under the supplied identifier.
- Description: Stores a basic pipe state under the supplied identifier.

#### `protected FColor clearcolor()`
- Role: Clears the color.
- Description: Clears the color.

#### `private static RenderList.Slot<Rendered> uglyJavaCWorkAround(RenderList.Slot<?> slot)`
- Role: Handles the ugly java cwork around path.
- Description: Implements the ugly java c work around operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `Resampler(Coord isz, Coord osz)`
- Role: Handles the resampler workflow.
- Description: Implements the resampler operation.

#### `LinResampler(Coord isz, Coord osz)`
- Role: Handles the lin resampler workflow.
- Description: Implements the lin resampler operation.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public IntResampler(Coord isz, Coord osz, int scale)`
- Role: Handles the int resampler path.
- Description: Implements the int resampler operation.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private GOut resolveout(GOut def, FrameFormat fmt, PostProcessor next)`
- Role: Handles the resolveout path.
- Description: Resolves the out.

#### `protected void resolve(GOut g)`
- Role: Resolves the target value.
- Description: Resolves the requested value from the current runtime state.

#### `public void add(PostProcessor post)`
- Role: Adds a post-processor to the active render pipeline.
- Description: Adds a post-processor to the active render pipeline.

#### `public void remove(PostProcessor post)`
- Role: Removes a post-processor from the active render pipeline.
- Description: Removes a post-processor from the active render pipeline.

#### `public void tonemap(PostProcessor tonemap)`
- Role: Handles the tonemap path.
- Description: Implements the tonemap operation.

#### `protected void envsetup()`
- Role: Handles the envsetup path.
- Description: Implements the envsetup operation.

#### `protected void envdispose()`
- Role: Handles the envdispose path.
- Description: Implements the envdispose operation.

#### `protected void maindraw(Render out)`
- Role: Handles the maindraw path.
- Description: Implements the maindraw operation.

#### `public void gtick(Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the PView content.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `protected void basic()`
- Role: Returns the pipe state stored under the supplied identifier.
- Description: Returns the pipe state stored under the supplied identifier.

#### `protected void attached()`
- Role: Handles the attached path.
- Description: Implements the attached operation.

#### `protected void lights()`
- Role: Handles the lights path.
- Description: Implements the lights operation.

#### `public void draw(GOut g, Pipe state)`
- Role: Draws the current content.
- Description: Draws the PView content.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the PView content.

#### `public void add(Slot<? extends Render2D> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Slot<? extends Render2D> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends Render2D> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Pipe group, int[] statemask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.