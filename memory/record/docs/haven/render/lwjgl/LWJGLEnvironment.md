---
source: [LWJGLEnvironment.java](../../../../../../src/haven/render/lwjgl/LWJGLEnvironment.java)
created: 2026-06-13
updated: 2026-06-14
---

# LWJGLEnvironment

Adapts the render backend to LWJGL for lwjglenvironment.

## Nested Types

### LWJGLCaps

- Role: Represents lwjglcaps within LWJGLEnvironment.
- Description: Describes the nested lwjglcaps type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final boolean coreprof`
- Role: Tracks the coreprof flag.
- Description: Caches the `coreprof` value for reuse.

### Methods

#### `public LWJGLEnvironment(Area wnd)`
- Role: Creates a new LWJGLEnvironment instance.
- Description: Constructs the LWJGLEnvironment instance from the supplied inputs.

#### `public LWJGLCaps(GL gl, LWJGLEnvironment env)`
- Role: Handles the lwjglcaps path.
- Description: Implements the lwjgl caps operation.

#### `public void checkreq()`
- Role: Handles the checkreq path.
- Description: Implements the checkreq operation.

#### `public LWJGLCaps mkcaps(GL initgl)`
- Role: Handles the mkcaps path.
- Description: Implements the mkcaps operation.

#### `public SysBuffer malloc(int sz)`
- Role: Handles the malloc path.
- Description: Implements the malloc operation.

#### `public SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Handles the subsume path.
- Description: Implements the subsume operation.