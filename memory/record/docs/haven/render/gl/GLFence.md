---
source: [GLFence.java](../../../../../../src/haven/render/gl/GLFence.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLFence

Provides GL backend support for glfence.

## Members

### Constants

### Fields

#### `public final Consumer<GL> callback`
- Role: Caches the callback value.
- Description: Caches the `callback` value for reuse.

#### `protected long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public GLFence(GLEnvironment env, Consumer<GL> callback)`
- Role: Creates a new GLFence instance.
- Description: Constructs the GLFence instance from the supplied inputs.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public boolean check(GL gl)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `public void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.