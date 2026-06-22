---
source: [IVec3Cons.java](../../../../../../src/haven/render/sl/IVec3Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IVec3Cons

Represents the ivec3 cons shader-language AST node.

## Members

### Constants

#### `public static final IVec3Cons z = new IVec3Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the i vec3 cons operation.
- Value: `new IVec3Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z)`

#### `public static final IVec3Cons u = new IVec3Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the i vec3 cons operation.
- Value: `new IVec3Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public IVec3Cons(Expression... els)`
- Role: Creates one ivec3 constructor expression.
- Description: Stores the three integer component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the ivec3 constructor.
- Description: Writes the `ivec3(...)` expression to output.