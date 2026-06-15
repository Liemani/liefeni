# CachedFunction

This file documents the responsibilities and members of `CachedFunction`.

## Meta

- Source: [CachedFunction.java](../../../src/haven/CachedFunction.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches the result of a function.

## Nested Types

### Cache

- Description: TODO

## Members

### Constants

### Fields

#### `public final Function<P, R> back`

- Description: TODO

#### `public final Consumer<? super R> dispose`

- Description: TODO

#### `private final Map<P, R> cache`

- Description: TODO

#### `private final int size`

- Description: TODO

### Methods

#### `public CachedFunction(int size, Function<P, R> back, Consumer<? super R> dispose)`

- Description: TODO

#### `public CachedFunction(int size, Function<P, R> back)`

- Description: TODO

#### `public Cache(int size)`

- Description: TODO

#### `protected boolean removeEldestEntry(Map.Entry<P, R> eldest)`

- Description: TODO

#### `public R apply(P param)`

- Description: TODO
