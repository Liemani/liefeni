# Applier

This file documents the responsibilities and members of `Applier`.

## Meta

- Source: [Applier.java](../../../../../src/haven/render/gl/Applier.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Applies GL render state.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `private State[] cur = new State[0]`

- Description: TODO

#### `private ShaderMacro[] shaders = new ShaderMacro[0]`

- Description: TODO

#### `private int shash = 0`

- Description: TODO

#### `private GLProgram prog`

- Description: TODO

#### `private Object[] uvals = new Object[0]`

- Description: TODO

#### `public GLState[] glstates = new GLState[GLState.slots.length]`

- Description: TODO

### Methods

#### `public Applier(GLEnvironment env)`

- Description: TODO

#### `private void assume(Applier that)`

- Description: TODO

#### `public Applier clone()`

- Description: TODO

#### `private void setprog(GLProgram prog)`

- Description: TODO

#### `public GLProgram prog()`

- Description: TODO

#### `private <T> void uapply(BGL gl, GLProgram prog, int ui, Object val)`

- Description: TODO

#### `private Object getuval(GLProgram prog, int ui, Pipe pipe)`

- Description: TODO

#### `private Object getfval(GLProgram prog, int fi, Pipe pipe)`

- Description: TODO

#### `private static <T extends State> void glpapply(GLEnvironment env, BGL gl, GLPipeState<T> st, State from, State to)`

- Description: TODO

#### `private void assume(State[] ns)`

- Description: TODO

#### `private void apply2(BGL gl, State[] ns, Pipe to)`

- Description: TODO

#### `public void assume(Pipe to)`

- Description: TODO

#### `public void apply(BGL gl, Pipe to)`

- Description: TODO

#### `public void apply(BGL gl, int slot, GLState st)`

- Description: TODO

#### `public void apply(BGL gl, GLState st)`

- Description: TODO

#### `public void apply(BGL gl, Applier that)`

- Description: TODO
