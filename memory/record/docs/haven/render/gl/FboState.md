---
source: [FboState.java](../../../../../../src/haven/render/gl/FboState.java)
created: 2026-06-13
updated: 2026-06-14
---

# FboState

Provides GL backend support for fbo state.

## Members

### Constants

#### `public static final FragTarget NIL_CONF = new FragTarget(null)`
- Role: Implements the nil conf operation.
- Description: Implements the frag target operation.
- Value: `new FragTarget(null)`

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`
- Role: Caches the blend all value.
- Description: Caches the `BLEND_ALL` value for reuse.
- Value: `new boolean[0], BLEND_NONE = new boolean[0]`

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`
- Role: Caches the blend all value.
- Description: Caches the `BLEND_ALL` value for reuse.
- Value: `new boolean[0], BLEND_NONE = new boolean[0]`

#### `public static final boolean[] MASK_NONE = new boolean[0]`
- Role: Caches the mask none value.
- Description: Caches the `MASK_NONE` value for reuse.
- Value: `new boolean[0]`

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `public final GLFrameBuffer fbo`
- Role: Caches the fbo value.
- Description: Caches the `fbo` value for reuse.

#### `public final int[] dbufs`
- Role: Caches the dbufs value.
- Description: Caches the `dbufs` value for reuse.

#### `public final BlendMode blend`
- Role: Caches the blend value.
- Description: Caches the `blend` value for reuse.

#### `public final boolean[] blendbufs`
- Role: Tracks the blendbufs flag.
- Description: Caches the `blendbufs` value for reuse.

#### `public final boolean[] colormask`
- Role: Tracks the colormask flag.
- Description: Caches the `colormask` value for reuse.

#### `public static int slot = slotidx(FboState.class)`
- Role: Implements the slot operation.
- Description: Implements the slotidx operation.

### Methods

#### `public FboState(GLEnvironment env, GLFrameBuffer fbo, int[] dbufs, FragTarget[] conf)`
- Role: Creates a new FboState instance.
- Description: Constructs the FboState instance from the supplied inputs.

#### `public void applydbufs(BGL gl)`
- Role: Handles the applydbufs path.
- Description: Implements the applydbufs operation.

#### `public static int glblendfunc(BlendMode.Function fn)`
- Role: Handles the glblendfunc path.
- Description: Implements the glblendfunc operation.

#### `public static int glblendfac(BlendMode.Factor fac)`
- Role: Handles the glblendfac path.
- Description: Implements the glblendfac operation.

#### `public void applyconf(BGL gl)`
- Role: Handles the applyconf path.
- Description: Implements the applyconf operation.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void unapply(BGL gl)`
- Role: Handles the unapply path.
- Description: Implements the unapply operation.

#### `public void applyto(BGL gl, GLState to)`
- Role: Handles the applyto path.
- Description: Implements the applyto operation.

#### `private static boolean compatiblep(GLFrameBuffer fbo, Attachment[] color, Attachment depth)`
- Role: Handles the compatiblep path.
- Description: Implements the compatiblep operation.

#### `private static GLFrameBuffer find(GLEnvironment env, Attachment[] color, Attachment depth)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `private static FboState forfvals(GLEnvironment env, Object depthp, Object[] fvalsp, FragTarget[] conf)`
- Role: Handles the forfvals path.
- Description: Implements the forfvals operation.

#### `public static FboState make(GLEnvironment env, Object depth, Object[] fvals, FragTarget[] conf)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public static void set(BGL gl, Applier st, Object depth, Object[] fvals, FragTarget[] conf)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public int slotidx()`
- Role: Handles the slotidx path.
- Description: Implements the slotidx operation.