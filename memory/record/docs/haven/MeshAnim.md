---
source: [MeshAnim.java](../../../src/haven/MeshAnim.java)
created: 2026-06-13
updated: 2026-06-14
---

# MeshAnim

Represents the mesh anim Haven component.

## Nested Types

### Animated

- Role: Represents animated within MeshAnim.
- Description: Describes the nested animated type used by the enclosing class.

### Animation

- Role: Represents animation within MeshAnim.
- Description: Describes the nested animation type used by the enclosing class.

### Frame

- Role: Represents frame within MeshAnim.
- Description: Describes the nested frame type used by the enclosing class.

### Instanced

- Role: Represents instanced within MeshAnim.
- Description: Describes the nested instanced type used by the enclosing class.

### RandAnimation

- Role: Represents rand animation within MeshAnim.
- Description: Describes the nested rand animation type used by the enclosing class.

### Res

- Role: Represents res within MeshAnim.
- Description: Describes the nested res type used by the enclosing class.

### SeqAnimation

- Role: Represents seq animation within MeshAnim.
- Description: Describes the nested seq animation type used by the enclosing class.

### Shader

- Role: Represents shader within MeshAnim.
- Description: Describes the nested shader type used by the enclosing class.

## Members

### Constants

#### `public static final State.Slot<MeshAnim> anim = new State.Slot<>(State.Slot.Type.GEOM, MeshAnim.class)`
- Role: Defines the shared anim constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.Slot<Animated> frame = new State.Slot<>(State.Slot.Type.GEOM, Animated.class)`
- Role: Defines the shared frame constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform pdata = new Uniform(SAMPLER2D, "panim", p -> p.get(anim).ptex(), anim)`
- Role: Defines the shared pdata constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform ndata = new Uniform(SAMPLER2D, "nanim", p ->`
- Role: Defines the shared ndata constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform voff = new Uniform(IVEC2, "voff", p ->`
- Role: Defines the shared voff constant.
- Description: Shared constant used by the rest of the class.

#### `static final InstancedUniform frames = new InstancedUniform.IVec2("frames", p ->`
- Role: Defines the shared frames constant.
- Description: Shared constant used by the rest of the class.

#### `static final InstancedUniform ipol = new InstancedUniform.Float1("ipol", p -> p.get(frame).a, frame)`
- Role: Defines the shared ipol constant.
- Description: Shared constant used by the rest of the class.

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Defines the shared interned constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Frame[] frames`
- Role: Holds the frames state.
- Description: Backs the cached state for this file.

#### `public final float len`
- Role: Stores the len value.
- Description: Backs the cached state for this file.

#### `public final int minv, maxv`
- Role: Stores the maxv value.
- Description: Backs the cached state for this file.

#### `public final int minv, maxv`
- Role: Stores the maxv value.
- Description: Backs the cached state for this file.

#### `public final float time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public final int[] idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public final float[] pos, nrm`
- Role: Stores the nrm value.
- Description: Backs the cached state for this file.

#### `public final float[] pos, nrm`
- Role: Stores the nrm value.
- Description: Backs the cached state for this file.

#### `public final int minv, maxv`
- Role: Stores the maxv value.
- Description: Backs the cached state for this file.

#### `public final int minv, maxv`
- Role: Stores the maxv value.
- Description: Backs the cached state for this file.

#### `private Texture2D.Sampler2D ptex = null, ntex = null`
- Role: Stores the ptex value.
- Description: Backs the cached state for this file.

#### `private Texture2D.Sampler2D ptex = null, ntex = null`
- Role: Stores the ptex value.
- Description: Backs the cached state for this file.

#### `final boolean nrm`
- Role: Tracks the nrm flag.
- Description: Supports the nrm operation used by the surrounding class.

#### `final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public final MeshAnim anim`
- Role: Holds the anim state.
- Description: Backs the cached state for this file.

#### `public final int ff, tf`
- Role: Stores the tf value.
- Description: Backs the cached state for this file.

#### `public final int ff, tf`
- Role: Stores the tf value.
- Description: Backs the cached state for this file.

#### `public final float a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private Instanced ianim = null`
- Role: Holds the ianim state.
- Description: Backs the cached state for this file.

#### `private final Instancer<Animated> instancer = (ast, bat) ->`
- Role: Holds the instancer state.
- Description: Backs the cached state for this file.

#### `private ShaderMacro shader = null`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `private int cf`
- Role: Stores the cf value.
- Description: Backs the cached state for this file.

#### `private float flen, ftm`
- Role: Stores the ftm value.
- Description: Backs the cached state for this file.

#### `private float flen, ftm`
- Role: Stores the ftm value.
- Description: Backs the cached state for this file.

#### `private float fl, fp`
- Role: Stores the fp value.
- Description: Backs the cached state for this file.

#### `private float fl, fp`
- Role: Stores the fp value.
- Description: Backs the cached state for this file.

#### `private int cfi, nfi`
- Role: Stores the nfi value.
- Description: Backs the cached state for this file.

#### `private int cfi, nfi`
- Role: Stores the nfi value.
- Description: Backs the cached state for this file.

#### `private final Random rnd = new Random()`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final MeshAnim a`
- Role: Holds the a state.
- Description: Backs the cached state for this file.

#### `public final boolean rnd`
- Role: Tracks the rnd flag.
- Description: Supports the rnd operation used by the surrounding class.

### Methods

#### `public MeshAnim(Frame[] frames, float len)`
- Role: Creates a new MeshAnim instance.
- Description: Constructs the instance and initializes its default state.

#### `public Frame(float time, int[] idx, float[] pos, float[] nrm)`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `public boolean hasnrm()`
- Role: Performs hasnrm.
- Description: Supports the hasnrm operation used by the surrounding class.

#### `private Texture2D dtex(boolean pos)`
- Role: Performs dtex.
- Description: Supports the dtex operation used by the surrounding class.

#### `public Texture2D.Sampler2D ptex()`
- Role: Performs ptex.
- Description: Supports the ptex operation used by the surrounding class.

#### `public Texture2D.Sampler2D ntex()`
- Role: Performs ntex.
- Description: Supports the ntex operation used by the surrounding class.

#### `Shader(boolean nrm)`
- Role: Handles the shader workflow.
- Description: Supports the shader operation used by the surrounding class.

#### `Function off(VertexContext vctx, boolean pos)`
- Role: Performs off.
- Description: Supports the off operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static Shader get(boolean nrm)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Animated(MeshAnim anim, int ff, int tf, float a)`
- Role: Performs animated.
- Description: Supports the animated operation used by the surrounding class.

#### `int foff()`
- Role: Performs foff.
- Description: Supports the foff operation used by the surrounding class.

#### `int toff()`
- Role: Performs toff.
- Description: Supports the toff operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.

#### `Instanced(MeshAnim anim)`
- Role: Handles the instanced workflow.
- Description: Supports the instanced operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public abstract Animated state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public abstract boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public abstract void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public MeshAnim desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public SeqAnimation()`
- Role: Performs seq animation.
- Description: Supports the seq animation operation used by the surrounding class.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public Animated state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public RandAnimation()`
- Role: Performs rand animation.
- Description: Supports the rand animation operation used by the surrounding class.

#### `private void setfr(int fi)`
- Role: Performs setfr.
- Description: Supports the setfr operation used by the surrounding class.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public Animated state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public boolean animp(FastMesh mesh)`
- Role: Performs animp.
- Description: Supports the animp operation used by the surrounding class.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Animation make()`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.
