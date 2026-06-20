---
source: [LBinOp.java](../../../../../src/haven/render/sl/LBinOp.java)
created: 2026-06-13
updated: 2026-06-14
---

# LBinOp

Represents the lbin op shader-language AST node.

## Nested Types

### AAdd

- Role: Represents aadd within LBinOp.
- Description: Describes the nested aadd type used by the enclosing class.

### ADiv

- Role: Represents adiv within LBinOp.
- Description: Describes the nested adiv type used by the enclosing class.

### AMul

- Role: Represents amul within LBinOp.
- Description: Describes the nested amul type used by the enclosing class.

### ASub

- Role: Represents asub within LBinOp.
- Description: Describes the nested asub type used by the enclosing class.

### Assign

- Role: Represents assign within LBinOp.
- Description: Describes the nested assign type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final LValue lhs`
- Role: Holds the lhs state.
- Description: Backs the cached state for this file.

#### `public final Expression rhs`
- Role: Holds the rhs state.
- Description: Backs the cached state for this file.

### Methods

#### `public LBinOp(LValue lhs, Expression rhs)`
- Role: Creates a new LBinOp instance.
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

#### `public static class Assign extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class Assign extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class AAdd extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class AAdd extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class ASub extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class ASub extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class AMul extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class AMul extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class ADiv extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.

#### `public static class ADiv extends LBinOp`
- Role: Handles the lbin op workflow.
- Description: Supports the lbin op operation used by the surrounding class.
