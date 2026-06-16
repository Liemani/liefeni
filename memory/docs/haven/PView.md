# PView

This file documents the responsibilities and members of `PView`.

## Meta

- Source: [PView.java](../../../src/haven/PView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the pview Haven component.

## Nested Types

### IntResampler

- Role: Represents int resampler within PView.
- Description: Describes the nested int resampler type used by the enclosing class.

### LinResampler

- Role: Represents lin resampler within PView.
- Description: Describes the nested lin resampler type used by the enclosing class.

### Render2D

- Role: Represents render2 d within PView.
- Description: Describes the nested render2 d type used by the enclosing class.

### Resampler

- Role: Represents resampler within PView.
- Description: Describes the nested resampler type used by the enclosing class.

### ScreenList

- Role: Represents screen list within PView.
- Description: Describes the nested screen list type used by the enclosing class.

### WidgetContext

- Role: Represents widget context within PView.
- Description: Describes the nested widget context type used by the enclosing class.

## Members

### Constants

#### `private static final ClassResolver<PView> ctxr = new ClassResolver<PView>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Defines the shared id fb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Defines the shared id fb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`
- Role: Defines the shared id fb constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final RenderTree tree`
- Role: Holds the tree state.
- Description: Backs the cached state for this file.

#### `public final RenderTree.Slot conf`
- Role: Holds the conf state.
- Description: Backs the cached state for this file.

#### `public final RenderTree.Slot basic`
- Role: Holds the basic state.
- Description: Backs the cached state for this file.

#### `public Texture fragcol = null, depth = null`
- Role: Stores the fragcol value.
- Description: Backs the cached state for this file.

#### `public Texture fragcol = null, depth = null`
- Role: Stores the fragcol value.
- Description: Backs the cached state for this file.

#### `protected final Light.LightList lights = new Light.LightList()`
- Role: Caches lights entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected Environment env = null`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `protected InstanceList instancer`
- Role: Caches instancer entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected DrawList back = null`
- Role: Caches back entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected Coord rsz`
- Role: Stores the rsz value.
- Description: Backs the cached state for this file.

#### `private final Map<Object, Pipe.Op> basicstates = new IdentityHashMap<>()`
- Role: Caches basicstates entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ActAudio audio`
- Role: Stores the audio value.
- Description: Backs the cached state for this file.

#### `private final ScreenList list2d = new ScreenList()`
- Role: Caches list2d entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final TickList ticklist = new TickList()`
- Role: Caches ticklist entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Sampler fragsamp`
- Role: Holds the fragsamp state.
- Description: Backs the cached state for this file.

#### `private PostProcessor tonemap = null`
- Role: Holds the tonemap state.
- Description: Backs the cached state for this file.

#### `private final PView wdg`
- Role: Holds the wdg state.
- Description: Backs the cached state for this file.

#### `private final WidgetContext ctx = new WidgetContext(this)`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `private Pipe.Op curconf = null`
- Role: Holds the curconf state.
- Description: Backs the cached state for this file.

#### `private GSettings curprefs = null`
- Role: Holds the curprefs state.
- Description: Backs the cached state for this file.

#### `final Coord isz, osz`
- Role: Stores the osz value.
- Description: Backs the cached state for this file.

#### `final Coord isz, osz`
- Role: Stores the osz value.
- Description: Backs the cached state for this file.

#### `public final int scale`
- Role: Stores the scale value.
- Description: Backs the cached state for this file.

#### `private Resampler pp_resamp = null`
- Role: Holds the pp resamp state.
- Description: Backs the cached state for this file.

#### `private final Set<Slot<? extends Render2D>> cur = new HashSet<>()`
- Role: Caches cur entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public PView(Coord sz)`
- Role: Creates a new PView instance.
- Description: Constructs the instance and initializes its default state.

#### `public WidgetContext(PView wdg)`
- Role: Performs widget context.
- Description: Supports the widget context operation used by the surrounding class.

#### `public PView widget()`
- Role: Performs widget.
- Description: Supports the widget operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Pipe.Op basic(Object id)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public void basic(Object id, Pipe.Op state)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `protected Coord rendersz()`
- Role: Performs rendersz.
- Description: Supports the rendersz operation used by the surrounding class.

#### `private Pipe.Op conf()`
- Role: Performs conf.
- Description: Supports the conf operation used by the surrounding class.

#### `private Pipe.Op curconf()`
- Role: Performs curconf.
- Description: Supports the curconf operation used by the surrounding class.

#### `protected GSettings gprefs()`
- Role: Performs gprefs.
- Description: Supports the gprefs operation used by the surrounding class.

#### `private Pipe.Op frame()`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `protected void reconf()`
- Role: Performs reconf.
- Description: Supports the reconf operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public Pipe.Op basic(Object id)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public void basic(Object id, Pipe.Op state)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `protected FColor clearcolor()`
- Role: Returns the clear color value.
- Description: Exposes the requested value without mutating state.

#### `private static RenderList.Slot<Rendered> uglyJavaCWorkAround(RenderList.Slot<?> slot)`
- Role: Performs ugly java cwork around.
- Description: Supports the ugly java cwork around operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `Resampler(Coord isz, Coord osz)`
- Role: Handles the resampler workflow.
- Description: Supports the resampler operation used by the surrounding class.

#### `LinResampler(Coord isz, Coord osz)`
- Role: Handles the lin resampler workflow.
- Description: Supports the lin resampler operation used by the surrounding class.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public IntResampler(Coord isz, Coord osz, int scale)`
- Role: Performs int resampler.
- Description: Supports the int resampler operation used by the surrounding class.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private GOut resolveout(GOut def, FrameFormat fmt, PostProcessor next)`
- Role: Performs resolveout.
- Description: Supports the resolveout operation used by the surrounding class.

#### `protected void resolve(GOut g)`
- Role: Resolves the target value.
- Description: Supports the resolve operation used by the surrounding class.

#### `public void add(PostProcessor post)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(PostProcessor post)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void tonemap(PostProcessor tonemap)`
- Role: Performs tonemap.
- Description: Supports the tonemap operation used by the surrounding class.

#### `protected void envsetup()`
- Role: Performs envsetup.
- Description: Supports the envsetup operation used by the surrounding class.

#### `protected void envdispose()`
- Role: Performs envdispose.
- Description: Supports the envdispose operation used by the surrounding class.

#### `protected void maindraw(Render out)`
- Role: Performs maindraw.
- Description: Supports the maindraw operation used by the surrounding class.

#### `public void gtick(Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `protected void basic()`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `protected void lights()`
- Role: Performs lights.
- Description: Supports the lights operation used by the surrounding class.

#### `public void draw(GOut g, Pipe state)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void add(Slot<? extends Render2D> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends Render2D> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends Render2D> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] statemask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.
