---
source: [StreamBuffer.java](../../../../../../src/haven/render/gl/StreamBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# StreamBuffer

Provides GL backend support for stream buffer.

## Nested Types

### Fill

- Role: Represents fill within StreamBuffer.
- Description: Describes the nested fill type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final GLBuffer rbuf`
- Role: Caches the rbuf value.
- Description: Caches the `rbuf` value for reuse.

#### `public final int size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `private SysBuffer[] xfbufs =`
- Role: Caches the xfbufs value.
- Description: Caches the `xfbufs` value for reuse.

#### `private boolean[] used =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final ByteBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final boolean[] clear`
- Role: Tracks the clear flag.
- Description: Caches the `clear` value for reuse.

#### `private final Runnable clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

### Methods

#### `public StreamBuffer(GLEnvironment env, int size)`
- Role: Creates a new StreamBuffer instance.
- Description: Constructs the StreamBuffer instance from the supplied inputs.

#### `private SysBuffer mkbuf()`
- Role: Handles the mkbuf path.
- Description: Implements the mkbuf operation.

#### `public ByteBuffer get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void put(ByteBuffer buf)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public void put(BGL gl, ByteBuffer buf)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public Fill()`
- Role: Handles the fill path.
- Description: Implements the fill operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public boolean compatible(Environment env)`
- Role: Handles the compatible path.
- Description: Implements the compatible operation.

#### `public ByteBuffer push()`
- Role: Handles the push path.
- Description: Implements the push operation.

#### `public void pull(ByteBuffer buf)`
- Role: Handles the pull path.
- Description: Implements the pull operation.

#### `ByteBuffer get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.