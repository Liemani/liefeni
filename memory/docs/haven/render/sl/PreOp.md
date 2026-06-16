# PreOp

This file documents the responsibilities and members of `PreOp`.

## Meta

- Source: [PreOp.java](../../../../../src/haven/render/sl/PreOp.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the pre op shader-language AST node.

## Nested Types

### Neg

- Role: Represents neg within PreOp.
- Description: Describes the nested neg type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Expression op`
- Role: Holds the op state.
- Description: Backs the cached state for this file.

### Methods

#### `public PreOp(Expression op)`
- Role: Creates a new PreOp instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public abstract String form()`
- Role: Performs form.
- Description: Supports the form operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public static class Neg extends PreOp`
- Role: Handles the pre op workflow.
- Description: Supports the pre op operation used by the surrounding class.

#### `public static class Neg extends PreOp`
- Role: Handles the pre op workflow.
- Description: Supports the pre op operation used by the surrounding class.
