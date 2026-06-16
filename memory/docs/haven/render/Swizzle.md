# Swizzle

This file documents the responsibilities and members of `Swizzle`.

## Meta

- Source: [Swizzle.java](../../../../src/haven/render/Swizzle.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the swizzle render pipeline component.

## Members

### Constants

#### `public static final Swizzle ID3 = id(3)`
- Role: Defines the shared id3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Swizzle ID4 = id(4)`
- Role: Defines the shared id4 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Swizzle BGR = new Swizzle(2, 1, 0)`
- Role: Defines the shared bgr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Swizzle BGRA = new Swizzle(2, 1, 0, 3)`
- Role: Defines the shared bgra constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int[] perm`
- Role: Stores the perm value.
- Description: Backs the cached state for this file.

### Methods

#### `public Swizzle(int... perm)`
- Role: Creates a new Swizzle instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean idp()`
- Role: Performs idp.
- Description: Supports the idp operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public static Swizzle id(int nc)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.
