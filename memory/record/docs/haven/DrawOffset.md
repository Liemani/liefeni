---
source: [DrawOffset.java](../../../../src/haven/DrawOffset.java)
created: 2026-06-13
updated: 2026-06-14
---

# DrawOffset

Represents the draw offset Haven component.

## Nested Types

### $zoff

- Role: Registers the `zoff` attribute delta.
- Description: Applies a position offset to a gob's draw state.

## Members

### Constants

### Fields

#### `public Coord3f off`
- Role: Caches the off value.
- Description: Caches the `off` value for reuse.

### Methods

#### `public DrawOffset(Gob gob, Coord3f off)`
- Role: Creates a new DrawOffset instance.
- Description: Constructs the DrawOffset instance from the supplied inputs.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.