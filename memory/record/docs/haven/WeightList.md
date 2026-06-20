---
source: [WeightList.java](../../../src/haven/WeightList.java)
created: 2026-06-13
updated: 2026-06-14
---

# WeightList

Represents the weight list Haven component.

## Members

### Constants

### Fields

#### `List<T> c`
- Role: Caches c entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `List<Integer> w`
- Role: Caches w entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `int tw = 0`
- Role: Stores the tw value.
- Description: Backs the cached state for this file.

### Methods

#### `public WeightList()`
- Role: Creates a new WeightList instance.
- Description: Constructs the instance and initializes its default state.

#### `public void add(T c, int w)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public T pick(int p)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `public T pick(Random gen)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.
