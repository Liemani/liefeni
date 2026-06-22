---
source: [IVec4Cons.java](../../../../../../src/haven/render/sl/IVec4Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IVec4Cons

Represents the ivec4 cons shader-language AST node.

## Members

### Constants

#### `public static final IVec4Cons z = new IVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the i vec4 cons operation.
- Value: `new IVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`

#### `public static final IVec4Cons u = new IVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the i vec4 cons operation.
- Value: `new IVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public IVec4Cons(Expression... els)`
- Role: Creates one ivec4 constructor expression.
- Description: Stores the four integer component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the ivec4 constructor.
- Description: Writes the `ivec4(...)` expression to output.