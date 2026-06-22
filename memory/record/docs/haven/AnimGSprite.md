---
source: [AnimGSprite.java](../../../../src/haven/AnimGSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# AnimGSprite

Represents the anim gsprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

### Fields

#### `public final Resource.Anim anim`
- Role: Caches the anim value.
- Description: Caches the `anim` value for reuse.

#### `public final Resource.Image ref`
- Role: Caches the ref value.
- Description: Caches the `ref` value for reuse.

#### `private int f, ft`
- Role: Caches the ft value.
- Description: Caches the `ft` value for reuse.

#### `private int f, ft`
- Role: Caches the ft value.
- Description: Caches the `ft` value for reuse.

### Methods

#### `public AnimGSprite(Owner owner, Resource.Anim anim)`
- Role: Creates a new AnimGSprite instance.
- Description: Constructs the AnimGSprite instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the AnimGSprite content.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.