---
source: [TextureArray.java](../../../../../src/haven/render/TextureArray.java)
created: 2026-06-13
updated: 2026-06-14
---

# TextureArray

Defines the texture array render pipeline component.

## Nested Types

### ArrayImage

- Role: Represents array image within TextureArray.
- Description: Describes the nested array image type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `public final int layer`
- Role: Caches the layer value.
- Description: Caches the `layer` value for reuse.

### Methods

#### `public TextureArray(int n, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureArray instance.
- Description: Constructs the TextureArray instance from the supplied inputs.

#### `public TextureArray(int n, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureArray instance.
- Description: Constructs the TextureArray instance from the supplied inputs.

#### `public ArrayImage(T tex, int w, int h, int d, int layer, int level)`
- Role: Handles the array image path.
- Description: Implements the array image operation.

#### `public boolean equals(ArrayImage<?> that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TextureArray for debugging and logging.