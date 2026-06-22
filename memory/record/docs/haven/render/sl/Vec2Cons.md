---
source: [Vec2Cons.java](../../../../../../src/haven/render/sl/Vec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vec2Cons

Represents the vec2 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec2Cons z = new Vec2Cons(FloatLiteral.z, FloatLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the vec2 cons operation.
- Value: `new Vec2Cons(FloatLiteral.z, FloatLiteral.z)`

#### `public static final Vec2Cons u = new Vec2Cons(FloatLiteral.u, FloatLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the vec2 cons operation.
- Value: `new Vec2Cons(FloatLiteral.u, FloatLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public Vec2Cons(Expression... els)`
- Role: Creates one vec2 constructor expression.
- Description: Stores the two component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the vec2 constructor.
- Description: Writes the `vec2(...)` expression to output.