# IDSet

This file documents the responsibilities and members of `IDSet`.

## Meta

- Source: [IDSet.java](../../../src/haven/IDSet.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a set of identifiers.

## Nested Types

### WRef

- Description: TODO

## Members

### Constants

### Fields

#### `private final HashMap<WRef<T>, WRef<T>> bk = new HashMap<WRef<T>, WRef<T>>()`

- Description: TODO

#### `private final ReferenceQueue<T> queue = new ReferenceQueue<T>()`

- Description: TODO

#### `private final int hash`

- Description: TODO

### Methods

#### `private WRef(T ob, ReferenceQueue<T> queue)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private void clean()`

- Description: TODO

#### `public T intern(T ob)`

- Description: TODO

#### `public int size()`

- Description: TODO
