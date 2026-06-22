---
source: [VectorFormat.java](../../../../../src/haven/render/VectorFormat.java)
created: 2026-06-13
updated: 2026-06-14
---

# VectorFormat

Defines the vector format render pipeline component.

## Members

### Constants

### Fields

#### `public final int nc`
- Role: Caches the nc value.
- Description: Caches the `nc` value for reuse.

#### `public final NumberFormat cf`
- Role: Caches the cf value.
- Description: Caches the `cf` value for reuse.

### Methods

#### `public VectorFormat(int nc, NumberFormat cf)`
- Role: Creates one vector format.
- Description: Stores the component count and component format.

#### `public int size()`
- Role: Returns the packed byte size.
- Description: Reports the storage size for one vector value.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this VectorFormat for debugging and logging.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.