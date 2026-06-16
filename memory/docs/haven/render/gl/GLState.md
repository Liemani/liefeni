# GLState

This file documents the responsibilities and members of `GLState`.

## Meta

- Source: [GLState.java](../../../../../src/haven/render/gl/GLState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glstate.

## Members

### Constants

#### `public static final Class<? extends GLState>[] slots = (Class<? extends GLState>[])new Class[]`
- Role: Defines the shared slots constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public static int slotidx(Class<? extends GLState> cl)`
- Role: Performs slotidx.
- Description: Supports the slotidx operation used by the surrounding class.

#### `public abstract void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public abstract void unapply(BGL gl)`
- Role: Performs unapply.
- Description: Supports the unapply operation used by the surrounding class.

#### `public abstract int slotidx()`
- Role: Performs slotidx.
- Description: Supports the slotidx operation used by the surrounding class.

#### `public void applyto(BGL gl, GLState to)`
- Role: Performs applyto.
- Description: Supports the applyto operation used by the surrounding class.
