# Mat3Cons

This file documents the responsibilities and members of `Mat3Cons`.

## Meta

- Source: [Mat3Cons.java](../../../../../src/haven/render/sl/Mat3Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the mat3 cons shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public Mat3Cons(Expression... els)`
- Role: Creates a new Mat3Cons instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
