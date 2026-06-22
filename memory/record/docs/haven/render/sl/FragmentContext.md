---
source: [FragmentContext.java](../../../../../../src/haven/render/sl/FragmentContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# FragmentContext

Represents the fragment context shader-language AST node.

## Members

### Constants

#### `public static final Variable gl_PointCoord = new Variable.Implicit(new Array(Type.VEC4), new Symbol.Fix("gl_PointCoord"))`
- Role: Defines the shared `gl_PointCoord` variable.
- Description: Built-in fragment coordinate input.
- Value: `new Variable.Implicit(new Array(Type.VEC4), new Symbol.Fix("gl_PointCoord"))`

#### `public static final Expression ptc = gl_PointCoord.ref()`
- Role: Defines the shared point-coordinate expression.
- Description: Reference to the built-in fragment point coordinate.
- Value: `gl_PointCoord.ref()`

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`
- Role: Holds the fragment main function.
- Description: Accumulates the emitted fragment shader body.

#### `public final ValBlock mainvals = new ValBlock()`
- Role: Holds fragment-local temporaries.
- Description: Collects deferred values for the fragment main block.

#### `public final ValBlock uniform = new ValBlock()`
- Role: Holds fragment uniforms.
- Description: Collects deferred values used in uniform declarations.

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`
- Role: Orders fragment macros.
- Description: Stores fragment-body macros by emission order.

### Methods

#### `public FragmentContext(ProgramContext prog)`
- Role: Creates one fragment shader context.
- Description: Collects fragment-stage declarations and main-block content.

#### `public void mainmod(Consumer<Block> macro, int order)`
- Role: Registers a fragment-main macro.
- Description: Adds one ordered macro to the fragment shader main block.

#### `public void construct(java.io.Writer out)`
- Role: Emits the fragment shader source.
- Description: Writes the accumulated fragment shader program to the output.