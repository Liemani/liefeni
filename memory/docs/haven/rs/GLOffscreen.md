# GLOffscreen

This file documents the responsibilities and members of `GLOffscreen`.

## Meta

- Source: [GLOffscreen.java](../../../../src/haven/rs/GLOffscreen.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides offscreen GL rendering support.

## Nested Types

### ProxyEnv

- Description: TODO

## Members

### Constants

### Fields

#### `public final GLProfile prof`

- Description: TODO

#### `public final GLAutoDrawable buf`

- Description: TODO

#### `private final Object dmon = new Object()`

- Description: TODO

#### `private JOGLEnvironment benv = null`

- Description: TODO

#### `private final Environment penv`

- Description: TODO

#### `private static GLOffscreen defctx = null`

- Description: TODO

### Methods

#### `public GLOffscreen()`

- Description: TODO

#### `public Environment back()`

- Description: TODO

#### `public void submit(Render r)`

- Description: TODO

#### `protected GLCapabilities caps(GLProfile prof)`

- Description: TODO

#### `private void redraw(GL3 gl)`

- Description: TODO

#### `public Environment env()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public static GLOffscreen get()`

- Description: TODO
