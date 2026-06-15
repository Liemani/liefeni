# Matrix4f

This file documents the responsibilities and members of `Matrix4f`.

## Meta

- Source: [Matrix4f.java](../../../src/haven/Matrix4f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides 4x4 matrix math.

## Members

### Constants

#### `public static final Matrix4f id = identity()`

- Description: TODO

### Fields

#### `public final float[] m`

- Description: TODO

### Methods

#### `public Matrix4f()`

- Description: TODO

#### `public Matrix4f(Matrix4f b)`

- Description: TODO

#### `public Matrix4f(float e00, float e01, float e02, float e03, float e10, float e11, float e12, float e13, float e20, float e21, float e22, float e23, float e30, float e31, float e32, float e33)`

- Description: TODO

#### `public Matrix4f(float[] m)`

- Description: TODO

#### `public static Matrix4f identity()`

- Description: TODO

#### `public Matrix4f load(Matrix4f o)`

- Description: TODO

#### `public float get(int x, int y)`

- Description: TODO

#### `public void set(int x, int y, float v)`

- Description: TODO

#### `public boolean equals(Matrix4f that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public Matrix4f add(Matrix4f b)`

- Description: TODO

#### `public Coord3f mul4(Coord3f b)`

- Description: TODO

#### `public float[] mul4(float[] b)`

- Description: TODO

#### `public HomoCoord4f mul4(HomoCoord4f b)`

- Description: TODO

#### `public Matrix4f mul(Matrix4f o)`

- Description: TODO

#### `public Matrix4f mul1(Matrix4f o)`

- Description: TODO

#### `public Matrix4f transpose()`

- Description: TODO

#### `public float[] trim3()`

- Description: TODO

#### `public Matrix4f trim3(float e33)`

- Description: TODO

#### `public Matrix4f invert()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public String toString2()`

- Description: TODO
