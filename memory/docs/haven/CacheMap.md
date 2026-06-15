# CacheMap

This file documents the responsibilities and members of `CacheMap`.

## Meta

- Source: [CacheMap.java](../../../src/haven/CacheMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a cache-backed map implementation.

## Nested Types

### IteredEntry

- Description: TODO

### Ref

- Description: TODO

### RefType

- Description: TODO

### SRef

- Description: TODO

### WRef

- Description: TODO

## Members

### Constants

### Fields

#### `private final Map<K, Reference<V>> back`

- Description: TODO

#### `private final ReferenceQueue<V> cleanq = new ReferenceQueue<V>()`

- Description: TODO

#### `private final RefType reftype`

- Description: TODO

#### `final K key`

- Description: TODO

#### `final K key`

- Description: TODO

#### `private final K k`

- Description: TODO

#### `private V v`

- Description: TODO

#### `private Set<Entry<K, V>> entries = null`

- Description: TODO

### Methods

#### `K key()`

- Description: TODO

#### `SRef(K key, V val, ReferenceQueue<V> queue)`

- Description: TODO

#### `public K key()`

- Description: TODO

#### `WRef(K key, V val, ReferenceQueue<V> queue)`

- Description: TODO

#### `public K key()`

- Description: TODO

#### `public abstract <K, V> Reference<V> mkref(K k, V v, ReferenceQueue<V> cleanq)`

- Description: TODO

#### `public CacheMap(RefType type)`

- Description: TODO

#### `public CacheMap()`

- Description: TODO

#### `public CacheMap(Map<K, V> m)`

- Description: TODO

#### `public boolean containsKey(Object k)`

- Description: TODO

#### `private IteredEntry(K k, V v)`

- Description: TODO

#### `public K getKey()`

- Description: TODO

#### `public V getValue()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public V setValue(V nv)`

- Description: TODO

#### `public Set<Entry<K, V>> entrySet()`

- Description: TODO

#### `private void clean()`

- Description: TODO

#### `public V get(Object k)`

- Description: TODO

#### `public V put(K k, V v)`

- Description: TODO

#### `private V remove0(Object k)`

- Description: TODO

#### `public V remove(Object k)`

- Description: TODO
