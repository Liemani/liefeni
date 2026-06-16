# ShadowMap

This file documents the responsibilities and members of `ShadowMap`.

## Meta

- Source: [ShadowMap.java](../../../src/haven/ShadowMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the shadow map Haven component.

## Nested Types

### $maskshadow

- Role: Represents $maskshadow within ShadowMap.
- Description: Describes the nested $maskshadow type used by the enclosing class.

### Shader

- Role: Represents shader within ShadowMap.
- Description: Describes the nested shader type used by the enclosing class.

### ShadowList

- Role: Represents shadow list within ShadowMap.
- Description: Describes the nested shadow list type used by the enclosing class.

### Shadowslot

- Role: Represents shadowslot within ShadowMap.
- Description: Describes the nested shadowslot type used by the enclosing class.

## Members

### Constants

#### `public static final Pipe.Op shadowbasic = Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`
- Role: Defines the shared shadowbasic constant.
- Description: Shared constant used by the rest of the class.

#### `static final int idx_bas = 0, idx_back = 1`
- Role: Defines the shared idx bas constant.
- Description: Shared constant used by the rest of the class.

#### `static final int idx_bas = 0, idx_back = 1`
- Role: Defines the shared idx bas constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform txf = new Uniform(MAT4, p ->`
- Role: Defines the shared txf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform sl = new Uniform(INT, p ->`
- Role: Defines the shared sl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform map = new Uniform(SAMPLER2D, p -> p.get(smap).lsamp, smap)`
- Role: Defines the shared map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying stc = new AutoVarying(VEC4)`
- Role: Defines the shared stc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Defines the shared interned constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final static Slot<ShadowMap> smap = new Slot<ShadowMap>(Slot.Type.DRAW, ShadowMap.class)`
- Role: Caches smap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final static State.StandAlone maskshadow = new State.StandAlone(Slot.Type.GEOM)`
- Role: Holds the maskshadow state.
- Description: Backs the cached state for this file.

#### `public final Texture2D lbuf`
- Role: Stores the lbuf value.
- Description: Backs the cached state for this file.

#### `public final Texture2D.Sampler2D lsamp`
- Role: Stores the lsamp value.
- Description: Backs the cached state for this file.

#### `private final Projection lproj`
- Role: Holds the lproj state.
- Description: Backs the cached state for this file.

#### `private final Pipe.Op basic`
- Role: Holds the basic state.
- Description: Backs the cached state for this file.

#### `private DirLight light`
- Role: Holds the light state.
- Description: Backs the cached state for this file.

#### `private Camera lcam`
- Role: Holds the lcam state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op curbasic`
- Role: Holds the curbasic state.
- Description: Backs the cached state for this file.

#### `private final static Matrix4f texbias = new Matrix4f(0.5f, 0.0f, 0.0f, 0.5f,`
- Role: Holds the texbias state.
- Description: Backs the cached state for this file.

#### `private final RenderList.Adapter master`
- Role: Caches master entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ProxyPipe basic = new ProxyPipe()`
- Role: Holds the basic state.
- Description: Backs the cached state for this file.

#### `private final Map<Slot<? extends Rendered>, Shadowslot> slots = new HashMap<>()`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private DrawList back = null`
- Role: Caches back entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private DefPipe curbasic = null`
- Role: Holds the curbasic state.
- Description: Backs the cached state for this file.

#### `public final Slot<? extends Rendered> bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final Function.Def shcalc`
- Role: Holds the shcalc state.
- Description: Backs the cached state for this file.

#### `private final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public final Shader shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

### Methods

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public ShadowMap(Coord res, float size, float depth, float dthr)`
- Role: Creates a new ShadowMap instance.
- Description: Constructs the instance and initializes its default state.

#### `private ShadowMap(ShadowMap that)`
- Role: Creates a new ShadowMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public ShadowList(RenderList.Adapter master)`
- Role: Performs shadow list.
- Description: Supports the shadow list operation used by the surrounding class.

#### `public Shadowslot(Slot<? extends Rendered> bk)`
- Role: Performs shadowslot.
- Description: Supports the shadowslot operation used by the surrounding class.

#### `public Rendered obj()`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public GroupPipe state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public Pipe group(int idx)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public int gstate(int id)`
- Role: Performs gstate.
- Description: Supports the gstate operation used by the surrounding class.

#### `public int nstates()`
- Role: Performs nstates.
- Description: Supports the nstates operation used by the surrounding class.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] statemask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Locked lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public Iterable<? extends Slot<?>> slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList<?> list)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void basic(Pipe.Op st)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public void draw(Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public ShadowMap light(DirLight light)`
- Role: Performs light.
- Description: Supports the light operation used by the surrounding class.

#### `public boolean haspos()`
- Role: Performs haspos.
- Description: Supports the haspos operation used by the surrounding class.

#### `public ShadowMap setpos(Coord3f base, Coord3f dir)`
- Role: Performs setpos.
- Description: Supports the setpos operation used by the surrounding class.

#### `public void update(Render out, ShadowList data)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `private Shader(double xd, double yd, int res, double thr)`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static Shader get(double xd, double yd, int res, double thr)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.
