---
source: [SpriteLink.java](../../../../src/haven/SpriteLink.java)
created: 2026-06-13
updated: 2026-06-14
---

# SpriteLink

Represents the sprite link Haven component.

## Nested Types

### ByRes

- Role: Chooses a sprite factory by referenced resource.
- Description: Loads a secondary resource and forwards sprite creation to it.

### ByTile

- Role: Chooses a sprite factory by tile tags.
- Description: Looks up the current tile's tags and selects the matching sprite factory or default.

## Members

### Constants

#### `public static final Factory sfact = new Factory()`
- Role: Implements the sfact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

### Fields

#### `public final Factory f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `private final String[] tag`
- Role: Caches the tag value.
- Description: Caches the `tag` value for reuse.

#### `private final Factory[] sub`
- Role: Caches the sub value.
- Description: Caches the `sub` value for reuse.

#### `private final Factory def`
- Role: Caches the def value.
- Description: Caches the `def` value for reuse.

#### `private final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

### Methods

#### `private ByTile(Resource res, Message buf, Map<Integer, Factory> refs)`
- Role: Handles the by tile path.
- Description: Implements the by tile operation.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private ByRes(Resource res, Message buf, Map<Integer, Factory> refs)`
- Role: Handles the by resource path.
- Description: Implements the by res operation.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this SpriteLink for debugging and logging.

#### `public SpriteLink(Resource res, Message buf)`
- Role: Creates a new SpriteLink instance.
- Description: Constructs the SpriteLink instance from the supplied inputs.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.