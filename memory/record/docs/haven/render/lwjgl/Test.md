---
source: [Test.java](../../../../../src/haven/render/lwjgl/Test.java)
created: 2026-06-13
updated: 2026-06-14
---

# Test

Adapts the render backend to LWJGL for test.

## Nested Types

### TestPanel

- Role: Represents test panel within Test.
- Description: Describes the nested test panel type used by the enclosing class.

## Members

### Constants

#### `static final FColor gay = new FColor(1.0f, 0.0f, 0.5f)`
- Role: Defines the shared gay constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `Frame wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `TestPanel p`
- Role: Holds the p state.
- Description: Backs the cached state for this file.

#### `volatile boolean done = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `LWJGLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `Pipe base`
- Role: Holds the base state.
- Description: Backs the cached state for this file.

### Methods

#### `TestPanel()`
- Role: Handles the test panel workflow.
- Description: Supports the test panel operation used by the surrounding class.

#### `static GLData mkcaps()`
- Role: Performs mkcaps.
- Description: Supports the mkcaps operation used by the surrounding class.

#### `public void initGL()`
- Role: Initializes the gl.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void paintGL()`
- Role: Performs paint gl.
- Description: Supports the paint gl operation used by the surrounding class.

#### `public LWJGLEnvironment mkenv()`
- Role: Performs mkenv.
- Description: Supports the mkenv operation used by the surrounding class.

#### `Test()`
- Role: Creates a new Test instance.
- Description: Constructs the instance and initializes its default state.

#### `void draw(Render g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `void draw()`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `void reshape(Area wnd)`
- Role: Performs reshape.
- Description: Supports the reshape operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
