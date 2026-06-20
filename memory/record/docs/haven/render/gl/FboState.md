---
source: [FboState.java](../../../../../src/haven/render/gl/FboState.java)
created: 2026-06-13
updated: 2026-06-14
---

# FboState

Provides GL backend support for fbo state.

## Members

### Constants

#### `public static final FragTarget NIL_CONF = new FragTarget(null)`
- Role: Defines the shared nil conf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`
- Role: Defines the shared blend all constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`
- Role: Defines the shared blend all constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean[] MASK_NONE = new boolean[0]`
- Role: Defines the shared mask none constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `public final GLFrameBuffer fbo`
- Role: Stores the fbo value.
- Description: Backs the cached state for this file.

#### `public final int[] dbufs`
- Role: Stores the dbufs value.
- Description: Backs the cached state for this file.

#### `public final BlendMode blend`
- Role: Holds the blend state.
- Description: Backs the cached state for this file.

#### `public final boolean[] blendbufs`
- Role: Tracks the blendbufs flag.
- Description: Supports the blendbufs operation used by the surrounding class.

#### `public final boolean[] colormask`
- Role: Tracks the colormask flag.
- Description: Supports the colormask operation used by the surrounding class.

#### `public static int slot = slotidx(FboState.class)`
- Role: Stores the slot value.
- Description: Backs the cached state for this file.

### Methods

#### `public FboState(GLEnvironment env, GLFrameBuffer fbo, int[] dbufs, FragTarget[] conf)`
- Role: Creates a new FboState instance.
- Description: Constructs the instance and initializes its default state.

#### `public void applydbufs(BGL gl)`
- Role: Performs applydbufs.
- Description: Supports the applydbufs operation used by the surrounding class.

#### `public static int glblendfunc(BlendMode.Function fn)`
- Role: Performs glblendfunc.
- Description: Supports the glblendfunc operation used by the surrounding class.

#### `public static int glblendfac(BlendMode.Factor fac)`
- Role: Performs glblendfac.
- Description: Supports the glblendfac operation used by the surrounding class.

#### `public void applyconf(BGL gl)`
- Role: Performs applyconf.
- Description: Supports the applyconf operation used by the surrounding class.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void unapply(BGL gl)`
- Role: Performs unapply.
- Description: Supports the unapply operation used by the surrounding class.

#### `public void applyto(BGL gl, GLState to)`
- Role: Performs applyto.
- Description: Supports the applyto operation used by the surrounding class.

#### `private static boolean compatiblep(GLFrameBuffer fbo, Attachment[] color, Attachment depth)`
- Role: Performs compatiblep.
- Description: Supports the compatiblep operation used by the surrounding class.

#### `private static GLFrameBuffer find(GLEnvironment env, Attachment[] color, Attachment depth)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `private static FboState forfvals(GLEnvironment env, Object depthp, Object[] fvalsp, FragTarget[] conf)`
- Role: Performs forfvals.
- Description: Supports the forfvals operation used by the surrounding class.

#### `public static FboState make(GLEnvironment env, Object depth, Object[] fvals, FragTarget[] conf)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public static void set(BGL gl, Applier st, Object depth, Object[] fvals, FragTarget[] conf)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public int slotidx()`
- Role: Performs slotidx.
- Description: Supports the slotidx operation used by the surrounding class.
