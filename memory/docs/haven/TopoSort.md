# TopoSort

This file documents the responsibilities and members of `TopoSort`.

## Meta

- Source: [TopoSort.java](../../../src/haven/TopoSort.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides topological sorting.

## Nested Types

### Graph

- Description: TODO

### InconsistentOrder

- Description: TODO

## Members

### Constants

### Fields

#### `protected final Hash<? super T> hash`

- Description: TODO

#### `protected final Set<T> nodes`

- Description: TODO

#### `protected final Graph<T> edges`

- Description: TODO

#### `public final Hash<? super T> hash`

- Description: TODO

#### `public final Map<T, Set<T>> fwd`

- Description: TODO

#### `public final Map<T, Set<T>> rwd`

- Description: TODO

#### `protected List<T> order`

- Description: TODO

### Methods

#### `public Graph(Hash<? super T> hash)`

- Description: TODO

#### `public <S extends T> Graph(Hash<? super T> hash, Graph<S> from)`

- Description: TODO

#### `public void add(T from, T to)`

- Description: TODO

#### `public void remove(T from, T to)`

- Description: TODO

#### `public boolean removefrom(T from)`

- Description: TODO

#### `public boolean removeto(T to)`

- Description: TODO

#### `public Collection<T> from(T from)`

- Description: TODO

#### `public Collection<T> to(T to)`

- Description: TODO

#### `public TopoSort(Hash<? super T> hash)`

- Description: TODO

#### `public TopoSort()`

- Description: TODO

#### `public TopoSort add(T before, T after)`

- Description: TODO

#### `public TopoSort add(Iterable<? extends T> order)`

- Description: TODO

#### `private void remove(T before, T after)`

- Description: TODO

#### `public List<T> sort()`

- Description: TODO

#### `public InconsistentOrder(String message)`

- Description: TODO

#### `public InconsistentOrder()`

- Description: TODO

#### `protected List<T> pickbad()`

- Description: TODO

#### `protected List<T> pick(Collection<T> from)`

- Description: TODO

#### `protected Collection<Collection<T>> findcycles()`

- Description: TODO
