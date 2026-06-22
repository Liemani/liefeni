---
source: [SimpleSprite.java](../../../../src/haven/SimpleSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# SimpleSprite

Represents the simple sprite Haven component.

## Members

### Constants

### Fields

#### `public final Resource.Image img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final Coord cc`
- Role: Caches the cc value.
- Description: Caches the `cc` value for reuse.

### Methods

#### `public SimpleSprite(Resource.Image img, Coord cc)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the SimpleSprite instance from the supplied inputs.

#### `public SimpleSprite(Resource res, int id, Coord cc)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the SimpleSprite instance from the supplied inputs.

#### `public SimpleSprite(Resource res, int id)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the SimpleSprite instance from the supplied inputs.

#### `public SimpleSprite(Resource res)`
- Role: Creates a new SimpleSprite instance.
- Description: Constructs the SimpleSprite instance from the supplied inputs.

#### `public final void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Draws the SimpleSprite content.

#### `public final void draw(Graphics g, Coord cc)`
- Role: Draws the current content.
- Description: Draws the SimpleSprite content.

#### `public final Coord ul()`
- Role: Handles the ul path.
- Description: Implements the ul operation.

#### `public final Coord lr()`
- Role: Handles the lr path.
- Description: Implements the lr operation.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.