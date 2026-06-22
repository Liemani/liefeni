---
source: [Test.java](../../../../../../src/haven/render/jogl/Test.java)
created: 2026-06-13
updated: 2026-06-14
---

# Test

Adapts the render backend to JOGL for test.

## Nested Types

### Tex2D

- Role: Represents tex2 d within Test.
- Description: Describes the nested tex2 d type used by the enclosing class.

### VertexColor

- Role: Represents vertex color within Test.
- Description: Describes the nested vertex color type used by the enclosing class.

## Members

### Constants

#### `static final FColor gay = new FColor(1.0f, 0.0f, 0.5f)`
- Role: Implements the gay operation.
- Description: Implements the f color operation.
- Value: `new FColor(1.0f, 0.0f, 0.5f)`

#### `static final Coord texsz`
#### `static final Coord texsz`
- Role: Caches the texsz value.
- Description: Caches the `texsz` value for reuse.

#### `static final byte[] texdat`
#### `static final byte[] texdat`
- Role: Caches the texdat value.
- Description: Caches the `texdat` value for reuse.

#### `static final Texture2D.Sampler2D tex`
#### `static final Texture2D.Sampler2D tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`
- Role: Implements the slot operation.
- Description: Implements the static final slot<vertex color> slot = new slot<>(slot.type.draw, vertex color.class) operation.
- Value: `new Slot<>(Slot.Type.DRAW, VertexColor.class)`

#### `static final Attribute color = new Attribute(VEC4, "color")`
- Role: Implements the color operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC4, "color")`

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Implements the fcolor operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC4)`

#### `static final ShaderMacro shader = prog ->`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.
- Value: `prog ->`

#### `static final Slot<Tex2D> slot = new Slot<>(Slot.Type.DRAW, Tex2D.class)`
- Role: Implements the slot operation.
- Description: Implements the static final slot<tex2 d> slot = new slot<>(slot.type.draw, tex2 d.class) operation.
- Value: `new Slot<>(Slot.Type.DRAW, Tex2D.class)`

#### `static final Attribute texc = new Attribute(VEC2, "texc")`
- Role: Implements the texc operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC2, "texc")`

#### `static final Uniform usmp = new Uniform(SAMPLER2D, "tex2d", p -> p.get(slot).tex, slot)`
- Role: Implements the usmp operation.
- Description: Returns the get value.
- Value: `new Uniform(SAMPLER2D, "tex2d", p -> p.get(slot).tex, slot)`

#### `static final AutoVarying ftexc = new AutoVarying(VEC2)`
- Role: Implements the ftexc operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC2)`

#### `static final ShaderMacro shader = prog ->`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.
- Value: `prog ->`

### Fields

#### `GLWindow wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `JOGLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `volatile boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `Pipe base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `Area shape`
- Role: Caches the shape value.
- Description: Caches the `shape` value for reuse.

#### `final Texture2D.Sampler2D tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `final VertexColor vc = new VertexColor()`
- Role: Implements the vc operation.
- Description: Implements the vertex color operation.

#### `final Texture2D.Sampler2D tbuf = new Texture2D.Sampler2D(new Texture2D(512, 512, DataBuffer.Usage.STATIC, new VectorFormat(4, NumberFormat.UNORM8), null))`
- Role: Implements the tbuf operation.
- Description: Implements the vector format operation.

#### `final Texture2D dbuf = new Texture2D(512, 512, DataBuffer.Usage.STATIC, Texture.DEPTH, new VectorFormat(1, NumberFormat.FLOAT32), null)`
- Role: Implements the dbuf operation.
- Description: Implements the vector format operation.

### Methods

#### `Test()`
- Role: Creates a new Test instance.
- Description: Constructs the Test instance from the supplied inputs.

#### `void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `Tex2D(Texture2D.Sampler2D tex)`
- Role: Handles the tex2 d workflow.
- Description: Implements the tex2 d operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `private void display(Render g)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void display(GLAutoDrawable wnd)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void init(GLAutoDrawable wnd)`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public void dispose(GLAutoDrawable wnd)`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void reshape(GLAutoDrawable wnd, int x, int y, int w, int h)`
- Role: Handles the reshape path.
- Description: Implements the reshape operation.

#### `public void keyPressed(KeyEvent ev)`
- Role: Handles the key pressed path.
- Description: Implements the key pressed operation.

#### `public void keyReleased(KeyEvent ev)`
- Role: Handles the key released path.
- Description: Implements the key released operation.