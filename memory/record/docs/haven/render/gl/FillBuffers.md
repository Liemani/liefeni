---
source: [FillBuffers.java](../../../../../../src/haven/render/gl/FillBuffers.java)
created: 2026-06-13
updated: 2026-06-14
---

# FillBuffers

Provides GL backend support for fill buffers.

## Nested Types

### Array

- Role: Represents array within FillBuffers.
- Description: Describes the nested array type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `private final int sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private boolean pushed = false`
- Role: Tracks the pushed flag.
- Description: Caches the `pushed` value for reuse.

#### `private SysBuffer mem = null`
- Role: Caches the mem value.
- Description: Caches the `mem` value for reuse.

### Methods

#### `public Array(GLEnvironment env, int sz)`
- Role: Handles the array path.
- Description: Implements the array operation.

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

#### `public SysBuffer mem()`
- Role: Handles the mem path.
- Description: Implements the mem operation.

#### `public ByteBuffer data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.