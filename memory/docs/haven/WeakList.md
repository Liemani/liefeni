# WeakList

This file documents the responsibilities and members of `WeakList`.

## Meta

- Source: [WeakList.java](../../../src/haven/WeakList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the weak list Haven component.

## Nested Types

### Entry

- Role: Represents entry within WeakList.
- Description: Describes the nested entry type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final ReferenceQueue<T> cleanq = new ReferenceQueue<T>()`
- Role: Caches cleanq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Entry<T> head = null`
- Role: Holds the head state.
- Description: Backs the cached state for this file.

#### `private Entry<E> n, p`
- Role: Holds the p state.
- Description: Backs the cached state for this file.

#### `private Entry<E> n, p`
- Role: Holds the p state.
- Description: Backs the cached state for this file.

#### `private WeakList<E> l`
- Role: Caches l entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `private void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public Iterator<T> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public Entry<T> add2(T e)`
- Role: Performs add2.
- Description: Supports the add2 operation used by the surrounding class.

#### `public boolean add(T e)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `private Entry(E e, WeakList<E> l)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `private void link()`
- Role: Performs link.
- Description: Supports the link operation used by the surrounding class.

#### `private void unlink()`
- Role: Performs unlink.
- Description: Supports the unlink operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.
