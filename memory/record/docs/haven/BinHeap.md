---
source: [BinHeap.java](../../../src/haven/BinHeap.java)
created: 2026-06-13
updated: 2026-06-14
---

# BinHeap

Represents the bin heap Haven component.

## Members

### Constants

#### `private static final Object[] EMPTY = new Object[0]`
- Role: Defines the shared empty constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Comparator<? super T> order`
- Role: Holds the order state.
- Description: Backs the cached state for this file.

#### `private final Map<Object, Integer> index = new IdentityHashMap<>()`
- Role: Caches index entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Object[] heap = EMPTY`
- Role: Holds the heap state.
- Description: Backs the cached state for this file.

#### `private int size = 0`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

### Methods

#### `public BinHeap(Comparator<? super T> order)`
- Role: Creates a new BinHeap instance.
- Description: Constructs the instance and initializes its default state.

#### `private T get(int i)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private void raise(T ob, int idx)`
- Role: Performs raise.
- Description: Supports the raise operation used by the surrounding class.

#### `private void lower(T ob, int idx)`
- Role: Performs lower.
- Description: Supports the lower operation used by the surrounding class.

#### `public boolean add(T ob)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public boolean remove(Object ob)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Iterator<T> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public boolean contains(Object ob)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public boolean offer(T ob)`
- Role: Performs offer.
- Description: Supports the offer operation used by the surrounding class.

#### `public T remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public T poll()`
- Role: Performs poll.
- Description: Supports the poll operation used by the surrounding class.

#### `public T element()`
- Role: Performs element.
- Description: Supports the element operation used by the surrounding class.

#### `public T peek()`
- Role: Performs peek.
- Description: Supports the peek operation used by the surrounding class.
