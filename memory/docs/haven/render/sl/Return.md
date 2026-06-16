# Return

This file documents the responsibilities and members of `Return`.

## Meta

- Source: [Return.java](../../../../../src/haven/render/sl/Return.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the return shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression rv`
- Role: Holds the rv state.
- Description: Backs the cached state for this file.

### Methods

#### `public Return(Expression rv)`
- Role: Creates a new Return instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
