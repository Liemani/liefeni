---
source: [TexL.java](../../../../src/haven/TexL.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexL

Builds a render texture from lazily prepared image data.

## Nested Types

### Filler

- Role: Bridges texture-buffer uploads to `TexL` decoding.
- Description: Pulls pixel data into a `FillBuffer` and clears the deferred decode reference when finished.

### Fixed

- Role: Implements a `TexL` backed by one immutable `BufferedImage`.
- Description: Returns the fixed image from `fill()` for upload.

### Prepared

- Role: Stores decoded texture data for one render environment.
- Description: Converts the image into upload buffers, mipmaps, and per-level fill buffers.

## Members

### Constants

### Fields

#### `protected Mipmapper mipmap = null`
- Role: Stores the mipmap generator.
- Description: Provides mip levels when the texture should be downsampled.

#### `private Future<Prepared> decode = null`
- Role: Caches pending decode work.
- Description: Tracks the asynchronous preparation for the current render environment.

#### `private TexL tex`
- Role: Stores the owning texture.
- Description: Gives the filler access back to the `TexL` instance being prepared.

#### `final Environment env`
- Role: Stores the render environment.
- Description: Binds the prepared upload data to the environment that requested it.

#### `FillBuffer[] data`
- Role: Stores upload buffers.
- Description: Holds one fill buffer per texture level.

#### `public final BufferedImage img`
- Role: Stores the fixed image.
- Description: Holds the image used by the `Fixed` implementation.

### Methods

#### `public abstract BufferedImage fill()`
- Role: Produces image data.
- Description: Returns the image that should be uploaded as texture content.

#### `public FillBuffer fill(Image img, Environment env)`
- Role: Supplies buffer data.
- Description: Returns the prepared upload buffer for the requested mip level.

#### `public void done()`
- Role: Clears the pending decode.
- Description: Releases the decode reference once preparation has finished.

#### `private static Sampler2D mkimg(Coord sz)`
- Role: Builds a texture wrapper.
- Description: Creates the underlying texture object for the requested size.

#### `public TexL(Coord sz)`
- Role: Creates a texture loader.
- Description: Sets up the render texture and binds this instance as its data source.

#### `public void mipmap(Mipmapper mipmap)`
- Role: Configures mipmap generation.
- Description: Sets the strategy used when generating lower texture levels.

#### `private FillBuffer filldata(DataBuffer tgt, byte[] pixels)`
- Role: Fills a render buffer.
- Description: Wraps raw pixel bytes into a `FillBuffer` for the target level.

#### `private Prepared(Environment env)`
- Role: Prepares texture upload data.
- Description: Converts the image into per-level upload buffers for one render environment.

#### `void dispose()`
- Role: Releases prepared upload buffers.
- Description: Disposes all buffers tied to the prepared texture data.

#### `private Prepared prepare(Environment env)`
- Role: Ensures prepared data exists.
- Description: Lazily builds or reuses the prepared upload data for the requested environment.

#### `public String loadname()`
- Role: Returns a load label.
- Description: Supplies a human-readable name for deferred texture preparation.

#### `private FillBuffer fill(Image img, Environment env)`
- Role: Returns a level buffer.
- Description: Looks up the prepared buffer for the requested image level.

#### `public Fixed(BufferedImage img)`
- Role: Wraps a fixed image.
- Description: Creates a `TexL` backed by one immutable `BufferedImage`.

#### `public BufferedImage fill()`
- Role: Returns the fixed image.
- Description: Exposes the immutable backing image.