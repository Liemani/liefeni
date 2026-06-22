---
source: [Swizzle.java](../../../../../src/haven/render/Swizzle.java)
created: 2026-06-13
updated: 2026-06-14
---

# Swizzle

Defines the swizzle render pipeline component.

## Members

### Constants

#### `public static final Swizzle ID3 = id(3)`
- Role: Implements the id3 operation.
- Description: Implements the id operation.
- Value: `id(3)`

#### `public static final Swizzle ID4 = id(4)`
- Role: Implements the id4 operation.
- Description: Implements the id operation.
- Value: `id(4)`

#### `public static final Swizzle BGR = new Swizzle(2, 1, 0)`
- Role: Implements the bgr operation.
- Description: Implements the swizzle operation.
- Value: `new Swizzle(2, 1, 0)`

#### `public static final Swizzle BGRA = new Swizzle(2, 1, 0, 3)`
- Role: Implements the bgra operation.
- Description: Implements the swizzle operation.
- Value: `new Swizzle(2, 1, 0, 3)`

### Fields

#### `public final int[] perm`
- Role: Caches the perm value.
- Description: Caches the `perm` value for reuse.

### Methods

#### `public Swizzle(int... perm)`
- Role: Creates one swizzle mapping.
- Description: Stores the channel permutation used during texture reads.

#### `public boolean idp()`
- Role: Tests whether the swizzle is identity.
- Description: Returns true when the permutation keeps the default channel order.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Swizzle for debugging and logging.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public static Swizzle id(int nc)`
- Role: Creates an identity swizzle.
- Description: Returns a swizzle that keeps the first `nc` channels unchanged.