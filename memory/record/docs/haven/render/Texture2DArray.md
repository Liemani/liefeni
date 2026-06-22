---
source: [Texture2DArray.java](../../../../../src/haven/render/Texture2DArray.java)
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
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final int w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Caches the `pot` value for reuse.

### Methods

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2DArray instance.
- Description: Constructs the Texture2DArray instance from the supplied inputs.

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2DArray instance.
- Description: Constructs the Texture2DArray instance from the supplied inputs.

#### `public ArrayImage<Texture2DArray> image(int layer, int miplevel)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Collection<ArrayImage<Texture2DArray>> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public Sampler2DArray(Texture2DArray tex)`
- Role: Handles the sampler2 darray path.
- Description: Implements the sampler2 d array operation.

#### `public Sampler2DArray sampler()`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture2DArray for debugging and logging.