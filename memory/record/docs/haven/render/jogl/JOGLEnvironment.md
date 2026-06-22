---
source: [JOGLEnvironment.java](../../../../../../src/haven/render/jogl/JOGLEnvironment.java)
created: 2026-06-13
updated: 2026-06-14
---

# JOGLEnvironment

Adapts the render backend to JOGL for joglenvironment.

## Nested Types

### JOGLCaps

- Role: Represents joglcaps within JOGLEnvironment.
- Description: Describes the nested joglcaps type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final GLContext ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `public final boolean coreprof`
- Role: Tracks the coreprof flag.
- Description: Caches the `coreprof` value for reuse.

### Methods

#### `private static GL bestwrap(com.jogamp.opengl.GL back)`
- Role: Handles the bestwrap path.
- Description: Implements the bestwrap operation.

#### `public JOGLEnvironment(com.jogamp.opengl.GL initgl, GLContext ctx, Area wnd)`
- Role: Creates a new JOGLEnvironment instance.
- Description: Constructs the JOGLEnvironment instance from the supplied inputs.

#### `public JOGLCaps(GL gl)`
- Role: Handles the joglcaps path.
- Description: Implements the jogl caps operation.

#### `public void checkreq()`
- Role: Handles the checkreq path.
- Description: Implements the checkreq operation.

#### `public JOGLCaps mkcaps(GL initgl)`
- Role: Handles the mkcaps path.
- Description: Implements the mkcaps operation.

#### `public SysBuffer malloc(int sz)`
- Role: Handles the malloc path.
- Description: Implements the malloc operation.

#### `public SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Handles the subsume path.
- Description: Implements the subsume operation.