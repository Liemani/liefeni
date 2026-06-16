# UVec3Cons

This file documents the responsibilities and members of `UVec3Cons`.

## Meta

- Source: [UVec3Cons.java](../../../../../src/haven/render/sl/UVec3Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the uvec3 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec3Cons z = new UVec3Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final UVec3Cons u = new UVec3Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public UVec3Cons(Expression... els)`
- Role: Creates a new UVec3Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
