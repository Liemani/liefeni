# TexRender

This file documents the responsibilities and members of `TexRender`.

## Meta

- Source: [TexRender.java](../../../src/haven/TexRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a rendered texture.

## Nested Types

### $tex

- Description: TODO

### TexClip

- Description: TODO

### TexDraw

- Description: TODO

## Members

### Constants

#### `public static final VertexArray.Layout vf_tex2d = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

- Description: TODO

#### `private static final ShaderMacro mktex = prog ->`

- Description: TODO

#### `private static final ShaderMacro mkcentroid = prog ->`

- Description: TODO

#### `public static final Slot<TexDraw> slot = new Slot<TexDraw>(Slot.Type.DRAW, TexDraw.class)`

- Description: TODO

#### `private static final ShaderMacro nshader = ShaderMacro.compose(mktex, Tex2D.mod)`

- Description: TODO

#### `private static final ShaderMacro cshader = ShaderMacro.compose(mktex, Tex2D.mod, mkcentroid)`

- Description: TODO

#### `public static final Slot<TexClip> slot = new Slot<TexClip>(Slot.Type.GEOM, TexClip.class)`

- Description: TODO

#### `private static final ShaderMacro shader = ShaderMacro.compose(mktex, Tex2D.clip)`

- Description: TODO

#### `public static final Pipe.Op noclip = p -> p.put(TexClip.slot, null)`

- Description: TODO

#### `public static final boolean defclip = true`

- Description: TODO

### Fields

#### `public final Sampler2D img`

- Description: TODO

#### `public boolean centroid = false`

- Description: TODO

#### `public final TexRender tex`

- Description: TODO

#### `public final TexDraw draw = new TexDraw(this)`

- Description: TODO

#### `public final TexRender tex`

- Description: TODO

#### `public final TexClip clip = new TexClip(this)`

- Description: TODO

### Methods

#### `public TexRender(Sampler2D img)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public TexDraw(TexRender tex)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public TexClip(TexRender tex)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void render(GOut g, float[] gc, float[] tc)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO
