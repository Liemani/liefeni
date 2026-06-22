---
source: [WeightList.java](../../../../src/haven/WeightList.java)
created: 2026-06-13
updated: 2026-06-14
---

# WeightList

Represents the weight list Haven component.

## Members

### Constants

### Fields

#### `List<T> c`
- Role: Caches the c value.
- Description: Caches the `c` value for reuse.

#### `List<Integer> w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `int tw = 0`
- Role: Caches the tw value.
- Description: Caches the `tw` value for reuse.

### Methods

#### `public WeightList()`
- Role: Creates a new WeightList instance.
- Description: Constructs the WeightList instance from the supplied inputs.

#### `public void add(T c, int w)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public T pick(int p)`
- Role: Handles the pick path.
- Description: Implements the pick operation.

#### `public T pick(Random gen)`
- Role: Handles the pick path.
- Description: Implements the pick operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.