---
source: [IVec4Cons.java](../../../../../src/haven/render/sl/IVec4Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IVec4Cons

Represents the ivec4 cons shader-language AST node.

## Members

### Constants

#### `public static final IVec4Cons z = new IVec4Cons(IntLiteral.z, IntLiteral.z, IntLiteral.z, IntLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IVec4Cons u = new IVec4Cons(IntLiteral.u, IntLiteral.u, IntLiteral.u, IntLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public IVec4Cons(Expression... els)`
- Role: Creates a new IVec4Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
