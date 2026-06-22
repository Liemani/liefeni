---
source: [UVec2Cons.java](../../../../../../src/haven/render/sl/UVec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UVec2Cons

Represents the uvec2 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec2Cons z = new UVec2Cons(IntLiteral.z, IntLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the u vec2 cons operation.
- Value: `new UVec2Cons(IntLiteral.z, IntLiteral.z)`

#### `public static final UVec2Cons u = new UVec2Cons(IntLiteral.u, IntLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the u vec2 cons operation.
- Value: `new UVec2Cons(IntLiteral.u, IntLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public UVec2Cons(Expression... els)`
- Role: Creates one uvec2 constructor expression.
- Description: Stores the two unsigned integer component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the uvec2 constructor.
- Description: Writes the `uvec2(...)` expression to output.