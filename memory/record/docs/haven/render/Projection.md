---
source: [Projection.java](../../../../src/haven/render/Projection.java)
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
- Role: Creates a new Projection instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public float[] toclip(Coord3f ec)`
- Role: Performs toclip.
- Description: Supports the toclip operation used by the surrounding class.

#### `public Coord3f tonorm(Coord3f ec)`
- Role: Performs tonorm.
- Description: Supports the tonorm operation used by the surrounding class.

#### `public Coord3f toscreen(Coord3f ec, Area area)`
- Role: Performs toscreen.
- Description: Supports the toscreen operation used by the surrounding class.

#### `public static Matrix4f makefrustum(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`
- Role: Performs makefrustum.
- Description: Supports the makefrustum operation used by the surrounding class.

#### `public static Projection frustum(float left, float right, float bottom, float top, float near, float far)`
- Role: Performs frustum.
- Description: Supports the frustum operation used by the surrounding class.

#### `public static Matrix4f makeortho(Matrix4f d, float left, float right, float bottom, float top, float near, float far)`
- Role: Performs makeortho.
- Description: Supports the makeortho operation used by the surrounding class.

#### `public static Projection ortho(float left, float right, float bottom, float top, float near, float far)`
- Role: Performs ortho.
- Description: Supports the ortho operation used by the surrounding class.
