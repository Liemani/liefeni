---
source: [DrawBuffer.java](../../../../src/haven/rs/DrawBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# DrawBuffer

Integrates Haven rendering-server support for draw buffer.

## Members

### Constants

### Fields

#### `public final Environment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `public final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final Texture2D color, depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

#### `public final Texture2D color, depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

#### `private final Pipe.Op basic`
- Role: Holds the basic state.
- Description: Backs the cached state for this file.

### Methods

#### `public DrawBuffer(Environment env, Coord sz)`
- Role: Creates a new DrawBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public Pipe.Op basic()`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public GOut graphics()`
- Role: Performs graphics.
- Description: Supports the graphics operation used by the surrounding class.

#### `public void draw(Drawn thing)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public BufferedImage draw(Pipe.Op state, RenderTree.Node n)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
