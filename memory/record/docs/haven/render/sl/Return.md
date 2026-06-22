---
source: [Return.java](../../../../../../src/haven/render/sl/Return.java)
created: 2026-06-13
updated: 2026-06-14
---

# Return

Represents the return shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression rv`
- Role: Caches the rv value.
- Description: Caches the `rv` value for reuse.

### Methods

#### `public Return(Expression rv)`
- Role: Creates a return statement.
- Description: Stores the returned expression.

#### `public void walk(Walker w)`
- Role: Visits the return value.
- Description: Walks the expression being returned.

#### `public void output(Output out)`
- Role: Emits the return statement.
- Description: Writes the `return` keyword and the stored expression.