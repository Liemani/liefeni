# SimpleSprite

This file documents the responsibilities and members of `SimpleSprite`.

## Meta

- Source: [SimpleSprite.java](../../../src/haven/SimpleSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the simple sprite Haven component.

## Members

### Constants

### Fields

#### `public final Resource.Image img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final Coord cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

### Methods

#### `public SimpleSprite(Resource.Image img, Coord cc)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public SimpleSprite(Resource res, int id, Coord cc)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public SimpleSprite(Resource res, int id)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public SimpleSprite(Resource res)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public final void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public final void draw(Graphics g, Coord cc)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public final Coord ul()`
- Role: Performs ul.
- Description: Supports the ul operation used by the surrounding class.

#### `public final Coord lr()`
- Role: Performs lr.
- Description: Supports the lr operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.
