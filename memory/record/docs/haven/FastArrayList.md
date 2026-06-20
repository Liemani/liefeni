---
source: [FastArrayList.java](../../../src/haven/FastArrayList.java)
created: 2026-06-13
updated: 2026-06-14
---

# FastArrayList

Represents the fast array list Haven component.

## Members

### Constants

### Fields

#### `private Object[] bk = null`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private int n = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

### Methods

#### `public FastArrayList()`
- Role: Creates a new FastArrayList instance.
- Description: Constructs the instance and initializes its default state.

#### `public FastArrayList(int sz)`
- Role: Creates a new FastArrayList instance.
- Description: Constructs the instance and initializes its default state.

#### `private Object[] ensure(int sz)`
- Role: Ensures the target value exists.
- Description: Supports the ensure operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public E get(int i)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public boolean add(E e)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public E set(int i, E el)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void add(int i, E el)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public E remove(int i)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public Iterator<E> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public ListIterator<E> listIterator()`
- Role: Performs list iterator.
- Description: Supports the list iterator operation used by the surrounding class.

#### `public ListIterator<E> listIterator(int start)`
- Role: Performs list iterator.
- Description: Supports the list iterator operation used by the surrounding class.
