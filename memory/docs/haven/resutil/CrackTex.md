# CrackTex

This file documents the responsibilities and members of `CrackTex`.

## Meta

- Source: [CrackTex.java](../../../../src/haven/resutil/CrackTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a cracked texture helper.

## Nested Types

### Decoder

- Description: TODO

## Members

### Constants

#### `public static final Slot<CrackTex> slot = new Slot<>(Slot.Type.DRAW, CrackTex.class)`

- Description: TODO

#### `public static final int texsz = 256`

- Description: TODO

#### `public static final Sampler3D[] imgs`

- Description: TODO

#### `private static final Uniform u_tex = new Uniform(SAMPLER3D, "cracktex", p -> p.get(slot).img, slot)`

- Description: TODO

#### `private static final Uniform u_col = new Uniform(VEC3, "crackcol", p -> p.get(slot).color, slot)`

- Description: TODO

#### `private static final InstancedUniform u_rot = new InstancedUniform.Vec4("crackrot", p -> p.get(slot).rot, slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

#### `private static final Map<Sampler3D, Instancer<CrackTex>> instids = new WeakHashMap<>()`

- Description: TODO

### Fields

#### `public final Sampler3D img`

- Description: TODO

#### `public final Color color`

- Description: TODO

#### `public final float[] rot`

- Description: TODO

#### `public final Supplier<InputStream> src`

- Description: TODO

#### `private Defer.Future<FillBuffer[]> decode`

- Description: TODO

#### `private FillBuffer[] data`

- Description: TODO

### Methods

#### `public Decoder(Supplier<InputStream> src)`

- Description: TODO

#### `private FillBuffer[] decode(Texture3D tex, Environment env)`

- Description: TODO

#### `public FillBuffer fill(Texture.Image img, Environment env)`

- Description: TODO

#### `public void done()`

- Description: TODO

#### `public static Sampler3D loadtex(Supplier<InputStream> fp)`

- Description: TODO

#### `public CrackTex(Sampler3D img, Color color, Coord3f rax, float rang)`

- Description: TODO

#### `public CrackTex(Sampler3D img, Color color)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `private Instancer<CrackTex> instancer()`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO
