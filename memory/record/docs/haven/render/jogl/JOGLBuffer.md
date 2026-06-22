---
source: [JOGLBuffer.java](../../../../../../src/haven/render/jogl/JOGLBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# JOGLBuffer

Adapts the render backend to JOGL for joglbuffer.

## Members

### Constants

### Fields

#### `public final ByteBuffer data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

### Methods

#### `public JOGLBuffer(int sz)`
- Role: Creates a new JOGLBuffer instance.
- Description: Constructs the JOGLBuffer instance from the supplied inputs.

#### `public JOGLBuffer(ByteBuffer data)`
- Role: Creates a new JOGLBuffer instance.
- Description: Constructs the JOGLBuffer instance from the supplied inputs.

#### `public ByteBuffer data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.