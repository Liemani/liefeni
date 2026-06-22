---
source: [Add.java](../../../../../../src/haven/render/sl/Add.java)
created: 2026-06-13
updated: 2026-06-14
---

# Add

Represents the add shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] terms`
- Role: Caches the terms value.
- Description: Caches the `terms` value for reuse.

### Methods

#### `public Add(Expression... terms)`
- Role: Creates one addition expression.
- Description: Stores the ordered terms used in the sum.

#### `public void walk(Walker w)`
- Role: Visits the addition terms.
- Description: Walks every term in source order.

#### `public void output(Output out)`
- Role: Emits the addition expression.
- Description: Writes the terms with `+` separators.