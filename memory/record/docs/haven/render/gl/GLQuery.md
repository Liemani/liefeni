---
source: [GLQuery.java](../../../../../../src/haven/render/gl/GLQuery.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLQuery

Provides GL backend support for glquery.

## Members

### Constants

### Fields

### Methods

#### `public GLQuery(GLEnvironment env)`
- Role: Creates a new GLQuery instance.
- Description: Constructs the GLQuery instance from the supplied inputs.

#### `public abstract boolean check(GL gl)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public abstract void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `public void abortcreate()`
- Role: Handles the abortcreate path.
- Description: Implements the abortcreate operation.