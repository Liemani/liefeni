---
source: [TexRaw.java](../../../src/haven/TexRaw.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexRaw

Represents the tex raw Haven component.

## Members

### Constants

### Fields

#### `public final Sampler2D back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `public final boolean invert`
- Role: Tracks the invert flag.
- Description: Supports the invert operation used by the surrounding class.

#### `private final ColorTex st`
- Role: Stores the st value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexRaw(Sampler2D back, boolean invert)`
- Role: Creates a new TexRaw instance.
- Description: Constructs the instance and initializes its default state.

#### `public TexRaw(Sampler2D back)`
- Role: Creates a new TexRaw instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
