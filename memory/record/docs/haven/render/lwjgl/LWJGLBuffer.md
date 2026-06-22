---
source: [LWJGLBuffer.java](../../../../../../src/haven/render/lwjgl/LWJGLBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# LWJGLBuffer

Adapts the render backend to LWJGL for lwjglbuffer.

## Nested Types

### Cleanup

- Role: Represents cleanup within LWJGLBuffer.
- Description: Describes the nested cleanup type used by the enclosing class.

## Members

### Constants

#### `public static final boolean LEAK_CHECK = false`
- Role: Caches the leak check value.
- Description: Caches the `LEAK_CHECK` value for reuse.
- Value: `false`

### Fields

#### `private ByteBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final Cleanup clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

#### `private final Throwable init = LEAK_CHECK ? new Throwable() : null`
- Role: Initializes the class-local cache or runtime state.
- Description: Initializes the class-local cache or runtime state.

#### `private final ByteBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final Runnable fin`
- Role: Caches the fin value.
- Description: Caches the `fin` value for reuse.

#### `private boolean clean`
- Role: Tracks the clean flag.
- Description: Caches the `clean` value for reuse.

### Methods

#### `Cleanup(LWJGLBuffer ob)`
- Role: Handles the cleanup workflow.
- Description: Releases the associated temporary resources.

#### `public void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public LWJGLBuffer(LWJGLEnvironment env, int sz)`
- Role: Creates a new LWJGLBuffer instance.
- Description: Constructs the LWJGLBuffer instance from the supplied inputs.

#### `public ByteBuffer data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `protected boolean leakcheck()`
- Role: Handles the leakcheck path.
- Description: Implements the leakcheck operation.