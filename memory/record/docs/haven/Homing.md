---
source: [Homing.java](../../../src/haven/Homing.java)
created: 2026-06-13
updated: 2026-06-14
---

# Homing

Represents the homing Haven component.

## Nested Types

### $homing

- Role: Represents $homing within Homing.
- Description: Describes the nested $homing type used by the enclosing class.

## Members

### Constants

### Fields

#### `public long tgt`
- Role: Stores the tgt value.
- Description: Backs the cached state for this file.

#### `public Coord2d tc`
- Role: Stores the tc value.
- Description: Backs the cached state for this file.

#### `public double v, dist`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `public double v, dist`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

### Methods

#### `public Homing(Gob gob, long tgt, Coord2d tc, double v)`
- Role: Creates a new Homing instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public void move(Coord2d c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
