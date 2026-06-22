---
source: [Vec4Cons.java](../../../../../../src/haven/render/sl/Vec4Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vec4Cons

Represents the vec4 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec4Cons z = new Vec4Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the vec4 cons operation.
- Value: `new Vec4Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`

#### `public static final Vec4Cons u = new Vec4Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the vec4 cons operation.
- Value: `new Vec4Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public Vec4Cons(Expression... els)`
- Role: Creates one vec4 constructor expression.
- Description: Stores the four component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the vec4 constructor.
- Description: Writes the `vec4(...)` expression to output.