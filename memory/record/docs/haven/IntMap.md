---
source: [IntMap.java](../../../../src/haven/IntMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# IntMap

Represents the int map Haven component.

## Nested Types

### IteredEntry

- Role: Wraps one iterated map entry.
- Description: Entry adapter used by the map iterator to expose key/value pairs.

## Members

### Constants

#### `private static final Object nil = new Object()`
- Role: Implements the nil operation.
- Description: Implements the object operation.
- Value: `new Object()`

### Fields

#### `private Object[] vals`
- Role: Caches the vals value.
- Description: Caches the `vals` value for reuse.

#### `private int sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final int k`
- Role: Caches the k value.
- Description: Caches the `k` value for reuse.

#### `private Set<Entry<Integer, V>> entries = null`
- Role: Caches the entries value.
- Description: Caches the `entries` value for reuse.

### Methods

#### `public IntMap(int capacity)`
- Role: Creates a new IntMap instance.
- Description: Constructs the IntMap instance from the supplied inputs.

#### `public IntMap()`
- Role: Creates a new IntMap instance.
- Description: Constructs the IntMap instance from the supplied inputs.

#### `public IntMap(Map<Integer, V> m)`
- Role: Creates a new IntMap instance.
- Description: Constructs the IntMap instance from the supplied inputs.

#### `private Object icast(V v)`
- Role: Handles the icast path.
- Description: Implements the icast operation.

#### `private V ocast(Object v)`
- Role: Handles the ocast path.
- Description: Implements the ocast operation.

#### `public boolean containsKey(int k)`
- Role: Handles the contains key path.
- Description: Implements the contains key operation.

#### `public boolean containsKey(Object k)`
- Role: Handles the contains key path.
- Description: Implements the contains key operation.

#### `private IteredEntry(int k)`
- Role: Handles the itered entry path.
- Description: Implements the itered entry operation.

#### `public Integer getKey()`
- Role: Returns the key.
- Description: Returns the key.

#### `public V getValue()`
- Role: Returns the value.
- Description: Returns the value.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public V setValue(V nv)`
- Role: Sets the value.
- Description: Updates the current object state.

#### `public Set<Entry<Integer, V>> entrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.

#### `public V get(int k)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public V get(Object k)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public V put(int k, V v)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public V put(Integer k, V v)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public V remove(int k)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public V remove(Integer k)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.