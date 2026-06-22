---
source: [UVec3Cons.java](../../../../../../src/haven/render/sl/UVec3Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UVec3Cons

Represents the uvec3 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec3Cons z = new UVec3Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the u vec3 cons operation.
- Value: `new UVec3Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z)`

#### `public static final UVec3Cons u = new UVec3Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the u vec3 cons operation.
- Value: `new UVec3Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public UVec3Cons(Expression... els)`
- Role: Creates one uvec3 constructor expression.
- Description: Stores the three unsigned integer component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the uvec3 constructor.
- Description: Writes the `uvec3(...)` expression to output.