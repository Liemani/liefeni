# LPostOp

This file documents the responsibilities and members of `LPostOp`.

## Meta

- Source: [LPostOp.java](../../../../../src/haven/render/sl/LPostOp.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the lpost op shader-language AST node.

## Nested Types

### Dec

- Role: Represents dec within LPostOp.
- Description: Describes the nested dec type used by the enclosing class.

### Inc

- Role: Represents inc within LPostOp.
- Description: Describes the nested inc type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final LValue op`
- Role: Holds the op state.
- Description: Backs the cached state for this file.

### Methods

#### `public LPostOp(LValue op)`
- Role: Creates a new LPostOp instance.
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

#### `public static class Inc extends LPostOp`
- Role: Handles the lpost op workflow.
- Description: Supports the lpost op operation used by the surrounding class.

#### `public static class Inc extends LPostOp`
- Role: Handles the lpost op workflow.
- Description: Supports the lpost op operation used by the surrounding class.

#### `public static class Dec extends LPostOp`
- Role: Handles the lpost op workflow.
- Description: Supports the lpost op operation used by the surrounding class.

#### `public static class Dec extends LPostOp`
- Role: Handles the lpost op workflow.
- Description: Supports the lpost op operation used by the surrounding class.
