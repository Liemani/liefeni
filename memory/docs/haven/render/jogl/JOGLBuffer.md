# JOGLBuffer

This file documents the responsibilities and members of `JOGLBuffer`.

## Meta

- Source: [JOGLBuffer.java](../../../../../src/haven/render/jogl/JOGLBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Adapts the render backend to JOGL for joglbuffer.

## Members

### Constants

### Fields

#### `public final ByteBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

### Methods

#### `public JOGLBuffer(int sz)`
- Role: Creates a new JOGLBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public JOGLBuffer(ByteBuffer data)`
- Role: Creates a new JOGLBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public ByteBuffer data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
