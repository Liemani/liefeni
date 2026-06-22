---
source: [Camera.java](../../../../../src/haven/render/Camera.java)
created: 2026-06-13
updated: 2026-06-14
---

# Camera

Defines the camera render pipeline component.

## Members

### Constants

#### `public static final Coord3f defdir = new Coord3f(0, 0, -1)`
- Role: Implements the defdir operation.
- Description: Implements the coord3f operation.
- Value: `new Coord3f(0, 0, -1)`

#### `private static final Matrix4f pbase = makerot(new Matrix4f(), new Coord3f(0.0f, 0.0f, 1.0f), (float)(Math.PI / 2))`
- Role: Implements the pbase operation.
- Description: Implements the coord3f operation.
- Value: `makerot(new Matrix4f(), new Coord3f(0.0f, 0.0f, 1.0f), (float)(Math.PI / 2))`

### Fields

### Methods

#### `public Camera(Matrix4f xf)`
- Role: Stores one camera transform.
- Description: Wraps the view transform used to orient the render camera.

#### `public void apply(Pipe p)`
- Role: Applies camera state.
- Description: Writes the camera transform into the current pipe.

#### `public static Matrix4f makedir(Matrix4f d, Coord3f base, Coord3f dir)`
- Role: Builds a camera matrix from a direction.
- Description: Constructs the transform from a base point and forward direction.

#### `public static Camera dir(Coord3f base, Coord3f dir)`
- Role: Creates a directional camera.
- Description: Builds a camera pointing from a base point toward a direction.

#### `public static Matrix4f makepointed(Matrix4f d, Coord3f base, float dist, float e, float a)`
- Role: Builds an orbit-style camera matrix.
- Description: Constructs a camera matrix from distance, elevation, and angle parameters.

#### `public static Camera pointed(Coord3f base, float dist, float e, float a)`
- Role: Creates an orbit-style camera.
- Description: Builds a camera positioned around a focus point.

#### `public static Matrix4f makeplaced(Location.Chain loc)`
- Role: Builds a camera matrix from a location chain.
- Description: Converts a location chain into a view transform.

#### `public static Camera placed(Location.Chain loc)`
- Role: Creates a placed camera.
- Description: Builds a camera from a location chain.