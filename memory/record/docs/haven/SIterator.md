---
source: [SIterator.java](../../../../src/haven/SIterator.java)
created: 2026-06-13
updated: 2026-06-14
---

# SIterator

Represents the siterator Haven component.

## Members

### Constants

### Fields

#### `private int st = 0`
- Role: Caches the st value.
- Description: Caches the `st` value for reuse.

#### `private T n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

### Methods

#### `public abstract T snext() throws NoSuchElementException`
- Role: Handles the snext workflow.
- Description: Implements the snext operation.

#### `private void ref()`
- Role: Handles the ref path.
- Description: Implements the ref operation.

#### `public boolean hasNext()`
- Role: Checks whether the next.
- Description: Returns whether the condition is satisfied.

#### `public T next()`
- Role: Handles the next path.
- Description: Implements the next operation.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.