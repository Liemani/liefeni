# CrackTex

This file documents the responsibilities and members of `CrackTex`.

## Meta

- Source: [CrackTex.java](../../../../src/haven/resutil/CrackTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for crack tex.

## Nested Types

### Decoder

- Role: Represents decoder within CrackTex.
- Description: Describes the nested decoder type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<CrackTex> slot = new Slot<>(Slot.Type.DRAW, CrackTex.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int texsz = 256`
- Role: Defines the shared texsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Sampler3D[] imgs`
- Role: Defines the shared imgs constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_tex = new Uniform(SAMPLER3D, "cracktex", p -> p.get(slot).img, slot)`
- Role: Defines the shared u tex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_col = new Uniform(VEC3, "crackcol", p -> p.get(slot).color, slot)`
- Role: Defines the shared u col constant.
- Description: Shared constant used by the rest of the class.

#### `private static final InstancedUniform u_rot = new InstancedUniform.Vec4("crackrot", p -> p.get(slot).rot, slot)`
- Role: Defines the shared u rot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Sampler3D, Instancer<CrackTex>> instids = new WeakHashMap<>()`
- Role: Defines the shared instids constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sampler3D img`
- Role: Holds the img state.
- Description: Backs the cached state for this file.

#### `public final Color color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

#### `public final float[] rot`
- Role: Stores the rot value.
- Description: Backs the cached state for this file.

#### `public final Supplier<InputStream> src`
- Role: Holds the src state.
- Description: Backs the cached state for this file.

#### `private Defer.Future<FillBuffer[]> decode`
- Role: Stores the decode value.
- Description: Backs the cached state for this file.

#### `private FillBuffer[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

### Methods

#### `public Decoder(Supplier<InputStream> src)`
- Role: Performs decoder.
- Description: Supports the decoder operation used by the surrounding class.

#### `private FillBuffer[] decode(Texture3D tex, Environment env)`
- Role: Performs decode.
- Description: Supports the decode operation used by the surrounding class.

#### `public FillBuffer fill(Texture.Image img, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public static Sampler3D loadtex(Supplier<InputStream> fp)`
- Role: Performs loadtex.
- Description: Supports the loadtex operation used by the surrounding class.

#### `public CrackTex(Sampler3D img, Color color, Coord3f rax, float rang)`
- Role: Creates a new CrackTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public CrackTex(Sampler3D img, Color color)`
- Role: Creates a new CrackTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `private Instancer<CrackTex> instancer()`
- Role: Performs instancer.
- Description: Supports the instancer operation used by the surrounding class.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.
