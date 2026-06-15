# WeakList

This file documents the responsibilities and members of `WeakList`.

## Meta

- Source: [WeakList.java](../../../src/haven/WeakList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a weak list.

## Nested Types

### Entry

- Description: TODO

## Members

### Constants

### Fields

#### `private final ReferenceQueue<T> cleanq = new ReferenceQueue<T>()`

- Description: TODO

#### `private Entry<T> head = null`

- Description: TODO

#### `private Entry<E> n, p`

- Description: TODO

#### `private Entry<E> n, p`

- Description: TODO

#### `private WeakList<E> l`

- Description: TODO

### Methods

#### `private void clean()`

- Description: TODO

#### `public Iterator<T> iterator()`

- Description: TODO

#### `public Entry<T> add2(T e)`

- Description: TODO

#### `public boolean add(T e)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `private Entry(E e, WeakList<E> l)`

- Description: TODO

#### `private void link()`

- Description: TODO

#### `private void unlink()`

- Description: TODO

#### `public void remove()`

- Description: TODO
