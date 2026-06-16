# Vec3Cons

This file documents the responsibilities and members of `Vec3Cons`.

## Meta

- Source: [Vec3Cons.java](../../../../../src/haven/render/sl/Vec3Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the vec3 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec3Cons z = new Vec3Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Vec3Cons u = new Vec3Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public Vec3Cons(Expression... els)`
- Role: Creates a new Vec3Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
