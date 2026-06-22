---
source: [TexI.java](../../../../src/haven/TexI.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexI

Wraps an in-memory `BufferedImage` as a renderable texture.

## Members

### Constants

### Fields

#### `public static ComponentColorModel glcm = PUtils.cm_rgba`
- Role: Stores the target image color model.
- Description: Shared RGBA color model used when converting images into texture storage.

#### `public final BufferedImage back`
- Role: Stores the backing image.
- Description: Keeps the source image that will be uploaded to the GPU.

#### `protected final Coord sz`
- Role: Stores the source size.
- Description: Records the original pixel dimensions of the backing image.

#### `protected final Coord tdim`
- Role: Stores the texture dimensions.
- Description: Records the power-of-two upload size when rounding is enabled.

#### `private ColorTex st = null`
- Role: Caches the GPU texture.
- Description: Stores the lazily created render-side texture wrapper.

### Methods

#### `public TexI(BufferedImage back, boolean round)`
- Role: Wraps a backing image.
- Description: Captures the source image and chooses the upload dimensions.

#### `public TexI(BufferedImage back)`
- Role: Wraps a backing image.
- Description: Convenience constructor that uses rounded texture dimensions.

#### `public Coord sz()`
- Role: Returns the image size.
- Description: Exposes the original backing-image dimensions.

#### `public ColorTex st()`
- Role: Returns the texture state.
- Description: Lazily creates the GPU-side texture wrapper.

#### `public TexI magfilter(Texture.Filter filter)`
- Role: Sets the magnification filter.
- Description: Applies a magnification filter to the lazily created texture.

#### `public TexI minfilter(Texture.Filter filter)`
- Role: Sets the minification filter.
- Description: Applies a minification filter to the lazily created texture.

#### `public TexI filter(Texture.Filter filter)`
- Role: Sets both texture filters.
- Description: Applies the same filter to magnification and minification.

#### `public TexI wrapmode(Texture.Wrapping mode)`
- Role: Sets the wrap mode.
- Description: Applies the requested wrapping mode to the texture.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders the texture.
- Description: Draws the uploaded image using the provided geometry and texture coordinates.

#### `public void dispose()`
- Role: Releases the texture.
- Description: Disposes the GPU texture if it has been created.

#### `public static VectorFormat detectfmt(BufferedImage img)`
- Role: Handles the detectfmt path.
- Description: Implements the detectfmt operation.

#### `public static BufferedImage mkbuf(Coord sz)`
- Role: Handles the mkbuf path.
- Description: Implements the mkbuf operation.

#### `public static byte[] convert(BufferedImage img, Coord tsz, Coord ul, Coord sz)`
- Role: Handles the convert path.
- Description: Implements the convert operation.

#### `public static byte[] convert(BufferedImage img, Coord tsz)`
- Role: Handles the convert path.
- Description: Implements the convert operation.