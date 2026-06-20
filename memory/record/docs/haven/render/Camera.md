---
source: [Camera.java](../../../../src/haven/render/Camera.java)
created: 2026-06-13
updated: 2026-06-14
---

# Camera

Defines the camera render pipeline component.

## Members

### Constants

#### `public static final Coord3f defdir = new Coord3f(0, 0, -1)`
- Role: Defines the shared defdir constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Matrix4f pbase = makerot(new Matrix4f(), new Coord3f(0.0f, 0.0f, 1.0f), (float)(Math.PI / 2))`
- Role: Defines the shared pbase constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public Camera(Matrix4f xf)`
- Role: Creates a new Camera instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Matrix4f makedir(Matrix4f d, Coord3f base, Coord3f dir)`
- Role: Performs makedir.
- Description: Supports the makedir operation used by the surrounding class.

#### `public static Camera dir(Coord3f base, Coord3f dir)`
- Role: Performs dir.
- Description: Supports the dir operation used by the surrounding class.

#### `public static Matrix4f makepointed(Matrix4f d, Coord3f base, float dist, float e, float a)`
- Role: Performs makepointed.
- Description: Supports the makepointed operation used by the surrounding class.

#### `public static Camera pointed(Coord3f base, float dist, float e, float a)`
- Role: Performs pointed.
- Description: Supports the pointed operation used by the surrounding class.

#### `public static Matrix4f makeplaced(Location.Chain loc)`
- Role: Performs makeplaced.
- Description: Supports the makeplaced operation used by the surrounding class.

#### `public static Camera placed(Location.Chain loc)`
- Role: Performs placed.
- Description: Supports the placed operation used by the surrounding class.
