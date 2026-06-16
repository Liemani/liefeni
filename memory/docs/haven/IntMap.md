# IntMap

This file documents the responsibilities and members of `IntMap`.

## Meta

- Source: [IntMap.java](../../../src/haven/IntMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the int map Haven component.

## Nested Types

### IteredEntry

- Role: Represents itered entry within IntMap.
- Description: Describes the nested itered entry type used by the enclosing class.

## Members

### Constants

#### `private static final Object nil = new Object()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private Object[] vals`
- Role: Holds the vals state.
- Description: Backs the cached state for this file.

#### `private int sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final int k`
- Role: Stores the k value.
- Description: Backs the cached state for this file.

#### `private Set<Entry<Integer, V>> entries = null`
- Role: Caches entries entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public IntMap(int capacity)`
- Role: Creates a new IntMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public IntMap()`
- Role: Creates a new IntMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public IntMap(Map<Integer, V> m)`
- Role: Creates a new IntMap instance.
- Description: Constructs the instance and initializes its default state.

#### `private Object icast(V v)`
- Role: Performs icast.
- Description: Supports the icast operation used by the surrounding class.

#### `private V ocast(Object v)`
- Role: Performs ocast.
- Description: Supports the ocast operation used by the surrounding class.

#### `public boolean containsKey(int k)`
- Role: Performs contains key.
- Description: Supports the contains key operation used by the surrounding class.

#### `public boolean containsKey(Object k)`
- Role: Performs contains key.
- Description: Supports the contains key operation used by the surrounding class.

#### `private IteredEntry(int k)`
- Role: Performs itered entry.
- Description: Supports the itered entry operation used by the surrounding class.

#### `public Integer getKey()`
- Role: Returns the key.
- Description: Exposes the requested value without mutating state.

#### `public V getValue()`
- Role: Returns the value.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public V setValue(V nv)`
- Role: Sets the value.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public Set<Entry<Integer, V>> entrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.

#### `public V get(int k)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public V get(Object k)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public V put(int k, V v)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public V put(Integer k, V v)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public V remove(int k)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public V remove(Integer k)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.
