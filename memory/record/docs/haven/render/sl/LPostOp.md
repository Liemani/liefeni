---
source: [LPostOp.java](../../../../../../src/haven/render/sl/LPostOp.java)
created: 2026-06-13
updated: 2026-06-20
---

# LPostOp

Represents a postfix operator that requires an l-value operand.

## Nested Types

### Inc
Postfix increment expression.

### Dec
Postfix decrement expression.

## Members

### Fields

#### `public final LValue op`
- Role: Stores the l-value operand.
- Description: Emitted before the postfix operator.

### Methods

#### `public LPostOp(LValue op)`
- Role: Builds a postfix l-value operator expression.
- Description: Stores the operand.

#### `public void walk(Walker w)`
- Role: Walks the operand expression.
- Description: Visits the child l-value node.

#### `public abstract String form()`
- Role: Returns the operator spelling.
- Description: Implemented by each concrete postfix operator.

#### `public void output(Output out)`
- Role: Emits the unary expression.
- Description: Writes the operator after the operand.