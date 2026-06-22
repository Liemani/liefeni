---
source: [DrawBuffer.java](../../../../../src/haven/rs/DrawBuffer.java)
created: 2026-06-13
updated: 2026-06-20
---

# DrawBuffer

Owns an off-screen render target with color and depth textures, and can produce a screenshot image.

## Members

### Fields

#### `public final Environment env`
- Role: Holds the render environment used to submit work.

#### `public final Coord sz`
- Role: Stores the output size.

#### `public final Texture2D color, depth`
- Role: Store the off-screen color and depth buffers.

#### `private final Pipe.Op basic`
- Role: Stores the base render state for drawing into the buffer.

### Methods

#### `public DrawBuffer(Environment env, Coord sz)`
- Role: Creates a draw buffer for one render target size.

#### `public Pipe.Op basic()`
- Role: Returns the base render state.

#### `public GOut graphics()`
- Role: Returns a graphics context for drawing into the buffer.

#### `public void draw(Drawn thing)`
- Role: Draws one object into the buffer.

#### `public BufferedImage draw(Pipe.Op state, RenderTree.Node n)`
- Role: Renders a scene node and returns the resulting image.

#### `public void dispose()`
- Role: Releases the backing textures.

