# OverTex

This file documents the responsibilities and members of `OverTex`.

## Meta

- Source: [OverTex.java](../../../../src/haven/resutil/OverTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for over tex.

## Nested Types

### $ctex

- Role: Represents $ctex within OverTex.
- Description: Describes the nested $ctex type used by the enclosing class.

### CDecode

- Role: Represents cdecode within OverTex.
- Description: Describes the nested cdecode type used by the enclosing class.

### OTexC

- Role: Represents otex c within OverTex.
- Description: Describes the nested otex c type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<OverTex> slot = new Slot<OverTex>(Slot.Type.DRAW, OverTex.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute otexc = new Attribute(VEC2, "otexc")`
- Role: Defines the shared otexc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`
- Role: Defines the shared ctex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Function, ShaderMacro> shcache = new HashMap<Function, ShaderMacro>()`
- Role: Defines the shared shcache constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_otexc")`
- Role: Defines the shared rtexcoord constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean otexdb = false`
- Role: Tracks the otexdb flag.
- Description: Supports the otexdb operation used by the surrounding class.

#### `private final ShaderMacro shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final Sampler2D tex`
- Role: Holds the tex state.
- Description: Backs the cached state for this file.

### Methods

#### `public static ValBlock.Value texcoord(FragmentContext fctx)`
- Role: Performs texcoord.
- Description: Supports the texcoord operation used by the surrounding class.

#### `private static ShaderMacro shfor(final Function blend)`
- Role: Performs shfor.
- Description: Supports the shfor operation used by the surrounding class.

#### `public OverTex(Sampler2D tex, Function blend)`
- Role: Creates a new OverTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public OverTex(Sampler2D tex)`
- Role: Creates a new OverTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public OTexC(FloatBuffer data)`
- Role: Performs otex c.
- Description: Supports the otex c operation used by the surrounding class.

#### `public OTexC(Resource res, Message buf, int nv)`
- Role: Performs otex c.
- Description: Supports the otex c operation used by the surrounding class.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
