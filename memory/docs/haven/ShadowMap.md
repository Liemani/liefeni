# ShadowMap

This file documents the responsibilities and members of `ShadowMap`.

## Meta

- Source: [ShadowMap.java](../../../src/haven/ShadowMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents shadow map state.

## Nested Types

### $maskshadow

- Description: TODO

### Shader

- Description: TODO

### ShadowList

- Description: TODO

### Shadowslot

- Description: TODO

## Members

### Constants

#### `public static final Pipe.Op shadowbasic = Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`

- Description: TODO

#### `static final int idx_bas = 0, idx_back = 1`

- Description: TODO

#### `static final int idx_bas = 0, idx_back = 1`

- Description: TODO

#### `public static final Uniform txf = new Uniform(MAT4, p ->`

- Description: TODO

#### `public static final Uniform sl = new Uniform(INT, p ->`

- Description: TODO

#### `public static final Uniform map = new Uniform(SAMPLER2D, p -> p.get(smap).lsamp, smap)`

- Description: TODO

#### `public static final AutoVarying stc = new AutoVarying(VEC4)`

- Description: TODO

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

### Fields

#### `public final static Slot<ShadowMap> smap = new Slot<ShadowMap>(Slot.Type.DRAW, ShadowMap.class)`

- Description: TODO

#### `public final static State.StandAlone maskshadow = new State.StandAlone(Slot.Type.GEOM)`

- Description: TODO

#### `public final Texture2D lbuf`

- Description: TODO

#### `public final Texture2D.Sampler2D lsamp`

- Description: TODO

#### `private final Projection lproj`

- Description: TODO

#### `private final Pipe.Op basic`

- Description: TODO

#### `private DirLight light`

- Description: TODO

#### `private Camera lcam`

- Description: TODO

#### `private Pipe.Op curbasic`

- Description: TODO

#### `private final static Matrix4f texbias = new Matrix4f(0.5f, 0.0f, 0.0f, 0.5f,`

- Description: TODO

#### `private final RenderList.Adapter master`

- Description: TODO

#### `private final ProxyPipe basic = new ProxyPipe()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, Shadowslot> slots = new HashMap<>()`

- Description: TODO

#### `private DrawList back = null`

- Description: TODO

#### `private DefPipe curbasic = null`

- Description: TODO

#### `public final Slot<? extends Rendered> bk`

- Description: TODO

#### `public final Function.Def shcalc`

- Description: TODO

#### `private final Object id`

- Description: TODO

#### `public final Shader shader`

- Description: TODO

### Methods

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public ShadowMap(Coord res, float size, float depth, float dthr)`

- Description: TODO

#### `private ShadowMap(ShadowMap that)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public ShadowList(RenderList.Adapter master)`

- Description: TODO

#### `public Shadowslot(Slot<? extends Rendered> bk)`

- Description: TODO

#### `public Rendered obj()`

- Description: TODO

#### `public GroupPipe state()`

- Description: TODO

#### `public Pipe group(int idx)`

- Description: TODO

#### `public int gstate(int id)`

- Description: TODO

#### `public int nstates()`

- Description: TODO

#### `public void add(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void remove(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] statemask)`

- Description: TODO

#### `public Locked lock()`

- Description: TODO

#### `public Iterable<? extends Slot<?>> slots()`

- Description: TODO

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

#### `public void remove(RenderList<?> list)`

- Description: TODO

#### `public void basic(Pipe.Op st)`

- Description: TODO

#### `public void draw(Render out)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public ShadowMap light(DirLight light)`

- Description: TODO

#### `public boolean haspos()`

- Description: TODO

#### `public ShadowMap setpos(Coord3f base, Coord3f dir)`

- Description: TODO

#### `public void update(Render out, ShadowList data)`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `private Shader(double xd, double yd, int res, double thr)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public static Shader get(double xd, double yd, int res, double thr)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO
