---
source: [WeakList.java](../../../../src/haven/WeakList.java)
created: 2026-06-13
updated: 2026-06-14
---

# WeakList

Represents the weak list Haven component.

## Nested Types

### Entry

- Role: Tracks one weak list node.
- Description: Linked-list entry that holds the weak reference and list links.

## Members

### Constants

### Fields

#### `private final ReferenceQueue<T> cleanq = new ReferenceQueue<T>()`
- Role: Implements the cleanq operation.
- Description: Implements the private final reference queue<t> cleanq = new reference queue<t>() operation.

#### `private Entry<T> head = null`
- Role: Caches the head value.
- Description: Caches the `head` value for reuse.

#### `private Entry<E> n, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private Entry<E> n, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private WeakList<E> l`
- Role: Caches the l value.
- Description: Caches the `l` value for reuse.

### Methods

#### `private void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public Iterator<T> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public Entry<T> add2(T e)`
- Role: Handles the add2 path.
- Description: Adds the 2.

#### `public boolean add(T e)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `private Entry(E e, WeakList<E> l)`
- Role: Handles the entry path.
- Description: Implements the entry operation.

#### `private void link()`
- Role: Handles the link path.
- Description: Implements the link operation.

#### `private void unlink()`
- Role: Handles the unlink path.
- Description: Implements the unlink operation.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.