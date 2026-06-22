---
source: [GLOffscreen.java](../../../../../src/haven/rs/GLOffscreen.java)
created: 2026-06-13
updated: 2026-06-20
---

# GLOffscreen

Provides a singleton off-screen JOGL-backed render context for render-server use.

## Members

### Fields

#### `public final GLProfile prof`
- Role: Stores the chosen GL profile.

#### `public final GLAutoDrawable buf`
- Role: Stores the off-screen drawable.

#### `private final Object dmon = new Object()`
- Role: Serializes redraw notifications.

#### `private JOGLEnvironment benv = null`
- Role: Stores the backing JOGL environment once initialized.

#### `private final Environment penv`
- Role: Stores the proxy environment returned to callers.

### Methods

#### `public GLOffscreen()`
- Role: Creates and initializes the off-screen drawable and backing environment.

#### `public Environment env()`
- Role: Returns the proxy environment.

#### `public void dispose()`
- Role: Disposes the off-screen context.

#### `public static GLOffscreen get()`
- Role: Returns the singleton off-screen context.

