---
source: [ItemSpec.java](../../../../src/haven/ItemSpec.java)
created: 2026-06-13
updated: 2026-06-14
---

# ItemSpec

Represents the item spec Haven component.

## Members

### Constants

#### `private static final Object[] definfo =`
- Role: Caches the definfo value.
- Description: Caches the `definfo` value for reuse.
- Value: ``

### Fields

#### `public final Object[] info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final ResData res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final OwnerContext ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `private Random rnd = null`
- Role: Caches the rnd value.
- Description: Caches the `rnd` value for reuse.

#### `private GSprite spr = null`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private List<ItemInfo> cinfo = null`
- Role: Caches the cinfo value.
- Description: Caches the `cinfo` value for reuse.

### Methods

#### `public ItemSpec(OwnerContext ctx, ResData res, Object[] info)`
- Role: Creates a new ItemSpec instance.
- Description: Constructs the ItemSpec instance from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public GSprite sprite()`
- Role: Handles the sprite path.
- Description: Implements the sprite operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public GSprite spr()`
- Role: Handles the spr path.
- Description: Implements the spr operation.

#### `public BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.