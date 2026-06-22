---
source: [TexRaw.java](../../../../src/haven/TexRaw.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexRaw

Represents the tex raw Haven component.

## Members

### Constants

### Fields

#### `public final Sampler2D back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `public final boolean invert`
- Role: Tracks the invert flag.
- Description: Caches the `invert` value for reuse.

#### `private final ColorTex st`
- Role: Caches the st value.
- Description: Caches the `st` value for reuse.

### Methods

#### `public TexRaw(Sampler2D back, boolean invert)`
- Role: Creates a new TexRaw instance.
- Description: Constructs the TexRaw instance from the supplied inputs.

#### `public TexRaw(Sampler2D back)`
- Role: Creates a new TexRaw instance.
- Description: Constructs the TexRaw instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.