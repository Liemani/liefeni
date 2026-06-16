# LWJGLEnvironment

This file documents the responsibilities and members of `LWJGLEnvironment`.

## Meta

- Source: [LWJGLEnvironment.java](../../../../../src/haven/render/lwjgl/LWJGLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Description: Supports the coreprof operation used by the surrounding class.

### Methods

#### `public LWJGLEnvironment(Area wnd)`
- Role: Creates a new LWJGLEnvironment instance.
- Description: Constructs the instance and initializes its default state.

#### `public LWJGLCaps(GL gl, LWJGLEnvironment env)`
- Role: Performs lwjglcaps.
- Description: Supports the lwjglcaps operation used by the surrounding class.

#### `public void checkreq()`
- Role: Performs checkreq.
- Description: Supports the checkreq operation used by the surrounding class.

#### `public LWJGLCaps mkcaps(GL initgl)`
- Role: Performs mkcaps.
- Description: Supports the mkcaps operation used by the surrounding class.

#### `public SysBuffer malloc(int sz)`
- Role: Performs malloc.
- Description: Supports the malloc operation used by the surrounding class.

#### `public SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Performs subsume.
- Description: Supports the subsume operation used by the surrounding class.
