---
source: [Test.java](../../../../../../src/haven/render/lwjgl/Test.java)
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
- Role: Implements the gay operation.
- Description: Implements the f color operation.
- Value: `new FColor(1.0f, 0.0f, 0.5f)`

### Fields

#### `Frame wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `TestPanel p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `volatile boolean done = false`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `LWJGLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `Pipe base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

### Methods

#### `TestPanel()`
- Role: Handles the test panel workflow.
- Description: Implements the test panel operation.

#### `static GLData mkcaps()`
- Role: Handles the mkcaps path.
- Description: Implements the mkcaps operation.

#### `public void initGL()`
- Role: Initializes the gl.
- Description: Updates the current object state.

#### `public void paintGL()`
- Role: Handles the paint gl path.
- Description: Implements the paint gl operation.

#### `public LWJGLEnvironment mkenv()`
- Role: Handles the mkenv path.
- Description: Implements the mkenv operation.

#### `Test()`
- Role: Creates a new Test instance.
- Description: Constructs the Test instance from the supplied inputs.

#### `void draw(Render g)`
- Role: Draws the current content.
- Description: Draws the Test content.

#### `void draw()`
- Role: Draws the current content.
- Description: Draws the Test content.

#### `void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `void reshape(Area wnd)`
- Role: Handles the reshape path.
- Description: Implements the reshape operation.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.