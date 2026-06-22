---
source: [Texture2DMS.java](../../../../../src/haven/render/Texture2DMS.java)
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
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

#### `public final int w, h, s`
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

#### `public final int w, h, s`
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

#### `public final boolean fixed`
- Role: Tracks the fixed flag.
- Description: Caches the `fixed` value for reuse.

### Methods

#### `public Texture2DMS(int w, int h, int s, boolean fixed, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the Texture2DMS instance from the supplied inputs.

#### `public Texture2DMS(Coord dim, int s, boolean fixed, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the Texture2DMS instance from the supplied inputs.

#### `public Texture2DMS(Coord dim, int s, VectorFormat ifmt)`
- Role: Creates a new Texture2DMS instance.
- Description: Constructs the Texture2DMS instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public Image<Texture2DMS> image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Collection<Image<Texture2DMS>> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public Sampler2DMS(Texture2DMS tex)`
- Role: Handles the sampler2 dms path.
- Description: Implements the sampler2 dms operation.

#### `public Sampler2DMS sampler()`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Texture2DMS for debugging and logging.