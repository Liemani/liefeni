---
source: [Vao0State.java](../../../../../../src/haven/render/gl/Vao0State.java)
created: 2026-06-13
updated: 2026-06-14
---

# Vao0State

Provides GL backend support for vao0 state.

## Members

### Constants

#### `private static final BGL.ID[] nilen =`
- Role: Caches the nilen value.
- Description: Caches the `nilen` value for reuse.
- Value: ``

#### `private static final boolean[] nilinst =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.
- Value: ``

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `public final BGL.ID[] enable`
- Role: Caches the enable value.
- Description: Caches the `enable` value for reuse.

#### `public final boolean[] instanced`
- Role: Tracks the instanced flag.
- Description: Caches the `instanced` value for reuse.

#### `public final GLBuffer ebo`
- Role: Caches the ebo value.
- Description: Caches the `ebo` value for reuse.

#### `private final GLVertexArray vao0`
- Role: Caches the vao0 value.
- Description: Caches the `vao0` value for reuse.

### Methods

#### `public Vao0State(GLEnvironment env, BGL.ID[] enable, boolean[] instanced, GLBuffer ebo)`
- Role: Creates a new Vao0State instance.
- Description: Constructs the Vao0State instance from the supplied inputs.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void unapply(BGL gl)`
- Role: Handles the unapply path.
- Description: Implements the unapply operation.

#### `public void applyto(BGL gl, GLState sthat)`
- Role: Handles the applyto path.
- Description: Implements the applyto operation.

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, BGL.ID[] enable, boolean[] instanced)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, GLBuffer ebo)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.