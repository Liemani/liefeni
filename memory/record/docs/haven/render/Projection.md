---
source: [Projection.java](../../../../../src/haven/render/Projection.java)
created: 2026-06-13
updated: 2026-06-14
---

# Projection

Defines the projection render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public Projection(Matrix4f xf)`
- Role: Stores one projection transform.
- Description: Wraps the projection matrix used to map eye coordinates into clip space.

#### `public void apply(Pipe p)`
- Role: Applies projection state.
- Description: Writes the projection transform into the current pipe.

#### `public float[] toclip(Coord3f ec)`
- Role: Converts eye coordinates to clip coordinates.
- Description: Multiplies the input by the stored projection matrix.

#### `public Coord3f tonorm(Coord3f ec)`
- Role: Converts eye coordinates to normalized device coordinates.
- Description: Applies the projection transform and returns normalized coordinates.

#### `public Coord3f toscreen(Coord3f ec, Area area)`
- Role: Converts eye coordinates to screen coordinates.
- Description: Projects a point and maps it into the given screen area.

#### `public static Matrix4f makefrustum(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`
- Role: Handles the makefrustum path.
- Description: Implements the makefrustum operation.

#### `public static Projection frustum(float left, float right, float bottom, float top, float near, float far)`
- Role: Handles the frustum path.
- Description: Implements the frustum operation.

#### `public static Matrix4f makeortho(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`
- Role: Handles the makeortho path.
- Description: Implements the makeortho operation.

#### `public static Projection ortho(float left, float right, float bottom, float top, float near, float far)`
- Role: Handles the ortho path.
- Description: Implements the ortho operation.