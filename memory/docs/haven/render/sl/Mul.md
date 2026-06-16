# Mul

This file documents the responsibilities and members of `Mul`.

## Meta

- Source: [Mul.java](../../../../../src/haven/render/sl/Mul.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the mul shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] terms`
- Role: Holds the terms state.
- Description: Backs the cached state for this file.

### Methods

#### `public Mul(Expression... terms)`
- Role: Creates a new Mul instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
