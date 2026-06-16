# TextureCube

This file documents the responsibilities and members of `TextureCube`.

## Meta

- Source: [TextureCube.java](../../../../src/haven/render/TextureCube.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the texture cube render pipeline component.

## Nested Types

### CubeImage

- Role: Represents cube image within TextureCube.
- Description: Describes the nested cube image type used by the enclosing class.

### Face

- Role: Represents face within TextureCube.
- Description: Describes the nested face type used by the enclosing class.

### SamplerCube

- Role: Represents sampler cube within TextureCube.
- Description: Describes the nested sampler cube type used by the enclosing class.

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

#### `public final Face face`
- Role: Holds the face state.
- Description: Backs the cached state for this file.

### Methods

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the instance and initializes its default state.

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the instance and initializes its default state.

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the instance and initializes its default state.

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public CubeImage(TextureCube tex, int w, int h, Face face, int level)`
- Role: Performs cube image.
- Description: Supports the cube image operation used by the surrounding class.

#### `public boolean equals(CubeImage that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public CubeImage image(Face face, int level)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Collection<CubeImage> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public SamplerCube(TextureCube tex)`
- Role: Performs sampler cube.
- Description: Supports the sampler cube operation used by the surrounding class.

#### `public SamplerCube sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
