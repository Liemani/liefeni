# VboState

This file documents the responsibilities and members of `VboState`.

## Meta

- Source: [VboState.java](../../../../../src/haven/render/gl/VboState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for vbo state.

## Members

### Constants

### Fields

#### `public final GLBuffer buf`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

#### `public static int slot = slotidx(VboState.class)`
- Role: Stores the slot value.
- Description: Backs the cached state for this file.

### Methods

#### `public VboState(GLBuffer buf)`
- Role: Creates a new VboState instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void unapply(BGL gl)`
- Role: Performs unapply.
- Description: Supports the unapply operation used by the surrounding class.

#### `public void applyto(BGL gl, GLState to)`
- Role: Performs applyto.
- Description: Supports the applyto operation used by the surrounding class.

#### `public static void apply(BGL gl, Applier st, GLBuffer buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static void set(Applier st, GLBuffer buf)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public static GLBuffer get(Applier st)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public int slotidx()`
- Role: Performs slotidx.
- Description: Supports the slotidx operation used by the surrounding class.
