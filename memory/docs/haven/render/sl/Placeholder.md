# Placeholder

This file documents the responsibilities and members of `Placeholder`.

## Meta

- Source: [Placeholder.java](../../../../../src/haven/render/sl/Placeholder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the placeholder shader-language AST node.

## Members

### Constants

### Fields

#### `public final String comment`
- Role: Stores the comment value.
- Description: Backs the cached state for this file.

### Methods

#### `public Placeholder(String comment)`
- Role: Creates a new Placeholder instance.
- Description: Constructs the instance and initializes its default state.

#### `public Placeholder()`
- Role: Creates a new Placeholder instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
