---
source: [HashBMap.java](../../../../src/haven/HashBMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashBMap

Represents the hash bmap Haven component.

## Members

### Constants

### Fields

#### `private final Map<K, V> fmap`
- Role: Caches the fmap value.
- Description: Caches the `fmap` value for reuse.

#### `private final Map<V, K> rmap`
- Role: Caches the rmap value.
- Description: Caches the `rmap` value for reuse.

#### `private final BMap<V, K> rev`
- Role: Caches the rev value.
- Description: Caches the `rev` value for reuse.

#### `private Set<Entry<K, V>> entries = null`
- Role: Caches the entries value.
- Description: Caches the `entries` value for reuse.

### Methods

#### `private HashBMap(Map<K, V> f, Map<V, K> r, BMap<V, K> rev)`
- Role: Creates a new HashBMap instance.
- Description: Constructs the HashBMap instance from the supplied inputs.

#### `public HashBMap()`
- Role: Creates a new HashBMap instance.
- Description: Constructs the HashBMap instance from the supplied inputs.

#### `public boolean containsKey(Object k)`
- Role: Handles the contains key path.
- Description: Implements the contains key operation.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.

#### `public V get(Object k)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public V put(K k, V v)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public V remove(Object k)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public BMap<V, K> reverse()`
- Role: Handles the reverse path.
- Description: Implements the reverse operation.