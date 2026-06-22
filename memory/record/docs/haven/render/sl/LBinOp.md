---
source: [LBinOp.java](../../../../../../src/haven/render/sl/LBinOp.java)
created: 2026-06-13
updated: 2026-06-20
---

# LBinOp

Represents a binary operator that requires an l-value on the left-hand side.

## Nested Types

### Assign
Assignment expression.

### AAdd
Addition assignment expression.

### ASub
Subtraction assignment expression.

### AMul
Multiplication assignment expression.

### ADiv
Division assignment expression.

## Members

### Fields

#### `public final LValue lhs`
- Role: Stores the left-hand l-value.
- Description: Emitted before the operator.

#### `public final Expression rhs`
- Role: Stores the right-hand expression.
- Description: Emitted after the operator.

### Methods

#### `public LBinOp(LValue lhs, Expression rhs)`
- Role: Builds a binary operator expression.
- Description: Stores the left and right operands.

#### `public void walk(Walker w)`
- Role: Walks the operands.
- Description: Visits the left l-value and right expression.

#### `public abstract String form()`
- Role: Returns the operator spelling.
- Description: Implemented by each concrete assignment operator.

#### `public void output(Output out)`
- Role: Emits the binary expression.
- Description: Writes the left operand, operator, and right operand.