---
source: [CacheMap.java](../../../../src/haven/CacheMap.java)
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
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private final ReferenceQueue<V> cleanq = new ReferenceQueue<V>()`
- Role: Implements the cleanq operation.
- Description: Implements the private final reference queue<v> cleanq = new reference queue<v>() operation.

#### `private final RefType reftype`
- Role: Caches the reftype value.
- Description: Caches the `reftype` value for reuse.

#### `final K key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `final K key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `private final K k`
- Role: Caches the k value.
- Description: Caches the `k` value for reuse.

#### `private V v`
- Role: Caches the v value.
- Description: Caches the `v` value for reuse.

#### `private Set<Entry<K, V>> entries = null`
- Role: Caches the entries value.
- Description: Caches the `entries` value for reuse.

### Methods

#### `K key()`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `SRef(K key, V val, ReferenceQueue<V> queue)`
- Role: Handles the sref workflow.
- Description: Implements the s ref operation.

#### `public K key()`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `WRef(K key, V val, ReferenceQueue<V> queue)`
- Role: Handles the wref workflow.
- Description: Implements the w ref operation.

#### `public K key()`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public abstract <K, V> Reference<V> mkref(K k, V v, ReferenceQueue<V> cleanq)`
- Role: Handles the mkref path.
- Description: Implements the mkref operation.

#### `public CacheMap(RefType type)`
- Role: Creates a new CacheMap instance.
- Description: Constructs the CacheMap instance from the supplied inputs.

#### `public CacheMap()`
- Role: Creates a new CacheMap instance.
- Description: Constructs the CacheMap instance from the supplied inputs.

#### `public CacheMap(Map<K, V> m)`
- Role: Creates a new CacheMap instance.
- Description: Constructs the CacheMap instance from the supplied inputs.

#### `public boolean containsKey(Object k)`
- Role: Handles the contains key path.
- Description: Implements the contains key operation.

#### `private IteredEntry(K k, V v)`
- Role: Handles the itered entry path.
- Description: Implements the itered entry operation.

#### `public K getKey()`
- Role: Returns the key.
- Description: Returns the key.

#### `public V getValue()`
- Role: Returns the value.
- Description: Returns the value.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public V setValue(V nv)`
- Role: Sets the value.
- Description: Updates the current object state.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.

#### `private void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public V get(Object k)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public V put(K k, V v)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `private V remove0(Object k)`
- Role: Handles the remove0 path.
- Description: Removes the 0.

#### `public V remove(Object k)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.