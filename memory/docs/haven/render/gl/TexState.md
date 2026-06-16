# TexState

This file documents the responsibilities and members of `TexState`.

## Meta

- Source: [TexState.java](../../../../../src/haven/render/gl/TexState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for tex state.

## Members

### Constants

### Fields

#### `public final GLTexture[] bound`
- Role: Stores the bound value.
- Description: Backs the cached state for this file.

#### `public final int active`
- Role: Stores the active value.
- Description: Backs the cached state for this file.

#### `public static int slot = slotidx(TexState.class)`
- Role: Stores the slot value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexState(GLTexture[] bound, int active)`
- Role: Creates a new TexState instance.
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

#### `public static void act(BGL gl, Applier st, int unit)`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public static void bind(BGL gl, Applier st, int unit, GLTexture tex)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public int slotidx()`
- Role: Performs slotidx.
- Description: Supports the slotidx operation used by the surrounding class.
