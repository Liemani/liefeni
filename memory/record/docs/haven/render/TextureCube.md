---
source: [TextureCube.java](../../../../../src/haven/render/TextureCube.java)
created: 2026-06-13
updated: 2026-06-14
---

# TextureCube

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
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final int w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `private final boolean pot`
- Role: Tracks the pot flag.
- Description: Caches the `pot` value for reuse.

#### `public final Face face`
- Role: Caches the face value.
- Description: Caches the `face` value for reuse.

### Methods

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the TextureCube instance from the supplied inputs.

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the TextureCube instance from the supplied inputs.

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the TextureCube instance from the supplied inputs.

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new TextureCube instance.
- Description: Constructs the TextureCube instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public CubeImage(TextureCube tex, int w, int h, Face face, int level)`
- Role: Handles the cube image path.
- Description: Implements the cube image operation.

#### `public boolean equals(CubeImage that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TextureCube for debugging and logging.

#### `public CubeImage image(Face face, int level)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Collection<CubeImage> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public SamplerCube(TextureCube tex)`
- Role: Handles the sampler cube path.
- Description: Implements the sampler cube operation.

#### `public SamplerCube sampler()`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TextureCube for debugging and logging.