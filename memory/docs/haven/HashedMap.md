# HashedMap

This file documents the responsibilities and members of `HashedMap`.

## Meta

- Source: [HashedMap.java](../../../src/haven/HashedMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a hashed map implementation.

## Nested Types

### EntryIterator

- Description: TODO

### EntrySet

- Description: TODO

## Members

### Constants

#### `private static final Object NULL = new Object()`

- Description: TODO

### Fields

#### `public final Hash<? super K> hash`

- Description: TODO

#### `private Object[] tab`

- Description: TODO

#### `private int sz`

- Description: TODO

#### `private final Object[] tab = HashedMap.this.tab`

- Description: TODO

#### `private int idx = -2, st = 0`

- Description: TODO

#### `private int idx = -2, st = 0`

- Description: TODO

#### `private Set<Entry<K, V>> es = null`

- Description: TODO

### Methods

#### `public HashedMap(Hash<? super K> hash)`

- Description: TODO

#### `public HashedMap(Hash<? super K> hash, Map<? extends K, ? extends V> from)`

- Description: TODO

#### `private Object nullkey(K key)`

- Description: TODO

#### `private K keynull(Object k)`

- Description: TODO

#### `private static int nextidx(Object[] tab, int idx)`

- Description: TODO

#### `private int hashidx(Object[] tab, K k)`

- Description: TODO

#### `private void resize(int nsz)`

- Description: TODO

#### `public V put(K key, V val)`

- Description: TODO

#### `private void remove(Object[] tab, int idx)`

- Description: TODO

#### `private int findidx(Object[] tab, Object key)`

- Description: TODO

#### `public V remove(Object key)`

- Description: TODO

#### `public V get(Object key)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean isEmpty()`

- Description: TODO

#### `public boolean containsKey(Object key)`

- Description: TODO

#### `public boolean hasNext()`

- Description: TODO

#### `public Entry<K, V> next()`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public K getKey()`

- Description: TODO

#### `public V getValue()`

- Description: TODO

#### `public V setValue(V val)`

- Description: TODO

#### `private EntrySet()`

- Description: TODO

#### `public Iterator<Entry<K, V>> iterator()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public Set<Entry<K, V>> entrySet()`

- Description: TODO
