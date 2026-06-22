---
source: [Speaking.java](../../../../src/haven/Speaking.java)
created: 2026-06-13
updated: 2026-06-14
---

# Speaking

Represents the speaking Haven component.

## Nested Types

### $speak

- Role: Registers the speak effect delta.
- Description: Cache delta decoder that installs or updates the speech bubble effect on a gob.

## Members

### Constants

#### `public static final IBox.Images sb = new IBox.Scaled("gfx/hud/emote", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`
- Role: Implements the sb operation.
- Description: Implements the scaled operation.
- Value: `new IBox.Scaled("gfx/hud/emote", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`

#### `public static final Tex svans = Resource.loadtex("gfx/hud/emote/svans")`
- Role: Implements the svans operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/emote/svans")`

#### `public static final int sx = UI.scale(5)`
- Role: Implements the sx operation.
- Description: Implements the scale operation.
- Value: `UI.scale(5)`

### Fields

#### `public float zo`
- Role: Caches the zo value.
- Description: Caches the `zo` value for reuse.

#### `public Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

### Methods

#### `public Speaking(Gob gob, float zo, String text)`
- Role: Creates a new Speaking instance.
- Description: Constructs the Speaking instance from the supplied inputs.

#### `public void update(String text)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Draws the Speaking content.

#### `public void draw(GOut g, Pipe state)`
- Role: Draws the current content.
- Description: Draws the Speaking content.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.