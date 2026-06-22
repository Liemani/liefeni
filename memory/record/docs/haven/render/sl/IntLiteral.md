---
source: [IntLiteral.java](../../../../../../src/haven/render/sl/IntLiteral.java)
created: 2026-06-13
updated: 2026-06-14
---

# IntLiteral

Represents the int literal shader-language AST node.

## Members

### Constants

#### `public static final IntLiteral z = new IntLiteral(0)`
- Role: Implements the z operation.
- Description: Implements the int literal operation.
- Value: `new IntLiteral(0)`

#### `public static final IntLiteral u = new IntLiteral(1)`
- Role: Implements the u operation.
- Description: Implements the int literal operation.
- Value: `new IntLiteral(1)`

#### `public static final IntLiteral n = new IntLiteral(-1)`
- Role: Implements the n operation.
- Description: Implements the int literal operation.
- Value: `new IntLiteral(-1)`

### Fields

#### `public final int val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

### Methods

#### `public IntLiteral(int val)`
- Role: Creates one int literal.
- Description: Stores the integer value used by the literal node.

#### `public void walk(Walker w)`
- Role: Visits the int literal.
- Description: Int literals have no child expressions.

#### `public void output(Output out)`
- Role: Emits the int literal.
- Description: Writes the integer literal token.