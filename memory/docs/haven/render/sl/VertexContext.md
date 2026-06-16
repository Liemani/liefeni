# VertexContext

This file documents the responsibilities and members of `VertexContext`.

## Meta

- Source: [VertexContext.java](../../../../../src/haven/render/sl/VertexContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the vertex context shader-language AST node.

## Members

### Constants

#### `public static final Variable gl_Position = new Variable.Implicit(Type.VEC4, new Symbol.Fix("gl_Position"))`
- Role: Defines the shared gl position constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Variable gl_PointSize = new Variable.Implicit(Type.FLOAT, new Symbol.Fix("gl_PointSize"))`
- Role: Defines the shared gl point size constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Variable gl_VertexID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_VertexID"))`
- Role: Defines the shared gl vertex id constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Variable gl_InstanceID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_InstanceID"))`
- Role: Defines the shared gl instance id constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`
- Role: Holds the main state.
- Description: Backs the cached state for this file.

#### `public final ValBlock mainvals = new ValBlock()`
- Role: Holds the mainvals state.
- Description: Backs the cached state for this file.

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`
- Role: Caches code entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final ValBlock.Value posv = mainvals.new Value(Type.VEC4, new Symbol.Gen("posv"))`
- Role: Holds the posv state.
- Description: Backs the cached state for this file.

#### `public final ValBlock.Value ptsz = mainvals.new Value(Type.FLOAT, new Symbol.Gen("ptsz"))`
- Role: Holds the ptsz state.
- Description: Backs the cached state for this file.

### Methods

#### `public VertexContext(ProgramContext prog)`
- Role: Creates a new VertexContext instance.
- Description: Constructs the instance and initializes its default state.

#### `public Expression vertid()`
- Role: Performs vertid.
- Description: Supports the vertid operation used by the surrounding class.

#### `public Expression instid()`
- Role: Performs instid.
- Description: Supports the instid operation used by the surrounding class.

#### `public void mainmod(Consumer<Block> macro, int order)`
- Role: Performs mainmod.
- Description: Supports the mainmod operation used by the surrounding class.

#### `public void construct(java.io.Writer out)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.
