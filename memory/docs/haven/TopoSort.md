# TopoSort

This file documents the responsibilities and members of `TopoSort`.

## Meta

- Source: [TopoSort.java](../../../src/haven/TopoSort.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the topo sort Haven component.

## Nested Types

### Graph

- Role: Represents graph within TopoSort.
- Description: Describes the nested graph type used by the enclosing class.

### InconsistentOrder

- Role: Represents inconsistent order within TopoSort.
- Description: Describes the nested inconsistent order type used by the enclosing class.

## Members

### Constants

### Fields

#### `protected final Hash<? super T> hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `protected final Set<T> nodes`
- Role: Caches nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected final Graph<T> edges`
- Role: Holds the edges state.
- Description: Backs the cached state for this file.

#### `public final Hash<? super T> hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `public final Map<T, Set<T>> fwd`
- Role: Caches fwd entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<T, Set<T>> rwd`
- Role: Caches rwd entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected List<T> order`
- Role: Caches order entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Graph(Hash<? super T> hash)`
- Role: Performs graph.
- Description: Supports the graph operation used by the surrounding class.

#### `public <S extends T> Graph(Hash<? super T> hash, Graph<S> from)`
- Role: Performs graph.
- Description: Supports the graph operation used by the surrounding class.

#### `public void add(T from, T to)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(T from, T to)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public boolean removefrom(T from)`
- Role: Performs removefrom.
- Description: Supports the removefrom operation used by the surrounding class.

#### `public boolean removeto(T to)`
- Role: Performs removeto.
- Description: Supports the removeto operation used by the surrounding class.

#### `public Collection<T> from(T from)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.

#### `public Collection<T> to(T to)`
- Role: Performs to.
- Description: Supports the to operation used by the surrounding class.

#### `public TopoSort(Hash<? super T> hash)`
- Role: Creates a new TopoSort instance.
- Description: Constructs the instance and initializes its default state.

#### `public TopoSort()`
- Role: Creates a new TopoSort instance.
- Description: Constructs the instance and initializes its default state.

#### `public TopoSort add(T before, T after)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public TopoSort add(Iterable<? extends T> order)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private void remove(T before, T after)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public List<T> sort()`
- Role: Performs sort.
- Description: Supports the sort operation used by the surrounding class.

#### `public InconsistentOrder(String message)`
- Role: Performs inconsistent order.
- Description: Supports the inconsistent order operation used by the surrounding class.

#### `public InconsistentOrder()`
- Role: Performs inconsistent order.
- Description: Supports the inconsistent order operation used by the surrounding class.

#### `protected List<T> pickbad()`
- Role: Performs pickbad.
- Description: Supports the pickbad operation used by the surrounding class.

#### `protected List<T> pick(Collection<T> from)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `protected Collection<Collection<T>> findcycles()`
- Role: Performs findcycles.
- Description: Supports the findcycles operation used by the surrounding class.
