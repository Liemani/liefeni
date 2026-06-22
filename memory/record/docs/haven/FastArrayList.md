---
source: [FastArrayList.java](../../../../src/haven/FastArrayList.java)
created: 2026-06-13
updated: 2026-06-14
---

# FastArrayList

Represents the fast array list Haven component.

## Members

### Constants

### Fields

#### `private Object[] bk = null`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `private int n = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

### Methods

#### `public FastArrayList()`
- Role: Creates a new FastArrayList instance.
- Description: Constructs the FastArrayList instance from the supplied inputs.

#### `public FastArrayList(int sz)`
- Role: Creates a new FastArrayList instance.
- Description: Constructs the FastArrayList instance from the supplied inputs.

#### `private Object[] ensure(int sz)`
- Role: Ensures the target value exists.
- Description: Implements the ensure operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public E get(int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public boolean add(E e)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public E set(int i, E el)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void add(int i, E el)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public E remove(int i)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public Iterator<E> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public ListIterator<E> listIterator()`
- Role: Handles the list iterator path.
- Description: Implements the list iterator operation.

#### `public ListIterator<E> listIterator(int start)`
- Role: Handles the list iterator path.
- Description: Implements the list iterator operation.