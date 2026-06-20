---
source: [Texture2DMS.java](../../../../src/haven/render/Texture2DMS.java)
created: 2026-06-13
updated: 2026-06-14
---

# Texture2DMS

Defines the texture2 dms render pipeline component.

## Nested Types

### Sampler2DMS

- Role: Represents sampler2 dms within Texture2DMS.
- Description: Describes the nested sampler2 dms type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int w, h, s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `public final int w, h, s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `public final int w, h, s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `public final boolean fixed`
- Role: Tracks the fixed flag.
- Description: Supports the fixed operation used by the surrounding class.

### Methods

#### `public Texture2DMS(int w, int h, int s, boolean fixed, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2DMS(Coord dim, int s, boolean fixed, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the instance and initializes its default state.

#### `public Texture2DMS(Coord dim, int s, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public Image<Texture2DMS> image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Collection<Image<Texture2DMS>> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public Sampler2DMS(Texture2DMS tex)`
- Role: Performs sampler2 dms.
- Description: Supports the sampler2 dms operation used by the surrounding class.

#### `public Sampler2DMS sampler()`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
