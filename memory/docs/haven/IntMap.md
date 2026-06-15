# IntMap

This file documents the responsibilities and members of `IntMap`.

## Meta

- Source: [IntMap.java](../../../src/haven/IntMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides an integer-keyed map.

## Nested Types

### IteredEntry

- Description: TODO

## Members

### Constants

#### `private static final Object nil = new Object()`

- Description: TODO

### Fields

#### `private Object[] vals`

- Description: TODO

#### `private int sz`

- Description: TODO

#### `private final int k`

- Description: TODO

#### `private Set<Entry<Integer, V>> entries = null`

- Description: TODO

### Methods

#### `public IntMap(int capacity)`

- Description: TODO

#### `public IntMap()`

- Description: TODO

#### `public IntMap(Map<Integer, V> m)`

- Description: TODO

#### `private Object icast(V v)`

- Description: TODO

#### `private V ocast(Object v)`

- Description: TODO

#### `public boolean containsKey(int k)`

- Description: TODO

#### `public boolean containsKey(Object k)`

- Description: TODO

#### `private IteredEntry(int k)`

- Description: TODO

#### `public Integer getKey()`

- Description: TODO

#### `public V getValue()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public V setValue(V nv)`

- Description: TODO

#### `public Set<Entry<Integer, V>> entrySet()`

- Description: TODO

#### `public V get(int k)`

- Description: TODO

#### `public V get(Object k)`

- Description: TODO

#### `public V put(int k, V v)`

- Description: TODO

#### `public V put(Integer k, V v)`

- Description: TODO

#### `public V remove(int k)`

- Description: TODO

#### `public V remove(Integer k)`

- Description: TODO
