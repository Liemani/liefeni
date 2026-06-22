---
source: [Array.java](../../../../../src/lmi/core/Array.java)
created: 2026-06-13
updated: 2026-06-14
---

# Array

Provides small array helpers for LMI runtime code.

## Members

### Constants

### Fields

### Methods

#### `public Array()`
- Role: Creates a new Array instance.
- Description: Constructs the Array instance from the supplied inputs.

#### `public Array(int capacity)`
- Role: Creates a new Array instance.
- Description: Constructs the Array instance from the supplied inputs.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns true when the array contains no elements.

#### `public int count()`
- Role: Handles the count path.
- Description: Returns the current number of stored elements.

#### `public E subscript(int index)`
- Role: Handles the subscript path.
- Description: Returns the element at the requested index.

#### `public E first()`
- Role: Handles the first path.
- Description: Returns the first stored element.

#### `public E last()`
- Role: Handles the last path.
- Description: Returns the last stored element.

#### `public void append(E element)`
- Role: Handles the append path.
- Description: Appends an element to the end of the array.

#### `public E removeFirst()`
- Role: Removes the first.
- Description: Removes the first.

#### `public void removeAllWhere(Predicate<E> predicate)`
- Role: Removes the all where.
- Description: Removes the all where.

#### `public boolean containsWhere(Predicate<E> predicate)`
- Role: Handles the contains where path.
- Description: Returns true when any element matches the predicate.

#### `public E removeLast()`
- Role: Removes the last.
- Description: Removes the last.

#### `public void removeAll()`
- Role: Removes the all.
- Description: Removes the all.

#### `public Array<E> compactMap(UnaryOperator<E> transform)`
- Role: Handles the compact map path.
- Description: Maps elements in place and drops null results.