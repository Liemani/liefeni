# AnimGSprite

This file documents the responsibilities and members of `AnimGSprite`.

## Meta

- Source: [AnimGSprite.java](../../../src/haven/AnimGSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the anim gsprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Resource.Anim anim`
- Role: Stores the anim value.
- Description: Backs the cached state for this file.

#### `public final Resource.Image ref`
- Role: Stores the ref value.
- Description: Backs the cached state for this file.

#### `private int f, ft`
- Role: Stores the ft value.
- Description: Backs the cached state for this file.

#### `private int f, ft`
- Role: Stores the ft value.
- Description: Backs the cached state for this file.

### Methods

#### `public AnimGSprite(Owner owner, Resource.Anim anim)`
- Role: Creates a new AnimGSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.
