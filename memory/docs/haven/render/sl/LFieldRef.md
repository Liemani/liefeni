# LFieldRef

This file documents the responsibilities and members of `LFieldRef`.

## Meta

- Source: [LFieldRef.java](../../../../../src/haven/render/sl/LFieldRef.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the lfield ref shader-language AST node.

## Members

### Constants

### Fields

#### `public final LValue val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `public final String el`
- Role: Stores the el value.
- Description: Backs the cached state for this file.

### Methods

#### `public LFieldRef(LValue val, String el)`
- Role: Creates a new LFieldRef instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
