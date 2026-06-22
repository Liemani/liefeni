---
source: [FieldRef.java](../../../../../../src/haven/render/sl/FieldRef.java)
created: 2026-06-13
updated: 2026-06-14
---

# FieldRef

Represents the field ref shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final String el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

### Methods

#### `public FieldRef(Expression val, String el)`
- Role: Creates one field reference.
- Description: Stores the base expression and field name.

#### `public void walk(Walker w)`
- Role: Visits the base expression.
- Description: Walks the value that owns the referenced field.

#### `public void output(Output out)`
- Role: Emits the field reference.
- Description: Writes the field access syntax for the stored expression.