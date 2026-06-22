---
source: [UIntCons.java](../../../../../../src/haven/render/sl/UIntCons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UIntCons

Represents the uint cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

### Methods

#### `public UIntCons(Expression init)`
- Role: Creates one uint literal expression.
- Description: Stores the initializer expression for the unsigned-int constructor.

#### `public void walk(Walker w)`
- Role: Visits the initializer.
- Description: Walks the source expression for the unsigned-int constructor.

#### `public void output(Output out)`
- Role: Emits the uint constructor.
- Description: Writes the `uint(...)` expression to output.