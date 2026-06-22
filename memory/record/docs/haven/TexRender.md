---
source: [TexRender.java](../../../../src/haven/TexRender.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexRender

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
- Role: Implements the vf tex2d operation.
- Description: Implements the vector format operation.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

#### `private static final ShaderMacro mktex = prog ->`
- Role: Caches the mktex value.
- Description: Caches the `mktex` value for reuse.
- Value: `prog ->`

#### `private static final ShaderMacro mkcentroid = prog ->`
- Role: Caches the mkcentroid value.
- Description: Caches the `mkcentroid` value for reuse.
- Value: `prog ->`

#### `public static final Slot<TexDraw> slot = new Slot<TexDraw>(Slot.Type.DRAW, TexDraw.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<tex draw> slot = new slot<tex draw>(slot.type.draw, tex draw.class) operation.
- Value: `new Slot<TexDraw>(Slot.Type.DRAW, TexDraw.class)`

#### `private static final ShaderMacro nshader = ShaderMacro.compose(mktex, Tex2D.mod)`
- Role: Implements the nshader operation.
- Description: Implements the compose operation.
- Value: `ShaderMacro.compose(mktex, Tex2D.mod)`

#### `private static final ShaderMacro cshader = ShaderMacro.compose(mktex, Tex2D.mod, mkcentroid)`
- Role: Implements the cshader operation.
- Description: Implements the compose operation.
- Value: `ShaderMacro.compose(mktex, Tex2D.mod, mkcentroid)`

#### `public static final Slot<TexClip> slot = new Slot<TexClip>(Slot.Type.GEOM, TexClip.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<tex clip> slot = new slot<tex clip>(slot.type.geom, tex clip.class) operation.
- Value: `new Slot<TexClip>(Slot.Type.GEOM, TexClip.class)`

#### `private static final ShaderMacro shader = ShaderMacro.compose(mktex, Tex2D.clip)`
- Role: Implements the shader operation.
- Description: Implements the compose operation.
- Value: `ShaderMacro.compose(mktex, Tex2D.clip)`

#### `public static final Pipe.Op noclip = p -> p.put(TexClip.slot, null)`
- Role: Implements the noclip operation.
- Description: Implements the put operation.
- Value: `p -> p.put(TexClip.slot, null)`

#### `public static final boolean defclip = true`
- Role: Caches the defclip value.
- Description: Caches the `defclip` value for reuse.
- Value: `true`

### Fields

#### `public final Sampler2D img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public boolean centroid = false`
- Role: Tracks the centroid flag.
- Description: Caches the `centroid` value for reuse.

#### `public final TexRender tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final TexDraw draw = new TexDraw(this)`
- Role: Draws the current minimap content.
- Description: Draws the current minimap content.

#### `public final TexRender tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final TexClip clip = new TexClip(this)`
- Role: Implements the clip operation.
- Description: Implements the tex clip operation.

### Methods

#### `public TexRender(Sampler2D img)`
- Role: Creates a new TexRender instance.
- Description: Constructs the TexRender instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public TexDraw(TexRender tex)`
- Role: Handles the texture draw path.
- Description: Implements the tex draw operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TexRender for debugging and logging.

#### `public TexClip(TexRender tex)`
- Role: Handles the texture clip path.
- Description: Implements the tex clip operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TexRender for debugging and logging.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.