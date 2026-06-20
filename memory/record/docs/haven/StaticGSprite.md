---
source: [StaticGSprite.java](../../../src/haven/StaticGSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# StaticGSprite

Represents the static gsprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Resource.Image img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

### Methods

#### `public StaticGSprite(Owner owner, Resource.Image img)`
- Role: Creates a new StaticGSprite instance.
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
