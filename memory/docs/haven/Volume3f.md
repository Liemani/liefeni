# Volume3f

This file documents the responsibilities and members of `Volume3f`.

## Meta

- Source: [Volume3f.java](../../../src/haven/Volume3f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the volume3f Haven component.

## Members

### Constants

### Fields

#### `public Coord3f n, p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `public Coord3f n, p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

### Methods

#### `public Volume3f(Coord3f n, Coord3f p)`
- Role: Creates a new Volume3f instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Volume3f corn(Coord3f n, Coord3f p)`
- Role: Performs corn.
- Description: Supports the corn operation used by the surrounding class.

#### `public static Volume3f point(Coord3f c)`
- Role: Performs point.
- Description: Supports the point operation used by the surrounding class.

#### `public static Volume3f sized(Coord3f n, Coord3f sz)`
- Role: Performs sized.
- Description: Supports the sized operation used by the surrounding class.

#### `public static Volume3f sized(Coord3f sz)`
- Role: Performs sized.
- Description: Supports the sized operation used by the surrounding class.

#### `public boolean equals(Volume3f o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Coord3f sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public boolean positive()`
- Role: Performs positive.
- Description: Supports the positive operation used by the surrounding class.

#### `public boolean contains(Coord3f c)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public boolean isects(Volume3f o)`
- Role: Performs isects.
- Description: Supports the isects operation used by the surrounding class.

#### `public boolean contains(Volume3f o)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public Coord3f closest(Coord3f c)`
- Role: Performs closest.
- Description: Supports the closest operation used by the surrounding class.

#### `public float volume()`
- Role: Performs volume.
- Description: Supports the volume operation used by the surrounding class.

#### `public Volume3f xl(Coord3f off)`
- Role: Performs xl.
- Description: Supports the xl operation used by the surrounding class.

#### `public Volume3f margin(Coord3f nm, Coord3f pm)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `public Volume3f margin(Coord3f m)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `public Volume3f margin(float m)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `public Volume3f include(Coord3f c)`
- Role: Performs include.
- Description: Supports the include operation used by the surrounding class.

#### `public Volume3f include(Volume3f v)`
- Role: Performs include.
- Description: Supports the include operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
