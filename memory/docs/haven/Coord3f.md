# Coord3f

This file documents the responsibilities and members of `Coord3f`.

## Meta

- Source: [Coord3f.java](../../../src/haven/Coord3f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides 3D floating-point coordinates.

## Members

### Constants

### Fields

#### `public float x, y, z`

- Description: TODO

#### `public float x, y, z`

- Description: TODO

#### `public float x, y, z`

- Description: TODO

#### `public static Coord3f o = new Coord3f(0, 0, 0)`

- Description: TODO

#### `public static Coord3f xu = of(1, 0, 0)`

- Description: TODO

#### `public static Coord3f yu = of(0, 1, 0)`

- Description: TODO

#### `public static Coord3f zu = of(0, 0, 1)`

- Description: TODO

### Methods

#### `public Coord3f(float x, float y, float z)`

- Description: TODO

#### `public Coord3f(Coord3f c)`

- Description: TODO

#### `public Coord3f(Coord c)`

- Description: TODO

#### `public static Coord3f of(float x, float y, float z)`

- Description: TODO

#### `public static Coord3f of(Coord3f c)`

- Description: TODO

#### `public static Coord3f of(HomoCoord4f c)`

- Description: TODO

#### `public static Coord3f of(Coord c)`

- Description: TODO

#### `public boolean equals(Coord3f o)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public Coord3f add(float ax, float ay, float az)`

- Description: TODO

#### `public Coord3f add(Coord3f b)`

- Description: TODO

#### `public Coord3f sadd(float e, float a, float r)`

- Description: TODO

#### `public Coord3f neg()`

- Description: TODO

#### `public Coord3f sub(float ax, float ay, float az)`

- Description: TODO

#### `public Coord3f sub(Coord3f b)`

- Description: TODO

#### `public Coord3f mul(float f)`

- Description: TODO

#### `public Coord3f mul(float X, float Y, float Z)`

- Description: TODO

#### `public Coord3f mul(Coord3f b)`

- Description: TODO

#### `public Coord3f div(float f)`

- Description: TODO

#### `public Coord3f div(float X, float Y, float Z)`

- Description: TODO

#### `public Coord3f div(Coord3f b)`

- Description: TODO

#### `public Coord3f inv()`

- Description: TODO

#### `public Coord3f invy()`

- Description: TODO

#### `public float dmul(float X, float Y, float Z)`

- Description: TODO

#### `public float dmul(Coord3f b)`

- Description: TODO

#### `public Coord3f cmul(float X, float Y, float Z)`

- Description: TODO

#### `public Coord3f cmul(Coord3f b)`

- Description: TODO

#### `public Coord3f rot(Coord3f p, float a)`

- Description: TODO

#### `public float abs()`

- Description: TODO

#### `public Coord3f norm()`

- Description: TODO

#### `public float dist(Coord3f o)`

- Description: TODO

#### `public float xyangle(Coord3f o)`

- Description: TODO

#### `public float[] to3a()`

- Description: TODO

#### `public float[] to4a(float w)`

- Description: TODO

#### `public Coord round2()`

- Description: TODO

#### `public String toString()`

- Description: TODO
