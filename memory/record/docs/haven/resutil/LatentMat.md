---
source: [LatentMat.java](../../../../../src/haven/resutil/LatentMat.java)
created: 2026-06-13
updated: 2026-06-20
---

# LatentMat

Carries a material that is activated later through a named action or identifier.

## Members

### Constants

#### `public static final Slot<LatentMat> slot = new Slot<>(Slot.Type.DRAW, LatentMat.class)`
- Role: Registers the latent material state.
- Description: Keeps the deferred material on the draw pipe until it is activated.

### Fields

#### `public final Pipe.Op mat`
- Role: Stores the deferred material operation.
- Description: Applied only after the matching activation occurs.

#### `public final String id, act`
- Role: Stores the material identifier and optional activation name.
- Description: Used to match a deferred material to a later action.

### Methods

#### `public LatentMat(Pipe.Op mat, String id)`
- Role: Builds an identifier-based latent material.
- Description: Stores the deferred operation under the supplied id.

#### `public LatentMat(String act)`
- Role: Builds an activation-only latent material.
- Description: Marks the action that should later activate a material.

#### `public ShaderMacro shader()`
- Role: Returns no shader macro.
- Description: This state only carries material information and does not alter fragments.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the draw pipe.
- Description: Makes the latent material available for later resolution.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Serializes the latent material into a material buffer.
- Description: Supports resource decoding for the material system.