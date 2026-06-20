---
source: [Texture3D.java](../../../../src/haven/render/Texture3D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture3D

Defines the texture3 d render pipeline component.

## Nested Types

### Sampler3D

- Role: Represents sampler3 d within Texture3D.
- Description: Describes the nested sampler3 d type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Supports the pot operation used by the surrounding class.

### Methods

#### `public Texture3D(int w, int h, int d, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture3D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture3D(int w, int h, int d, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture3D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Image<Texture3D> image(int level)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Collection<Image<Texture3D>> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public Sampler3D(Texture3D tex)`
- Role: Performs sampler3 d.
- Description: Supports the sampler3 d operation used by the surrounding class.

#### `public Sampler3D sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
