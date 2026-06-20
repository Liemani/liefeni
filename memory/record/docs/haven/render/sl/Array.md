---
source: [Array.java](../../../../../src/haven/render/sl/Array.java)
created: 2026-06-13
updated: 2026-06-14
---

# Array

Represents the array shader-language AST node.

## Members

### Constants

### Fields

#### `public final Type el`
- Role: Holds the el state.
- Description: Backs the cached state for this file.

#### `public final int sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

### Methods

#### `public Array(Type el, int sz)`
- Role: Creates a new Array instance.
- Description: Constructs the instance and initializes its default state.

#### `public Array(Type el)`
- Role: Creates a new Array instance.
- Description: Constructs the instance and initializes its default state.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.
