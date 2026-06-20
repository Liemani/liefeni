---
source: [IVec2Cons.java](../../../../../src/haven/render/sl/IVec2Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IVec2Cons

Represents the ivec2 cons shader-language AST node.

## Members

### Constants

#### `public static final IVec2Cons z = new IVec2Cons(IntLiteral.z, IntLiteral.z)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IVec2Cons u = new IVec2Cons(IntLiteral.u, IntLiteral.u)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public IVec2Cons(Expression... els)`
- Role: Creates a new IVec2Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
