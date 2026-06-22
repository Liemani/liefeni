---
source: [LockDebugList.java](../../../../src/haven/LockDebugList.java)
created: 2026-06-13
updated: 2026-06-14
---

# LockDebugList

Represents the lock debug list Haven component.

## Members

### Constants

### Fields

#### `public final List<E> back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private Object monitor = null`
- Role: Caches the monitor value.
- Description: Caches the `monitor` value for reuse.

### Methods

#### `public LockDebugList(List<E> back)`
- Role: Creates a new LockDebugList instance.
- Description: Constructs the LockDebugList instance from the supplied inputs.

#### `public void check()`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public LockDebugList<E> monitor(Object monitor)`
- Role: Handles the monitor path.
- Description: Implements the monitor operation.

#### `public E get(int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Iterator<E> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public ListIterator<E> listIterator()`
- Role: Handles the list iterator path.
- Description: Implements the list iterator operation.

#### `public ListIterator<E> listIterator(int i)`
- Role: Handles the list iterator path.
- Description: Implements the list iterator operation.

#### `public boolean add(E el)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void add(int i, E el)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public E set(int i, E el)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public E remove(int i)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public boolean remove(Object el)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.