---
source: [FloatLiteral.java](../../../../../../src/haven/render/sl/FloatLiteral.java)
created: 2026-06-13
updated: 2026-06-14
---

# FloatLiteral

Represents the float literal shader-language AST node.

## Members

### Constants

#### `public static final FloatLiteral z = new FloatLiteral(0)`
- Role: Implements the z operation.
- Description: Implements the float literal operation.
- Value: `new FloatLiteral(0)`

#### `public static final FloatLiteral u = new FloatLiteral(1)`
- Role: Implements the u operation.
- Description: Implements the float literal operation.
- Value: `new FloatLiteral(1)`

#### `public static final FloatLiteral n = new FloatLiteral(-1)`
- Role: Implements the n operation.
- Description: Implements the float literal operation.
- Value: `new FloatLiteral(-1)`

### Fields

#### `public final double val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

### Methods

#### `public FloatLiteral(double val)`
- Role: Creates one float literal.
- Description: Stores the numeric value used by the literal node.

#### `public void walk(Walker w)`
- Role: Visits the float literal.
- Description: Float literals have no child expressions.

#### `public void output(Output out)`
- Role: Emits the float literal.
- Description: Writes the numeric literal token.