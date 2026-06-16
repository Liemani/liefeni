# GLPipeState

This file documents the responsibilities and members of `GLPipeState`.

## Meta

- Source: [GLPipeState.java](../../../../../src/haven/render/gl/GLPipeState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glpipe state.

## Members

### Constants

#### `public static final GLPipeState<Viewport> viewport = new GLPipeState<Viewport>(States.viewport)`
- Role: Defines the shared viewport constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<Scissor> scissor = new GLPipeState<Scissor>(States.scissor)`
- Role: Defines the shared scissor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<Facecull> facecull = new GLPipeState<Facecull>(States.facecull)`
- Role: Defines the shared facecull constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<Depthtest> depthtest = new GLPipeState<Depthtest>(States.depthtest)`
- Role: Defines the shared depthtest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<State> maskdepth = new GLPipeState<State>(States.maskdepth.slot)`
- Role: Defines the shared maskdepth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<LineWidth> linewidth = new GLPipeState<LineWidth>(States.linewidth)`
- Role: Defines the shared linewidth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<DepthBias> depthbias = new GLPipeState<DepthBias>(States.depthbias)`
- Role: Defines the shared depthbias constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<?>[] all =`
- Role: Defines the shared glpipe state constant.
- Description: Shared constant used by the rest of the class.

#### `public static final GLPipeState<?>[] matching`
- Role: Defines the shared matching constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public State.Slot<? extends T> slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract void apply(GLEnvironment env, BGL gl, T from, T to)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(GLEnvironment env, BGL gl, T to)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public GLPipeState(State.Slot<? extends T> slot)`
- Role: Creates a new GLPipeState instance.
- Description: Constructs the instance and initializes its default state.
