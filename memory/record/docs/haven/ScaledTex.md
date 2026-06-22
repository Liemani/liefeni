---
source: [ScaledTex.java](../../../../src/haven/ScaledTex.java)
created: 2026-06-13
updated: 2026-06-14
---

# ScaledTex

Wraps a texture and presents it at a fixed output size.

## Members

### Constants

### Fields

#### `private final T impl`
- Role: Stores the wrapped texture.
- Description: Keeps the underlying texture implementation that does the actual rendering work.

#### `private final Coord sz`
- Role: Stores the target size.
- Description: Defines the output dimensions this wrapper should present.

### Methods

#### `public ScaledTex(T impl, Coord sz)`
- Role: Wraps a texture with a fixed output size.
- Description: Stores the underlying texture implementation and the size it should present.

#### `public T impl()`
- Role: Returns the wrapped texture.
- Description: Exposes the underlying texture implementation.

#### `public Coord sz()`
- Role: Returns the target size.
- Description: Exposes the output size used by the wrapper.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders with raw vertex data.
- Description: Delegates rendering to the wrapped texture using precomputed geometry and texture coordinates.

#### `public void render(GOut g, Coord dul, Coord dbr, Coord tul, Coord tbr)`
- Role: Renders with explicit corners.
- Description: Delegates rendering to the wrapped texture using destination and source corner coordinates.

#### `public void render(GOut g, Coord c)`
- Role: Renders at a destination point.
- Description: Draws the wrapped texture at `c` using the wrapper size as the output extent.

#### `public void crender(GOut g, Coord c, Coord dsz, Coord cul, Coord cbr)`
- Role: Renders with a custom destination size.
- Description: Delegates cropped rendering while preserving the explicit destination size.

#### `public void crender(GOut g, Coord c, Coord ul, Coord br)`
- Role: Renders with crop corners.
- Description: Delegates cropped rendering using the wrapper size as the destination size.

#### `public void dispose()`
- Role: Releases the wrapped texture.
- Description: Disposes the underlying texture resource.
