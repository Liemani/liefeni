# HomoCoord4f

This file documents the responsibilities and members of `HomoCoord4f`.

## Meta

- Source: [HomoCoord4f.java](../../../src/haven/HomoCoord4f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides homogeneous 4D coordinates.

## Members

### Constants

### Fields

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`

- Description: TODO

#### `public float x, y, z, w`

- Description: TODO

#### `public float x, y, z, w`

- Description: TODO

#### `public float x, y, z, w`

- Description: TODO

#### `public float x, y, z, w`

- Description: TODO

### Methods

#### `public HomoCoord4f(float x, float y, float z, float w)`

- Description: TODO

#### `public static HomoCoord4f of(float x, float y, float z, float w)`

- Description: TODO

#### `public static HomoCoord4f of(float x, float y, float z)`

- Description: TODO

#### `public static HomoCoord4f of(Coord3f c)`

- Description: TODO

#### `public boolean equals(HomoCoord4f o)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public static HomoCoord4f fromiclip(Matrix4f iproj, Coord3f cc)`

- Description: TODO

#### `public static HomoCoord4f fromclip(Matrix4f proj, Coord3f cc)`

- Description: TODO

#### `public static HomoCoord4f fromindc(Matrix4f iproj, Coord3f nc)`

- Description: TODO

#### `public static HomoCoord4f fromndc(Matrix4f proj, Coord3f nc)`

- Description: TODO

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b, int planes)`

- Description: TODO

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b)`

- Description: TODO

#### `public boolean clipped(int planes)`

- Description: TODO

#### `public boolean clipped()`

- Description: TODO

#### `public Coord3f pdiv()`

- Description: TODO

#### `public Coord3f toview(Area view)`

- Description: TODO

#### `public String toString()`

- Description: TODO
