---
source: [UVec4Cons.java](../../../../../src/haven/render/sl/UVec4Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UVec4Cons

Represents the uvec4 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec4Cons z = new UVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final UVec4Cons u = new UVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public UVec4Cons(Expression... els)`
- Role: Creates a new UVec4Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
