---
source: [Texture2D.java](../../../../../src/haven/render/Texture2D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture2D

Defines the texture2 d render pipeline component.

## Nested Types

### Sampler2D

- Role: Represents a 2D texture sampler.
- Description: Wraps a `Texture2D` instance for sampling in the render pipe.

## Members

### Constants

### Fields

#### `public final int w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final int w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Caches the `pot` value for reuse.

### Methods

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a sized 2D texture.
- Description: Stores the texture dimensions, formats, usage, and filler.

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the Texture2D instance from the supplied inputs.

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the Texture2D instance from the supplied inputs.

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the Texture2D instance from the supplied inputs.

#### `public Coord sz()`
- Role: Returns the texture size.
- Description: Exposes the 2D width and height as a coordinate.

#### `public Image<Texture2D> image(int level)`
- Role: Returns one mip image.
- Description: Exposes the texture image for the requested mip level.

#### `public Collection<Image<Texture2D>> images()`
- Role: Returns all mip images.
- Description: Exposes the full image collection for this texture.

#### `public Sampler2D(Texture2D tex)`
- Role: Creates one 2D texture sampler.
- Description: Wraps the underlying texture object for shader use.

#### `public Sampler2D sampler()`
- Role: Returns the texture sampler.
- Description: Exposes a sampler bound to this texture.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture2D for debugging and logging.