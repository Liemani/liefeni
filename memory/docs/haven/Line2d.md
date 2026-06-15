# Line2d

This file documents the responsibilities and members of `Line2d`.

## Meta

- Source: [Line2d.java](../../../src/haven/Line2d.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides 2D line helpers.

## Nested Types

### GridIsect

- Description: TODO

## Members

### Constants

### Fields

#### `public final Coord2d m, k`

- Description: TODO

#### `public final Coord2d m, k`

- Description: TODO

#### `public final Coord2d s, t, d, g, o`

- Description: TODO

#### `public final Coord2d s, t, d, g, o`

- Description: TODO

#### `public final Coord2d s, t, d, g, o`

- Description: TODO

#### `public final Coord2d s, t, d, g, o`

- Description: TODO

#### `public final Coord2d s, t, d, g, o`

- Description: TODO

#### `public final boolean incl`

- Description: TODO

### Methods

#### `public Line2d(Coord2d m, Coord2d k)`

- Description: TODO

#### `public static Line2d from(Coord2d m, Coord2d k)`

- Description: TODO

#### `public static Line2d twixt(Coord2d a, Coord2d b)`

- Description: TODO

#### `public Coord2d end()`

- Description: TODO

#### `public Coord2d at(double t)`

- Description: TODO

#### `public Coord2d cross(Line2d that)`

- Description: TODO

#### `public Line2d clip(Coord2d ul, Coord2d br)`

- Description: TODO

#### `public Line2d clip(Area area)`

- Description: TODO

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, Coord2d o, boolean incl)`

- Description: TODO

#### `public GridIsect(Line2d line, Coord2d g, Coord2d o, boolean incl)`

- Description: TODO

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, boolean incl)`

- Description: TODO

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g)`

- Description: TODO

#### `public GridIsect(Line2d line, Coord2d g)`

- Description: TODO

#### `public Iterator<Coord2d> iterator()`

- Description: TODO

#### `public Collection<Coord2d> gridisect(Coord2d g, Coord2d o, boolean incl)`

- Description: TODO

#### `public Collection<Coord2d> gridisect(Coord2d g, boolean incl)`

- Description: TODO

#### `public Collection<Coord2d> gridisect(Coord2d g)`

- Description: TODO

#### `public String toString()`

- Description: TODO
