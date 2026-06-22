---
source: [GLPipeState.java](../../../../../../src/haven/render/gl/GLPipeState.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLPipeState

Provides GL backend support for glpipe state.

## Members

### Constants

#### `public static final GLPipeState<Viewport> viewport = new GLPipeState<Viewport>(States.viewport)`
- Role: Implements the viewport operation.
- Description: Implements the public static final gl pipe state<viewport> viewport = new gl pipe state<viewport>(states.viewport) operation.
- Value: `new GLPipeState<Viewport>(States.viewport)`

#### `public static final GLPipeState<Scissor> scissor = new GLPipeState<Scissor>(States.scissor)`
- Role: Implements the scissor operation.
- Description: Implements the public static final gl pipe state<scissor> scissor = new gl pipe state<scissor>(states.scissor) operation.
- Value: `new GLPipeState<Scissor>(States.scissor)`

#### `public static final GLPipeState<Facecull> facecull = new GLPipeState<Facecull>(States.facecull)`
- Role: Implements the facecull operation.
- Description: Implements the public static final gl pipe state<facecull> facecull = new gl pipe state<facecull>(states.facecull) operation.
- Value: `new GLPipeState<Facecull>(States.facecull)`

#### `public static final GLPipeState<Depthtest> depthtest = new GLPipeState<Depthtest>(States.depthtest)`
- Role: Implements the depthtest operation.
- Description: Implements the public static final gl pipe state<depthtest> depthtest = new gl pipe state<depthtest>(states.depthtest) operation.
- Value: `new GLPipeState<Depthtest>(States.depthtest)`

#### `public static final GLPipeState<State> maskdepth = new GLPipeState<State>(States.maskdepth.slot)`
- Role: Implements the maskdepth operation.
- Description: Implements the public static final gl pipe state<state> maskdepth = new gl pipe state<state>(states.maskdepth.slot) operation.
- Value: `new GLPipeState<State>(States.maskdepth.slot)`

#### `public static final GLPipeState<LineWidth> linewidth = new GLPipeState<LineWidth>(States.linewidth)`
- Role: Implements the linewidth operation.
- Description: Implements the public static final gl pipe state<line width> linewidth = new gl pipe state<line width>(states.linewidth) operation.
- Value: `new GLPipeState<LineWidth>(States.linewidth)`

#### `public static final GLPipeState<DepthBias> depthbias = new GLPipeState<DepthBias>(States.depthbias)`
- Role: Implements the depthbias operation.
- Description: Implements the public static final gl pipe state<depth bias> depthbias = new gl pipe state<depth bias>(states.depthbias) operation.
- Value: `new GLPipeState<DepthBias>(States.depthbias)`

#### `public static final GLPipeState<?>[] all =`
- Role: Caches the all value.
- Description: Caches the `all` value for reuse.
- Value: ``

#### `public static final GLPipeState<?>[] matching`
#### `public static final GLPipeState<?>[] matching`
- Role: Caches the matching value.
- Description: Caches the `matching` value for reuse.

### Fields

#### `public State.Slot<? extends T> slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

### Methods

#### `public abstract void apply(GLEnvironment env, BGL gl, T from, T to)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(GLEnvironment env, BGL gl, T to)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public GLPipeState(State.Slot<? extends T> slot)`
- Role: Creates a new GLPipeState instance.
- Description: Constructs the GLPipeState instance from the supplied inputs.