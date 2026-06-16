# GLTimestamp

This file documents the responsibilities and members of `GLTimestamp`.

## Meta

- Source: [GLTimestamp.java](../../../../../src/haven/render/gl/GLTimestamp.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for gltimestamp.

## Members

### Constants

### Fields

#### `public final Consumer<Long> callback`
- Role: Stores the callback value.
- Description: Backs the cached state for this file.

#### `private int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLTimestamp(GLEnvironment env, Consumer<Long> callback)`
- Role: Creates a new GLTimestamp instance.
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
