---
source: [Texture2DArray.java](../../../../src/haven/render/Texture2DArray.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture2DArray

Defines the texture2 darray render pipeline component.

## Nested Types

### Sampler2DArray

- Role: Represents sampler2 darray within Texture2DArray.
- Description: Describes the nested sampler2 darray type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int w, h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `public final int w, h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Supports the pot operation used by the surrounding class.

### Methods

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2DArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2DArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public ArrayImage<Texture2DArray> image(int layer, int miplevel)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Collection<ArrayImage<Texture2DArray>> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public Sampler2DArray(Texture2DArray tex)`
- Role: Performs sampler2 darray.
- Description: Supports the sampler2 darray operation used by the surrounding class.

#### `public Sampler2DArray sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
