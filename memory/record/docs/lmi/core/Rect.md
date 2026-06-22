---
source: [Rect.java](../../../../../src/lmi/core/Rect.java)
created: 2026-06-13
updated: 2026-06-14
---

# Rect

Represents a simple rectangle value object.

## Members

### Constants

### Fields

#### `public Coord origin`
- Role: Caches the origin value.
- Description: Caches the `origin` value for reuse.

#### `public Coord size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

### Methods

#### `public void init(Coord coord1, Coord coord2)`
- Role: Handles the init path.
- Description: Initializes the rectangle from two corner coordinates.

#### `public Rect()`
- Role: Creates a new Rect instance.
- Description: Constructs the Rect instance from the supplied inputs.

#### `public Rect(Coord coord1, Coord coord2)`
- Role: Creates a new Rect instance.
- Description: Constructs the Rect instance from the supplied inputs.

#### `public Rect(Coord[] coordArray)`
- Role: Creates a new Rect instance.
- Description: Constructs the Rect instance from the supplied inputs.

#### `public Rect(Rect rect)`
- Role: Creates a new Rect instance.
- Description: Constructs the Rect instance from the supplied inputs.

#### `public int width()`
- Role: Handles the width path.
- Description: Returns the rectangle width in tiles.

#### `public int height()`
- Role: Handles the height path.
- Description: Returns the rectangle height in tiles.

#### `public int minX()`
- Role: Handles the min x path.
- Description: Returns the smaller x edge.

#### `public int midX()`
- Role: Handles the mid x path.
- Description: Returns the horizontal midpoint.

#### `public int maxX()`
- Role: Handles the max x path.
- Description: Returns the larger x edge.

#### `public int minY()`
- Role: Handles the min y path.
- Description: Returns the smaller y edge.

#### `public int midY()`
- Role: Handles the mid y path.
- Description: Returns the vertical midpoint.

#### `public int maxY()`
- Role: Handles the max y path.
- Description: Returns the larger y edge.

#### `public Rect assignExtendToTile()`
- Role: Handles the assign extend to tile path.
- Description: Expands the rectangle to full tile boundaries.

#### `public boolean contains(Coord coord)`
- Role: Handles the contains path.
- Description: Returns true when the coordinate lies inside the rectangle.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Rect for debugging and logging.