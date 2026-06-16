# GobHealth

This file documents the responsibilities and members of `GobHealth`.

## Meta

- Source: [GobHealth.java](../../../src/haven/GobHealth.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gob health Haven component.

## Nested Types

### $health

- Role: Represents $health within GobHealth.
- Description: Describes the nested $health type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final float hp`
- Role: Stores the hp value.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op fx`
- Role: Holds the fx state.
- Description: Backs the cached state for this file.

### Methods

#### `public GobHealth(Gob g, float hp)`
- Role: Creates a new GobHealth instance.
- Description: Constructs the instance and initializes its default state.

#### `public Pipe.Op gobstate()`
- Role: Performs gobstate.
- Description: Supports the gobstate operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
