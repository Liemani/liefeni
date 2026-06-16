# GLQuery

This file documents the responsibilities and members of `GLQuery`.

## Meta

- Source: [GLQuery.java](../../../../../src/haven/render/gl/GLQuery.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glquery.

## Members

### Constants

### Fields

### Methods

#### `public GLQuery(GLEnvironment env)`
- Role: Creates a new GLQuery instance.
- Description: Constructs the instance and initializes its default state.

#### `public abstract boolean check(GL gl)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public abstract void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `public void abortcreate()`
- Role: Performs abortcreate.
- Description: Supports the abortcreate operation used by the surrounding class.
