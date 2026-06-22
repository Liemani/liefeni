---
source: [AutoVarying.java](../../../../../../src/haven/render/sl/AutoVarying.java)
created: 2026-06-13
updated: 2026-06-14
---

# AutoVarying

Represents the auto varying shader-language AST node.

## Nested Types

### Value
Concrete varying value that binds the auto-generated varying name to a vertex-stage expression.

#### Members

##### Methods

#### `public Value(ValBlock blk)`
- Role: Builds a varying value binding.
- Description: Registers the value inside the owning value block.

#### `protected void cons2(Block blk)`
- Role: Emits the varying assignment.
- Description: Assigns the generated expression into the target varying.

## Members

## Members

### Constants

### Fields

### Methods

#### `public AutoVarying(Type type, Symbol name)`
- Role: Creates one auto-generated varying binding.
- Description: Stores the varying type and the explicit symbol name.

#### `public AutoVarying(Type type, String prefix)`
- Role: Creates one prefixed varying binding.
- Description: Generates a symbol name from the prefix and stores the varying type.

#### `public AutoVarying(Type type)`
- Role: Creates one auto-generated varying binding.
- Description: Uses the default prefix to generate the varying symbol.

#### `public Value(ValBlock blk)`
- Role: Creates the deferred varying value.
- Description: Registers the varying expression inside the owning value block.

#### `protected void cons2(Block blk)`
- Role: Emits the varying assignment.
- Description: Writes the generated vertex expression into the varying target.

#### `protected Expression root(VertexContext vctx)`
- Role: Builds the source expression.
- Description: Resolves the vertex-stage expression used as the varying source.

#### `protected Value make(ValBlock vals, final VertexContext vctx)`
- Role: Creates the deferred varying value.
- Description: Installs the varying expression into the value block for the given vertex context.

#### `public ValBlock.Value value(final VertexContext ctx)`
- Role: Returns the varying value for a vertex context.
- Description: Exposes the deferred value bound to the current vertex shader context.

#### `public void use(Context ctx)`
- Role: Registers the varying in the shader context.
- Description: Ensures the generated varying name is reserved in the current context.