# IDSet

This file documents the responsibilities and members of `IDSet`.

## Meta

- Source: [IDSet.java](../../../src/haven/IDSet.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the idset Haven component.

## Nested Types

### WRef

- Role: Represents wref within IDSet.
- Description: Describes the nested wref type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final HashMap<WRef<T>, WRef<T>> bk = new HashMap<WRef<T>, WRef<T>>()`
- Role: Caches bk entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ReferenceQueue<T> queue = new ReferenceQueue<T>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int hash`
- Role: Stores the hash value.
- Description: Backs the cached state for this file.

### Methods

#### `private WRef(T ob, ReferenceQueue<T> queue)`
- Role: Performs wref.
- Description: Supports the wref operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public T intern(T ob)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.
