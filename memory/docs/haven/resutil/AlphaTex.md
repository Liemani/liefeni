# AlphaTex

This file documents the responsibilities and members of `AlphaTex`.

## Meta

- Source: [AlphaTex.java](../../../../src/haven/resutil/AlphaTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an alpha texture helper.

## Members

### Constants

#### `public static final Slot<AlphaTex> slot = new Slot<AlphaTex>(Slot.Type.GEOM, AlphaTex.class)`

- Description: TODO

#### `public static final Attribute clipc = new Attribute(VEC2, "clipc")`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lclip = new MeshBuf.V2LayerID(clipc)`

- Description: TODO

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex, slot)`

- Description: TODO

#### `private static final Uniform cclip = new Uniform(FLOAT, p -> p.get(slot).cthr, slot)`

- Description: TODO

#### `private static final AutoVarying fc = new AutoVarying(VEC2)`

- Description: TODO

#### `private static final ShaderMacro main = prog ->`

- Description: TODO

#### `private static final ShaderMacro clip = prog ->`

- Description: TODO

#### `private static final ShaderMacro shnc = main`

- Description: TODO

#### `private static final ShaderMacro shwc = ShaderMacro.compose(main, clip)`

- Description: TODO

### Fields

#### `public final Sampler2D tex`

- Description: TODO

#### `public final float cthr`

- Description: TODO

### Methods

#### `public AlphaTex(Sampler2D tex, float clip)`

- Description: TODO

#### `public AlphaTex(Sampler2D tex)`

- Description: TODO

#### `private static Value value(FragmentContext fctx)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO
