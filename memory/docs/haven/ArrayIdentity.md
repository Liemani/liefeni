# ArrayIdentity

This file documents the responsibilities and members of `ArrayIdentity`.

## Meta

- Source: [ArrayIdentity.java](../../../src/haven/ArrayIdentity.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides identity-based array helpers.

## Nested Types

### Entry

- Description: TODO

## Members

### Constants

### Fields

#### `private static HashMap<Entry<?>, Entry<?>> set = new HashMap<Entry<?>, Entry<?>>()`

- Description: TODO

#### `private static ReferenceQueue<Object> cleanq = new ReferenceQueue<Object>()`

- Description: TODO

### Methods

#### `private Entry(T[] arr)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private static void clean()`

- Description: TODO

#### `private static <T> Entry<T> getcanon(Entry<T> e)`

- Description: TODO

#### `public static <T> T[] intern(T[] arr)`

- Description: TODO
