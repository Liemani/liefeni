# HashedMap

This file documents the responsibilities and members of `HashedMap`.

## Meta

- Source: [HashedMap.java](../../../src/haven/HashedMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the hashed map Haven component.

## Nested Types

### EntryIterator

- Role: Represents entry iterator within HashedMap.
- Description: Describes the nested entry iterator type used by the enclosing class.

### EntrySet

- Role: Represents entry set within HashedMap.
- Description: Describes the nested entry set type used by the enclosing class.

## Members

### Constants

#### `private static final Object NULL = new Object()`
- Role: Defines the shared null constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Hash<? super K> hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `private Object[] tab`
- Role: Holds the tab state.
- Description: Backs the cached state for this file.

#### `private int sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final Object[] tab = HashedMap.this.tab`
- Role: Holds the tab state.
- Description: Backs the cached state for this file.

#### `private int idx = -2, st = 0`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `private int idx = -2, st = 0`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `private Set<Entry<K, V>> es = null`
- Role: Caches es entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public HashedMap(Hash<? super K> hash)`
- Role: Creates a new HashedMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public HashedMap(Hash<? super K> hash, Map<? extends K, ? extends V> from)`
- Role: Creates a new HashedMap instance.
- Description: Constructs the instance and initializes its default state.

#### `private Object nullkey(K key)`
- Role: Performs nullkey.
- Description: Supports the nullkey operation used by the surrounding class.

#### `private K keynull(Object k)`
- Role: Performs keynull.
- Description: Supports the keynull operation used by the surrounding class.

#### `private static int nextidx(Object[] tab, int idx)`
- Role: Performs nextidx.
- Description: Supports the nextidx operation used by the surrounding class.

#### `private int hashidx(Object[] tab, K k)`
- Role: Performs hashidx.
- Description: Supports the hashidx operation used by the surrounding class.

#### `private void resize(int nsz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public V put(K key, V val)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `private void remove(Object[] tab, int idx)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `private int findidx(Object[] tab, Object key)`
- Role: Performs findidx.
- Description: Supports the findidx operation used by the surrounding class.

#### `public V remove(Object key)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public V get(Object key)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns a boolean result for the described condition.

#### `public boolean containsKey(Object key)`
- Role: Performs contains key.
- Description: Supports the contains key operation used by the surrounding class.

#### `public boolean hasNext()`
- Role: Checks whether the next.
- Description: Returns a boolean result for the described condition.

#### `public Entry<K, V> next()`
- Role: Performs next.
- Description: Supports the next operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public K getKey()`
- Role: Returns the key.
- Description: Exposes the requested value without mutating state.

#### `public V getValue()`
- Role: Returns the value.
- Description: Exposes the requested value without mutating state.

#### `public V setValue(V val)`
- Role: Sets the value.
- Description: Mutates the owning object to keep runtime state in sync.

#### `private EntrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.

#### `public Iterator<Entry<K, V>> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.
