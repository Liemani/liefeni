---
source: [BinOp.java](../../../../../../src/haven/render/sl/BinOp.java)
created: 2026-06-13
updated: 2026-06-14
---

# BinOp

Represents the bin op shader-language AST node.

## Nested Types

### And
Boolean conjunction expression.

### BitAnd
Bitwise AND expression.

### BitOr
Bitwise OR expression.

### Div
Division expression.

### Eq
Equality comparison expression.

### Ge
Greater-than-or-equal comparison expression.

### Gt
Greater-than comparison expression.

### LShift
Left-shift expression.

### Le
Less-than-or-equal comparison expression.

### Lt
Less-than comparison expression.

### Ne
Inequality comparison expression.

### Or
Boolean disjunction expression.

### RShift
Right-shift expression.

### Sub
Subtraction expression.

## Members

### Constants

### Fields

#### `public final Expression lhs, rhs`
- Role: Stores the left and right operands.
- Description: Keeps both operands for AST traversal and code emission.

#### `public final Expression lhs, rhs`
- Role: Stores the left and right operands.
- Description: Repeats the same operand pair on the duplicate field entry.

### Methods

#### `public BinOp(Expression lhs, Expression rhs)`
- Role: Creates one binary expression.
- Description: Stores the left and right operand expressions.

#### `public void walk(Walker w)`
- Role: Visits both operands.
- Description: Walks the left operand and then the right operand.

#### `public abstract String form()`
- Role: Returns the operator spelling.
- Description: Supplies the token used when printing the expression.

#### `public void output(Output out)`
- Role: Emits the binary expression.
- Description: Writes the left operand, operator, and right operand.

#### `public static class Eq extends BinOp`
- Role: Emits `==` comparisons.
- Description: Represents equality comparison in the shader AST.

#### `public static class Eq extends BinOp`
- Role: Represents equality comparison nodes.
- Description: Stores the operands for `==`.

#### `public static class Ne extends BinOp`
- Role: Emits `!=` comparisons.
- Description: Represents inequality comparison in the shader AST.

#### `public static class Ne extends BinOp`
- Role: Represents inequality comparison nodes.
- Description: Stores the operands for `!=`.

#### `public static class Lt extends BinOp`
- Role: Emits `<` comparisons.
- Description: Represents less-than comparison in the shader AST.

#### `public static class Lt extends BinOp`
- Role: Represents less-than comparison nodes.
- Description: Stores the operands for `<`.

#### `public static class Gt extends BinOp`
- Role: Emits `>` comparisons.
- Description: Represents greater-than comparison in the shader AST.

#### `public static class Gt extends BinOp`
- Role: Represents greater-than comparison nodes.
- Description: Stores the operands for `>`.

#### `public static class Le extends BinOp`
- Role: Emits `<=` comparisons.
- Description: Represents less-than-or-equal comparison in the shader AST.

#### `public static class Le extends BinOp`
- Role: Represents less-than-or-equal comparison nodes.
- Description: Stores the operands for `<=`.

#### `public static class Ge extends BinOp`
- Role: Emits `>=` comparisons.
- Description: Represents greater-than-or-equal comparison in the shader AST.

#### `public static class Ge extends BinOp`
- Role: Represents greater-than-or-equal comparison nodes.
- Description: Stores the operands for `>=`.

#### `public static class Or extends BinOp`
- Role: Emits logical-or expressions.
- Description: Represents boolean disjunction in the shader AST.

#### `public static class Or extends BinOp`
- Role: Represents logical-or nodes.
- Description: Stores the operands for `||`.

#### `public static class And extends BinOp`
- Role: Emits logical-and expressions.
- Description: Represents boolean conjunction in the shader AST.

#### `public static class And extends BinOp`
- Role: Represents logical-and nodes.
- Description: Stores the operands for `&&`.

#### `public static class BitOr extends BinOp`
- Role: Emits bitwise-or expressions.
- Description: Represents bitwise OR in the shader AST.

#### `public static class BitOr extends BinOp`
- Role: Represents bitwise-or nodes.
- Description: Stores the operands for `|`.

#### `public static class BitAnd extends BinOp`
- Role: Emits bitwise-and expressions.
- Description: Represents bitwise AND in the shader AST.

#### `public static class BitAnd extends BinOp`
- Role: Represents bitwise-and nodes.
- Description: Stores the operands for `&`.

#### `public static class Sub extends BinOp`
- Role: Emits subtraction expressions.
- Description: Represents numeric subtraction in the shader AST.

#### `public static class Sub extends BinOp`
- Role: Represents subtraction nodes.
- Description: Stores the operands for `-`.

#### `public static class Div extends BinOp`
- Role: Emits division expressions.
- Description: Represents numeric division in the shader AST.

#### `public static class Div extends BinOp`
- Role: Represents division nodes.
- Description: Stores the operands for `/`.

#### `public static class LShift extends BinOp`
- Role: Emits left-shift expressions.
- Description: Represents bitwise left shift in the shader AST.

#### `public static class LShift extends BinOp`
- Role: Represents left-shift nodes.
- Description: Stores the operands for `<<`.

#### `public static class RShift extends BinOp`
- Role: Emits right-shift expressions.
- Description: Represents bitwise right shift in the shader AST.

#### `public static class RShift extends BinOp`
- Role: Represents right-shift nodes.
- Description: Stores the operands for `>>`.
