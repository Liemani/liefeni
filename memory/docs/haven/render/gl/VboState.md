# VboState

This file documents the responsibilities and members of `VboState`.

## Meta

- Source: [VboState.java](../../../../../src/haven/render/gl/VboState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents VBO state.

## Members

### Constants

### Fields

#### `public final GLBuffer buf`

- Description: TODO

#### `public static int slot = slotidx(VboState.class)`

- Description: TODO

### Methods

#### `public VboState(GLBuffer buf)`

- Description: TODO

#### `public void apply(BGL gl)`

- Description: TODO

#### `public void unapply(BGL gl)`

- Description: TODO

#### `public void applyto(BGL gl, GLState to)`

- Description: TODO

#### `public static void apply(BGL gl, Applier st, GLBuffer buf)`

- Description: TODO

#### `public static void set(Applier st, GLBuffer buf)`

- Description: TODO

#### `public static GLBuffer get(Applier st)`

- Description: TODO

#### `public int slotidx()`

- Description: TODO
