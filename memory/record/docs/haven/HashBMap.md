---
source: [HashBMap.java](../../../src/haven/HashBMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashBMap

Represents the hash bmap Haven component.

## Members

### Constants

### Fields

#### `private final Map<K, V> fmap`
- Role: Caches fmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<V, K> rmap`
- Role: Caches rmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final BMap<V, K> rev`
- Role: Caches rev entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Set<Entry<K, V>> entries = null`
- Role: Caches entries entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `private HashBMap(Map<K, V> f, Map<V, K> r, BMap<V, K> rev)`
- Role: Creates a new HashBMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public HashBMap()`
- Role: Creates a new HashBMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean containsKey(Object k)`
- Role: Performs contains key.
- Description: Supports the contains key operation used by the surrounding class.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.

#### `public V get(Object k)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public V put(K k, V v)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public V remove(Object k)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public BMap<V, K> reverse()`
- Role: Performs reverse.
- Description: Supports the reverse operation used by the surrounding class.
