---
source: [LinMove.java](../../../../src/haven/LinMove.java)
created: 2026-06-13
updated: 2026-06-14
---

# LinMove

Represents the lin move Haven component.

## Nested Types

### $linbeg

- Role: Registers the linear-move begin delta.
- Description: Cache delta decoder that initializes a linear movement transition.

### $linstep

- Role: Registers the linear-move step delta.
- Description: Cache delta decoder that updates the current linear movement transition.

## Members

### Constants

#### `public static final double MAXOVER = 0.5`
- Role: Caches the maxover value.
- Description: Caches the `MAXOVER` value for reuse.
- Value: `0.5`

### Fields

#### `public Coord2d s, v`
- Role: Caches the v value.
- Description: Caches the `v` value for reuse.

#### `public Coord2d s, v`
- Role: Caches the v value.
- Description: Caches the `v` value for reuse.

#### `public double t, lt, e`
- Role: Caches the e value.
- Description: Caches the `e` value for reuse.

#### `public double t, lt, e`
- Role: Caches the e value.
- Description: Caches the `e` value for reuse.

#### `public double t, lt, e`
- Role: Caches the e value.
- Description: Caches the `e` value for reuse.

#### `public boolean ts = false`
- Role: Tracks the ts flag.
- Description: Caches the `ts` value for reuse.

### Methods

#### `public LinMove(Gob gob, Coord2d s, Coord2d v)`
- Role: Creates a new LinMove instance.
- Description: Constructs the LinMove instance from the supplied inputs.

#### `public Coord3f getc()`
- Role: Handles the getc path.
- Description: Returns the c.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void sett(double t)`
- Role: Handles the sett path.
- Description: Updates the t.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.