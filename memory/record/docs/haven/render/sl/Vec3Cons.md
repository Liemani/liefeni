---
source: [Vec3Cons.java](../../../../../../src/haven/render/sl/Vec3Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vec3Cons

Represents the vec3 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec3Cons z = new Vec3Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`
- Role: Implements the z operation.
- Description: Implements the vec3 cons operation.
- Value: `new Vec3Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`

#### `public static final Vec3Cons u = new Vec3Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`
- Role: Implements the u operation.
- Description: Implements the vec3 cons operation.
- Value: `new Vec3Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`

### Fields

#### `public final Expression[] els`
- Role: Caches the els value.
- Description: Caches the `els` value for reuse.

### Methods

#### `public Vec3Cons(Expression... els)`
- Role: Creates one vec3 constructor expression.
- Description: Stores the three component expressions for the vector literal.

#### `public void walk(Walker w)`
- Role: Visits the vector components.
- Description: Walks each component expression in order.

#### `public void output(Output out)`
- Role: Emits the vec3 constructor.
- Description: Writes the `vec3(...)` expression to output.