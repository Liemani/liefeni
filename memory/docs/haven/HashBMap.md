# HashBMap

This file documents the responsibilities and members of `HashBMap`.

## Meta

- Source: [HashBMap.java](../../../src/haven/HashBMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a hashed bidirectional map.

## Members

### Constants

### Fields

#### `private final Map<K, V> fmap`

- Description: TODO

#### `private final Map<V, K> rmap`

- Description: TODO

#### `private final BMap<V, K> rev`

- Description: TODO

#### `private Set<Entry<K, V>> entries = null`

- Description: TODO

### Methods

#### `private HashBMap(Map<K, V> f, Map<V, K> r, BMap<V, K> rev)`

- Description: TODO

#### `public HashBMap()`

- Description: TODO

#### `public boolean containsKey(Object k)`

- Description: TODO

#### `public Set<Entry<K, V>> entrySet()`

- Description: TODO

#### `public V get(Object k)`

- Description: TODO

#### `public V put(K k, V v)`

- Description: TODO

#### `public V remove(Object k)`

- Description: TODO

#### `public BMap<V, K> reverse()`

- Description: TODO
