# TexI

This file documents the responsibilities and members of `TexI`.

## Meta

- Source: [TexI.java](../../../src/haven/TexI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an image-backed texture.

## Members

### Constants

### Fields

#### `public static ComponentColorModel glcm = PUtils.cm_rgba`

- Description: TODO

#### `public final BufferedImage back`

- Description: TODO

#### `protected final Coord sz`

- Description: TODO

#### `protected final Coord tdim`

- Description: TODO

#### `private ColorTex st = null`

- Description: TODO

### Methods

#### `public TexI(BufferedImage back, boolean round)`

- Description: TODO

#### `public TexI(BufferedImage back)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public ColorTex st()`

- Description: TODO

#### `public TexI magfilter(Texture.Filter filter)`

- Description: TODO

#### `public TexI minfilter(Texture.Filter filter)`

- Description: TODO

#### `public TexI filter(Texture.Filter filter)`

- Description: TODO

#### `public TexI wrapmode(Texture.Wrapping mode)`

- Description: TODO

#### `public void render(GOut g, float[] gc, float[] tc)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public static VectorFormat detectfmt(BufferedImage img)`

- Description: TODO

#### `public static BufferedImage mkbuf(Coord sz)`

- Description: TODO

#### `public static byte[] convert(BufferedImage img, Coord tsz, Coord ul, Coord sz)`

- Description: TODO

#### `public static byte[] convert(BufferedImage img, Coord tsz)`

- Description: TODO
