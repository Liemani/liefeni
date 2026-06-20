---
source: [LPreOp.java](../../../../../src/haven/render/sl/LPreOp.java)
created: 2026-06-13
updated: 2026-06-14
---

# LPreOp

Represents the lpre op shader-language AST node.

## Nested Types

### Dec

- Role: Represents dec within LPreOp.
- Description: Describes the nested dec type used by the enclosing class.

### Inc

- Role: Represents inc within LPreOp.
- Description: Describes the nested inc type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final LValue op`
- Role: Holds the op state.
- Description: Backs the cached state for this file.

### Methods

#### `public LPreOp(LValue op)`
- Role: Creates a new LPreOp instance.
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

#### `public static class Inc extends LPreOp`
- Role: Handles the lpre op workflow.
- Description: Supports the lpre op operation used by the surrounding class.

#### `public static class Inc extends LPreOp`
- Role: Handles the lpre op workflow.
- Description: Supports the lpre op operation used by the surrounding class.

#### `public static class Dec extends LPreOp`
- Role: Handles the lpre op workflow.
- Description: Supports the lpre op operation used by the surrounding class.

#### `public static class Dec extends LPreOp`
- Role: Handles the lpre op workflow.
- Description: Supports the lpre op operation used by the surrounding class.
