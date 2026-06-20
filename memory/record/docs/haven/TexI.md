---
source: [TexI.java](../../../src/haven/TexI.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexI

Represents the tex i Haven component.

## Members

### Constants

### Fields

#### `public static ComponentColorModel glcm = PUtils.cm_rgba`
- Role: Stores the glcm value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage back`
- Role: Stores the back value.
- Description: Backs the cached state for this file.

#### `protected final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `protected final Coord tdim`
- Role: Stores the tdim value.
- Description: Backs the cached state for this file.

#### `private ColorTex st = null`
- Role: Stores the st value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexI(BufferedImage back, boolean round)`
- Role: Creates a new TexI instance.
- Description: Constructs the instance and initializes its default state.

#### `public TexI(BufferedImage back)`
- Role: Creates a new TexI instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public ColorTex st()`
- Role: Performs st.
- Description: Supports the st operation used by the surrounding class.

#### `public TexI magfilter(Texture.Filter filter)`
- Role: Performs magfilter.
- Description: Supports the magfilter operation used by the surrounding class.

#### `public TexI minfilter(Texture.Filter filter)`
- Role: Performs minfilter.
- Description: Supports the minfilter operation used by the surrounding class.

#### `public TexI filter(Texture.Filter filter)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public TexI wrapmode(Texture.Wrapping mode)`
- Role: Performs wrapmode.
- Description: Supports the wrapmode operation used by the surrounding class.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public static VectorFormat detectfmt(BufferedImage img)`
- Role: Performs detectfmt.
- Description: Supports the detectfmt operation used by the surrounding class.

#### `public static BufferedImage mkbuf(Coord sz)`
- Role: Performs mkbuf.
- Description: Supports the mkbuf operation used by the surrounding class.

#### `public static byte[] convert(BufferedImage img, Coord tsz, Coord ul, Coord sz)`
- Role: Performs convert.
- Description: Supports the convert operation used by the surrounding class.

#### `public static byte[] convert(BufferedImage img, Coord tsz)`
- Role: Performs convert.
- Description: Supports the convert operation used by the surrounding class.
