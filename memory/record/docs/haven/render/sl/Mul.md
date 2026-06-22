---
source: [Mul.java](../../../../../../src/haven/render/sl/Mul.java)
created: 2026-06-13
updated: 2026-06-14
---

# Mul

Represents the mul shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] terms`
- Role: Caches the terms value.
- Description: Caches the `terms` value for reuse.

### Methods

#### `public Mul(Expression... terms)`
- Role: Creates one multiplication expression.
- Description: Stores the ordered factors used in the product.

#### `public void walk(Walker w)`
- Role: Visits the multiplication factors.
- Description: Walks every factor in source order.

#### `public void output(Output out)`
- Role: Emits the multiplication expression.
- Description: Writes the factors with `*` separators.