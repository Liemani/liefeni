# BackCache

This file documents the responsibilities and members of `BackCache`.

## Meta

- Source: [BackCache.java](../../../src/haven/BackCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the back cache Haven component.

## Nested Types

### Cache

- Role: Represents cache within BackCache.
- Description: Describes the nested cache type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Function<K, V> load`
- Role: Holds the load state.
- Description: Backs the cached state for this file.

#### `public final BiConsumer<K, V> store`
- Role: Holds the store state.
- Description: Backs the cached state for this file.

#### `public final BiConsumer<K, V> dispose`
- Role: Holds the dispose state.
- Description: Backs the cached state for this file.

#### `private final Map<K, V> cache`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

### Methods

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store, BiConsumer<K, V> dispose)`
- Role: Creates a new BackCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store)`
- Role: Creates a new BackCache instance.
- Description: Constructs the instance and initializes its default state.

#### `private Cache(int size)`
- Role: Performs cache.
- Description: Supports the cache operation used by the surrounding class.

#### `protected boolean removeEldestEntry(Map.Entry<K, V> eldest)`
- Role: Removes the eldest entry.
- Description: Removes the associated value from the current runtime state.

#### `public boolean cached(K key)`
- Role: Performs cached.
- Description: Supports the cached operation used by the surrounding class.

#### `public V get(K key)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void put(K key, V val)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public void remove(K key)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.
