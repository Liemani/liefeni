---
source: [Texture.java](../../../../src/haven/render/Texture.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture

Defines the texture render pipeline component.

## Nested Types

### Filter

- Role: Represents filter within Texture.
- Description: Describes the nested filter type used by the enclosing class.

### Image

- Role: Represents image within Texture.
- Description: Describes the nested image type used by the enclosing class.

### Sampler

- Role: Represents sampler within Texture.
- Description: Describes the nested sampler type used by the enclosing class.

### Wrapping

- Role: Represents wrapping within Texture.
- Description: Describes the nested wrapping type used by the enclosing class.

## Members

### Constants

#### `public static final VectorFormat DEPTH = new VectorFormat(1, NumberFormat.DEPTH)`
- Role: Defines the shared depth constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final VectorFormat ifmt, efmt`
- Role: Holds the efmt state.
- Description: Backs the cached state for this file.

#### `public final VectorFormat ifmt, efmt`
- Role: Holds the efmt state.
- Description: Backs the cached state for this file.

#### `public final DataBuffer.Usage usage`
- Role: Stores the usage value.
- Description: Backs the cached state for this file.

#### `public final DataBuffer.Filler<? super Image> init`
- Role: Stores the init value.
- Description: Backs the cached state for this file.

#### `public boolean srgb = false`
- Role: Tracks the srgb flag.
- Description: Supports the srgb operation used by the surrounding class.

#### `public Swizzle eperm`
- Role: Holds the eperm state.
- Description: Backs the cached state for this file.

#### `public boolean shared = false`
- Role: Tracks the shared flag.
- Description: Supports the shared operation used by the surrounding class.

#### `public Disposable ro`
- Role: Holds the ro state.
- Description: Backs the cached state for this file.

#### `public Object desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `public final T tex`
- Role: Holds the tex state.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int level`
- Role: Stores the level value.
- Description: Backs the cached state for this file.

#### `public final T tex`
- Role: Holds the tex state.
- Description: Backs the cached state for this file.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Holds the magfilter state.
- Description: Backs the cached state for this file.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Holds the magfilter state.
- Description: Backs the cached state for this file.

#### `public Filter magfilter = Filter.LINEAR, minfilter = Filter.NEAREST, mipfilter = null`
- Role: Holds the magfilter state.
- Description: Backs the cached state for this file.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Holds the swrap state.
- Description: Backs the cached state for this file.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Holds the swrap state.
- Description: Backs the cached state for this file.

#### `public Wrapping swrap = Wrapping.REPEAT, twrap = Wrapping.REPEAT, rwrap = Wrapping.REPEAT`
- Role: Holds the swrap state.
- Description: Backs the cached state for this file.

#### `public float anisotropy = 0.0f`
- Role: Stores the anisotropy value.
- Description: Backs the cached state for this file.

#### `public FColor border = FColor.BLACK`
- Role: Stores the border value.
- Description: Backs the cached state for this file.

#### `public Disposable ro`
- Role: Holds the ro state.
- Description: Backs the cached state for this file.

### Methods

#### `public Texture(DataBuffer.Usage usage, VectorFormat ifmt, VectorFormat efmt, DataBuffer.Filler<? super Image> init)`
- Role: Creates a new Texture instance.
- Description: Constructs the instance and initializes its default state.

#### `public Image(T tex, int w, int h, int d, int level)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public boolean equals(Image that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public abstract Collection<? extends Image<? extends Texture>> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public abstract Sampler<? extends Texture> sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public Texture srgb()`
- Role: Performs srgb.
- Description: Supports the srgb operation used by the surrounding class.

#### `public Texture eperm(Swizzle eperm)`
- Role: Performs eperm.
- Description: Supports the eperm operation used by the surrounding class.

#### `public Texture shared()`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Sampler(T tex)`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Sampler<T> magfilter(Filter v)`
- Role: Performs magfilter.
- Description: Supports the magfilter operation used by the surrounding class.

#### `public Sampler<T> minfilter(Filter v)`
- Role: Performs minfilter.
- Description: Supports the minfilter operation used by the surrounding class.

#### `public Sampler<T> mipfilter(Filter v)`
- Role: Performs mipfilter.
- Description: Supports the mipfilter operation used by the surrounding class.

#### `public Sampler<T> swrap(Wrapping v)`
- Role: Performs swrap.
- Description: Supports the swrap operation used by the surrounding class.

#### `public Sampler<T> twrap(Wrapping v)`
- Role: Performs twrap.
- Description: Supports the twrap operation used by the surrounding class.

#### `public Sampler<T> rwrap(Wrapping v)`
- Role: Performs rwrap.
- Description: Supports the rwrap operation used by the surrounding class.

#### `public Sampler<T> wrapmode(Wrapping v)`
- Role: Performs wrapmode.
- Description: Supports the wrapmode operation used by the surrounding class.

#### `public Sampler<T> anisotropy(float v)`
- Role: Performs anisotropy.
- Description: Supports the anisotropy operation used by the surrounding class.

#### `public Sampler<T> border(FColor v)`
- Role: Performs border.
- Description: Supports the border operation used by the surrounding class.

#### `public Sampler<T> copy(Sampler<?> that)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public int parhash()`
- Role: Performs parhash.
- Description: Supports the parhash operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean parequals(Sampler<?> that)`
- Role: Performs parequals.
- Description: Supports the parequals operation used by the surrounding class.

#### `private boolean equals(Sampler<?> that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `String descfmt()`
- Role: Performs descfmt.
- Description: Supports the descfmt operation used by the surrounding class.

#### `public Texture desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.
