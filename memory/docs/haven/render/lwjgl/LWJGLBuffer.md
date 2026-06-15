# LWJGLBuffer

This file documents the responsibilities and members of `LWJGLBuffer`.

## Meta

- Source: [LWJGLBuffer.java](../../../../../src/haven/render/lwjgl/LWJGLBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an LWJGL buffer.

## Nested Types

### Cleanup

- Description: TODO

## Members

### Constants

#### `public static final boolean LEAK_CHECK = false`

- Description: TODO

### Fields

#### `private ByteBuffer data`

- Description: TODO

#### `private final Cleanup clean`

- Description: TODO

#### `private final Throwable init = LEAK_CHECK ? new Throwable() : null`

- Description: TODO

#### `private final ByteBuffer data`

- Description: TODO

#### `private final Runnable fin`

- Description: TODO

#### `private boolean clean`

- Description: TODO

### Methods

#### `Cleanup(LWJGLBuffer ob)`

- Description: TODO

#### `public void clean()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public LWJGLBuffer(LWJGLEnvironment env, int sz)`

- Description: TODO

#### `public ByteBuffer data()`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `protected boolean leakcheck()`

- Description: TODO
