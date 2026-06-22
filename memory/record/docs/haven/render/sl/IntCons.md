---
source: [IntCons.java](../../../../../../src/haven/render/sl/IntCons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IntCons

Represents the int cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

### Methods

#### `public IntCons(Expression init)`
- Role: Creates one int literal expression.
- Description: Stores the initializer expression for the int constructor.

#### `public void walk(Walker w)`
- Role: Visits the initializer.
- Description: Walks the source expression for the int constructor.

#### `public void output(Output out)`
- Role: Emits the int constructor.
- Description: Writes the `int(...)` expression to output.