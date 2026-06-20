---
source: [IntCons.java](../../../../../src/haven/render/sl/IntCons.java)
created: 2026-06-13
updated: 2026-06-14
---

# IntCons

Represents the int cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

### Methods

#### `public IntCons(Expression init)`
- Role: Creates a new IntCons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
