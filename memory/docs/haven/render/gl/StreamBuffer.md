# StreamBuffer

This file documents the responsibilities and members of `StreamBuffer`.

## Meta

- Source: [StreamBuffer.java](../../../../../src/haven/render/gl/StreamBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for stream buffer.

## Nested Types

### Fill

- Role: Represents fill within StreamBuffer.
- Description: Describes the nested fill type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final GLBuffer rbuf`
- Role: Stores the rbuf value.
- Description: Backs the cached state for this file.

#### `public final int size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `private SysBuffer[] xfbufs =`
- Role: Holds the stream buffer state.
- Description: Backs the cached state for this file.

#### `private boolean[] used =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final ByteBuffer data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final boolean[] clear`
- Role: Tracks the clear flag.
- Description: Supports the clear operation used by the surrounding class.

#### `private final Runnable clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

### Methods

#### `public StreamBuffer(GLEnvironment env, int size)`
- Role: Creates a new StreamBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `private SysBuffer mkbuf()`
- Role: Performs mkbuf.
- Description: Supports the mkbuf operation used by the surrounding class.

#### `public ByteBuffer get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void put(ByteBuffer buf)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public void put(BGL gl, ByteBuffer buf)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public Fill()`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

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

#### `ByteBuffer get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
