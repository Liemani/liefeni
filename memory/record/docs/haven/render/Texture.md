---
source: [Texture.java](../../../../../src/haven/render/Texture.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture

Defines the texture render pipeline component.

## Nested Types

### Filter

- Role: Defines texture filtering modes.
- Description: Selects how texture samples are filtered when magnified or minified.

### Image

- Role: Describes one texture image level.
- Description: Carries the texture handle together with size and mip level metadata.

### Sampler

- Role: Configures texture sampling.
- Description: Stores wrap, filter, anisotropy, and border settings for a texture.

### Wrapping

- Role: Defines texture wrap modes.
- Description: Selects how texture coordinates repeat, clamp, or mirror at edges.

## Members

### Constants

#### `public static final VectorFormat DEPTH = new VectorFormat(1, NumberFormat.DEPTH)`
- Role: Implements the depth operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(1, NumberFormat.DEPTH)`

### Fields

#### `public final VectorFormat ifmt, efmt`
- Role: Caches the efmt value.
- Description: Caches the `efmt` value for reuse.

#### `public final VectorFormat ifmt, efmt`
- Role: Caches the efmt value.
- Description: Caches the `efmt` value for reuse.

#### `public final DataBuffer.Usage usage`
- Role: Caches the usage value.
- Description: Caches the `usage` value for reuse.

#### `public final DataBuffer.Filler<? super Image> init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

#### `public boolean srgb = false`
- Role: Tracks the srgb flag.
- Description: Caches the `srgb` value for reuse.

#### `public Swizzle eperm`
- Role: Caches the eperm value.
- Description: Caches the `eperm` value for reuse.

#### `public boolean shared = false`
- Role: Tracks the shared flag.
- Description: Caches the `shared` value for reuse.

#### `public Disposable ro`
- Role: Caches the ro value.
- Description: Caches the `ro` value for reuse.

#### `public Object desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final T tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int level`
- Role: Caches the level value.
- Description: Caches the `level` value for reuse.

#### `public final T tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Caches the magfilter value.
- Description: Caches the `magfilter` value for reuse.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Caches the magfilter value.
- Description: Caches the `magfilter` value for reuse.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Caches the magfilter value.
- Description: Caches the `magfilter` value for reuse.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Caches the swrap value.
- Description: Caches the `swrap` value for reuse.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Caches the swrap value.
- Description: Caches the `swrap` value for reuse.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Caches the swrap value.
- Description: Caches the `swrap` value for reuse.

#### `public float anisotropy = 0.0f`
- Role: Caches the anisotropy value.
- Description: Caches the `anisotropy` value for reuse.

#### `public FColor border = FColor.BLACK`
- Role: Caches the border value.
- Description: Caches the `border` value for reuse.

#### `public Disposable ro`
- Role: Caches the ro value.
- Description: Caches the `ro` value for reuse.

### Methods

#### `public Texture(DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture instance.
- Description: Constructs the Texture instance from the supplied inputs.

#### `public Image(T tex, int w, int h, int d, int level)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public boolean equals(Image that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture for debugging and logging.

#### `public abstract Collection<? extends Image<? extends Texture>> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public abstract Sampler<? extends Texture> sampler()`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public Texture srgb()`
- Role: Handles the srgb path.
- Description: Implements the srgb operation.

#### `public Texture eperm(Swizzle eperm)`
- Role: Handles the eperm path.
- Description: Implements the eperm operation.

#### `public Texture shared()`
- Role: Handles the shared path.
- Description: Implements the shared operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public Sampler(T tex)`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public Sampler<T> magfilter(Filter v)`
- Role: Handles the magfilter path.
- Description: Implements the magfilter operation.

#### `public Sampler<T> minfilter(Filter v)`
- Role: Handles the minfilter path.
- Description: Implements the minfilter operation.

#### `public Sampler<T> mipfilter(Filter v)`
- Role: Handles the mipfilter path.
- Description: Implements the mipfilter operation.

#### `public Sampler<T> swrap(Wrapping v)`
- Role: Handles the swrap path.
- Description: Implements the swrap operation.

#### `public Sampler<T> twrap(Wrapping v)`
- Role: Handles the twrap path.
- Description: Implements the twrap operation.

#### `public Sampler<T> rwrap(Wrapping v)`
- Role: Handles the rwrap path.
- Description: Implements the rwrap operation.

#### `public Sampler<T> wrapmode(Wrapping v)`
- Role: Handles the wrapmode path.
- Description: Implements the wrapmode operation.

#### `public Sampler<T> anisotropy(float v)`
- Role: Handles the anisotropy path.
- Description: Implements the anisotropy operation.

#### `public Sampler<T> border(FColor v)`
- Role: Handles the border path.
- Description: Implements the border operation.

#### `public Sampler<T> copy(Sampler<?> that)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public int parhash()`
- Role: Handles the parhash path.
- Description: Implements the parhash operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean parequals(Sampler<?> that)`
- Role: Handles the parequals path.
- Description: Implements the parequals operation.

#### `private boolean equals(Sampler<?> that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture for debugging and logging.

#### `String descfmt()`
- Role: Handles the descfmt path.
- Description: Implements the descfmt operation.

#### `public Texture desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.