---
source: [BackCache.java](../../../../src/haven/BackCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# BackCache

Represents the back cache Haven component.

## Nested Types

### Cache

- Role: Implements the LRU backing map.
- Description: Access-order LinkedHashMap used to evict stale cached values.

## Members

### Constants

### Fields

#### `public final Function<K, V> load`
- Role: Caches the load value.
- Description: Caches the `load` value for reuse.

#### `public final BiConsumer<K, V> store`
- Role: Caches the store value.
- Description: Caches the `store` value for reuse.

#### `public final BiConsumer<K, V> dispose`
- Role: Caches the dispose value.
- Description: Caches the `dispose` value for reuse.

#### `private final Map<K, V> cache`
- Role: Caches cache for reuse.
- Description: Keeps cache cached for reuse.

#### `private final int size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

### Methods

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store, BiConsumer<K, V> dispose)`
- Role: Creates a new BackCache instance.
- Description: Constructs the BackCache instance from the supplied inputs.

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store)`
- Role: Creates a new BackCache instance.
- Description: Constructs the BackCache instance from the supplied inputs.

#### `private Cache(int size)`
- Role: Handles the cache path.
- Description: Implements the cache operation.

#### `protected boolean removeEldestEntry(Map.Entry<K, V> eldest)`
- Role: Removes the eldest entry.
- Description: Removes the eldest entry.

#### `public boolean cached(K key)`
- Role: Handles the cached path.
- Description: Implements the cached operation.

#### `public V get(K key)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void put(K key, V val)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public void remove(K key)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.