---
source: [GLDoubleBuffer.java](../../../../../../src/haven/render/gl/GLDoubleBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLDoubleBuffer

Provides GL backend support for gldouble buffer.

## Nested Types

### Buffered

- Role: Represents buffered within GLDoubleBuffer.
- Description: Describes the nested buffered type used by the enclosing class.

## Members

### Constants

### Fields

#### `private List<Buffered> changed = null`
- Role: Caches the changed value.
- Description: Caches the `changed` value for reuse.

#### `private int prevsz = 16`
- Role: Caches the prevsz value.
- Description: Caches the `prevsz` value for reuse.

#### `private BufferBGL cur, next`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

#### `private BufferBGL cur, next`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

### Methods

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `public void update(BufferBGL gl)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public boolean get(long timeout) throws InterruptedException`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public void put()`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public void put(BGL gl)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.