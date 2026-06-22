---
source: [Applier.java](../../../../../../src/haven/render/gl/Applier.java)
created: 2026-06-13
updated: 2026-06-14
---

# Applier

Provides GL backend support for applier.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `private State[] cur = new State[0]`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private ShaderMacro[] shaders = new ShaderMacro[0]`
- Role: Caches the shaders value.
- Description: Caches the `shaders` value for reuse.

#### `private int shash = 0`
- Role: Caches the shash value.
- Description: Caches the `shash` value for reuse.

#### `private GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private Object[] uvals = new Object[0]`
- Role: Caches the uvals value.
- Description: Caches the `uvals` value for reuse.

#### `public GLState[] glstates = new GLState[GLState.slots.length]`
- Role: Caches the glstates value.
- Description: Caches the `glstates` value for reuse.

### Methods

#### `public Applier(GLEnvironment env)`
- Role: Creates a new Applier instance.
- Description: Constructs the Applier instance from the supplied inputs.

#### `private void assume(Applier that)`
- Role: Handles the assume path.
- Description: Implements the assume operation.

#### `public Applier clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `private void setprog(GLProgram prog)`
- Role: Handles the setprog path.
- Description: Updates the prog.

#### `public GLProgram prog()`
- Role: Handles the prog path.
- Description: Implements the prog operation.

#### `private <T> void uapply(BGL gl, GLProgram prog, int ui, Object val)`
- Role: Handles the uapply path.
- Description: Implements the uapply operation.

#### `private Object getuval(GLProgram prog, int ui, Pipe pipe)`
- Role: Handles the getuval path.
- Description: Returns the uval.

#### `private Object getfval(GLProgram prog, int fi, Pipe pipe)`
- Role: Handles the getfval path.
- Description: Returns the fval.

#### `private static <T extends State> void glpapply(GLEnvironment env, BGL gl, GLPipeState<T> st, State from, State to)`
- Role: Handles the glpapply path.
- Description: Implements the glpapply operation.

#### `private void assume(State[] ns)`
- Role: Handles the assume path.
- Description: Implements the assume operation.

#### `private void apply2(BGL gl, State[] ns, Pipe to)`
- Role: Handles the apply2 path.
- Description: Implements the apply2 operation.

#### `public void assume(Pipe to)`
- Role: Handles the assume path.
- Description: Implements the assume operation.

#### `public void apply(BGL gl, Pipe to)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(BGL gl, int slot, GLState st)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(BGL gl, GLState st)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(BGL gl, Applier that)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.