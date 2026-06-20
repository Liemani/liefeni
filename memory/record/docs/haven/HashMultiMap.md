---
source: [HashMultiMap.java](../../../src/haven/HashMultiMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashMultiMap

Represents the hash multi map Haven component.

## Nested Types

### TaggedList

- Role: Represents tagged list within HashMultiMap.
- Description: Describes the nested tagged list type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final HashMap<K, Object> bk = new HashMap<>()`
- Role: Caches bk entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int size = 0`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `private Collection<V> values = null`
- Role: Caches values entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void put(K key, V value)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public V remove(K key, V value)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public Collection<V> removeall(K key)`
- Role: Performs removeall.
- Description: Supports the removeall operation used by the surrounding class.

#### `public V pop(K key)`
- Role: Applies avatar description updates.
- Description: Supports the pop operation used by the surrounding class.

#### `public V get(K key)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Collection<V> getall(K key)`
- Role: Performs getall.
- Description: Supports the getall operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Collection<V> values()`
- Role: Performs values.
- Description: Supports the values operation used by the surrounding class.
