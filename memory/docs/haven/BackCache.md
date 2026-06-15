# BackCache

This file documents the responsibilities and members of `BackCache`.

## Meta

- Source: [BackCache.java](../../../src/haven/BackCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches resources or data in the background.

## Nested Types

### Cache

- Description: TODO

## Members

### Constants

### Fields

#### `public final Function<K, V> load`

- Description: TODO

#### `public final BiConsumer<K, V> store`

- Description: TODO

#### `public final BiConsumer<K, V> dispose`

- Description: TODO

#### `private final Map<K, V> cache`

- Description: TODO

#### `private final int size`

- Description: TODO

### Methods

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store, BiConsumer<K, V> dispose)`

- Description: TODO

#### `public BackCache(int size, Function<K, V> load, BiConsumer<K, V> store)`

- Description: TODO

#### `private Cache(int size)`

- Description: TODO

#### `protected boolean removeEldestEntry(Map.Entry<K, V> eldest)`

- Description: TODO

#### `public boolean cached(K key)`

- Description: TODO

#### `public V get(K key)`

- Description: TODO

#### `public void put(K key, V val)`

- Description: TODO

#### `public void remove(K key)`

- Description: TODO
