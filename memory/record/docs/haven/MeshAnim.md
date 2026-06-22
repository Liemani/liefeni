---
source: [MeshAnim.java](../../../../src/haven/MeshAnim.java)
created: 2026-06-13
updated: 2026-06-14
---

# MeshAnim

Describes mesh animation frames and the shader state that applies them.

## Nested Types

### Animated

- Role: Stores the current mesh animation state.
- Description: Carries the current and next frame indices plus the interpolation factor.

### Animation

- Role: Defines a playable animation timeline.
- Description: Provides ticking, ageing, and current state generation for animation playback.

### Frame

- Role: Stores one sampled animation frame.
- Description: Holds the sampling time, vertex indices, and position/normal data for that frame.

### Instanced

- Role: Provides the zero-offset animation state for instanced meshes.
- Description: Reuses the same animation descriptor while supplying an instanced shader hook.

### RandAnimation

- Role: Plays a randomized frame sequence.
- Description: Picks a current frame and a different next frame, then advances between them with random timing.

### Res

- Role: Loads mesh animation data from a resource layer.
- Description: Parses the `manim` layer into a `MeshAnim` descriptor and exposes it as a resource entry.

### SeqAnimation

- Role: Plays the frames in order.
- Description: Advances through the mesh animation timeline and loops back to the first frame.

### Shader

- Role: Builds the vertex morph shader for mesh animation.
- Description: Samples the frame textures and offsets animated vertices during rendering.

## Members

### Constants

#### `public static final State.Slot<MeshAnim> anim = new State.Slot<>(State.Slot.Type.GEOM, MeshAnim.class)`
- Role: Stores the active mesh animation descriptor in the geometry state.
- Description: Lets the shader read frame textures and vertex ranges from the current mesh animation.
- Value: `new State.Slot<>(State.Slot.Type.GEOM, MeshAnim.class)`

#### `public static final State.Slot<Animated> frame = new State.Slot<>(State.Slot.Type.GEOM, Animated.class)`
- Role: Stores the current animated frame state in the geometry state.
- Description: Supplies frame indices and interpolation factors to the shader.
- Value: `new State.Slot<>(State.Slot.Type.GEOM, Animated.class)`

#### `static final Uniform pdata = new Uniform(SAMPLER2D, "panim", p -> p.get(anim).ptex(), anim)`
- Role: Exposes the position animation texture.
- Description: Binds the position frame texture sampled by the shader.
- Value: `new Uniform(SAMPLER2D, "panim", p -> p.get(anim).ptex(), anim)`

#### `static final Uniform ndata = new Uniform(SAMPLER2D, "nanim", p ->`
- Role: Exposes the normal animation texture when normals exist.
- Description: Returns `null` for meshes without animated normals.
- Value: `new Uniform(SAMPLER2D, "nanim", p ->`

#### `static final Uniform voff = new Uniform(IVEC2, "voff", p ->`
- Role: Exposes the animated vertex index range.
- Description: Provides the first animated vertex index and the count of animated vertices.
- Value: `new Uniform(IVEC2, "voff", p ->`

#### `static final InstancedUniform frames = new InstancedUniform.IVec2("frames", p ->`
- Role: Exposes the source and target frame offsets.
- Description: Supplies the indexed frame window for the current animation state.
- Value: `new InstancedUniform.IVec2("frames", p ->`

#### `static final InstancedUniform ipol = new InstancedUniform.Float1("ipol", p -> p.get(frame).a, frame)`
- Role: Exposes the current interpolation factor.
- Description: Reads the blend amount from the active animated frame state.
- Value: `new InstancedUniform.Float1("ipol", p -> p.get(frame).a, frame)`

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Reuses shader instances for identical animation modes.
- Description: Interns shader macros so the same normal/no-normal variant is shared.
- Value: `new WeakHashedSet<>(Hash.eq)`

### Fields

#### `public final Frame[] frames`
- Role: Stores the sampled animation frames.
- Description: Used to build frame textures and interpolation timing.

#### `public final float len`
- Role: Stores the animation cycle length.
- Description: Represents the total timeline length in seconds.

#### `public final int minv, maxv`
- Role: Stores the animated vertex range.
- Description: Defines the minimum and maximum vertex indices touched by the animation.

#### `public final int minv, maxv`
- Role: Caches the maxv value.
- Description: Caches the `maxv` value for reuse.

#### `public final float time`
- Role: Stores the frame timestamp.
- Description: Marks where the frame begins in the animation timeline.

#### `public final int[] idx`
- Role: Stores the vertex indices touched by the frame.
- Description: Each index selects one animated vertex in the mesh.

#### `public final float[] pos, nrm`
- Role: Stores the sampled vertex position and normal data.
- Description: Each array contains tightly packed xyz triples for the frame.

#### `public final float[] pos, nrm`
- Role: Caches the nrm value.
- Description: Caches the `nrm` value for reuse.

#### `public final int minv, maxv`
- Role: Caches the maxv value.
- Description: Caches the `maxv` value for reuse.

#### `public final int minv, maxv`
- Role: Caches the maxv value.
- Description: Caches the `maxv` value for reuse.

#### `private Texture2D.Sampler2D ptex = null, ntex = null`
- Role: Caches the generated frame textures.
- Description: Builds the textures lazily so they are created only when the shader needs them.

