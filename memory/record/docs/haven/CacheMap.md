---
source: [CacheMap.java](../../../src/haven/CacheMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# CacheMap

Represents the cache map Haven component.

## Nested Types

### IteredEntry

- Role: Represents itered entry within CacheMap.
- Description: Describes the nested itered entry type used by the enclosing class.

### Ref

- Role: Represents ref within CacheMap.
- Description: Describes the nested ref type used by the enclosing class.

### RefType

- Role: Represents ref type within CacheMap.
- Description: Describes the nested ref type type used by the enclosing class.

### SRef

- Role: Represents sref within CacheMap.
- Description: Describes the nested sref type used by the enclosing class.

### WRef

- Role: Represents wref within CacheMap.
- Description: Describes the nested wref type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Map<K, Reference<V>> back`
- Role: Caches back entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ReferenceQueue<V> cleanq = new ReferenceQueue<V>()`
- Role: Caches cleanq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final RefType reftype`
- Role: Holds the reftype state.
- Description: Backs the cached state for this file.

#### `final K key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `final K key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `private final K k`
- Role: Holds the k state.
- Description: Backs the cached state for this file.

#### `private V v`
- Role: Holds the v state.
- Description: Backs the cached state for this file.

#### `private Set<Entry<K, V>> entries = null`
- Role: Caches entries entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `K key()`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `SRef(K key, V val, ReferenceQueue<V> queue)`
- Role: Handles the sref workflow.
- Description: Supports the sref operation used by the surrounding class.

#### `public K key()`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `WRef(K key, V val, ReferenceQueue<V> queue)`
- Role: Handles the wref workflow.
- Description: Supports the wref operation used by the surrounding class.

#### `public K key()`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public abstract <K, V> Reference<V> mkref(K k, V v, ReferenceQueue<V> cleanq)`
- Role: Performs mkref.
- Description: Supports the mkref operation used by the surrounding class.

#### `public CacheMap(RefType type)`
- Role: Creates a new CacheMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public CacheMap()`
- Role: Creates a new CacheMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public CacheMap(Map<K, V> m)`
- Role: Creates a new CacheMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean containsKey(Object k)`
- Role: Performs contains key.
- Description: Supports the contains key operation used by the surrounding class.

#### `private IteredEntry(K k, V v)`
- Role: Performs itered entry.
- Description: Supports the itered entry operation used by the surrounding class.

#### `public K getKey()`
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

#### `public Set<Entry<K, V>> entrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.

#### `private void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public V get(Object k)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public V put(K k, V v)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `private V remove0(Object k)`
- Role: Performs remove0.
- Description: Supports the remove0 operation used by the surrounding class.

#### `public V remove(Object k)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.
