# Camera

This file documents the responsibilities and members of `Camera`.

## Meta

- Source: [Camera.java](../../../../src/haven/render/Camera.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render camera.

## Members

### Constants

#### `public static final Coord3f defdir = new Coord3f(0, 0, -1)`

- Description: TODO

#### `private static final Matrix4f pbase = makerot(new Matrix4f(), new Coord3f(0.0f, 0.0f, 1.0f), (float)(Math.PI / 2))`

- Description: TODO

### Fields

### Methods

#### `public Camera(Matrix4f xf)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public static Matrix4f makedir(Matrix4f d, Coord3f base, Coord3f dir)`

- Description: TODO

#### `public static Camera dir(Coord3f base, Coord3f dir)`

- Description: TODO

#### `public static Matrix4f makepointed(Matrix4f d, Coord3f base, float dist, float e, float a)`

- Description: TODO

#### `public static Camera pointed(Coord3f base, float dist, float e, float a)`

- Description: TODO

#### `public static Matrix4f makeplaced(Location.Chain loc)`

- Description: TODO

#### `public static Camera placed(Location.Chain loc)`

- Description: TODO