#### `private Texture2D.Sampler2D ptex = null, ntex = null`
- Role: Caches the ptex value.
- Description: Caches the `ptex` value for reuse.

#### `final boolean nrm`
- Role: Remembers whether the animation includes normals.
- Description: Controls whether the shader modifies vertex directions as well as positions.

#### `final Object id`
- Role: Uniquely identifies the shader variant.
- Description: Used for shader interning and equality checks.

#### `public final MeshAnim anim`
- Role: Stores the owning animation descriptor.
- Description: Supplies frame ranges and texture sources to the animated state.

#### `public final int ff, tf`
- Role: Stores the current and next frame indices.
- Description: Used to pick the source and target texture rows for interpolation.

#### `public final int ff, tf`
- Role: Caches the tf value.
- Description: Caches the `tf` value for reuse.

#### `public final float a`
- Role: Stores the interpolation factor.
- Description: Indicates how far the animation has advanced toward the next frame.

#### `private Instanced ianim = null`
- Role: Caches the shared instanced animation state.
- Description: Reuses one instanced wrapper for all batched animated meshes.

#### `private final Instancer<Animated> instancer = (ast, bat) ->`
- Role: Supplies the instanced animation state.
- Description: Returns the shared `Instanced` wrapper on demand.

#### `private ShaderMacro shader = null`
- Role: Caches the shader variant.
- Description: Reuses the same shader macro for all meshes with the same normal usage.

#### `private int cf`
- Role: Tracks the current frame index in sequence playback.
- Description: Advances through the animation frames in order.

#### `private float flen, ftm`
- Role: Tracks the current frame duration and elapsed time.
- Description: Used to time the next sequence frame transition.

#### `private float flen, ftm`
- Role: Caches the ftm value.
- Description: Caches the `ftm` value for reuse.

#### `private float fl, fp`
- Role: Tracks the current random frame duration and elapsed time.
- Description: Used to pick and blend between random frames.

#### `private float fl, fp`
- Role: Caches the fp value.
- Description: Caches the `fp` value for reuse.

#### `private int cfi, nfi`
- Role: Tracks the current and next random frame indices.
- Description: Used by the randomized animation player.

#### `private int cfi, nfi`
- Role: Caches the nfi value.
- Description: Caches the `nfi` value for reuse.

#### `private final Random rnd = new Random()`
- Role: Provides random frame selection.
- Description: Used to choose initial and next frames for `RandAnimation`.

#### `public final int id`
- Role: Stores the resource animation id.
- Description: Identifies the animation sequence inside the resource layer.

#### `public final MeshAnim a`
- Role: Stores the parsed animation descriptor.
- Description: Exposes the animation data loaded from the resource.

#### `public final boolean rnd`
- Role: Records whether the resource uses randomized playback.
- Description: Selects between sequential and random animation behavior.

### Methods

#### `public MeshAnim(Frame[] frames, float len)`
- Role: Builds an animation descriptor from sampled frames.
- Description: Validates the frame range and computes the animated vertex span.

#### `public Frame(float time, int[] idx, float[] pos, float[] nrm)`
- Role: Builds one sampled animation frame.
- Description: Stores the frame time, vertex indices, and packed position/normal data.

#### `public boolean hasnrm()`
- Role: Reports whether normals are animated.
- Description: Returns true when the sampled frames carry normal data.

#### `private Texture2D dtex(boolean pos)`
- Role: Builds a frame texture for positions or normals.
- Description: Packs all frame samples into a 2D texture for shader lookup.

#### `public Texture2D.Sampler2D ptex()`
- Role: Returns the cached position texture sampler.
- Description: Creates the texture lazily on first use.

#### `public Texture2D.Sampler2D ntex()`
- Role: Returns the cached normal texture sampler.
- Description: Creates the texture lazily on first use.

#### `Shader(boolean nrm)`
- Role: Handles the shader workflow.
- Description: Returns the shader macro used by this context.

#### `Function off(VertexContext vctx, boolean pos)`
- Role: Builds a vertex offset function for animated meshes.
- Description: Samples the animation textures for the current vertex id and interpolates between frames.

#### `public void modify(ProgramContext prog)`
- Role: Handles the modify path.
- Description: Implements the modify operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static Shader get(boolean nrm)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Animated(MeshAnim anim, int ff, int tf, float a)`
- Role: Handles the animated path.
- Description: Implements the animated operation.

#### `int foff()`
- Role: Handles the foff path.
- Description: Implements the foff operation.

#### `int toff()`
- Role: Handles the toff path.
- Description: Implements the toff operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public InstancedAttribute[] attribs()`
- Role: Handles the attribs path.
- Description: Implements the attribs operation.

#### `Instanced(MeshAnim anim)`
- Role: Handles the instanced workflow.
- Description: Implements the instanced operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public abstract Animated state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public abstract boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public abstract void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public MeshAnim desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public SeqAnimation()`
- Role: Handles the seq animation path.
- Description: Implements the seq animation operation.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public Animated state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public RandAnimation()`
- Role: Handles the rand animation path.
- Description: Implements the rand animation operation.

#### `private void setfr(int fi)`
- Role: Handles the setfr path.
- Description: Updates the fr.

#### `public boolean tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public Animated state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public boolean animp(FastMesh mesh)`
- Role: Handles the animp path.
- Description: Implements the animp operation.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Animation make()`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.
