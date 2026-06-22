---
source: [GobFinder.java](../../../../../src/lmi/core/GobFinder.java)
created: 2026-06-13
updated: 2026-06-14
---

# GobFinder

Locates gobs from cached Haven state.

## Members

### Constants

### Fields

### Methods

#### `public static Gob closest()`
- Role: Returns the nearest gob to the local player.
- Description: Searches the current map state for the closest candidate.

#### `public static Gob closestOf(String name)`
- Role: Returns the nearest gob with the requested resource name.
- Description: Filters the current map state by resource name before distance comparison.

#### `public static Gob byId(long gobId)`
- Role: Returns the gob with the requested id.
- Description: Looks up the gob directly from the current world state.

#### `public static Gob at(Coord position)`
- Role: Returns the gob at the given map coordinate.
- Description: Matches gobs against the requested tile position.

#### `public static Gob at(int x, int y)`
- Role: Returns the gob at the given tile coordinates.
- Description: Matches gobs against the requested tile position.

#### `public static Array<Gob> all()`
- Role: Returns all known gobs.
- Description: Copies the current world gob list into a new array.

#### `public static Array<Gob> where(Predicate<Gob> predicate)`
- Role: Returns gobs that satisfy the supplied predicate.
- Description: Filters the current world gob list.

#### `public static Array<Gob> in(Rect area)`
- Role: Returns gobs that fall inside the given area.
- Description: Filters by the current gob position against the rectangle.

#### `public static Array<Gob> inSelectedArea()`
- Role: Returns gobs inside the last selected area.
- Description: Uses the area selection stored by the UI pipeline.

#### `private static Gob _closestWhere(java.util.function.Predicate<Gob> predicate)`
- Role: Finds the nearest gob matching the predicate.
- Description: Combines filtering and distance ordering in one pass.