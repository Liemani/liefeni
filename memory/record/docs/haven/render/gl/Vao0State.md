---
source: [Vao0State.java](../../../../../src/haven/render/gl/Vao0State.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vao0State

Provides GL backend support for vao0 state.

## Members

### Constants

#### `private static final BGL.ID[] nilen =`
- Role: Defines the shared vao0 state constant.
- Description: Shared constant used by the rest of the class.

#### `private static final boolean[] nilinst =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `public final BGL.ID[] enable`
- Role: Holds the enable state.
- Description: Backs the cached state for this file.

#### `public final boolean[] instanced`
- Role: Tracks the instanced flag.
- Description: Supports the instanced operation used by the surrounding class.

#### `public final GLBuffer ebo`
- Role: Stores the ebo value.
- Description: Backs the cached state for this file.

#### `private final GLVertexArray vao0`
- Role: Caches vao0 entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Vao0State(GLEnvironment env, BGL.ID[] enable, boolean[] instanced, GLBuffer ebo)`
- Role: Creates a new Vao0State instance.
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

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, BGL.ID[] enable, boolean[] instanced)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, GLBuffer ebo)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
