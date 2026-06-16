# GLBuffer

This file documents the responsibilities and members of `GLBuffer`.

## Meta

- Source: [GLBuffer.java](../../../../../src/haven/render/gl/GLBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glbuffer.

## Members

### Constants

### Fields

#### `private int id, state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `private int id, state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLBuffer(GLEnvironment env)`
- Role: Creates a new GLBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
