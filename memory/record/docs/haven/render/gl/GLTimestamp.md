---
source: [GLTimestamp.java](../../../../../../src/haven/render/gl/GLTimestamp.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLTimestamp

Provides GL backend support for gltimestamp.

## Members

### Constants

### Fields

#### `public final Consumer<Long> callback`
- Role: Caches the callback value.
- Description: Caches the `callback` value for reuse.

#### `private int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public GLTimestamp(GLEnvironment env, Consumer<Long> callback)`
- Role: Creates a new GLTimestamp instance.
- Description: Constructs the GLTimestamp instance from the supplied inputs.

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