---
source: [ShadowMap.java](../../../../src/haven/ShadowMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# ShadowMap

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
- Role: Implements the shadowbasic operation.
- Description: Implements the depthtest operation.
- Value: `Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`

#### `static final int idx_bas = 0, idx_back = 1`
- Role: Caches the idx bas value.
- Description: Caches the `idx_bas` value for reuse.
- Value: `0, idx_back = 1`

#### `static final int idx_bas = 0, idx_back = 1`
- Role: Caches the idx bas value.
- Description: Caches the `idx_bas` value for reuse.
- Value: `0, idx_back = 1`

#### `public static final Uniform txf = new Uniform(MAT4, p ->`
- Role: Implements the txf operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(MAT4, p ->`

#### `public static final Uniform sl = new Uniform(INT, p ->`
- Role: Implements the sl operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(INT, p ->`

#### `public static final Uniform map = new Uniform(SAMPLER2D, p -> p.get(smap).lsamp, smap)`
- Role: Implements the map operation.
- Description: Returns the get value.
- Value: `new Uniform(SAMPLER2D, p -> p.get(smap).lsamp, smap)`

#### `public static final AutoVarying stc = new AutoVarying(VEC4)`
- Role: Implements the stc operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC4)`

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Implements the interned operation.
- Description: Implements the private static final weak hashed set<shader> interned = new weak hashed set<>(hash.eq) operation.
- Value: `new WeakHashedSet<>(Hash.eq)`

### Fields

#### `public final static Slot<ShadowMap> smap = new Slot<ShadowMap>(Slot.Type.DRAW, ShadowMap.class)`
- Role: Implements the smap operation.
- Description: Implements the public final static slot<shadow map> smap = new slot<shadow map>(slot.type.draw, shadow map.class) operation.

#### `public final static State.StandAlone maskshadow = new State.StandAlone(Slot.Type.GEOM)`
- Role: Implements the maskshadow operation.
- Description: Implements the stand alone operation.

#### `public final Texture2D lbuf`
- Role: Caches the lbuf value.
- Description: Caches the `lbuf` value for reuse.

#### `public final Texture2D.Sampler2D lsamp`
- Role: Caches the lsamp value.
- Description: Caches the `lsamp` value for reuse.

#### `private final Projection lproj`
- Role: Caches the lproj value.
- Description: Caches the `lproj` value for reuse.

#### `private final Pipe.Op basic`
- Role: Caches the basic value.
- Description: Caches the `basic` value for reuse.

#### `private DirLight light`
- Role: Caches the light value.
- Description: Caches the `light` value for reuse.

#### `private Camera lcam`
- Role: Caches the lcam value.
- Description: Caches the `lcam` value for reuse.

#### `private Pipe.Op curbasic`
- Role: Caches the curbasic value.
- Description: Caches the `curbasic` value for reuse.

#### `private final static Matrix4f texbias = new Matrix4f(0.5f, 0.0f, 0.0f, 0.5f,`
- Role: Implements the texbias operation.
- Description: Implements the matrix4f operation.

#### `private final RenderList.Adapter master`
- Role: Caches the master value.
- Description: Caches the `master` value for reuse.

#### `private final ProxyPipe basic = new ProxyPipe()`
- Role: Implements the basic operation.
- Description: Implements the proxy pipe operation.

#### `private final Map<Slot<? extends Rendered>, Shadowslot> slots = new HashMap<>()`
- Role: Implements the slots operation.
- Description: Implements the private final map<slot<? extends rendered>, shadowslot> slots = new hash map<>() operation.

#### `private DrawList back = null`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private DefPipe curbasic = null`
- Role: Caches the curbasic value.
- Description: Caches the `curbasic` value for reuse.

#### `public final Slot<? extends Rendered> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final Function.Def shcalc`
- Role: Caches the shcalc value.
- Description: Caches the `shcalc` value for reuse.

#### `private final Object id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Shader shader`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

### Methods

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public ShadowMap(Coord res, float size, float depth, float dthr)`
- Role: Creates a new ShadowMap instance.
- Description: Constructs the ShadowMap instance from the supplied inputs.

#### `private ShadowMap(ShadowMap that)`
- Role: Creates a new ShadowMap instance.
- Description: Constructs the ShadowMap instance from the supplied inputs.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public ShadowList(RenderList.Adapter master)`
- Role: Handles the shadow list path.
- Description: Implements the shadow list operation.

#### `public Shadowslot(Slot<? extends Rendered> bk)`
- Role: Handles the shadowslot path.
- Description: Implements the shadowslot operation.

#### `public Rendered obj()`
- Role: Handles the obj path.
- Description: Implements the obj operation.

#### `public GroupPipe state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public Pipe group(int idx)`
- Role: Handles the group path.
- Description: Implements the group operation.

#### `public int gstate(int id)`
- Role: Handles the gstate path.
- Description: Implements the gstate operation.

#### `public int nstates()`
- Role: Handles the nstates path.
- Description: Implements the nstates operation.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Pipe group, int[] statemask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Locked lock()`
- Role: Handles the lock path.
- Description: Implements the lock operation.

#### `public Iterable<? extends Slot<?>> slots()`
- Role: Handles the slots path.
- Description: Implements the slots operation.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList<?> list)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void basic(Pipe.Op st)`
- Role: Returns the pipe state stored under the supplied identifier.
- Description: Returns the pipe state stored under the supplied identifier.

#### `public void draw(Render out)`
- Role: Draws the current content.
- Description: Draws the ShadowMap content.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public ShadowMap light(DirLight light)`
- Role: Handles the light path.
- Description: Implements the light operation.

#### `public boolean haspos()`
- Role: Handles the haspos path.
- Description: Returns whether the pos is present.

#### `public ShadowMap setpos(Coord3f base, Coord3f dir)`
- Role: Handles the setpos path.
- Description: Updates the pos.

#### `public void update(Render out, ShadowList data)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `private Shader(double xd, double yd, int res, double thr)`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void modify(ProgramContext prog)`
- Role: Handles the modify path.
- Description: Implements the modify operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static Shader get(double xd, double yd, int res, double thr)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.