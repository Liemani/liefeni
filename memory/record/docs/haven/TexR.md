---
source: [TexR.java](../../../../src/haven/TexR.java)
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
- Role: Caches the mask value.
- Description: Caches the `mask` value for reuse.

#### `transient private byte[] img, mask`
- Role: Caches the mask value.
- Description: Caches the `mask` value for reuse.

#### `transient private final TexL tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private final Coord off, sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final Coord off, sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final TexL tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public abstract TexL tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public TexR(Resource res)`
- Role: Creates a new TexR instance.
- Description: Constructs the TexR instance from the supplied inputs.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Encoded(Resource res, Message buf)`
- Role: Handles the encoded path.
- Description: Implements the encoded operation.

#### `private Real()`
- Role: Handles the real path.
- Description: Implements the real operation.

#### `private BufferedImage rd(final byte[] data)`
- Role: Handles the rd path.
- Description: Implements the rd operation.

#### `public BufferedImage fill()`
- Role: Handles the fill path.
- Description: Implements the fill operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TexR for debugging and logging.

#### `public String loadname()`
- Role: Handles the loadname path.
- Description: Loads the name.

#### `public TexL tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public Image(Resource res, TexL tex, int id)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Image(Resource res, TexL tex)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public TexL tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.