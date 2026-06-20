---
source: [LatentMat.java](../../../../src/haven/resutil/LatentMat.java)
created: 2026-06-13
updated: 2026-06-14
---

# LatentMat

Provides resource helper logic for latent mat.

## Nested Types

### $latent

- Role: Represents $latent within LatentMat.
- Description: Describes the nested $latent type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<LatentMat> slot = new Slot<>(Slot.Type.DRAW, LatentMat.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Pipe.Op mat`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `public final String id, act`
- Role: Stores the act value.
- Description: Backs the cached state for this file.

#### `public final String id, act`
- Role: Stores the act value.
- Description: Backs the cached state for this file.

### Methods

#### `public LatentMat(Pipe.Op mat, String id)`
- Role: Creates a new LatentMat instance.
- Description: Constructs the instance and initializes its default state.

#### `public LatentMat(String act)`
- Role: Creates a new LatentMat instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
