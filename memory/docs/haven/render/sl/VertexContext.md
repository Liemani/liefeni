# VertexContext

This file documents the responsibilities and members of `VertexContext`.

## Meta

- Source: [VertexContext.java](../../../../../src/haven/render/sl/VertexContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents vertex shader context.

## Members

### Constants

#### `public static final Variable gl_Position = new Variable.Implicit(Type.VEC4, new Symbol.Fix("gl_Position"))`

- Description: TODO

#### `public static final Variable gl_PointSize = new Variable.Implicit(Type.FLOAT, new Symbol.Fix("gl_PointSize"))`

- Description: TODO

#### `public static final Variable gl_VertexID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_VertexID"))`

- Description: TODO

#### `public static final Variable gl_InstanceID = new Variable.Implicit(Type.INT, new Symbol.Fix("gl_InstanceID"))`

- Description: TODO

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`

- Description: TODO

#### `public final ValBlock mainvals = new ValBlock()`

- Description: TODO

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`

- Description: TODO

#### `public final ValBlock.Value posv = mainvals.new Value(Type.VEC4, new Symbol.Gen("posv"))`

- Description: TODO

#### `public final ValBlock.Value ptsz = mainvals.new Value(Type.FLOAT, new Symbol.Gen("ptsz"))`

- Description: TODO

### Methods

#### `public VertexContext(ProgramContext prog)`

- Description: TODO

#### `public Expression vertid()`

- Description: TODO

#### `public Expression instid()`

- Description: TODO

#### `public void mainmod(Consumer<Block> macro, int order)`

- Description: TODO

#### `public void construct(java.io.Writer out)`

- Description: TODO
