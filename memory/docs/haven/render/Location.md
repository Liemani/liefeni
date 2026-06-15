# Location

This file documents the responsibilities and members of `Location`.

## Meta

- Source: [Location.java](../../../../src/haven/render/Location.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render location.

## Nested Types

### Chain

- Description: TODO

## Members

### Constants

#### `public static final Instancer<Chain> instancer = new Instancer<Chain>()`

- Description: TODO

#### `public static final Location nullrot = new Location(Transform.nullrot)`

- Description: TODO

#### `public static final Location onlyxl = new Location(Matrix4f.id)`

- Description: TODO

### Fields

#### `public final String id`

- Description: TODO

#### `public final Location loc`

- Description: TODO

#### `public final Chain p`

- Description: TODO

#### `private Matrix4f bk`

- Description: TODO

### Methods

#### `public Location(Function<Matrix4f, Matrix4f> xf, String id)`

- Description: TODO

#### `public Location(Matrix4f xf, String id)`

- Description: TODO

#### `public Location(Function<Matrix4f, Matrix4f> xf)`

- Description: TODO

#### `public Location(Matrix4f xf)`

- Description: TODO

#### `private Chain(Location loc, Chain p)`

- Description: TODO

#### `public Matrix4f fin(Matrix4f o)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public Chain back(String id)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public static Chain back(Pipe p, String id)`

- Description: TODO

#### `public static Chain goback(Pipe p, String id)`

- Description: TODO

#### `public static Pipe.Op goback(String id)`

- Description: TODO

#### `public static Location xlate(Coord3f c)`

- Description: TODO

#### `public static Location rot(Coord3f axis, float angle)`

- Description: TODO

#### `public static Location scale(float x, float y, float z)`

- Description: TODO

#### `public static Location scale(Coord3f c)`

- Description: TODO

#### `public static Location scale(float s)`

- Description: TODO
