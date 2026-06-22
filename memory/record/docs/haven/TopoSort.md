---
source: [TopoSort.java](../../../../src/haven/TopoSort.java)
created: 2026-06-13
updated: 2026-06-14
---

# TopoSort

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
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `protected final Set<T> nodes`
- Role: Caches the nodes value.
- Description: Caches the `nodes` value for reuse.

#### `protected final Graph<T> edges`
- Role: Caches the edges value.
- Description: Caches the `edges` value for reuse.

#### `public final Hash<? super T> hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `public final Map<T, Set<T>> fwd`
- Role: Caches the fwd value.
- Description: Caches the `fwd` value for reuse.

#### `public final Map<T, Set<T>> rwd`
- Role: Caches the rwd value.
- Description: Caches the `rwd` value for reuse.

#### `protected List<T> order`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

### Methods

#### `public Graph(Hash<? super T> hash)`
- Role: Handles the graph path.
- Description: Implements the graph operation.

#### `public <S extends T> Graph(Hash<? super T> hash, Graph<S> from)`
- Role: Handles the graph path.
- Description: Implements the graph operation.

#### `public void add(T from, T to)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(T from, T to)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public boolean removefrom(T from)`
- Role: Handles the removefrom path.
- Description: Removes the from.

#### `public boolean removeto(T to)`
- Role: Handles the removeto path.
- Description: Removes the to.

#### `public Collection<T> from(T from)`
- Role: Handles the from path.
- Description: Implements the from operation.

#### `public Collection<T> to(T to)`
- Role: Handles the to path.
- Description: Implements the to operation.

#### `public TopoSort(Hash<? super T> hash)`
- Role: Creates a new TopoSort instance.
- Description: Constructs the TopoSort instance from the supplied inputs.

#### `public TopoSort()`
- Role: Creates a new TopoSort instance.
- Description: Constructs the TopoSort instance from the supplied inputs.

#### `public TopoSort add(T before, T after)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public TopoSort add(Iterable<? extends T> order)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private void remove(T before, T after)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public List<T> sort()`
- Role: Handles the sort path.
- Description: Implements the sort operation.

#### `public InconsistentOrder(String message)`
- Role: Handles the inconsistent order path.
- Description: Implements the inconsistent order operation.

#### `public InconsistentOrder()`
- Role: Handles the inconsistent order path.
- Description: Implements the inconsistent order operation.

#### `protected List<T> pickbad()`
- Role: Handles the pickbad path.
- Description: Implements the pickbad operation.

#### `protected List<T> pick(Collection<T> from)`
- Role: Handles the pick path.
- Description: Implements the pick operation.

#### `protected Collection<Collection<T>> findcycles()`
- Role: Handles the findcycles path.
- Description: Finds the cycles.