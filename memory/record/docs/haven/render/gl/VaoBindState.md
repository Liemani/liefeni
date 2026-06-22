---
source: [VaoBindState.java](../../../../../../src/haven/render/gl/VaoBindState.java)
created: 2026-06-13
updated: 2026-06-14
---

# VaoBindState

Provides GL backend support for vao bind state.

## Members

### Constants

#### `public static final boolean DO_GL_EBO_FIXUP = true`
- Role: Caches the do gl ebo fixup value.
- Description: Caches the `DO_GL_EBO_FIXUP` value for reuse.
- Value: `true`

### Fields

#### `public final GLVertexArray vao`
- Role: Caches the vao value.
- Description: Caches the `vao` value for reuse.

#### `public final GLBuffer ebo`
- Role: Caches the ebo value.
- Description: Caches the `ebo` value for reuse.

### Methods

#### `public VaoBindState(GLVertexArray vao, GLBuffer ebo)`
- Role: Creates a new VaoBindState instance.
- Description: Constructs the VaoBindState instance from the supplied inputs.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void unapply(BGL gl)`
- Role: Handles the unapply path.
- Description: Implements the unapply operation.

#### `public void applyto(BGL gl, GLState sthat)`
- Role: Handles the applyto path.
- Description: Implements the applyto operation.

#### `public static void apply(BGL gl, Applier st, GLVertexArray vao, GLBuffer ebo)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.