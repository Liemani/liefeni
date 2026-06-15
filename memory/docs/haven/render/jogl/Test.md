# Test

This file documents the responsibilities and members of `Test`.

## Meta

- Source: [Test.java](../../../../../src/haven/render/jogl/Test.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a rendering backend test harness.

## Nested Types

### Tex2D

- Description: TODO

### VertexColor

- Description: TODO

## Members

### Constants

#### `static final FColor gay = new FColor(1.0f, 0.0f, 0.5f)`

- Description: TODO

#### `static final Coord texsz`

- Description: TODO

#### `static final byte[] texdat`

- Description: TODO

#### `static final Texture2D.Sampler2D tex`

- Description: TODO

#### `static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`

- Description: TODO

#### `static final Attribute color = new Attribute(VEC4, "color")`

- Description: TODO

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`

- Description: TODO

#### `static final ShaderMacro shader = prog ->`

- Description: TODO

#### `static final Slot<Tex2D> slot = new Slot<>(Slot.Type.DRAW, Tex2D.class)`

- Description: TODO

#### `static final Attribute texc = new Attribute(VEC2, "texc")`

- Description: TODO

#### `static final Uniform usmp = new Uniform(SAMPLER2D, "tex2d", p -> p.get(slot).tex, slot)`

- Description: TODO

#### `static final AutoVarying ftexc = new AutoVarying(VEC2)`

- Description: TODO

#### `static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `GLWindow wnd`

- Description: TODO

#### `JOGLEnvironment env`

- Description: TODO

#### `volatile boolean done`

- Description: TODO

#### `Pipe base`

- Description: TODO

#### `Area shape`

- Description: TODO

#### `final Texture2D.Sampler2D tex`

- Description: TODO

#### `final VertexColor vc = new VertexColor()`

- Description: TODO

#### `final Texture2D.Sampler2D tbuf = new Texture2D.Sampler2D(new Texture2D(512, 512, DataBuffer.Usage.STATIC, new VectorFormat(4, NumberFormat.UNORM8), null))`

- Description: TODO

#### `final Texture2D dbuf = new Texture2D(512, 512, DataBuffer.Usage.STATIC, Texture.DEPTH, new VectorFormat(1, NumberFormat.FLOAT32), null)`

- Description: TODO

### Methods

#### `Test()`

- Description: TODO

#### `void run()`

- Description: TODO

#### `public static void main(String[] args)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `Tex2D(Texture2D.Sampler2D tex)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `private void display(Render g)`

- Description: TODO

#### `public void display(GLAutoDrawable wnd)`

- Description: TODO

#### `public void init(GLAutoDrawable wnd)`

- Description: TODO

#### `public void dispose(GLAutoDrawable wnd)`

- Description: TODO

#### `public void reshape(GLAutoDrawable wnd, int x, int y, int w, int h)`

- Description: TODO

#### `public void keyPressed(KeyEvent ev)`

- Description: TODO

#### `public void keyReleased(KeyEvent ev)`

- Description: TODO
