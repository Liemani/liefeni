---
source: [GSprite.java](../../../../src/haven/GSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# GSprite

Represents the gsprite Haven component.

## Nested Types

### FactMaker

- Role: Represents fact maker within GSprite.
- Description: Describes the nested fact maker type used by the enclosing class.

### Factory

- Role: Represents factory within GSprite.
- Description: Describes the nested factory type used by the enclosing class.

### ImageSprite

- Role: Represents image sprite within GSprite.
- Description: Describes the nested image sprite type used by the enclosing class.

### Owner

- Role: Represents owner within GSprite.
- Description: Describes the nested owner type used by the enclosing class.

## Members

### Constants

#### `public static final List<Factory> factories`
#### `public static final List<Factory> factories`
- Role: Caches the factories value.
- Description: Caches the `factories` value for reuse.

### Fields

#### `public final Owner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

### Methods

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public GSprite(Owner owner)`
- Role: Creates a new GSprite instance.
- Description: Constructs the GSprite instance from the supplied inputs.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public GSprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static GSprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public abstract void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GSprite content.

#### `public abstract Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.