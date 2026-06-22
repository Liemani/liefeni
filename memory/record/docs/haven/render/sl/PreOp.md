---
source: [PreOp.java](../../../../../../src/haven/render/sl/PreOp.java)
created: 2026-06-13
updated: 2026-06-20
---

# PreOp

Represents a unary prefix operator expression.

## Nested Types

### Neg
Unary negation expression.

## Members

### Fields

#### `public final Expression op`
- Role: Stores the operand expression.
- Description: Emitted after the prefix operator.

### Methods

#### `public PreOp(Expression op)`
- Role: Builds a prefix operator expression.
- Description: Stores the operand.

#### `public void walk(Walker w)`
- Role: Walks the operand expression.
- Description: Visits the child node.

#### `public abstract String form()`
- Role: Returns the operator spelling.
- Description: Implemented by each concrete prefix operator.

#### `public void output(Output out)`
- Role: Emits the unary expression.
- Description: Writes the operator before the operand.