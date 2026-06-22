---
source: [FloatCons.java](../../../../../../src/haven/render/sl/FloatCons.java)
created: 2026-06-13
updated: 2026-06-14
---

# FloatCons

Represents the float cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

### Methods

#### `public FloatCons(Expression init)`
- Role: Creates one float literal expression.
- Description: Stores the initializer expression for the float constructor.

#### `public void walk(Walker w)`
- Role: Visits the initializer.
- Description: Walks the source expression for the float constructor.

#### `public void output(Output out)`
- Role: Emits the float constructor.
- Description: Writes the `float(...)` expression to output.