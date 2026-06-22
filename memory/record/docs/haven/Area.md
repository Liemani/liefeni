---
source: [Area.java](../../../../src/haven/Area.java)
created: 2026-06-13
updated: 2026-06-14
---

# Area

Represents the area Haven component.

## Members

### Constants

### Fields

#### `public Coord ul, br`
- Role: Caches the br value.
- Description: Caches the `br` value for reuse.

#### `public Coord ul, br`
- Role: Caches the br value.
- Description: Caches the `br` value for reuse.

### Methods

#### `public Area(Coord ul, Coord br)`
- Role: Creates a new Area instance.
- Description: Constructs the Area instance from the supplied inputs.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static Area corn(Coord ul, Coord br)`
- Role: Handles the corn path.
- Description: Implements the corn operation.

#### `public static Area corni(Coord ul, Coord bri)`
- Role: Handles the corni path.
- Description: Implements the corni operation.

#### `public static Area sized(Coord ul, Coord sz)`
- Role: Handles the sized path.
- Description: Implements the sized operation.

#### `public static Area sized(Coord sz)`
- Role: Handles the sized path.
- Description: Implements the sized operation.

#### `public static Area sizedi(Coord szi)`
- Role: Handles the sizedi path.
- Description: Implements the sizedi operation.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public boolean positive()`
- Role: Handles the positive path.
- Description: Implements the positive operation.

#### `public boolean contains(Coord c)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public boolean isects(Area o)`
- Role: Handles the isects path.
- Description: Returns whether the ects is true.

#### `public boolean contains(Area o)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public Area overlap(Area o)`
- Role: Handles the overlap path.
- Description: Implements the overlap operation.

#### `public Area include(Area o)`
- Role: Handles the include path.
- Description: Implements the include operation.

#### `public Coord closest(Coord p)`
- Role: Handles the closest path.
- Description: Implements the closest operation.

#### `public int area()`
- Role: Handles the area path.
- Description: Implements the area operation.

#### `public Area xl(Coord off)`
- Role: Handles the xl path.
- Description: Implements the xl operation.

#### `public Area margin(Coord m)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `public Area margin(int m)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `public Area mul(Coord d)`
- Role: Multiplies this Area by the supplied value.
- Description: Multiplies this Area by the supplied value.

#### `public Area div(Coord d)`
- Role: Divides this Area by the supplied value.
- Description: Divides this Area by the supplied value.

#### `public int ridx(Coord c)`
- Role: Handles the ridx path.
- Description: Implements the ridx operation.

#### `public Iterator<Coord> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public int ri(Coord c)`
- Role: Handles the ri path.
- Description: Implements the ri operation.

#### `public int rsz()`
- Role: Handles the rsz path.
- Description: Implements the rsz operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Area for debugging and logging.