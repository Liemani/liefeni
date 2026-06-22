---
source: [StaticGSprite.java](../../../../src/haven/StaticGSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# StaticGSprite

Represents the static gsprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

### Fields

#### `public final Resource.Image img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

### Methods

#### `public StaticGSprite(Owner owner, Resource.Image img)`
- Role: Creates a new StaticGSprite instance.
- Description: Constructs the StaticGSprite instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the StaticGSprite content.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.