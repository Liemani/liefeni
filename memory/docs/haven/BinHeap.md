# BinHeap

This file documents the responsibilities and members of `BinHeap`.

## Meta

- Source: [BinHeap.java](../../../src/haven/BinHeap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a binary heap implementation.

## Members

### Constants

#### `private static final Object[] EMPTY = new Object[0]`

- Description: TODO

### Fields

#### `private final Comparator<? super T> order`

- Description: TODO

#### `private final Map<Object, Integer> index = new IdentityHashMap<>()`

- Description: TODO

#### `private Object[] heap = EMPTY`

- Description: TODO

#### `private int size = 0`

- Description: TODO

### Methods

#### `public BinHeap(Comparator<? super T> order)`

- Description: TODO

#### `private T get(int i)`

- Description: TODO

#### `private void raise(T ob, int idx)`

- Description: TODO

#### `private void lower(T ob, int idx)`

- Description: TODO

#### `public boolean add(T ob)`

- Description: TODO

#### `public boolean remove(Object ob)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public Iterator<T> iterator()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public boolean contains(Object ob)`

- Description: TODO

#### `public boolean offer(T ob)`

- Description: TODO

#### `public T remove()`

- Description: TODO

#### `public T poll()`

- Description: TODO

#### `public T element()`

- Description: TODO

#### `public T peek()`

- Description: TODO
