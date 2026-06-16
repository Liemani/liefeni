# DrawOffset

This file documents the responsibilities and members of `DrawOffset`.

## Meta

- Source: [DrawOffset.java](../../../src/haven/DrawOffset.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the draw offset Haven component.

## Nested Types

### $zoff

- Role: Represents $zoff within DrawOffset.
- Description: Describes the nested $zoff type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Coord3f off`
- Role: Stores the off value.
- Description: Backs the cached state for this file.

### Methods

#### `public DrawOffset(Gob gob, Coord3f off)`
- Role: Creates a new DrawOffset instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
