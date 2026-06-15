# HashedSet

This file documents the responsibilities and members of `HashedSet`.

## Meta

- Source: [HashedSet.java](../../../src/haven/HashedSet.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a hashed set implementation.

## Members

### Constants

#### `private static final double loadfac = 0.5`

- Description: TODO

### Fields

#### `public final Hash<? super E> hash`

- Description: TODO

#### `private Object[] tab`

- Description: TODO

#### `private int sz`

- Description: TODO

### Methods

#### `public HashedSet(Hash<? super E> hash)`

- Description: TODO

#### `public HashedSet(Hash<? super E> hash, Collection<? extends E> from)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean isEmpty()`

- Description: TODO

#### `private int nextidx(Object[] tab, int idx)`

- Description: TODO

#### `private int hashidx(Object[] tab, E el)`

- Description: TODO

#### `private int findidx(Object[] tab, Object e)`

- Description: TODO

#### `private void remove(Object[] tab, int idx)`

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
