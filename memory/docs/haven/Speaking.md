# Speaking

This file documents the responsibilities and members of `Speaking`.

## Meta

- Source: [Speaking.java](../../../src/haven/Speaking.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents speaking or speech state.

## Nested Types

### $speak

- Description: TODO

## Members

### Constants

#### `public static final IBox.Images sb = new IBox.Scaled("gfx/hud/emote", "tl", "tr", "bl", "br", "el", "er", "et", "eb")`

- Description: TODO

#### `public static final Tex svans = Resource.loadtex("gfx/hud/emote/svans")`

- Description: TODO

#### `public static final int sx = UI.scale(5)`

- Description: TODO

### Fields

#### `public float zo`

- Description: TODO

#### `public Text text`

- Description: TODO

### Methods

#### `public Speaking(Gob gob, float zo, String text)`

- Description: TODO

#### `public void update(String text)`

- Description: TODO

#### `public void draw(GOut g, Coord c)`

- Description: TODO

#### `public void draw(GOut g, Pipe state)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO
