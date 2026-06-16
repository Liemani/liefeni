# If

This file documents the responsibilities and members of `If`.

## Meta

- Source: [If.java](../../../../../src/haven/render/sl/If.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the if shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression cond`
- Role: Holds the cond state.
- Description: Backs the cached state for this file.

#### `public final Statement t, f`
- Role: Holds the f state.
- Description: Backs the cached state for this file.

#### `public final Statement t, f`
- Role: Holds the f state.
- Description: Backs the cached state for this file.

### Methods

#### `public If(Expression cond, Statement t, Statement f)`
- Role: Creates a new If instance.
- Description: Constructs the instance and initializes its default state.

#### `public If(Expression cond, Statement t)`
- Role: Creates a new If instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
