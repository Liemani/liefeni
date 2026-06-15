# TexState

This file documents the responsibilities and members of `TexState`.

## Meta

- Source: [TexState.java](../../../../../src/haven/render/gl/TexState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents texture state.

## Members

### Constants

### Fields

#### `public final GLTexture[] bound`

- Description: TODO

#### `public final int active`

- Description: TODO

#### `public static int slot = slotidx(TexState.class)`

- Description: TODO

### Methods

#### `public TexState(GLTexture[] bound, int active)`

- Description: TODO

#### `public void apply(BGL gl)`

- Description: TODO

#### `public void unapply(BGL gl)`

- Description: TODO

#### `public void applyto(BGL gl, GLState to)`

- Description: TODO

#### `public static void act(BGL gl, Applier st, int unit)`

- Description: TODO

#### `public static void bind(BGL gl, Applier st, int unit, GLTexture tex)`

- Description: TODO

#### `public int slotidx()`

- Description: TODO
