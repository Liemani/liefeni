# Texture2D

This file documents the responsibilities and members of `Texture2D`.

## Meta

- Source: [Texture2D.java](../../../../src/haven/render/Texture2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a 2D texture resource.

## Nested Types

### Sampler2D

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

### Methods

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Texture2D(int w, int h, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Texture2D(Coord dim, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public Image<Texture2D> image(int level)`

- Description: TODO

#### `public Collection<Image<Texture2D>> images()`

- Description: TODO

#### `public Sampler2D(Texture2D tex)`

- Description: TODO

#### `public Sampler2D sampler()`

- Description: TODO

#### `public String toString()`

- Description: TODO
