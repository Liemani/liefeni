# JOGLEnvironment

This file documents the responsibilities and members of `JOGLEnvironment`.

## Meta

- Source: [JOGLEnvironment.java](../../../../../src/haven/render/jogl/JOGLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a JOGL render environment.

## Nested Types

### JOGLCaps

- Description: TODO

## Members

### Constants

### Fields

#### `public final GLContext ctx`

- Description: TODO

#### `public final boolean coreprof`

- Description: TODO

### Methods

#### `private static GL bestwrap(com.jogamp.opengl.GL back)`

- Description: TODO

#### `public JOGLEnvironment(com.jogamp.opengl.GL initgl, GLContext ctx, Area wnd)`

- Description: TODO

#### `public JOGLCaps(GL gl)`

- Description: TODO

#### `public void checkreq()`

- Description: TODO

#### `public JOGLCaps mkcaps(GL initgl)`

- Description: TODO

#### `public SysBuffer malloc(int sz)`

- Description: TODO

#### `public SysBuffer subsume(ByteBuffer data, int sz)`

- Description: TODO
