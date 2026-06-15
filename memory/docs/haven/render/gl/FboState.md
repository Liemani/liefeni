# FboState

This file documents the responsibilities and members of `FboState`.

## Meta

- Source: [FboState.java](../../../../../src/haven/render/gl/FboState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents FBO render state.

## Members

### Constants

#### `public static final FragTarget NIL_CONF = new FragTarget(null)`

- Description: TODO

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`

- Description: TODO

#### `public static final boolean[] BLEND_ALL = new boolean[0], BLEND_NONE = new boolean[0]`

- Description: TODO

#### `public static final boolean[] MASK_NONE = new boolean[0]`

- Description: TODO

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `public final GLFrameBuffer fbo`

- Description: TODO

#### `public final int[] dbufs`

- Description: TODO

#### `public final BlendMode blend`

- Description: TODO

#### `public final boolean[] blendbufs`

- Description: TODO

#### `public final boolean[] colormask`

- Description: TODO

#### `public static int slot = slotidx(FboState.class)`

- Description: TODO

### Methods

#### `public FboState(GLEnvironment env, GLFrameBuffer fbo, int[] dbufs, FragTarget[] conf)`

- Description: TODO

#### `public void applydbufs(BGL gl)`

- Description: TODO

#### `public static int glblendfunc(BlendMode.Function fn)`

- Description: TODO

#### `public static int glblendfac(BlendMode.Factor fac)`

- Description: TODO

#### `public void applyconf(BGL gl)`

- Description: TODO

#### `public void apply(BGL gl)`

- Description: TODO

#### `public void unapply(BGL gl)`

- Description: TODO

#### `public void applyto(BGL gl, GLState to)`

- Description: TODO

#### `private static boolean compatiblep(GLFrameBuffer fbo, Attachment[] color, Attachment depth)`

- Description: TODO

#### `private static GLFrameBuffer find(GLEnvironment env, Attachment[] color, Attachment depth)`

- Description: TODO

#### `private static FboState forfvals(GLEnvironment env, Object depthp, Object[] fvalsp, FragTarget[] conf)`

- Description: TODO

#### `public static FboState make(GLEnvironment env, Object depth, Object[] fvals, FragTarget[] conf)`

- Description: TODO

#### `public static void set(BGL gl, Applier st, Object depth, Object[] fvals, FragTarget[] conf)`

- Description: TODO

#### `public int slotidx()`

- Description: TODO
