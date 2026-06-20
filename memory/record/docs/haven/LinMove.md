---
source: [LinMove.java](../../../src/haven/LinMove.java)
created: 2026-06-13
updated: 2026-06-14
---

# LinMove

Represents the lin move Haven component.

## Nested Types

### $linbeg

- Role: Represents $linbeg within LinMove.
- Description: Describes the nested $linbeg type used by the enclosing class.

### $linstep

- Role: Represents $linstep within LinMove.
- Description: Describes the nested $linstep type used by the enclosing class.

## Members

### Constants

#### `public static final double MAXOVER = 0.5`
- Role: Defines the shared maxover constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Coord2d s, v`
- Role: Stores the v value.
- Description: Backs the cached state for this file.

#### `public Coord2d s, v`
- Role: Stores the v value.
- Description: Backs the cached state for this file.

#### `public double t, lt, e`
- Role: Stores the e value.
- Description: Backs the cached state for this file.

#### `public double t, lt, e`
- Role: Stores the e value.
- Description: Backs the cached state for this file.

#### `public double t, lt, e`
- Role: Stores the e value.
- Description: Backs the cached state for this file.

#### `public boolean ts = false`
- Role: Tracks the ts flag.
- Description: Supports the ts operation used by the surrounding class.

### Methods

#### `public LinMove(Gob gob, Coord2d s, Coord2d v)`
- Role: Creates a new LinMove instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void sett(double t)`
- Role: Performs sett.
- Description: Supports the sett operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
