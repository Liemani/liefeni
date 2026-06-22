---
source: [UnionMap.java](../../../../src/haven/UnionMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# UnionMap

Represents the union map Haven component.

## Members

### Constants

### Fields

#### `private final Collection<Map<? extends K, ? extends V>> parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

### Methods

#### `public UnionMap(Collection<Map<? extends K, ? extends V>> parts)`
- Role: Creates a new UnionMap instance.
- Description: Constructs the UnionMap instance from the supplied inputs.

#### `public V get(Object key)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Handles the entry set path.
- Description: Implements the entry set operation.