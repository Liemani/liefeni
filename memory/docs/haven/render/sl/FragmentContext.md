# FragmentContext

This file documents the responsibilities and members of `FragmentContext`.

## Meta

- Source: [FragmentContext.java](../../../../../src/haven/render/sl/FragmentContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents fragment shader context.

## Members

### Constants

#### `public static final Variable gl_PointCoord = new Variable.Implicit(new Array(Type.VEC4), new Symbol.Fix("gl_PointCoord"))`

- Description: TODO

#### `public static final Expression ptc = gl_PointCoord.ref()`

- Description: TODO

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`

- Description: TODO

#### `public final ValBlock mainvals = new ValBlock()`

- Description: TODO

#### `public final ValBlock uniform = new ValBlock()`

- Description: TODO

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`

- Description: TODO

### Methods

#### `public FragmentContext(ProgramContext prog)`

- Description: TODO

#### `public void mainmod(Consumer<Block> macro, int order)`

- Description: TODO

#### `public void construct(java.io.Writer out)`

- Description: TODO
