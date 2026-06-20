---
source: [Test.java](../../../../../src/haven/render/jogl/Test.java)
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
- Role: Defines the shared gay constant.
- Description: Shared constant used by the rest of the class.

#### `static final Coord texsz`
- Role: Defines the shared texsz constant.
- Description: Shared constant used by the rest of the class.

#### `static final byte[] texdat`
- Role: Defines the shared texdat constant.
- Description: Shared constant used by the rest of the class.

#### `static final Texture2D.Sampler2D tex`
- Role: Defines the shared tex constant.
- Description: Shared constant used by the rest of the class.

#### `static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `static final Attribute color = new Attribute(VEC4, "color")`
- Role: Defines the shared color constant.
- Description: Shared constant used by the rest of the class.

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Defines the shared fcolor constant.
- Description: Shared constant used by the rest of the class.

#### `static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `static final Slot<Tex2D> slot = new Slot<>(Slot.Type.DRAW, Tex2D.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `static final Attribute texc = new Attribute(VEC2, "texc")`
- Role: Defines the shared texc constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform usmp = new Uniform(SAMPLER2D, "tex2d", p -> p.get(slot).tex, slot)`
- Role: Defines the shared usmp constant.
- Description: Shared constant used by the rest of the class.

#### `static final AutoVarying ftexc = new AutoVarying(VEC2)`
- Role: Defines the shared ftexc constant.
- Description: Shared constant used by the rest of the class.

#### `static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `GLWindow wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `JOGLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `volatile boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `Pipe base`
- Role: Holds the base state.
- Description: Backs the cached state for this file.

#### `Area shape`
- Role: Holds the shape state.
- Description: Backs the cached state for this file.

#### `final Texture2D.Sampler2D tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `final VertexColor vc = new VertexColor()`
- Role: Stores the vc value.
- Description: Backs the cached state for this file.

#### `final Texture2D.Sampler2D tbuf = new Texture2D.Sampler2D(new Texture2D(512, 512, DataBuffer.Usage.STATIC, new VectorFormat(4, NumberFormat.UNORM8), null))`
- Role: Stores the tbuf value.
- Description: Backs the cached state for this file.

#### `final Texture2D dbuf = new Texture2D(512, 512, DataBuffer.Usage.STATIC, Texture.DEPTH, new VectorFormat(1, NumberFormat.FLOAT32), null)`
- Role: Stores the dbuf value.
- Description: Backs the cached state for this file.

### Methods

#### `Test()`
- Role: Creates a new Test instance.
- Description: Constructs the instance and initializes its default state.

#### `void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `Tex2D(Texture2D.Sampler2D tex)`
- Role: Handles the tex2 d workflow.
- Description: Supports the tex2 d operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `private void display(Render g)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void display(GLAutoDrawable wnd)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void init(GLAutoDrawable wnd)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public void dispose(GLAutoDrawable wnd)`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void reshape(GLAutoDrawable wnd, int x, int y, int w, int h)`
- Role: Performs reshape.
- Description: Supports the reshape operation used by the surrounding class.

#### `public void keyPressed(KeyEvent ev)`
- Role: Performs key pressed.
- Description: Supports the key pressed operation used by the surrounding class.

#### `public void keyReleased(KeyEvent ev)`
- Role: Performs key released.
- Description: Supports the key released operation used by the surrounding class.
