---
source: [HashedMap.java](../../../../src/haven/HashedMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashedMap

Represents the hashed map Haven component.

## Nested Types

### EntryIterator

- Role: Iterates over hash map entries.
- Description: Iterator over the open-addressed backing table.

### EntrySet

- Role: Exposes the map entry set view.
- Description: Set view backed by the hash map entries.

## Members

### Constants

#### `private static final Object NULL = new Object()`
- Role: Implements the null operation.
- Description: Implements the object operation.
- Value: `new Object()`

### Fields

#### `public final Hash<? super K> hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `private Object[] tab`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

#### `private int sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final Object[] tab = HashedMap.this.tab`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

#### `private int idx = -2, st = 0`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `private int idx = -2, st = 0`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `private Set<Entry<K, V>> es = null`
- Role: Caches the es value.
- Description: Caches the `es` value for reuse.

### Methods

#### `public HashedMap(Hash<? super K> hash)`
- Role: Creates a new HashedMap instance.
- Description: Constructs the HashedMap instance from the supplied inputs.

#### `public HashedMap(Hash<? super K> hash, Map<? extends K, ? extends V> from)`
- Role: Creates a new HashedMap instance.
- Description: Constructs the HashedMap instance from the supplied inputs.

#### `private Object nullkey(K key)`
- Role: Handles the nullkey path.
- Description: Implements the nullkey operation.

#### `private K keynull(Object k)`
- Role: Handles the keynull path.
- Description: Implements the keynull operation.

#### `private static int nextidx(Object[] tab, int idx)`
- Role: Handles the nextidx path.
- Description: Implements the nextidx operation.

#### `private int hashidx(Object[] tab, K k)`
- Role: Handles the hashidx path.
- Description: Returns whether the hidx is present.

#### `private void resize(int nsz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public V put(K key, V val)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `private void remove(Object[] tab, int idx)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `private int findidx(Object[] tab, Object key)`
- Role: Handles the findidx path.
- Description: Finds the idx.

#### `public V remove(Object key)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public V get(Object key)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns whether the condition is satisfied.

#### `public boolean containsKey(Object key)`
- Role: Handles the contains key path.
- Description: Implements the contains key operation.

#### `public boolean hasNext()`
- Role: Checks whether the next.
- Description: Returns whether the condition is satisfied.

#### `public Entry<K, V> next()`
- Role: Handles the next path.
- Description: Implements the next operation.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public K getKey()`
- Role: Returns the key.
- Description: Returns the key.

#### `public V getValue()`
- Role: Returns the value.
- Description: Returns the value.

#### `public V setValue(V val)`
- Role: Sets the value.
- Description: Updates the current object state.

#### `private EntrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.

#### `public Iterator<Entry<K, V>> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.