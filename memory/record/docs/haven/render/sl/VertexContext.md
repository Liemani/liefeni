---
source: [VertexContext.java](../../../../../../src/haven/render/sl/VertexContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexContext

Represents the vertex context shader-language AST node.

## Members

### Constants

#### `public static final Variable gl_Position = new Variable.Implicit(Type.VEC4, new Symbol.Fix("gl_Position"))`
- Role: Defines the shared `gl_Position` variable.
- Description: Built-in vertex position output.
- Value: `new Variable.Implicit(Type.VEC4, new Symbol.Fix("gl_Position"))`

#### `public static final Variable gl_PointSize = new Variable.Implicit(Type.FLOAT, new Symbol.Fix("gl_PointSize"))`
- Role: Defines the shared `gl_PointSize` variable.
- Description: Built-in vertex point-size output.
- Value: `new Variable.Implicit(Type.FLOAT, new Symbol.Fix("gl_PointSize"))`

#### `public static final Variable gl_VertexID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_VertexID"))`
- Role: Defines the shared `gl_VertexID` variable.
- Description: Built-in vertex id input.
- Value: `new Variable.Implicit(Type.INT, new Symbol.Fix("gl_VertexID"))`

#### `public static final Variable gl_InstanceID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_InstanceID"))`
- Role: Defines the shared `gl_InstanceID` variable.
- Description: Built-in instance id input.
- Value: `new Variable.Implicit(Type.INT, new Symbol.Fix("gl_InstanceID"))`

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`
- Role: Holds the vertex main function.
- Description: Accumulates the emitted vertex shader body.

#### `public final ValBlock mainvals = new ValBlock()`
- Role: Holds vertex-local temporaries.
- Description: Collects deferred values for the vertex main block.

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`
- Role: Orders vertex macros.
- Description: Stores vertex-body macros by emission order.

#### `public final ValBlock.Value posv = mainvals.new Value(Type.VEC4, new Symbol.Gen("posv"))`
- Role: Holds the projected vertex position.
- Description: Stores the deferred position value used by the vertex main block.

#### `public final ValBlock.Value ptsz = mainvals.new Value(Type.FLOAT, new Symbol.Gen("ptsz"))`
- Role: Holds the projected point size.
- Description: Stores the deferred point-size value used by the vertex main block.

### Methods

#### `public VertexContext(ProgramContext prog)`
- Role: Creates a new VertexContext instance.
- Description: Constructs the VertexContext instance from the supplied inputs.

#### `public Expression vertid()`
- Role: Returns the vertex id expression.
- Description: Exposes the current vertex id value inside shader code.

#### `public Expression instid()`
- Role: Returns the instance id expression.
- Description: Exposes the current instance id value inside shader code.

#### `public void mainmod(Consumer<Block> macro, int order)`
- Role: Registers a vertex-main macro.
- Description: Adds one ordered macro to the vertex shader main block.

#### `public void construct(java.io.Writer out)`
- Role: Emits the vertex shader source.
- Description: Writes the accumulated vertex shader program to the output.