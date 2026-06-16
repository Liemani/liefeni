# SpriteLink

This file documents the responsibilities and members of `SpriteLink`.

## Meta

- Source: [SpriteLink.java](../../../src/haven/SpriteLink.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the sprite link Haven component.

## Nested Types

### ByRes

- Role: Represents by res within SpriteLink.
- Description: Describes the nested by res type used by the enclosing class.

### ByTile

- Role: Represents by tile within SpriteLink.
- Description: Describes the nested by tile type used by the enclosing class.

## Members

### Constants

#### `public static final Factory sfact = new Factory()`
- Role: Defines the shared sfact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Factory f`
- Role: Holds the f state.
- Description: Backs the cached state for this file.

#### `private final String[] tag`
- Role: Stores the tag value.
- Description: Backs the cached state for this file.

#### `private final Factory[] sub`
- Role: Holds the sub state.
- Description: Backs the cached state for this file.

#### `private final Factory def`
- Role: Holds the def state.
- Description: Backs the cached state for this file.

#### `private final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

### Methods

#### `private ByTile(Resource res, Message buf, Map<Integer, Factory> refs)`
- Role: Performs by tile.
- Description: Supports the by tile operation used by the surrounding class.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private ByRes(Resource res, Message buf, Map<Integer, Factory> refs)`
- Role: Performs by res.
- Description: Supports the by res operation used by the surrounding class.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public SpriteLink(Resource res, Message buf)`
- Role: Creates a new SpriteLink instance.
- Description: Constructs the instance and initializes its default state.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.
