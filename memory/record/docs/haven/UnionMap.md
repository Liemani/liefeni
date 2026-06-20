---
source: [UnionMap.java](../../../src/haven/UnionMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# UnionMap

Represents the union map Haven component.

## Members

### Constants

### Fields

#### `private final Collection<Map<? extends K, ? extends V>> parts`
- Role: Caches parts entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public UnionMap(Collection<Map<? extends K, ? extends V>> parts)`
- Role: Creates a new UnionMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public V get(Object key)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Set<Entry<K, V>> entrySet()`
- Role: Performs entry set.
- Description: Supports the entry set operation used by the surrounding class.
