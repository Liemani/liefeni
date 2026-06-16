# TextureArray

This file documents the responsibilities and members of `TextureArray`.

## Meta

- Source: [TextureArray.java](../../../../src/haven/render/TextureArray.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the texture array render pipeline component.

## Nested Types

### ArrayImage

- Role: Represents array image within TextureArray.
- Description: Describes the nested array image type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `public final int layer`
- Role: Stores the layer value.
- Description: Backs the cached state for this file.

### Methods

#### `public TextureArray(int n, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public TextureArray(int n, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public ArrayImage(T tex, int w, int h, int d, int layer, int level)`
- Role: Performs array image.
- Description: Supports the array image operation used by the surrounding class.

#### `public boolean equals(ArrayImage<?> that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
