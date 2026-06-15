# Texture2DArray

This file documents the responsibilities and members of `Texture2DArray`.

## Meta

- Source: [Texture2DArray.java](../../../../src/haven/render/Texture2DArray.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a 2D texture array.

## Nested Types

### Sampler2DArray

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

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Texture2DArray(int w, int h, int n, DataBuffer.Usage usage, VectorFormat ifmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public ArrayImage<Texture2DArray> image(int layer, int miplevel)`

- Description: TODO

#### `public Collection<ArrayImage<Texture2DArray>> images()`

- Description: TODO

#### `public Sampler2DArray(Texture2DArray tex)`

- Description: TODO

#### `public Sampler2DArray sampler()`

- Description: TODO

#### `public String toString()`

- Description: TODO
