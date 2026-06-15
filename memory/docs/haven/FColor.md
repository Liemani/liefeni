# FColor

This file documents the responsibilities and members of `FColor`.

## Meta

- Source: [FColor.java](../../../src/haven/FColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a float color value.

## Members

### Constants

#### `public static final FColor BLACK = new FColor(0, 0, 0)`

- Description: TODO

#### `public static final FColor WHITE = new FColor(1, 1, 1)`

- Description: TODO

#### `public static final FColor RED = new FColor(1, 0, 0)`

- Description: TODO

#### `public static final FColor GREEN = new FColor(0, 1, 0)`

- Description: TODO

#### `public static final FColor BLUE = new FColor(0, 0, 1)`

- Description: TODO

#### `public static final FColor YELLOW = new FColor(1, 1, 0)`

- Description: TODO

#### `public static final FColor MAGENTA = new FColor(1, 0, 1)`

- Description: TODO

#### `public static final FColor CYAN = new FColor(0, 1, 1)`

- Description: TODO

#### `public static final FColor BLACK_T = new FColor(0, 0, 0, 0)`

- Description: TODO

#### `public static final FColor WHITE_T = new FColor(1, 1, 1, 0)`

- Description: TODO

### Fields

#### `public final float r, g, b, a`

- Description: TODO

#### `public final float r, g, b, a`

- Description: TODO

#### `public final float r, g, b, a`

- Description: TODO

#### `public final float r, g, b, a`

- Description: TODO

### Methods

#### `public FColor(float r, float g, float b, float a)`

- Description: TODO

#### `public FColor(float r, float g, float b)`

- Description: TODO

#### `public FColor(Color c, float f)`

- Description: TODO

#### `public FColor(Color c)`

- Description: TODO

#### `public float[] to3a()`

- Description: TODO

#### `public float[] to4a()`

- Description: TODO

#### `public FColor mul(FColor that)`

- Description: TODO

#### `public FColor mul(float v)`

- Description: TODO

#### `public FColor blend(FColor that)`

- Description: TODO

#### `public FColor blend(FColor that, float B)`

- Description: TODO

#### `public FColor preblend(FColor that)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public FColor lin2srgb()`

- Description: TODO

#### `public FColor srgb2lin()`

- Description: TODO

#### `public FColor lin2srgbf()`

- Description: TODO

#### `public FColor srgb2linf()`

- Description: TODO
