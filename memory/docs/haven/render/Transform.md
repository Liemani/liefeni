# Transform

This file documents the responsibilities and members of `Transform`.

## Meta

- Source: [Transform.java](../../../../src/haven/render/Transform.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a transform state.

## Nested Types

### ByMatrix

- Description: TODO

## Members

### Constants

#### `private static final Pair<Matrix4f, Matrix4f> NONE = new Pair<>(null, null)`

- Description: TODO

#### `public static final Function<Matrix4f, Matrix4f> nullrot = new Function<Matrix4f, Matrix4f>()`

- Description: TODO

### Fields

#### `private final Function<Matrix4f, Matrix4f> xf`

- Description: TODO

#### `private Pair<Matrix4f, Matrix4f> last = NONE`

- Description: TODO

#### `public final Matrix4f xf`

- Description: TODO

### Methods

#### `public Transform(Function<Matrix4f, Matrix4f> xf)`

- Description: TODO

#### `public Transform(Matrix4f xf)`

- Description: TODO

#### `public haven.render.sl.ShaderMacro shader()`

- Description: TODO

#### `public Matrix4f fin(Matrix4f p)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public ByMatrix(Matrix4f xf)`

- Description: TODO

#### `public Matrix4f apply(Matrix4f p)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static Matrix4f makexlate(Matrix4f d, Coord3f c)`

- Description: TODO

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float s, float c)`

- Description: TODO

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float angle)`

- Description: TODO

#### `public static Matrix4f makescale(Matrix4f d, float x, float y, float z)`

- Description: TODO

#### `public static Matrix4f makescale(Matrix4f d, float s)`

- Description: TODO

#### `public static Matrix4f rxinvert(Matrix4f m)`

- Description: TODO

#### `public String toString()`

- Description: TODO
