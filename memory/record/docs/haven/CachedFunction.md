---
source: [CachedFunction.java](../../../../src/haven/CachedFunction.java)
created: 2026-06-13
updated: 2026-06-14
---

# CachedFunction

Represents the cached function Haven component.

## Nested Types

### Cache

- Role: Stores cached function results in access order.
- Description: Extends `LinkedHashMap` so the oldest result can be evicted when the cache exceeds its size.

## Members

### Constants

### Fields

#### `public final Function<P, R> back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `public final Consumer<? super R> dispose`
- Role: Caches the dispose value.
- Description: Caches the `dispose` value for reuse.

#### `private final Map<P, R> cache`
- Role: Caches cache for reuse.
- Description: Keeps cache cached for reuse.

#### `private final int size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

### Methods

#### `public CachedFunction(int size, Function<P, R> back, Consumer<? super R> dispose)`
- Role: Creates a new CachedFunction instance.
- Description: Constructs the CachedFunction instance from the supplied inputs.

#### `public CachedFunction(int size, Function<P, R> back)`
- Role: Creates a new CachedFunction instance.
- Description: Constructs the CachedFunction instance from the supplied inputs.

#### `public Cache(int size)`
- Role: Handles the cache path.
- Description: Implements the cache operation.

#### `protected boolean removeEldestEntry(Map.Entry<P, R> eldest)`
- Role: Removes the eldest entry.
- Description: Removes the eldest entry.

#### `public R apply(P param)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.