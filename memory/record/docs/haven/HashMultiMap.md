---
source: [HashMultiMap.java](../../../../src/haven/HashMultiMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashMultiMap

Represents the hash multi map Haven component.

## Nested Types

### TaggedList

- Role: Stores multiple values for one key.
- Description: List wrapper used when a map key has more than one associated value.

## Members

### Constants

### Fields

#### `private final HashMap<K, Object> bk = new HashMap<>()`
- Role: Implements the bk operation.
- Description: Implements the private final hash map<k, object> bk = new hash map<>() operation.

#### `private int size = 0`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `private Collection<V> values = null`
- Role: Caches the values value.
- Description: Caches the `values` value for reuse.

### Methods

#### `public void put(K key, V value)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public V remove(K key, V value)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public Collection<V> removeall(K key)`
- Role: Handles the removeall path.
- Description: Removes the all.

#### `public V pop(K key)`
- Role: Applies avatar description updates.
- Description: Implements the pop operation.

#### `public V get(K key)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Collection<V> getall(K key)`
- Role: Handles the getall path.
- Description: Returns the all.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Collection<V> values()`
- Role: Handles the values path.
- Description: Implements the values operation.