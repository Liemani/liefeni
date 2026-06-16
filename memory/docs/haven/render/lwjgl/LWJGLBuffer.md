# LWJGLBuffer

This file documents the responsibilities and members of `LWJGLBuffer`.

## Meta

- Source: [LWJGLBuffer.java](../../../../../src/haven/render/lwjgl/LWJGLBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Adapts the render backend to LWJGL for lwjglbuffer.

## Nested Types

### Cleanup

- Role: Represents cleanup within LWJGLBuffer.
- Description: Describes the nested cleanup type used by the enclosing class.

## Members

### Constants

#### `public static final boolean LEAK_CHECK = false`
- Role: Defines the shared leak check constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private ByteBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final Cleanup clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

#### `private final Throwable init = LEAK_CHECK ? new Throwable() : null`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `private final ByteBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final Runnable fin`
- Role: Holds the fin state.
- Description: Backs the cached state for this file.

#### `private boolean clean`
- Role: Tracks the clean flag.
- Description: Supports the clean operation used by the surrounding class.

### Methods

#### `Cleanup(LWJGLBuffer ob)`
- Role: Handles the cleanup workflow.
- Description: Supports the cleanup operation used by the surrounding class.

#### `public void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public LWJGLBuffer(LWJGLEnvironment env, int sz)`
- Role: Creates a new LWJGLBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public ByteBuffer data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `protected boolean leakcheck()`
- Role: Performs leakcheck.
- Description: Supports the leakcheck operation used by the surrounding class.
