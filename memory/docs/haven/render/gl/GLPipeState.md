# GLPipeState

This file documents the responsibilities and members of `GLPipeState`.

## Meta

- Source: [GLPipeState.java](../../../../../src/haven/render/gl/GLPipeState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents GL pipe state.

## Members

### Constants

#### `public static final GLPipeState<Viewport> viewport = new GLPipeState<Viewport>(States.viewport)`

- Description: TODO

#### `public static final GLPipeState<Scissor> scissor = new GLPipeState<Scissor>(States.scissor)`

- Description: TODO

#### `public static final GLPipeState<Facecull> facecull = new GLPipeState<Facecull>(States.facecull)`

- Description: TODO

#### `public static final GLPipeState<Depthtest> depthtest = new GLPipeState<Depthtest>(States.depthtest)`

- Description: TODO

#### `public static final GLPipeState<State> maskdepth = new GLPipeState<State>(States.maskdepth.slot)`

- Description: TODO

#### `public static final GLPipeState<LineWidth> linewidth = new GLPipeState<LineWidth>(States.linewidth)`

- Description: TODO

#### `public static final GLPipeState<DepthBias> depthbias = new GLPipeState<DepthBias>(States.depthbias)`

- Description: TODO

#### `public static final GLPipeState<?>[] all =`

- Description: TODO

#### `public static final GLPipeState<?>[] matching`

- Description: TODO

### Fields

#### `public State.Slot<? extends T> slot`

- Description: TODO

### Methods

#### `public abstract void apply(GLEnvironment env, BGL gl, T from, T to)`

- Description: TODO

#### `public void apply(GLEnvironment env, BGL gl, T to)`

- Description: TODO

#### `public GLPipeState(State.Slot<? extends T> slot)`

- Description: TODO
