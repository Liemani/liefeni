---
source: [BlendMode.java](../../../../../src/haven/render/BlendMode.java)
created: 2026-06-13
updated: 2026-06-14
---

# BlendMode

Defines the blend mode render pipeline component.

## Nested Types

### Factor

- Role: Defines one blend factor.
- Description: Enumerates the source term used when combining color channels.

### Function

- Role: Defines one blend function.
- Description: Enumerates the equation used to combine source and destination colors.

## Members

### Constants

### Fields

#### `public final Function cfn, afn`
- Role: Caches the afn value.
- Description: Caches the `afn` value for reuse.

#### `public final Function cfn, afn`
- Role: Caches the afn value.
- Description: Caches the `afn` value for reuse.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Caches the adst value.
- Description: Caches the `adst` value for reuse.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Caches the adst value.
- Description: Caches the `adst` value for reuse.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Caches the adst value.
- Description: Caches the `adst` value for reuse.

#### `public final Factor csrc, cdst, asrc, adst`
- Role: Caches the adst value.
- Description: Caches the `adst` value for reuse.

#### `public final FColor color`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

### Methods

#### `public BlendMode(Function cfn, Factor csrc, Factor cdst, Function afn, Factor asrc, Factor adst, FColor color)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public BlendMode(Function cfn, Factor csrc, Factor cdst, Function afn, Factor asrc, Factor adst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public BlendMode(Factor csrc, Factor cdst, Factor asrc, Factor adst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public BlendMode(Function fn, Factor src, Factor dst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public BlendMode(Factor src, Factor dst)`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public BlendMode()`
- Role: Creates a new BlendMode instance.
- Description: Constructs the BlendMode instance from the supplied inputs.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BlendMode for debugging and logging.