---
source: [BinOp.java](../../../../../src/haven/render/sl/BinOp.java)
created: 2026-06-13
updated: 2026-06-14
---

# BinOp

Represents the bin op shader-language AST node.

## Nested Types

### And

- Role: Represents and within BinOp.
- Description: Describes the nested and type used by the enclosing class.

### BitAnd

- Role: Represents bit and within BinOp.
- Description: Describes the nested bit and type used by the enclosing class.

### BitOr

- Role: Represents bit or within BinOp.
- Description: Describes the nested bit or type used by the enclosing class.

### Div

- Role: Represents div within BinOp.
- Description: Describes the nested div type used by the enclosing class.

### Eq

- Role: Represents eq within BinOp.
- Description: Describes the nested eq type used by the enclosing class.

### Ge

- Role: Represents ge within BinOp.
- Description: Describes the nested ge type used by the enclosing class.

### Gt

- Role: Represents gt within BinOp.
- Description: Describes the nested gt type used by the enclosing class.

### LShift

- Role: Represents lshift within BinOp.
- Description: Describes the nested lshift type used by the enclosing class.

### Le

- Role: Represents le within BinOp.
- Description: Describes the nested le type used by the enclosing class.

### Lt

- Role: Represents lt within BinOp.
- Description: Describes the nested lt type used by the enclosing class.

### Ne

- Role: Represents ne within BinOp.
- Description: Describes the nested ne type used by the enclosing class.

### Or

- Role: Represents or within BinOp.
- Description: Describes the nested or type used by the enclosing class.

### RShift

- Role: Represents rshift within BinOp.
- Description: Describes the nested rshift type used by the enclosing class.

### Sub

- Role: Represents sub within BinOp.
- Description: Describes the nested sub type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Expression lhs, rhs`
- Role: Holds the rhs state.
- Description: Backs the cached state for this file.

#### `public final Expression lhs, rhs`
- Role: Holds the rhs state.
- Description: Backs the cached state for this file.

### Methods

#### `public BinOp(Expression lhs, Expression rhs)`
- Role: Creates a new BinOp instance.
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

#### `public static class Eq extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Eq extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Ne extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Ne extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Lt extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Lt extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Gt extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Gt extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Le extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Le extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Ge extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Ge extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Or extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Or extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class And extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class And extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class BitOr extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class BitOr extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class BitAnd extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class BitAnd extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Sub extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Sub extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Div extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class Div extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class LShift extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class LShift extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class RShift extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.

#### `public static class RShift extends BinOp`
- Role: Handles the bin op workflow.
- Description: Supports the bin op operation used by the surrounding class.
