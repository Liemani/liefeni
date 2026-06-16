# ScaledTex

This file documents the responsibilities and members of `ScaledTex`.

## Meta

- Source: [ScaledTex.java](../../../src/haven/ScaledTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the scaled tex Haven component.

## Members

### Constants

### Fields

#### `private final T impl`
- Role: Holds the impl state.
- Description: Backs the cached state for this file.

#### `private final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

### Methods

#### `public ScaledTex(T impl, Coord sz)`
- Role: Creates a new ScaledTex instance.
- Description: Constructs the instance and initializes its default state.

#### `public T impl()`
- Role: Performs impl.
- Description: Supports the impl operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void render(GOut g, Coord dul, Coord dbr, Coord tul, Coord tbr)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void render(GOut g, Coord c)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public void crender(GOut g, Coord c, Coord dsz, Coord cul, Coord cbr)`
- Role: Performs crender.
- Description: Supports the crender operation used by the surrounding class.

#### `public void crender(GOut g, Coord c, Coord ul, Coord br)`
- Role: Performs crender.
- Description: Supports the crender operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
