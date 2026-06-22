---
source: [LPreOp.java](../../../../../../src/haven/render/sl/LPreOp.java)
created: 2026-06-13
updated: 2026-06-20
---

# LPreOp

Represents a prefix operator that requires an l-value operand.

## Nested Types

### Inc
Prefix increment expression.

### Dec
Prefix decrement expression.

## Members

### Fields

#### `public final LValue op`
- Role: Stores the l-value operand.
- Description: Emitted after the prefix operator.

### Methods

#### `public LPreOp(LValue op)`
- Role: Builds a prefix l-value operator expression.
- Description: Stores the operand.

#### `public void walk(Walker w)`
- Role: Walks the operand expression.
- Description: Visits the child l-value node.

#### `public abstract String form()`
- Role: Returns the operator spelling.
- Description: Implemented by each concrete prefix operator.

#### `public void output(Output out)`
- Role: Emits the unary expression.
- Description: Writes the operator before the operand.