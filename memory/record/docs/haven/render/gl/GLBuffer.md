---
source: [GLBuffer.java](../../../../../../src/haven/render/gl/GLBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLBuffer

Provides GL backend support for glbuffer.

## Members

### Constants

### Fields

#### `private int id, state = 0`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `private int id, state = 0`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

### Methods

#### `public GLBuffer(GLEnvironment env)`
- Role: Creates a new GLBuffer instance.
- Description: Constructs the GLBuffer instance from the supplied inputs.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public int glid()`
- Role: Handles the glid path.
- Description: Implements the glid operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLBuffer for debugging and logging.