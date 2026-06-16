# JOGLEnvironment

This file documents the responsibilities and members of `JOGLEnvironment`.

## Meta

- Source: [JOGLEnvironment.java](../../../../../src/haven/render/jogl/JOGLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Adapts the render backend to JOGL for joglenvironment.

## Nested Types

### JOGLCaps

- Role: Represents joglcaps within JOGLEnvironment.
- Description: Describes the nested joglcaps type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final GLContext ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `public final boolean coreprof`
- Role: Tracks the coreprof flag.
- Description: Supports the coreprof operation used by the surrounding class.

### Methods

#### `private static GL bestwrap(com.jogamp.opengl.GL back)`
- Role: Performs bestwrap.
- Description: Supports the bestwrap operation used by the surrounding class.

#### `public JOGLEnvironment(com.jogamp.opengl.GL initgl, GLContext ctx, Area wnd)`
- Role: Creates a new JOGLEnvironment instance.
- Description: Constructs the instance and initializes its default state.

#### `public JOGLCaps(GL gl)`
- Role: Performs joglcaps.
- Description: Supports the joglcaps operation used by the surrounding class.

#### `public void checkreq()`
- Role: Performs checkreq.
- Description: Supports the checkreq operation used by the surrounding class.

#### `public JOGLCaps mkcaps(GL initgl)`
- Role: Performs mkcaps.
- Description: Supports the mkcaps operation used by the surrounding class.

#### `public SysBuffer malloc(int sz)`
- Role: Performs malloc.
- Description: Supports the malloc operation used by the surrounding class.

#### `public SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Performs subsume.
- Description: Supports the subsume operation used by the surrounding class.
