---
source: [UIntLiteral.java](../../../../../../src/haven/render/sl/UIntLiteral.java)
created: 2026-06-13
updated: 2026-06-14
---

# UIntLiteral

Represents the uint literal shader-language AST node.

## Members

### Constants

#### `public static final UIntLiteral z = new UIntLiteral(0)`
- Role: Implements the z operation.
- Description: Implements the u int literal operation.
- Value: `new UIntLiteral(0)`

#### `public static final UIntLiteral u = new UIntLiteral(1)`
- Role: Implements the u operation.
- Description: Implements the u int literal operation.
- Value: `new UIntLiteral(1)`

### Fields

#### `public final int val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

### Methods

#### `public UIntLiteral(int val)`
- Role: Creates one uint literal.
- Description: Stores the unsigned integer value used by the literal node.

#### `public void walk(Walker w)`
- Role: Visits the uint literal.
- Description: Uint literals have no child expressions.

#### `public void output(Output out)`
- Role: Emits the uint literal.
- Description: Writes the unsigned integer literal token.