# OverTex

This file documents the responsibilities and members of `OverTex`.

## Meta

- Source: [OverTex.java](../../../../src/haven/resutil/OverTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an overlaid texture helper.

## Nested Types

### $ctex

- Description: TODO

### CDecode

- Description: TODO

### OTexC

- Description: TODO

## Members

### Constants

#### `public static final Slot<OverTex> slot = new Slot<OverTex>(Slot.Type.DRAW, OverTex.class)`

- Description: TODO

#### `public static final Attribute otexc = new Attribute(VEC2, "otexc")`

- Description: TODO

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`

- Description: TODO

#### `private static final Map<Function, ShaderMacro> shcache = new HashMap<Function, ShaderMacro>()`

- Description: TODO

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_otexc")`

- Description: TODO

### Fields

#### `public static boolean otexdb = false`

- Description: TODO

#### `private final ShaderMacro shader`

- Description: TODO

#### `public final Sampler2D tex`

- Description: TODO

### Methods

#### `public static ValBlock.Value texcoord(FragmentContext fctx)`

- Description: TODO

#### `private static ShaderMacro shfor(final Function blend)`

- Description: TODO

#### `public OverTex(Sampler2D tex, Function blend)`

- Description: TODO

#### `public OverTex(Sampler2D tex)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public OTexC(FloatBuffer data)`

- Description: TODO

#### `public OTexC(Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO
