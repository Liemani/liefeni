# Rect

This file documents the responsibilities and members of `Rect`.

## Meta

- Source: [Rect.java](../../../../src/lmi/core/Rect.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a simple rectangle value object.

## Members

### Constants

### Fields

#### `public Coord origin`
- Role: Stores the origin value.
- Description: Backs the cached state for this file.

#### `public Coord size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

### Methods

#### `public void init(Coord coord1, Coord coord2)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Rect()`
- Role: Creates a new Rect instance.
- Description: Constructs the instance and initializes its default state.

#### `public Rect(Coord coord1, Coord coord2)`
- Role: Creates a new Rect instance.
- Description: Constructs the instance and initializes its default state.

#### `public Rect(Coord[] coordArray)`
- Role: Creates a new Rect instance.
- Description: Constructs the instance and initializes its default state.

#### `public Rect(Rect rect)`
- Role: Creates a new Rect instance.
- Description: Constructs the instance and initializes its default state.

#### `public int width()`
- Role: Performs width.
- Description: Supports the width operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public int minX()`
- Role: Performs min x.
- Description: Supports the min x operation used by the surrounding class.

#### `public int midX()`
- Role: Performs mid x.
- Description: Supports the mid x operation used by the surrounding class.

#### `public int maxX()`
- Role: Performs max x.
- Description: Supports the max x operation used by the surrounding class.

#### `public int minY()`
- Role: Performs min y.
- Description: Supports the min y operation used by the surrounding class.

#### `public int midY()`
- Role: Performs mid y.
- Description: Supports the mid y operation used by the surrounding class.

#### `public int maxY()`
- Role: Performs max y.
- Description: Supports the max y operation used by the surrounding class.

#### `public Rect assignExtendToTile()`
- Role: Performs assign extend to tile.
- Description: Supports the assign extend to tile operation used by the surrounding class.

#### `public boolean contains(Coord coord)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
