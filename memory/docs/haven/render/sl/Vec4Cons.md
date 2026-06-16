# Vec4Cons

This file documents the responsibilities and members of `Vec4Cons`.

## Meta

- Source: [Vec4Cons.java](../../../../../src/haven/render/sl/Vec4Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the vec4 cons shader-language AST node.

## Members

### Constants

#### `public static final Vec4Cons z = new Vec4Cons(FloatLiteral.z, FloatLiteral.z, FloatLiteral.z, FloatLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Vec4Cons u = new Vec4Cons(FloatLiteral.u, FloatLiteral.u, FloatLiteral.u, FloatLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public Vec4Cons(Expression... els)`
- Role: Creates a new Vec4Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
