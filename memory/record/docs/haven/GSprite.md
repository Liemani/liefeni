---
source: [GSprite.java](../../../src/haven/GSprite.java)
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
- Role: Defines the shared factories constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Owner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

### Methods

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public GSprite(Owner owner)`
- Role: Creates a new GSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public GSprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static GSprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public abstract void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public abstract Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.
