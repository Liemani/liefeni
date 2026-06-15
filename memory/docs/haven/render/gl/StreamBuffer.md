# StreamBuffer

This file documents the responsibilities and members of `StreamBuffer`.

## Meta

- Source: [StreamBuffer.java](../../../../../src/haven/render/gl/StreamBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a streamed GL buffer.

## Nested Types

### Fill

- Description: TODO

## Members

### Constants

### Fields

#### `public final GLBuffer rbuf`

- Description: TODO

#### `public final int size`

- Description: TODO

#### `private SysBuffer[] xfbufs =`

- Description: TODO

#### `private boolean[] used =`

- Description: TODO

#### `public final ByteBuffer data`

- Description: TODO

#### `private final boolean[] clear`

- Description: TODO

#### `private final Runnable clean`

- Description: TODO

### Methods

#### `public StreamBuffer(GLEnvironment env, int size)`

- Description: TODO

#### `private SysBuffer mkbuf()`

- Description: TODO

#### `public ByteBuffer get()`

- Description: TODO

#### `public void put(ByteBuffer buf)`

- Description: TODO

#### `public void put(BGL gl, ByteBuffer buf)`

- Description: TODO

#### `public Fill()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean compatible(Environment env)`

- Description: TODO

#### `public ByteBuffer push()`

- Description: TODO

#### `public void pull(ByteBuffer buf)`

- Description: TODO

#### `ByteBuffer get()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void dispose()`

- Description: TODO
