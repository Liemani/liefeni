---
source: [Texture3D.java](../../../../../src/haven/render/Texture3D.java)
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
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Caches the `pot` value for reuse.

### Methods

#### `public Texture3D(int w, int h, int d, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture3D instance.
- Description: Constructs the Texture3D instance from the supplied inputs.

#### `public Texture3D(int w, int h, int d, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture3D instance.
- Description: Constructs the Texture3D instance from the supplied inputs.

#### `public Image<Texture3D> image(int level)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Collection<Image<Texture3D>> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public Sampler3D(Texture3D tex)`
- Role: Handles the sampler3 d path.
- Description: Implements the sampler3 d operation.

#### `public Sampler3D sampler()`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture3D for debugging and logging.