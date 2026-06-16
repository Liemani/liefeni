# FragTarget

This file documents the responsibilities and members of `FragTarget`.

## Meta

- Source: [FragTarget.java](../../../../src/haven/render/FragTarget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the frag target render pipeline component.

## Members

### Constants

### Fields

#### `public Object buf`
- Role: Holds the buf state.
- Description: Backs the cached state for this file.

#### `public final boolean mask[] =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public BlendMode blend = null`
- Role: Holds the blend state.
- Description: Backs the cached state for this file.

### Methods

#### `public FragTarget(Object buf)`
- Role: Creates a new FragTarget instance.
- Description: Constructs the instance and initializes its default state.

#### `public FragTarget blend(BlendMode blend)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `public FragTarget mask(boolean r, boolean g, boolean b, boolean a)`
- Role: Performs mask.
- Description: Supports the mask operation used by the surrounding class.

#### `public FragTarget mask(boolean[] mask)`
- Role: Performs mask.
- Description: Supports the mask operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(FragTarget that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
