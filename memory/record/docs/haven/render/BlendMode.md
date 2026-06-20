---
source: [BlendMode.java](../../../../src/haven/render/BlendMode.java)
created: 2026-06-13
updated: 2026-06-14
---

# BlendMode

Defines the blend mode render pipeline component.

## Nested Types

### Factor

- Role: Represents factor within BlendMode.
- Description: Describes the nested factor type used by the enclosing class.

### Function

- Role: Represents function within BlendMode.
- Description: Describes the nested function type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Function cfn, afn`
- Role: Holds the afn state.
- Description: Backs the cached state for this file.

#### `public final Function cfn, afn`
- Role: Holds the afn state.
- Description: Backs the cached state for this file.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Holds the adst state.
- Description: Backs the cached state for this file.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Holds the adst state.
- Description: Backs the cached state for this file.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Holds the adst state.
- Description: Backs the cached state for this file.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Holds the adst state.
- Description: Backs the cached state for this file.

#### `public final FColor color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

### Methods

#### `public BlendMode(Function cfn, Factor csrc, Factor cdst, Function afn, Factor asrc, Factor adst, FColor color)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public BlendMode(Function cfn, Factor csrc, Factor cdst, Function afn, Factor asrc, Factor adst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public BlendMode(Factor csrc, Factor cdst, Factor asrc, Factor adst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public BlendMode(Function fn, Factor src, Factor dst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public BlendMode(Factor src, Factor dst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public BlendMode()`
- Role: Creates a new BlendMode instance.
- Description: Constructs the instance and initializes its default state.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
