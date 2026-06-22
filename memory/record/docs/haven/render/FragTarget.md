---
source: [FragTarget.java](../../../../../src/haven/render/FragTarget.java)
created: 2026-06-13
updated: 2026-06-14
---

# FragTarget

Defines the frag target render pipeline component.

## Members

### Constants

### Fields

#### `public Object buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `public final boolean mask[] =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public BlendMode blend = null`
- Role: Caches the blend value.
- Description: Caches the `blend` value for reuse.

### Methods

#### `public FragTarget(Object buf)`
- Role: Stores one fragment target binding.
- Description: Wraps the render target buffer and its color mask.

#### `public FragTarget blend(BlendMode blend)`
- Role: Sets the fragment blend mode.
- Description: Returns this target after installing the requested blend mode.

#### `public FragTarget mask(boolean r, boolean g, boolean b, boolean a)`
- Role: Sets the color write mask.
- Description: Enables or disables writes for each color channel.

#### `public FragTarget mask(boolean[] mask)`
- Role: Sets the color write mask.
- Description: Uses a boolean array to configure channel writes.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(FragTarget that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FragTarget for debugging and logging.