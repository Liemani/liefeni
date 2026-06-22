---
source: [IDSet.java](../../../../src/haven/IDSet.java)
created: 2026-06-13
updated: 2026-06-14
---

# IDSet

Represents the idset Haven component.

## Nested Types

### WRef

- Role: Stores a weakly referenced identity set entry.
- Description: Uses weak references and identity hashes to intern objects without keeping them alive.

## Members

### Constants

### Fields

#### `private final HashMap<WRef<T>, WRef<T>> bk = new HashMap<WRef<T>, WRef<T>>()`
- Role: Implements the bk operation.
- Description: Implements the private final hash map<w ref<t>, w ref<t>> bk = new hash map<w ref<t>, w ref<t>>() operation.

#### `private final ReferenceQueue<T> queue = new ReferenceQueue<T>()`
- Role: Implements the queue operation.
- Description: Implements the private final reference queue<t> queue = new reference queue<t>() operation.

#### `private final int hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

### Methods

#### `private WRef(T ob, ReferenceQueue<T> queue)`
- Role: Handles the wref path.
- Description: Implements the w ref operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public T intern(T ob)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.