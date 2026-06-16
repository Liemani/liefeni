# FragmentContext

This file documents the responsibilities and members of `FragmentContext`.

## Meta

- Source: [FragmentContext.java](../../../../../src/haven/render/sl/FragmentContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the fragment context shader-language AST node.

## Members

### Constants

#### `public static final Variable gl_PointCoord = new Variable.Implicit(new Array(Type.VEC4), new Symbol.Fix("gl_PointCoord"))`
- Role: Defines the shared gl point coord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Expression ptc = gl_PointCoord.ref()`
- Role: Defines the shared ptc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Function.Def main = new Function.Def(Type.VOID, new Symbol.Fix("main"))`
- Role: Holds the main state.
- Description: Backs the cached state for this file.

#### `public final ValBlock mainvals = new ValBlock()`
- Role: Holds the mainvals state.
- Description: Backs the cached state for this file.

#### `public final ValBlock uniform = new ValBlock()`
- Role: Holds the uniform state.
- Description: Backs the cached state for this file.

#### `private final OrderList<Consumer<Block>> code = new OrderList<>()`
- Role: Caches code entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public FragmentContext(ProgramContext prog)`
- Role: Creates a new FragmentContext instance.
- Description: Constructs the instance and initializes its default state.

#### `public void mainmod(Consumer<Block> macro, int order)`
- Role: Performs mainmod.
- Description: Supports the mainmod operation used by the surrounding class.

#### `public void construct(java.io.Writer out)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.
