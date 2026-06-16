# Applier

This file documents the responsibilities and members of `Applier`.

## Meta

- Source: [Applier.java](../../../../../src/haven/render/gl/Applier.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for applier.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `private State[] cur = new State[0]`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `private ShaderMacro[] shaders = new ShaderMacro[0]`
- Role: Holds the shaders state.
- Description: Backs the cached state for this file.

#### `private int shash = 0`
- Role: Stores the shash value.
- Description: Backs the cached state for this file.

#### `private GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `private Object[] uvals = new Object[0]`
- Role: Holds the uvals state.
- Description: Backs the cached state for this file.

#### `public GLState[] glstates = new GLState[GLState.slots.length]`
- Role: Holds the glstates state.
- Description: Backs the cached state for this file.

### Methods

#### `public Applier(GLEnvironment env)`
- Role: Creates a new Applier instance.
- Description: Constructs the instance and initializes its default state.

#### `private void assume(Applier that)`
- Role: Performs assume.
- Description: Supports the assume operation used by the surrounding class.

#### `public Applier clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `private void setprog(GLProgram prog)`
- Role: Performs setprog.
- Description: Supports the setprog operation used by the surrounding class.

#### `public GLProgram prog()`
- Role: Performs prog.
- Description: Supports the prog operation used by the surrounding class.

#### `private <T> void uapply(BGL gl, GLProgram prog, int ui, Object val)`
- Role: Performs uapply.
- Description: Supports the uapply operation used by the surrounding class.

#### `private Object getuval(GLProgram prog, int ui, Pipe pipe)`
- Role: Performs getuval.
- Description: Supports the getuval operation used by the surrounding class.

#### `private Object getfval(GLProgram prog, int fi, Pipe pipe)`
- Role: Performs getfval.
- Description: Supports the getfval operation used by the surrounding class.

#### `private static <T extends State> void glpapply(GLEnvironment env, BGL gl, GLPipeState<T> st, State from, State to)`
- Role: Performs glpapply.
- Description: Supports the glpapply operation used by the surrounding class.

#### `private void assume(State[] ns)`
- Role: Performs assume.
- Description: Supports the assume operation used by the surrounding class.

#### `private void apply2(BGL gl, State[] ns, Pipe to)`
- Role: Performs apply2.
- Description: Supports the apply2 operation used by the surrounding class.

#### `public void assume(Pipe to)`
- Role: Performs assume.
- Description: Supports the assume operation used by the surrounding class.

#### `public void apply(BGL gl, Pipe to)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(BGL gl, int slot, GLState st)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(BGL gl, GLState st)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(BGL gl, Applier that)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
