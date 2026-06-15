# MeshAnim

This file documents the responsibilities and members of `MeshAnim`.

## Meta

- Source: [MeshAnim.java](../../../src/haven/MeshAnim.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents mesh animation support.

## Nested Types

### Animated

- Description: TODO

### Animation

- Description: TODO

### Frame

- Description: TODO

### Instanced

- Description: TODO

### RandAnimation

- Description: TODO

### Res

- Description: TODO

### SeqAnimation

- Description: TODO

### Shader

- Description: TODO

## Members

### Constants

#### `public static final State.Slot<MeshAnim> anim = new State.Slot<>(State.Slot.Type.GEOM, MeshAnim.class)`

- Description: TODO

#### `public static final State.Slot<Animated> frame = new State.Slot<>(State.Slot.Type.GEOM, Animated.class)`

- Description: TODO

#### `static final Uniform pdata = new Uniform(SAMPLER2D, "panim", p -> p.get(anim).ptex(), anim)`

- Description: TODO

#### `static final Uniform ndata = new Uniform(SAMPLER2D, "nanim", p ->`

- Description: TODO

#### `static final Uniform voff = new Uniform(IVEC2, "voff", p ->`

- Description: TODO

#### `static final InstancedUniform frames = new InstancedUniform.IVec2("frames", p ->`

- Description: TODO

#### `static final InstancedUniform ipol = new InstancedUniform.Float1("ipol", p -> p.get(frame).a, frame)`

- Description: TODO

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

### Fields

#### `public final Frame[] frames`

- Description: TODO

#### `public final float len`

- Description: TODO

#### `public final int minv, maxv`

- Description: TODO

#### `public final int minv, maxv`

- Description: TODO

#### `public final float time`

- Description: TODO

#### `public final int[] idx`

- Description: TODO

#### `public final float[] pos, nrm`

- Description: TODO

#### `public final float[] pos, nrm`

- Description: TODO

#### `public final int minv, maxv`

- Description: TODO

#### `public final int minv, maxv`

- Description: TODO

#### `private Texture2D.Sampler2D ptex = null, ntex = null`

- Description: TODO

#### `private Texture2D.Sampler2D ptex = null, ntex = null`

- Description: TODO

#### `final boolean nrm`

- Description: TODO

#### `final Object id`

- Description: TODO

#### `public final MeshAnim anim`

- Description: TODO

#### `public final int ff, tf`

- Description: TODO

#### `public final int ff, tf`

- Description: TODO

#### `public final float a`

- Description: TODO

#### `private Instanced ianim = null`

- Description: TODO

#### `private final Instancer<Animated> instancer = (ast, bat) ->`

- Description: TODO

#### `private ShaderMacro shader = null`

- Description: TODO

#### `private int cf`

- Description: TODO

#### `private float flen, ftm`

- Description: TODO

#### `private float flen, ftm`

- Description: TODO

#### `private float fl, fp`

- Description: TODO

#### `private float fl, fp`

- Description: TODO

#### `private int cfi, nfi`

- Description: TODO

#### `private int cfi, nfi`

- Description: TODO

#### `private final Random rnd = new Random()`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final MeshAnim a`

- Description: TODO

#### `public final boolean rnd`

- Description: TODO

### Methods

#### `public MeshAnim(Frame[] frames, float len)`

- Description: TODO

#### `public Frame(float time, int[] idx, float[] pos, float[] nrm)`

- Description: TODO

#### `public boolean hasnrm()`

- Description: TODO

#### `private Texture2D dtex(boolean pos)`

- Description: TODO

#### `public Texture2D.Sampler2D ptex()`

- Description: TODO

#### `public Texture2D.Sampler2D ntex()`

- Description: TODO

#### `Shader(boolean nrm)`

- Description: TODO

#### `Function off(VertexContext vctx, boolean pos)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public static Shader get(boolean nrm)`

- Description: TODO

#### `public Animated(MeshAnim anim, int ff, int tf, float a)`

- Description: TODO

#### `int foff()`

- Description: TODO

#### `int toff()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO

#### `Instanced(MeshAnim anim)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public abstract Animated state()`

- Description: TODO

#### `public abstract boolean tick(float dt)`

- Description: TODO

#### `public abstract void age()`

- Description: TODO

#### `public MeshAnim desc()`

- Description: TODO

#### `public SeqAnimation()`

- Description: TODO

#### `public boolean tick(float dt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public Animated state()`

- Description: TODO

#### `public RandAnimation()`

- Description: TODO

#### `private void setfr(int fi)`

- Description: TODO

#### `public boolean tick(float dt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public Animated state()`

- Description: TODO

#### `public boolean animp(FastMesh mesh)`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public Animation make()`

- Description: TODO

#### `public void init()`

- Description: TODO
