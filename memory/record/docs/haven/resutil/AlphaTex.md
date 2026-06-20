---
source: [AlphaTex.java](../../../../src/haven/resutil/AlphaTex.java)
created: 2026-06-13
updated: 2026-06-14
---

# AlphaTex

Provides resource helper logic for alpha tex.

## Members

### Constants

#### `public static final Slot<AlphaTex> slot = new Slot<AlphaTex>(Slot.Type.GEOM, AlphaTex.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute clipc = new Attribute(VEC2, "clipc")`
- Role: Defines the shared clipc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lclip = new MeshBuf.V2LayerID(clipc)`
- Role: Defines the shared lclip constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Defines the shared ctex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform cclip = new Uniform(FLOAT, p -> p.get(slot).cthr, slot)`
- Role: Defines the shared cclip constant.
- Description: Shared constant used by the rest of the class.

#### `private static final AutoVarying fc = new AutoVarying(VEC2)`
- Role: Defines the shared fc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro main = prog ->`
- Role: Defines the shared main constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro clip = prog ->`
- Role: Defines the shared clip constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shnc = main`
- Role: Defines the shared shnc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shwc = ShaderMacro.compose(main, clip)`
- Role: Defines the shared shwc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sampler2D tex`
- Role: Holds the tex state.
- Description: Backs the cached state for this file.

#### `public final float cthr`
- Role: Stores the cthr value.
- Description: Backs the cached state for this file.

### Methods

#### `public AlphaTex(Sampler2D tex, float clip)`
- Role: Creates a new AlphaTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public AlphaTex(Sampler2D tex)`
- Role: Creates a new AlphaTex instance.
- Description: Constructs the instance and initializes its default state.

#### `private static Value value(FragmentContext fctx)`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
