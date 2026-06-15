# TexL

This file documents the responsibilities and members of `TexL`.

## Meta

- Source: [TexL.java](../../../src/haven/TexL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a layered texture.

## Nested Types

### Filler

- Description: TODO

### Fixed

- Description: TODO

### Prepared

- Description: TODO

## Members

### Constants

### Fields

#### `protected Mipmapper mipmap = null`

- Description: TODO

#### `private Future<Prepared> decode = null`

- Description: TODO

#### `private TexL tex`

- Description: TODO

#### `final Environment env`

- Description: TODO

#### `FillBuffer[] data`

- Description: TODO

#### `public final BufferedImage img`

- Description: TODO

### Methods

#### `public abstract BufferedImage fill()`

- Description: TODO

#### `public FillBuffer fill(Image img, Environment env)`

- Description: TODO

#### `public void done()`

- Description: TODO

#### `private static Sampler2D mkimg(Coord sz)`

- Description: TODO

#### `public TexL(Coord sz)`

- Description: TODO

#### `public void mipmap(Mipmapper mipmap)`

- Description: TODO

#### `private FillBuffer filldata(DataBuffer tgt, byte[] pixels)`

- Description: TODO

#### `private Prepared(Environment env)`

- Description: TODO

#### `void dispose()`

- Description: TODO

#### `private Prepared prepare(Environment env)`

- Description: TODO

#### `public String loadname()`

- Description: TODO

#### `private FillBuffer fill(Image img, Environment env)`

- Description: TODO

#### `public Fixed(BufferedImage img)`

- Description: TODO

#### `public BufferedImage fill()`

- Description: TODO
