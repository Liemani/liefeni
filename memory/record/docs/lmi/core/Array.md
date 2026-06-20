---
source: [Array.java](../../../../src/lmi/core/Array.java)
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
- Description: Constructs the instance and initializes its default state.

#### `public Array(int capacity)`
- Role: Creates a new Array instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns a boolean result for the described condition.

#### `public int count()`
- Role: Performs count.
- Description: Supports the count operation used by the surrounding class.

#### `public E subscript(int index)`
- Role: Performs subscript.
- Description: Supports the subscript operation used by the surrounding class.

#### `public E first()`
- Role: Performs first.
- Description: Supports the first operation used by the surrounding class.

#### `public E last()`
- Role: Performs last.
- Description: Supports the last operation used by the surrounding class.

#### `public void append(E element)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public E removeFirst()`
- Role: Removes the first.
- Description: Removes the associated value from the current runtime state.

#### `public void removeAllWhere(Predicate<E> predicate)`
- Role: Removes the all where.
- Description: Removes the associated value from the current runtime state.

#### `public boolean containsWhere(Predicate<E> predicate)`
- Role: Performs contains where.
- Description: Supports the contains where operation used by the surrounding class.

#### `public E removeLast()`
- Role: Removes the last.
- Description: Removes the associated value from the current runtime state.

#### `public void removeAll()`
- Role: Removes the all.
- Description: Removes the associated value from the current runtime state.

#### `public Array<E> compactMap(UnaryOperator<E> transform)`
- Role: Performs compact map.
- Description: Supports the compact map operation used by the surrounding class.
