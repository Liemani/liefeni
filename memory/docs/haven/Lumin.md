# Lumin

This file documents the responsibilities and members of `Lumin`.

## Meta

- Source: [Lumin.java](../../../src/haven/Lumin.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the lumin Haven component.

## Nested Types

### $lumin

- Role: Represents $lumin within Lumin.
- Description: Describes the nested $lumin type used by the enclosing class.

## Members

### Constants

### Fields

#### `Coord off`
- Role: Stores the off value.
- Description: Backs the cached state for this file.

#### `int sz, str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

#### `int sz, str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

### Methods

#### `public Lumin(Gob g, Coord off, int sz, int str)`
- Role: Creates a new Lumin instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
