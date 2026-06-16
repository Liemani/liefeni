# Area

This file documents the responsibilities and members of `Area`.

## Meta

- Source: [Area.java](../../../src/haven/Area.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the area Haven component.

## Members

### Constants

### Fields

#### `public Coord ul, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

#### `public Coord ul, br`
- Role: Stores the br value.
- Description: Backs the cached state for this file.

### Methods

#### `public Area(Coord ul, Coord br)`
- Role: Creates a new Area instance.
- Description: Constructs the instance and initializes its default state.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static Area corn(Coord ul, Coord br)`
- Role: Performs corn.
- Description: Supports the corn operation used by the surrounding class.

#### `public static Area corni(Coord ul, Coord bri)`
- Role: Performs corni.
- Description: Supports the corni operation used by the surrounding class.

#### `public static Area sized(Coord ul, Coord sz)`
- Role: Performs sized.
- Description: Supports the sized operation used by the surrounding class.

#### `public static Area sized(Coord sz)`
- Role: Performs sized.
- Description: Supports the sized operation used by the surrounding class.

#### `public static Area sizedi(Coord szi)`
- Role: Performs sizedi.
- Description: Supports the sizedi operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public boolean positive()`
- Role: Performs positive.
- Description: Supports the positive operation used by the surrounding class.

#### `public boolean contains(Coord c)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public boolean isects(Area o)`
- Role: Performs isects.
- Description: Supports the isects operation used by the surrounding class.

#### `public boolean contains(Area o)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public Area overlap(Area o)`
- Role: Performs overlap.
- Description: Supports the overlap operation used by the surrounding class.

#### `public Area include(Area o)`
- Role: Performs include.
- Description: Supports the include operation used by the surrounding class.

#### `public Coord closest(Coord p)`
- Role: Performs closest.
- Description: Supports the closest operation used by the surrounding class.

#### `public int area()`
- Role: Performs area.
- Description: Supports the area operation used by the surrounding class.

#### `public Area xl(Coord off)`
- Role: Performs xl.
- Description: Supports the xl operation used by the surrounding class.

#### `public Area margin(Coord m)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `public Area margin(int m)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `public Area mul(Coord d)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Area div(Coord d)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public int ridx(Coord c)`
- Role: Performs ridx.
- Description: Supports the ridx operation used by the surrounding class.

#### `public Iterator<Coord> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public int ri(Coord c)`
- Role: Performs ri.
- Description: Supports the ri operation used by the surrounding class.

#### `public int rsz()`
- Role: Performs rsz.
- Description: Supports the rsz operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
