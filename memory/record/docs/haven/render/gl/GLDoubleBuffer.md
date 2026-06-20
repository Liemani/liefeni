---
source: [GLDoubleBuffer.java](../../../../../src/haven/render/gl/GLDoubleBuffer.java)
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
- Role: Caches changed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int prevsz = 16`
- Role: Stores the prevsz value.
- Description: Backs the cached state for this file.

#### `private BufferBGL cur, next`
- Role: Stores the next value.
- Description: Backs the cached state for this file.

#### `private BufferBGL cur, next`
- Role: Stores the next value.
- Description: Backs the cached state for this file.

### Methods

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `public void update(BufferBGL gl)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public boolean get(long timeout) throws InterruptedException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public void put()`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public void put(BGL gl)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.
