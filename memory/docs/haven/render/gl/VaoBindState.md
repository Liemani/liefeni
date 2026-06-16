# VaoBindState

This file documents the responsibilities and members of `VaoBindState`.

## Meta

- Source: [VaoBindState.java](../../../../../src/haven/render/gl/VaoBindState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for vao bind state.

## Members

### Constants

#### `public static final boolean DO_GL_EBO_FIXUP = true`
- Role: Defines the shared do gl ebo fixup constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final GLVertexArray vao`
- Role: Caches vao entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final GLBuffer ebo`
- Role: Stores the ebo value.
- Description: Backs the cached state for this file.

### Methods

#### `public VaoBindState(GLVertexArray vao, GLBuffer ebo)`
- Role: Creates a new VaoBindState instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void unapply(BGL gl)`
- Role: Performs unapply.
- Description: Supports the unapply operation used by the surrounding class.

#### `public void applyto(BGL gl, GLState sthat)`
- Role: Performs applyto.
- Description: Supports the applyto operation used by the surrounding class.

#### `public static void apply(BGL gl, Applier st, GLVertexArray vao, GLBuffer ebo)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
