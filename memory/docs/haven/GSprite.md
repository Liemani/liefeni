# GSprite

This file documents the responsibilities and members of `GSprite`.

## Meta

- Source: [GSprite.java](../../../src/haven/GSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a game sprite.

## Nested Types

### FactMaker

- Description: TODO

### Factory

- Description: TODO

### ImageSprite

- Description: TODO

### Owner

- Description: TODO

## Members

### Constants

#### `public static final List<Factory> factories`

- Description: TODO

### Fields

#### `public final Owner owner`

- Description: TODO

### Methods

#### `public Random mkrandoom()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public BufferedImage image()`

- Description: TODO

#### `public GSprite(Owner owner)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public GSprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public static GSprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public abstract void draw(GOut g)`

- Description: TODO

#### `public abstract Coord sz()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO
