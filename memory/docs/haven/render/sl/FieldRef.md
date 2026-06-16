# FieldRef

This file documents the responsibilities and members of `FieldRef`.

## Meta

- Source: [FieldRef.java](../../../../../src/haven/render/sl/FieldRef.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the field ref shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `public final String el`
- Role: Stores the el value.
- Description: Backs the cached state for this file.

### Methods

#### `public FieldRef(Expression val, String el)`
- Role: Creates a new FieldRef instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
