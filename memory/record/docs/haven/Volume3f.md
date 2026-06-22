---
source: [Volume3f.java](../../../../src/haven/Volume3f.java)
created: 2026-06-13
updated: 2026-06-14
---

# Volume3f

Represents the volume3f Haven component.

## Members

### Constants

### Fields

#### `public Coord3f n, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `public Coord3f n, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

### Methods

#### `public Volume3f(Coord3f n, Coord3f p)`
- Role: Creates a new Volume3f instance.
- Description: Constructs the Volume3f instance from the supplied inputs.

#### `public static Volume3f corn(Coord3f n, Coord3f p)`
- Role: Handles the corn path.
- Description: Implements the corn operation.

#### `public static Volume3f point(Coord3f c)`
- Role: Handles the point path.
- Description: Implements the point operation.

#### `public static Volume3f sized(Coord3f n, Coord3f sz)`
- Role: Handles the sized path.
- Description: Implements the sized operation.

#### `public static Volume3f sized(Coord3f sz)`
- Role: Handles the sized path.
- Description: Implements the sized operation.

#### `public boolean equals(Volume3f o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public Coord3f sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public boolean positive()`
- Role: Handles the positive path.
- Description: Implements the positive operation.

#### `public boolean contains(Coord3f c)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public boolean isects(Volume3f o)`
- Role: Handles the isects path.
- Description: Returns whether the ects is true.

#### `public boolean contains(Volume3f o)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public Coord3f closest(Coord3f c)`
- Role: Handles the closest path.
- Description: Implements the closest operation.

#### `public float volume()`
- Role: Handles the volume path.
- Description: Implements the volume operation.

#### `public Volume3f xl(Coord3f off)`
- Role: Handles the xl path.
- Description: Implements the xl operation.

#### `public Volume3f margin(Coord3f nm, Coord3f pm)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `public Volume3f margin(Coord3f m)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `public Volume3f margin(float m)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `public Volume3f include(Coord3f c)`
- Role: Handles the include path.
- Description: Implements the include operation.

#### `public Volume3f include(Volume3f v)`
- Role: Handles the include path.
- Description: Implements the include operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Volume3f for debugging and logging.