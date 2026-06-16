# TexRender

This file documents the responsibilities and members of `TexRender`.

## Meta

- Source: [TexRender.java](../../../src/haven/TexRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tex render Haven component.

## Nested Types

### $tex

- Role: Represents $tex within TexRender.
- Description: Describes the nested $tex type used by the enclosing class.

### TexClip

- Role: Represents tex clip within TexRender.
- Description: Describes the nested tex clip type used by the enclosing class.

### TexDraw

- Role: Represents tex draw within TexRender.
- Description: Describes the nested tex draw type used by the enclosing class.

## Members

### Constants

#### `public static final VertexArray.Layout vf_tex2d = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Defines the shared vf tex2d constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro mktex = prog ->`
- Role: Defines the shared mktex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro mkcentroid = prog ->`
- Role: Defines the shared mkcentroid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<TexDraw> slot = new Slot<TexDraw>(Slot.Type.DRAW, TexDraw.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro nshader = ShaderMacro.compose(mktex, Tex2D.mod)`
- Role: Defines the shared nshader constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro cshader = ShaderMacro.compose(mktex, Tex2D.mod, mkcentroid)`
- Role: Defines the shared cshader constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<TexClip> slot = new Slot<TexClip>(Slot.Type.GEOM, TexClip.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = ShaderMacro.compose(mktex, Tex2D.clip)`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op noclip = p -> p.put(TexClip.slot, null)`
- Role: Defines the shared noclip constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean defclip = true`
- Role: Defines the shared defclip constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sampler2D img`
- Role: Holds the img state.
- Description: Backs the cached state for this file.

#### `public boolean centroid = false`
- Role: Tracks the centroid flag.
- Description: Supports the centroid operation used by the surrounding class.

#### `public final TexRender tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final TexDraw draw = new TexDraw(this)`
- Role: Stores the draw value.
- Description: Backs the cached state for this file.

#### `public final TexRender tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final TexClip clip = new TexClip(this)`
- Role: Stores the clip value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexRender(Sampler2D img)`
- Role: Creates a new TexRender instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public TexDraw(TexRender tex)`
- Role: Performs tex draw.
- Description: Supports the tex draw operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public TexClip(TexRender tex)`
- Role: Performs tex clip.
- Description: Supports the tex clip operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
