---
source: [IVec2Cons.java](../../../../../../src/haven/render/sl/IVec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IVec2Cons

Represents the ivec2 cons shader-language AST node.

## Members

### Constants

#### `public static final IVec2Cons z = new IVec2Cons(IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the i vec2 cons operation.
- Value: `new IVec2Cons(IntLiteral.z, IntLiteral.z)`

#### `public static final IVec2Cons u = new IVec2Cons(IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the i vec2 cons operation.
- Value: `new IVec2Cons(IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public IVec2Cons(Expression... els)`
- Role: Creates one ivec2 constructor expression.
- Description: Stores the two integer component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the ivec2 constructor.
- Description: Writes the `ivec2(...)` expression to output.