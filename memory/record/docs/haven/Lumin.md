---
source: [Lumin.java](../../../../src/haven/Lumin.java)
created: 2026-06-13
updated: 2026-06-14
---

# Lumin

Represents the lumin Haven component.

## Nested Types

### $lumin

- Role: Applies luminance updates from the object cache.
- Description: Delta decoder that installs or updates a Lumin attribute on a gob.

## Members

### Constants

### Fields

#### `Coord off`
- Role: Caches the off value.
- Description: Caches the `off` value for reuse.

#### `int sz, str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

#### `int sz, str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

### Methods

#### `public Lumin(Gob g, Coord off, int sz, int str)`
- Role: Creates a new Lumin instance.
- Description: Constructs the Lumin instance from the supplied inputs.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.