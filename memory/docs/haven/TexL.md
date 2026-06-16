# TexL

This file documents the responsibilities and members of `TexL`.

## Meta

- Source: [TexL.java](../../../src/haven/TexL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tex l Haven component.

## Nested Types

### Filler

- Role: Represents filler within TexL.
- Description: Describes the nested filler type used by the enclosing class.

### Fixed

- Role: Represents fixed within TexL.
- Description: Describes the nested fixed type used by the enclosing class.

### Prepared

- Role: Represents prepared within TexL.
- Description: Describes the nested prepared type used by the enclosing class.

## Members

### Constants

### Fields

#### `protected Mipmapper mipmap = null`
- Role: Holds the mipmap state.
- Description: Backs the cached state for this file.

#### `private Future<Prepared> decode = null`
- Role: Holds the decode state.
- Description: Backs the cached state for this file.

#### `private TexL tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `final Environment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `FillBuffer[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract BufferedImage fill()`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public FillBuffer fill(Image img, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `private static Sampler2D mkimg(Coord sz)`
- Role: Performs mkimg.
- Description: Supports the mkimg operation used by the surrounding class.

#### `public TexL(Coord sz)`
- Role: Creates a new TexL instance.
- Description: Constructs the instance and initializes its default state.

#### `public void mipmap(Mipmapper mipmap)`
- Role: Performs mipmap.
- Description: Supports the mipmap operation used by the surrounding class.

#### `private FillBuffer filldata(DataBuffer tgt, byte[] pixels)`
- Role: Performs filldata.
- Description: Supports the filldata operation used by the surrounding class.

#### `private Prepared(Environment env)`
- Role: Performs prepared.
- Description: Supports the prepared operation used by the surrounding class.

#### `void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private Prepared prepare(Environment env)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `public String loadname()`
- Role: Performs loadname.
- Description: Supports the loadname operation used by the surrounding class.

#### `private FillBuffer fill(Image img, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public Fixed(BufferedImage img)`
- Role: Performs fixed.
- Description: Supports the fixed operation used by the surrounding class.

#### `public BufferedImage fill()`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.
