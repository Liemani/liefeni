---
source: [UVec4Cons.java](../../../../../../src/haven/render/sl/UVec4Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UVec4Cons

Represents the uvec4 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec4Cons z = new UVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the u vec4 cons operation.
- Value: `new UVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`

#### `public static final UVec4Cons u = new UVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the u vec4 cons operation.
- Value: `new UVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public UVec4Cons(Expression... els)`
- Role: Creates one uvec4 constructor expression.
- Description: Stores the four unsigned integer component expressions.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the uvec4 constructor.
- Description: Writes the `uvec4(...)` expression to output.