---
source: [Line2d.java](../../../../src/haven/Line2d.java)
created: 2026-06-13
updated: 2026-06-14
---

# Line2d

Represents the line2d Haven component.

## Nested Types

### GridIsect

- Role: Represents grid isect within Line2d.
- Description: Describes the nested grid isect type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Coord2d m, k`
- Role: Caches the k value.
- Description: Caches the `k` value for reuse.

#### `public final Coord2d m, k`
- Role: Caches the k value.
- Description: Caches the `k` value for reuse.

#### `public final Coord2d s, t, d, g, o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final Coord2d s, t, d, g, o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final Coord2d s, t, d, g, o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final Coord2d s, t, d, g, o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final Coord2d s, t, d, g, o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final boolean incl`
- Role: Tracks the incl flag.
- Description: Caches the `incl` value for reuse.

### Methods

#### `public Line2d(Coord2d m, Coord2d k)`
- Role: Creates a new Line2d instance.
- Description: Constructs the Line2d instance from the supplied inputs.

#### `public static Line2d from(Coord2d m, Coord2d k)`
- Role: Handles the from path.
- Description: Implements the from operation.

#### `public static Line2d twixt(Coord2d a, Coord2d b)`
- Role: Handles the twixt path.
- Description: Implements the twixt operation.

#### `public Coord2d end()`
- Role: Handles the end path.
- Description: Implements the end operation.

#### `public Coord2d at(double t)`
- Role: Handles the at path.
- Description: Implements the at operation.

#### `public Coord2d cross(Line2d that)`
- Role: Handles the cross path.
- Description: Implements the cross operation.

#### `public Line2d clip(Coord2d ul, Coord2d br)`
- Role: Handles the clip path.
- Description: Implements the clip operation.

#### `public Line2d clip(Area area)`
- Role: Handles the clip path.
- Description: Implements the clip operation.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, Coord2d o, boolean incl)`
- Role: Handles the grid isect path.
- Description: Implements the grid isect operation.

#### `public GridIsect(Line2d line, Coord2d g, Coord2d o, boolean incl)`
- Role: Handles the grid isect path.
- Description: Implements the grid isect operation.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g, boolean incl)`
- Role: Handles the grid isect path.
- Description: Implements the grid isect operation.

#### `public GridIsect(Coord2d s, Coord2d t, Coord2d g)`
- Role: Handles the grid isect path.
- Description: Implements the grid isect operation.

#### `public GridIsect(Line2d line, Coord2d g)`
- Role: Handles the grid isect path.
- Description: Implements the grid isect operation.

#### `public Iterator<Coord2d> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public Collection<Coord2d> gridisect(Coord2d g, Coord2d o, boolean incl)`
- Role: Handles the gridisect path.
- Description: Implements the gridisect operation.

#### `public Collection<Coord2d> gridisect(Coord2d g, boolean incl)`
- Role: Handles the gridisect path.
- Description: Implements the gridisect operation.

#### `public Collection<Coord2d> gridisect(Coord2d g)`
- Role: Handles the gridisect path.
- Description: Implements the gridisect operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Line2d for debugging and logging.