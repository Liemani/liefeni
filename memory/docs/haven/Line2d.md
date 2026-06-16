# Line2d

This file documents the responsibilities and members of `Line2d`.

## Meta

- Source: [Line2d.java](../../../src/haven/Line2d.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the line2d Haven component.

## Nested Types

### GridIsect

- Role: Represents grid isect within Line2d.
- Description: Describes the nested grid isect type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Coord2d m, k`
- Role: Stores the k value.
- Description: Backs the cached state for this file.

#### `public final Coord2d m, k`
- Role: Stores the k value.
- Description: Backs the cached state for this file.

#### `public final Coord2d s, t, d, g, o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public final Coord2d s, t, d, g, o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public final Coord2d s, t, d, g, o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public final Coord2d s, t, d, g, o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public final Coord2d s, t, d, g, o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public final boolean incl`
- Role: Tracks the incl flag.
- Description: Supports the incl operation used by the surrounding class.

### Methods

#### `public Line2d(Coord2d m, Coord2d k)`
- Role: Creates a new Line2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Line2d from(Coord2d m, Coord2d k)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.

#### `public static Line2d twixt(Coord2d a, Coord2d b)`
- Role: Performs twixt.
- Description: Supports the twixt operation used by the surrounding class.

#### `public Coord2d end()`
- Role: Performs end.
- Description: Supports the end operation used by the surrounding class.

#### `public Coord2d at(double t)`
- Role: Performs at.
- Description: Supports the at operation used by the surrounding class.

#### `public Coord2d cross(Line2d that)`
- Role: Performs cross.
- Description: Supports the cross operation used by the surrounding class.

#### `public Line2d clip(Coord2d ul, Coord2d br)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public Line2d clip(Area area)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, Coord2d o, boolean incl)`
- Role: Performs grid isect.
- Description: Supports the grid isect operation used by the surrounding class.

#### `public GridIsect(Line2d line, Coord2d g, Coord2d o, boolean incl)`
- Role: Performs grid isect.
- Description: Supports the grid isect operation used by the surrounding class.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, boolean incl)`
- Role: Performs grid isect.
- Description: Supports the grid isect operation used by the surrounding class.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g)`
- Role: Performs grid isect.
- Description: Supports the grid isect operation used by the surrounding class.

#### `public GridIsect(Line2d line, Coord2d g)`
- Role: Performs grid isect.
- Description: Supports the grid isect operation used by the surrounding class.

#### `public Iterator<Coord2d> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public Collection<Coord2d> gridisect(Coord2d g, Coord2d o, boolean incl)`
- Role: Performs gridisect.
- Description: Supports the gridisect operation used by the surrounding class.

#### `public Collection<Coord2d> gridisect(Coord2d g, boolean incl)`
- Role: Performs gridisect.
- Description: Supports the gridisect operation used by the surrounding class.

#### `public Collection<Coord2d> gridisect(Coord2d g)`
- Role: Performs gridisect.
- Description: Supports the gridisect operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
