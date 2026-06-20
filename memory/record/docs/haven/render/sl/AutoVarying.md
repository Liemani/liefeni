---
source: [AutoVarying.java](../../../../../src/haven/render/sl/AutoVarying.java)
created: 2026-06-13
updated: 2026-06-14
---

# AutoVarying

Represents the auto varying shader-language AST node.

## Nested Types

### Value

- Role: Represents value within AutoVarying.
- Description: Describes the nested value type used by the enclosing class.

## Members

### Constants

### Fields

### Methods

#### `public AutoVarying(Type type, Symbol name)`
- Role: Creates a new AutoVarying instance.
- Description: Constructs the instance and initializes its default state.

#### `public AutoVarying(Type type, String prefix)`
- Role: Creates a new AutoVarying instance.
- Description: Constructs the instance and initializes its default state.

#### `public AutoVarying(Type type)`
- Role: Creates a new AutoVarying instance.
- Description: Constructs the instance and initializes its default state.

#### `public Value(ValBlock blk)`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `protected void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `protected Expression root(VertexContext vctx)`
- Role: Performs root.
- Description: Supports the root operation used by the surrounding class.

#### `protected Value make(ValBlock vals, final VertexContext vctx)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public ValBlock.Value value(final VertexContext ctx)`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
