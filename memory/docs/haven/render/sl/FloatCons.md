# FloatCons

This file documents the responsibilities and members of `FloatCons`.

## Meta

- Source: [FloatCons.java](../../../../../src/haven/render/sl/FloatCons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the float cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

### Methods

#### `public FloatCons(Expression init)`
- Role: Creates a new FloatCons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
