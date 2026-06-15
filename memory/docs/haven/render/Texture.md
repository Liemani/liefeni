# Texture

This file documents the responsibilities and members of `Texture`.

## Meta

- Source: [Texture.java](../../../../src/haven/render/Texture.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a texture resource.

## Nested Types

### Filter

- Description: TODO

### Image

- Description: TODO

### Sampler

- Description: TODO

### Wrapping

- Description: TODO

## Members

### Constants

#### `public static final VectorFormat DEPTH = new VectorFormat(1, NumberFormat.DEPTH)`

- Description: TODO

### Fields

#### `public final VectorFormat ifmt, efmt`

- Description: TODO

#### `public final VectorFormat ifmt, efmt`

- Description: TODO

#### `public final DataBuffer.Usage usage`

- Description: TODO

#### `public final DataBuffer.Filler<? super Image> init`

- Description: TODO

#### `public boolean srgb = false`

- Description: TODO

#### `public Swizzle eperm`

- Description: TODO

#### `public boolean shared = false`

- Description: TODO

#### `public Disposable ro`

- Description: TODO

#### `public Object desc`

- Description: TODO

#### `public final T tex`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int level`

- Description: TODO

#### `public final T tex`

- Description: TODO

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`

- Description: TODO

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`

- Description: TODO

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`

- Description: TODO

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`

- Description: TODO

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`

- Description: TODO

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`

- Description: TODO

#### `public float anisotropy = 0.0f`

- Description: TODO

#### `public FColor border = FColor.BLACK`

- Description: TODO

#### `public Disposable ro`

- Description: TODO

### Methods

#### `public Texture(DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`

- Description: TODO

#### `public Image(T tex, int w, int h, int d, int level)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean equals(Image that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public abstract Collection<? extends Image<? extends Texture>> images()`

- Description: TODO

#### `public abstract Sampler<? extends Texture> sampler()`

- Description: TODO

#### `public Texture srgb()`

- Description: TODO

#### `public Texture eperm(Swizzle eperm)`

- Description: TODO

#### `public Texture shared()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public Sampler(T tex)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public Sampler<T> magfilter(Filter v)`

- Description: TODO

#### `public Sampler<T> minfilter(Filter v)`

- Description: TODO

#### `public Sampler<T> mipfilter(Filter v)`

- Description: TODO

#### `public Sampler<T> swrap(Wrapping v)`

- Description: TODO

#### `public Sampler<T> twrap(Wrapping v)`

- Description: TODO

#### `public Sampler<T> rwrap(Wrapping v)`

- Description: TODO

#### `public Sampler<T> wrapmode(Wrapping v)`

- Description: TODO

#### `public Sampler<T> anisotropy(float v)`

- Description: TODO

#### `public Sampler<T> border(FColor v)`

- Description: TODO

#### `public Sampler<T> copy(Sampler<?> that)`

- Description: TODO

#### `public int parhash()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean parequals(Sampler<?> that)`

- Description: TODO

#### `private boolean equals(Sampler<?> that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `String descfmt()`

- Description: TODO

#### `public Texture desc(Object desc)`

- Description: TODO
