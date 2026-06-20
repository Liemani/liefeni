---
source: [UIntLiteral.java](../../../../../src/haven/render/sl/UIntLiteral.java)
created: 2026-06-13
updated: 2026-06-14
---

# UIntLiteral

Represents the uint literal shader-language AST node.

## Members

### Constants

#### `public static final UIntLiteral z = new UIntLiteral(0)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final UIntLiteral u = new UIntLiteral(1)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int val`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

### Methods

#### `public UIntLiteral(int val)`
- Role: Creates a new UIntLiteral instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
