# TexSI

This file documents the responsibilities and members of `TexSI`.

## Meta

- Source: [TexSI.java](../../../src/haven/TexSI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tex si Haven component.

## Members

### Constants

### Fields

#### `public final Tex parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public final Coord ul, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

#### `public final Coord ul, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexSI(Tex parent, Coord ul, Coord br)`
- Role: Creates a new TexSI instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.
