---
source: [UVec2Cons.java](../../../../../src/haven/render/sl/UVec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# UVec2Cons

Represents the uvec2 cons shader-language AST node.

## Members

### Constants

#### `public static final UVec2Cons z = new UVec2Cons(IntLiteral.z, IntLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final UVec2Cons u = new UVec2Cons(IntLiteral.u, IntLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public UVec2Cons(Expression... els)`
- Role: Creates a new UVec2Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
