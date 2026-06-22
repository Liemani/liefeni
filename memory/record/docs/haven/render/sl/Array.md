---
source: [Array.java](../../../../../../src/haven/render/sl/Array.java)
created: 2026-06-13
updated: 2026-06-14
---

# Array

Represents the array shader-language AST node.

## Members

### Constants

### Fields

#### `public final Type el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

#### `public final int sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

### Methods

#### `public Array(Type el, int sz)`
- Role: Creates one array type.
- Description: Stores the element type and array size.

#### `public Array(Type el)`
- Role: Creates one unsized array type.
- Description: Stores the element type for a runtime-sized array.

#### `public String name(Context ctx)`
- Role: Returns the GLSL array spelling.
- Description: Formats the element type and size for the current context.

#### `public void use(Context ctx)`
- Role: Registers array dependencies.
- Description: Lets the element type contribute any required context state.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.