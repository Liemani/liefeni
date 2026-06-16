# Drawable

This file documents the responsibilities and members of `Drawable`.

## Meta

- Source: [Drawable.java](../../../src/haven/Drawable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the drawable Haven component.

## Members

### Constants

### Fields

#### `protected Gob.Placer placer = null`
- Role: Stores the placer value.
- Description: Backs the cached state for this file.

### Methods

#### `public Drawable(Gob gob)`
- Role: Creates a new Drawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public abstract Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `private MCache.SurfaceID getsurf(String surf)`
- Role: Returns the surface id for the supplied surface name.
- Description: Maps a surface name to the corresponding `MCache.SurfaceID` value.

#### `public Gob.Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
