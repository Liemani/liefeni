# ItemSpec

This file documents the responsibilities and members of `ItemSpec`.

## Meta

- Source: [ItemSpec.java](../../../src/haven/ItemSpec.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the item spec Haven component.

## Members

### Constants

#### `private static final Object[] definfo =`
- Role: Defines the shared item spec constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Object[] info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `public final ResData res`
- Role: Holds the res state.
- Description: Backs the cached state for this file.

#### `public final OwnerContext ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `private Random rnd = null`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `private GSprite spr = null`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> cinfo = null`
- Role: Caches cinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public ItemSpec(OwnerContext ctx, ResData res, Object[] info)`
- Role: Creates a new ItemSpec instance.
- Description: Constructs the instance and initializes its default state.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public GSprite sprite()`
- Role: Performs sprite.
- Description: Supports the sprite operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public GSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `public BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.
