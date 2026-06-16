# GobFinder

This file documents the responsibilities and members of `GobFinder`.

## Meta

- Source: [GobFinder.java](../../../../src/lmi/core/GobFinder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Locates gobs from cached Haven state.

## Members

### Constants

### Fields

### Methods

#### `public static Gob closest()`
- Role: Performs closest.
- Description: Supports the closest operation used by the surrounding class.

#### `public static Gob closestOf(String name)`
- Role: Performs closest of.
- Description: Supports the closest of operation used by the surrounding class.

#### `public static Gob byId(long gobId)`
- Role: Performs by id.
- Description: Supports the by id operation used by the surrounding class.

#### `public static Gob at(Coord position)`
- Role: Performs at.
- Description: Supports the at operation used by the surrounding class.

#### `public static Gob at(int x, int y)`
- Role: Performs at.
- Description: Supports the at operation used by the surrounding class.

#### `public static Array<Gob> all()`
- Role: Performs all.
- Description: Supports the all operation used by the surrounding class.

#### `public static Array<Gob> where(Predicate<Gob> predicate)`
- Role: Performs where.
- Description: Supports the where operation used by the surrounding class.

#### `public static Array<Gob> in(Rect area)`
- Role: Performs in.
- Description: Supports the in operation used by the surrounding class.

#### `public static Array<Gob> inSelectedArea()`
- Role: Performs in selected area.
- Description: Supports the in selected area operation used by the surrounding class.

#### `private static Gob _closestWhere(java.util.function.Predicate<Gob> predicate)`
- Role: Performs  closest where.
- Description: Supports the closest where operation used by the surrounding class.
