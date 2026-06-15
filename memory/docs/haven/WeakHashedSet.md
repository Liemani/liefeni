# WeakHashedSet

This file documents the responsibilities and members of `WeakHashedSet`.

## Meta

- Source: [WeakHashedSet.java](../../../src/haven/WeakHashedSet.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a weak hashed set.

## Nested Types

### Ref

- Description: TODO

## Members

### Constants

#### `private static final double loadfac = 0.5`

- Description: TODO

### Fields

#### `private final ReferenceQueue<E> cleanq = new ReferenceQueue<>()`

- Description: TODO

#### `public final Hash<? super E> hash`

- Description: TODO

#### `private Ref<E>[] tab`

- Description: TODO

#### `private int sz`

- Description: TODO

#### `final int hash`

- Description: TODO

### Methods

#### `Ref(T ob, ReferenceQueue<T> q)`

- Description: TODO

#### `public WeakHashedSet(Hash<? super E> hash)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean isEmpty()`

- Description: TODO

#### `private int nextidx(Ref[] tab, int idx)`

- Description: TODO

#### `private int hashidx(Ref[] tab, E el)`

- Description: TODO

#### `private int findidx(Ref<E>[] tab, Object e)`

- Description: TODO

#### `private int refidx(Ref<E>[] tab, Ref ref)`

- Description: TODO

#### `private void clean()`

- Description: TODO

#### `private void remove(Ref<E>[] tab, int idx)`

- Description: TODO

#### `public boolean remove(Object el)`

- Description: TODO

#### `private void ckshrink()`

- Description: TODO

#### `private void resize(int nsz)`

- Description: TODO

#### `public boolean add(E el)`

- Description: TODO

#### `public Iterator<E> iterator()`

- Description: TODO

#### `public boolean contains(Object el)`

- Description: TODO

#### `public E find(E el)`

- Description: TODO

#### `public E intern(E el)`

- Description: TODO

#### `public String stats()`

- Description: TODO
