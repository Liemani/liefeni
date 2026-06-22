---
source: [BinHeap.java](../../../../src/haven/BinHeap.java)
created: 2026-06-13
updated: 2026-06-14
---

# BinHeap

Represents the bin heap Haven component.

## Members

### Constants

#### `private static final Object[] EMPTY = new Object[0]`
- Role: Caches the empty value.
- Description: Caches the `EMPTY` value for reuse.
- Value: `new Object[0]`

### Fields

#### `private final Comparator<? super T> order`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

#### `private final Map<Object, Integer> index = new IdentityHashMap<>()`
- Role: Implements the index operation.
- Description: Implements the private final map<object, integer> index = new identity hash map<>() operation.

#### `private Object[] heap = EMPTY`
- Role: Caches the heap value.
- Description: Caches the `heap` value for reuse.

#### `private int size = 0`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

### Methods

#### `public BinHeap(Comparator<? super T> order)`
- Role: Creates a new BinHeap instance.
- Description: Constructs the BinHeap instance from the supplied inputs.

#### `private T get(int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private void raise(T ob, int idx)`
- Role: Handles the raise path.
- Description: Implements the raise operation.

#### `private void lower(T ob, int idx)`
- Role: Handles the lower path.
- Description: Implements the lower operation.

#### `public boolean add(T ob)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public boolean remove(Object ob)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Iterator<T> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public boolean contains(Object ob)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public boolean offer(T ob)`
- Role: Handles the offer path.
- Description: Implements the offer operation.

#### `public T remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public T poll()`
- Role: Removes and returns the highest-priority element.
- Description: Removes and returns the highest-priority element.

#### `public T element()`
- Role: Handles the element path.
- Description: Implements the element operation.

#### `public T peek()`
- Role: Returns the highest-priority element without removing it.
- Description: Returns the highest-priority element without removing it.