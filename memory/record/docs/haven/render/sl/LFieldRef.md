---
source: [LFieldRef.java](../../../../../../src/haven/render/sl/LFieldRef.java)
created: 2026-06-13
updated: 2026-06-14
---

# LFieldRef

Represents the lfield ref shader-language AST node.

## Members

### Constants

### Fields

#### `public final LValue val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final String el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

### Methods

#### `public LFieldRef(LValue val, String el)`
- Role: Creates one l-value field reference.
- Description: Stores the mutable source expression and field name.

#### `public void walk(Walker w)`
- Role: Visits the source l-value.
- Description: Walks the value that owns the field.

#### `public void output(Output out)`
- Role: Emits the field reference.
- Description: Writes the field access syntax for the mutable expression.