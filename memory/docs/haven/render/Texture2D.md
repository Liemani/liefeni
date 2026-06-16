# Texture2D

This file documents the responsibilities and members of `Texture2D`.

## Meta

- Source: [Texture2D.java](../../../../src/haven/render/Texture2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the texture2 d render pipeline component.

## Nested Types

### Sampler2D

- Role: Represents sampler2 d within Texture2D.
- Description: Describes the nested sampler2 d type used by the enclosing class.

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

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public Image<Texture2D> image(int level)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Collection<Image<Texture2D>> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public Sampler2D(Texture2D tex)`
- Role: Performs sampler2 d.
- Description: Supports the sampler2 d operation used by the surrounding class.

#### `public Sampler2D sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
