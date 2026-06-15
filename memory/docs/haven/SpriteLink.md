# SpriteLink

This file documents the responsibilities and members of `SpriteLink`.

## Meta

- Source: [SpriteLink.java](../../../src/haven/SpriteLink.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Links sprite resources or instances.

## Nested Types

### ByRes

- Description: TODO

### ByTile

- Description: TODO

## Members

### Constants

#### `public static final Factory sfact = new Factory()`

- Description: TODO

### Fields

#### `public final Factory f`

- Description: TODO

#### `private final String[] tag`

- Description: TODO

#### `private final Factory[] sub`

- Description: TODO

#### `private final Factory def`

- Description: TODO

#### `private final Indir<Resource> res`

- Description: TODO

### Methods

#### `private ByTile(Resource res, Message buf, Map<Integer, Factory> refs)`

- Description: TODO

#### `public Sprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `private ByRes(Resource res, Message buf, Map<Integer, Factory> refs)`

- Description: TODO

#### `public Sprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public SpriteLink(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO
