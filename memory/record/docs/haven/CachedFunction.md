---
source: [CachedFunction.java](../../../src/haven/CachedFunction.java)
created: 2026-06-13
updated: 2026-06-14
---

# CachedFunction

Represents the cached function Haven component.

## Nested Types

### Cache

- Role: Represents cache within CachedFunction.
- Description: Describes the nested cache type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Function<P, R> back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `public final Consumer<? super R> dispose`
- Role: Holds the dispose state.
- Description: Backs the cached state for this file.

#### `private final Map<P, R> cache`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

### Methods

#### `public CachedFunction(int size, Function<P, R> back, Consumer<? super R> dispose)`
- Role: Creates a new CachedFunction instance.
- Description: Constructs the instance and initializes its default state.

#### `public CachedFunction(int size, Function<P, R> back)`
- Role: Creates a new CachedFunction instance.
- Description: Constructs the instance and initializes its default state.

#### `public Cache(int size)`
- Role: Performs cache.
- Description: Supports the cache operation used by the surrounding class.

#### `protected boolean removeEldestEntry(Map.Entry<P, R> eldest)`
- Role: Removes the eldest entry.
- Description: Removes the associated value from the current runtime state.

#### `public R apply(P param)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
