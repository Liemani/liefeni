---
source: [Homing.java](../../../../src/haven/Homing.java)
created: 2026-06-13
updated: 2026-06-14
---

# Homing

Represents the homing Haven component.

## Nested Types

### $homing

- Role: Applies homing movement updates from the cache stream.
- Description: Delta decoder that installs or updates a Homing attribute on a gob.

## Members

### Constants

### Fields

#### `public long tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public Coord2d tc`
- Role: Caches the tc value.
- Description: Caches the `tc` value for reuse.

#### `public double v, dist`
- Role: Caches the dist value.
- Description: Caches the `dist` value for reuse.

#### `public double v, dist`
- Role: Caches the dist value.
- Description: Caches the `dist` value for reuse.

### Methods

#### `public Homing(Gob gob, long tgt, Coord2d tc, double v)`
- Role: Creates a new Homing instance.
- Description: Constructs the Homing instance from the supplied inputs.

#### `public Coord3f getc()`
- Role: Handles the getc path.
- Description: Returns the c.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public void move(Coord2d c)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.