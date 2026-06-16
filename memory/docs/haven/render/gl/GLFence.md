# GLFence

This file documents the responsibilities and members of `GLFence`.

## Meta

- Source: [GLFence.java](../../../../../src/haven/render/gl/GLFence.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glfence.

## Members

### Constants

### Fields

#### `public final Consumer<GL> callback`
- Role: Holds the callback state.
- Description: Backs the cached state for this file.

#### `protected long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLFence(GLEnvironment env, Consumer<GL> callback)`
- Role: Creates a new GLFence instance.
- Description: Constructs the instance and initializes its default state.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public boolean check(GL gl)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `public void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.
