---
source: [Add.java](../../../../../src/haven/render/sl/Add.java)
created: 2026-06-13
updated: 2026-06-14
---

# Add

Represents the add shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] terms`
- Role: Holds the terms state.
- Description: Backs the cached state for this file.

### Methods

#### `public Add(Expression... terms)`
- Role: Creates a new Add instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
