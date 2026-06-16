# For

This file documents the responsibilities and members of `For`.

## Meta

- Source: [For.java](../../../../../src/haven/render/sl/For.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the for shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init, cond, step`
- Role: Holds the step state.
- Description: Backs the cached state for this file.

#### `public final Expression init, cond, step`
- Role: Holds the step state.
- Description: Backs the cached state for this file.

#### `public final Expression init, cond, step`
- Role: Holds the step state.
- Description: Backs the cached state for this file.

#### `public final Statement body`
- Role: Holds the body state.
- Description: Backs the cached state for this file.

### Methods

#### `public For(Expression init, Expression cond, Expression step, Statement body)`
- Role: Creates a new For instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
