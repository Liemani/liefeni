# Projection

This file documents the responsibilities and members of `Projection`.

## Meta

- Source: [Projection.java](../../../../src/haven/render/Projection.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a projection state.

## Members

### Constants

### Fields

### Methods

#### `public Projection(Matrix4f xf)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public float[] toclip(Coord3f ec)`

- Description: TODO

#### `public Coord3f tonorm(Coord3f ec)`

- Description: TODO

#### `public Coord3f toscreen(Coord3f ec, Area area)`

- Description: TODO

#### `public static Matrix4f makefrustum(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`

- Description: TODO

#### `public static Projection frustum(float left, float right, float bottom, float top, float near, float far)`

- Description: TODO

#### `public static Matrix4f makeortho(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`

- Description: TODO

#### `public static Projection ortho(float left, float right, float bottom, float top, float near, float far)`

- Description: TODO
