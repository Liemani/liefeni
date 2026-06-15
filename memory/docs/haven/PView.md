# PView

This file documents the responsibilities and members of `PView`.

## Meta

- Source: [PView.java](../../../src/haven/PView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a player view or projection surface.

## Nested Types

### IntResampler

- Description: TODO

### LinResampler

- Description: TODO

### Render2D

- Description: TODO

### Resampler

- Description: TODO

### ScreenList

- Description: TODO

### WidgetContext

- Description: TODO

## Members

### Constants

#### `private static final ClassResolver<PView> ctxr = new ClassResolver<PView>()`

- Description: TODO

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`

- Description: TODO

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`

- Description: TODO

#### `private static final Object id_fb = new Object(), id_view = new Object(), id_misc = new Object()`

- Description: TODO

### Fields

#### `public final RenderTree tree`

- Description: TODO

#### `public final RenderTree.Slot conf`

- Description: TODO

#### `public final RenderTree.Slot basic`

- Description: TODO

#### `public Texture fragcol = null, depth = null`

- Description: TODO

#### `public Texture fragcol = null, depth = null`

- Description: TODO

#### `protected final Light.LightList lights = new Light.LightList()`

- Description: TODO

#### `protected Environment env = null`

- Description: TODO

#### `protected InstanceList instancer`

- Description: TODO

#### `protected DrawList back = null`

- Description: TODO

#### `protected Coord rsz`

- Description: TODO

#### `private final Map<Object, Pipe.Op> basicstates = new IdentityHashMap<>()`

- Description: TODO

#### `private ActAudio audio`

- Description: TODO

#### `private final ScreenList list2d = new ScreenList()`

- Description: TODO

#### `private final TickList ticklist = new TickList()`

- Description: TODO

#### `private Sampler fragsamp`

- Description: TODO

#### `private PostProcessor tonemap = null`

- Description: TODO

#### `private final PView wdg`

- Description: TODO

#### `private final WidgetContext ctx = new WidgetContext(this)`

- Description: TODO

#### `private Pipe.Op curconf = null`

- Description: TODO

#### `private GSettings curprefs = null`

- Description: TODO

#### `final Coord isz, osz`

- Description: TODO

#### `final Coord isz, osz`

- Description: TODO

#### `public final int scale`

- Description: TODO

#### `private Resampler pp_resamp = null`

- Description: TODO

#### `private final Set<Slot<? extends Render2D>> cur = new HashSet<>()`

- Description: TODO

### Methods

#### `public PView(Coord sz)`

- Description: TODO

#### `public WidgetContext(PView wdg)`

- Description: TODO

#### `public PView widget()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Pipe.Op basic(Object id)`

- Description: TODO

#### `public void basic(Object id, Pipe.Op state)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `protected Coord rendersz()`

- Description: TODO

#### `private Pipe.Op conf()`

- Description: TODO

#### `private Pipe.Op curconf()`

- Description: TODO

#### `protected GSettings gprefs()`

- Description: TODO

#### `private Pipe.Op frame()`

- Description: TODO

#### `protected void reconf()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public Pipe.Op basic(Object id)`

- Description: TODO

#### `public void basic(Object id, Pipe.Op state)`

- Description: TODO

#### `protected FColor clearcolor()`

- Description: TODO

#### `private static RenderList.Slot<Rendered> uglyJavaCWorkAround(RenderList.Slot<?> slot)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `Resampler(Coord isz, Coord osz)`

- Description: TODO

#### `LinResampler(Coord isz, Coord osz)`

- Description: TODO

#### `public void run(GOut g, Texture2D.Sampler2D in)`

- Description: TODO

#### `public IntResampler(Coord isz, Coord osz, int scale)`

- Description: TODO

#### `public void run(GOut g, Texture2D.Sampler2D in)`

- Description: TODO

#### `private GOut resolveout(GOut def, FrameFormat fmt, PostProcessor next)`

- Description: TODO

#### `protected void resolve(GOut g)`

- Description: TODO

#### `public void add(PostProcessor post)`

- Description: TODO

#### `public void remove(PostProcessor post)`

- Description: TODO

#### `public void tonemap(PostProcessor tonemap)`

- Description: TODO

#### `protected void envsetup()`

- Description: TODO

#### `protected void envdispose()`

- Description: TODO

#### `protected void maindraw(Render out)`

- Description: TODO

#### `public void gtick(Render out)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `protected void basic()`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `protected void lights()`

- Description: TODO

#### `public void draw(GOut g, Pipe state)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void add(Slot<? extends Render2D> slot)`

- Description: TODO

#### `public void remove(Slot<? extends Render2D> slot)`

- Description: TODO

#### `public void update(Slot<? extends Render2D> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] statemask)`

- Description: TODO
