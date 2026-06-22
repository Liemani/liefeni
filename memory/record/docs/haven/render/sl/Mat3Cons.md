---
source: [Mat3Cons.java](../../../../../../src/haven/render/sl/Mat3Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Mat3Cons

Represents the mat3 cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public Mat3Cons(Expression... els)`
- Role: Creates one mat3 constructor expression.
- Description: Stores the nine component expressions for the matrix literal.

#### `public void walk(Walker w)`
- Role: Visits the matrix components.
- Description: Walks each matrix element in source order.

#### `public void output(Output out)`
- Role: Emits the mat3 constructor.
- Description: Writes the `mat3(...)` expression to output.