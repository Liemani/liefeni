# TextureCube

This file documents the responsibilities and members of `TextureCube`.

## Meta

- Source: [TextureCube.java](../../../../src/haven/render/TextureCube.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a cube texture.

## Nested Types

### CubeImage

- Description: TODO

### Face

- Description: TODO

### SamplerCube

- Description: TODO

## Members

### Constants

### Fields

#### `public final int w, h`

- Description: TODO

#### `public final int w, h`

- Description: TODO

#### `private final boolean pot`

- Description: TODO

#### `public final Face face`

- Description: TODO

### Methods

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public TextureCube(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public TextureCube(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public CubeImage(TextureCube tex, int w, int h, Face face, int level)`

- Description: TODO

#### `public boolean equals(CubeImage that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public CubeImage image(Face face, int level)`

- Description: TODO

#### `public Collection<CubeImage> images()`

- Description: TODO

#### `public SamplerCube(TextureCube tex)`

- Description: TODO

#### `public SamplerCube sampler()`

- Description: TODO

#### `public String toString()`

- Description: TODO
