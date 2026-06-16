# FillBuffers

This file documents the responsibilities and members of `FillBuffers`.

## Meta

- Source: [FillBuffers.java](../../../../../src/haven/render/gl/FillBuffers.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for fill buffers.

## Nested Types

### Array

- Role: Represents array within FillBuffers.
- Description: Describes the nested array type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `private final int sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private boolean pushed = false`
- Role: Tracks the pushed flag.
- Description: Supports the pushed operation used by the surrounding class.

#### `private SysBuffer mem = null`
- Role: Stores the mem value.
- Description: Backs the cached state for this file.

### Methods

#### `public Array(GLEnvironment env, int sz)`
- Role: Performs array.
- Description: Supports the array operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public boolean compatible(Environment env)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public ByteBuffer push()`
- Role: Performs push.
- Description: Supports the push operation used by the surrounding class.

#### `public void pull(ByteBuffer buf)`
- Role: Performs pull.
- Description: Supports the pull operation used by the surrounding class.

#### `public SysBuffer mem()`
- Role: Performs mem.
- Description: Supports the mem operation used by the surrounding class.

#### `public ByteBuffer data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
