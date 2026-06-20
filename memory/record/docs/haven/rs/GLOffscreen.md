---
source: [GLOffscreen.java](../../../../src/haven/rs/GLOffscreen.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLOffscreen

Integrates Haven rendering-server support for gloffscreen.

## Nested Types

### ProxyEnv

- Role: Represents proxy env within GLOffscreen.
- Description: Describes the nested proxy env type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final GLProfile prof`
- Role: Stores the prof value.
- Description: Backs the cached state for this file.

#### `public final GLAutoDrawable buf`
- Role: Holds the buf state.
- Description: Backs the cached state for this file.

#### `private final Object dmon = new Object()`
- Role: Holds the dmon state.
- Description: Backs the cached state for this file.

#### `private JOGLEnvironment benv = null`
- Role: Holds the benv state.
- Description: Backs the cached state for this file.

#### `private final Environment penv`
- Role: Holds the penv state.
- Description: Backs the cached state for this file.

#### `private static GLOffscreen defctx = null`
- Role: Holds the defctx state.
- Description: Backs the cached state for this file.

### Methods

#### `public GLOffscreen()`
- Role: Creates a new GLOffscreen instance.
- Description: Constructs the instance and initializes its default state.

#### `public Environment back()`
- Role: Performs back.
- Description: Supports the back operation used by the surrounding class.

#### `public void submit(Render r)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `protected GLCapabilities caps(GLProfile prof)`
- Role: Performs caps.
- Description: Supports the caps operation used by the surrounding class.

#### `private void redraw(GL3 gl)`
- Role: Performs redraw.
- Description: Supports the redraw operation used by the surrounding class.

#### `public Environment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public static GLOffscreen get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.
