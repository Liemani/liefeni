# Speaking

This file documents the responsibilities and members of `Speaking`.

## Meta

- Source: [Speaking.java](../../../src/haven/Speaking.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the speaking Haven component.

## Nested Types

### $speak

- Role: Represents $speak within Speaking.
- Description: Describes the nested $speak type used by the enclosing class.

## Members

### Constants

#### `public static final IBox.Images sb = new IBox.Scaled("gfx/hud/emote", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`
- Role: Defines the shared sb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex svans = Resource.loadtex("gfx/hud/emote/svans")`
- Role: Defines the shared svans constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int sx = UI.scale(5)`
- Role: Defines the shared sx constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public float zo`
- Role: Stores the zo value.
- Description: Backs the cached state for this file.

#### `public Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

### Methods

#### `public Speaking(Gob gob, float zo, String text)`
- Role: Creates a new Speaking instance.
- Description: Constructs the instance and initializes its default state.

#### `public void update(String text)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void draw(GOut g, Pipe state)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
