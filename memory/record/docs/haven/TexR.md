---
source: [TexR.java](../../../src/haven/TexR.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexR

Represents the tex r Haven component.

## Nested Types

### Encoded

- Role: Represents encoded within TexR.
- Description: Describes the nested encoded type used by the enclosing class.

### Image

- Role: Represents image within TexR.
- Description: Describes the nested image type used by the enclosing class.

### Real

- Role: Represents real within TexR.
- Description: Describes the nested real type used by the enclosing class.

## Members

### Constants

### Fields

#### `transient private byte[] img, mask`
- Role: Stores the mask value.
- Description: Backs the cached state for this file.

#### `transient private byte[] img, mask`
- Role: Stores the mask value.
- Description: Backs the cached state for this file.

#### `transient private final TexL tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private final Coord off, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final Coord off, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final TexL tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract TexL tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public TexR(Resource res)`
- Role: Creates a new TexR instance.
- Description: Constructs the instance and initializes its default state.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Encoded(Resource res, Message buf)`
- Role: Performs encoded.
- Description: Supports the encoded operation used by the surrounding class.

#### `private Real()`
- Role: Performs real.
- Description: Supports the real operation used by the surrounding class.

#### `private BufferedImage rd(final byte[] data)`
- Role: Performs rd.
- Description: Supports the rd operation used by the surrounding class.

#### `public BufferedImage fill()`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public String loadname()`
- Role: Performs loadname.
- Description: Supports the loadname operation used by the surrounding class.

#### `public TexL tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Image(Resource res, TexL tex, int id)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Image(Resource res, TexL tex)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public TexL tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.
