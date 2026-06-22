---
source: [HeapBuffer.java](../../../../../../src/haven/render/gl/HeapBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# HeapBuffer

Provides GL backend support for heap buffer.

## Members

### Constants

### Fields

#### `public SysBuffer mem`
- Role: Caches the mem value.
- Description: Caches the `mem` value for reuse.

### Methods

#### `public <T extends DataBuffer> HeapBuffer(GLEnvironment env, T obj, DataBuffer.Filler<? super T> init)`
- Role: Creates a new HeapBuffer instance.
- Description: Constructs the HeapBuffer instance from the supplied inputs.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.