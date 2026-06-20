---
source: [Vec2Cons.java](../../../../../src/haven/render/sl/Vec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vec2Cons

Represents the vec2 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec2Cons z = new Vec2Cons(FloatLiteral.z, FloatLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Vec2Cons u = new Vec2Cons(FloatLiteral.u, FloatLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public Vec2Cons(Expression... els)`
- Role: Creates a new Vec2Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
